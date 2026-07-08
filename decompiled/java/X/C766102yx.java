package X;

import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.EmailAuthorizationInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitAssemViewModel;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.02yx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C766102yx extends C035N<C729402t2> implements InterfaceC7728030c {
    public final OrderSubmitAssemViewModel LIZJ;

    @Override // X.InterfaceC7728030c
    public final boolean LJIIIZ() {
        C741702v1 c741702v1LJIIZILJ;
        InterfaceC767902zF interfaceC767902zF = (InterfaceC767902zF) this.LIZJ.vr2(InterfaceC767902zF.class);
        if (interfaceC767902zF == null || (c741702v1LJIIZILJ = interfaceC767902zF.LJIIZILJ()) == null) {
            return false;
        }
        return Intrinsics.LJFF(c741702v1LJIIZILJ.LIZJ, Boolean.TRUE);
    }

    @Override // X.C035N
    public final InterfaceC729102sz LJJZ() {
        return new C729402t2(0);
    }

    public C766102yx(OrderSubmitAssemViewModel orderSubmitAssemViewModel) {
        this.LIZJ = orderSubmitAssemViewModel;
    }

    @Override // X.InterfaceC7728030c
    public final void LJIIIIZZ(EmailAuthorizationInfo emailAuthorizationInfo) {
        this.LIZJ.AT2(emailAuthorizationInfo.isAuthorized, emailAuthorizationInfo.authType, emailAuthorizationInfo.toAuthorizedSellerIds);
    }
}
