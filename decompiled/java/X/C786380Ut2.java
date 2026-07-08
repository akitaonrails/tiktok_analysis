package X;

import android.animation.ObjectAnimator;
import android.graphics.drawable.Animatable;
import android.view.MotionEvent;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.android.live.effect.livegoal.LiveGoalBackgroundDialogFragment;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveBroadcastPictureMemOpt;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.n;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS199S0000000_12;
import kotlin.jvm.internal.AwS556S0100000_12;

/* JADX INFO: renamed from: X.0Ut2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public class C786380Ut2 extends C1143950fsH {
    public final int $t;
    public Object l0;

    @Override // X.C1143950fsH
    public final void LIZLLL() {
        switch (this.$t) {
            case 0:
                LIZLLL$0(this);
                break;
            case 1:
            default:
                super.LIZLLL();
                break;
            case 2:
                C20441214yg.LIZIZ("KaraokeSongListAdapter", "GuideAnim onResourceReady");
                break;
            case 3:
                LIZLLL$2(this);
                break;
            case 4:
                LIZLLL$3(this);
                break;
        }
    }

    @Override // X.C1143950fsH
    public final void LJ(Animatable animatable) {
        if (2 - this.$t != 0) {
            super.LJ(animatable);
        } else {
            C20441214yg.LIZIZ("KaraokeSongListAdapter", "Webp onStart");
        }
    }

    @Override // X.C1143950fsH
    public final void LJFF(Animatable animatable) {
        switch (this.$t) {
            case 0:
                LJFF$0(this, animatable);
                break;
            case 1:
                LJFF$1(this, animatable);
                break;
            case 2:
                LJFF$2(this, animatable);
                break;
            case 3:
            default:
                super.LJFF(animatable);
                break;
            case 4:
                LJFF$3(this, animatable);
                break;
        }
    }

    public static final void LIZLLL$0(C786380Ut2 c786380Ut2) {
        LiveGoalBackgroundDialogFragment liveGoalBackgroundDialogFragment = (LiveGoalBackgroundDialogFragment) c786380Ut2.l0;
        liveGoalBackgroundDialogFragment.LLJLIL.LIZ = true;
        C500260Jjc.LLFFF(liveGoalBackgroundDialogFragment.PR());
        ((LiveGoalBackgroundDialogFragment) c786380Ut2.l0).LLJJLIIIJLLLLLLLZ.LJFF();
        View view = ((LiveGoalBackgroundDialogFragment) c786380Ut2.l0).LLJJIJIL;
        if (view != null) {
            C786410Ut5.LJLLLLLL(0, view);
        }
        View view2 = ((LiveGoalBackgroundDialogFragment) c786380Ut2.l0).LLJJJ;
        if (view2 != null) {
            C786410Ut5.LJLLLLLL(0, view2);
        }
        ((LiveGoalBackgroundDialogFragment) c786380Ut2.l0).LLJILLL.start();
        ConstraintLayout constraintLayoutSR = ((LiveGoalBackgroundDialogFragment) c786380Ut2.l0).SR();
        if (constraintLayoutSR != null) {
            constraintLayoutSR.setOnTouchListener(new View.OnTouchListener() { // from class: X.0UFU
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view3, MotionEvent motionEvent) {
                    return false;
                }
            });
        }
        C20441214yg.LIZIZ("LiveGoalEffect", "GeckoWebpController: onResourceReady.");
    }

    public static final void LIZLLL$2(C786380Ut2 c786380Ut2) {
        ((C1143920fsE) c786380Ut2.l0).LJFF();
    }

    public static final void LIZLLL$3(C786380Ut2 c786380Ut2) {
        C0UKZ.LLFZ.LIZJ(Boolean.TRUE);
        ObjectAnimator objectAnimator = ((C781580UlI) c786380Ut2.l0).LLILLJJLI;
        if (objectAnimator != null) {
            C786410Ut5.Pd(objectAnimator);
        }
    }

    public C786380Ut2(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void LJFF$0(C786380Ut2 c786380Ut2, Animatable animatable) {
        n nVar = C0UFI.LJ;
        if (nVar != null) {
            nVar.LJJIII(1, "play_guide_animation");
        }
        try {
            String strLJIILJJIL = C19748512Ol.LIZIZ.LJIILJJIL(C0UFI.LJ);
            if (strLJIILJJIL != null) {
                C0UA1.LIZ().setRenderCacheString("LiveGoal", strLJIILJJIL);
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        ((LiveGoalBackgroundDialogFragment) c786380Ut2.l0).LLJILLL.cancel();
        ((LiveGoalBackgroundDialogFragment) c786380Ut2.l0).MR();
        LiveBroadcastPictureMemOpt.cleanGeckoWebPResources(new AwS556S0100000_12((LiveGoalBackgroundDialogFragment) c786380Ut2.l0, 52));
        C20441214yg.LIZIZ("LiveGoalEffect", "GeckoWebpController: stop.");
    }

    public static final void LJFF$1(C786380Ut2 c786380Ut2, Animatable animatable) {
        View viewFindViewById = ((View) c786380Ut2.l0).findViewById(R.id.idk);
        if (viewFindViewById != null) {
            viewFindViewById.setClickable(false);
        }
        C786410Ut5.LL(8, (ConstraintLayout) ((View) c786380Ut2.l0).findViewById(R.id.idk));
        LiveBroadcastPictureMemOpt.cleanGeckoWebPResources(AFwS199S0000000_12.get$arr$(278));
    }

    public static final void LJFF$2(C786380Ut2 c786380Ut2, Animatable animatable) {
        C20441214yg.LIZIZ("KaraokeSongListAdapter", "Webp onStop");
        C1324720kZq c1324720kZq = ((C0U2M) c786380Ut2.l0).LLILZ;
        if (c1324720kZq != null) {
            C786410Ut5.LLJJIII(c1324720kZq, 8);
        }
    }

    public static final void LJFF$3(C786380Ut2 c786380Ut2, Animatable animatable) {
        ObjectAnimator objectAnimator = ((C781580UlI) c786380Ut2.l0).LLILLL;
        if (objectAnimator != null) {
            C786410Ut5.Pd(objectAnimator);
        }
        LiveBroadcastPictureMemOpt.cleanGeckoWebPResources(new AwS556S0100000_12((C781580UlI) c786380Ut2.l0, 997));
    }
}
