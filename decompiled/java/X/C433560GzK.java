package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0GzK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.aweme.feed.adapter.views.LiveBottomTipsView$startCtaAnimation$1$onAnimationEnd$1", f = "LiveBottomTipsView.kt", l = {832}, m = "invokeSuspend")
public final class C433560GzK extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C21629019km LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C433560GzK(C21629019km c21629019km, InterfaceC1364105Vn<? super C433560GzK> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c21629019km;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C433560GzK(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("LiveBottomTipsView@d46f.startCtaAnimation$1$onAnimationEnd$1");
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
                C1C7U.LIZIZ("LiveBottomTipsView@d46f.startCtaAnimation$1$onAnimationEnd$1");
                return objLJFF;
            }
        }
        this.LLILLJJLI.getFadeInFullAnimator().start();
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("LiveBottomTipsView@d46f.startCtaAnimation$1$onAnimationEnd$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
