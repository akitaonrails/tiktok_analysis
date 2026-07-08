package X;

import android.animation.AnimatorSet;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0EK0, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
@C09DV(c = "com.bytedance.android.livesdk.gift.base.platform.business.panel.portrait.leaf.GiftPanelBottomLeaf$buildStrategyTaskAnimation$animator1$1$1$onAnimationStart$1", f = "GiftPanelBottomLeaf.kt", l = {581}, m = "invokeSuspend")
public final class C0EK0 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ AnimatorSet LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0EK0(AnimatorSet animatorSet, InterfaceC1364105Vn<? super C0EK0> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = animatorSet;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0EK0(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("GiftPanelBottomLeaf@1211.buildStrategyTaskAnimation$animator1$1$1$onAnimationStart$1");
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
            this.LL = 1;
            if (AnonymousClass0958.LIZIZ(600L, this) == objLJFF) {
                C1C7U.LIZIZ("GiftPanelBottomLeaf@1211.buildStrategyTaskAnimation$animator1$1$1$onAnimationStart$1");
                return objLJFF;
            }
        }
        this.LLILLJJLI.start();
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("GiftPanelBottomLeaf@1211.buildStrategyTaskAnimation$animator1$1$1$onAnimationStart$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
