package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.InputStream;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0q1N, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1533990q1N extends AbstractC1534220q1k<C1534010q1P> {
    public final InputStream LJ;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC1534220q1k
    public final Integer LIZIZ() {
        AbstractC1534170q1f abstractC1534170q1f = ((C1534010q1P) this.LIZLLL).LLILZIL;
        return Integer.valueOf(abstractC1534170q1f != null ? abstractC1534170q1f.LJ : 0);
    }

    @Override // X.AbstractC1534220q1k
    public final void LIZJ() {
        try {
            this.LJ.close();
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ForestBuffer, ");
        sbLIZ.append(this.LIZLLL);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC1534220q1k
    public final AbstractC1534220q1k<C1534010q1P> LIZ(C1533790q13 c1533790q13) {
        InputStream inputStreamLJJJJJL = ((C1534010q1P) this.LIZLLL).LJJJJJL(c1533790q13, false);
        if (inputStreamLJJJJJL != null) {
            return new C1533990q1N((C1534010q1P) this.LIZLLL, inputStreamLJJJJJL);
        }
        return null;
    }

    public C1533990q1N(C1534010q1P c1534010q1P, InputStream inputStream) {
        super(c1534010q1P, C1534010q1P.class, null, 12);
        this.LJ = inputStream;
    }
}
