package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

/* JADX INFO: renamed from: X.0krC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public class C1335480krC implements InterfaceC1335640krS {
    public final String LIZ;
    public final File LIZIZ;
    public final /* synthetic */ C1335660krU LIZJ;

    public final C1335740krc LIZ() throws C0MYO {
        C0VSJ c0vsjLJIILL = this.LIZJ.LJIILL(this.LIZ);
        try {
            C1335490krD.LIZIZ(this.LIZIZ, c0vsjLJIILL);
            if (c0vsjLJIILL.exists()) {
                this.LIZJ.LJII.getClass();
                c0vsjLJIILL.setLastModified(System.currentTimeMillis());
            }
            return new C1335740krc(c0vsjLJIILL);
        } catch (C0MYO e) {
            TryCatchGuardChecker.doCheck(e);
            Throwable cause = e.getCause();
            if (cause != null && !(cause instanceof C1335600krO)) {
                boolean z = cause instanceof FileNotFoundException;
            }
            this.LIZJ.LJI.getClass();
            throw e;
        }
    }

    public final void LIZIZ(InterfaceC1327040kda interfaceC1327040kda) throws IOException {
        try {
            C0VSV c0vsv = new C0VSV(this.LIZIZ);
            try {
                C1335560krK c1335560krK = new C1335560krK(c0vsv);
                interfaceC1327040kda.LIZ(c1335560krK);
                c1335560krK.flush();
                final long j = c1335560krK.LL;
                c0vsv.close();
                if (this.LIZIZ.length() == j) {
                    return;
                }
                final long length = this.LIZIZ.length();
                throw new IOException(j, length) { // from class: X.0krG
                    /* JADX WARN: Illegal instructions before constructor call */
                    {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("File was not written completely. Expected: ");
                        sbLIZ.append(j);
                        sbLIZ.append(", found: ");
                        sbLIZ.append(length);
                        super(C2188811AlT.LIZIZ(sbLIZ));
                    }
                };
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c0vsv.close();
                throw th;
            }
        } catch (FileNotFoundException e) {
            TryCatchGuardChecker.doCheck(e);
            this.LIZJ.LJI.getClass();
            throw e;
        }
    }

    public C1335480krC(C1335660krU c1335660krU, String str, File file) {
        this.LIZJ = c1335660krU;
        this.LIZ = str;
        this.LIZIZ = file;
    }
}
