package X;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Pair;

/* JADX INFO: renamed from: X.097U, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C097U {
    public static final Pair<Integer, Integer> LIZJ(String str) {
        if (str != null && str.length() != 0) {
            try {
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inJustDecodeBounds = true;
                C2471909mP.LJ(str, options);
                int iLIZ = C13W4.LIZ(str);
                if (iLIZ != 90 && iLIZ != 270) {
                    return new Pair<>(Integer.valueOf(options.outWidth), Integer.valueOf(options.outHeight));
                }
                return new Pair<>(Integer.valueOf(options.outHeight), Integer.valueOf(options.outWidth));
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                return new Pair<>(0, 0);
            }
        }
        return new Pair<>(0, 0);
    }

    public static final int LIZ(BitmapFactory.Options options, int i, int i2) {
        Pair pair = new Pair(Integer.valueOf(options.outHeight), Integer.valueOf(options.outWidth));
        int iIntValue = ((Number) pair.getFirst()).intValue();
        int iIntValue2 = ((Number) pair.getSecond()).intValue();
        int i3 = 1;
        if (iIntValue > i2 || iIntValue2 > i) {
            int i4 = iIntValue / 2;
            int i5 = iIntValue2 / 2;
            while (i4 / i3 >= i2 && i5 / i3 >= i) {
                i3 *= 2;
            }
        }
        return i3;
    }

    public static final Bitmap LIZIZ(int i, int i2, String str) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        try {
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeFile(str, options);
            options.inSampleSize = LIZ(options, i, i2);
            options.inJustDecodeBounds = false;
            return BitmapFactory.decodeFile(str, options);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }
}
