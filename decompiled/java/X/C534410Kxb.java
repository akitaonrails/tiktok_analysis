package X;

import Y.ALAdapterS5S0100000_8;
import Y.AUListenerS258S0100000_8;
import android.animation.ValueAnimator;
import android.view.animation.Interpolator;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS552S0100000_8;
import njp.a;

/* JADX INFO: renamed from: X.0Kxb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editorpro.components.asyncedit.AsyncTaskAnimUtils$animationFlow$1", f = "AsyncTaskAnimUtils.kt", l = {103}, m = "invokeSuspend")
public final class C534410Kxb extends C09AX implements Function2<C094D<? super Float>, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ float LLILLL;
    public final /* synthetic */ float LLILZ;
    public final /* synthetic */ long LLILZIL;
    public final /* synthetic */ Interpolator LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C534410Kxb(float f, float f2, long j, Interpolator interpolator, InterfaceC1364105Vn<? super C534410Kxb> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = f;
        this.LLILZ = f2;
        this.LLILZIL = j;
        this.LLILZLL = interpolator;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C534410Kxb c534410Kxb = new C534410Kxb(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
        c534410Kxb.LLILLJJLI = obj;
        return c534410Kxb;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AsyncTaskAnimUtils@8dc0.animationFlow$1");
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
            C094D c094d = (C094D) this.LLILLJJLI;
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.LLILLL, this.LLILZ);
            valueAnimatorOfFloat.setDuration(this.LLILZIL);
            valueAnimatorOfFloat.setInterpolator(this.LLILZLL);
            valueAnimatorOfFloat.addUpdateListener(new AUListenerS258S0100000_8(c094d, 8));
            valueAnimatorOfFloat.addListener(new ALAdapterS5S0100000_8(c094d, 13));
            valueAnimatorOfFloat.start();
            AwS552S0100000_8 awS552S0100000_8 = new AwS552S0100000_8(valueAnimatorOfFloat, 690);
            this.LL = 1;
            if (C23128094k.LIZ(c094d, awS552S0100000_8, this) == objLJFF) {
                C1C7U.LIZIZ("AsyncTaskAnimUtils@8dc0.animationFlow$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("AsyncTaskAnimUtils@8dc0.animationFlow$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(C094D<? super Float> c094d, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(c094d, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
