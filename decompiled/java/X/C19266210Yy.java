package X;

import com.ss.android.ugc.aweme.monitor.AppStateMonitorImpl;
import com.ss.android.ugc.aweme.net.monitor.IAppStateMonitor;

/* JADX INFO: renamed from: X.10Yy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C19266210Yy implements IAppStateMonitor {
    public static final C19266210Yy LIZIZ = new C19266210Yy();
    public final /* synthetic */ IAppStateMonitor LIZ;

    @Override // com.ss.android.ugc.aweme.net.monitor.IAppStateMonitor
    public final void LIZ() {
        this.LIZ.LIZ();
    }

    @Override // com.ss.android.ugc.aweme.net.monitor.IAppStateMonitor
    public final void LIZIZ() {
        this.LIZ.LIZIZ();
    }

    @Override // com.ss.android.ugc.aweme.net.monitor.IAppStateMonitor
    public final int LIZJ() {
        return this.LIZ.LIZJ();
    }

    @Override // com.ss.android.ugc.aweme.net.monitor.IAppStateMonitor
    public final void LIZLLL() {
        this.LIZ.LIZLLL();
    }

    @Override // com.ss.android.ugc.aweme.net.monitor.IAppStateMonitor
    public final void d8() {
        this.LIZ.d8();
    }

    @Override // com.ss.android.ugc.aweme.net.monitor.IAppStateMonitor
    public final void init() {
        this.LIZ.init();
    }

    public C19266210Yy() {
        IAppStateMonitor iAppStateMonitor;
        Object objLIZ = C04TD.LIZ(IAppStateMonitor.class, false);
        if (objLIZ != null) {
            iAppStateMonitor = (IAppStateMonitor) objLIZ;
        } else {
            if (C04TD.L2 == null) {
                synchronized (IAppStateMonitor.class) {
                    if (C04TD.L2 == null) {
                        C04TD.L2 = new AppStateMonitorImpl();
                    }
                }
            }
            iAppStateMonitor = C04TD.L2;
        }
        this.LIZ = iAppStateMonitor;
    }
}
