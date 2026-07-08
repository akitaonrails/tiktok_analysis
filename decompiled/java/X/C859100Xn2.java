package X;

import com.ss.android.ugc.aweme.account.login.rememberaccount.LoginMethodListFragment;
import com.ss.android.ugc.aweme.services.UiRefreshEventType;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Xn2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.ss.android.ugc.aweme.account.login.rememberaccount.LoginMethodListFragment$historyLoginOrOpenLoginNotify$1$2$1$1", f = "LoginMethodListFragment.kt", l = {}, m = "invokeSuspend")
public final class C859100Xn2 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ LoginMethodListFragment LL;
    public final /* synthetic */ UiRefreshEventType LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C859100Xn2(LoginMethodListFragment loginMethodListFragment, UiRefreshEventType uiRefreshEventType, InterfaceC1364105Vn<? super C859100Xn2> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = loginMethodListFragment;
        this.LLILLJJLI = uiRefreshEventType;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C859100Xn2(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("LoginMethodListFragment@4dbb.historyLoginOrOpenLoginNotify$1$2$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.mS(this.LLILLJJLI);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("LoginMethodListFragment@4dbb.historyLoginOrOpenLoginNotify$1$2$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
