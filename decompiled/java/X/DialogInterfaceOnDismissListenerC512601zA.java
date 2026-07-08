package X;

import android.content.DialogInterface;
import com.bytedance.android.live.liveinteract.multiguestv3.main.countdown.base.BaseVmWidget;
import kotlin.jvm.functions.Function0;
import webcast.data.multi_guest_play.CountdownConfig;

/* JADX INFO: renamed from: X.01zA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class DialogInterfaceOnDismissListenerC512601zA implements DialogInterface.OnDismissListener {
    public final int $t;
    public Object l0;
    public Object l1;

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

    public static final void onDismiss$0(DialogInterfaceOnDismissListenerC512601zA dialogInterfaceOnDismissListenerC512601zA, DialogInterface dialogInterface) {
        C09AE c09ae = (C09AE) ((C259800zU) dialogInterfaceOnDismissListenerC512601zA.l0).element;
        if (c09ae != null) {
            c09ae.LIZIZ(null);
        }
        ((Function0) dialogInterfaceOnDismissListenerC512601zA.l1).invoke();
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void onDismiss$1(X.DialogInterfaceOnDismissListenerC512601zA r4, android.content.DialogInterface r5) {
        /*
            java.lang.Object r0 = r4.l0
            com.bytedance.android.live.liveinteract.multiguestv3.main.countdown.base.BaseVmWidget r0 = (com.bytedance.android.live.liveinteract.multiguestv3.main.countdown.base.BaseVmWidget) r0
            X.01kj r3 = r0.LLILLL
            r2 = 0
            if (r3 == 0) goto L2c
            X.01kX r1 = r3.LLJJ
        Lb:
            X.01kX r0 = X.EnumC421901kX.OTHER
            if (r1 == r0) goto L2a
            if (r3 == 0) goto L28
            X.01kX r1 = r3.LLJJ
        L13:
            X.01kX r0 = X.EnumC421901kX.CANCEL_BUTTON
            if (r1 == r0) goto L2a
            r1 = 1
        L18:
            java.lang.Object r0 = r4.l1
            X.01GT r0 = (X.C01GT) r0
            if (r0 == 0) goto L21
            r0.LIZIZ(r1)
        L21:
            java.lang.Object r0 = r4.l0
            com.bytedance.android.live.liveinteract.multiguestv3.main.countdown.base.BaseVmWidget r0 = (com.bytedance.android.live.liveinteract.multiguestv3.main.countdown.base.BaseVmWidget) r0
            r0.LLILLL = r2
            return
        L28:
            r1 = r2
            goto L13
        L2a:
            r1 = 2
            goto L18
        L2c:
            r1 = r2
            goto Lb
        */
        throw new UnsupportedOperationException("Method not decompiled: X.DialogInterfaceOnDismissListenerC512601zA.onDismiss$1(X.01zA, android.content.DialogInterface):void");
    }

    public static final void onDismiss$2(DialogInterfaceOnDismissListenerC512601zA dialogInterfaceOnDismissListenerC512601zA, DialogInterface dialogInterface) {
        int i;
        BaseVmWidget baseVmWidget = (BaseVmWidget) dialogInterfaceOnDismissListenerC512601zA.l0;
        DialogC20518615Qq dialogC20518615Qq = baseVmWidget.LLILZ;
        if (dialogC20518615Qq != null) {
            C01GT c01gt = (C01GT) dialogInterfaceOnDismissListenerC512601zA.l1;
            EnumC421801kW enumC421801kW = dialogC20518615Qq.LLLIIIIL;
            EnumC421801kW enumC421801kW2 = EnumC421801kW.OTHER;
            if (enumC421801kW == enumC421801kW2 && baseVmWidget.LL != 0) {
                CountdownConfig countdownConfigLJLIIIL = dialogC20518615Qq.LJLIIIL();
                InterfaceC421301kR interfaceC421301kRLIZIZ = C01EG.LIZIZ();
                if (interfaceC421301kRLIZIZ != null) {
                    interfaceC421301kRLIZIZ.LJIIIIZZ(countdownConfigLJLIIIL);
                }
            }
            if (c01gt != null) {
                if (dialogC20518615Qq.LLLIIIIL == enumC421801kW2) {
                    i = 2;
                } else {
                    i = 1;
                }
                c01gt.LIZIZ(i);
            }
        }
        ((BaseVmWidget) dialogInterfaceOnDismissListenerC512601zA.l0).LLILZ = null;
    }

    public DialogInterfaceOnDismissListenerC512601zA(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
