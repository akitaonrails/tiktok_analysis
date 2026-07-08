package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.IOException;
import java.math.RoundingMode;

/* JADX INFO: renamed from: X.12le, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public abstract class AbstractC19850812le {
    public static final C19851012lg LIZ;

    public abstract void LIZ(Appendable appendable, byte[] bArr, int i);

    static {
        new C19850912lf("base64()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/", '=');
        new C19850912lf("base64Url()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_", '=');
        new C19850712ld("base32()", "ABCDEFGHIJKLMNOPQRSTUVWXYZ234567", '=');
        new C19850712ld("base32Hex()", "0123456789ABCDEFGHIJKLMNOPQRSTUV", '=');
        LIZ = new C19851012lg(new C19507211Tq("base16()", "0123456789ABCDEF".toCharArray()));
    }

    public final String LIZIZ(byte[] bArr, int i) {
        C19862312nV.LIZIZ(0, i, bArr.length);
        C19507211Tq c19507211Tq = ((C19850712ld) this).LIZIZ;
        StringBuilder sb = new StringBuilder(c19507211Tq.LJ * C11EZ.LIZ(i, c19507211Tq.LJFF, RoundingMode.CEILING));
        try {
            LIZ(sb, bArr, i);
            return sb.toString();
        } catch (IOException e) {
            TryCatchGuardChecker.doCheck(e);
            throw new AssertionError(e);
        }
    }
}
