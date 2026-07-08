package X;

import android.animation.Animator;
import android.graphics.Rect;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.keva.Keva;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0EZd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
@C09DV(c = "com.ss.android.ugc.gamora.recorder.bottom.TabStyleManager$applyLottie$1", f = "TabStyleManager.kt", l = {210}, m = "invokeSuspend")
public final class C366670EZd extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ Function0<Unit> LLILLJJLI;
    public final /* synthetic */ TextView LLILLL;
    public final /* synthetic */ C1295960jpS LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ Function0<Unit> LLILZLL;
    public final /* synthetic */ String LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C366670EZd(Function0<Unit> function0, TextView textView, C1295960jpS c1295960jpS, String str, Function0<Unit> function02, String str2, InterfaceC1364105Vn<? super C366670EZd> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = function0;
        this.LLILLL = textView;
        this.LLILZ = c1295960jpS;
        this.LLILZIL = str;
        this.LLILZLL = function02;
        this.LLIZ = str2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C366670EZd(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        C1C7U.LIZ("TabStyleManager@f4bf.applyLottie$1");
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
            C1DFB c1dfb = C0PEM.LIZJ;
            C475101t7 c475101t7 = new C475101t7(this.LLIZ, null);
            this.LL = 1;
            obj = C23250099c.LJI(this, c1dfb, c475101t7);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("TabStyleManager@f4bf.applyLottie$1");
                return objLJFF;
            }
        }
        C1294720jnS c1294720jnS = (C1294720jnS) obj;
        if (c1294720jnS == null) {
            Function0<Unit> function0 = this.LLILLJJLI;
            if (function0 != null) {
                function0.invoke();
            }
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("TabStyleManager@f4bf.applyLottie$1");
            return unit;
        }
        TextView textView = this.LLILLL;
        if (textView != null) {
            C786410Ut5.LLIL(textView, 8);
        }
        C786410Ut5.LLD(0, this.LLILZ);
        Rect rect = c1294720jnS.LJIIIZ;
        if (rect.width() > 0 && rect.height() > 0) {
            int i2 = (int) (40 * this.LLILZ.getResources().getDisplayMetrics().density);
            int iWidth = (int) (i2 * (rect.width() / rect.height()));
            C1295960jpS c1295960jpS = this.LLILZ;
            ViewGroup.LayoutParams layoutParams = c1295960jpS.getLayoutParams();
            if (layoutParams != null) {
                C1295960jpS c1295960jpS2 = this.LLILZ;
                layoutParams.width = iWidth + c1295960jpS2.getPaddingStart() + c1295960jpS2.getPaddingEnd();
                layoutParams.height = i2 + c1295960jpS2.getPaddingTop() + c1295960jpS2.getPaddingBottom();
            } else {
                layoutParams = new ViewGroup.LayoutParams(iWidth + this.LLILZ.getPaddingStart() + this.LLILZ.getPaddingEnd(), i2 + this.LLILZ.getPaddingTop() + this.LLILZ.getPaddingBottom());
            }
            C786410Ut5.s6(c1295960jpS, layoutParams);
        }
        this.LLILZ.setComposition(c1294720jnS);
        String str = this.LLILZIL;
        Keva kevaLIZIZ = C1420250n3v.LIZIZ();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("bottom_tab_lottie_played_");
        sbLIZ.append(str);
        if (kevaLIZIZ.getBoolean(C2188811AlT.LIZIZ(sbLIZ), false)) {
            this.LLILZ.setProgress(1.0f);
        } else {
            this.LLILZ.setRepeatCount(0);
            final C1295960jpS c1295960jpS3 = this.LLILZ;
            final String str2 = this.LLILZIL;
            c1295960jpS3.addAnimatorListener(new Animator.AnimatorListener() { // from class: X.0EZe
                @Override // android.animation.Animator.AnimatorListener
                public final void onAnimationCancel(Animator animator) {
                }

                @Override // android.animation.Animator.AnimatorListener
                public final void onAnimationRepeat(Animator animator) {
                }

                @Override // android.animation.Animator.AnimatorListener
                public final void onAnimationStart(Animator animator) {
                }

                @Override // android.animation.Animator.AnimatorListener
                public final void onAnimationEnd(Animator animator) {
                    c1295960jpS3.removeAnimatorListener(this);
                    c1295960jpS3.setProgress(1.0f);
                    String str3 = str2;
                    Keva kevaLIZIZ2 = C1420250n3v.LIZIZ();
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("bottom_tab_lottie_played_");
                    sbLIZ2.append(str3);
                    kevaLIZIZ2.storeBoolean(C2188811AlT.LIZIZ(sbLIZ2), true);
                }
            });
            this.LLILZ.playAnimation();
        }
        Function0<Unit> function02 = this.LLILZLL;
        if (function02 != null) {
            function02.invoke();
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("TabStyleManager@f4bf.applyLottie$1");
        return unit2;
    }
}
