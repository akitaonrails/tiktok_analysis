package X;

import android.content.DialogInterface;
import com.ss.android.ugc.aweme.image.ui.ImageEditRootScene;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0oGj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public class DialogInterfaceOnClickListenerC1466630oGj implements DialogInterface.OnClickListener {
    public final int $t;
    public Object l0;

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.$t) {
            case 0:
                onClick$0(this, dialogInterface, i);
                break;
            case 1:
                onClick$1(this, dialogInterface, i);
                break;
            case 2:
                onClick$2(this, dialogInterface, i);
                break;
            case 3:
                onClick$3(this, dialogInterface, i);
                break;
            case 4:
                onClick$4(this, dialogInterface, i);
                break;
            case 5:
                onClick$5(this, dialogInterface, i);
                break;
        }
    }

    public DialogInterfaceOnClickListenerC1466630oGj(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onClick$0(DialogInterfaceOnClickListenerC1466630oGj dialogInterfaceOnClickListenerC1466630oGj, DialogInterface dialogInterface, int i) {
        ((Function0) dialogInterfaceOnClickListenerC1466630oGj.l0).invoke();
    }

    public static final void onClick$1(DialogInterfaceOnClickListenerC1466630oGj dialogInterfaceOnClickListenerC1466630oGj, DialogInterface dialogInterface, int i) {
        ((Function0) dialogInterfaceOnClickListenerC1466630oGj.l0).invoke();
    }

    public static final void onClick$2(DialogInterfaceOnClickListenerC1466630oGj dialogInterfaceOnClickListenerC1466630oGj, DialogInterface dialogInterface, int i) {
        ((C1465530oEx) dialogInterfaceOnClickListenerC1466630oGj.l0).T2();
    }

    public static final void onClick$3(DialogInterfaceOnClickListenerC1466630oGj dialogInterfaceOnClickListenerC1466630oGj, DialogInterface dialogInterface, int i) {
        ((Function0) dialogInterfaceOnClickListenerC1466630oGj.l0).invoke();
    }

    public static final void onClick$4(DialogInterfaceOnClickListenerC1466630oGj dialogInterfaceOnClickListenerC1466630oGj, DialogInterface dialogInterface, int i) {
        InterfaceC1455500nym interfaceC1455500nymV3 = ((C1455270nyP) dialogInterfaceOnClickListenerC1466630oGj.l0).v3();
        if (interfaceC1455500nymV3 != null) {
            interfaceC1455500nymV3.aH(true);
        }
        ((C1455270nyP) dialogInterfaceOnClickListenerC1466630oGj.l0).d6();
    }

    public static final void onClick$5(DialogInterfaceOnClickListenerC1466630oGj dialogInterfaceOnClickListenerC1466630oGj, DialogInterface dialogInterface, int i) {
        ((ImageEditRootScene) dialogInterfaceOnClickListenerC1466630oGj.l0).LLLLLZL();
    }
}
