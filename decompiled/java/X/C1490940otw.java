package X;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkRequest;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS569S0100000_25;

/* JADX INFO: renamed from: X.0otw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1490940otw implements InterfaceC1633420sbk {
    public final ConnectivityManager LIZ;
    public volatile Function0<Unit> LIZIZ;
    public volatile boolean LIZJ;
    public final C1490950otx LIZLLL = new ConnectivityManager.NetworkCallback() { // from class: X.0otx
        @Override // android.net.ConnectivityManager.NetworkCallback
        public final void onAvailable(Network network) {
            Function0<Unit> function0 = this.LIZ.LIZIZ;
            if (function0 == null) {
                return;
            }
            this.LIZ.LIZIZ = null;
            function0.invoke();
        }
    };

    @Override // X.InterfaceC1633420sbk
    public final void cancel() {
        this.LIZIZ = null;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.0otx] */
    public C1490940otw(ConnectivityManager connectivityManager) {
        this.LIZ = connectivityManager;
    }

    @Override // X.InterfaceC1633420sbk
    public final void LIZ(AwS569S0100000_25 awS569S0100000_25) {
        ConnectivityManager connectivityManager;
        this.LIZIZ = awS569S0100000_25;
        if (!this.LIZJ && (connectivityManager = this.LIZ) != null) {
            try {
                connectivityManager.registerNetworkCallback(new NetworkRequest.Builder().addCapability(12).addTransportType(1).addTransportType(0).addTransportType(3).build(), this.LIZLLL);
                C189200o6.m2constructorimpl(Unit.LIZ);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
            }
            this.LIZJ = true;
        }
    }
}
