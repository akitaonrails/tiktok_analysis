package X;

import com.ss.ttlivestreamer.core.utils.ScopeMonitor;

/* JADX INFO: renamed from: X.0j9U, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1269940j9U implements InterfaceC1272840jEA {
    public static final /* synthetic */ int LLILLJJLI = 0;
    public ScopeMonitor LL;

    @Override // X.InterfaceC1272840jEA
    public final void onRelease() {
        ScopeMonitor scopeMonitor = this.LL;
        if (scopeMonitor != null) {
            scopeMonitor.releaseScopeMonitor();
        }
        this.LL = null;
    }

    public C1269940j9U(boolean z) {
        this.LL = new ScopeMonitor(z);
    }

    public final void LIZ(int i, long j) {
        ScopeMonitor scopeMonitor = this.LL;
        if (scopeMonitor != null) {
            scopeMonitor.CalcElapseOpt(i, j);
        }
    }
}
