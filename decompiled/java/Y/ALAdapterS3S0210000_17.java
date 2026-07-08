package Y;

import X.AbstractC1086230eNB;
import X.C1084590eKX;
import X.C1084600eKY;
import X.C1095930ecp;
import X.C1096060ed2;
import X.C1106110etF;
import X.C1106150etJ;
import X.C1109600eys;
import X.C118300cf;
import X.C497740JfY;
import X.C786410Ut5;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.TextView;
import com.bytedance.android.live.ToolbarTipEvent;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes18.dex */
public class ALAdapterS3S0210000_17 extends AnimatorListenerAdapter {
    public final int $t;
    public Object l0;
    public Object l1;
    public boolean z2;

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        if (3 - this.$t != 0) {
            super.onAnimationCancel(animator);
        } else {
            this.z2 = true;
        }
    }

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
            case 3:
                onAnimationEnd$3(this, animator);
                break;
            case 4:
                onAnimationEnd$4(this, animator);
                break;
            default:
                super.onAnimationEnd(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.$t) {
            case 1:
                onAnimationStart$0(this, animator);
                break;
            case 2:
                onAnimationStart$1(this, animator);
                break;
            case 3:
            default:
                super.onAnimationStart(animator);
                break;
            case 4:
                onAnimationStart$2(this, animator);
                break;
        }
    }

    public static final void onAnimationEnd$0(ALAdapterS3S0210000_17 aLAdapterS3S0210000_17, Animator animator) {
        super.onAnimationEnd(animator);
        ((Function2) aLAdapterS3S0210000_17.l0).invoke((C1109600eys) aLAdapterS3S0210000_17.l1, Boolean.valueOf(aLAdapterS3S0210000_17.z2));
    }

    public static final void onAnimationEnd$1(ALAdapterS3S0210000_17 aLAdapterS3S0210000_17, Animator animator) {
        TextView textView = ((AbstractC1086230eNB) aLAdapterS3S0210000_17.l1).LLILZLL;
        if (textView != null) {
            C786410Ut5.LLIL(textView, 8);
        }
    }

    public static final void onAnimationEnd$2(ALAdapterS3S0210000_17 aLAdapterS3S0210000_17, Animator animator) {
        TextView textView = ((AbstractC1086230eNB) aLAdapterS3S0210000_17.l1).LLILZLL;
        if (textView != null) {
            C786410Ut5.LLIL(textView, 8);
        }
    }

    public static final void onAnimationEnd$3(ALAdapterS3S0210000_17 aLAdapterS3S0210000_17, Animator animator) {
        C786410Ut5.ed((View) aLAdapterS3S0210000_17.l0, 0.0f);
        C1106110etF c1106110etF = (C1106110etF) aLAdapterS3S0210000_17.l1;
        c1106110etF.LLILLJJLI = false;
        if (!aLAdapterS3S0210000_17.z2) {
            C1084590eKX c1084590eKX = c1106110etF.LLLIIIIL;
            if (c1084590eKX != null && c1106110etF.LLILZIL != null) {
                if (c1084590eKX.LIZJ) {
                    c1106110etF.LJIIL(c1084590eKX);
                    c1106110etF.LJIIJJI(c1084590eKX);
                    C1084600eKY.LJ(c1106110etF.LLILZIL.getId(), c1084590eKX);
                    c1106110etF.LLLIIIIL = null;
                    return;
                }
                DataChannel dataChannel = c1106110etF.LLJIJIL;
                if (dataChannel != null && c1106110etF.LL != null && !c1106110etF.LLLFZ) {
                    C1106150etJ c1106150etJ = new C1106150etJ();
                    c1106150etJ.LIZ = 171;
                    c1106150etJ.LIZIZ = C497740JfY.LJIJI(2131842035);
                    c1106150etJ.LIZJ = Mp4ScreenVideoLoadTimeout.CONTROL;
                    c1106150etJ.LJFF = false;
                    c1106150etJ.LJI = new AObjectS292S0200000_17(c1084590eKX, c1106110etF, 6);
                    c1106150etJ.LJII = new AObjectS392S0100000_17(c1106110etF, 37);
                    c1106150etJ.LJIIIIZZ = new AObjectS360S0100000_17(c1106110etF, 151);
                    dataChannel.LC0(ToolbarTipEvent.class, c1106150etJ.LIZ());
                    return;
                }
                c1106110etF.LLLIIIIL = null;
                return;
            }
            c1106110etF.LLLIIIIL = null;
        }
    }

    public static final void onAnimationEnd$4(ALAdapterS3S0210000_17 aLAdapterS3S0210000_17, Animator animator) {
        ViewGroup viewGroup;
        super.onAnimationEnd(animator);
        C1095930ecp c1095930ecp = (C1095930ecp) aLAdapterS3S0210000_17.l1;
        c1095930ecp.getClass();
        C1096060ed2.LIZ(c1095930ecp.LJFF, false);
        C1096060ed2.LIZ(c1095930ecp.LJI, false);
        C1096060ed2.LIZ(c1095930ecp.LJII, false);
        C1096060ed2.LIZ(c1095930ecp.LJIIIIZZ, false);
        ViewGroup viewGroup2 = ((C1095930ecp) aLAdapterS3S0210000_17.l1).LJ;
        ViewParent parent = null;
        if (viewGroup2 != null) {
            parent = viewGroup2.getParent();
        }
        if ((parent instanceof ViewGroup) && (viewGroup = (ViewGroup) parent) != null) {
            viewGroup.setClipChildren(aLAdapterS3S0210000_17.z2);
        }
    }

    public static final void onAnimationStart$0(ALAdapterS3S0210000_17 aLAdapterS3S0210000_17, Animator animator) {
        TextView textView;
        int i = ((C118300cf) aLAdapterS3S0210000_17.l0).element;
        if (i > 0 && (textView = ((AbstractC1086230eNB) aLAdapterS3S0210000_17.l1).LLIZ) != null) {
            textView.setMinWidth(i);
        }
        TextView textView2 = ((AbstractC1086230eNB) aLAdapterS3S0210000_17.l1).LLIZ;
        if (textView2 != null) {
            C786410Ut5.LLIL(textView2, 0);
        }
        if (aLAdapterS3S0210000_17.z2) {
            ((AbstractC1086230eNB) aLAdapterS3S0210000_17.l1).LIZIZ(0L);
        }
    }

    public static final void onAnimationStart$1(ALAdapterS3S0210000_17 aLAdapterS3S0210000_17, Animator animator) {
        TextView textView;
        int i = ((C118300cf) aLAdapterS3S0210000_17.l0).element;
        if (i > 0 && (textView = ((AbstractC1086230eNB) aLAdapterS3S0210000_17.l1).LLIZ) != null) {
            textView.setMinWidth(i);
        }
        TextView textView2 = ((AbstractC1086230eNB) aLAdapterS3S0210000_17.l1).LLIZ;
        if (textView2 != null) {
            C786410Ut5.LLIL(textView2, 0);
        }
        if (aLAdapterS3S0210000_17.z2) {
            ((AbstractC1086230eNB) aLAdapterS3S0210000_17.l1).LIZIZ(0L);
        }
    }

    public static final void onAnimationStart$2(ALAdapterS3S0210000_17 aLAdapterS3S0210000_17, Animator animator) {
        super.onAnimationStart(animator);
        ((Function0) aLAdapterS3S0210000_17.l0).invoke();
    }

    public ALAdapterS3S0210000_17(C1106110etF c1106110etF, View view, int i) {
        this.$t = i;
        this.l1 = c1106110etF;
        this.l0 = view;
    }

    public ALAdapterS3S0210000_17(Object obj, Object obj2, boolean z, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
        this.z2 = z;
    }
}
