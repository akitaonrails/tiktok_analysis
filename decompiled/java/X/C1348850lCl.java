package X;

import android.content.Context;
import android.view.View;

/* JADX INFO: renamed from: X.0lCl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1348850lCl extends C1348860lCm {
    public boolean LJFF;

    @Override // X.C1348860lCm
    public final void LIZIZ(int i, Context context) {
        int iIntValue;
        int iLIZJ;
        int size = View.MeasureSpec.getSize(i);
        if (LIZ(size, context)) {
            return;
        }
        if (this.LJFF) {
            iIntValue = ((Number) C473380IhM.LIZ(C1388190mED.LIZ(context)).getFirst()).intValue();
        } else {
            iIntValue = ((Number) C473380IhM.LIZ(C1388190mED.LIZ(context)).getSecond()).intValue();
        }
        if (C14KQ.LIZLLL(context) != 0) {
            iLIZJ = C14KQ.LIZLLL(context);
        } else {
            iLIZJ = (int) C12ES.LIZJ(48, context);
        }
        int iLIZJ2 = C497820Jfg.LIZJ(context);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("sH: ");
        sbLIZ.append(iIntValue);
        sbLIZ.append(", mH: ");
        sbLIZ.append(size);
        sbLIZ.append(", nH: ");
        sbLIZ.append(iLIZJ);
        sbLIZ.append(", bH: ");
        sbLIZ.append(iLIZJ2);
        sbLIZ.append(", kv: ");
        sbLIZ.append(this.LJ);
        C1344030l4z.LIZJ("KeyBoardObservable", C2188811AlT.LIZIZ(sbLIZ));
        int i2 = iIntValue - size;
        if (Math.abs(i2) <= iLIZJ + iLIZJ2) {
            if (this.LJ) {
                this.LJ = false;
                LIZJ(Math.abs(iIntValue - this.LIZIZ), false);
                return;
            }
            return;
        }
        this.LIZIZ = size;
        if (this.LJ) {
            return;
        }
        this.LJ = true;
        LIZJ(Math.abs(i2), true);
    }
}
