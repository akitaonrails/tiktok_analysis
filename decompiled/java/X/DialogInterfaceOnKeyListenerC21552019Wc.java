package X;

import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;

/* JADX INFO: renamed from: X.19Wc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class DialogInterfaceOnKeyListenerC21552019Wc implements DialogInterface.OnKeyListener, DialogInterface.OnClickListener, DialogInterface.OnDismissListener, InterfaceC21549519Vd {
    public final C19V6 LL;
    public DialogInterfaceC21560019Ze LLILLJJLI;
    public C21551919Wb LLILLL;

    @Override // X.InterfaceC21549519Vd
    public final boolean LIZIZ(C19V6 c19v6) {
        return false;
    }

    public DialogInterfaceOnKeyListenerC21552019Wc(C19V6 c19v6) {
        this.LL = c19v6;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        this.LLILLL.LIZ(this.LL, true);
    }

    @Override // X.InterfaceC21549519Vd
    public final void LIZ(C19V6 c19v6, boolean z) {
        DialogInterfaceC21560019Ze dialogInterfaceC21560019Ze;
        if ((z || c19v6 == this.LL) && (dialogInterfaceC21560019Ze = this.LLILLJJLI) != null) {
            dialogInterfaceC21560019Ze.dismiss();
            C785410UrT.LIZ(dialogInterfaceC21560019Ze);
        }
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        C19V6 c19v6 = this.LL;
        C21551919Wb c21551919Wb = this.LLILLL;
        if (c21551919Wb.LLILZLL == null) {
            c21551919Wb.LLILZLL = new C21550019Vi(c21551919Wb);
        }
        c19v6.LJIILLIIL(c21551919Wb.LLILZLL.getItem(i), null, 0);
    }

    @Override // android.content.DialogInterface.OnKeyListener
    public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        Window window;
        View decorView;
        KeyEvent.DispatcherState keyDispatcherState;
        View decorView2;
        KeyEvent.DispatcherState keyDispatcherState2;
        if (i == 82 || i == 4) {
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                Window window2 = this.LLILLJJLI.getWindow();
                if (window2 != null && (decorView2 = window2.getDecorView()) != null && (keyDispatcherState2 = decorView2.getKeyDispatcherState()) != null) {
                    keyDispatcherState2.startTracking(keyEvent, this);
                    return true;
                }
            } else if (keyEvent.getAction() == 1 && !keyEvent.isCanceled() && (window = this.LLILLJJLI.getWindow()) != null && (decorView = window.getDecorView()) != null && (keyDispatcherState = decorView.getKeyDispatcherState()) != null && keyDispatcherState.isTracking(keyEvent)) {
                this.LL.LIZJ(true);
                dialogInterface.dismiss();
                return true;
            }
        }
        return this.LL.performShortcut(i, keyEvent, 0);
    }
}
