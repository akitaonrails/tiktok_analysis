package X;

import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.ss.android.ugc.nearby.component.NearbyFeedNonPersonalizedComponent;
import com.ss.android.ugc.nearby.container.vm.NearbyContainerViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0hRE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
@C09DV(c = "com.ss.android.ugc.nearby.component.NearbyFeedNonPersonalizedComponent$requestForPersonalizedStatusChanged$1", f = "NearbyFeedNonPersonalizedComponent.kt", l = {}, m = "invokeSuspend")
public final class C1204060hRE extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ NearbyFeedNonPersonalizedComponent LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1204060hRE(NearbyFeedNonPersonalizedComponent nearbyFeedNonPersonalizedComponent, InterfaceC1364105Vn<? super C1204060hRE> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = nearbyFeedNonPersonalizedComponent;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1204060hRE(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("NearbyFeedNonPersonalizedComponent@9124.requestForPersonalizedStatusChanged$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        AssemVMLazy assemVMLazy = this.LL.LLILLJJLI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = NearbyFeedNonPersonalizedComponent.LLIZ;
        ((NearbyContainerViewModel) assemVMLazy.getValue()).DQ2(new C1203960hR4(EnumC1204030hRB.PERSONALIZED_CHANGED));
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("NearbyFeedNonPersonalizedComponent@9124.requestForPersonalizedStatusChanged$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
