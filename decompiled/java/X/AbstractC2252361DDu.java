package X;

import X.AbstractC2252411DDz;
import java.util.Arrays;
import kotlin.Unit;

/* JADX INFO: renamed from: X.1DDu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public abstract class AbstractC2252361DDu<S extends AbstractC2252411DDz<?>> {
    public S[] LL;
    public int LLILLJJLI;
    public int LLILLL;
    public C2252371DDv LLILZ;

    public final C2252371DDv LIZLLL() {
        C2252371DDv c2252371DDv;
        synchronized (this) {
            c2252371DDv = this.LLILZ;
            if (c2252371DDv == null) {
                c2252371DDv = new C2252371DDv(this.LLILLJJLI);
                this.LLILZ = c2252371DDv;
            }
        }
        return c2252371DDv;
    }

    public final S LJ() {
        S s;
        C2252371DDv c2252371DDv;
        synchronized (this) {
            S[] sArr = this.LL;
            if (sArr == null) {
                sArr = (S[]) LJI();
                this.LL = sArr;
            } else if (this.LLILLJJLI >= sArr.length) {
                Object[] objArrCopyOf = Arrays.copyOf(sArr, sArr.length * 2);
                this.LL = (S[]) ((AbstractC2252411DDz[]) objArrCopyOf);
                sArr = (S[]) ((AbstractC2252411DDz[]) objArrCopyOf);
            }
            int i = this.LLILLL;
            do {
                s = sArr[i];
                if (s == null) {
                    s = (S) LJFF();
                    sArr[i] = s;
                }
                i++;
                if (i >= sArr.length) {
                    i = 0;
                }
            } while (!s.LIZ(this));
            this.LLILLL = i;
            this.LLILLJJLI++;
            c2252371DDv = this.LLILZ;
        }
        if (c2252371DDv != null) {
            c2252371DDv.LJIJJLI(1);
        }
        return s;
    }

    public abstract S LJFF();

    public abstract AbstractC2252411DDz[] LJI();

    public final void LJII(S s) {
        C2252371DDv c2252371DDv;
        int i;
        InterfaceC1364105Vn[] interfaceC1364105VnArrLIZIZ;
        synchronized (this) {
            int i2 = this.LLILLJJLI - 1;
            this.LLILLJJLI = i2;
            c2252371DDv = this.LLILZ;
            if (i2 == 0) {
                this.LLILLL = 0;
            }
            interfaceC1364105VnArrLIZIZ = s.LIZIZ(this);
        }
        for (InterfaceC1364105Vn interfaceC1364105Vn : interfaceC1364105VnArrLIZIZ) {
            if (interfaceC1364105Vn != null) {
                Unit unit = Unit.LIZ;
                C189200o6.m2constructorimpl(unit);
                interfaceC1364105Vn.resumeWith(unit);
            }
        }
        if (c2252371DDv != null) {
            c2252371DDv.LJIJJLI(-1);
        }
    }
}
