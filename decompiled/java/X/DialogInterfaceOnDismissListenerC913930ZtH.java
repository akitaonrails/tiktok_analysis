package X;

import android.content.DialogInterface;
import com.ss.android.ugc.aweme.shortvideo.ui.VideoPublishContainerScene;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0ZtH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public class DialogInterfaceOnDismissListenerC913930ZtH implements DialogInterface.OnDismissListener {
    public final int $t;
    public Object l0;

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.$t) {
            case 0:
                onDismiss$0(this, dialogInterface);
                break;
            case 1:
                onDismiss$1(this, dialogInterface);
                break;
            case 2:
                onDismiss$2(this, dialogInterface);
                break;
        }
    }

    public DialogInterfaceOnDismissListenerC913930ZtH(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onDismiss$0(DialogInterfaceOnDismissListenerC913930ZtH dialogInterfaceOnDismissListenerC913930ZtH, DialogInterface dialogInterface) {
        ((VideoPublishContainerScene) dialogInterfaceOnDismissListenerC913930ZtH.l0).LLJL.jD2(dialogInterface);
    }

    public static final void onDismiss$1(DialogInterfaceOnDismissListenerC913930ZtH dialogInterfaceOnDismissListenerC913930ZtH, DialogInterface dialogInterface) {
        ((C903960ZdC) dialogInterfaceOnDismissListenerC913930ZtH.l0).LJIIL = null;
    }

    public static final void onDismiss$2(DialogInterfaceOnDismissListenerC913930ZtH dialogInterfaceOnDismissListenerC913930ZtH, DialogInterface dialogInterface) {
        C0ZJR c0zjr = (C0ZJR) dialogInterfaceOnDismissListenerC913930ZtH.l0;
        if (c0zjr.LJIJJLI == C0ZHA.INTRO_PANEL && c0zjr.LJIJJ && !c0zjr.LJIJI) {
            C21411818qq c21411818qq = ((C0ZJR) dialogInterfaceOnDismissListenerC913930ZtH.l0).LJII;
            if (c21411818qq == null) {
                c21411818qq = null;
            }
            C1389890mGx c1389890mGx = new C1389890mGx(c21411818qq);
            c1389890mGx.LJIIIZ(2131830863);
            c1389890mGx.LJIIJJI();
        }
        C0ZJR c0zjr2 = (C0ZJR) dialogInterfaceOnDismissListenerC913930ZtH.l0;
        Function1<? super Boolean, Unit> function1 = c0zjr2.LJIJ;
        if (function1 != null) {
            function1.invoke(Boolean.valueOf(c0zjr2.LJIJJ));
        }
        C0ZJR c0zjr3 = (C0ZJR) dialogInterfaceOnDismissListenerC913930ZtH.l0;
        c0zjr3.LJFF(c0zjr3.LJIJJ);
    }
}
