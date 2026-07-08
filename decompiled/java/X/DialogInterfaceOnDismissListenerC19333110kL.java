package X;

import android.app.Activity;
import android.content.DialogInterface;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import com.bytedance.poplayer.core.PopupManager;
import com.bytedance.tux.sheet.intro.TuxPanel;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.live.notification.ui.NotificationLiveBottomDialog;
import com.ss.android.ugc.aweme.unifiedauthapi.model.UnifiedAuthPopupConfig;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.10kL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public class DialogInterfaceOnDismissListenerC19333110kL implements DialogInterface.OnDismissListener {
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
            case 3:
                onDismiss$3(this, dialogInterface);
                break;
            case 4:
                onDismiss$4(this, dialogInterface);
                break;
            case 5:
                onDismiss$5(this, dialogInterface);
                break;
        }
    }

    public static final void onDismiss$0(DialogInterfaceOnDismissListenerC19333110kL dialogInterfaceOnDismissListenerC19333110kL, DialogInterface dialogInterface) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TuxSheet.onDismiss(");
        String str = TuxSheet._pnsPageId;
        sbLIZ.append(C1391190mJ3.LJIIJJI(dialogInterface));
        sbLIZ.append(')');
        C2188811AlT.LIZIZ(sbLIZ);
        C211000rc.LIZ("[Push]");
        ((C19208610Cu) dialogInterfaceOnDismissListenerC19333110kL.l0).LLILLJJLI.LIZJ(dialogInterface);
        ((C20656615sK) dialogInterfaceOnDismissListenerC19333110kL.l1).LIZ();
        C10DT c10dt = ((C19208610Cu) dialogInterfaceOnDismissListenerC19333110kL.l0).LLILLL;
        if (c10dt != null) {
            c10dt.LIZ(C1391190mJ3.LJIIJJI(dialogInterface));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [X.09AY, kotlin.jvm.functions.Function0] */
    public static final void onDismiss$1(DialogInterfaceOnDismissListenerC19333110kL dialogInterfaceOnDismissListenerC19333110kL, DialogInterface dialogInterface) {
        TuxPanel tuxPanel;
        ?? r0;
        C11FX c11fx = (C11FX) dialogInterfaceOnDismissListenerC19333110kL.l0;
        if (!c11fx.LJIIL && (tuxPanel = (TuxPanel) ((C259800zU) dialogInterfaceOnDismissListenerC19333110kL.l1).element) != null) {
            if ((tuxPanel.LLJILLL != null || (tuxPanel != null && tuxPanel.LLJJ != null)) && (r0 = c11fx.LJIIJ) != 0) {
                r0.invoke();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void onDismiss$2(DialogInterfaceOnDismissListenerC19333110kL dialogInterfaceOnDismissListenerC19333110kL, DialogInterface dialogInterface) {
        PopupManager.LIZJ(((C19208010Co) dialogInterfaceOnDismissListenerC19333110kL.l0).getClass());
        TuxPanel tuxPanel = (TuxPanel) ((C259800zU) dialogInterfaceOnDismissListenerC19333110kL.l1).element;
        if (tuxPanel != null && tuxPanel.LLJJ != null) {
            C19209010Cy c19209010Cy = C19209010Cy.LIZ;
            UnifiedAuthPopupConfig unifiedAuthPopupConfig = ((C19208010Co) dialogInterfaceOnDismissListenerC19333110kL.l0).LLILLJJLI;
            String str = unifiedAuthPopupConfig.enterFrom;
            String str2 = unifiedAuthPopupConfig.subSceneId;
            String str3 = unifiedAuthPopupConfig.trigger;
            c19209010Cy.getClass();
            C19209010Cy.LIZLLL(str, str2, str3, "click_background", null);
        }
    }

    public static final void onDismiss$3(DialogInterfaceOnDismissListenerC19333110kL dialogInterfaceOnDismissListenerC19333110kL, DialogInterface dialogInterface) {
        DialogFragment dialogFragment;
        ((NotificationLiveBottomDialog) dialogInterfaceOnDismissListenerC19333110kL.l0).LLLFZ.onDismiss(dialogInterface);
        C1107690evn c1107690evn = C464800IKo.LIZ;
        Fragment fragmentLJJJJZI = ((C19EG) ((Activity) dialogInterfaceOnDismissListenerC19333110kL.l1)).getSupportFragmentManager().LJJJJZI("NotificationLiveDialog");
        if (fragmentLJJJJZI instanceof DialogFragment) {
            dialogFragment = (DialogFragment) fragmentLJJJJZI;
        } else {
            dialogFragment = null;
        }
        c1107690evn.LJIIZILJ(dialogFragment);
    }

    public static final void onDismiss$4(DialogInterfaceOnDismissListenerC19333110kL dialogInterfaceOnDismissListenerC19333110kL, DialogInterface dialogInterface) {
        ((C20656615sK) dialogInterfaceOnDismissListenerC19333110kL.l0).LIZ();
        String str = TuxSheet._pnsPageId;
        AbstractC343940De4 abstractC343940De4LJIIJJI = C1391190mJ3.LJIIJJI(dialogInterface);
        if (!Intrinsics.LJFF(abstractC343940De4LJIIJJI, C343970De7.LIZ) && !Intrinsics.LJFF(abstractC343940De4LJIIJJI, C343960De6.LIZ)) {
            if (Intrinsics.LJFF(abstractC343940De4LJIIJJI, C343980De8.LIZ)) {
                ((C1912660zs8) dialogInterfaceOnDismissListenerC19333110kL.l1).LJIIL("click_close_button");
                return;
            }
            return;
        }
        ((C1912660zs8) dialogInterfaceOnDismissListenerC19333110kL.l1).LJIIL("click_background");
    }

    public static final void onDismiss$5(DialogInterfaceOnDismissListenerC19333110kL dialogInterfaceOnDismissListenerC19333110kL, DialogInterface dialogInterface) {
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TuxSheet.onDismiss(");
        String str = TuxSheet._pnsPageId;
        sbLIZ.append(C1391190mJ3.LJIIJJI(dialogInterface));
        sbLIZ.append(')');
        C2188811AlT.LIZIZ(sbLIZ);
        ((C1917360zzi) dialogInterfaceOnDismissListenerC19333110kL.l0).LLILLJJLI.LIZLLL(dialogInterface);
        ((C20656615sK) dialogInterfaceOnDismissListenerC19333110kL.l1).LIZ();
        InterfaceC1917380zzk interfaceC1917380zzk = ((C1917360zzi) dialogInterfaceOnDismissListenerC19333110kL.l0).LLILLL;
        if (interfaceC1917380zzk != null) {
            interfaceC1917380zzk.LIZ(C1391190mJ3.LJIIJJI(dialogInterface));
        }
    }

    public DialogInterfaceOnDismissListenerC19333110kL(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
