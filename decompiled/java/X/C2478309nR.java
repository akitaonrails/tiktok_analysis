package X;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.bytedance.common.utility.BitmapUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.File;

/* JADX INFO: renamed from: X.09nR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2478309nR {
    public static final /* synthetic */ int LIZ = 0;

    public static String LIZ() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("feedback");
        sbLIZ.append(File.separator);
        sbLIZ.append("upload");
        C0VSJ c0vsjLJIIL = C2354709Kn.LJIIL(C2188811AlT.LIZIZ(sbLIZ));
        return c0vsjLJIIL != null ? c0vsjLJIIL.getPath() : "";
    }

    public static void LIZJ(int i) {
        if (i > 0) {
            C2354709Kn.LJIJJ(LIZ());
        }
    }

    public static String LIZIZ(String str, C0VSJ c0vsj, int i) {
        int iMin = Math.min(i, 720);
        if (iMin > 0) {
            try {
                BitmapFactory.Options options = new BitmapFactory.Options();
                int i2 = 1;
                options.inJustDecodeBounds = true;
                BitmapFactory.decodeFile(str, options);
                int i3 = options.outWidth;
                if (i3 > iMin) {
                    int i4 = options.outHeight;
                    int i5 = (i4 * iMin) / i3;
                    if (i5 != 0 && (i3 > iMin || i4 > i5)) {
                        int i6 = i3 >> 1;
                        int i7 = i4 >> 1;
                        while (i6 / i2 > iMin && i7 / i2 > i5) {
                            i2 <<= 1;
                        }
                    }
                    options.inSampleSize = i2;
                    options.inJustDecodeBounds = false;
                    Bitmap bitmapRotateBitmap = BitmapUtils.rotateBitmap(BitmapFactory.decodeFile(str, options), BitmapUtils.readPictureDegree(str));
                    String strLIZ = LIZ();
                    if (BitmapUtils.saveBitmapToSD(bitmapRotateBitmap, strLIZ, c0vsj.getName())) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append(strLIZ);
                        sbLIZ.append(File.separator);
                        sbLIZ.append(c0vsj.getName());
                        str = C2188811AlT.LIZIZ(sbLIZ);
                    }
                    C786410Ut5.LJJJJ(bitmapRotateBitmap);
                    return str;
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
        return str;
    }
}
