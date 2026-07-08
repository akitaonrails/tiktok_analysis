package X;

import android.os.Bundle;
import android.os.RemoteException;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.android.gms.measurement.internal.zzn;

/* JADX INFO: renamed from: X.12do, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class RunnableC19802212do implements Runnable {
    public final /* synthetic */ zzn LL;
    public final /* synthetic */ Bundle LLILLJJLI;
    public final /* synthetic */ C19804512eB LLILLL;

    public final void LIZ() {
        C19804512eB c19804512eB = this.LLILLL;
        InterfaceC19802012dm interfaceC19802012dm = c19804512eB.LIZLLL;
        if (interfaceC19802012dm == null) {
            c19804512eB.LJIILJJIL().LJFF.LIZJ("Failed to send default event parameters to service");
            return;
        }
        try {
            C0W3J.LJIIIIZZ(this.LL);
            interfaceC19802012dm.mo35LJJJIL(this.LLILLJJLI, this.LL);
        } catch (RemoteException e) {
            TryCatchGuardChecker.doCheck(e);
            this.LLILLL.LJIILJJIL().LJFF.LIZ(e, "Failed to send default event parameters to service");
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zLIZ;
        C1C7U.LIZ("zzlm@3982.run");
        try {
            LIZ();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("zzlm@3982.run");
    }

    public RunnableC19802212do(C19804512eB c19804512eB, zzn zznVar, Bundle bundle) {
        this.LL = zznVar;
        this.LLILLJJLI = bundle;
        this.LLILLL = c19804512eB;
    }
}
