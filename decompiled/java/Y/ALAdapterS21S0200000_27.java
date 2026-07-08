package Y;

import X.C1295960jpS;
import X.C1819070xRB;
import X.C1836680xta;
import X.C1849990yF3;
import X.C427330GpH;
import X.C786410Ut5;
import X.C915980Zwa;
import X.EnumC1802220x00;
import X.InterfaceC1844900y6q;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.android.live.liveinteract.api.MultiCoHostFollowGuideEvent;
import com.bytedance.android.live.liveinteract.multihost.biz.view.InteractionGuideLayout;
import com.bytedance.android.live.rank.impl.page.ui.cell.CreatorRankingRankCell;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.tux.input.TuxTextView;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes28.dex */
public class ALAdapterS21S0200000_27 extends AnimatorListenerAdapter {
    public final int $t;
    public Object l0;
    public Object l1;

    public static final void onAnimationCancel$0(ALAdapterS21S0200000_27 aLAdapterS21S0200000_27, Animator animator) {
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        switch (this.$t) {
            case 0:
                onAnimationCancel$0(this, animator);
                break;
            case 1:
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
            default:
                super.onAnimationEnd(animator);
                break;
            case 5:
                onAnimationEnd$4(this, animator);
                break;
            case 6:
                onAnimationEnd$5(this, animator);
                break;
            case 7:
                onAnimationEnd$6(this, animator);
                break;
            case 8:
                onAnimationEnd$7(this, animator);
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
            case 3:
            default:
                super.onAnimationStart(animator);
                break;
            case 4:
                onAnimationStart$1(this, animator);
                break;
            case 5:
                onAnimationStart$2(this, animator);
                break;
        }
    }

    public static final void onAnimationCancel$1(ALAdapterS21S0200000_27 aLAdapterS21S0200000_27, Animator animator) {
        if (!Intrinsics.LJFF(((C1819070xRB) aLAdapterS21S0200000_27.l0).LLIZ, animator)) {
            return;
        }
        C1819070xRB c1819070xRB = (C1819070xRB) aLAdapterS21S0200000_27.l0;
        c1819070xRB.LLIZ = null;
        c1819070xRB.LLILZIL = null;
        c1819070xRB.LLILZ = EnumC1802220x00.LL;
        c1819070xRB.LIZ();
    }

    public static final void onAnimationEnd$0(ALAdapterS21S0200000_27 aLAdapterS21S0200000_27, Animator animator) {
        if (!Intrinsics.LJFF(((C1836680xta) aLAdapterS21S0200000_27.l0).LL, animator)) {
            return;
        }
        ((C1836680xta) aLAdapterS21S0200000_27.l0).LL = null;
        ((Function0) aLAdapterS21S0200000_27.l1).invoke();
    }

    public static final void onAnimationEnd$1(ALAdapterS21S0200000_27 aLAdapterS21S0200000_27, Animator animator) {
        if (!Intrinsics.LJFF(((C1819070xRB) aLAdapterS21S0200000_27.l0).LLIZ, animator)) {
            return;
        }
        C1819070xRB c1819070xRB = (C1819070xRB) aLAdapterS21S0200000_27.l0;
        c1819070xRB.LLIZ = null;
        c1819070xRB.LLILLL = 1.0f;
        c1819070xRB.LLILZIL = null;
        c1819070xRB.LLILZ = EnumC1802220x00.LL;
        c1819070xRB.LJIIJ();
    }

    public static final void onAnimationEnd$2(ALAdapterS21S0200000_27 aLAdapterS21S0200000_27, Animator animator) {
        ((C1295960jpS) aLAdapterS21S0200000_27.l0).removeAnimatorListener(aLAdapterS21S0200000_27);
        ((Function0) aLAdapterS21S0200000_27.l1).invoke();
    }

    public static final void onAnimationEnd$3(ALAdapterS21S0200000_27 aLAdapterS21S0200000_27, Animator animator) {
        ((C1295960jpS) aLAdapterS21S0200000_27.l0).removeAnimatorListener(aLAdapterS21S0200000_27);
        ((Function0) aLAdapterS21S0200000_27.l1).invoke();
    }

    public static final void onAnimationEnd$4(ALAdapterS21S0200000_27 aLAdapterS21S0200000_27, Animator animator) {
        super.onAnimationEnd(animator);
        ConstraintLayout constraintLayout = ((InteractionGuideLayout) aLAdapterS21S0200000_27.l1).LLJJJ;
        DataChannel dataChannel = null;
        if (constraintLayout == null) {
            constraintLayout = null;
        }
        C786410Ut5.LL(8, constraintLayout);
        DataChannel dataChannel2 = ((InteractionGuideLayout) aLAdapterS21S0200000_27.l1).LLJL;
        if (dataChannel2 != null) {
            dataChannel = dataChannel2;
        }
        dataChannel.LC0(MultiCoHostFollowGuideEvent.class, Boolean.FALSE);
    }

