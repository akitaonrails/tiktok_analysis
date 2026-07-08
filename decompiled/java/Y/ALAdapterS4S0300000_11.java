package Y;

import X.C013C;
import X.C0SS4;
import X.C1331070kk5;
import X.C197039127h;
import X.C21415018rM;
import X.C705240RlS;
import X.C705270RlV;
import X.C786410Ut5;
import X.InterfaceC1320380kSq;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import com.ss.android.ugc.aweme.ad.feed.AdDescAreaReplaceServiceImpl;
import com.ss.android.ugc.aweme.ui.feed.subphoto.holders.SmartImagePhotoViewHolderV2;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import u4.q0;

/* JADX INFO: loaded from: classes12.dex */
public class ALAdapterS4S0300000_11 extends AnimatorListenerAdapter {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        switch (this.$t) {
            case 0:
                onAnimationCancel$0(this, animator);
                break;
            case 1:
            default:
                super.onAnimationCancel(animator);
                break;
            case 2:
                onAnimationCancel$1(this, animator);
                break;
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
            default:
                super.onAnimationEnd(animator);
                break;
        }
    }

    public static final void onAnimationCancel$0(ALAdapterS4S0300000_11 aLAdapterS4S0300000_11, Animator animator) {
        SmartImagePhotoViewHolderV2 smartImagePhotoViewHolderV2 = (SmartImagePhotoViewHolderV2) aLAdapterS4S0300000_11.l2;
        if (smartImagePhotoViewHolderV2.LLLILZLLLI == animator) {
            smartImagePhotoViewHolderV2.LLLILZLLLI = null;
        }
    }

    public static final void onAnimationCancel$1(ALAdapterS4S0300000_11 aLAdapterS4S0300000_11, Animator animator) {
        ((C013C) aLAdapterS4S0300000_11.l0).element = true;
        C0SS4 c0ss4 = (C0SS4) aLAdapterS4S0300000_11.l1;
        q0.LJJIII(0, c0ss4.LIZ);
        q0.LJJIII(1, c0ss4.LIZ);
    }

    public static final void onAnimationEnd$0(ALAdapterS4S0300000_11 aLAdapterS4S0300000_11, Animator animator) {
        ((C1331070kk5) aLAdapterS4S0300000_11.l0).LJIIZILJ((InterfaceC1320380kSq) aLAdapterS4S0300000_11.l1);
        SmartImagePhotoViewHolderV2 smartImagePhotoViewHolderV2 = (SmartImagePhotoViewHolderV2) aLAdapterS4S0300000_11.l2;
        if (smartImagePhotoViewHolderV2.LLLILZLLLI == animator) {
            smartImagePhotoViewHolderV2.LLLILZLLLI = null;
        }
    }

    public static final void onAnimationEnd$1(ALAdapterS4S0300000_11 aLAdapterS4S0300000_11, Animator animator) {
        ((AdDescAreaReplaceServiceImpl) aLAdapterS4S0300000_11.l0).LIZ = true;
        ((Function0) aLAdapterS4S0300000_11.l1).invoke();
        AdDescAreaReplaceServiceImpl adDescAreaReplaceServiceImpl = (AdDescAreaReplaceServiceImpl) aLAdapterS4S0300000_11.l0;
        adDescAreaReplaceServiceImpl.LJFF(adDescAreaReplaceServiceImpl.LJ, false);
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat((C21415018rM) aLAdapterS4S0300000_11.l2, "alpha", 0.0f, 1.0f);
        objectAnimatorOfFloat.setDuration(200L);
        C786410Ut5.Pd(objectAnimatorOfFloat);
    }

    public static final void onAnimationEnd$2(ALAdapterS4S0300000_11 aLAdapterS4S0300000_11, Animator animator) {
        Function0 function0;
        C0SS4 c0ss4 = (C0SS4) aLAdapterS4S0300000_11.l1;
        c0ss4.LIZJ = null;
        q0.LJJIII(0, c0ss4.LIZ);
        q0.LJJIII(1, c0ss4.LIZ);
        if (!((C013C) aLAdapterS4S0300000_11.l0).element && (function0 = (Function0) aLAdapterS4S0300000_11.l2) != null) {
            function0.invoke();
        }
    }

    public static final void onAnimationEnd$3(ALAdapterS4S0300000_11 aLAdapterS4S0300000_11, Animator animator) {
        ((C705240RlS) aLAdapterS4S0300000_11.l0).LJIJJLI((C197039127h) aLAdapterS4S0300000_11.l1, (C705270RlV) aLAdapterS4S0300000_11.l2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ALAdapterS4S0300000_11(Object obj, AdDescAreaReplaceServiceImpl adDescAreaReplaceServiceImpl, Function0<Unit> function0, C21415018rM c21415018rM) {
        this.$t = c21415018rM;
        this.l0 = obj;
        this.l1 = adDescAreaReplaceServiceImpl;
        this.l2 = function0;
    }
}
