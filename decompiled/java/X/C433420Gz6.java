package X;

import Y.AAListenerS261S0200000_6;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.widget.TextView;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.0Gz6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.aweme.fcpanchor.render.FeedMultiTagLayout$onVideoViewHolderPageSelected$1", f = "FeedMultiTagLayout.kt", l = {359}, m = "invokeSuspend")
public final class C433420Gz6 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C705790RmL LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C433420Gz6(C705790RmL c705790RmL, InterfaceC1364105Vn<? super C433420Gz6> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c705790RmL;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C433420Gz6(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        TextView textViewLJIJ;
        TextView textViewLJIJ2;
        CharSequence text;
        TextView textViewLJIJ3;
        C1C7U.LIZ("FeedMultiTagLayout@629c.onVideoViewHolderPageSelected$1");
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
            C705790RmL c705790RmL = this.LLILLJJLI;
            if (c705790RmL.LLIZLLLIL && c705790RmL.LLIZ >= 0) {
                c705790RmL.getClass();
                if (!Intrinsics.LJFF(null, true) && (((textViewLJIJ = this.LLILLJJLI.LJIJ()) == null || textViewLJIJ.getVisibility() != 0) && (textViewLJIJ2 = this.LLILLJJLI.LJIJ()) != null && (text = textViewLJIJ2.getText()) != null && text.length() != 0)) {
                    long j = this.LLILLJJLI.LLIZ;
                    this.LL = 1;
                    if (AnonymousClass0958.LIZIZ(j, this) == objLJFF) {
                        C1C7U.LIZIZ("FeedMultiTagLayout@629c.onVideoViewHolderPageSelected$1");
                        return objLJFF;
                    }
                }
            }
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("FeedMultiTagLayout@629c.onVideoViewHolderPageSelected$1");
            return unit;
        }
        final C705790RmL c705790RmL2 = this.LLILLJJLI;
        c705790RmL2.getClass();
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        TextView textViewLJIIJJI = c705790RmL2.LJIIJJI();
        if (textViewLJIIJJI != null && (textViewLJIJ3 = c705790RmL2.LJIJ()) != null) {
            textViewLJIIJJI.measure(iMakeMeasureSpec, iMakeMeasureSpec);
            textViewLJIJ3.measure(iMakeMeasureSpec, iMakeMeasureSpec);
            final int measuredWidth = textViewLJIIJJI.getMeasuredWidth();
            final int measuredHeight = textViewLJIIJJI.getMeasuredHeight();
            final int measuredWidth2 = textViewLJIJ3.getMeasuredWidth();
            final int measuredHeight2 = textViewLJIJ3.getMeasuredHeight();
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            valueAnimatorOfFloat.setDuration(300L);
            valueAnimatorOfFloat.setInterpolator(new DecelerateInterpolator());
            valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: X.0Gz7
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    ViewGroup.LayoutParams layoutParams;
                    View viewLJ = c705790RmL2.LJ();
                    if (viewLJ != null && (layoutParams = viewLJ.getLayoutParams()) != null) {
                        layoutParams.height = (int) ((((Float) valueAnimator.getAnimatedValue()).floatValue() * measuredHeight2) + measuredHeight);
                        if (measuredWidth2 > measuredWidth) {
                            float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            int i2 = measuredWidth2;
                            layoutParams.width = (int) ((fFloatValue * (i2 - r1)) + measuredWidth);
                        }
                        View viewLJ2 = c705790RmL2.LJ();
                        if (viewLJ2 != null) {
                            C786410Ut5.W5(viewLJ2, layoutParams);
                        }
                    }
                }
            });
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(textViewLJIJ3, "alpha", 0.0f, 1.0f);
            objectAnimatorOfFloat.setStartDelay(50L);
            objectAnimatorOfFloat.setDuration(300L);
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(valueAnimatorOfFloat, objectAnimatorOfFloat);
            animatorSet.addListener(new AAListenerS261S0200000_6(textViewLJIJ3, c705790RmL2, textViewLJIIJJI, measuredWidth, measuredWidth2, 26));
            animatorSet.start();
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("FeedMultiTagLayout@629c.onVideoViewHolderPageSelected$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
