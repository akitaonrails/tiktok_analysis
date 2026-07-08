package X;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;

/* JADX INFO: renamed from: X.0lks, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public class DialogC1370000lks extends C19GU {
    public final InterfaceC1370040lkw LLILZLL;

    @Override // X.C19GU, X.C19EK, android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        if (window != null) {
            window.clearFlags(67108864);
            window.addFlags(Integer.MIN_VALUE);
            window.setLayout(-1, -1);
        }
        this.LLILZLL.LIZ(this);
    }

    @Override // android.app.Dialog
    public final void setCancelable(boolean z) {
        super.setCancelable(z);
        this.LLILZLL.LIZJ(z);
    }

    @Override // android.app.Dialog
    public final void setCanceledOnTouchOutside(boolean z) {
        super.setCanceledOnTouchOutside(z);
        this.LLILZLL.LJ(z);
    }

    @Override // X.C19GU, X.C19EK, android.app.Dialog
    public final void setContentView(View view) {
        super.setContentView(LJJZ(this, 0, view, null, 5));
    }

    @Override // X.C19GU, X.C19EK, android.app.Dialog
    public final void setContentView(int i) {
        super.setContentView(LJJZ(this, i, null, null, 6));
    }

    @Override // X.C19GU, X.C19EK, android.app.Dialog
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView(LJJZ(this, 0, view, layoutParams, 1));
    }

    public DialogC1370000lks(Context context, InterfaceC1370040lkw interfaceC1370040lkw, int i) {
        super(context, i);
        this.LLILZLL = interfaceC1370040lkw;
        LJJLL(1);
    }

    public static View LJJZ(DialogC1370000lks dialogC1370000lks, int i, View view, ViewGroup.LayoutParams layoutParams, int i2) {
        View view2 = view;
        int i3 = i;
        if ((i2 & 1) != 0) {
            i3 = 0;
        }
        ViewGroup.LayoutParams layoutParams2 = null;
        if ((i2 & 2) != 0) {
            view2 = null;
        }
        if ((i2 & 4) == 0) {
            layoutParams2 = layoutParams;
        }
        dialogC1370000lks.getClass();
        return dialogC1370000lks.LLILZLL.LIZLLL(dialogC1370000lks, i3, view2, layoutParams2, C1369530lk7.LIZ(dialogC1370000lks.getContext()));
    }
}
