package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import com.bytedance.tt.reliability.monitor.viewchecker.RemoveViewCausedNPEChecker;
import com.ss.android.ugc.aweme.inbox.bulletin.assem.BulletinPageInteractionAssem;
import com.ss.android.ugc.aweme.inbox.bulletin.data.item.BulletinBaseItem;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import u4.q0;

/* JADX INFO: renamed from: X.0OR8, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0OR8 extends C09AY implements Function0<Unit> {
    public final /* synthetic */ BulletinPageInteractionAssem LL;
    public final /* synthetic */ ViewGroup LLILLJJLI;
    public final /* synthetic */ int LLILLL;
    public final /* synthetic */ View LLILZ;
    public final /* synthetic */ BulletinBaseItem LLILZIL;
    public final /* synthetic */ float LLILZLL;
    public final /* synthetic */ int[] LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0OR8(BulletinPageInteractionAssem bulletinPageInteractionAssem, ViewGroup viewGroup, int i, View view, BulletinBaseItem bulletinBaseItem, float f, int[] iArr) {
        super(0);
        this.LL = bulletinPageInteractionAssem;
        this.LLILLJJLI = viewGroup;
        this.LLILLL = i;
        this.LLILZ = view;
        this.LLILZIL = bulletinBaseItem;
        this.LLILZLL = f;
        this.LLIZ = iArr;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        float height;
        int i;
        ViewPropertyAnimator viewPropertyAnimatorAnimate;
        ViewPropertyAnimator viewPropertyAnimatorAlpha;
        ViewPropertyAnimator interpolator;
        ViewPropertyAnimator duration;
        ViewPropertyAnimator listener;
        View viewFindViewById;
        boolean z;
        int i2;
        float fLIZIZ;
        int iLIZLLL;
        C20244914Jj c20244914JjLIZIZ;
        ViewPropertyAnimator viewPropertyAnimatorAnimate2;
        ViewPropertyAnimator viewPropertyAnimatorAlpha2;
        ViewPropertyAnimator interpolator2;
        ViewPropertyAnimator duration2;
        View viewFindViewById2;
        View view;
        C20246014Ju c20246014JuLIZ;
        C20244914Jj c20244914JjLIZIZ2;
        Integer numValueOf;
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jvOo = this.LL.Oo();
        ViewGroup viewGroup = this.LLILLJJLI;
        RemoveViewCausedNPEChecker.recordViewRemovedPoint(viewOnAttachStateChangeListenerC20604515jvOo, viewGroup);
        viewOnAttachStateChangeListenerC20604515jvOo.removeView(viewGroup);
        ViewGroup.LayoutParams layoutParams = this.LLILLJJLI.getLayoutParams();
        C621510OZh c621510OZh = (C621510OZh) this.LLILLJJLI.findViewById(R.id.d0t);
        int height2 = c621510OZh.getHeight();
        View viewFindViewById3 = this.LLILLJJLI.findViewById(R.id.d0b);
        FrameLayout frameLayoutNo = this.LL.No();
        if (C0C64.LJIILLIIL().LJIIIZ(31744, "fix_7074217708_emoji_panel_alignment", true, true)) {
            int i3 = this.LLILLL / 2;
            int height3 = viewFindViewById3.getHeight();
            if (height3 > i3) {
                z = true;
                i2 = i3;
                fLIZIZ = 0.0f;
            } else {
                z = false;
                i2 = height3;
                fLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20));
            }
            Fragment fragmentLJI = C724240Sb0.LJI(this.LL);
            if (fragmentLJI == null || (view = fragmentLJI.getView()) == null || (c20246014JuLIZ = C14K4.LIZ(view)) == null || (c20244914JjLIZIZ2 = c20246014JuLIZ.LIZIZ(7)) == null || (numValueOf = Integer.valueOf(c20244914JjLIZIZ2.LIZLLL)) == null) {
                C20246014Ju c20246014JuLIZ2 = C14K4.LIZ(this.LLILZ);
                if (c20246014JuLIZ2 == null || (c20244914JjLIZIZ = c20246014JuLIZ2.LIZIZ(7)) == null) {
                    C844470XAv.LIZ.getClass();
                    iLIZLLL = C14KQ.LIZLLL(C844470XAv.LIZ());
                } else {
                    iLIZLLL = c20244914JjLIZIZ.LIZLLL;
                }
            } else {
                iLIZLLL = numValueOf.intValue();
            }
            int iMin = Math.min(height2, Math.max(((this.LLILLL - iLIZLLL) - ((int) fLIZIZ)) - i2, 0));
            if (iMin < height2) {
                c621510OZh.setMaxHeight(iMin);
            }
            c621510OZh.setPadding(0, 0, 0, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(28)));
            layoutParams.width = frameLayoutNo.getWidth();
            layoutParams.height = height3 + iMin;
            C786410Ut5.X5(layoutParams, this.LLILLJJLI);
            if ((this.LLILZIL instanceof C0OOP) && (viewFindViewById2 = this.LLILLJJLI.findViewById(R.id.d0b)) != null) {
                viewFindViewById2.setBackground(this.LLILZ.findViewById(R.id.d0b).getBackground());
            }
            if (C0C0T.LIZ()) {
                q0.LJIJ(this.LLILLJJLI, null);
                this.LLILLJJLI.setImportantForAccessibility(4);
            }
            frameLayoutNo.addView(this.LLILLJJLI);
            if (z) {
                this.LLILLJJLI.scrollTo(0, height3 - i3);
            }
            this.LL.LLJJJ = this.LLILZLL;
            C786410Ut5.fd(frameLayoutNo, this.LLILZLL);
            C786410Ut5.U4(frameLayoutNo, 1.0f);
            ViewGroup.LayoutParams layoutParams2 = frameLayoutNo.getLayoutParams();
            layoutParams2.height = i2 + iMin;
            C786410Ut5.a6(frameLayoutNo, layoutParams2);
            float f = this.LLILZLL;
            if (fLIZIZ != f) {
                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(frameLayoutNo, (Property<FrameLayout, Float>) View.TRANSLATION_Y, f, fLIZIZ);
                objectAnimatorOfFloat.setDuration(300L);
                objectAnimatorOfFloat.setInterpolator(C1619980sG4.LJIILIIL());
                C786410Ut5.Pd(objectAnimatorOfFloat);
            }
            View viewFindViewById4 = this.LLILLJJLI.findViewById(R.id.d0u);
            if (viewFindViewById4 != null) {
                C786410Ut5.T4(viewFindViewById4, 0.0f);
            }
            View viewFindViewById5 = this.LLILLJJLI.findViewById(R.id.d0u);
            if (viewFindViewById5 != null && (viewPropertyAnimatorAnimate2 = viewFindViewById5.animate()) != null && (viewPropertyAnimatorAlpha2 = viewPropertyAnimatorAnimate2.alpha(1.0f)) != null && (interpolator2 = viewPropertyAnimatorAlpha2.setInterpolator(C1619980sG4.LJI())) != null && (duration2 = interpolator2.setDuration(250L)) != null) {
                duration2.start();
            }
        } else {
            C0OLV c0olvHo = this.LL.Ho();
            if (c0olvHo == null || !c0olvHo.LLJ) {
                height = this.LLILZLL + this.LLILLJJLI.getHeight();
                i = this.LLILLL;
            } else {
                height = this.LLIZ[1] + this.LLILLJJLI.getHeight();
                i = this.LLILLL;
            }
            int i4 = (int) (height - i);
            int i5 = i4 > 0 ? height2 - i4 : height2;
            if (i5 < height2) {
                c621510OZh.setMaxHeight(i5);
            }
            c621510OZh.setPadding(0, 0, 0, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(28)));
            layoutParams.width = frameLayoutNo.getWidth();
            layoutParams.height = viewFindViewById3.getHeight() + i5 + this.LLILLJJLI.getPaddingBottom();
            C786410Ut5.X5(layoutParams, this.LLILLJJLI);
            if ((this.LLILZIL instanceof C0OOP) && (viewFindViewById = this.LLILLJJLI.findViewById(R.id.d0b)) != null) {
                viewFindViewById.setBackground(this.LLILZ.findViewById(R.id.d0b).getBackground());
            }
            if (C0C0T.LIZ()) {
                q0.LJIJ(this.LLILLJJLI, null);
                this.LLILLJJLI.setImportantForAccessibility(4);
            }
            frameLayoutNo.addView(this.LLILLJJLI);
            C786410Ut5.fd(frameLayoutNo, this.LLILZLL);
            C786410Ut5.U4(frameLayoutNo, 1.0f);
            ViewGroup.LayoutParams layoutParams3 = frameLayoutNo.getLayoutParams();
            layoutParams3.height = this.LLILLJJLI.getLayoutParams().height;
            C786410Ut5.a6(frameLayoutNo, layoutParams3);
            View viewFindViewById6 = this.LLILLJJLI.findViewById(R.id.d0u);
            if (viewFindViewById6 != null) {
                C786410Ut5.T4(viewFindViewById6, 0.0f);
            }
            View viewFindViewById7 = this.LLILLJJLI.findViewById(R.id.d0u);
            if (viewFindViewById7 != null && (viewPropertyAnimatorAnimate = viewFindViewById7.animate()) != null && (viewPropertyAnimatorAlpha = viewPropertyAnimatorAnimate.alpha(1.0f)) != null && (interpolator = viewPropertyAnimatorAlpha.setInterpolator(C1619980sG4.LJI())) != null && (duration = interpolator.setDuration(250L)) != null && (listener = duration.setListener(new AnimatorListenerAdapter() { // from class: X.0OR9
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public final void onAnimationStart(Animator animator) {
                    super.onAnimationStart(animator);
                }
            })) != null) {
                listener.start();
            }
        }
        C0DTR.LIZIZ(this.LL.Oo());
        return Unit.LIZ;
    }
}
