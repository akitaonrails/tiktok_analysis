package X;

import android.os.Bundle;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.android.gms.common.ConnectionResult;

/* JADX INFO: renamed from: X.0WkH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C831910WkH implements InterfaceC832260Wkq, InterfaceC832270Wkr {
    public final C832010WkR<?> LL;
    public final boolean LLILLJJLI;
    public C831840WkA LLILLL;

    public C831910WkH(C832010WkR<?> c832010WkR, boolean z) {
        this.LL = c832010WkR;
        this.LLILLJJLI = z;
    }

    @Override // X.InterfaceC832280Wks
    public final void Js(int i) {
        C0W3J.LJIIIZ(this.LLILLL, "Callbacks must be attached to a ClientConnectionHelper instance before connecting the client.");
        this.LLILLL.Js(i);
    }

    @Override // X.InterfaceC832890Wlr
    public final void LJJJZ(ConnectionResult connectionResult) {
        C0W3J.LJIIIZ(this.LLILLL, "Callbacks must be attached to a ClientConnectionHelper instance before connecting the client.");
        C831840WkA c831840WkA = this.LLILLL;
        C832010WkR<?> c832010WkR = this.LL;
        boolean z = this.LLILLJJLI;
        c831840WkA.LL.lock();
        try {
            c831840WkA.LLJIJIL.LIZ(connectionResult, c832010WkR, z);
            c831840WkA.LL.unlock();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c831840WkA.LL.unlock();
            throw th;
        }
    }

    @Override // X.InterfaceC832280Wks
    public final void zk(Bundle bundle) {
        C0W3J.LJIIIZ(this.LLILLL, "Callbacks must be attached to a ClientConnectionHelper instance before connecting the client.");
        this.LLILLL.zk(bundle);
    }
}
