package X;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.Property;
import android.widget.LinearLayout;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0FMu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.search.general.live.TopLiveProductButtonView$resumeDisplay$1", f = "TopLiveProductButtonView.kt", l = {151, 155}, m = "invokeSuspend")
public final class C388940FMu extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C0QAX LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C388940FMu(C0QAX c0qax, InterfaceC1364105Vn<? super C388940FMu> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c0qax;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C388940FMu(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Integer numLIZJ;
        AnonymousClass0956 anonymousClass0956;
        C1C7U.LIZ("TopLiveProductButtonView@4082.resumeDisplay$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C155000ia.LIZIZ(obj);
                    anonymousClass0956 = this.LLILLJJLI.LLILZIL;
                    if (anonymousClass0956 == null && !anonymousClass0956.isActive()) {
                        Unit unit = Unit.LIZ;
                        C1C7U.LIZIZ("TopLiveProductButtonView@4082.resumeDisplay$1");
                        return unit;
                    }
                    ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.LLILLJJLI.getContainerFromXml(), (Property<LinearLayout, Float>) LinearLayout.ALPHA, 0.1f, 1.0f);
                    objectAnimatorOfFloat.setInterpolator(C1619980sG4.LJIIIZ());
                    objectAnimatorOfFloat.setDuration(150L);
                    C786410Ut5.Pd(objectAnimatorOfFloat);
                    Unit unit2 = Unit.LIZ;
                    C1C7U.LIZIZ("TopLiveProductButtonView@4082.resumeDisplay$1");
                    return unit2;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            this.LL = 1;
            if (AnonymousClass0958.LIZIZ(3000L, this) == objLJFF) {
                C1C7U.LIZIZ("TopLiveProductButtonView@4082.resumeDisplay$1");
                return objLJFF;
            }
        }
        AnonymousClass0956 anonymousClass09562 = this.LLILLJJLI.LLILZIL;
        if (anonymousClass09562 != null && !anonymousClass09562.isActive()) {
            Unit unit3 = Unit.LIZ;
            C1C7U.LIZIZ("TopLiveProductButtonView@4082.resumeDisplay$1");
            return unit3;
        }
        C786410Ut5.W4(this.LLILLJJLI.getContainerFromXml(), 0.1f);
        Context context = this.LLILLJJLI.getContext();
        if (context != null && (numLIZJ = C1308910kAL.LIZJ(R.attr.a04, context)) != null) {
            this.LLILLJJLI.getContainerFromXml().setBackgroundColor(numLIZJ.intValue());
        }
        this.LL = 2;
        if (AnonymousClass0958.LIZIZ(50L, this) == objLJFF) {
            C1C7U.LIZIZ("TopLiveProductButtonView@4082.resumeDisplay$1");
            return objLJFF;
        }
        anonymousClass0956 = this.LLILLJJLI.LLILZIL;
        if (anonymousClass0956 == null) {
        }
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this.LLILLJJLI.getContainerFromXml(), (Property<LinearLayout, Float>) LinearLayout.ALPHA, 0.1f, 1.0f);
        objectAnimatorOfFloat2.setInterpolator(C1619980sG4.LJIIIZ());
        objectAnimatorOfFloat2.setDuration(150L);
        C786410Ut5.Pd(objectAnimatorOfFloat2);
        Unit unit22 = Unit.LIZ;
        C1C7U.LIZIZ("TopLiveProductButtonView@4082.resumeDisplay$1");
        return unit22;
    }
}
