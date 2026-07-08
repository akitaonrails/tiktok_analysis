package X;

import com.bytedance.android.livesdk.livesetting.performance.WidgetPlaceholderOptSetting;
import com.bytedance.ies.sdk.widgets.ConstraintProperty;
import com.bytedance.ies.sdk.widgets.LayeredElementContext;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0eFk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1081620eFk {
    public final int LIZ;
    public final int LIZIZ;
    public final float LIZLLL;
    public final int LJ;
    public int LJI;
    public final int LIZJ = C497740JfY.LJIJ();
    public final float LJFF = 0.5625f;

    public C1081620eFk(AbstractC1080560eE2 abstractC1080560eE2) {
        this.LIZ = C12ES.LJIIJ(abstractC1080560eE2.getContext());
        this.LIZIZ = C12ES.LJIIIIZZ(abstractC1080560eE2.getContext());
        this.LIZLLL = abstractC1080560eE2.LJIIJ;
        this.LJ = abstractC1080560eE2.LIZJ;
    }

    public final void LIZ(LayeredElementContext layeredElementContext, ConstraintProperty constraintProperty) {
        float f = ((this.LIZ * this.LJFF) + this.LIZLLL) - this.LJ;
        constraintProperty.removeConstraints(4);
        constraintProperty.removeConstraints(3);
        if (this.LIZIZ - this.LIZJ < this.LJI + f) {
            float f2 = ((this.LIZ * this.LJFF) / 2) + this.LIZLLL;
            constraintProperty.getView().getMeasuredHeight();
            constraintProperty.connect(3, 0, 3, (int) f2);
        } else {
            constraintProperty.connect(3, 0, 3, (int) f);
        }
        if (WidgetPlaceholderOptSetting.enableFullVideoLayoutOpt()) {
            constraintProperty.endToEnd(R.id.h4p, 0);
            constraintProperty.applyAndUpdate(layeredElementContext.getContainer());
        } else {
            constraintProperty.apply();
        }
    }
}
