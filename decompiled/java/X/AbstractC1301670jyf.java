package X;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0jyf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public abstract class AbstractC1301670jyf {
    public abstract C1323050kX9<Bitmap> LJFF(int i, int i2, Bitmap.Config config);

    public C1323050kX9<Bitmap> LIZJ(Bitmap bitmap) {
        return LJ(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), null, false);
    }

    public static void LIZ(int i, int i2) {
        boolean z;
        boolean z2 = true;
        if (i > 0) {
            z = true;
        } else {
            z = false;
        }
        C1322350kW1.LIZ("width must be > 0", z);
        if (i2 <= 0) {
            z2 = false;
        }
        C1322350kW1.LIZ("height must be > 0", z2);
    }

    public final C1323050kX9<Bitmap> LIZIZ(int i, int i2, Bitmap.Config config, Object obj) {
        try {
            return LJFF(i, i2, config);
        } catch (OutOfMemoryError e) {
            TryCatchGuardChecker.doCheck(e);
            C1303660k1s c1303660k1s = new C1303660k1s(e);
            c1303660k1s.context = obj;
            throw c1303660k1s;
        }
    }

    public final C1323050kX9 LIZLLL(Bitmap bitmap, int i, int i2, int i3, int i4, Matrix matrix) {
        return LJ(bitmap, i, i2, i3, i4, matrix, true);
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00ea  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C1323050kX9 LJ(android.graphics.Bitmap r14, int r15, int r16, int r17, int r18, android.graphics.Matrix r19, boolean r20) {
        /*
            Method dump skipped, instruction units count: 350
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC1301670jyf.LJ(android.graphics.Bitmap, int, int, int, int, android.graphics.Matrix, boolean):X.0kX9");
    }
}
