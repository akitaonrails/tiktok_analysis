package X;

import android.content.DialogInterface;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0e8o, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public class DialogInterfaceOnDismissListenerC1077320e8o implements DialogInterface.OnDismissListener {
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

    public DialogInterfaceOnDismissListenerC1077320e8o(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onDismiss$0(DialogInterfaceOnDismissListenerC1077320e8o dialogInterfaceOnDismissListenerC1077320e8o, DialogInterface dialogInterface) {
        Function0<Unit> function0;
        String str = TuxSheet._pnsPageId;
        AbstractC343940De4 abstractC343940De4LJIIJJI = C1391190mJ3.LJIIJJI(dialogInterface);
        if (Intrinsics.LJFF(abstractC343940De4LJIIJJI, C343970De7.LIZ)) {
            Function0<Unit> function02 = ((C1070930dyV) dialogInterfaceOnDismissListenerC1077320e8o.l0).LJFF;
            if (function02 != null) {
                function02.invoke();
                return;
            }
            return;
        }
        if (!Intrinsics.LJFF(abstractC343940De4LJIIJJI, C343980De8.LIZ) || (function0 = ((C1070930dyV) dialogInterfaceOnDismissListenerC1077320e8o.l0).LJI) == null) {
            return;
        }
        function0.invoke();
    }

    public static final void onDismiss$1(DialogInterfaceOnDismissListenerC1077320e8o dialogInterfaceOnDismissListenerC1077320e8o, DialogInterface dialogInterface) {
        int iIntValue;
        ((C1068650dup) dialogInterfaceOnDismissListenerC1077320e8o.l0).getClass();
        String str = TuxSheet._pnsPageId;
        if ((C1391190mJ3.LJIIJJI(dialogInterface) instanceof C1068340duK) && !((C1068340duK) C1391190mJ3.LJIIJJI(dialogInterface)).LIZ) {
            return;
        }
        AbstractC343940De4 abstractC343940De4LJIIJJI = C1391190mJ3.LJIIJJI(dialogInterface);
        if (abstractC343940De4LJIIJJI instanceof C343960De6) {
            ((C1068650dup) dialogInterfaceOnDismissListenerC1077320e8o.l0).LIZIZ(0);
            return;
        }
        if (abstractC343940De4LJIIJJI instanceof C1068340duK) {
            C1068650dup c1068650dup = (C1068650dup) dialogInterfaceOnDismissListenerC1077320e8o.l0;
            Integer num = ((C1068340duK) C1391190mJ3.LJIIJJI(dialogInterface)).LIZIZ;
            if (num != null) {
                iIntValue = num.intValue();
            } else {
                iIntValue = -1;
            }
            c1068650dup.LIZIZ(iIntValue);
            return;
        }
        ((C1068650dup) dialogInterfaceOnDismissListenerC1077320e8o.l0).LIZIZ(1);
    }

    public static final void onDismiss$2(DialogInterfaceOnDismissListenerC1077320e8o dialogInterfaceOnDismissListenerC1077320e8o, DialogInterface dialogInterface) {
        ((C1022140cho) dialogInterfaceOnDismissListenerC1077320e8o.l0).LIZ();
    }
}
