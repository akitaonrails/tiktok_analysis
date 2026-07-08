package X;

import android.content.DialogInterface;
import android.widget.LinearLayout;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.live.notification.ui.NotificationFollowDialog;
import com.ss.android.ugc.aweme.live.notification.ui.NotificationLiveBottomDialog;
import com.ss.android.ugc.aweme.pns.universalpopup.core.ui.p007default.UniversalPopupBlocksUI;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.aweme.unifiedauthapi.model.UnifiedAuthPopupConfig;
import com.ss.android.ugc.tiktok.tpsc.privacy.account.effectcount.NoPAControlSettings;
import com.tts.oecverify.BdTuring;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.10kI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public class DialogInterfaceOnCancelListenerC19332810kI implements DialogInterface.OnCancelListener {
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
            case 4:
                onCancel$4(this, dialogInterface);
                break;
            case 5:
                onCancel$5(this, dialogInterface);
                break;
            case 6:
                onCancel$6(this, dialogInterface);
                break;
            case 7:
                onCancel$7(this, dialogInterface);
                break;
            case 8:
                onCancel$8(this, dialogInterface);
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                onCancel$9(this, dialogInterface);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                onCancel$10(this, dialogInterface);
                break;
            case BdTuring.TYPE_EMAIL /* 11 */:
                onCancel$11(this, dialogInterface);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                onCancel$12(this, dialogInterface);
                break;
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                onCancel$13(this, dialogInterface);
                break;
            case 14:
                onCancel$14(this, dialogInterface);
                break;
        }
    }

    public DialogInterfaceOnCancelListenerC19332810kI(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onCancel$0(DialogInterfaceOnCancelListenerC19332810kI dialogInterfaceOnCancelListenerC19332810kI, DialogInterface dialogInterface) {
        Function0 function0 = (Function0) dialogInterfaceOnCancelListenerC19332810kI.l0;
        if (function0 != null) {
            function0.invoke();
        }
    }

    public static final void onCancel$1(DialogInterfaceOnCancelListenerC19332810kI dialogInterfaceOnCancelListenerC19332810kI, DialogInterface dialogInterface) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TuxSheet.onCancel(");
        String str = TuxSheet._pnsPageId;
        sbLIZ.append(C1391190mJ3.LJIIJ(dialogInterface));
        sbLIZ.append(')');
        C2188811AlT.LIZIZ(sbLIZ);
        C211000rc.LIZ("[Push]");
        if (C1391190mJ3.LJIIJJI(dialogInterface) instanceof C343970De7) {
            ViewOnClickListenerC19207210Cg viewOnClickListenerC19207210Cg = ((C19208610Cu) dialogInterfaceOnCancelListenerC19332810kI.l0).LLILLJJLI;
            viewOnClickListenerC19207210Cg.getClass();
            C211000rc.LIZ("[Push]");
            viewOnClickListenerC19207210Cg.LLJJJIL = true;
        }
    }

    public static final void onCancel$10(DialogInterfaceOnCancelListenerC19332810kI dialogInterfaceOnCancelListenerC19332810kI, DialogInterface dialogInterface) {
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TuxSheet.onCancel(");
        String str = TuxSheet._pnsPageId;
        sbLIZ.append(C1391190mJ3.LJIIJ(dialogInterface));
        sbLIZ.append(')');
        C2188811AlT.LIZIZ(sbLIZ);
        if (C1391190mJ3.LJIIJJI(dialogInterface) instanceof C343970De7) {
            C10CQ c10cq = ((C1917360zzi) dialogInterfaceOnCancelListenerC19332810kI.l0).LLILLJJLI;
            c10cq.getClass();
            c10cq.LLJLLL = true;
        }
    }

    public static final void onCancel$11(DialogInterfaceOnCancelListenerC19332810kI dialogInterfaceOnCancelListenerC19332810kI, DialogInterface dialogInterface) {
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TuxSheet.onCancel(");
        String str = TuxSheet._pnsPageId;
        sbLIZ.append(C1391190mJ3.LJIIJ(dialogInterface));
        sbLIZ.append(')');
        C2188811AlT.LIZIZ(sbLIZ);
        if (C1391190mJ3.LJIIJJI(dialogInterface) instanceof C343970De7) {
            C10CQ c10cq = ((C1917370zzj) dialogInterfaceOnCancelListenerC19332810kI.l0).LLILLJJLI;
            c10cq.getClass();
            c10cq.LLJLLL = true;
        }
    }

    public static final void onCancel$12(DialogInterfaceOnCancelListenerC19332810kI dialogInterfaceOnCancelListenerC19332810kI, DialogInterface dialogInterface) {
        ((EnumC19280010bm) dialogInterfaceOnCancelListenerC19332810kI.l0).uploadEvent("click_permission_sheet", new Pair<>("action", "dismiss"));
    }

    public static final void onCancel$13(DialogInterfaceOnCancelListenerC19332810kI dialogInterfaceOnCancelListenerC19332810kI, DialogInterface dialogInterface) {
        ((C19226610Js) dialogInterfaceOnCancelListenerC19332810kI.l0).LIZ.invoke();
    }

    public static final void onCancel$14(DialogInterfaceOnCancelListenerC19332810kI dialogInterfaceOnCancelListenerC19332810kI, DialogInterface dialogInterface) {
        ((C19226610Js) dialogInterfaceOnCancelListenerC19332810kI.l0).LIZ.invoke();
    }

    public static final void onCancel$2(DialogInterfaceOnCancelListenerC19332810kI dialogInterfaceOnCancelListenerC19332810kI, DialogInterface dialogInterface) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TuxSheet.onCancel(");
        String str = TuxSheet._pnsPageId;
        sbLIZ.append(C1391190mJ3.LJIIJ(dialogInterface));
        sbLIZ.append(')');
        C2188811AlT.LIZIZ(sbLIZ);
        C211000rc.LIZ("[Push]");
        if (C1391190mJ3.LJIIJJI(dialogInterface) instanceof C343970De7) {
            ViewOnClickListenerC19207210Cg viewOnClickListenerC19207210Cg = ((C19208810Cw) dialogInterfaceOnCancelListenerC19332810kI.l0).LLILLJJLI;
            viewOnClickListenerC19207210Cg.getClass();
            C211000rc.LIZ("[Push]");
            viewOnClickListenerC19207210Cg.LLJJJIL = true;
        }
    }

    public static final void onCancel$3(DialogInterfaceOnCancelListenerC19332810kI dialogInterfaceOnCancelListenerC19332810kI, DialogInterface dialogInterface) {
        C10EW c10ew = ((NotificationLiveBottomDialog) dialogInterfaceOnCancelListenerC19332810kI.l0).LLJ;
        if (c10ew != null) {
            c10ew.LIZJ();
        }
        LinearLayout linearLayoutBS = ((NotificationLiveBottomDialog) dialogInterfaceOnCancelListenerC19332810kI.l0).bS();
        if (linearLayoutBS != null && linearLayoutBS.getVisibility() == 0) {
            C1022820ciu c1022820ciuLIZLLL = C2184171Adz.LIZLLL("homepage_ad", "otherclick", ((NotificationLiveBottomDialog) dialogInterfaceOnCancelListenerC19332810kI.l0).LLIZLLLIL);
            c1022820ciuLIZLLL.LIZJ("manage_page", "refer");
            c1022820ciuLIZLLL.LIZIZ(((NotificationLiveBottomDialog) dialogInterfaceOnCancelListenerC19332810kI.l0).LLIZ, "enter_from");
            c1022820ciuLIZLLL.LIZIZ(2, "notification_choose_type");
            c1022820ciuLIZLLL.LJII();
        }
    }

    public static final void onCancel$4(DialogInterfaceOnCancelListenerC19332810kI dialogInterfaceOnCancelListenerC19332810kI, DialogInterface dialogInterface) {
        CompletionBlock completionBlock = (CompletionBlock) dialogInterfaceOnCancelListenerC19332810kI.l0;
        XBaseModel xBaseModelLIZJ = C1909107dp.LIZJ(InterfaceC1887310zDF.class, null);
        ((InterfaceC1887310zDF) xBaseModelLIZJ).setAction("mask");
        completionBlock.onSuccess((XBaseResultModel) xBaseModelLIZJ, "");
    }

    public static final void onCancel$5(DialogInterfaceOnCancelListenerC19332810kI dialogInterfaceOnCancelListenerC19332810kI, DialogInterface dialogInterface) {
        C10EW c10ew = ((NotificationFollowDialog) dialogInterfaceOnCancelListenerC19332810kI.l0).LLILZLL;
        if (c10ew != null) {
            c10ew.LIZJ();
        }
    }

    public static final void onCancel$6(DialogInterfaceOnCancelListenerC19332810kI dialogInterfaceOnCancelListenerC19332810kI, DialogInterface dialogInterface) {
        InterfaceC1887370zDL interfaceC1887370zDL = (InterfaceC1887370zDL) dialogInterfaceOnCancelListenerC19332810kI.l0;
        C1887360zDK c1887360zDK = new C1887360zDK();
        c1887360zDK.LIZ = "mask";
        interfaceC1887370zDL.LIZ(c1887360zDK, "");
    }

    public static final void onCancel$7(DialogInterfaceOnCancelListenerC19332810kI dialogInterfaceOnCancelListenerC19332810kI, DialogInterface dialogInterface) {
        String str;
        Integer numValueOf;
        C106N.LIZ("cancel");
        if (C306820C0y.LIZ()) {
            if (((C013C) dialogInterfaceOnCancelListenerC19332810kI.l0).element) {
                str = "subtitle";
            } else {
                str = "bullet";
            }
            C106V.LIZ.getClass();
            C106V.LIZIZ().getClass();
            NoPAControlSettings noPAControlSettingsLJIIJ = C191880104w.LJIIJ();
            Integer numValueOf2 = null;
            if (noPAControlSettingsLJIIJ != null) {
                numValueOf = Integer.valueOf(noPAControlSettingsLJIIJ.download);
            } else {
                numValueOf = null;
            }
            C106V.LIZIZ().getClass();
            NoPAControlSettings noPAControlSettingsLJIIJ2 = C191880104w.LJIIJ();
            if (noPAControlSettingsLJIIJ2 != null) {
                numValueOf2 = Integer.valueOf(noPAControlSettingsLJIIJ2.contentReusePermission);
            }
            C106N.LIZIZ(numValueOf, numValueOf2, "exit", str);
        }
    }

    public static final void onCancel$8(DialogInterfaceOnCancelListenerC19332810kI dialogInterfaceOnCancelListenerC19332810kI, DialogInterface dialogInterface) {
        ((UniversalPopupBlocksUI) dialogInterfaceOnCancelListenerC19332810kI.l0).cS("outside");
    }

    public static final void onCancel$9(DialogInterfaceOnCancelListenerC19332810kI dialogInterfaceOnCancelListenerC19332810kI, DialogInterface dialogInterface) {
        String str;
        C10DT c10dt = ((C19208110Cp) dialogInterfaceOnCancelListenerC19332810kI.l0).LLILZ;
        if (c10dt != null) {
            c10dt.LIZ(C10CV.LIZ);
        }
        C19209010Cy c19209010Cy = C19209010Cy.LIZ;
        C19208110Cp c19208110Cp = (C19208110Cp) dialogInterfaceOnCancelListenerC19332810kI.l0;
        UnifiedAuthPopupConfig unifiedAuthPopupConfig = c19208110Cp.LLILLJJLI;
        String str2 = unifiedAuthPopupConfig.enterFrom;
        String str3 = unifiedAuthPopupConfig.trigger;
        if (c19208110Cp.LJIIL()) {
            str = "subscription";
        } else {
            str = "consent";
        }
        UnifiedAuthPopupConfig unifiedAuthPopupConfig2 = ((C19208110Cp) dialogInterfaceOnCancelListenerC19332810kI.l0).LLILLJJLI;
        String str4 = unifiedAuthPopupConfig2.sceneId;
        String str5 = unifiedAuthPopupConfig2.subSceneId;
        c19209010Cy.getClass();
        C19209010Cy.LIZIZ(str2, str3, str, "cancel", str4, str5);
    }
}
