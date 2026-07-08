package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.File;
import java.io.InputStream;

/* JADX INFO: renamed from: X.0psQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1528440psQ extends C1534420q24 {
    public final File LJ;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("File InputStream, path: ");
        sbLIZ.append(this.LJ.getAbsolutePath());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1528440psQ(File file) {
        super(new C0VSP(file));
        this.LJ = file;
    }

    @Override // X.C1534420q24, X.AbstractC1534220q1k
    public final AbstractC1534220q1k<InputStream> LIZ(C1533790q13 c1533790q13) {
        Object c098200Yq;
        Object c098200Yq2;
        try {
            c098200Yq = super.LIZ(c1533790q13);
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Object obj = null;
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        AbstractC1534220q1k<InputStream> abstractC1534220q1k = (AbstractC1534220q1k) c098200Yq;
        if (abstractC1534220q1k == null) {
            try {
                c098200Yq2 = new C1528440psQ(this.LJ);
                C189200o6.m2constructorimpl(c098200Yq2);
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                c098200Yq2 = new C098200Yq(th2);
                C189200o6.m2constructorimpl(c098200Yq2);
            }
            if (!C189200o6.m7isFailureimpl(c098200Yq2)) {
                obj = c098200Yq2;
            }
            return (AbstractC1534220q1k) obj;
        }
        return abstractC1534220q1k;
    }
}
