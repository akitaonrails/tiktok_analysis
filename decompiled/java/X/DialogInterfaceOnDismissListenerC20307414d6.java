package X;

import android.content.DialogInterface;
import com.bytedance.tux.sheet.intro.TuxPanel;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.tako.model.SmartSearchItem;
import com.ss.android.ugc.aweme.tako.model.TakoEnterParams;
import com.ss.android.ugc.aweme.tako.otherpage.sheet.TakoSheetFragment;
import com.ss.android.ugc.aweme.tako.router.model.TakoChatContainerData;
import java.lang.ref.WeakReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;

/* JADX INFO: renamed from: X.14d6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public class DialogInterfaceOnDismissListenerC20307414d6 implements DialogInterface.OnDismissListener {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) throws JSONException {
        switch (this.$t) {
            case 0:
                onDismiss$0(this, dialogInterface);
                break;
            case 1:
                onDismiss$1(this, dialogInterface);
                break;
        }
    }

    public static final void onDismiss$0(DialogInterfaceOnDismissListenerC20307414d6 dialogInterfaceOnDismissListenerC20307414d6, DialogInterface dialogInterface) throws JSONException {
        C439540HLk c439540HLk;
        String str;
        TuxPanel tuxPanel;
        C201992141u c201992141u = C201992141u.LIZ;
        TakoEnterParams takoEnterParams = (TakoEnterParams) dialogInterfaceOnDismissListenerC20307414d6.l0;
        C1863850ybP c1863850ybP = (C1863850ybP) dialogInterfaceOnDismissListenerC20307414d6.l1;
        c201992141u.getClass();
        WeakReference<TuxPanel> weakReference = C201992141u.LIZLLL;
        if (weakReference != null && (tuxPanel = weakReference.get()) != null) {
            c439540HLk = tuxPanel.LLJJ;
        } else {
            c439540HLk = null;
        }
        if (Intrinsics.LJFF(c439540HLk, C439540HLk.LIZ)) {
            C1862330yYx c1862330yYx = C1862330yYx.LIZ;
            String str2 = takoEnterParams.enterFrom;
            String str3 = takoEnterParams.enterMethod;
            String str4 = takoEnterParams.processId;
            if (c1863850ybP == null || (str = c1863850ybP.LLILZLL) == null) {
                str = "";
            }
            C1862330yYx.LJIIZILJ(c1862330yYx, str2, str3, str4, "language_style_available", "click_background", null, null, null, null, null, null, str, takoEnterParams.takoChatId, 10208);
        }
        C201992141u.LIZLLL = null;
        C320490ChL.LIZ();
    }

    public static final void onDismiss$1(DialogInterfaceOnDismissListenerC20307414d6 dialogInterfaceOnDismissListenerC20307414d6, DialogInterface dialogInterface) {
        Function1<Boolean, Unit> function1;
        InterfaceC20228814De interfaceC20228814De;
        TakoEnterParams takoEnterParams = (TakoEnterParams) dialogInterfaceOnDismissListenerC20307414d6.l0;
        TakoChatContainerData takoChatContainerData = takoEnterParams.chatContainerData;
        if (takoChatContainerData != null && (interfaceC20228814De = takoChatContainerData.sheetCallback) != null) {
            interfaceC20228814De.onDismiss();
        } else {
            SmartSearchItem smartSearchItem = takoEnterParams.smartSearchInfo;
            if (smartSearchItem != null && (function1 = smartSearchItem.onSheetCallback) != null) {
                function1.invoke(Boolean.FALSE);
            }
        }
        String str = TuxSheet._pnsPageId;
        ((TakoSheetFragment) dialogInterfaceOnDismissListenerC20307414d6.l1).LLLLLJIL.invoke(C1391190mJ3.LJIIJJI(dialogInterface));
    }

    public DialogInterfaceOnDismissListenerC20307414d6(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
