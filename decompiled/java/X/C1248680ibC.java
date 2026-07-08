package X;

import android.view.View;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.profile.platform.base.data.BizBaseData;
import kotlin.jvm.internal.AwS563S0100000_19;

/* JADX INFO: renamed from: X.0ibC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1248680ibC extends AbstractC1247880iZu {
    public final C1248700ibE LIZIZ;
    public final C01GW LIZJ;

    @Override // X.AbstractC1247880iZu
    public final View LIZ() {
        String str;
        Integer num;
        Integer num2;
        TuxIconView tuxIconView = (TuxIconView) this.LIZJ.getValue();
        if (tuxIconView != null) {
            C1248700ibE c1248700ibE = this.LIZIZ;
            BizBaseData bizBaseData = null;
            if (c1248700ibE != null) {
                bizBaseData = c1248700ibE.LIZLLL;
                str = c1248700ibE.LIZIZ;
                num = c1248700ibE.LJFF;
                num2 = c1248700ibE.LJI;
            } else {
                str = null;
                num = null;
                num2 = null;
            }
            C1248270iaX.LIZ(tuxIconView, bizBaseData, str, num, num2, null);
        }
        return (View) this.LIZJ.getValue();
    }

    @Override // X.AbstractC1247880iZu
    public final View LIZIZ() {
        return (View) this.LIZJ.getValue();
    }

    public C1248680ibC(C1248700ibE c1248700ibE) {
        super(c1248700ibE);
        this.LIZIZ = c1248700ibE;
        this.LIZJ = C452501pT.LIZIZ(new AwS563S0100000_19(this, 2846));
    }
}
