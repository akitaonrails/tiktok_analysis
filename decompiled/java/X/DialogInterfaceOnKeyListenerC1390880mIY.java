package X;

import android.content.DialogInterface;
import android.view.KeyEvent;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0mIY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class DialogInterfaceOnKeyListenerC1390880mIY implements DialogInterface.OnKeyListener {
    public final Function0<Unit> LL;
    public int LLILLJJLI;

    public DialogInterfaceOnKeyListenerC1390880mIY(Function0<Unit> function0) {
        this.LL = function0;
    }

    @Override // android.content.DialogInterface.OnKeyListener
    public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        Integer numValueOf;
        if (i != 4 || keyEvent == null || (numValueOf = Integer.valueOf(keyEvent.getAction())) == null) {
            return false;
        }
        if (numValueOf.intValue() == 1) {
            int i2 = this.LLILLJJLI - 1;
            this.LLILLJJLI = i2;
            if (i2 >= 0) {
                this.LL.invoke();
                return true;
            }
            this.LLILLJJLI = 0;
            return false;
        }
        if (numValueOf.intValue() != 0) {
            return false;
        }
        this.LLILLJJLI++;
        return false;
    }
}
