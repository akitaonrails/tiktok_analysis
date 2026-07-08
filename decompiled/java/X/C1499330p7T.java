package X;

import com.bytedance.frameworks.baselib.netx.partner.NetworkPartner;
import java.util.Map;

/* JADX INFO: renamed from: X.0p7T, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1499330p7T {
    public final C0X9S<?> LIZ;
    public final C1494570ozn LIZIZ;
    public final C1499350p7V LIZJ = new C1499350p7V();
    public final C01GW LIZLLL = C452501pT.LIZIZ(new C1194204lo());

    public C1499330p7T(C1494590ozp c1494590ozp) {
        this.LIZ = c1494590ozp.LIZLLL;
        this.LIZIZ = c1494590ozp.LIZIZ();
    }

    public final Object LIZ(NetworkPartner networkPartner) {
        return ((Map) this.LIZLLL.getValue()).get(networkPartner);
    }

    public final void LIZIZ(NetworkPartner networkPartner, Object obj) {
        ((Map) this.LIZLLL.getValue()).put(networkPartner, obj);
    }
}
