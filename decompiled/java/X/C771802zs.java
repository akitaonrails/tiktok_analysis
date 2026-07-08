package X;

import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentInfo;

/* JADX INFO: renamed from: X.02zs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C771802zs extends C035N<C730502tD> implements AnonymousClass0309 {
    public final C032I LIZJ;

    @Override // X.C035N
    public final InterfaceC729102sz LJJZ() {
        return new C730502tD(0);
    }

    @Override // X.AnonymousClass0309
    public final PaymentInfo getPaymentInfo() {
        InterfaceC772402zy interfaceC772402zy = (InterfaceC772402zy) this.LIZJ.vr2(InterfaceC772402zy.class);
        if (interfaceC772402zy != null) {
            return interfaceC772402zy.LJIILIIL();
        }
        return null;
    }

    public C771802zs(C032I c032i) {
        this.LIZJ = c032i;
    }
}
