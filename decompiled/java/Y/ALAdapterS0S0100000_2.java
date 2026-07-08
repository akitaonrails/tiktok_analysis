package Y;

import X.C06RN;
import X.C1727906ph;
import X.C1728606po;
import X.C189200o6;
import X.C337180DJs;
import X.C786410Ut5;
import X.InterfaceC1364105Vn;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.quickinteraction.fragment.BaseQuickChatRoomFragment;
import com.ss.android.ugc.aweme.search.entry.searchbox.ui.SearchBoxSlotAssem;
import java.util.Iterator;
import kotlin.jvm.internal.AwS546S0100000_2;

/* JADX INFO: loaded from: classes3.dex */
public class ALAdapterS0S0100000_2 extends AnimatorListenerAdapter {
    public final int $t;
    public Object l0;

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
            case 2:
            case 3:
            case 4:
            default:
                super.onAnimationStart(animator);
                break;
            case 5:
                onAnimationStart$1(this, animator);
                break;
            case 6:
                onAnimationStart$2(this, animator);
                break;
        }
    }

    public ALAdapterS0S0100000_2(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onAnimationEnd$0(ALAdapterS0S0100000_2 aLAdapterS0S0100000_2, Animator animator) {
        ((C1727906ph) aLAdapterS0S0100000_2.l0).LJFF.invoke();
        C786410Ut5.U4(((C1727906ph) aLAdapterS0S0100000_2.l0).LIZJ, 1.0f);
        ((C1727906ph) aLAdapterS0S0100000_2.l0).LJI.getClass();
    }

    public static final void onAnimationEnd$1(ALAdapterS0S0100000_2 aLAdapterS0S0100000_2, Animator animator) {
        C786410Ut5.LJLLLLLL(8, (View) aLAdapterS0S0100000_2.l0);
        C786410Ut5.T4((View) aLAdapterS0S0100000_2.l0, 1.0f);
    }

    public static final void onAnimationEnd$2(ALAdapterS0S0100000_2 aLAdapterS0S0100000_2, Animator animator) {
        ((BaseQuickChatRoomFragment) aLAdapterS0S0100000_2.l0).SR();
    }

    public static final void onAnimationEnd$3(ALAdapterS0S0100000_2 aLAdapterS0S0100000_2, Animator animator) {
        InterfaceC1364105Vn interfaceC1364105Vn = (InterfaceC1364105Vn) aLAdapterS0S0100000_2.l0;
        Boolean bool = Boolean.TRUE;
        C189200o6.m2constructorimpl(bool);
        interfaceC1364105Vn.resumeWith(bool);
    }

    public static final void onAnimationEnd$4(ALAdapterS0S0100000_2 aLAdapterS0S0100000_2, Animator animator) {
        super.onAnimationEnd(animator);
        C337180DJs.LIZ(((SearchBoxSlotAssem) aLAdapterS0S0100000_2.l0).getContentView());
        C06RN c06rnHp = ((SearchBoxSlotAssem) aLAdapterS0S0100000_2.l0).hp();
        if (c06rnHp != null) {
            c06rnHp.Oa(false);
        }
    }

    public static final void onAnimationEnd$5(ALAdapterS0S0100000_2 aLAdapterS0S0100000_2, Animator animator) {
        ((C1728606po) aLAdapterS0S0100000_2.l0).LLJJIJIIJIL.getClass();
        Iterator<View> it2 = ((C1728606po) aLAdapterS0S0100000_2.l0).getElementViewList().iterator();
        while (it2.hasNext()) {
            C786410Ut5.T4(it2.next(), 1.0f);
        }
        C1728606po c1728606po = (C1728606po) aLAdapterS0S0100000_2.l0;
        c1728606po.setOnClickListenerEmptyArea(new AwS546S0100000_2(c1728606po, 1226));
    }

    public static final void onAnimationEnd$6(ALAdapterS0S0100000_2 aLAdapterS0S0100000_2, Animator animator) {
        ((C1728606po) aLAdapterS0S0100000_2.l0).LLJJIJIIJIL.getClass();
        C786410Ut5.T4(((C1728606po) aLAdapterS0S0100000_2.l0).getShadowBackground(), 1.0f);
    }

    public static final void onAnimationStart$0(ALAdapterS0S0100000_2 aLAdapterS0S0100000_2, Animator animator) {
        ((C1727906ph) aLAdapterS0S0100000_2.l0).LJI.getClass();
    }

    public static final void onAnimationStart$1(ALAdapterS0S0100000_2 aLAdapterS0S0100000_2, Animator animator) {
        ((C1728606po) aLAdapterS0S0100000_2.l0).LLJJIJIIJIL.getClass();
    }

    public static final void onAnimationStart$2(ALAdapterS0S0100000_2 aLAdapterS0S0100000_2, Animator animator) {
        ((C1728606po) aLAdapterS0S0100000_2.l0).LLJJIJIIJIL.getClass();
    }
}
