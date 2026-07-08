package X;

import com.ss.android.ugc.aweme.account.org.permissions.InvitePageViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0hsN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
@C09DV(c = "com.ss.android.ugc.aweme.account.org.permissions.InvitePageKt$InvitePage$1$1", f = "InvitePage.kt", l = {}, m = "invokeSuspend")
public final class C1220890hsN extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ InvitePageViewModel LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1220890hsN(InvitePageViewModel invitePageViewModel, InterfaceC1364105Vn<? super C1220890hsN> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = invitePageViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1220890hsN(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("InvitePageKt@730.InvitePage$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        InvitePageViewModel invitePageViewModel = this.LL;
        invitePageViewModel.getClass();
        C1243440iSk c1243440iSk = C1243440iSk.LIZ;
        String strWQ2 = invitePageViewModel.wQ2();
        c1243440iSk.getClass();
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("invite_type", strWQ2);
        C20684815ws.LJIILLIIL("org_permission_invite_show", c2344009Gk.LIZ);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("InvitePageKt@730.InvitePage$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
