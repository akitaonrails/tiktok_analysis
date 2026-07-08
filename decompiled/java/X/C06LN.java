package X;

import Y.AUListenerS253S0100000_2;
import android.animation.ValueAnimator;
import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.06LN, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.subscription.preview.PreviewViewUtils$highlightContent$1", f = "PreviewViewUtils.kt", l = {47}, m = "invokeSuspend")
public final class C06LN extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ int LLILLJJLI;
    public final /* synthetic */ View LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C06LN(int i, View view, InterfaceC1364105Vn<? super C06LN> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = i;
        this.LLILLL = view;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C06LN(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PreviewViewUtils@8306.highlightContent$1");
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
            if (AnonymousClass0958.LIZIZ(3000L, this) == objLJFF) {
                C1C7U.LIZIZ("PreviewViewUtils@8306.highlightContent$1");
                return objLJFF;
            }
        }
        ValueAnimator valueAnimatorOfArgb = ValueAnimator.ofArgb(this.LLILLJJLI, 0);
        View view = this.LLILLL;
        valueAnimatorOfArgb.setDuration(1000L);
        valueAnimatorOfArgb.addUpdateListener(new AUListenerS253S0100000_2(view, 31));
        valueAnimatorOfArgb.start();
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("PreviewViewUtils@8306.highlightContent$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
