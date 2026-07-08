package X;

import Y.AfS4S1200100_27;
import java.util.Map;

/* JADX INFO: renamed from: X.0yIK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1852020yIK<T> implements InterfaceC1478005qU {
    public final /* synthetic */ C11NZ<T> LIZ;
    public final /* synthetic */ String LIZIZ;
    public final /* synthetic */ Map<String, String> LIZJ;

    public C1852020yIK(C11NZ<T> c11nz, String str, Map<String, String> map) {
        this.LIZ = c11nz;
        this.LIZIZ = str;
        this.LIZJ = map;
    }

    @Override // X.InterfaceC1478005qU
    public final void subscribe(C09AJ<T> c09aj) {
        C1C7U.LIZ("PnSPrivacyPreciseMonitorKt@6d0b.preciseNetworkMonitor$1");
        long jCurrentTimeMillis = System.currentTimeMillis();
        C11NZ<T> c11nz = this.LIZ;
        String str = this.LIZIZ;
        Map<String, String> map = this.LIZJ;
        final C19482611Ke c19482611Ke = (C19482611Ke) c09aj;
        c11nz.LJJZ(new AfS4S1200100_27(jCurrentTimeMillis, c19482611Ke, str, map, 1), new AfS4S1200100_27(jCurrentTimeMillis, c19482611Ke, str, map, 2), new InterfaceC781210Ukh() { // from class: X.0yIL
            @Override // X.InterfaceC781210Ukh
            public final void run() {
                c19482611Ke.onComplete();
            }
        });
        C1C7U.LIZIZ("PnSPrivacyPreciseMonitorKt@6d0b.preciseNetworkMonitor$1");
    }
}
