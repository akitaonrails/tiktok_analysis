package X;

import com.ss.android.ugc.aweme.account.org.permissions.SentInvitePageViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0iS6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
@C09DV(c = "com.ss.android.ugc.aweme.account.org.permissions.SentInvitePageKt$SentInvitePage$1$1", f = "SentInvitePage.kt", l = {}, m = "invokeSuspend")
public final class C1243040iS6 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ SentInvitePageViewModel LL;
    public final /* synthetic */ boolean LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ String LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1243040iS6(SentInvitePageViewModel sentInvitePageViewModel, boolean z, String str, String str2, InterfaceC1364105Vn<? super C1243040iS6> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = sentInvitePageViewModel;
        this.LLILLJJLI = z;
        this.LLILLL = str;
        this.LLILZ = str2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1243040iS6(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String str;
        C1C7U.LIZ("SentInvitePageKt@ed91.SentInvitePage$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        SentInvitePageViewModel sentInvitePageViewModel = this.LL;
        boolean z = this.LLILLJJLI;
        String str2 = this.LLILLL;
        String str3 = this.LLILZ;
        sentInvitePageViewModel.LL.setValue(C1243070iS9.LIZ);
        sentInvitePageViewModel.vQ2();
        sentInvitePageViewModel.LLJI = z;
        sentInvitePageViewModel.LLJIJIL = str2;
        sentInvitePageViewModel.LLJILJIL = str3;
        C1243440iSk.LIZ.getClass();
        C2344009Gk c2344009Gk = new C2344009Gk();
        if (z) {
            str = "email";
        } else {
            str = "phone";
        }
        c2344009Gk.LJIIIIZZ("invite_type", str);
        C20684815ws.LJIILLIIL("org_permission_invite_sent_show", c2344009Gk.LIZ);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SentInvitePageKt@ed91.SentInvitePage$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
