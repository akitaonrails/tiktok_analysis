package X;

import Y.AUListenerS266S0100000_17;
import com.bytedance.android.livesdk.livesetting.publicscreen.LiveGiftTrayPublicScreenTranslateSetting;
import com.bytedance.ies.sdk.widgets.ConstraintProperty;

/* JADX INFO: renamed from: X.0eHO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1082640eHO extends AbstractC1082670eHR {
    public final AbstractC1080560eE2 LLILZ;
    public boolean LLILZIL;

    public final void LIZJ() {
        if (this.LLILZIL) {
            this.LLILZIL = false;
            LIZ().cancel();
            LIZ().removeAllUpdateListeners();
            LIZ().removeAllListeners();
            LIZ().setFloatValues(0.0f, 1.0f);
            LIZ().addUpdateListener(new AUListenerS266S0100000_17(this, 129));
            LIZ().start();
            this.LLILZ.getDataChannel().SX0(C753980Ths.class, Boolean.FALSE);
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.ElementSpecImpl, com.bytedance.ies.sdk.widgets.ElementSpec
    public final void onDispose() {
        super.onDispose();
        LIZ().cancel();
        ConstraintProperty constraintPropertyLIZIZ = LIZIZ();
        if (constraintPropertyLIZIZ != null) {
            constraintPropertyLIZIZ.alpha(1.0f);
        }
    }

    public C1082640eHO(AbstractC1080560eE2 abstractC1080560eE2) {
        super(C1079590eCT.LJ, abstractC1080560eE2);
        this.LLILZ = abstractC1080560eE2;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(C1082760eHa c1082760eHa) {
        C1082760eHa c1082760eHa2 = c1082760eHa;
        LiveGiftTrayPublicScreenTranslateSetting liveGiftTrayPublicScreenTranslateSetting = LiveGiftTrayPublicScreenTranslateSetting.INSTANCE;
        if (liveGiftTrayPublicScreenTranslateSetting.canCommonWidgetsAlphaXfer(c1082760eHa2.LIZ.LIZLLL)) {
            if (c1082760eHa2.LIZ.LIZ) {
                if (!this.LLILZIL) {
                    this.LLILZIL = true;
                    LIZ().cancel();
                    LIZ().removeAllUpdateListeners();
                    LIZ().removeAllListeners();
                    LIZ().setFloatValues(1.0f, 0.0f);
                    LIZ().addUpdateListener(new AUListenerS266S0100000_17(this, 130));
                    LIZ().start();
                    this.LLILZ.getDataChannel().SX0(C753980Ths.class, Boolean.TRUE);
                    return;
                }
                return;
            }
            if (!this.LLILZIL) {
                return;
            }
            C770910ULx c770910ULx = c1082760eHa2.LIZIZ;
            if (c770910ULx == null) {
                LIZJ();
            } else {
                if (liveGiftTrayPublicScreenTranslateSetting.canCommonWidgetsAlphaXfer(c770910ULx.LIZLLL)) {
                    return;
                }
                LIZJ();
            }
        }
    }
}
