package X;

import Y.AAListenerS18S0100001_15;
import Y.AAListenerS324S0100000_13;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.layout.component.utils.GuideTimeSetting;
import java.util.ArrayList;

/* JADX INFO: renamed from: X.0aVN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C937550aVN {
    public final long LIZ;

    public C937550aVN() {
        long j = GuideTimeSetting.INSTANCE.getSettingValue().guestInviteTime;
        this.LIZ = (j <= 0 || !C928030aG1.LIZIZ()) ? 5700L : j;
    }

    public final Animator LIZIZ(View view) {
        ArrayList arrayList = new ArrayList();
        float alpha = view.getAlpha();
        ObjectAnimator duration = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.SCALE_X, 1.0f, 0.5f).setDuration(400L);
        ObjectAnimator duration2 = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.SCALE_Y, 1.0f, 0.5f).setDuration(400L);
        ObjectAnimator duration3 = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, alpha, 0.0f).setDuration(400L);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(duration, duration2, duration3);
        arrayList.add(animatorSet);
        ObjectAnimator duration4 = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.SCALE_X, 0.5f, 1.0f).setDuration(400L);
        ObjectAnimator duration5 = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.SCALE_Y, 0.5f, 1.0f).setDuration(400L);
        ObjectAnimator duration6 = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, 0.0f, alpha).setDuration(400L);
        AnimatorSet animatorSet2 = new AnimatorSet();
        animatorSet2.playTogether(duration4, duration5, duration6);
        animatorSet2.setStartDelay(this.LIZ - 400);
        arrayList.add(animatorSet2);
        AnimatorSet animatorSet3 = new AnimatorSet();
        animatorSet3.addListener(new AAListenerS18S0100001_15(view, alpha, 0));
        animatorSet3.playSequentially(arrayList);
        return animatorSet3;
    }

    public final Animator LIZ(View view, LiveIconView liveIconView, View view2) {
        ArrayList arrayList = new ArrayList();
        if (view != null) {
            C786410Ut5.T4(view, 0.0f);
            C786410Ut5.LJLLLLLL(0, view);
            ArrayList arrayList2 = new ArrayList();
            ObjectAnimator duration = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, 0.0f, 1.0f).setDuration(400L);
            ObjectAnimator duration2 = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, 1.0f, 0.0f).setDuration(400L);
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.setStartDelay(700L);
            animatorSet.playTogether(duration);
            arrayList2.add(animatorSet);
            AnimatorSet animatorSet2 = new AnimatorSet();
            animatorSet2.setStartDelay((this.LIZ - 800) - 300);
            animatorSet2.playTogether(duration2);
            arrayList2.add(animatorSet2);
            AnimatorSet animatorSet3 = new AnimatorSet();
            animatorSet3.addListener(new AAListenerS324S0100000_13(view, 0));
            animatorSet3.playSequentially(arrayList2);
            arrayList.add(animatorSet3);
        }
        if (liveIconView != null) {
            arrayList.add(LIZIZ(liveIconView));
        }
        if (view2 != null) {
            arrayList.add(LIZIZ(view2));
        }
        if (arrayList.size() > 0) {
            AnimatorSet animatorSet4 = new AnimatorSet();
            animatorSet4.playTogether(arrayList);
            return animatorSet4;
        }
        return null;
    }
}
