package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.File;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0pem, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1519980pem extends AbstractC1532350pyj<File> {
    @Override // X.AbstractC1532350pyj
    public final void LIZLLL() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC1532350pyj
    public final Integer LIZJ() {
        Object c098200Yq;
        try {
            c098200Yq = Integer.valueOf((int) ((File) this.LIZ).length());
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
        sbLIZ.append("Filepath: ");
        sbLIZ.append(((File) this.LIZ).getAbsolutePath());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1519980pem(File file) {
        super(file, File.class);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC1532350pyj
    public final AbstractC1532350pyj<File> LIZ(C1532710pzJ c1532710pzJ) {
        if (!u.LJJIIJZLJL(((File) this.LIZ).getAbsolutePath(), "/offline/", false) && !((File) this.LIZ).isFile()) {
            return null;
        }
        return this;
    }
}
