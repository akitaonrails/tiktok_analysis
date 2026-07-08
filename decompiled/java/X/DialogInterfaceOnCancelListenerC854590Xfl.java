package X;

import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Process;
import com.bytedance.ies.safemode.SmartProtected.fastboot.FastBootBlankActivity;
import com.bytedance.ies.safemode.SmartProtected.utils.logger.LLog;
import java.util.Arrays;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0Xfl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public class DialogInterfaceOnCancelListenerC854590Xfl implements DialogInterface.OnCancelListener {
    public final int $t;
    public Object l0;

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.$t) {
            case 0:
                onCancel$0(this, dialogInterface);
                break;
            case 1:
                onCancel$1(this, dialogInterface);
                break;
            case 2:
                onCancel$2(this, dialogInterface);
                break;
        }
    }

    public DialogInterfaceOnCancelListenerC854590Xfl(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onCancel$0(DialogInterfaceOnCancelListenerC854590Xfl dialogInterfaceOnCancelListenerC854590Xfl, DialogInterface dialogInterface) {
        FastBootBlankActivity fastBootBlankActivity = (FastBootBlankActivity) dialogInterfaceOnCancelListenerC854590Xfl.l0;
        LLog.LIZ.getClass();
        C0VSD c0vsd = LLog.LIZIZ;
        Object[] objArrCopyOf = Arrays.copyOf(new Object[0], 0);
        c0vsd.getClass();
        if (objArrCopyOf.length != 0) {
            Object[] objArrCopyOf2 = Arrays.copyOf(objArrCopyOf, objArrCopyOf.length);
            C786410Ut5.j4("dialog cancelled...", Arrays.copyOf(objArrCopyOf2, objArrCopyOf2.length));
        }
        Process.killProcess(C0VSA.LIZ(fastBootBlankActivity.getApplication()));
        System.exit(0);
        throw new RuntimeException("System.exit returned normally, while it was supposed to halt JVM.");
    }

    public static final void onCancel$1(DialogInterfaceOnCancelListenerC854590Xfl dialogInterfaceOnCancelListenerC854590Xfl, DialogInterface dialogInterface) {
        DialogC1802700x0m dialogC1802700x0m = (DialogC1802700x0m) dialogInterfaceOnCancelListenerC854590Xfl.l0;
        Function1<Dialog, Unit> function1 = dialogC1802700x0m.LLJILJILJ;
        if (function1 != null) {
            function1.invoke(dialogC1802700x0m);
        }
        ((DialogC1802700x0m) dialogInterfaceOnCancelListenerC854590Xfl.l0).LJLI("cancel");
    }

    public static final void onCancel$2(DialogInterfaceOnCancelListenerC854590Xfl dialogInterfaceOnCancelListenerC854590Xfl, DialogInterface dialogInterface) {
        ((Activity) dialogInterfaceOnCancelListenerC854590Xfl.l0).finish();
    }
}
