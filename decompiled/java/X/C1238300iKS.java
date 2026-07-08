package X;

import com.ss.android.ugc.aweme.account.org.permissions.InvitePageViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0iKS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
@C09DV(c = "com.ss.android.ugc.aweme.account.org.permissions.InvitePageKt$InvitePage$2$1", f = "InvitePage.kt", l = {}, m = "invokeSuspend")
public final class C1238300iKS extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C05P1<AbstractC1238320iKU> LL;
    public final /* synthetic */ InterfaceC1631620sYq<Boolean, String, String, Unit> LLILLJJLI;
    public final /* synthetic */ InvitePageViewModel LLILLL;
    public final /* synthetic */ Function0<Unit> LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1238300iKS(C05P1<? extends AbstractC1238320iKU> c05p1, InterfaceC1631620sYq<? super Boolean, ? super String, ? super String, Unit> interfaceC1631620sYq, InvitePageViewModel invitePageViewModel, Function0<Unit> function0, InterfaceC1364105Vn<? super C1238300iKS> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c05p1;
        this.LLILLJJLI = interfaceC1631620sYq;
        this.LLILLL = invitePageViewModel;
        this.LLILZ = function0;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1238300iKS(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("InvitePageKt@730.InvitePage$2$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        AbstractC1238320iKU value = this.LL.getValue();
        InterfaceC1631620sYq<Boolean, String, String, Unit> interfaceC1631620sYq = this.LLILLJJLI;
        InvitePageViewModel invitePageViewModel = this.LLILLL;
        Function0<Unit> function0 = this.LLILZ;
        if (value instanceof C1238310iKT) {
            C1238310iKT c1238310iKT = (C1238310iKT) value;
            interfaceC1631620sYq.invoke(Boolean.valueOf(c1238310iKT.LIZ), c1238310iKT.LIZIZ, c1238310iKT.LIZJ);
            invitePageViewModel.LLJ = null;
            invitePageViewModel.LLJI = null;
            invitePageViewModel.LLILLL.setValue(C1238390iKb.LIZ);
            invitePageViewModel.LL.setValue(new C1238330iKV(false));
        } else if (value instanceof C1238340iKW) {
            function0.invoke();
            invitePageViewModel.LLJ = null;
            invitePageViewModel.LLJI = null;
            invitePageViewModel.LLILLL.setValue(C1238390iKb.LIZ);
            invitePageViewModel.LL.setValue(new C1238330iKV(false));
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("InvitePageKt@730.InvitePage$2$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
