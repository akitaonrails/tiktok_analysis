package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.IOException;

/* JADX INFO: renamed from: X.0p1m, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public abstract class AbstractC1495800p1m implements InterfaceC842570X3n {
    public final C1496240p2U LL;
    public boolean LLILLJJLI;
    public long LLILLL = 0;
    public final /* synthetic */ C1495660p1Y LLILZ;

    @Override // X.InterfaceC842570X3n
    public final C1496250p2V timeout() {
        return this.LL;
    }

    public AbstractC1495800p1m(C1495660p1Y c1495660p1Y) {
        this.LLILZ = c1495660p1Y;
        this.LL = new C1496240p2U(c1495660p1Y.LIZJ.timeout());
    }

    public final void LIZ(IOException iOException, boolean z) {
        int i = this.LLILZ.LJ;
        if (i == 6) {
            return;
        }
        if (i == 5) {
            C1496240p2U c1496240p2U = this.LL;
            C1496250p2V c1496250p2V = c1496240p2U.LJ;
            c1496240p2U.LJ = C1496250p2V.LIZLLL;
            c1496250p2V.LIZ();
            c1496250p2V.LIZIZ();
            C1495660p1Y c1495660p1Y = this.LLILZ;
            c1495660p1Y.LJ = 6;
            C1495430p1B c1495430p1B = c1495660p1Y.LIZIZ;
            if (c1495430p1B != null) {
                c1495430p1B.LJIIIIZZ(!z, c1495660p1Y, this.LLILLL, iOException);
                return;
            }
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("state: ");
        sbLIZ.append(this.LLILZ.LJ);
        throw new IllegalStateException(C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // X.InterfaceC842570X3n
    public long read(C1496690p3D c1496690p3D, long j) throws IOException {
        try {
            long j2 = this.LLILZ.LIZJ.read(c1496690p3D, j);
            if (j2 > 0) {
                this.LLILLL += j2;
            }
            return j2;
        } catch (IOException e) {
            TryCatchGuardChecker.doCheck(e);
            LIZ(e, false);
            throw e;
        }
    }
}
