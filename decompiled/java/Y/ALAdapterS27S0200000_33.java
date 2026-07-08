package Y;

import X.C1099610eil;
import X.C19WE;
import X.C1AHV;
import X.C21570319bJ;
import X.C21572519bf;
import X.C21574419by;
import X.C21649019o0;
import X.C2183101AcG;
import X.C2183111AcH;
import X.EnumC2174841A9q;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.bytedance.android.live.base.model.ImageModel;
import com.ss.android.ugc.aweme.feed.assem.relationbtn.VideoRelationBtnAssemV2;
import com.ss.android.ugc.aweme.feed.assem.relationbtn.VideoRelationBtnVMV2;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.tts.oecverify.BdTuring;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes34.dex */
public class ALAdapterS27S0200000_33 extends AnimatorListenerAdapter {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        switch (this.$t) {
            case 7:
                onAnimationCancel$0(this, animator);
                break;
            case 8:
                onAnimationCancel$1(this, animator);
                break;
            default:
                super.onAnimationCancel(animator);
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
            case 4:
                onAnimationEnd$4(this, animator);
                break;
            case 5:
                onAnimationEnd$5(this, animator);
                break;
            case 6:
                onAnimationEnd$6(this, animator);
                break;
            case 7:
                onAnimationEnd$7(this, animator);
                break;
            case 8:
                onAnimationEnd$8(this, animator);
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                onAnimationEnd$9(this, animator);
                break;
            default:
                super.onAnimationEnd(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        if (8 - this.$t != 0) {
            super.onAnimationStart(animator);
        } else {
            onAnimationStart$0(this, animator);
        }
    }

    public static final void onAnimationCancel$0(ALAdapterS27S0200000_33 aLAdapterS27S0200000_33, Animator animator) {
        ((C21649019o0) aLAdapterS27S0200000_33.l1).LLJJJJ.removeAllUpdateListeners();
        ((C21649019o0) aLAdapterS27S0200000_33.l1).LLJJJJ.removeAllListeners();
        Runnable runnable = (Runnable) aLAdapterS27S0200000_33.l0;
        if (runnable != null) {
            runnable.run();
        }
    }

    public static final void onAnimationCancel$1(ALAdapterS27S0200000_33 aLAdapterS27S0200000_33, Animator animator) {
        ((C19WE) aLAdapterS27S0200000_33.l0).LIZJ();
    }

    public static final void onAnimationEnd$0(ALAdapterS27S0200000_33 aLAdapterS27S0200000_33, Animator animator) {
        super.onAnimationEnd(animator);
        VideoRelationBtnVMV2 videoRelationBtnVMV2Ip = ((VideoRelationBtnAssemV2) aLAdapterS27S0200000_33.l0).Ip();
        Aweme aweme = (Aweme) aLAdapterS27S0200000_33.l1;
        videoRelationBtnVMV2Ip.getClass();
        videoRelationBtnVMV2Ip.wQ2(aweme, EnumC2174841A9q.HIDDEN);
    }

    public static final void onAnimationEnd$1(ALAdapterS27S0200000_33 aLAdapterS27S0200000_33, Animator animator) {
        super.onAnimationEnd(animator);
        ((C21574419by) aLAdapterS27S0200000_33.l0).LLJJIJIIJIL = null;
        ((Function0) aLAdapterS27S0200000_33.l1).invoke();
    }

    public static final void onAnimationEnd$2(ALAdapterS27S0200000_33 aLAdapterS27S0200000_33, Animator animator) {
        super.onAnimationEnd(animator);
        ((C21574419by) aLAdapterS27S0200000_33.l0).LLJJIJIIJIL = null;
        ((Function0) aLAdapterS27S0200000_33.l1).invoke();
    }

    public static final void onAnimationEnd$3(ALAdapterS27S0200000_33 aLAdapterS27S0200000_33, Animator animator) {
        super.onAnimationEnd(animator);
        ((C21570319bJ) aLAdapterS27S0200000_33.l1).LLJJJIL = null;
        ((Function0) aLAdapterS27S0200000_33.l0).invoke();
    }

    public static final void onAnimationEnd$4(ALAdapterS27S0200000_33 aLAdapterS27S0200000_33, Animator animator) {
        super.onAnimationEnd(animator);
        ((C21572519bf) aLAdapterS27S0200000_33.l0).LLJJJIL = null;
        ((Function0) aLAdapterS27S0200000_33.l1).invoke();
    }

    public static final void onAnimationEnd$5(ALAdapterS27S0200000_33 aLAdapterS27S0200000_33, Animator animator) {
        super.onAnimationEnd(animator);
        ((C21572519bf) aLAdapterS27S0200000_33.l0).LLJJJIL = null;
        ((Function0) aLAdapterS27S0200000_33.l1).invoke();
    }

    public static final void onAnimationEnd$6(ALAdapterS27S0200000_33 aLAdapterS27S0200000_33, Animator animator) {
        ((C1AHV) aLAdapterS27S0200000_33.l0).LLJILLL = null;
        ((Function0) aLAdapterS27S0200000_33.l1).invoke();
    }

    public static final void onAnimationEnd$7(ALAdapterS27S0200000_33 aLAdapterS27S0200000_33, Animator animator) {
        ((C21649019o0) aLAdapterS27S0200000_33.l1).LLJJJJ.removeAllUpdateListeners();
        ((C21649019o0) aLAdapterS27S0200000_33.l1).LLJJJJ.removeAllListeners();
        Runnable runnable = (Runnable) aLAdapterS27S0200000_33.l0;
        if (runnable != null) {
            runnable.run();
        }
    }

    public static final void onAnimationEnd$8(ALAdapterS27S0200000_33 aLAdapterS27S0200000_33, Animator animator) {
        ((C19WE) aLAdapterS27S0200000_33.l0).LIZ();
    }

    public static final void onAnimationEnd$9(ALAdapterS27S0200000_33 aLAdapterS27S0200000_33, Animator animator) {
        List<ImageModel> listLIZ = C2183111AcH.LJIILIIL.LIZ(((C2183111AcH) aLAdapterS27S0200000_33.l0).LIZJ);
        if (listLIZ != null && listLIZ.size() >= 5) {
            C1099610eil c1099610eil = (C1099610eil) aLAdapterS27S0200000_33.l1;
            int iIntValue = C2183111AcH.LJIIL.LIZ(((C2183111AcH) aLAdapterS27S0200000_33.l0).LIZJ).intValue() + 1;
            C2183111AcH c2183111AcH = (C2183111AcH) aLAdapterS27S0200000_33.l0;
            C2183101AcG.LIZIZ(c1099610eil, iIntValue, c2183111AcH.LIZJ, c2183111AcH.LIZLLL);
        }
    }

    public static final void onAnimationStart$0(ALAdapterS27S0200000_33 aLAdapterS27S0200000_33, Animator animator) {
        ((C19WE) aLAdapterS27S0200000_33.l0).LIZIZ();
    }

    public ALAdapterS27S0200000_33(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
