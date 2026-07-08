package X;

import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.0kAt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1309250kAt implements InterfaceC1309320kB0 {
    public final /* synthetic */ String LIZ;

    public C1309250kAt(String str) {
        this.LIZ = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [X.0kAx] */
    @Override // X.InterfaceC1309320kB0
    public final void LIZ(boolean z, C1309260kAu c1309260kAu, C1166204hI c1166204hI) {
        if (z) {
            if (c1166204hI != null) {
                ((ConcurrentHashMap) C1309240kAs.LIZIZ.getValue()).put(this.LIZ, c1166204hI);
            }
            ((ConcurrentHashMap) C1309240kAs.LIZJ.getValue()).remove(this.LIZ);
            return;
        }
        C01GW c01gw = C1309240kAs.LIZ;
        final String str = this.LIZ;
        C1307940k8m.LIZJ().LIZ(str, new InterfaceC1309320kB0() { // from class: X.0kAx
            @Override // X.InterfaceC1309320kB0
            public final void LIZ(boolean z2, C1309260kAu c1309260kAu2, C1166204hI c1166204hI2) {
                if (z2) {
                    if (c1166204hI2 != null) {
                        ((ConcurrentHashMap) C1309240kAs.LIZIZ.getValue()).put(str, c1166204hI2);
                    }
                    ((ConcurrentHashMap) C1309240kAs.LIZJ.getValue()).remove(str);
                    return;
                }
                if (c1309260kAu2 == null) {
                    return;
                }
                ((ConcurrentHashMap) C1309240kAs.LIZJ.getValue()).put(str, c1309260kAu2);
            }
        });
    }
}
