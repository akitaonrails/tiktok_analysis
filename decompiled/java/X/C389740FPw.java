package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import com.ss.android.ugc.aweme.tools.sticker.core.BaseStickerModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0FPw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tools.sticker.core.addyours.AddYoursSticker$doAnimAddSticker$1", f = "AddYoursSticker.kt", l = {183}, m = "invokeSuspend")
public final class C389740FPw extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C390150FRl LLILLJJLI;
    public final /* synthetic */ Function0<Unit> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C389740FPw(C390150FRl c390150FRl, Function0<Unit> function0, InterfaceC1364105Vn<? super C389740FPw> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c390150FRl;
        this.LLILLL = function0;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C389740FPw(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AddYoursSticker@4cdb.doAnimAddSticker$1");
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
            C390150FRl c390150FRl = this.LLILLJJLI;
            this.LL = 1;
            if (c390150FRl.LJIJJ(false, this) == objLJFF) {
                C1C7U.LIZIZ("AddYoursSticker@4cdb.doAnimAddSticker$1");
                return objLJFF;
            }
        }
        final float alpha = this.LLILLJJLI.LJJJLL().LIZ.getBaseStickerModel().getAlpha();
        ViewPropertyAnimator interpolator = ((View) this.LLILLJJLI.LJJ.getValue()).animate().scaleX(1.0f).scaleY(1.0f).alpha(alpha).setDuration(150L).setInterpolator(C1619980sG4.LJIILIIL());
        final C390150FRl c390150FRl2 = this.LLILLJJLI;
        final Function0<Unit> function0 = this.LLILLL;
        interpolator.setListener(new AnimatorListenerAdapter() { // from class: X.0FPx
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator) {
                C390150FRl c390150FRl3 = c390150FRl2;
                c390150FRl3.LJJJLIIL(BaseStickerModel.copy$default(c390150FRl3.LJJJLL().LIZ.getBaseStickerModel(), 0, 0, null, 0, 0, 0.0f, 0.0f, 0, 0, 0, 0, 0, 0, 0, 0, false, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, false, 0.0f, 0.0f, false, alpha, null, null, null, false, 2139095039, 15, null));
                function0.invoke();
            }
        }).start();
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("AddYoursSticker@4cdb.doAnimAddSticker$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
