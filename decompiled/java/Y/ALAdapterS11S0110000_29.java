package Y;

import X.C12W6;
import X.C12WZ;
import X.C12X5;
import X.C19383610sU;
import X.C19732312If;
import X.C19764012Uk;
import X.C786410Ut5;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.app.Activity;
import android.os.Handler;
import android.view.View;
import android.widget.TextView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.shortvideo.cut.model.CutVideoContext;
import com.ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment;
import com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoBottomBarViewModel;
import com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoListViewModel;
import com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoSpeedViewModel;
import com.ss.android.ugc.aweme.shortvideo.cut.videoedit.VideoEditViewModel;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AwS41S0010000_29;

/* JADX INFO: loaded from: classes30.dex */
public class ALAdapterS11S0110000_29 extends AnimatorListenerAdapter {
    public final int $t;
    public Object l0;
    public boolean z1;

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.$t) {
            case 0:
                onAnimationEnd$0(this, animator);
                break;
            case 1:
                onAnimationEnd$1(this, animator);
                break;
            case 2:
                onAnimationEnd$2(this, animator);
                break;
            default:
                super.onAnimationEnd(animator);
                break;
        }
    }

    public static final void onAnimationEnd$0(ALAdapterS11S0110000_29 aLAdapterS11S0110000_29, Animator animator) {
        super.onAnimationEnd(animator);
        if (aLAdapterS11S0110000_29.z1) {
            C786410Ut5.LLIIL(((C19732312If) aLAdapterS11S0110000_29.l0).LJIIIZ, 8);
        } else {
            C786410Ut5.LLIIL(((C19732312If) aLAdapterS11S0110000_29.l0).LJFF, 8);
        }
    }

    public static final void onAnimationEnd$1(ALAdapterS11S0110000_29 aLAdapterS11S0110000_29, Animator animator) {
        C19383610sU c19383610sU;
        View view;
        Handler handler;
        View view2;
        if (!aLAdapterS11S0110000_29.z1 && (view2 = ((C19383610sU) aLAdapterS11S0110000_29.l0).LLILLJJLI) != null) {
            C786410Ut5.LJLLLLLL(4, view2);
        }
        if (aLAdapterS11S0110000_29.z1 && (view = (c19383610sU = (C19383610sU) aLAdapterS11S0110000_29.l0).LLILLJJLI) != null && (handler = view.getHandler()) != null) {
            handler.removeCallbacks(c19383610sU.LLJJ);
            C786410Ut5.LJLIIL(2000L, handler, c19383610sU.LLJJ);
        }
    }

    public static final void onAnimationEnd$2(ALAdapterS11S0110000_29 aLAdapterS11S0110000_29, Animator animator) {
        super.onAnimationEnd(animator);
        Activity activity = ((C12WZ) aLAdapterS11S0110000_29.l0).mActivity;
        if (activity != null && activity.isFinishing()) {
            return;
        }
        CutVideoSpeedViewModel cutVideoSpeedViewModel = ((C12WZ) aLAdapterS11S0110000_29.l0).LLJJJJLIIL;
        C12X5 c12x5 = null;
        if (cutVideoSpeedViewModel == null) {
            cutVideoSpeedViewModel = null;
        }
        cutVideoSpeedViewModel.getClass();
        cutVideoSpeedViewModel.setState(new AwS41S0010000_29(true, 81));
        TextView textView = ((C12WZ) aLAdapterS11S0110000_29.l0).LLJJIJIIJIL;
        if (textView == null) {
            textView = null;
        }
        C786410Ut5.LLIL(textView, 8);
        View view = ((C12WZ) aLAdapterS11S0110000_29.l0).LLJJ;
        if (view == null) {
            view = null;
        }
        C786410Ut5.LJLLLLLL(0, view);
        if (aLAdapterS11S0110000_29.z1) {
            VideoEditViewModel videoEditViewModel = ((C12WZ) aLAdapterS11S0110000_29.l0).LLJJJIL;
            if (videoEditViewModel == null) {
                videoEditViewModel = null;
            }
            List<VideoSegment> listZQ2 = videoEditViewModel.zQ2();
            CutVideoListViewModel cutVideoListViewModel = ((C12WZ) aLAdapterS11S0110000_29.l0).LLJLILLLLZIIL;
            if (cutVideoListViewModel == null) {
                cutVideoListViewModel = null;
            }
            String strLJFF = ((VideoSegment) ListProtector.get(listZQ2, cutVideoListViewModel.LLILZLL)).LJFF(true);
            CutVideoContext value = videoEditViewModel.LLJJJJJIL.getValue();
            if (value != null) {
                Iterator<VideoSegment> it2 = value.getVideoSegmentList().iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    VideoSegment next = it2.next();
                    if (next.LJFF(true).equals(strLJFF)) {
                        C19764012Uk c19764012Uk = videoEditViewModel.LLJJLIIIJLLLLLLLZ;
                        if (c19764012Uk != null) {
                            C12WZ c12wz = c19764012Uk.LIZ;
                            System.currentTimeMillis();
                            c12wz.getClass();
                            C12W6 c12w6 = c19764012Uk.LIZ.LLJI;
                            if (c12w6 != null) {
                                c12w6.LLLII(next);
                            }
                        }
                        next.isDeleted = true;
                    }
                }
            }
        }
        C12WZ c12wz2 = (C12WZ) aLAdapterS11S0110000_29.l0;
        c12wz2.LLJI.LLILZ = true;
        CutVideoBottomBarViewModel cutVideoBottomBarViewModel = c12wz2.LLJJL;
        if (cutVideoBottomBarViewModel == null) {
            cutVideoBottomBarViewModel = null;
        }
        C12X5 c12x52 = c12wz2.LLJILJILJ;
        if (c12x52 != null) {
            c12x5 = c12x52;
        }
        cutVideoBottomBarViewModel.lR2(c12x5.LJIJJ().getSelectedTime());
        ((C12WZ) aLAdapterS11S0110000_29.l0).LLL = false;
    }

    public ALAdapterS11S0110000_29(Object obj, boolean z, int i) {
        this.$t = i;
        this.l0 = obj;
        this.z1 = z;
    }
}
