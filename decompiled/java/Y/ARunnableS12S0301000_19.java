package Y;

import X.AbstractC21673719rz;
import X.C1262600ixe;
import X.C1264320j0Q;
import X.C1713570uh1;
import X.C1C7U;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes20.dex */
public class ARunnableS12S0301000_19 implements Runnable {
    public final int $t;
    public int i3;
    public Object l0;
    public Object l1;
    public Object l2;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                break;
            case 1:
                run$1(this);
                break;
            case 2:
                run$2(this);
                break;
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00f2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ$0() {
        /*
            Method dump skipped, instruction units count: 339
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.ARunnableS12S0301000_19.LIZ$0():void");
    }

    public static final void run$0(ARunnableS12S0301000_19 aRunnableS12S0301000_19) {
        boolean zLIZ;
        C1C7U.LIZ("ProfileBackgroundComponent@e625.scheduleApplyCoverOffset$1");
        try {
            aRunnableS12S0301000_19.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("ProfileBackgroundComponent@e625.scheduleApplyCoverOffset$1");
    }

    public static final void run$1(ARunnableS12S0301000_19 aRunnableS12S0301000_19) {
        boolean zLIZ;
        C1C7U.LIZ("VerifyCandidateSwitchUi@603e.performCandidateVerificationAfterHideKeyboard$switchCandidate$1");
        try {
            if (C1713570uh1.LJIIL((C1713570uh1) aRunnableS12S0301000_19.l0, aRunnableS12S0301000_19.i3)) {
                ARunnableS119S0100000_19 aRunnableS119S0100000_19 = new ARunnableS119S0100000_19((Function0) aRunnableS12S0301000_19.l2, 148);
                View view = ((Fragment) aRunnableS12S0301000_19.l1).getView();
                if (view != null) {
                    HandlerHook.viewPostDelay(view, aRunnableS119S0100000_19, 0L);
                } else {
                    aRunnableS119S0100000_19.run();
                }
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("VerifyCandidateSwitchUi@603e.performCandidateVerificationAfterHideKeyboard$switchCandidate$1");
    }

    public static final void run$2(ARunnableS12S0301000_19 aRunnableS12S0301000_19) {
        boolean zLIZ;
        C1C7U.LIZ("RelationUserCardHorizontalLayoutController@2910.attach$1$onItemRangeInserted$1");
        try {
            C1264320j0Q.LIZ.getClass();
            C1264320j0Q.LIZLLL("HLayoutController", "insert end!");
            if (aRunnableS12S0301000_19.i3 == 0) {
                ((C1262600ixe) aRunnableS12S0301000_19.l0).LJLILLLLZI(false);
            }
            ((ViewOnAttachStateChangeListenerC20604515jv) aRunnableS12S0301000_19.l1).setItemAnimator((AbstractC21673719rz) aRunnableS12S0301000_19.l2);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("RelationUserCardHorizontalLayoutController@2910.attach$1$onItemRangeInserted$1");
    }

    public ARunnableS12S0301000_19(int i, Object obj, Object obj2, Object obj3, int i2) {
        this.$t = i2;
        this.l0 = obj2;
        this.i3 = i;
        this.l1 = obj;
        this.l2 = obj3;
    }
}
