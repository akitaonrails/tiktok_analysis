package X;

import android.content.Context;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.im.b2c.api.IIMBusinessChatService;
import com.ss.android.ugc.aweme.pns.gatekeeper.api.IGatekeeperService;
import com.ss.android.ugc.aweme.pns.gatekeeper.api.networkservice.DecisionMakerNetworkApi;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0Z4E, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0Z4E {
    public static boolean LIZIZ;
    public static final C0Z4E LIZ = new C0Z4E();
    public static final List<InterfaceC885550Yob> LIZJ = new ArrayList();

    public static boolean LIZ() {
        C19328310jZ c19328310jZ = C19328310jZ.LIZIZ;
        return c19328310jZ.LIZLLL("in_app_im_push") == 1 && c19328310jZ.LIZLLL("in_app_im_msg_req_push") != 1;
    }

    public static boolean LIZIZ() {
        C19328310jZ c19328310jZ = C19328310jZ.LIZIZ;
        return c19328310jZ.LIZLLL("im_push") == 1 && c19328310jZ.LIZLLL("im_msg_req_push") != 1;
    }

    public static InterfaceC625970Ogt LIZLLL() {
        return new C2192381ArE("global", C589170N8x.LIZ("social", "im"), "message_request_prompt_repo").LIZ();
    }

    public static boolean LJFF() {
        InterfaceC1712506nD interfaceC1712506nDLJFF = C1668706g9.LIZ(IIMBusinessChatService.LIZ).LJFF();
        InterfaceC1712506nD.LIZ.getClass();
        return interfaceC1712506nDLJFF.LJI(AnonymousClass0613.LIZ());
    }

    public static boolean LJI() {
        DecisionMakerNetworkApi.EligibilityModel eligibilityModelLIZ;
        IGatekeeperService iGatekeeperService = (IGatekeeperService) PluggableExtentionKt.pluggableSpi$default(IGatekeeperService.class, false, false, false, 14, null);
        return (iGatekeeperService == null || (eligibilityModelLIZ = iGatekeeperService.LIZ("uas_4013")) == null || !eligibilityModelLIZ.isEligible()) ? false : true;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0043  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean LIZJ(java.lang.String r7) {
        /*
            int r1 = r7.hashCode()
            r0 = -849592286(0xffffffffcd5c4022, float:-2.309494E8)
            if (r1 == r0) goto L34
            r0 = -273836283(0xffffffffefad9705, float:-1.0744696E29)
            if (r1 == r0) goto L25
            r0 = 1937299988(0x7378da14, float:1.9716076E31)
            if (r1 != r0) goto L43
            java.lang.String r0 = "message_request_banner"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L43
            com.ss.android.ugc.aweme.im.chatlist.impl.feature.messagerequest.settings.MessageRequestPromptConfig r0 = X.C888800Ytq.LIZLLL()
            com.ss.android.ugc.aweme.im.chatlist.impl.feature.messagerequest.settings.MessageRequestPromptData r6 = r0.messageRequestBannerPromptData
        L21:
            r5 = 0
            if (r6 != 0) goto L45
            return r5
        L25:
            java.lang.String r0 = "inbox_banner"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L43
            com.ss.android.ugc.aweme.im.chatlist.impl.feature.messagerequest.settings.MessageRequestPromptConfig r0 = X.C888800Ytq.LIZLLL()
            com.ss.android.ugc.aweme.im.chatlist.impl.feature.messagerequest.settings.MessageRequestPromptData r6 = r0.inboxBannerPromptData
            goto L21
        L34:
            java.lang.String r0 = "chat_inline_msg"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L43
            com.ss.android.ugc.aweme.im.chatlist.impl.feature.messagerequest.settings.MessageRequestPromptConfig r0 = X.C888800Ytq.LIZLLL()
            com.ss.android.ugc.aweme.im.chatlist.impl.feature.messagerequest.settings.MessageRequestPromptData r6 = r0.chatInlineMsgPromptData
            goto L21
        L43:
            r6 = 0
            goto L21
        L45:
            X.0Ogt r2 = LIZLLL()
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "message_request_prompt_freq_control_repo-"
            r1.append(r0)
            r1.append(r7)
            java.lang.String r1 = X.C2188811AlT.LIZIZ(r1)
            java.lang.String[] r0 = new java.lang.String[r5]
            java.lang.String[] r4 = r2.LJI(r1, r0)
            if (r4 != 0) goto L63
            java.lang.String[] r4 = new java.lang.String[r5]
        L63:
            java.lang.Integer r0 = r6.rounds
            if (r0 == 0) goto La9
            int r3 = r0.intValue()
            java.lang.Integer r0 = r6.days
            if (r0 == 0) goto La9
            int r2 = r0.intValue()
            java.lang.Integer r0 = r6.leaveTimes
            if (r0 == 0) goto La9
            int r0 = r0.intValue()
            int r1 = r4.length
            if (r1 < r0) goto L7f
            return r5
        L7f:
            r0 = 1
            if (r1 >= r3) goto L83
            return r0
        L83:
            int r1 = r1 - r3
            java.lang.Object r0 = X.C13LQ.LJJIIZ(r1, r4)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 == 0) goto La9
            java.lang.Long r0 = X.C2095008Iq.LJIILIIL(r0)
            if (r0 == 0) goto La9
            long r0 = r0.longValue()
            long r3 = java.lang.System.currentTimeMillis()
            long r3 = r3 - r0
            int r0 = r2 * 24
            int r0 = r0 * 60
            int r0 = r0 * 60
            int r0 = r0 * 1000
            long r1 = (long) r0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 < 0) goto La9
            r5 = 1
        La9:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0Z4E.LIZJ(java.lang.String):boolean");
    }

    public static void LJIIJ(String str) {
        List arrayList;
        InterfaceC625970Ogt interfaceC625970OgtLIZLLL = LIZLLL();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("message_request_prompt_freq_control_repo-");
        sbLIZ.append(str);
        String[] strArrLJI = interfaceC625970OgtLIZLLL.LJI(C2188811AlT.LIZIZ(sbLIZ), new String[0]);
        if (strArrLJI != null) {
            arrayList = C13LQ.LJLI(strArrLJI);
        } else {
            arrayList = new ArrayList();
        }
        arrayList.add(String.valueOf(System.currentTimeMillis()));
        if (arrayList.size() > 100) {
            ListProtector.remove(arrayList, 0);
        }
        InterfaceC625970Ogt interfaceC625970OgtLIZLLL2 = LIZLLL();
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("message_request_prompt_freq_control_repo-");
        sbLIZ2.append(str);
        interfaceC625970OgtLIZLLL2.LJII(C2188811AlT.LIZIZ(sbLIZ2), (String[]) arrayList.toArray(new String[0]));
    }

    public static C888640Yta LJ(Context context, String str) {
        boolean z;
        AbstractC888820Yts c1elm;
        if (context == null) {
            return null;
        }
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("getMessageRequestInfoBuilder, scene: ");
        sbLIZ.append(str);
        sbLIZ.append(", canOperationSystemPushTurnOn: ");
        C19328310jZ c19328310jZ = C19328310jZ.LIZIZ;
        if (c19328310jZ.LIZLLL("im_push") == 1 && !C824390WVp.LIZJ(context)) {
            z = true;
        } else {
            z = false;
        }
        sbLIZ.append(z);
        sbLIZ.append(", canOperationOutAppPushTurnOn: ");
        sbLIZ.append(LIZIZ());
        sbLIZ.append(", canOperationInnerAppPushTurnOn: ");
        sbLIZ.append(LIZ());
        C1720106oR.LJI("MessageRequestPromptHelper", C2188811AlT.LIZIZ(sbLIZ));
        if (c19328310jZ.LIZLLL("im_push") == 1 && !C824390WVp.LIZJ(context)) {
            if (LIZ()) {
                c1elm = new C1ELK();
            } else {
                c1elm = new C1ELL();
            }
        } else if (LIZIZ()) {
            if (LIZ()) {
                c1elm = new C1ELN();
            } else {
                c1elm = new C1ELO();
            }
        } else {
            if (!LIZ()) {
                return null;
            }
            c1elm = new C1ELM();
        }
        return c1elm.LIZIZ(context, str);
    }

    public static boolean LJII(int i, Context context) {
        int i2 = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("openInnerAppSetting, times:");
        sbLIZ.append(i);
        C1720106oR.LJI("MessageRequestPromptHelper", C2188811AlT.LIZIZ(sbLIZ));
        try {
            C612100Nzc.LIZ(C19296410eQ.LIZIZ, "in_app_im_msg_req_push,1", false, 6);
            LIZ.getClass();
            C19EG c19egLIZIZ = C1388190mED.LIZIZ(context);
            if (c19egLIZIZ != null) {
                C1389890mGx c1389890mGx = new C1389890mGx(c19egLIZIZ);
                c1389890mGx.LJIIIZ(2131837234);
                c1389890mGx.LJIIJJI();
            }
            return true;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            int i3 = C2187451AjH.LIZ;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("openInnerAppSetting, e: ");
            sbLIZ2.append(e);
            C1720106oR.LIZ("MessageRequestPromptHelper", C2188811AlT.LIZIZ(sbLIZ2));
            if (i == 2) {
                C19EG c19egLIZIZ2 = C1388190mED.LIZIZ(context);
                if (c19egLIZIZ2 != null) {
                    C1389890mGx c1389890mGx2 = new C1389890mGx(c19egLIZIZ2);
                    c1389890mGx2.LJIIIZ(2131848597);
                    c1389890mGx2.LJIIJJI();
                }
                return false;
            }
            return LJII(i + 1, context);
        }
    }

    public static boolean LJIIIIZZ(Context context, int i, boolean z) {
        int i2 = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("openOutAppSetting, needShowToast: ");
        sbLIZ.append(z);
        sbLIZ.append(", times:");
        sbLIZ.append(i);
        C1720106oR.LJI("MessageRequestPromptHelper", C2188811AlT.LIZIZ(sbLIZ));
        try {
            C612100Nzc.LIZ(C19296410eQ.LIZIZ, "im_msg_req_push,1", false, 6);
            if (z) {
                LIZ.getClass();
                C19EG c19egLIZIZ = C1388190mED.LIZIZ(context);
                if (c19egLIZIZ != null) {
                    C1389890mGx c1389890mGx = new C1389890mGx(c19egLIZIZ);
                    c1389890mGx.LJIIIZ(2131837234);
                    c1389890mGx.LJIIJJI();
                }
            }
            return true;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            int i3 = C2187451AjH.LIZ;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("openOutAppSetting, e: ");
            sbLIZ2.append(e);
            C1720106oR.LIZ("MessageRequestPromptHelper", C2188811AlT.LIZIZ(sbLIZ2));
            if (i == 2) {
                C19EG c19egLIZIZ2 = C1388190mED.LIZIZ(context);
                if (c19egLIZIZ2 != null) {
                    C1389890mGx c1389890mGx2 = new C1389890mGx(c19egLIZIZ2);
                    c1389890mGx2.LJIIIZ(2131848597);
                    c1389890mGx2.LJIIJJI();
                }
                return false;
            }
            return LJIIIIZZ(context, i + 1, z);
        }
    }
}
