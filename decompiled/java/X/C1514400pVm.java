package X;

import java.util.Map;

/* JADX INFO: renamed from: X.0pVm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1514400pVm implements InterfaceC882520Yji {
    public final /* synthetic */ long LIZ;
    public final /* synthetic */ C0Z0Y LIZIZ;

    @Override // X.InterfaceC882520Yji
    public final void LIZIZ(Map<String, ? extends Object> map) {
    }

    @Override // X.InterfaceC882520Yji
    public final void LIZ(C892820Z0u c892820Z0u) {
        System.currentTimeMillis();
    }

    @Override // X.InterfaceC882520Yji
    public final void onSuccess(Object obj) {
        System.currentTimeMillis();
        final long jCurrentTimeMillis = System.currentTimeMillis();
        C0Z0Y c0z0y = this.LIZIZ;
        final long j = this.LIZ;
        c0z0y.LIZ(new InterfaceC882520Yji(jCurrentTimeMillis, j) { // from class: X.0pVl
            @Override // X.InterfaceC882520Yji
            public final void LIZIZ(Map<String, ? extends Object> map) {
            }

            @Override // X.InterfaceC882520Yji
            public final void LIZ(C892820Z0u c892820Z0u) {
                System.currentTimeMillis();
            }

            @Override // X.InterfaceC882520Yji
            public final void onSuccess(Object obj2) {
                System.currentTimeMillis();
            }
        });
    }

    public C1514400pVm(long j, String str, String str2, boolean z, C0Z0Y c0z0y) {
        this.LIZ = j;
        this.LIZIZ = c0z0y;
    }
}
