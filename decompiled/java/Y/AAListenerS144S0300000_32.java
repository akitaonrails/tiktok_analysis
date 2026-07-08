package Y;

import X.AbstractC21333318eB;
import X.C1547350qMv;
import X.C18YN;
import X.C2097908Jt;
import X.C21334118eJ;
import X.C21390118nL;
import X.C786410Ut5;
import X.InterfaceC1547330qMt;
import X.InterfaceC21389118nB;
import X.RunnableC514801zW;
import android.animation.Animator;
import android.view.View;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes33.dex */
public class AAListenerS144S0300000_32 implements Animator.AnimatorListener {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

    public static final void onAnimationCancel$0(AAListenerS144S0300000_32 aAListenerS144S0300000_32, Animator animator) {
    }

    public static final void onAnimationCancel$1(AAListenerS144S0300000_32 aAListenerS144S0300000_32, Animator animator) {
    }

    public static final void onAnimationCancel$2(AAListenerS144S0300000_32 aAListenerS144S0300000_32, Animator animator) {
    }

    public static final void onAnimationRepeat$0(AAListenerS144S0300000_32 aAListenerS144S0300000_32, Animator animator) {
    }

    public static final void onAnimationRepeat$1(AAListenerS144S0300000_32 aAListenerS144S0300000_32, Animator animator) {
    }

    public static final void onAnimationRepeat$2(AAListenerS144S0300000_32 aAListenerS144S0300000_32, Animator animator) {
    }

    public static final void onAnimationStart$0(AAListenerS144S0300000_32 aAListenerS144S0300000_32, Animator animator) {
    }

    public static final void onAnimationStart$2(AAListenerS144S0300000_32 aAListenerS144S0300000_32, Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        switch (this.$t) {
            case 0:
                onAnimationCancel$0(this, animator);
                break;
            case 1:
                onAnimationCancel$1(this, animator);
                break;
            case 2:
                onAnimationCancel$2(this, animator);
                break;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
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
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
        switch (this.$t) {
            case 0:
                onAnimationRepeat$0(this, animator);
                break;
            case 1:
                onAnimationRepeat$1(this, animator);
                break;
            case 2:
                onAnimationRepeat$2(this, animator);
                break;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.$t) {
            case 0:
                onAnimationStart$0(this, animator);
                break;
            case 1:
                onAnimationStart$1(this, animator);
                break;
            case 2:
                onAnimationStart$2(this, animator);
                break;
        }
    }

    public static final void onAnimationEnd$0(AAListenerS144S0300000_32 aAListenerS144S0300000_32, Animator animator) {
        C21390118nL c21390118nL = (C21390118nL) aAListenerS144S0300000_32.l0;
        HandlerHook.viewPost(c21390118nL, new ARunnableS65S0300000_32(c21390118nL, (InterfaceC21389118nB) aAListenerS144S0300000_32.l1, (View) aAListenerS144S0300000_32.l2, 14));
    }

    public static final void onAnimationEnd$1(AAListenerS144S0300000_32 aAListenerS144S0300000_32, Animator animator) {
        Object obj;
        InterfaceC1547330qMt interfaceC1547330qMtLIZ;
        ((C21334118eJ) aAListenerS144S0300000_32.l0).LIZJ.remove(((Map.Entry) aAListenerS144S0300000_32.l1).getKey());
        if (((C21334118eJ) aAListenerS144S0300000_32.l0).LIZJ.isEmpty()) {
            C21334118eJ c21334118eJ = (C21334118eJ) aAListenerS144S0300000_32.l0;
            if (c21334118eJ.LIZ.getView().getLayerType() != c21334118eJ.LIZIZ) {
                c21334118eJ.LIZ.getView().setLayerType(c21334118eJ.LIZIZ, null);
            }
        }
        Map<String, ? extends Object> map = ((C21334118eJ) aAListenerS144S0300000_32.l0).LIZ.LLLLL;
        if (map != null && (obj = map.get("bind_transition_end")) != null && (interfaceC1547330qMtLIZ = C1547350qMv.LIZ(obj)) != null) {
            AbstractC21333318eB<?> abstractC21333318eB = ((C21334118eJ) aAListenerS144S0300000_32.l0).LIZ;
            abstractC21333318eB.LL.LJ(interfaceC1547330qMtLIZ, abstractC21333318eB.getView(), abstractC21333318eB.LIZJ(), C2097908Jt.LIZJ(new Pair("transition_property", ((Map.Entry) aAListenerS144S0300000_32.l1).getKey())));
        }
    }

    public static final void onAnimationEnd$2(AAListenerS144S0300000_32 aAListenerS144S0300000_32, Animator animator) {
        View view = (View) aAListenerS144S0300000_32.l0;
        if (view != null) {
            view.setClipToOutline(false);
        }
        View view2 = (View) aAListenerS144S0300000_32.l0;
        if (view2 != null) {
            C786410Ut5.LJLLLLLL(0, view2);
        }
        C18YN c18yn = (C18YN) aAListenerS144S0300000_32.l1;
        c18yn.LLJJI = null;
        c18yn.LLJJIII = null;
        c18yn.LLJILLL = null;
        HandlerHook.viewPost(c18yn.getClonedViewContainer(), new RunnableC514801zW((Function0) aAListenerS144S0300000_32.l2, (Function0<Unit>) 193));
    }

    public static final void onAnimationStart$1(AAListenerS144S0300000_32 aAListenerS144S0300000_32, Animator animator) {
        Object obj;
        InterfaceC1547330qMt interfaceC1547330qMtLIZ;
        Map<String, ? extends Object> map = ((C21334118eJ) aAListenerS144S0300000_32.l0).LIZ.LLLLL;
        if (map != null && (obj = map.get("bind_transition_start")) != null && (interfaceC1547330qMtLIZ = C1547350qMv.LIZ(obj)) != null) {
            AbstractC21333318eB<?> abstractC21333318eB = ((C21334118eJ) aAListenerS144S0300000_32.l0).LIZ;
            abstractC21333318eB.LL.LJ(interfaceC1547330qMtLIZ, abstractC21333318eB.getView(), abstractC21333318eB.LIZJ(), C2097908Jt.LIZJ(new Pair("transition_property", ((Map.Entry) aAListenerS144S0300000_32.l2).getKey())));
        }
    }

    public AAListenerS144S0300000_32(Object obj, Object obj2, Object obj3, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
        this.l2 = obj3;
    }
}
