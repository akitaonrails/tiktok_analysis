package X;

import com.bytedance.android.livesdk.livesetting.publicscreen.LiveGiftTrayPublicScreenTranslateSetting;
import com.bytedance.ies.sdk.widgets.ConstraintProperty;

/* JADX INFO: renamed from: X.0eHN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public class C1082630eHN extends AbstractC1082670eHR {
    public final AbstractC1080560eE2 LLILZ;

    public /* synthetic */ C1082630eHN(AbstractC1080560eE2 abstractC1080560eE2) {
        this(C1079590eCT.LJFF, abstractC1080560eE2);
    }

    public boolean LIZJ(C1082760eHa c1082760eHa) {
        return LiveGiftTrayPublicScreenTranslateSetting.INSTANCE.canCommonWidgetsAlphaXfer(c1082760eHa.LIZ.LIZLLL);
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(C1082760eHa c1082760eHa) {
        C1082760eHa c1082760eHa2 = c1082760eHa;
        if (LIZJ(c1082760eHa2)) {
            if (c1082760eHa2.LIZ.LIZ) {
                ConstraintProperty constraintPropertyLIZIZ = LIZIZ();
                if (constraintPropertyLIZIZ != null && constraintPropertyLIZIZ.visibility() == 8) {
                    return;
                }
                ConstraintProperty constraintPropertyLIZIZ2 = LIZIZ();
                if (constraintPropertyLIZIZ2 != null) {
                    constraintPropertyLIZIZ2.visibility(8);
                }
                ConstraintProperty constraintPropertyLIZIZ3 = LIZIZ();
                if (constraintPropertyLIZIZ3 != null) {
                    constraintPropertyLIZIZ3.alpha(0.0f);
                }
                this.LLILZ.getDataChannel().SX0(C753980Ths.class, Boolean.TRUE);
                return;
            }
            C770910ULx c770910ULx = c1082760eHa2.LIZIZ;
            if (c770910ULx == null) {
                this.LLILZ.getDataChannel().SX0(C753980Ths.class, Boolean.FALSE);
                ConstraintProperty constraintPropertyLIZIZ4 = LIZIZ();
                if (constraintPropertyLIZIZ4 != null) {
                    constraintPropertyLIZIZ4.visibility(0);
                }
                ConstraintProperty constraintPropertyLIZIZ5 = LIZIZ();
                if (constraintPropertyLIZIZ5 == null) {
                    return;
                }
                constraintPropertyLIZIZ5.alpha(1.0f);
                return;
            }
            if (LiveGiftTrayPublicScreenTranslateSetting.INSTANCE.canCommonWidgetsAlphaXfer(c770910ULx.LIZLLL)) {
                return;
            }
            this.LLILZ.getDataChannel().SX0(C753980Ths.class, Boolean.FALSE);
            ConstraintProperty constraintPropertyLIZIZ6 = LIZIZ();
            if (constraintPropertyLIZIZ6 != null) {
                constraintPropertyLIZIZ6.visibility(0);
            }
            ConstraintProperty constraintPropertyLIZIZ7 = LIZIZ();
            if (constraintPropertyLIZIZ7 == null) {
                return;
            }
            constraintPropertyLIZIZ7.alpha(1.0f);
        }
    }

    public C1082630eHN(int i, AbstractC1080560eE2 abstractC1080560eE2) {
        super(i, abstractC1080560eE2);
        this.LLILZ = abstractC1080560eE2;
    }
}
