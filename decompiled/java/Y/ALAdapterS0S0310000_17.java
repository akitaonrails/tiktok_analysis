package Y;

import X.C0IGJ;
import X.C0KVO;
import X.C1082780eHc;
import X.C1095930ecp;
import X.C1101640em2;
import X.C1101750emD;
import X.C1101820emK;
import X.C1101970emZ;
import X.C1102000emc;
import X.C1143680frq;
import X.C1295960jpS;
import X.C12ES;
import X.C500260Jjc;
import X.C784440Upu;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.bytedance.android.livesdk.shorttouch.ui.PortraitShortTouchPreviewWidget;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.ConstraintProperty;
import com.bytedance.ies.sdk.widgets.LayeredElementContext;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS261S0300000_17;

/* JADX INFO: loaded from: classes18.dex */
public class ALAdapterS0S0310000_17 extends AnimatorListenerAdapter {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public boolean z3;

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        if (this.$t != 0) {
            super.onAnimationCancel(animator);
        } else {
            onAnimationCancel$0(this, animator);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) throws Throwable {
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

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.$t) {
            case 0:
                onAnimationStart$0(this, animator);
                break;
            case 1:
                onAnimationStart$1(this, animator);
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }

    public static final void onAnimationCancel$0(ALAdapterS0S0310000_17 aLAdapterS0S0310000_17, Animator animator) {
        Room roomLJJLIIIIJ;
        C1101820emK c1101820emKLIZIZ = C1101750emD.LIZIZ(((C1101640em2) aLAdapterS0S0310000_17.l0).LIZ.Sr());
        if (c1101820emKLIZIZ != null) {
            PortraitShortTouchPreviewWidget portraitShortTouchPreviewWidget = (PortraitShortTouchPreviewWidget) aLAdapterS0S0310000_17.l1;
            C1101640em2 c1101640em2 = (C1101640em2) aLAdapterS0S0310000_17.l0;
            c1101820emKLIZIZ.LJFF = System.currentTimeMillis();
            c1101820emKLIZIZ.LJIIJJI = -1L;
            c1101820emKLIZIZ.LJIILLIIL = -1;
            DataChannel dataChannel = portraitShortTouchPreviewWidget.dataChannel;
            if (dataChannel != null) {
                roomLJJLIIIIJ = C500260Jjc.LJJLIIIIJ(dataChannel);
            } else {
                roomLJJLIIIIJ = null;
            }
            C1101750emD.LIZJ(c1101820emKLIZIZ, dataChannel, roomLJJLIIIIJ, null);
            C1101750emD.LJI(c1101640em2);
        }
        ((C1101640em2) aLAdapterS0S0310000_17.l0).LIZIZ.LJLJL();
        C1102000emc.LIZ.LJ();
    }

    public static final void onAnimationEnd$0(ALAdapterS0S0310000_17 aLAdapterS0S0310000_17, Animator animator) {
        C1101820emK c1101820emKLIZIZ = C1101750emD.LIZIZ(((C1101640em2) aLAdapterS0S0310000_17.l0).LIZ.Sr());
        if (c1101820emKLIZIZ != null) {
            c1101820emKLIZIZ.LJFF = System.currentTimeMillis();
        }
        ((C1101640em2) aLAdapterS0S0310000_17.l0).LIZIZ.LJLJL();
        if (!aLAdapterS0S0310000_17.z3) {
            ((PortraitShortTouchPreviewWidget) aLAdapterS0S0310000_17.l1).x1((C1101970emZ) aLAdapterS0S0310000_17.l2);
        } else {
            C1102000emc.LIZ.LJ();
        }
    }

    public static final void onAnimationEnd$1(ALAdapterS0S0310000_17 aLAdapterS0S0310000_17, Animator animator) throws Throwable {
        super.onAnimationEnd(animator);
        ((ConstraintProperty) aLAdapterS0S0310000_17.l1).forceHasOverlappingRenderingCompat(true);
        ((LayeredElementContext) aLAdapterS0S0310000_17.l2).getDataChannel().SX0(C1082780eHc.class, Boolean.valueOf(((C0KVO) aLAdapterS0S0310000_17.l0).LIZ));
    }

    public static final void onAnimationEnd$2(ALAdapterS0S0310000_17 aLAdapterS0S0310000_17, Animator animator) {
        super.onAnimationEnd(animator);
        C1095930ecp c1095930ecp = (C1095930ecp) aLAdapterS0S0310000_17.l0;
        boolean z = aLAdapterS0S0310000_17.z3;
        AwS261S0300000_17 awS261S0300000_17 = new AwS261S0300000_17((Function0) aLAdapterS0S0310000_17.l1, (Function0<Unit>) c1095930ecp, (C1095930ecp) aLAdapterS0S0310000_17.l2, (Function0<Unit>) 25);
        if (z) {
            c1095930ecp.LJIJ(true);
            C12ES.LJIILL(0, c1095930ecp.LIZIZ);
            C1295960jpS c1295960jpS = c1095930ecp.LIZIZ;
            if (c1295960jpS != null) {
                c1295960jpS.removeAllAnimatorListeners();
            }
            C1295960jpS c1295960jpS2 = c1095930ecp.LIZIZ;
            if (c1295960jpS2 != null) {
                c1295960jpS2.addAnimatorListener(new AAListenerS269S0200000_17(c1095930ecp, awS261S0300000_17, 13));
            }
            C1143680frq.LJIIL(c1095930ecp.LIZIZ, "tiktok_live_new_fans_club_points_claim", "live_join_fans_club_motion.zip", "", true, null, Boolean.FALSE, null);
            c1095930ecp.getClass();
            return;
        }
        C12ES.LJIILL(8, c1095930ecp.LIZIZ);
        awS261S0300000_17.invoke();
    }

    public static final void onAnimationStart$0(ALAdapterS0S0310000_17 aLAdapterS0S0310000_17, Animator animator) {
        if (aLAdapterS0S0310000_17.z3) {
            PortraitShortTouchPreviewWidget portraitShortTouchPreviewWidget = (PortraitShortTouchPreviewWidget) aLAdapterS0S0310000_17.l1;
            C1101970emZ c1101970emZ = (C1101970emZ) aLAdapterS0S0310000_17.l2;
            c1101970emZ.LIZJ = true;
            portraitShortTouchPreviewWidget.x1(c1101970emZ);
        }
    }

    public static final void onAnimationStart$1(ALAdapterS0S0310000_17 aLAdapterS0S0310000_17, Animator animator) {
        super.onAnimationStart(animator);
        C784440Upu.LIZ().LIZIZ(new C0IGJ(false));
        C784440Upu.LIZ().LIZIZ((C0KVO) aLAdapterS0S0310000_17.l0);
        if (aLAdapterS0S0310000_17.z3) {
            ((ConstraintProperty) aLAdapterS0S0310000_17.l1).translationX(0.0f);
        }
    }

    public ALAdapterS0S0310000_17(Object obj, boolean z, Object obj2, Object obj3, int i) {
        this.$t = i;
        this.l0 = obj;
        this.z3 = z;
        this.l1 = obj2;
        this.l2 = obj3;
    }
}
