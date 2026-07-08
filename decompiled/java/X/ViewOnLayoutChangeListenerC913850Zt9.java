package X;

import Y.AAListenerS325S0100000_14;
import Y.ARunnableS114S0100000_14;
import Y.AUListenerS57S0201000_14;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.ss.android.ugc.aweme.chatdetail.redesign.operation.changename.assem.EditGroupNameEditTextAssem;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.actionbar.SocialActionBarDataFetchAssem;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder.template.media.protocol.DMAwemeSideMessageStatusReusedSkeletonUISlot;
import com.ss.android.ugc.aweme.vibefeed.service.IVibeEntranceService;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0Zt9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public class ViewOnLayoutChangeListenerC913850Zt9 implements View.OnLayoutChangeListener {
    public final int $t;
    public Object l0;

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        switch (this.$t) {
            case 0:
                onLayoutChange$0(this, view, i, i2, i3, i4, i5, i6, i7, i8);
                break;
            case 1:
                onLayoutChange$1(this, view, i, i2, i3, i4, i5, i6, i7, i8);
                break;
            case 2:
                onLayoutChange$2(this, view, i, i2, i3, i4, i5, i6, i7, i8);
                break;
            case 3:
                onLayoutChange$3(this, view, i, i2, i3, i4, i5, i6, i7, i8);
                break;
        }
    }

    public ViewOnLayoutChangeListenerC913850Zt9(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onLayoutChange$0(ViewOnLayoutChangeListenerC913850Zt9 viewOnLayoutChangeListenerC913850Zt9, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        view.removeOnLayoutChangeListener(viewOnLayoutChangeListenerC913850Zt9);
        InterfaceC1364105Vn interfaceC1364105Vn = (InterfaceC1364105Vn) viewOnLayoutChangeListenerC913850Zt9.l0;
        Unit unit = Unit.LIZ;
        C189200o6.m2constructorimpl(unit);
        interfaceC1364105Vn.resumeWith(unit);
    }

    public static final void onLayoutChange$1(ViewOnLayoutChangeListenerC913850Zt9 viewOnLayoutChangeListenerC913850Zt9, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        view.removeOnLayoutChangeListener(viewOnLayoutChangeListenerC913850Zt9);
        int width = ((DMAwemeSideMessageStatusReusedSkeletonUISlot) viewOnLayoutChangeListenerC913850Zt9.l0).Jp().getWidth();
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.addUpdateListener(new AUListenerS57S0201000_14(width, view, (DMAwemeSideMessageStatusReusedSkeletonUISlot) viewOnLayoutChangeListenerC913850Zt9.l0, 3));
        valueAnimatorOfFloat.setDuration(250L);
        valueAnimatorOfFloat.setInterpolator(C1619980sG4.LJIILJJIL());
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat2.addUpdateListener(new AUListenerS57S0201000_14(width, view, (DMAwemeSideMessageStatusReusedSkeletonUISlot) viewOnLayoutChangeListenerC913850Zt9.l0, 2));
        valueAnimatorOfFloat2.setDuration(250L);
        valueAnimatorOfFloat2.setInterpolator(C1619980sG4.LJIILJJIL());
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(valueAnimatorOfFloat, ObjectAnimator.ofFloat(((DMAwemeSideMessageStatusReusedSkeletonUISlot) viewOnLayoutChangeListenerC913850Zt9.l0).LLLILZJ.getValue(), "alpha", 1.0f, 0.0f));
        animatorSet.setInterpolator(C1619980sG4.LJIILJJIL());
        animatorSet.setDuration(250L);
        animatorSet.setStartDelay(3000L);
        AnimatorSet animatorSet2 = new AnimatorSet();
        animatorSet2.playTogether(valueAnimatorOfFloat2, ObjectAnimator.ofFloat(((DMAwemeSideMessageStatusReusedSkeletonUISlot) viewOnLayoutChangeListenerC913850Zt9.l0).LLLILZJ.getValue(), "alpha", 0.0f, 1.0f));
        animatorSet2.setInterpolator(C1619980sG4.LJIILJJIL());
        animatorSet2.setDuration(250L);
        animatorSet2.addListener(new AAListenerS325S0100000_14(animatorSet, 5));
        animatorSet2.start();
    }

    public static final void onLayoutChange$2(ViewOnLayoutChangeListenerC913850Zt9 viewOnLayoutChangeListenerC913850Zt9, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        ViewGroup.MarginLayoutParams marginLayoutParams2;
        int i9 = i4 - i2;
        if (i9 != i8 - i6) {
            int i10 = 0;
            if (i9 < C814420VxA.LIZIZ(C418440Gaw.LIZIZ(150))) {
                ViewGroup.LayoutParams layoutParams = ((EditGroupNameEditTextAssem) viewOnLayoutChangeListenerC913850Zt9.l0).LJJIJL().getLayoutParams();
                if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
                    i10 = marginLayoutParams2.topMargin;
                }
                if (i10 == C814420VxA.LIZIZ(C418440Gaw.LIZIZ(88))) {
                    View viewLJJIJL = ((EditGroupNameEditTextAssem) viewOnLayoutChangeListenerC913850Zt9.l0).LJJIJL();
                    C426750GoL.LJIIIZ(viewLJJIJL, null, Integer.valueOf(i9 - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(62))), null, null, false, 29);
                    HandlerHook.viewPost(viewLJJIJL, new ARunnableS114S0100000_14(viewLJJIJL, 56));
                    return;
                }
                return;
            }
            if (i9 <= C814420VxA.LIZIZ(C418440Gaw.LIZIZ(150))) {
                return;
            }
            ViewGroup.LayoutParams layoutParams2 = ((EditGroupNameEditTextAssem) viewOnLayoutChangeListenerC913850Zt9.l0).LJJIJL().getLayoutParams();
            if ((layoutParams2 instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams2) != null) {
                i10 = marginLayoutParams.topMargin;
            }
            if (i10 >= C814420VxA.LIZIZ(C418440Gaw.LIZIZ(88))) {
                return;
            }
            View viewLJJIJL2 = ((EditGroupNameEditTextAssem) viewOnLayoutChangeListenerC913850Zt9.l0).LJJIJL();
            C426750GoL.LJIIIZ(viewLJJIJL2, null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(88))), null, null, false, 29);
            HandlerHook.viewPost(viewLJJIJL2, new ARunnableS114S0100000_14(viewLJJIJL2, 57));
        }
    }

    public static final void onLayoutChange$3(ViewOnLayoutChangeListenerC913850Zt9 viewOnLayoutChangeListenerC913850Zt9, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        String str;
        view.removeOnLayoutChangeListener(viewOnLayoutChangeListenerC913850Zt9);
        if (((SocialActionBarDataFetchAssem) viewOnLayoutChangeListenerC913850Zt9.l0).oo().LLILLL.compareAndSet(false, true)) {
            if (((SocialActionBarDataFetchAssem) viewOnLayoutChangeListenerC913850Zt9.l0).mo().isGroupChat()) {
                str = "group";
            } else {
                str = "private";
            }
            IVibeEntranceService iVibeEntranceServiceLIZ = C1557990qe5.LIZ();
            if (iVibeEntranceServiceLIZ != null) {
                iVibeEntranceServiceLIZ.LJIILLIIL(view, ((SocialActionBarDataFetchAssem) viewOnLayoutChangeListenerC913850Zt9.l0).mo().getConversationId(), str);
            }
        }
    }
}
