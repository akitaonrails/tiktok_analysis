package X;

import android.view.animation.DecelerateInterpolator;
import com.bytedance.tux.input.TuxTextView;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.06Yc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.onboarding.fragment.showcase.PcsOnboardingSuggestedQuestionsFragment$startSubtitleAnimation$1", f = "PcsOnboardingSuggestedQuestionsFragment.kt", l = {288}, m = "invokeSuspend")
public final class C1625606Yc extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ TuxTextView LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1625606Yc(TuxTextView tuxTextView, InterfaceC1364105Vn<? super C1625606Yc> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = tuxTextView;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1625606Yc(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PcsOnboardingSuggestedQuestionsFragment@decc.startSubtitleAnimation$1");
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
            if (AnonymousClass0958.LIZIZ(300L, this) == objLJFF) {
                C1C7U.LIZIZ("PcsOnboardingSuggestedQuestionsFragment@decc.startSubtitleAnimation$1");
                return objLJFF;
            }
        }
        this.LLILLJJLI.animate().alpha(1.0f).translationY(0.0f).setDuration(400L).setInterpolator(new DecelerateInterpolator()).withLayer().start();
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("PcsOnboardingSuggestedQuestionsFragment@decc.startSubtitleAnimation$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
