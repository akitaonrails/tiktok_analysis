package X;

import Y.ACallableS245S0200000_13;
import Y.ACallableS96S0101000_13;
import android.os.CancellationSignal;
import java.util.List;

/* JADX INFO: renamed from: X.0VIs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C795560VIs implements InterfaceC807830VmX {
    public final AbstractC796540VMm LIZ;
    public final C854570Xfj LIZIZ;
    public final C854550Xfh LIZJ;

    public C795560VIs(AbstractC796540VMm abstractC796540VMm) {
        this.LIZ = abstractC796540VMm;
        this.LIZIZ = new C854570Xfj(abstractC796540VMm, 3);
        new C854550Xfh(abstractC796540VMm, 11);
        this.LIZJ = new C854550Xfh(abstractC796540VMm, 12);
        new C854550Xfh(abstractC796540VMm, 13);
    }

    @Override // X.InterfaceC807830VmX
    public final Object LIZJ(C807800VmU c807800VmU) {
        C0VN5 c0vn5LIZLLL = C0VN5.LIZLLL(0, "SELECT * FROM rule_hit_cache");
        return C824670WWr.LIZIZ(this.LIZ, new CancellationSignal(), new ACallableS245S0200000_13(this, c0vn5LIZLLL, 0), c807800VmU);
    }

    @Override // X.InterfaceC807830VmX
    public final Object LIZLLL(C807810VmV c807810VmV) {
        C0VN5 c0vn5LIZLLL = C0VN5.LIZLLL(0, "SELECT COUNT(*) FROM rule_hit_cache");
        return C824670WWr.LIZIZ(this.LIZ, new CancellationSignal(), new ACallableS245S0200000_13(this, c0vn5LIZLLL, 1), c807810VmV);
    }

    @Override // X.InterfaceC807830VmX
    public final Object LIZ(List list, C808150Vn3 c808150Vn3) {
        return C824670WWr.LIZJ(this.LIZ, new ACallableS245S0200000_13(this, list, 2), c808150Vn3);
    }

    @Override // X.InterfaceC807830VmX
    public final Object LIZIZ(int i, C808150Vn3 c808150Vn3) {
        return C824670WWr.LIZJ(this.LIZ, new ACallableS96S0101000_13(this, i, 0), c808150Vn3);
    }
}
