package Y;

import X.C13LP;
import X.C19A4;
import X.C19AP;
import X.C19ER;
import X.C1C7U;
import X.C20441214yg;
import X.C212359188n;
import X.C212360188o;
import X.C21285918Rt;
import X.C214827195l;
import X.C2188811AlT;
import X.C786410Ut5;
import X.C955080axe;
import X.ViewOnAttachStateChangeListenerC1846530y9T;
import android.content.Intent;
import android.content.IntentSender;
import android.view.View;
import android.view.ViewGroup;
import java.util.List;

/* JADX INFO: loaded from: classes33.dex */
public class ARunnableS36S0201000_32 implements Runnable {
    public final int $t;
    public int i2;
    public Object l0;
    public Object l1;

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
            case 3:
                run$3(this);
                break;
            case 4:
                run$4(this);
                break;
            case 5:
                run$5(this);
                break;
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public final void LIZ$0() {
        C212360188o c212360188o = (C212360188o) this.l0;
        C212359188n c212359188n = (C212359188n) this.l1;
        c212360188o.getClass();
        C212360188o.LJFF(c212359188n);
        C212359188n c212359188n2 = (C212359188n) this.l1;
        ViewGroup.LayoutParams layoutParams = c212359188n2.getLayoutParams();
        layoutParams.height = -2;
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c212359188n2);
        c212359188n2.setLayoutParams(layoutParams);
        ((C212359188n) this.l1).setMaximumHeight(null);
        ((C212360188o) this.l0).LJIIIIZZ(true);
        ((C212360188o) this.l0).LIZJ(this.i2);
        ((C212360188o) this.l0).LJIJI.LJJIJIIJIL$0();
    }

    public final void LIZ$1() {
        C214827195l c214827195l = (C214827195l) this.l0;
        if (c214827195l.LIZJ == null) {
            C20441214yg.LJIIIZ("LayoutGeometryComponent", "applyLayout — bootstrap re-apply skipped, component already unloaded");
            return;
        }
        if (this.i2 != c214827195l.LJIIL) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("applyLayout — bootstrap re-apply skipped, stale epoch (scheduled=");
            sbLIZ.append(this.i2);
            sbLIZ.append(" current=");
            sbLIZ.append(((C214827195l) this.l0).LJIIL);
            sbLIZ.append(')');
            C20441214yg.LJIIIZ("LayoutGeometryComponent", C2188811AlT.LIZIZ(sbLIZ));
            return;
        }
        if (c214827195l.LJI != ((View) this.l1)) {
            C20441214yg.LJIIIZ("LayoutGeometryComponent", "applyLayout — bootstrap re-apply skipped, observed parent changed");
            return;
        }
        C20441214yg.LJIIIZ("LayoutGeometryComponent", "applyLayout — bootstrap re-apply executing with latest cached layout");
        List<C955080axe> list = ((C214827195l) this.l0).LJFF;
        if (list != null) {
            ((C214827195l) this.l0).LIZ(list);
        }
    }

    public static final void run$0(ARunnableS36S0201000_32 aRunnableS36S0201000_32) {
        ((C19ER) aRunnableS36S0201000_32.l0).LIZ(aRunnableS36S0201000_32.i2, 0, new Intent().setAction("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.SEND_INTENT_EXCEPTION", (IntentSender.SendIntentException) aRunnableS36S0201000_32.l1));
    }

    public static final void run$1(ARunnableS36S0201000_32 aRunnableS36S0201000_32) {
        boolean zLIZ;
        C1C7U.LIZ("GroupSceneManager$HideOperation@16f6.executeOnFinish$1");
        try {
            C19A4.LJIIIIZZ.remove(((C19AP) aRunnableS36S0201000_32.l1).LIZ);
            C786410Ut5.LJLLLLLL(aRunnableS36S0201000_32.i2, (View) aRunnableS36S0201000_32.l0);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("GroupSceneManager$HideOperation@16f6.executeOnFinish$1");
    }

    public static final void run$2(ARunnableS36S0201000_32 aRunnableS36S0201000_32) {
        boolean zLIZ;
        C1C7U.LIZ("AIPlaygroundPromptScene@573b.loadInspirationText$1$run$$inlined$doOnPreDraw$1");
        try {
            ((C21285918Rt) aRunnableS36S0201000_32.l1).LLLLIL().LIZIZ.invoke(C13LP.LLIIII(((C21285918Rt) aRunnableS36S0201000_32.l1).LLLLLLZZ().LL.LJFF), Integer.valueOf(aRunnableS36S0201000_32.i2), ((C21285918Rt) aRunnableS36S0201000_32.l1).LLLLLZ());
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("AIPlaygroundPromptScene@573b.loadInspirationText$1$run$$inlined$doOnPreDraw$1");
    }

    public static final void run$3(ARunnableS36S0201000_32 aRunnableS36S0201000_32) {
        boolean zLIZ;
        C1C7U.LIZ("AIPlaygroundPromptScene@573b.refreshTextInspiration$1$run$$inlined$doOnPreDraw$1");
        try {
            ((C21285918Rt) aRunnableS36S0201000_32.l1).LLLLIL().LIZJ.invoke(((C21285918Rt) aRunnableS36S0201000_32.l1).LLLLLZ());
            ((C21285918Rt) aRunnableS36S0201000_32.l1).LLLLIL().LIZLLL.invoke(Integer.valueOf(aRunnableS36S0201000_32.i2));
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("AIPlaygroundPromptScene@573b.refreshTextInspiration$1$run$$inlined$doOnPreDraw$1");
    }

    public static final void run$4(ARunnableS36S0201000_32 aRunnableS36S0201000_32) {
        boolean zLIZ;
        C1C7U.LIZ("Top1CardExpandHelper@b918.expandCardAnim$1$2$onAnimationEnd$1");
        try {
            aRunnableS36S0201000_32.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("Top1CardExpandHelper@b918.expandCardAnim$1$2$onAnimationEnd$1");
    }

    public static final void run$5(ARunnableS36S0201000_32 aRunnableS36S0201000_32) {
        boolean zLIZ;
        C1C7U.LIZ("LayoutGeometryComponent@b6ef.handlePositionCommitResult$1");
        try {
            aRunnableS36S0201000_32.LIZ$1();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("LayoutGeometryComponent@b6ef.handlePositionCommitResult$1");
    }

    public ARunnableS36S0201000_32(Object obj, int i, Object obj2, int i2) {
        this.$t = i2;
        this.l0 = obj;
        this.i2 = i;
        this.l1 = obj2;
    }
}