    public static final void onAnimationEnd$5(ALAdapterS21S0200000_27 aLAdapterS21S0200000_27, Animator animator) {
        super.onAnimationEnd(animator);
        C427330GpH c427330GpH = ((InteractionGuideLayout) aLAdapterS21S0200000_27.l0).LLJJJJ;
        if (c427330GpH == null) {
            c427330GpH = null;
        }
        c427330GpH.LJJJJIZL();
        if (C915980Zwa.LJFF().co0()) {
            C786410Ut5.Pd((ObjectAnimator) aLAdapterS21S0200000_27.l1);
        }
    }

    public static final void onAnimationEnd$6(ALAdapterS21S0200000_27 aLAdapterS21S0200000_27, Animator animator) {
        if (!((C1849990yF3) aLAdapterS21S0200000_27.l0).LIZJ) {
            ((Function0) aLAdapterS21S0200000_27.l1).invoke();
        }
    }

    public static final void onAnimationEnd$7(ALAdapterS21S0200000_27 aLAdapterS21S0200000_27, Animator animator) {
        C786410Ut5.B5((TuxTextView) aLAdapterS21S0200000_27.l0, 1.0f);
        C786410Ut5.ic((TuxTextView) aLAdapterS21S0200000_27.l0, 1.0f);
        C786410Ut5.Dc((TuxTextView) aLAdapterS21S0200000_27.l0, 1.0f);
        ((TuxTextView) aLAdapterS21S0200000_27.l0).setTextColor(((CreatorRankingRankCell) aLAdapterS21S0200000_27.l1).V5());
    }

    public static final void onAnimationStart$0(ALAdapterS21S0200000_27 aLAdapterS21S0200000_27, Animator animator) {
        if (!Intrinsics.LJFF(((C1819070xRB) aLAdapterS21S0200000_27.l0).LLIZ, animator)) {
            return;
        }
        C786410Ut5.Z1(((C1819070xRB) aLAdapterS21S0200000_27.l0).LLJILJIL, 0);
        ((C1819070xRB) aLAdapterS21S0200000_27.l0).LIZ();
        Function0 function0 = (Function0) aLAdapterS21S0200000_27.l1;
        if (function0 != null) {
            function0.invoke();
        }
    }

    public static final void onAnimationStart$1(ALAdapterS21S0200000_27 aLAdapterS21S0200000_27, Animator animator) {
        super.onAnimationStart(animator);
        ((InterfaceC1844900y6q) aLAdapterS21S0200000_27.l0).LIZLLL();
        if (C915980Zwa.LJFF().co0()) {
            C786410Ut5.Pd((ObjectAnimator) aLAdapterS21S0200000_27.l1);
        }
    }

    public static final void onAnimationStart$2(ALAdapterS21S0200000_27 aLAdapterS21S0200000_27, Animator animator) {
        super.onAnimationStart(animator);
        if (C915980Zwa.LJFF().co0()) {
            C786410Ut5.Pd((ObjectAnimator) aLAdapterS21S0200000_27.l0);
        }
        ((InteractionGuideLayout) aLAdapterS21S0200000_27.l1).ip(8);
        ConstraintLayout constraintLayout = ((InteractionGuideLayout) aLAdapterS21S0200000_27.l1).LLJJJ;
        if (constraintLayout == null) {
            constraintLayout = null;
        }
        C786410Ut5.LL(0, constraintLayout);
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public ALAdapterS21S0200000_27(android.animation.ObjectAnimator r2, com.bytedance.android.live.liveinteract.multihost.biz.view.InteractionGuideLayout r3, int r4) {
        /*
            r1 = this;
            r1.$t = r4
            int r4 = 5 - r4
            if (r4 == 0) goto Lf
            r0 = r1
            r0.l0 = r3
            r0.l1 = r2
        Lb:
            r0.<init>()
            return
        Lf:
            r0 = r1
            r0.l0 = r2
            r0.l1 = r3
            goto Lb
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.ALAdapterS21S0200000_27.<init>(android.animation.ObjectAnimator, com.bytedance.android.live.liveinteract.multihost.biz.view.InteractionGuideLayout, int):void");
    }

    public ALAdapterS21S0200000_27(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
