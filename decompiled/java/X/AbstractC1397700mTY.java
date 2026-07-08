package X;

import X.AbstractC1397700mTY;
import android.content.Context;
import android.content.DialogInterface;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0mTY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public abstract class AbstractC1397700mTY<T extends AbstractC1397700mTY<T, U>, U> {
    public final Context LIZ;
    public CharSequence LIZIZ;
    public CharSequence LIZJ;
    public DialogInterface.OnDismissListener LIZLLL;
    public DialogInterface.OnCancelListener LJ;
    public DialogInterface.OnShowListener LJFF;
    public InterfaceC1196790hFV LJI;
    public boolean LJII = true;

    public AbstractC1397700mTY(Context context) {
        this.LIZ = context;
    }

    public final void LIZ(int i) {
        LIZIZ(this.LIZ.getString(i));
    }

    public void LIZIZ(CharSequence charSequence) {
        this.LIZJ = charSequence;
    }

    public final void LIZJ(Function1 function1) {
        this.LJ = new DialogInterfaceOnCancelListenerC786010UsR(function1, 5);
    }

    public final void LIZLLL(Function1 function1) {
        this.LIZLLL = new DialogInterfaceOnDismissListenerC786080UsY(function1, 40);
    }

    public final void LJ(final Function1 function1) {
        this.LJFF = new DialogInterface.OnShowListener() { // from class: X.0Xts
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                function1.invoke(dialogInterface);
            }
        };
    }

    public final void LJFF(int i) {
        LJI(this.LIZ.getString(i));
    }

    public void LJI(CharSequence charSequence) {
        this.LIZIZ = charSequence;
    }
}
