package com.bytedance.android.live.infrastructure.dialog;

import X.C1C7U;
import X.C500260Jjc;
import X.C780470UjV;
import X.DialogC780480UjW;
import X.DialogInterfaceOnDismissListenerC2189651Amp;
import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Looper;
import android.os.Message;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.ss.android.ugc.aweme.SAFExtensionKt;

/* JADX INFO: loaded from: classes28.dex */
public final class DelayLoadingDialog {
    public static final /* synthetic */ int LIZJ = 0;
    public final DialogC780480UjW LIZ;
    public final DelayLoadingDialog$handler$1 LIZIZ;

    /* JADX WARN: Type inference failed for: r0v3, types: [com.bytedance.android.live.infrastructure.dialog.DelayLoadingDialog$handler$1] */
    public DelayLoadingDialog(final Context context) {
        DialogC780480UjW dialogC780480UjWLIZ = new C780470UjV(context).LIZ();
        this.LIZ = dialogC780480UjWLIZ;
        dialogC780480UjWLIZ.setOnShowListener(new DialogInterface.OnShowListener() { // from class: X.1AL2
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                String string;
                String string2;
                String string3;
                Boolean boolValueOf;
                C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_wallet_loading_dialog_show");
                c474500IjALIZ.LJIL();
                c474500IjALIZ.LJJII(Boolean.valueOf(C520010KaN.LJIIJJI(context)), "context_valid");
                InterfaceC214902198i interfaceC214902198iLJIIIIZZ = SAFExtensionKt.LJIIIIZZ(context);
                Boolean boolValueOf2 = null;
                if (interfaceC214902198iLJIIIIZZ != null) {
                    string = Boolean.valueOf(SAFExtensionKt.LJIIZILJ(interfaceC214902198iLJIIIIZZ)).toString();
                } else {
                    string = null;
                }
                c474500IjALIZ.LJJII(string, "saf_fragment_destroyed");
                InterfaceC214902198i interfaceC214902198iLJIIIIZZ2 = SAFExtensionKt.LJIIIIZZ(context);
                if (interfaceC214902198iLJIIIIZZ2 != null) {
                    string2 = Boolean.valueOf(SAFExtensionKt.LJIJ(interfaceC214902198iLJIIIIZZ2)).toString();
                } else {
                    string2 = null;
                }
                c474500IjALIZ.LJJII(string2, "saf_fragment_released");
                c474500IjALIZ.LJJII(C786410Ut5.u3().toString(), "current_thread");
                Activity activityLIZ = C1388190mED.LIZ(context);
                if (activityLIZ != null) {
                    string3 = activityLIZ.toString();
                } else {
                    string3 = null;
                }
                c474500IjALIZ.LJJII(string3, "current_activity");
                Activity activityLIZ2 = C1388190mED.LIZ(context);
                if (activityLIZ2 != null) {
                    boolValueOf = Boolean.valueOf(activityLIZ2.isFinishing());
                } else {
                    boolValueOf = null;
                }
                c474500IjALIZ.LJJII(boolValueOf, "activity_finishing");
                Activity activityLIZ3 = C1388190mED.LIZ(context);
                if (activityLIZ3 != null) {
                    boolValueOf2 = Boolean.valueOf(activityLIZ3.isDestroyed());
                }
                c474500IjALIZ.LJJII(boolValueOf2, "activity_destroyed");
                c474500IjALIZ.LIZ();
            }
        });
        dialogC780480UjWLIZ.setOnDismissListener(new DialogInterfaceOnDismissListenerC2189651Amp(context, 1));
        final Looper mainLooper = Looper.getMainLooper();
        this.LIZIZ = new BPEAHandler(mainLooper) { // from class: com.bytedance.android.live.infrastructure.dialog.DelayLoadingDialog$handler$1
            @Override // android.os.Handler
            public final void handleMessage(Message message) {
                C1C7U.LIZ("DelayLoadingDialog@fcff.handler$1");
                super.handleMessage(message);
                if (message.what == 10) {
                    C500260Jjc.LJJLIIIJLLLLLLLZ(this.LL.LIZ);
                }
                C1C7U.LIZIZ("DelayLoadingDialog@fcff.handler$1");
            }
        };
    }

    public final void LIZ(long j) {
        if (j > 0) {
            DelayLoadingDialog$handler$1 delayLoadingDialog$handler$1 = this.LIZIZ;
            Message messageObtain = Message.obtain();
            messageObtain.what = 10;
            delayLoadingDialog$handler$1.sendMessageDelayed(messageObtain, j);
            return;
        }
        C500260Jjc.LJJLIIIJLLLLLLLZ(this.LIZ);
    }
}
