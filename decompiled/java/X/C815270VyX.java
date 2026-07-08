package X;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Build;
import androidx.core.graphics.drawable.IconCompat;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: renamed from: X.0VyX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public class C815270VyX {
    public static int LIZ(Object obj) {
        if (Build.VERSION.SDK_INT >= 28) {
            return C815300Vya.LIZ(obj);
        }
        try {
            return ((Integer) obj.getClass().getMethod("getResId", new Class[0]).invoke(obj, new Object[0])).intValue();
        } catch (IllegalAccessException e) {
            TryCatchGuardChecker.doCheck(e);
            return 0;
        } catch (NoSuchMethodException e2) {
            TryCatchGuardChecker.doCheck(e2);
            return 0;
        } catch (InvocationTargetException e3) {
            TryCatchGuardChecker.doCheck(e3);
            return 0;
        }
    }

    public static String LIZIZ(Object obj) {
        if (Build.VERSION.SDK_INT >= 28) {
            return C815300Vya.LIZIZ(obj);
        }
        try {
            return (String) obj.getClass().getMethod("getResPackage", new Class[0]).invoke(obj, new Object[0]);
        } catch (IllegalAccessException e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        } catch (NoSuchMethodException e2) {
            TryCatchGuardChecker.doCheck(e2);
            return null;
        } catch (InvocationTargetException e3) {
            TryCatchGuardChecker.doCheck(e3);
            return null;
        }
    }

    public static int LIZJ(Object obj) {
        if (Build.VERSION.SDK_INT >= 28) {
            return C815300Vya.LIZJ(obj);
        }
        try {
            return ((Integer) obj.getClass().getMethod("getType", new Class[0]).invoke(obj, new Object[0])).intValue();
        } catch (IllegalAccessException e) {
            TryCatchGuardChecker.doCheck(e);
            return -1;
        } catch (NoSuchMethodException e2) {
            TryCatchGuardChecker.doCheck(e2);
            return -1;
        } catch (InvocationTargetException e3) {
            TryCatchGuardChecker.doCheck(e3);
            return -1;
        }
    }

    public static Uri LIZLLL(Object obj) {
        if (Build.VERSION.SDK_INT >= 28) {
            return C815300Vya.LIZLLL(obj);
        }
        try {
            return (Uri) obj.getClass().getMethod("getUri", new Class[0]).invoke(obj, new Object[0]);
        } catch (IllegalAccessException e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        } catch (NoSuchMethodException e2) {
            TryCatchGuardChecker.doCheck(e2);
            return null;
        } catch (InvocationTargetException e3) {
            TryCatchGuardChecker.doCheck(e3);
            return null;
        }
    }

    public static Drawable LJ(Icon icon, Context context) {
        return icon.loadDrawable(context);
    }

    public static Icon LJFF(IconCompat iconCompat, Context context) {
        Icon iconCreateWithBitmap;
        switch (iconCompat.LIZ) {
            case -1:
                return (Icon) iconCompat.LIZIZ;
            case 0:
            default:
                throw new IllegalArgumentException("Unknown type");
            case 1:
                iconCreateWithBitmap = Icon.createWithBitmap((Bitmap) iconCompat.LIZIZ);
                break;
            case 2:
                iconCreateWithBitmap = Icon.createWithResource(iconCompat.LJII(), iconCompat.LJ);
                break;
            case 3:
                iconCreateWithBitmap = Icon.createWithData((byte[]) iconCompat.LIZIZ, iconCompat.LJ, iconCompat.LJFF);
                break;
            case 4:
                iconCreateWithBitmap = Icon.createWithContentUri((String) iconCompat.LIZIZ);
                break;
            case 5:
                if (Build.VERSION.SDK_INT >= 26) {
                    iconCreateWithBitmap = C814110Vwf.LIZIZ((Bitmap) iconCompat.LIZIZ);
                } else {
                    iconCreateWithBitmap = Icon.createWithBitmap(IconCompat.LIZJ((Bitmap) iconCompat.LIZIZ, false));
                }
                break;
            case 6:
                int i = Build.VERSION.SDK_INT;
                if (i >= 30) {
                    iconCreateWithBitmap = C815310Vyb.LIZ(iconCompat.LJIIIIZZ());
                } else if (context != null) {
                    InputStream inputStreamLJIIIZ = iconCompat.LJIIIZ(context);
                    if (inputStreamLJIIIZ != null) {
                        if (i >= 26) {
                            iconCreateWithBitmap = C814110Vwf.LIZIZ(BitmapFactory.decodeStream(inputStreamLJIIIZ));
                        } else {
                            iconCreateWithBitmap = Icon.createWithBitmap(IconCompat.LIZJ(BitmapFactory.decodeStream(inputStreamLJIIIZ), false));
                        }
                    } else {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("Cannot load adaptive icon from uri: ");
                        sbLIZ.append(iconCompat.LJIIIIZZ());
                        throw new IllegalStateException(C2188811AlT.LIZIZ(sbLIZ));
                    }
                } else {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("Context is required to resolve the file uri of the icon: ");
                    sbLIZ2.append(iconCompat.LJIIIIZZ());
                    throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ2));
                }
                break;
        }
        ColorStateList colorStateList = iconCompat.LJI;
        if (colorStateList != null) {
            iconCreateWithBitmap.setTintList(colorStateList);
        }
        PorterDuff.Mode mode = iconCompat.LJII;
        if (mode != IconCompat.LJIIJ) {
            iconCreateWithBitmap.setTintMode(mode);
        }
        return iconCreateWithBitmap;
    }
}
