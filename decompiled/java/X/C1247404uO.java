package X;

import com.bytedance.pumbaa.base2.interfaces.IStore;
import com.bytedance.pumbaa.base2.performance.sla.recovery.TimeoutState;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;

/* JADX INFO: renamed from: X.04uO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1247404uO {
    public final Gson LIZ = new Gson();
    public volatile TimeoutState LIZIZ;
    public volatile long LIZJ;

    public final TimeoutState LIZ() {
        String string;
        Object c098200Yq;
        TimeoutState timeoutState = this.LIZIZ;
        if (timeoutState != null) {
            return timeoutState;
        }
        C1247304uN.LIZ();
        if (C1247304uN.LIZIZ == null) {
            TimeoutState timeoutState2 = new TimeoutState(null, null, null);
            this.LIZIZ = timeoutState2;
            return timeoutState2;
        }
        C1247304uN.LIZ();
        IStore iStore = C1247304uN.LIZIZ;
        if (iStore == null || (string = iStore.getString()) == null) {
            TimeoutState timeoutState3 = new TimeoutState(null, null, null);
            this.LIZIZ = timeoutState3;
            return timeoutState3;
        }
        try {
            c098200Yq = (TimeoutState) this.LIZ.LJII(string, TimeoutState.class);
            if (c098200Yq == null) {
                c098200Yq = new TimeoutState(null, null, null);
            }
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m5exceptionOrNullimpl(c098200Yq) != null) {
            c098200Yq = new TimeoutState(null, null, null);
        }
        TimeoutState timeoutState4 = (TimeoutState) c098200Yq;
        this.LIZIZ = timeoutState4;
        return timeoutState4;
    }

    public C1247404uO(int i) {
    }
}
