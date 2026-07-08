package X;

import com.bytedance.mt.protector.impl.PatternProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: X.0p8r, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1500190p8r {
    public static final char[] LJIIJJI = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    public static final Pattern LJIIL = PatternProtector.compile("(.*/)?(\\.|%2e|%2E){1,2}(/.*)?");
    public final String LIZ;
    public final C0XLQ LIZIZ;
    public String LIZJ;
    public C0XLP LIZLLL;
    public final C0X33 LJ = new C0X33();
    public final C0X1U LJFF;
    public C0X0P LJI;
    public final boolean LJII;
    public final C0X7B LJIIIIZZ;
    public final C837630WtV LJIIIZ;
    public AbstractC842530X3j LJIIJ;

    public final void LIZ(String str, String str2) {
        if ("Content-Type".equalsIgnoreCase(str)) {
            try {
                this.LJI = C0X0P.LIZIZ(str2);
                return;
            } catch (IllegalArgumentException e) {
                TryCatchGuardChecker.doCheck(e);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Malformed content type: ");
                sbLIZ.append(str2);
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ), e);
            }
        }
        this.LJFF.LIZ(str, str2);
    }

    public final void LIZIZ(String str, String str2, boolean z) {
        String str3 = this.LIZJ;
        if (str3 != null) {
            C0XLP c0xlpLJIIJJI = this.LIZIZ.LJIIJJI(str3, false);
            this.LIZLLL = c0xlpLJIIJJI;
            if (c0xlpLJIIJJI != null) {
                this.LIZJ = null;
            } else {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Malformed URL. Base: ");
                sbLIZ.append(this.LIZIZ);
                sbLIZ.append(", Relative: ");
                sbLIZ.append(this.LIZJ);
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
            }
        }
        if (z) {
            this.LIZLLL.LIZ(str, str2);
        } else {
            this.LIZLLL.LIZJ(str, str2);
        }
    }

    public C1500190p8r(String str, C0XLQ c0xlq, String str2, C0X1V c0x1v, C0X0P c0x0p, boolean z, boolean z2, boolean z3) {
        this.LIZ = str;
        this.LIZIZ = c0xlq;
        this.LIZJ = str2;
        this.LJI = c0x0p;
        this.LJII = z;
        if (c0x1v != null) {
            this.LJFF = c0x1v.LJI();
        } else {
            this.LJFF = new C0X1U();
        }
        if (z2) {
            this.LJIIIZ = new C837630WtV();
        } else {
            if (!z3) {
                return;
            }
            C0X7B c0x7b = new C0X7B();
            this.LJIIIIZZ = c0x7b;
            c0x7b.LJ(C0X7A.LJFF);
        }
    }
}
