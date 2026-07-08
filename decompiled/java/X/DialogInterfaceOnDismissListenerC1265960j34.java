package X;

import android.content.DialogInterface;
import android.view.View;
import com.bytedance.tux.sheet.intro.TuxPanel;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.inbox.search.InboxSearchFilterUserListFragment;
import com.ss.android.ugc.aweme.inbox.search.assem.InboxSearchResultContainer;
import com.ss.android.ugc.aweme.minis.common.SchemaParserData;
import com.ss.android.ugc.aweme.minis.model.payment.subscription.MinisSubscriptionInfo;
import com.ss.android.ugc.aweme.minis.payment.subscription.page.MinisSubscriptionDetailActivity;
import com.ss.android.ugc.aweme.upvote.detail.repostshare.IRepostChannelShareAbility;
import com.ss.android.ugc.aweme.upvote.detail.repostshare.RepostSharePanel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0j34, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public class DialogInterfaceOnDismissListenerC1265960j34 implements DialogInterface.OnDismissListener {
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
        }
    }

    public DialogInterfaceOnDismissListenerC1265960j34(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void onDismiss$0(X.DialogInterfaceOnDismissListenerC1265960j34 r4, android.content.DialogInterface r5) {
        /*
            java.lang.Object r0 = r4.l0
            com.ss.android.ugc.aweme.account.login.email.EmailPopUpFragment r0 = (com.ss.android.ugc.aweme.account.login.email.EmailPopUpFragment) r0
            com.bytedance.tux.sheet.sheet.TuxSheet r0 = r0.LLLLLLJ
            r2 = 0
            if (r0 != 0) goto La
            r0 = r2
        La:
            android.os.Bundle r1 = r0.getArguments()
            if (r1 == 0) goto L3b
            java.lang.Object r0 = r4.l0
            com.ss.android.ugc.aweme.account.login.email.EmailPopUpFragment r0 = (com.ss.android.ugc.aweme.account.login.email.EmailPopUpFragment) r0
            java.lang.String r0 = r0.LLLLLL
            boolean r0 = r1.getBoolean(r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            if (r0 == 0) goto L3b
            java.lang.Object r0 = r4.l0
            com.ss.android.ugc.aweme.account.login.email.EmailPopUpFragment r0 = (com.ss.android.ugc.aweme.account.login.email.EmailPopUpFragment) r0
            com.bytedance.tux.sheet.sheet.TuxSheet r0 = r0.LLLLLLJ
            if (r0 == 0) goto L29
            r2 = r0
        L29:
            android.os.Bundle r1 = r2.getArguments()
            if (r1 == 0) goto L59
            java.lang.Object r0 = r4.l0
            com.ss.android.ugc.aweme.account.login.email.EmailPopUpFragment r0 = (com.ss.android.ugc.aweme.account.login.email.EmailPopUpFragment) r0
            java.lang.String r0 = r0.LLLLLL
            boolean r0 = r1.getBoolean(r0)
            if (r0 != 0) goto L59
        L3b:
            X.0iK5 r3 = X.C1238070iK5.LIZ
            java.lang.Object r0 = r4.l0
            com.ss.android.ugc.aweme.account.login.email.EmailPopUpFragment r0 = (com.ss.android.ugc.aweme.account.login.email.EmailPopUpFragment) r0
            int r0 = r0.LLLLJI
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            java.lang.Object r0 = r4.l0
            com.ss.android.ugc.aweme.account.login.email.EmailPopUpFragment r0 = (com.ss.android.ugc.aweme.account.login.email.EmailPopUpFragment) r0
            boolean r0 = r0.LLLLLIL
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            r3.getClass()
            java.lang.String r0 = "external_exit"
            X.C1238070iK5.LIZJ(r1, r2, r0)
        L59:
            java.lang.Object r0 = r4.l0
            com.ss.android.ugc.aweme.account.login.email.EmailPopUpFragment r0 = (com.ss.android.ugc.aweme.account.login.email.EmailPopUpFragment) r0
            X.15sK r0 = r0.LLLLLJIL
            if (r0 == 0) goto L64
            r0.LIZ()
        L64:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.DialogInterfaceOnDismissListenerC1265960j34.onDismiss$0(X.0j34, android.content.DialogInterface):void");
    }

    public static final void onDismiss$1(DialogInterfaceOnDismissListenerC1265960j34 dialogInterfaceOnDismissListenerC1265960j34, DialogInterface dialogInterface) {
        InboxSearchFilterUserListFragment inboxSearchFilterUserListFragment = (InboxSearchFilterUserListFragment) ((InboxSearchResultContainer) dialogInterfaceOnDismissListenerC1265960j34.l0).LLJJJJ.getValue();
        View viewFindViewById = inboxSearchFilterUserListFragment.LLILZ;
        if (viewFindViewById == null) {
            View view = inboxSearchFilterUserListFragment.getView();
            if (view != null) {
                viewFindViewById = view.findViewById(R.id.kjw);
            } else {
                viewFindViewById = null;
            }
            inboxSearchFilterUserListFragment.LLILZ = (C1242080iQY) viewFindViewById;
        }
        ((C1242080iQY) viewFindViewById).getEditText().setText("");
    }

    public static final void onDismiss$2(DialogInterfaceOnDismissListenerC1265960j34 dialogInterfaceOnDismissListenerC1265960j34, DialogInterface dialogInterface) {
        String str = TuxSheet._pnsPageId;
        AbstractC343940De4 abstractC343940De4LJIIJJI = C1391190mJ3.LJIIJJI(dialogInterface);
        if (abstractC343940De4LJIIJJI instanceof C1230320i7a) {
            InterfaceC1229620i6S callback = ((AbstractC1230540i7w) dialogInterfaceOnDismissListenerC1265960j34.l0).getCallback();
            if (callback != null) {
                callback.LIZIZ(((C1230320i7a) abstractC343940De4LJIIJJI).LIZ);
                return;
            }
            return;
        }
        InterfaceC1229620i6S callback2 = ((AbstractC1230540i7w) dialogInterfaceOnDismissListenerC1265960j34.l0).getCallback();
        if (callback2 == null) {
            return;
        }
        callback2.LIZ(null);
    }

    public static final void onDismiss$3(DialogInterfaceOnDismissListenerC1265960j34 dialogInterfaceOnDismissListenerC1265960j34, DialogInterface dialogInterface) {
        C1371590lnR c1371590lnRZ2 = null;
        IRepostChannelShareAbility iRepostChannelShareAbility = (IRepostChannelShareAbility) C1558520qew.LIZ(C1558360qeg.LJFF((RepostSharePanel) dialogInterfaceOnDismissListenerC1265960j34.l0, null), IRepostChannelShareAbility.class, null);
        if (iRepostChannelShareAbility != null) {
            c1371590lnRZ2 = iRepostChannelShareAbility.Z2();
        }
        ArrayList<JSONObject> arrayList = C1369870lkf.LIZ;
        C1369870lkf.LJ(((RepostSharePanel) dialogInterfaceOnDismissListenerC1265960j34.l0).LLJJIJIL, c1371590lnRZ2);
    }

    public static final void onDismiss$4(DialogInterfaceOnDismissListenerC1265960j34 dialogInterfaceOnDismissListenerC1265960j34, DialogInterface dialogInterface) {
        Set<String> set = C1398100mUC.LIZJ;
        if (set.isEmpty()) {
            C1398100mUC c1398100mUC = C1398100mUC.LIZ;
            Map mapLIZJ = C2097908Jt.LIZJ(new Pair("action", "cancel"));
            c1398100mUC.getClass();
            C1398100mUC.LIZJ("fundraiser_amplification_sheet_click", mapLIZJ);
        }
        if (!set.contains("post") && !set.contains("story")) {
            ComplianceServiceProvider.LJIILL().LJIIIZ();
        }
        ((C259800zU) dialogInterfaceOnDismissListenerC1265960j34.l0).element = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void onDismiss$5(DialogInterfaceOnDismissListenerC1265960j34 dialogInterfaceOnDismissListenerC1265960j34, DialogInterface dialogInterface) {
        TuxPanel tuxPanel = (TuxPanel) ((C259800zU) dialogInterfaceOnDismissListenerC1265960j34.l0).element;
        Object obj = null;
        if (tuxPanel != null) {
            if (tuxPanel.LLJILLL != null) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("popup dismissed: button=close (reason=");
                TuxPanel tuxPanel2 = (TuxPanel) ((C259800zU) dialogInterfaceOnDismissListenerC1265960j34.l0).element;
                if (tuxPanel2 != null) {
                    obj = tuxPanel2.LLJILLL;
                }
                sbLIZ.append(obj);
                sbLIZ.append(')');
                C2188811AlT.LIZIZ(sbLIZ);
                C1245740iWS.LIZ("close");
                return;
            }
            if (tuxPanel != null) {
                obj = tuxPanel.LLJJ;
            }
        }
        if (!Intrinsics.LJFF(obj, C439540HLk.LIZ)) {
            return;
        }
        C1245740iWS.LIZ("blank");
    }

    public static final void onDismiss$6(DialogInterfaceOnDismissListenerC1265960j34 dialogInterfaceOnDismissListenerC1265960j34, DialogInterface dialogInterface) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5 = TuxSheet._pnsPageId;
        AbstractC343940De4 abstractC343940De4LJIIJJI = C1391190mJ3.LJIIJJI(dialogInterface);
        if (Intrinsics.LJFF(abstractC343940De4LJIIJJI, C343970De7.LIZ) || Intrinsics.LJFF(abstractC343940De4LJIIJJI, C343960De6.LIZ)) {
            MinisSubscriptionInfo minisSubscriptionInfo = ((MinisSubscriptionDetailActivity) dialogInterfaceOnDismissListenerC1265960j34.l0).LLJJIJIL;
            String str6 = "";
            if (minisSubscriptionInfo == null || (str = minisSubscriptionInfo.clientKey) == null) {
                str = "";
            }
            SchemaParserData.Companion.getClass();
            String strLIZ = C2196291AxX.LIZ(str);
            MinisSubscriptionInfo minisSubscriptionInfo2 = ((MinisSubscriptionDetailActivity) dialogInterfaceOnDismissListenerC1265960j34.l0).LLJJIJIL;
            if (minisSubscriptionInfo2 != null && (str4 = minisSubscriptionInfo2.tierId) != null) {
                str6 = str4;
            }
            Integer num = null;
            if (minisSubscriptionInfo2 != null) {
                str2 = minisSubscriptionInfo2.symbol;
                str3 = minisSubscriptionInfo2.amount;
                num = minisSubscriptionInfo2.deductCycle;
            } else {
                str2 = null;
                str3 = null;
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(str2);
            sbLIZ.append(str3);
            sbLIZ.append('/');
            sbLIZ.append(num);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            C1232610iBH c1232610iBH = C1232610iBH.LIZ;
            EnumC1232600iBG enumC1232600iBG = EnumC1232600iBG.BACKGROUND;
            c1232610iBH.getClass();
            C1232610iBH.LIZIZ(str, strLIZ, str6, strLIZIZ, enumC1232600iBG);
        }
        int i = C2187451AjH.LIZ;
        dialogInterface.toString();
    }

    public static final void onDismiss$7(DialogInterfaceOnDismissListenerC1265960j34 dialogInterfaceOnDismissListenerC1265960j34, DialogInterface dialogInterface) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5 = TuxSheet._pnsPageId;
        AbstractC343940De4 abstractC343940De4LJIIJJI = C1391190mJ3.LJIIJJI(dialogInterface);
        if (Intrinsics.LJFF(abstractC343940De4LJIIJJI, C343970De7.LIZ) || Intrinsics.LJFF(abstractC343940De4LJIIJJI, C343960De6.LIZ)) {
            MinisSubscriptionInfo minisSubscriptionInfo = ((MinisSubscriptionDetailActivity) dialogInterfaceOnDismissListenerC1265960j34.l0).LLJJIJIL;
            String str6 = "";
            if (minisSubscriptionInfo == null || (str = minisSubscriptionInfo.clientKey) == null) {
                str = "";
            }
            SchemaParserData.Companion.getClass();
            String strLIZ = C2196291AxX.LIZ(str);
            MinisSubscriptionInfo minisSubscriptionInfo2 = ((MinisSubscriptionDetailActivity) dialogInterfaceOnDismissListenerC1265960j34.l0).LLJJIJIL;
            if (minisSubscriptionInfo2 != null && (str4 = minisSubscriptionInfo2.tierId) != null) {
                str6 = str4;
            }
            Integer num = null;
            if (minisSubscriptionInfo2 != null) {
                str2 = minisSubscriptionInfo2.symbol;
                str3 = minisSubscriptionInfo2.amount;
                num = minisSubscriptionInfo2.deductCycle;
            } else {
                str2 = null;
                str3 = null;
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(str2);
            sbLIZ.append(str3);
            sbLIZ.append('/');
            sbLIZ.append(num);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            C1232610iBH c1232610iBH = C1232610iBH.LIZ;
            EnumC1232600iBG enumC1232600iBG = EnumC1232600iBG.BACKGROUND;
            c1232610iBH.getClass();
            C1232610iBH.LIZ(str, strLIZ, str6, strLIZIZ, enumC1232600iBG);
        }
        int i = C2187451AjH.LIZ;
        dialogInterface.toString();
        Objects.toString(abstractC343940De4LJIIJJI);
    }
}
