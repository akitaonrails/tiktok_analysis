package X;

import android.widget.EditText;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tux.icon.TuxIconView;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS550S0100000_6;
import kotlin.jvm.internal.AwS554S0100000_10;

/* JADX INFO: renamed from: X.0QcP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C674150QcP {
    public final C418060GaK LIZ;
    public final TuxIconView LIZIZ;
    public final EditText LIZJ;
    public final EditText LIZLLL;
    public final ChoreographerFrameCallbackC674130QcN LJ;
    public final C427110Gov LJFF;
    public final C01GW LJI = C452501pT.LIZIZ(new AwS550S0100000_6(this, 1543));

    public final void LIZ(EnumC674020QcC enumC674020QcC) {
        int i = C674190QcT.LIZ[enumC674020QcC.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        throw new C1954807lC();
                    }
                    return;
                }
                EditText editText = this.LIZLLL;
                if (editText != null) {
                    C680790Qn7 c680790Qn7 = C680790Qn7.LIZ;
                    AwS554S0100000_10 awS554S0100000_10 = new AwS554S0100000_10(editText, 1311);
                    c680790Qn7.getClass();
                    HandlerHook.viewPostDelay(editText, new RunnableC514801zW(awS554S0100000_10, (Function0<Unit>) 196), 200L);
                    return;
                }
                return;
            }
            return;
        }
        EditText editText2 = this.LIZJ;
        if (editText2 != null) {
            C680790Qn7 c680790Qn72 = C680790Qn7.LIZ;
            AwS554S0100000_10 awS554S0100000_102 = new AwS554S0100000_10(editText2, 1311);
            c680790Qn72.getClass();
            HandlerHook.viewPostDelay(editText2, new RunnableC514801zW(awS554S0100000_102, (Function0<Unit>) 196), 200L);
        }
    }

    public C674150QcP(C418060GaK c418060GaK, TuxIconView tuxIconView, EditText editText, EditText editText2, ChoreographerFrameCallbackC674130QcN choreographerFrameCallbackC674130QcN, C427110Gov c427110Gov) {
        this.LIZ = c418060GaK;
        this.LIZIZ = tuxIconView;
        this.LIZJ = editText;
        this.LIZLLL = editText2;
        this.LJ = choreographerFrameCallbackC674130QcN;
        this.LJFF = c427110Gov;
    }
}
