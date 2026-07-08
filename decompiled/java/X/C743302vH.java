package X;

import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.EmailAuthorizationInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitAssemViewModel;

/* JADX INFO: renamed from: X.02vH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C743302vH extends C035N<C729502t3> implements InterfaceC769802zY {
    public final OrderSubmitAssemViewModel LIZJ;

    @Override // X.C035N
    public final InterfaceC729102sz LJJZ() {
        return new C729502t3(0);
    }

    public C743302vH(OrderSubmitAssemViewModel orderSubmitAssemViewModel) {
        this.LIZJ = orderSubmitAssemViewModel;
    }

    @Override // X.InterfaceC769802zY
    public final void LJIIIIZZ(EmailAuthorizationInfo emailAuthorizationInfo) {
        this.LIZJ.AT2(emailAuthorizationInfo.isAuthorized, emailAuthorizationInfo.authType, emailAuthorizationInfo.toAuthorizedSellerIds);
    }
}
