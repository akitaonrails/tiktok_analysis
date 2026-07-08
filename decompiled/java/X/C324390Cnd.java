package X;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.RepeatOnLifecycleKt;
import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.aisummary.AiSummarySmallImageStylePanelView;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Cnd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.aisummary.AiSummarySmallImageStylePanelView$startObservingViewModel$1", f = "AiSummarySmallImageStylePanelView.kt", l = {295}, m = "invokeSuspend")
public final class C324390Cnd extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ LifecycleOwner LLILLJJLI;
    public final /* synthetic */ AiSummarySmallImageStylePanelView LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C324390Cnd(LifecycleOwner lifecycleOwner, AiSummarySmallImageStylePanelView aiSummarySmallImageStylePanelView, InterfaceC1364105Vn<? super C324390Cnd> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = lifecycleOwner;
        this.LLILLL = aiSummarySmallImageStylePanelView;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C324390Cnd(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AiSummarySmallImageStylePanelView@6894.startObservingViewModel$1");
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
            LifecycleOwner lifecycleOwner = this.LLILLJJLI;
            Lifecycle.State state = Lifecycle.State.STARTED;
            C324400Cne c324400Cne = new C324400Cne(this.LLILLL, null);
            this.LL = 1;
            if (RepeatOnLifecycleKt.repeatOnLifecycle(lifecycleOwner, state, c324400Cne, this) == objLJFF) {
                C1C7U.LIZIZ("AiSummarySmallImageStylePanelView@6894.startObservingViewModel$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("AiSummarySmallImageStylePanelView@6894.startObservingViewModel$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
