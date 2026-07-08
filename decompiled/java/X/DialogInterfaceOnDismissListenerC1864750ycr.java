package X;

import android.content.DialogInterface;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import com.ss.android.ugc.aweme.share.SystemShareActivity;
import com.ss.android.ugc.aweme.tako.botpage.cards.base.TakoAnswerBaseAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS36S0010000_24;

/* JADX INFO: renamed from: X.0ycr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public class DialogInterfaceOnDismissListenerC1864750ycr implements DialogInterface.OnDismissListener {
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
            case 3:
                onDismiss$3(this, dialogInterface);
                break;
            case 4:
                onDismiss$4(this, dialogInterface);
                break;
            case 5:
                onDismiss$5(this, dialogInterface);
                break;
            case 6:
                onDismiss$6(this, dialogInterface);
                break;
            case 7:
                onDismiss$7(this, dialogInterface);
                break;
            case 8:
                onDismiss$8(this, dialogInterface);
                break;
        }
    }

    public DialogInterfaceOnDismissListenerC1864750ycr(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onDismiss$0(DialogInterfaceOnDismissListenerC1864750ycr dialogInterfaceOnDismissListenerC1864750ycr, DialogInterface dialogInterface) {
        DialogInterface.OnDismissListener onDismissListener = (DialogInterface.OnDismissListener) dialogInterfaceOnDismissListenerC1864750ycr.l0;
        if (onDismissListener != null) {
            onDismissListener.onDismiss(dialogInterface);
        }
    }

    public static final void onDismiss$1(DialogInterfaceOnDismissListenerC1864750ycr dialogInterfaceOnDismissListenerC1864750ycr, DialogInterface dialogInterface) {
        ((Function0) dialogInterfaceOnDismissListenerC1864750ycr.l0).invoke();
    }

    public static final void onDismiss$2(DialogInterfaceOnDismissListenerC1864750ycr dialogInterfaceOnDismissListenerC1864750ycr, DialogInterface dialogInterface) {
        ((C2177041AIc) dialogInterfaceOnDismissListenerC1864750ycr.l0).LLJIJIL = false;
    }

    public static final void onDismiss$3(DialogInterfaceOnDismissListenerC1864750ycr dialogInterfaceOnDismissListenerC1864750ycr, DialogInterface dialogInterface) {
        DialogInterface.OnDismissListener onDismissListener = (DialogInterface.OnDismissListener) dialogInterfaceOnDismissListenerC1864750ycr.l0;
        if (onDismissListener != null) {
            onDismissListener.onDismiss(dialogInterface);
        }
    }

    public static final void onDismiss$4(DialogInterfaceOnDismissListenerC1864750ycr dialogInterfaceOnDismissListenerC1864750ycr, DialogInterface dialogInterface) {
        ((SystemShareActivity) dialogInterfaceOnDismissListenerC1864750ycr.l0).finish();
    }

    public static final void onDismiss$5(DialogInterfaceOnDismissListenerC1864750ycr dialogInterfaceOnDismissListenerC1864750ycr, DialogInterface dialogInterface) {
        ((TakoAnswerBaseAssem) dialogInterfaceOnDismissListenerC1864750ycr.l0).wq().setState(new AwS36S0010000_24(false, 38));
    }

    public static final void onDismiss$6(DialogInterfaceOnDismissListenerC1864750ycr dialogInterfaceOnDismissListenerC1864750ycr, DialogInterface dialogInterface) {
        C1854340yM4 c1854340yM4 = (C1854340yM4) dialogInterfaceOnDismissListenerC1864750ycr.l0;
        c1854340yM4.LLJILLL = false;
        Function0<Unit> function0 = c1854340yM4.LLJJIJI;
        if (function0 != null) {
            function0.invoke();
        }
    }

    public static final void onDismiss$7(DialogInterfaceOnDismissListenerC1864750ycr dialogInterfaceOnDismissListenerC1864750ycr, DialogInterface dialogInterface) {
        C1802110wzp c1802110wzp = (C1802110wzp) dialogInterfaceOnDismissListenerC1864750ycr.l0;
        c1802110wzp.LJ++;
        c1802110wzp.LIZLLL = null;
        c1802110wzp.LIZJ = null;
    }

    public static final void onDismiss$8(DialogInterfaceOnDismissListenerC1864750ycr dialogInterfaceOnDismissListenerC1864750ycr, DialogInterface dialogInterface) {
        CompletionBlock completionBlock = (CompletionBlock) dialogInterfaceOnDismissListenerC1864750ycr.l0;
        XBaseModel xBaseModelLIZJ = C1909107dp.LIZJ(InterfaceC1845030y73.class, null);
        ((InterfaceC1845030y73) xBaseModelLIZJ).setClickEventParams(null);
        completionBlock.onSuccess((XBaseResultModel) xBaseModelLIZJ, "");
    }
}
