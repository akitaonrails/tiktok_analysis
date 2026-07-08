package X;

import com.ss.android.ugc.aweme.account.login.rememberaccount.LoginMethodListFragment;
import com.ss.android.ugc.aweme.services.UiRefreshEventType;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Xn1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.ss.android.ugc.aweme.account.login.rememberaccount.LoginMethodListFragment$historyLoginOrOpenLoginNotify$1$2$1", f = "LoginMethodListFragment.kt", l = {571}, m = "invokeSuspend")
public final class C859090Xn1 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ LoginMethodListFragment LLILLJJLI;
    public final /* synthetic */ UiRefreshEventType LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C859090Xn1(LoginMethodListFragment loginMethodListFragment, UiRefreshEventType uiRefreshEventType, InterfaceC1364105Vn<? super C859090Xn1> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = loginMethodListFragment;
        this.LLILLL = uiRefreshEventType;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C859090Xn1(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("LoginMethodListFragment@4dbb.historyLoginOrOpenLoginNotify$1$2$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            C1DFH c1dfh = C0PEM.LIZ;
            AbstractC2238408pq abstractC2238408pq = C2107308Nj.LIZ;
            C859100Xn2 c859100Xn2 = new C859100Xn2(this.LLILLJJLI, this.LLILLL, null);
            this.LL = 1;
            if (C23250099c.LJI(this, abstractC2238408pq, c859100Xn2) == objLJFF) {
                C1C7U.LIZIZ("LoginMethodListFragment@4dbb.historyLoginOrOpenLoginNotify$1$2$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("LoginMethodListFragment@4dbb.historyLoginOrOpenLoginNotify$1$2$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
