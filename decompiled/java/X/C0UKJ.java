package X;

import Y.AAListenerS323S0100000_12;
import Y.ACListenerS147S0100000_12;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveBroadcastPictureMemOpt;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0UKJ, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0UKJ {
    public static AnimatorSet LIZ;
    public static AnimatorSet LIZIZ;
    public static AnimatorSet LIZJ;
    public static AnimatorSet LIZLLL;
    public static AnimatorSet LJ;
    public static AnimatorSet LJFF;
    public static C1143920fsE LJI;
    public static boolean LJII;
    public static String LJIIIIZZ;

    public static void LIZIZ() {
        C1143920fsE c1143920fsE = LJI;
        if (c1143920fsE != null) {
            c1143920fsE.LIZ();
        }
        LJI = null;
        LIZ = null;
        LIZIZ = null;
        LIZJ = null;
        LIZLLL = null;
        LJ = null;
        LJFF = null;
        LJII = false;
        LJIIIIZZ = null;
    }

    public static void LIZ(View view, DataChannel dataChannel) {
        String str;
        LIZ = new AnimatorSet();
        LIZIZ = new AnimatorSet();
        LIZJ = new AnimatorSet();
        LIZLLL = new AnimatorSet();
        LJ = new AnimatorSet();
        LJFF = new AnimatorSet();
        C786410Ut5.LL(0, (ConstraintLayout) view.findViewById(R.id.idk));
        C786410Ut5.c5((ConstraintLayout) view.findViewById(R.id.idk), 1.0f);
        C786410Ut5.l5((C16FV) view.findViewById(R.id.idl), 0.0f);
        C786410Ut5.l5((C16FV) view.findViewById(R.id.hi_), 0.0f);
        view.findViewById(R.id.idk).setClickable(true);
        C473410IhP.LJFF(LiveBroadcastPictureMemOpt.getCleanFrescoAnimationCacheTask(), LiveBroadcastPictureMemOpt.optGeckoWebPAnimationCache());
        C1143920fsE c1143920fsE = new C1143920fsE();
        c1143920fsE.LIZ = (C1322110kVd) view.findViewById(R.id.jch);
        c1143920fsE.LIZIZ = C0IPN.LIZ("tiktok_live_broadcast_resource", "tiktok_live_broadcast_normal_1");
        c1143920fsE.LJFF = true;
        c1143920fsE.LJ = new C786380Ut2(view, 1);
        c1143920fsE.LIZJ = "ttlive_focus_guide_hand.webp";
        LJI = c1143920fsE;
        C1143680frq.LJIIIIZZ(c1143920fsE);
        ((C16F5) view.findViewById(R.id.jdm)).LJJJI(R.style.a8v);
        ObjectAnimator duration = ObjectAnimator.ofFloat(view.findViewById(R.id.jch), (Property<View, Float>) View.ALPHA, 0.0f, 1.0f).setDuration(300L);
        ObjectAnimator duration2 = ObjectAnimator.ofFloat(view.findViewById(R.id.idk), (Property<View, Float>) View.ALPHA, 1.0f, 0.0f).setDuration(500L);
        duration2.setStartDelay(1000L);
        AnimatorSet animatorSet = LIZ;
        if (animatorSet != null) {
            animatorSet.playSequentially(duration, duration2);
        }
        AnimatorSet animatorSet2 = LIZ;
        if (animatorSet2 != null) {
            animatorSet2.start();
        }
        ObjectAnimator duration3 = ObjectAnimator.ofFloat(view.findViewById(R.id.jdm), (Property<View, Float>) View.ALPHA, 0.0f, 1.0f).setDuration(300L);
        AnimatorSet animatorSet3 = LIZIZ;
        if (animatorSet3 != null) {
            animatorSet3.play(duration3);
        }
        AnimatorSet animatorSet4 = LIZIZ;
        if (animatorSet4 != null) {
            animatorSet4.start();
        }
        ObjectAnimator duration4 = ObjectAnimator.ofFloat(view.findViewById(R.id.idl), (Property<View, Float>) View.ALPHA, 0.0f, 1.0f).setDuration(300L);
        AnimatorSet animatorSet5 = LIZJ;
        if (animatorSet5 != null) {
            animatorSet5.setStartDelay(800L);
        }
        AnimatorSet animatorSet6 = LIZJ;
        if (animatorSet6 != null) {
            animatorSet6.play(duration4);
        }
        AnimatorSet animatorSet7 = LIZJ;
        if (animatorSet7 != null) {
            animatorSet7.start();
        }
        ObjectAnimator duration5 = ObjectAnimator.ofFloat(view.findViewById(R.id.hi_), (Property<View, Float>) View.ALPHA, 0.0f, 1.0f).setDuration(300L);
        AnimatorSet animatorSet8 = LIZLLL;
        if (animatorSet8 != null) {
            animatorSet8.setStartDelay(800L);
        }
        AnimatorSet animatorSet9 = LIZLLL;
        if (animatorSet9 != null) {
            animatorSet9.play(duration5);
        }
        AnimatorSet animatorSet10 = LIZLLL;
        if (animatorSet10 != null) {
            animatorSet10.start();
        }
        ObjectAnimator duration6 = ObjectAnimator.ofFloat(view.findViewById(R.id.idl), (Property<View, Float>) View.SCALE_X, 1.5f, 1.0f).setDuration(300L);
        ObjectAnimator duration7 = ObjectAnimator.ofFloat(view.findViewById(R.id.idl), (Property<View, Float>) View.SCALE_Y, 1.5f, 1.0f).setDuration(300L);
        ObjectAnimator duration8 = ObjectAnimator.ofFloat(view.findViewById(R.id.hi_), (Property<View, Float>) View.SCALE_X, 1.5f, 1.0f).setDuration(300L);
        ObjectAnimator duration9 = ObjectAnimator.ofFloat(view.findViewById(R.id.hi_), (Property<View, Float>) View.SCALE_Y, 1.5f, 1.0f).setDuration(300L);
        AnimatorSet animatorSet11 = new AnimatorSet();
        animatorSet11.setStartDelay(800L);
        animatorSet11.playTogether(duration6, duration7, duration8, duration9);
        animatorSet11.start();
        AnimatorSet animatorSet12 = LIZ;
        if (animatorSet12 != null) {
            animatorSet12.addListener(new AAListenerS323S0100000_12(view, 15));
        }
        ObjectAnimator duration10 = ObjectAnimator.ofFloat(view.findViewById(R.id.jch), (Property<View, Float>) View.TRANSLATION_Y, 0.0f, -30.0f).setDuration(300L);
        AnimatorSet animatorSet13 = LJ;
        if (animatorSet13 != null) {
            animatorSet13.play(duration10);
        }
        AnimatorSet animatorSet14 = LJ;
        if (animatorSet14 != null) {
            animatorSet14.start();
        }
        ObjectAnimator duration11 = ObjectAnimator.ofFloat(view.findViewById(R.id.jdm), (Property<View, Float>) View.TRANSLATION_Y, 0.0f, -30.0f).setDuration(300L);
        AnimatorSet animatorSet15 = LJFF;
        if (animatorSet15 != null) {
            animatorSet15.play(duration11);
        }
        AnimatorSet animatorSet16 = LJFF;
        if (animatorSet16 != null) {
            animatorSet16.start();
        }
        view.findViewById(R.id.idk).setClickable(true);
        C786410Ut5.Y7((ConstraintLayout) view.findViewById(R.id.idk), new ACListenerS147S0100000_12(view, 314));
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_live_focus_exposure_guide");
        c474500IjALIZ.LJIJJLI(dataChannel);
        c474500IjALIZ.LJJII(0, "is_dual_camera");
        Integer numLIZ = InterfaceC772190UQv.c3.LIZ();
        if (numLIZ != null && numLIZ.intValue() == 1) {
            str = "front";
        } else {
            str = "back";
        }
        c474500IjALIZ.LJJII(str, "camera_type");
        c474500IjALIZ.LJJII(0, "detected_exp");
        String str2 = LJIIIIZZ;
        if (str2 == null) {
            str2 = "normal_click";
        }
        c474500IjALIZ.LJJII(str2, "from");
        c474500IjALIZ.LIZ();
    }
}
