package Y;

import X.C06HD;
import X.C06MJ;
import X.C1383370m6R;
import X.C418440Gaw;
import X.C814420VxA;
import X.RunnableC1590106Kl;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.ss.android.ugc.aweme.im.streak.impl.pet.assem.StreakPetWidgetAssem;
import kotlin.jvm.internal.AwS17S0001000_2;

/* JADX INFO: loaded from: classes3.dex */
public class ALAdapterS0S0101000_2 extends AnimatorListenerAdapter {
    public final int $t;
    public int i1;
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
            default:
                super.onAnimationEnd(animator);
                break;
        }
    }

    public static final void onAnimationEnd$0(ALAdapterS0S0101000_2 aLAdapterS0S0101000_2, Animator animator) {
        boolean z;
        C06HD c06hdIp = ((StreakPetWidgetAssem) aLAdapterS0S0101000_2.l0).ip();
        if (c06hdIp != null) {
            if (aLAdapterS0S0101000_2.i1 == C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(((StreakPetWidgetAssem) aLAdapterS0S0101000_2.l0).LLJJIII.left)))) {
                z = true;
            } else {
                z = false;
            }
            c06hdIp.LJFF(true, z);
        }
    }

    public static final void onAnimationEnd$1(ALAdapterS0S0101000_2 aLAdapterS0S0101000_2, Animator animator) {
        C06MJ c06mj = ((StreakPetWidgetAssem) aLAdapterS0S0101000_2.l0).LLJJJIL;
        if (c06mj != null) {
            C1383370m6R.LIZIZ(c06mj, new AwS17S0001000_2(aLAdapterS0S0101000_2.i1, 5));
        }
        StreakPetWidgetAssem streakPetWidgetAssem = (StreakPetWidgetAssem) aLAdapterS0S0101000_2.l0;
        C06MJ c06mj2 = streakPetWidgetAssem.LLJJJIL;
        if (c06mj2 != null) {
            HandlerHook.viewPost(c06mj2, new RunnableC1590106Kl(streakPetWidgetAssem));
        }
    }

    public static final void onAnimationEnd$2(ALAdapterS0S0101000_2 aLAdapterS0S0101000_2, Animator animator) {
        C06MJ c06mj = ((StreakPetWidgetAssem) aLAdapterS0S0101000_2.l0).LLJJJIL;
        if (c06mj != null) {
            C1383370m6R.LIZIZ(c06mj, new AwS17S0001000_2(aLAdapterS0S0101000_2.i1, 7));
        }
        StreakPetWidgetAssem streakPetWidgetAssem = (StreakPetWidgetAssem) aLAdapterS0S0101000_2.l0;
        C06MJ c06mj2 = streakPetWidgetAssem.LLJJJIL;
        if (c06mj2 != null) {
            HandlerHook.viewPost(c06mj2, new RunnableC1590106Kl(streakPetWidgetAssem));
        }
    }

    public ALAdapterS0S0101000_2(StreakPetWidgetAssem streakPetWidgetAssem, int i, int i2) {
        this.$t = i2;
        this.l0 = streakPetWidgetAssem;
        this.i1 = i;
    }
}
