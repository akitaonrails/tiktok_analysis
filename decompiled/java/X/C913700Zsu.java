package X;

import android.app.Activity;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.im.messagelist.api.fake.message.FakeMsgOperatorService;
import com.ss.android.ugc.aweme.im.service.analytics.IIMChatDetailAnalytics;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0Zsu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C913700Zsu implements InterfaceC863580XuG {
    public final /* synthetic */ C1229390i65 LIZ;
    public final /* synthetic */ List<String> LIZIZ;
    public final /* synthetic */ C1227700i3M LIZJ;
    public final /* synthetic */ C1229400i66 LIZLLL;
    public final /* synthetic */ InterfaceC863580XuG LJ;
    public final /* synthetic */ C259800zU<C0Y8T> LJFF;

    @Override // X.InterfaceC863580XuG, X.InterfaceC863600XuI
    public final void LIZIZ(C0YMW c0ymw) {
    }

    @Override // X.InterfaceC863580XuG
    /* JADX INFO: renamed from: LIZJ */
    public final void LJ(C0Y8T c0y8t, C0YMW c0ymw) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC863580XuG
    public final void LIZ(C0Y8T c0y8t) throws JSONException {
        String str;
        FakeMsgOperatorService fakeMsgOperatorService;
        this.LJFF.element = c0y8t;
        C1227690i3L.LIZ.LJII = System.currentTimeMillis();
        C913680Zss c913680Zss = C913680Zss.LL;
        C1229390i65 c1229390i65 = this.LIZ;
        C1229400i66 c1229400i66 = this.LIZLLL;
        C1227700i3M c1227700i3M = this.LIZJ;
        c913680Zss.getClass();
        String strLIZIZ = C1229420i68.LIZIZ(c1229390i65.LIZJ);
        String strMapToChatTypeForET = c1229390i65.LIZJ.mapToChatTypeForET();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("type", c1229390i65.LIZJ.mapToType());
        jSONObject.put("list", c1229390i65.LIZ);
        jSONObject.put("chat_type", strMapToChatTypeForET);
        Map<String, String> map = c1229400i66.LIZJ;
        Activity activityLIZIZ = null;
        if (map != null) {
            str = map.get("version");
        } else {
            str = null;
        }
        jSONObject.put("version", str);
        jSONObject.put("group_type", strLIZIZ);
        jSONObject.put("enter_method", c1229400i66.LIZ);
        jSONObject.put("enter_from", c1229400i66.LIZIZ);
        Map<String, String> map2 = c1229400i66.LIZJ;
        if (map2 != null) {
            jSONObject.put("extra_mob_map", new JSONObject(map2));
        }
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("group_type", strLIZIZ);
        jSONObject2.put("chat_type", strMapToChatTypeForET);
        ArrayList arrayList = new ArrayList(c1229390i65.LIZ);
        if (!arrayList.contains(C461720I8s.LIZIZ())) {
            ListProtector.add(arrayList, 0, C461720I8s.LIZIZ());
        }
        jSONObject2.put("member_num", arrayList.size());
        jSONObject2.put("create_group_data", GsonProtectorUtils.toJson(C09EF.LIZ, c1227700i3M));
        jSONObject2.put("conversation_id", c0y8t.getConversationId());
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put("group_type", strLIZIZ);
        jSONObject3.put("chat_type", strMapToChatTypeForET);
        JSONObject jSONObject4 = new JSONObject();
        jSONObject4.put("create_chat", jSONObject);
        jSONObject4.put("group_chat_create_result", jSONObject2);
        jSONObject4.put("imsdk_group_chat_create", jSONObject3);
        String strValueOf = String.valueOf(c0y8t.getConversationShortId());
        Keva kevaLIZLLL = C913680Zss.LIZLLL();
        if (kevaLIZLLL != null) {
            kevaLIZLLL.storeString(C913680Zss.LIZJ(strValueOf), C786410Ut5.J3(jSONObject4));
        }
        AbstractC1387200mCc abstractC1387200mCcLIZIZ = C1906580ziK.LIZIZ();
        if (abstractC1387200mCcLIZIZ != null) {
            activityLIZIZ = abstractC1387200mCcLIZIZ.LIZIZ();
        }
        if (c0y8t.isTemp() && (fakeMsgOperatorService = (FakeMsgOperatorService) PluggableExtentionKt.pluggableSpiForReal(FakeMsgOperatorService.class)) != null) {
            String conversationId = c0y8t.getConversationId();
            C1684506ih c1684506ih = new C1684506ih();
            c1684506ih.LIZLLL(44);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(c0y8t.getConversationId());
            sbLIZ.append("_group_fake_write_success_inline_msg_uuid");
            c1684506ih.LIZJ = C2188811AlT.LIZIZ(sbLIZ);
            c1684506ih.LIZJ(activityLIZIZ);
            fakeMsgOperatorService.LIZIZ(conversationId, c1684506ih, null, null, null);
        }
        InterfaceC863580XuG interfaceC863580XuG = this.LJ;
        if (interfaceC863580XuG != null) {
            interfaceC863580XuG.LIZ(c0y8t);
        }
    }

    @Override // X.InterfaceC863580XuG
    public final void LJFF(C0YMW c0ymw) {
        InterfaceC863580XuG interfaceC863580XuG = this.LJ;
        if (interfaceC863580XuG != null) {
            interfaceC863580XuG.LJFF(c0ymw);
        }
    }

    @Override // X.InterfaceC863600XuI
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
    }

    @Override // X.InterfaceC863580XuG
    public final void LJI(C0YMW c0ymw, C742250T9r c742250T9r) {
        String string;
        String str;
        long j;
        long j2;
        C0ZBV c0zbv;
        String statusMsg;
        C0Y8T c0y8t;
        String conversationId;
        String str2 = null;
        if (c0ymw != null) {
            string = c0ymw.toString();
        } else {
            string = null;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("create group chat result: ");
        sbLIZ.append(false);
        sbLIZ.append(" error: ");
        sbLIZ.append(string);
        C2188811AlT.LIZIZ(sbLIZ);
        String value = this.LIZ.LIZJ.getValue();
        EnumC913760Zt0 enumC913760Zt0 = this.LIZ.LIZJ;
        EnumC913760Zt0 enumC913760Zt02 = EnumC913760Zt0.FAN_GROUP;
        String str3 = "fan_group";
        if (enumC913760Zt0 == enumC913760Zt02) {
            str = "fan_group";
        } else {
            str = "group";
        }
        C1227670i3J.LJIIJJI(c742250T9r, Integer.valueOf(C1232370iAt.LIZIZ(c0ymw)), str, value);
        EnumC913760Zt0 enumC913760Zt03 = this.LIZ.LIZJ;
        if (enumC913760Zt03 != enumC913760Zt02) {
            str3 = "group";
        }
        String value2 = enumC913760Zt03.getValue();
        int size = this.LIZIZ.size();
        if (c742250T9r != null) {
            j = c742250T9r.LIZIZ - c742250T9r.LIZ;
            j2 = c742250T9r.LIZJ - c742250T9r.LIZIZ;
        } else {
            j = -1;
            j2 = -1;
        }
        if (C1232370iAt.LJ(c0ymw)) {
            c0zbv = C0ZBV.BUSINESS_FAIL;
        } else {
            c0zbv = C0ZBV.ABNORMAL_FAIL;
        }
        Integer numValueOf = Integer.valueOf(C1232370iAt.LIZIZ(c0ymw));
        if (c0ymw == null || (statusMsg = c0ymw.getStatusMsg()) == null) {
            statusMsg = "";
        }
        C1227670i3J.LJIIL(new C1227680i3K(null, str3, value2, size, j, j2, 0, c0zbv, numValueOf, statusMsg, 64), this.LIZJ, false);
        IIMChatDetailAnalytics iIMChatDetailAnalytics = (IIMChatDetailAnalytics) PluggableExtentionKt.pluggableSpiForReal(IIMChatDetailAnalytics.class);
        if (iIMChatDetailAnalytics != null) {
            int iLIZIZ = C1232370iAt.LIZIZ(c0ymw);
            String strMapToType = this.LIZ.LIZJ.mapToType();
            C1229390i65 c1229390i65 = this.LIZ;
            List<String> list = c1229390i65.LIZ;
            String strMapToChatTypeForET = c1229390i65.LIZJ.mapToChatTypeForET();
            Map<String, String> map = this.LIZLLL.LIZJ;
            if (map != null) {
                str2 = map.get("version");
            }
            Map<String, String> map2 = this.LIZLLL.LIZJ;
            String strLIZIZ = C1229420i68.LIZIZ(this.LIZ.LIZJ);
            C1229400i66 c1229400i66 = this.LIZLLL;
            iIMChatDetailAnalytics.LIZJ(iLIZIZ, null, strMapToType, list, strMapToChatTypeForET, str2, c1229400i66.LIZ, c1229400i66.LIZIZ, map2, strLIZIZ, false, C0I0B.LJFF.LIZIZ());
        }
        InterfaceC863580XuG interfaceC863580XuG = this.LJ;
        if (interfaceC863580XuG != null) {
            interfaceC863580XuG.LIZIZ(c0ymw);
        }
        if (C913740Zsy.LIZ(this.LJFF.element) && C0YVR.LIZ(C0YVS.LIZ).LJIJJ(c0ymw) && (c0y8t = this.LJFF.element) != null && (conversationId = c0y8t.getConversationId()) != null) {
            C913680Zss.LL.getClass();
            C913680Zss.LJFF(conversationId);
            C1460405ne.LIZ.getClass();
            C1460405ne.LJ(conversationId);
        }
    }

    @Override // X.InterfaceC863560XuE
    public final /* bridge */ /* synthetic */ void LJ(C0Y8T c0y8t, C0YMW c0ymw) {
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:79:? A[RETURN, SYNTHETIC] */
    @Override // X.InterfaceC863580XuG
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZLLL(X.C0Y8T r26, X.C0YMW r27, X.C742250T9r r28) throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 412
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C913700Zsu.LIZLLL(X.0Y8T, X.0YMW, X.0T9r):void");
    }

    public C913700Zsu(C1229390i65 c1229390i65, List<String> list, C1227700i3M c1227700i3M, C1229400i66 c1229400i66, InterfaceC863580XuG interfaceC863580XuG, C259800zU<C0Y8T> c259800zU) {
        this.LIZ = c1229390i65;
        this.LIZIZ = list;
        this.LIZJ = c1227700i3M;
        this.LIZLLL = c1229400i66;
        this.LJ = interfaceC863580XuG;
        this.LJFF = c259800zU;
    }
}
