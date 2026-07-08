package X;

import android.content.DialogInterface;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ZtD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public class DialogInterfaceOnCancelListenerC913890ZtD implements DialogInterface.OnCancelListener {
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
            case 3:
                onCancel$3(this, dialogInterface);
                break;
        }
    }

    public DialogInterfaceOnCancelListenerC913890ZtD(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onCancel$0(DialogInterfaceOnCancelListenerC913890ZtD dialogInterfaceOnCancelListenerC913890ZtD, DialogInterface dialogInterface) {
        Function1 function1 = (Function1) dialogInterfaceOnCancelListenerC913890ZtD.l0;
        if (function1 != null) {
            function1.invoke("cancel");
        }
    }

    public static final void onCancel$1(DialogInterfaceOnCancelListenerC913890ZtD dialogInterfaceOnCancelListenerC913890ZtD, DialogInterface dialogInterface) {
        Function0 function0 = (Function0) dialogInterfaceOnCancelListenerC913890ZtD.l0;
        if (function0 != null) {
            function0.invoke();
        }
    }

    public static final void onCancel$2(DialogInterfaceOnCancelListenerC913890ZtD dialogInterfaceOnCancelListenerC913890ZtD, DialogInterface dialogInterface) {
        C885310YoD c885310YoD = C885310YoD.LIZ;
        c885310YoD.getClass();
        C885310YoD.LJJIIJZLJL("click_background");
        ((C0Z4F) dialogInterfaceOnCancelListenerC913890ZtD.l0).LIZIZ(2);
        c885310YoD.getClass();
        C885310YoD.LJJIIJZLJL("maybe_later");
    }

    public static final void onCancel$3(DialogInterfaceOnCancelListenerC913890ZtD dialogInterfaceOnCancelListenerC913890ZtD, DialogInterface dialogInterface) {
        String str = TuxSheet._pnsPageId;
        AbstractC343940De4 abstractC343940De4LJIIJ = C1391190mJ3.LJIIJ(dialogInterface);
        if (Intrinsics.LJFF(abstractC343940De4LJIIJ, C343960De6.LIZ)) {
            ((C891740Yya) dialogInterfaceOnCancelListenerC913890ZtD.l0).LJII("click_back");
            return;
        }
        if (Intrinsics.LJFF(abstractC343940De4LJIIJ, C343980De8.LIZ)) {
            ((C891740Yya) dialogInterfaceOnCancelListenerC913890ZtD.l0).LJII("click_close");
        } else if (Intrinsics.LJFF(abstractC343940De4LJIIJ, C891750Yyb.LIZ)) {
            ((C891740Yya) dialogInterfaceOnCancelListenerC913890ZtD.l0).LJII("click_cancel");
        } else {
            ((C891740Yya) dialogInterfaceOnCancelListenerC913890ZtD.l0).LJII("click_background");
        }
    }
}
