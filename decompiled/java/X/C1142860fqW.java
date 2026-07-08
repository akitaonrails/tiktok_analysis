package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.InputStream;

/* JADX INFO: renamed from: X.0fqW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1142860fqW implements InterfaceC1142920fqc {
    public final /* synthetic */ C1139230fkf LIZ;
    public final /* synthetic */ C1142890fqZ LIZIZ;
    public final /* synthetic */ C1142870fqX LIZJ;

    public final void LIZ(int i, Throwable th) {
        if (i == 416) {
            try {
                C0VSJ c0vsjLIZIZ = C1142880fqY.LIZIZ(this.LIZJ.LIZ(this.LIZ));
                if (c0vsjLIZIZ.exists()) {
                    c0vsjLIZIZ.delete();
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        this.LIZJ.LIZIZ.LIZJ(this.LIZ, new C1139270fkj("download failed", th, this.LIZ, i, this.LIZIZ));
    }

    public final void LIZIZ(InputStream inputStream, long j) {
        try {
            String strLIZ = this.LIZJ.LIZ(this.LIZ);
            C0VSJ c0vsjLIZIZ = C1142880fqY.LIZIZ(strLIZ);
            this.LIZJ.LIZIZ(this.LIZ, inputStream, j, c0vsjLIZIZ);
            if (c0vsjLIZIZ.renameTo(new C0VSJ(strLIZ))) {
                this.LIZJ.LIZIZ.LIZ(this.LIZ, strLIZ);
            } else {
                c0vsjLIZIZ.delete();
                throw new Exception("rename file failed");
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            this.LIZJ.LIZIZ.LIZJ(this.LIZ, new C1139340fkq("write storage failed.", e, this.LIZ));
        }
    }

    public C1142860fqW(C1142870fqX c1142870fqX, C1139230fkf c1139230fkf, C1142890fqZ c1142890fqZ) {
        this.LIZJ = c1142870fqX;
        this.LIZ = c1139230fkf;
        this.LIZIZ = c1142890fqZ;
    }
}
