package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.File;

/* JADX INFO: renamed from: X.0psV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public class C1528490psV extends AbstractC1534220q1k<File> {
    @Override // X.AbstractC1534220q1k
    public final void LIZJ() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC1534220q1k
    public Integer LIZIZ() {
        Object c098200Yq;
        try {
            c098200Yq = Integer.valueOf((int) ((File) this.LIZLLL).length());
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        return (Integer) c098200Yq;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("File, path: ");
        sbLIZ.append(((File) this.LIZLLL).getAbsolutePath());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1528490psV(File file) {
        super(file, File.class, null, 12);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC1534220q1k
    public AbstractC1534220q1k<File> LIZ(C1533790q13 c1533790q13) {
        if (((File) this.LIZLLL).isFile()) {
            return this;
        }
        return null;
    }
}
