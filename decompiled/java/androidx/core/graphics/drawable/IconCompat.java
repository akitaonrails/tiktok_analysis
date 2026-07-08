package androidx.core.graphics.drawable;

import X.C2188811AlT;
import X.C786410Ut5;
import X.C815270VyX;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.versionedparcelable.CustomVersionedParcelable;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes14.dex */
public class IconCompat extends CustomVersionedParcelable {
    public static final PorterDuff.Mode LJIIJ = PorterDuff.Mode.SRC_IN;
    public int LIZ;
    public Object LIZIZ;
    public byte[] LIZJ;
    public Parcelable LIZLLL;
    public int LJ;
    public int LJFF;
    public ColorStateList LJI;
    public PorterDuff.Mode LJII;
    public String LJIIIIZZ;
    public String LJIIIZ;

    public final int LJI() {
        int i = this.LIZ;
        if (i == -1) {
            return C815270VyX.LIZ(this.LIZIZ);
        }
        if (i == 2) {
            return this.LJ;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("called getResId() on ");
        sbLIZ.append(this);
        throw new IllegalStateException(C2188811AlT.LIZIZ(sbLIZ));
    }

    public final String LJII() {
        int i = this.LIZ;
        if (i == -1) {
            return C815270VyX.LIZIZ(this.LIZIZ);
        }
        if (i == 2) {
            String str = this.LJIIIZ;
            return (str == null || TextUtils.isEmpty(str)) ? ((String) this.LIZIZ).split(":", -1)[0] : this.LJIIIZ;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("called getResPackage() on ");
        sbLIZ.append(this);
        throw new IllegalStateException(C2188811AlT.LIZIZ(sbLIZ));
    }

    public final Uri LJIIIIZZ() {
        int i = this.LIZ;
        if (i == -1) {
            return C815270VyX.LIZLLL(this.LIZIZ);
        }
        if (i == 4 || i == 6) {
            return UriProtector.parse((String) this.LIZIZ);
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("called getUri() on ");
        sbLIZ.append(this);
        throw new IllegalStateException(C2188811AlT.LIZIZ(sbLIZ));
    }

    public final String toString() {
        String str;
        if (this.LIZ == -1) {
            return String.valueOf(this.LIZIZ);
        }
        StringBuilder sb = new StringBuilder("Icon(typ=");
        switch (this.LIZ) {
            case 1:
                str = "BITMAP";
                break;
            case 2:
                str = "RESOURCE";
                break;
            case 3:
                str = "DATA";
                break;
            case 4:
                str = "URI";
                break;
            case 5:
                str = "BITMAP_MASKABLE";
                break;
            case 6:
                str = "URI_MASKABLE";
                break;
            default:
                str = "UNKNOWN";
                break;
        }
        sb.append(str);
        switch (this.LIZ) {
            case 1:
            case 5:
                sb.append(" size=");
                sb.append(((Bitmap) this.LIZIZ).getWidth());
                sb.append("x");
                sb.append(((Bitmap) this.LIZIZ).getHeight());
                break;
            case 2:
                sb.append(" pkg=");
                sb.append(this.LJIIIZ);
                sb.append(" id=");
                sb.append(C786410Ut5.j4("0x%08x", new Object[]{Integer.valueOf(LJI())}));
                break;
            case 3:
                sb.append(" len=");
                sb.append(this.LJ);
                if (this.LJFF != 0) {
                    sb.append(" off=");
                    sb.append(this.LJFF);
                }
                break;
            case 4:
            case 6:
                sb.append(" uri=");
                sb.append(this.LIZIZ);
                break;
        }
        if (this.LJI != null) {
            sb.append(" tint=");
            sb.append(this.LJI);
        }
        if (this.LJII != LJIIJ) {
            sb.append(" mode=");
            sb.append(this.LJII);
        }
        sb.append(")");
        return sb.toString();
    }

    public IconCompat() {
        this.LIZ = -1;
        this.LJII = LJIIJ;
    }

    public IconCompat(int i) {
        this.LJII = LJIIJ;
        this.LIZ = i;
    }

    public static IconCompat LIZIZ(Icon icon) {
        icon.getClass();
        int iLIZJ = C815270VyX.LIZJ(icon);
        if (iLIZJ != 2) {
            if (iLIZJ != 4) {
                if (iLIZJ != 6) {
                    IconCompat iconCompat = new IconCompat(-1);
                    iconCompat.LIZIZ = icon;
                    return iconCompat;
                }
                Uri uriLIZLLL = C815270VyX.LIZLLL(icon);
                uriLIZLLL.getClass();
                String string = uriLIZLLL.toString();
                string.getClass();
                IconCompat iconCompat2 = new IconCompat(6);
                iconCompat2.LIZIZ = string;
                return iconCompat2;
            }
            Uri uriLIZLLL2 = C815270VyX.LIZLLL(icon);
            uriLIZLLL2.getClass();
            String string2 = uriLIZLLL2.toString();
            string2.getClass();
            IconCompat iconCompat3 = new IconCompat(4);
            iconCompat3.LIZIZ = string2;
            return iconCompat3;
        }
        return LJFF(null, C815270VyX.LIZIZ(icon), C815270VyX.LIZ(icon));
    }

    public static IconCompat LIZLLL(Bitmap bitmap) {
        bitmap.getClass();
        IconCompat iconCompat = new IconCompat(5);
        iconCompat.LIZIZ = bitmap;
        return iconCompat;
    }

    public static IconCompat LJ(Bitmap bitmap) {
        bitmap.getClass();
        IconCompat iconCompat = new IconCompat(1);
        iconCompat.LIZIZ = bitmap;
        return iconCompat;
    }

    public final void LIZ(Context context) {
        Object obj;
        Resources resourcesForApplication;
        if (this.LIZ == 2 && (obj = this.LIZIZ) != null) {
            String str = (String) obj;
            if (!str.contains(":")) {
                return;
            }
            String str2 = str.split(":", -1)[1];
            String str3 = str2.split("/", -1)[0];
            String str4 = str2.split("/", -1)[1];
            String str5 = str.split(":", -1)[0];
            if ("0_resource_name_obfuscated".equals(str4)) {
                return;
            }
            String strLJII = LJII();
            if ("android".equals(strLJII)) {
                resourcesForApplication = Resources.getSystem();
            } else {
                PackageManager packageManager = context.getPackageManager();
                resourcesForApplication = null;
                try {
                    ApplicationInfo applicationInfoV3 = C786410Ut5.V3(packageManager, strLJII, 8192);
                    if (applicationInfoV3 != null) {
                        resourcesForApplication = packageManager.getResourcesForApplication(applicationInfoV3);
                    }
                } catch (PackageManager.NameNotFoundException e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            }
            int iN3 = C786410Ut5.n3(resourcesForApplication, str4, str3, str5);
            if (this.LJ != iN3) {
                this.LJ = iN3;
            }
        }
    }

    public final InputStream LJIIIZ(Context context) {
        Uri uriLJIIIIZZ = LJIIIIZZ();
        String scheme = uriLJIIIIZZ.getScheme();
        if (!"content".equals(scheme) && !"file".equals(scheme)) {
            try {
                return new FileInputStream(new File((String) this.LIZIZ));
            } catch (FileNotFoundException e) {
                TryCatchGuardChecker.doCheck(e);
                return null;
            }
        }
        try {
            return context.getContentResolver().openInputStream(uriLJIIIIZZ);
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            return null;
        }
    }

    public static Bitmap LIZJ(Bitmap bitmap, boolean z) {
        int iMin = (int) (Math.min(bitmap.getWidth(), bitmap.getHeight()) * 0.6666667f);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iMin, iMin, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Paint paint = new Paint(3);
        float f = iMin;
        float f2 = 0.5f * f;
        float f3 = 0.9166667f * f2;
        if (z) {
            float f4 = 0.010416667f * f;
            paint.setColor(0);
            paint.setShadowLayer(f4, 0.0f, f * 0.020833334f, 1023410176);
            canvas.drawCircle(f2, f2, f3, paint);
            paint.setShadowLayer(f4, 0.0f, 0.0f, 503316480);
            canvas.drawCircle(f2, f2, f3, paint);
            paint.clearShadowLayer();
        }
        paint.setColor(-16777216);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        Matrix matrix = new Matrix();
        matrix.setTranslate((-(bitmap.getWidth() - iMin)) / 2.0f, (-(bitmap.getHeight() - iMin)) / 2.0f);
        bitmapShader.setLocalMatrix(matrix);
        paint.setShader(bitmapShader);
        canvas.drawCircle(f2, f2, f3, paint);
        canvas.setBitmap(null);
        return bitmapCreateBitmap;
    }

    public static IconCompat LJFF(Resources resources, String str, int i) {
        str.getClass();
        if (i != 0) {
            IconCompat iconCompat = new IconCompat(2);
            iconCompat.LJ = i;
            if (resources != null) {
                try {
                    iconCompat.LIZIZ = resources.getResourceName(i);
                } catch (Resources.NotFoundException e) {
                    TryCatchGuardChecker.doCheck(e);
                    throw new IllegalArgumentException("Icon resource cannot be found");
                }
            } else {
                iconCompat.LIZIZ = str;
            }
            iconCompat.LJIIIZ = str;
            return iconCompat;
        }
        throw new IllegalArgumentException("Drawable resource ID must not be 0");
    }
}
