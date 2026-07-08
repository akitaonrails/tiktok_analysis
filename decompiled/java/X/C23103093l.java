package X;

import Y.AObserverS168S0200000_3;
import androidx.lifecycle.LiveData;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.093l, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.account.oneclicklogin.OneClickLoginService$waitForOclData$1$1$1$1$1", f = "OneClickLoginService.kt", l = {}, m = "invokeSuspend")
public final class C23103093l extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ LiveData<C0XHP> LL;
    public final /* synthetic */ AObserverS168S0200000_3 LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C23103093l(LiveData<C0XHP> liveData, AObserverS168S0200000_3 aObserverS168S0200000_3, InterfaceC1364105Vn<? super C23103093l> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = liveData;
        this.LLILLJJLI = aObserverS168S0200000_3;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C23103093l(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("OneClickLoginService@601d.waitForOclData$1$1$1$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.removeObserver(this.LLILLJJLI);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("OneClickLoginService@601d.waitForOclData$1$1$1$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
