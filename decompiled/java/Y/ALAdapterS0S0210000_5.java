package Y;

import X.C13BV;
import X.C13LP;
import X.C371220Egy;
import X.InterfaceC372900Ejg;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.ss.android.ugc.gamora.editorpro.capabilities.audio.beats.logic.BeatInfo;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public class ALAdapterS0S0210000_5 extends AnimatorListenerAdapter {
    public final int $t;
    public Object l0;
    public Object l1;
    public boolean z2;

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.$t) {
            case 0:
                onAnimationEnd$0(this, animator);
                break;
            case 1:
                onAnimationEnd$1(this, animator);
                break;
            default:
                super.onAnimationEnd(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        if (1 - this.$t != 0) {
            super.onAnimationStart(animator);
        } else {
            onAnimationStart$0(this, animator);
        }
    }

    public static final void onAnimationEnd$0(ALAdapterS0S0210000_5 aLAdapterS0S0210000_5, Animator animator) {
        super.onAnimationEnd(animator);
        InterfaceC372900Ejg interfaceC372900Ejg = (InterfaceC372900Ejg) aLAdapterS0S0210000_5.l0;
        if (interfaceC372900Ejg != null) {
            interfaceC372900Ejg.LIZ(0, aLAdapterS0S0210000_5.z2);
        }
        Function0 function0 = (Function0) aLAdapterS0S0210000_5.l1;
        if (function0 != null) {
            function0.invoke();
        }
    }

    public static final void onAnimationEnd$1(ALAdapterS0S0210000_5 aLAdapterS0S0210000_5, Animator animator) {
        List<BeatInfo> listLJLLLL;
        if (aLAdapterS0S0210000_5.z2) {
            listLJLLLL = C13BV.INSTANCE;
        } else {
            List<BeatInfo> list = ((C371220Egy) aLAdapterS0S0210000_5.l0).LL;
            ArrayList arrayList = new ArrayList();
            for (BeatInfo beatInfo : list) {
                int i = beatInfo.beatSource;
                if (i == 0 || i == 2) {
                    arrayList.add(beatInfo);
                }
            }
            listLJLLLL = C13LP.LJLLLL(new AComparatorS24S0000000_5(143), arrayList);
        }
        ((C371220Egy) aLAdapterS0S0210000_5.l0).setBeats(listLJLLLL);
        C371220Egy c371220Egy = (C371220Egy) aLAdapterS0S0210000_5.l0;
        float f = C371220Egy.LLJJIJIIJIL;
        c371220Egy.LLJ = C371220Egy.LLJJIJIL;
        ((Function1) aLAdapterS0S0210000_5.l1).invoke(listLJLLLL);
        ((C371220Egy) aLAdapterS0S0210000_5.l0).LLJJIII = false;
    }

    public static final void onAnimationStart$0(ALAdapterS0S0210000_5 aLAdapterS0S0210000_5, Animator animator) {
        ((C371220Egy) aLAdapterS0S0210000_5.l0).LLJJIII = true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ALAdapterS0S0210000_5(Object obj, InterfaceC372900Ejg interfaceC372900Ejg, boolean z, Function0<Unit> function0) {
        this.$t = function0;
        this.l0 = obj;
        this.z2 = interfaceC372900Ejg;
        this.l1 = z;
    }
}
