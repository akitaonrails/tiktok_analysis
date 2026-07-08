package X;

import android.view.View;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.profile.platform.base.data.BizBaseData;
import com.ss.android.ugc.profile.platform.base.data.Describe;
import kotlin.jvm.internal.AwS563S0100000_19;

/* JADX INFO: renamed from: X.0ibD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1248690ibD extends AbstractC1247880iZu {
    public final C1248700ibE LIZIZ;
    public final C01GW LIZJ;

    @Override // X.AbstractC1247880iZu
    public final View LIZ() {
        BizBaseData bizBaseData;
        String str;
        Integer num;
        Integer num2;
        String text;
        BizBaseData bizBaseData2;
        Describe describe;
        TuxTextView tuxTextView = (TuxTextView) this.LIZJ.getValue();
        if (tuxTextView != null) {
            C1248700ibE c1248700ibE = this.LIZIZ;
            if (c1248700ibE != null) {
                bizBaseData = c1248700ibE.LIZLLL;
                str = c1248700ibE.LIZIZ;
                num = c1248700ibE.LJ;
                num2 = c1248700ibE.LJII;
            } else {
                bizBaseData = null;
                str = null;
                num = null;
                num2 = null;
            }
            C1248270iaX.LIZJ(tuxTextView, bizBaseData, str, num, num2, false, 16);
            C1248700ibE c1248700ibE2 = this.LIZIZ;
            if (c1248700ibE2 == null || (bizBaseData2 = c1248700ibE2.LIZLLL) == null || (describe = bizBaseData2.getDescribe()) == null || (text = describe.getText()) == null) {
                C1248700ibE c1248700ibE3 = this.LIZIZ;
                text = c1248700ibE3 != null ? c1248700ibE3.LJIIIIZZ : null;
            }
            tuxTextView.setText(text);
        }
        return (View) this.LIZJ.getValue();
    }

    @Override // X.AbstractC1247880iZu
    public final View LIZIZ() {
        return (View) this.LIZJ.getValue();
    }

    public C1248690ibD(C1248700ibE c1248700ibE) {
        super(c1248700ibE);
        this.LIZIZ = c1248700ibE;
        this.LIZJ = C452501pT.LIZIZ(new AwS563S0100000_19(this, 2847));
    }
}
