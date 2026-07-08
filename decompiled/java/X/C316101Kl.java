package X;

import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.Observer;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01Kl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.search.general.clickrecommend.network.EcClickRecommendDataExecutorKt$observeOnMainThread$3", f = "EcClickRecommendDataExecutor.kt", l = {}, m = "invokeSuspend")
public final class C316101Kl extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ LiveData<Object> LL;
    public final /* synthetic */ LifecycleOwner LLILLJJLI;
    public final /* synthetic */ Observer<Object> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C316101Kl(LiveData<Object> liveData, LifecycleOwner lifecycleOwner, Observer<Object> observer, InterfaceC1364105Vn<? super C316101Kl> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = liveData;
        this.LLILLJJLI = lifecycleOwner;
        this.LLILLL = observer;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C316101Kl(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("EcClickRecommendDataExecutorKt@c095.observeOnMainThread$3");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.observe(this.LLILLJJLI, this.LLILLL);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("EcClickRecommendDataExecutorKt@c095.observeOnMainThread$3");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
