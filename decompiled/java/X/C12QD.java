package X;

import android.app.Activity;
import android.view.View;
import android.widget.TextView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS238S0300000_29;
import kotlin.jvm.internal.AwS608S0100000_29;

/* JADX INFO: renamed from: X.12QD, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C12QD extends C12Q8 {
    public final /* synthetic */ Activity LIZ;
    public final /* synthetic */ C12QE LIZIZ;

    @Override // X.C12Q8
    public final void LIZ() {
        C1397510mTF c1397510mTF = this.LIZIZ.LIZ;
        if (c1397510mTF != null) {
            c1397510mTF.LIZIZ(null);
        }
        this.LIZIZ.LIZ = null;
    }

    public final String LJFF(C12QJ c12qj) {
        int i = C12QF.LIZ[c12qj.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return this.LIZ.getResources().getString(2131857088);
                }
                return this.LIZ.getResources().getString(2131857088);
            }
            return this.LIZ.getResources().getString(2131857091);
        }
        return this.LIZ.getResources().getString(2131857090);
    }

    public C12QD(Activity activity, C12QE c12qe) {
        this.LIZ = activity;
        this.LIZIZ = c12qe;
    }

    public final void LJ(C1397620mTQ c1397620mTQ, C12QB c12qb) {
        if (c12qb == null) {
            return;
        }
        if (c12qb.type() == C12QJ.OK) {
            String strLIZIZ = c12qb.LIZIZ();
            if (strLIZIZ == null) {
                strLIZIZ = LJFF(c12qb.type());
            }
            c1397620mTQ.LIZJ(0, strLIZIZ, new AwS608S0100000_29(c12qb, 620));
            return;
        }
        String strLIZIZ2 = c12qb.LIZIZ();
        if (strLIZIZ2 == null) {
            strLIZIZ2 = LJFF(c12qb.type());
        }
        c1397620mTQ.LIZJ(1, strLIZIZ2, new AwS608S0100000_29(c12qb, 621));
    }

    @Override // X.C12Q8
    public final void LIZLLL(C12QB c12qb, C12QB c12qb2, String str, String str2, String str3) {
        View viewTd = C786410Ut5.Td(C786410Ut5.ne(this.LIZ), R.layout.dk7, null, false);
        TextView textView = (TextView) viewTd.findViewById(R.id.zw3);
        if (str == null) {
            str = this.LIZ.getResources().getString(2131857092);
        }
        textView.setText(str);
        ((TextView) viewTd.findViewById(R.id.zw2)).setText(C06YR.LIZ(str2, str3));
        C1397580mTM c1397580mTM = new C1397580mTM(this.LIZ);
        C1207020hW0.LIZ(c1397580mTM, viewTd);
        c1397580mTM.LJII = false;
        C985403tE.LIZ(c1397580mTM, new AwS238S0300000_29(this, c12qb2, c12qb, 24));
        C1397510mTF c1397510mTF = new C1397510mTF(c1397580mTM);
        this.LIZIZ.LIZ = c1397510mTF;
        c1397510mTF.LIZLLL();
    }
}
