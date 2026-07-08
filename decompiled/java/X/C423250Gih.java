package X;

import android.view.View;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0Gih, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C423250Gih {
    public final Function0<View> LIZ;
    public final Function0<Boolean> LIZIZ;
    public final int LIZJ = 8;
    public final String LIZLLL;
    public Integer LJ;

    public final void LIZ() {
        int iIntValue;
        View viewInvoke = this.LIZ.invoke();
        if (viewInvoke == null) {
            return;
        }
        boolean zBooleanValue = this.LIZIZ.invoke().booleanValue();
        if (zBooleanValue) {
            iIntValue = this.LIZJ;
        } else {
            Integer num = this.LJ;
            if (num == null) {
                return;
            } else {
                iIntValue = num.intValue();
            }
        }
        if (viewInvoke.getVisibility() != iIntValue) {
            String str = this.LIZLLL;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("visibility apply: ");
            sbLIZ.append(iIntValue);
            sbLIZ.append(" (override=");
            sbLIZ.append(zBooleanValue);
            sbLIZ.append(", desired=");
            sbLIZ.append(this.LJ);
            sbLIZ.append(')');
            C20441214yg.LIZIZ(str, C2188811AlT.LIZIZ(sbLIZ));
            C786410Ut5.LJLLLLLL(iIntValue, viewInvoke);
        }
    }

    public final void LIZIZ(int i) {
        this.LJ = Integer.valueOf(i);
        LIZ();
    }

    public C423250Gih(Function0 function0, Function0 function02, String str) {
        this.LIZ = function0;
        this.LIZIZ = function02;
        this.LIZLLL = str;
    }
}
