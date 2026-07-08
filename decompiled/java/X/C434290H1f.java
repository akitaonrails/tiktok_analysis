package X;

import Y.ARunnableS75S0200000_6;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0H1f, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.bytedance.android.livesdk.feed.adapter.viewholder.RelationButtonWidget$bindRelationButton$1$2$follow$1$1", f = "RelationButtonWidget.kt", l = {116}, m = "invokeSuspend")
public final class C434290H1f extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ LifecycleOwner LLILLJJLI;
    public final /* synthetic */ C472630Ig9 LLILLL;
    public final /* synthetic */ View LLILZ;
    public final /* synthetic */ Function1<Boolean, Unit> LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C434290H1f(LifecycleOwner lifecycleOwner, C472630Ig9 c472630Ig9, View view, Function1<? super Boolean, Unit> function1, InterfaceC1364105Vn<? super C434290H1f> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = lifecycleOwner;
        this.LLILLL = c472630Ig9;
        this.LLILZ = view;
        this.LLILZIL = function1;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C434290H1f(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        InterfaceC472640IgA interfaceC472640IgA;
        C1C7U.LIZ("RelationButtonWidget@3e1d.bindRelationButton$1$2$follow$1$1");
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
            if (AnonymousClass0958.LIZIZ(2000L, this) == objLJFF) {
                C1C7U.LIZIZ("RelationButtonWidget@3e1d.bindRelationButton$1$2$follow$1$1");
                return objLJFF;
            }
        }
        if (this.LLILLJJLI.getLifecycle().getCurrentState() == Lifecycle.State.RESUMED && (interfaceC472640IgA = this.LLILLL.LIZIZ) != null && interfaceC472640IgA.LIZ()) {
            ViewPropertyAnimator duration = this.LLILZ.animate().scaleX(0.3f).scaleY(0.3f).setDuration(150L);
            ViewPropertyAnimator startDelay = this.LLILZ.animate().alpha(0.0f).setDuration(100L).setStartDelay(50L);
            duration.start();
            startDelay.withEndAction(new ARunnableS75S0200000_6(this.LLILZ, this.LLILZIL, 96)).start();
        } else {
            C500260Jjc.LJIILIIL(this.LLILZ);
            this.LLILZIL.invoke(false);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("RelationButtonWidget@3e1d.bindRelationButton$1$2$follow$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
