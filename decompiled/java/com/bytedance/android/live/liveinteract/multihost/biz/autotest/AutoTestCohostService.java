package com.bytedance.android.live.liveinteract.multihost.biz.autotest;

import X.C13BV;
import X.C15438062q;
import X.C2097608Jq;
import X.C2097908Jt;
import X.C2188811AlT;
import X.C786410Ut5;
import X.C915980Zwa;
import X.C920570a3z;
import X.C920630a45;
import X.C948660anI;
import X.C954460awe;
import X.EnumC959750b5B;
import X.InterfaceC920680a4A;
import X.InterfaceC950010apT;
import X.InterfaceC954180awC;
import X.InterfaceC958070b2T;
import com.bytedance.android.livesdk.comp.api.linkcore.IAutoTestCohostService;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkCoreError;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkUser;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.text.a0;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes16.dex */
public class AutoTestCohostService implements IAutoTestCohostService {
    public DataChannel dataChannel;
    public static final C948660anI Companion = new Object() { // from class: X.0anI
    };
    public static final int $stable = 8;

    public /* bridge */ /* synthetic */ void onInit() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r6v0, types: [com.bytedance.android.live.liveinteract.multihost.biz.autotest.AutoTestCohostService] */
    private final <T> Map<String, List<String>> listOfObjectToJson(Map<String, ? extends List<? extends T>> map) {
        ?? SingletonList;
        LinkedHashMap linkedHashMap = new LinkedHashMap(C2097908Jt.LIZIZ(map.size()));
        Iterator<T> it2 = map.entrySet().iterator();
        while (it2.hasNext()) {
            Map.Entry entry = (Map.Entry) it2.next();
            Object key = entry.getKey();
            List list = (List) entry.getValue();
            if (list != null) {
                SingletonList = new ArrayList(C15438062q.LJIJJ(list, 10));
                Iterator it3 = list.iterator();
                while (it3.hasNext()) {
                    SingletonList.add(objectToJson(it3.next()));
                }
            } else {
                SingletonList = Collections.singletonList("None");
            }
            linkedHashMap.put(key, SingletonList);
        }
        return linkedHashMap;
    }

    private final <T> String objectToJson(T t) {
        String string;
        Gson gson = new Gson();
        Map map = (Map) GsonProtectorUtils.fromJson(gson, GsonProtectorUtils.toJson(gson, t), new TypeToken<Map<String, ? extends Object>>() { // from class: X.0anG
        }.getType());
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            Object value = entry.getValue();
            if (value instanceof Number) {
                string = BigDecimal.valueOf(((Number) value).doubleValue()).toPlainString();
            } else {
                string = value.toString();
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append('\"');
            sbLIZ.append(str);
            sbLIZ.append("\": \"");
            sbLIZ.append(string);
            sbLIZ.append("\", ");
            sb.append(C2188811AlT.LIZIZ(sbLIZ));
        }
        if (a0.LJJIJIL(sb, ", ")) {
            sb.setLength(sb.length() - 2);
        }
        sb.append("}");
        return sb.toString();
    }

    private final String parseBizUser(C954460awe c954460awe) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("channelId", c954460awe.LJI);
        jSONObject.put("rivalUserId", c954460awe.LJII);
        jSONObject.put("sdkRivalUserId", c954460awe.LJIIIIZZ);
        jSONObject.put("linkedTime", c954460awe.LJIIIZ);
        jSONObject.put("linkRemainingTime", c954460awe.LJIIJ);
        jSONObject.put("linkMicId", c954460awe.LJIIJJI);
        jSONObject.put("groupChannelId", 0L);
        jSONObject.put("isGroupMerging", c954460awe.LJIIL);
        jSONObject.put("isGroupMergingByMe", c954460awe.LJIILIIL);
        jSONObject.put("groupMergingUidsByMe", c954460awe.LJIILJJIL);
        jSONObject.put("groupMergingOwnerUid", c954460awe.LJIILL);
        jSONObject.put("groupMergingOwnerRoomId", c954460awe.LJIILLIIL);
        jSONObject.put("groupMergingOwnerChannelId", c954460awe.LJIIZILJ);
        jSONObject.put("playType", c954460awe.LJIJ);
        jSONObject.put("userInfo", c954460awe.LJIJJ);
        jSONObject.put("myBestTeammateUid", 0L);
        jSONObject.put("isBestTeammate", false);
        jSONObject.put("followStatus", c954460awe.LJIJJLI);
        jSONObject.put("isLowVersion", c954460awe.LJIL);
        jSONObject.put("requestId", c954460awe.LJJ);
        jSONObject.put("state", c954460awe.LJJIIZ);
        jSONObject.put("isInvitedBySelf", c954460awe.LJJIIZI);
        jSONObject.put("createSourceTag", c954460awe.LJJIJ);
        jSONObject.put("joinMessage", c954460awe.LJJIJIIJI);
        jSONObject.put("isNeedLeaveCheck", c954460awe.LJJIJIIJIL);
        jSONObject.put("isFromJoinMsg", c954460awe.LJJIJIL);
        return C786410Ut5.J3(jSONObject);
    }

    public String injectGetInnerChannelId(Map<Object, ? extends Object> map) {
        String strU3;
        InterfaceC954180awC interfaceC954180awCLJIIIZ = C915980Zwa.LJII().LJIIIZ();
        if (interfaceC954180awCLJIIIZ == null || (strU3 = interfaceC954180awCLJIIIZ.U3()) == null) {
            return "-1";
        }
        return strU3;
    }

    public String injectGetLinkMicState(Map<Object, ? extends Object> map) {
        return C915980Zwa.LJII().LLI().toString();
    }

    public int injectGetLinkMicStateFromSession(Map<Object, ? extends Object> map) {
        InterfaceC954180awC interfaceC954180awCLJIIIZ = C915980Zwa.LJII().LJIIIZ();
        if (interfaceC954180awCLJIIIZ != null) {
            return interfaceC954180awCLJIIIZ.LLJLLIL();
        }
        return -1;
    }

    public List<String> injectGetLinkedListFromSession(Map<Object, ? extends Object> map) {
        List<LinkUser> listLJJIJ = C915980Zwa.LJII().LJJIJ();
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(listLJJIJ, 10));
        Iterator<LinkUser> it2 = listLJJIJ.iterator();
        while (it2.hasNext()) {
            arrayList.add(objectToJson(it2.next()));
        }
        return arrayList;
    }

    public List<String> injectGetLinkedUsrList(Map<Object, ? extends Object> map) {
        List<C954460awe> listLLILZLL = C915980Zwa.LJII().LLILZLL(true);
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(listLLILZLL, 10));
        Iterator<C954460awe> it2 = listLLILZLL.iterator();
        while (it2.hasNext()) {
            arrayList.add(parseBizUser(it2.next()));
        }
        return arrayList;
    }

    public List<String> injectGetUnLinkedUsrList(Map<Object, ? extends Object> map) {
        List<C954460awe> listLJIJJ = C915980Zwa.LJII().LJIJJ();
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(listLJIJJ, 10));
        Iterator<C954460awe> it2 = listLJIJJ.iterator();
        while (it2.hasNext()) {
            arrayList.add(parseBizUser(it2.next()));
        }
        return arrayList;
    }

    public Map<String, List<String>> injectGetUnlinkListFromSession(Map<Object, ? extends Object> map) {
        C13BV c13bvLJJJI;
        InterfaceC958070b2T interfaceC958070b2TLLJJ;
        InterfaceC958070b2T interfaceC958070b2TLLJJ2;
        Pair[] pairArr = new Pair[4];
        InterfaceC954180awC interfaceC954180awCLJIIIZ = C915980Zwa.LJII().LJIIIZ();
        C13BV c13bvLJJJLL = null;
        if (interfaceC954180awCLJIIIZ != null && (interfaceC958070b2TLLJJ2 = interfaceC954180awCLJIIIZ.LLJJ()) != null) {
            c13bvLJJJI = interfaceC958070b2TLLJJ2.LJJJI();
        } else {
            c13bvLJJJI = null;
        }
        pairArr[0] = new Pair("applyingList", c13bvLJJJI);
        pairArr[1] = new Pair("applicationList", C915980Zwa.LJII().LJJJJIZL());
        pairArr[2] = new Pair("inviteeList", C915980Zwa.LJII().LJJJJL());
        InterfaceC954180awC interfaceC954180awCLJIIIZ2 = C915980Zwa.LJII().LJIIIZ();
        if (interfaceC954180awCLJIIIZ2 != null && (interfaceC958070b2TLLJJ = interfaceC954180awCLJIIIZ2.LLJJ()) != null) {
            c13bvLJJJLL = interfaceC958070b2TLLJJ.LJJJLL();
        }
        pairArr[3] = new Pair("invitingList", c13bvLJJJLL);
        return listOfObjectToJson(C2097608Jq.LJIIIIZZ(pairArr));
    }

    @Override // com.bytedance.android.livesdk.comp.api.linkcore.IAutoTestCohostService
    public void setDataChannel(DataChannel dataChannel) {
        this.dataChannel = dataChannel;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00c9 A[PHI: r9
      0x00c9: PHI (r9v1 long) = (r9v0 long), (r9v3 long), (r9v3 long) binds: [B:38:0x00c6, B:31:0x0062, B:33:0x0068] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void injectApply(java.util.Map<java.lang.Object, ? extends java.lang.Object> r21, final X.InterfaceC920680a4A<java.lang.Object> r22) {
        /*
            Method dump skipped, instruction units count: 210
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.liveinteract.multihost.biz.autotest.AutoTestCohostService.injectApply(java.util.Map, X.0a4A):void");
    }

    public void injectAutoMatch(Map<Object, ? extends Object> map, InterfaceC920680a4A<Object> interfaceC920680a4A) throws JSONException {
        C915980Zwa.LJIIIZ().LIZIZ(EnumC959750b5B.TYPE_AUTO_TEST, null);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("log_id", "");
        if (interfaceC920680a4A != null) {
            interfaceC920680a4A.onSuccess(jSONObject);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0052 A[PHI: r5 r7
      0x0052: PHI (r5v2 long) = (r5v1 long), (r5v5 long), (r5v5 long) binds: [B:38:0x00e4, B:22:0x004a, B:24:0x0050] A[DONT_GENERATE, DONT_INLINE]
      0x0052: PHI (r7v1 long) = (r7v0 long), (r7v4 long), (r7v4 long) binds: [B:38:0x00e4, B:22:0x004a, B:24:0x0050] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0056 A[PHI: r3 r5 r7
      0x0056: PHI (r3v4 java.lang.String) = (r3v0 java.lang.String), (r3v5 java.lang.String) binds: [B:26:0x0054, B:24:0x0050] A[DONT_GENERATE, DONT_INLINE]
      0x0056: PHI (r5v4 long) = (r5v2 long), (r5v5 long) binds: [B:26:0x0054, B:24:0x0050] A[DONT_GENERATE, DONT_INLINE]
      0x0056: PHI (r7v3 long) = (r7v1 long), (r7v4 long) binds: [B:26:0x0054, B:24:0x0050] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00e2 A[PHI: r5
      0x00e2: PHI (r5v1 long) = (r5v0 long), (r5v6 long), (r5v6 long) binds: [B:35:0x00de, B:17:0x0038, B:19:0x003e] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void injectInvite(java.util.Map<java.lang.Object, ? extends java.lang.Object> r21, final X.InterfaceC920680a4A<java.lang.Object> r22) {
        /*
            Method dump skipped, instruction units count: 232
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.liveinteract.multihost.biz.autotest.AutoTestCohostService.injectInvite(java.util.Map, X.0a4A):void");
    }

    public void injectLeave(Map<Object, ? extends Object> map, final InterfaceC920680a4A<Object> interfaceC920680a4A) {
        Object obj;
        String string;
        if (map != null && (obj = map.get("groupChannelID")) != null && (string = obj.toString()) != null) {
            CastLongProtector.parseLong(string);
        }
        C915980Zwa.LJII().LLLJL(new C920570a3z("leave_with_user_click_disconnect", 0L, 0, 62), new InterfaceC950010apT<C920630a45>() { // from class: X.0a49
            @Override // X.InterfaceC950010apT
            public final void LIZ(C920640a46 c920640a46) throws JSONException {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("log_id", ((C920630a45) c920640a46).LIZIZ);
                InterfaceC920680a4A<Object> interfaceC920680a4A2 = interfaceC920680a4A;
                if (interfaceC920680a4A2 != null) {
                    interfaceC920680a4A2.onSuccess(jSONObject);
                }
            }

            @Override // X.InterfaceC950010apT
            public final void LIZIZ(C952350atF c952350atF, Throwable th) {
                InterfaceC920680a4A<Object> interfaceC920680a4A2 = interfaceC920680a4A;
                if (interfaceC920680a4A2 != null) {
                    interfaceC920680a4A2.LIZ(new LinkCoreError(c952350atF.LIZ, 0L, c952350atF.LIZIZ), th);
                }
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x005d A[PHI: r2
      0x005d: PHI (r2v5 java.lang.String) = (r2v0 java.lang.String), (r2v6 java.lang.String) binds: [B:30:0x005b, B:28:0x0058] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x006b A[PHI: r2
      0x006b: PHI (r2v1 java.lang.String) = (r2v0 java.lang.String), (r2v5 java.lang.String), (r2v5 java.lang.String) binds: [B:30:0x005b, B:32:0x0063, B:34:0x0069] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006e A[PHI: r1 r2
      0x006e: PHI (r1v4 java.lang.String) = (r1v0 java.lang.String), (r1v5 java.lang.String) binds: [B:36:0x006c, B:34:0x0069] A[DONT_GENERATE, DONT_INLINE]
      0x006e: PHI (r2v4 java.lang.String) = (r2v1 java.lang.String), (r2v5 java.lang.String) binds: [B:36:0x006c, B:34:0x0069] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00c4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void injectPermit(java.util.Map<java.lang.Object, ? extends java.lang.Object> r20, final X.InterfaceC920680a4A<java.lang.Object> r21) {
        /*
            Method dump skipped, instruction units count: 205
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.liveinteract.multihost.biz.autotest.AutoTestCohostService.injectPermit(java.util.Map, X.0a4A):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0052 A[PHI: r5
      0x0052: PHI (r5v5 java.lang.String) = (r5v0 java.lang.String), (r5v6 java.lang.String) binds: [B:28:0x0050, B:26:0x004d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0060 A[PHI: r5
      0x0060: PHI (r5v1 java.lang.String) = (r5v0 java.lang.String), (r5v5 java.lang.String), (r5v5 java.lang.String) binds: [B:28:0x0050, B:30:0x0058, B:32:0x005e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0063 A[PHI: r4 r5
      0x0063: PHI (r4v3 java.lang.String) = (r4v0 java.lang.String), (r4v4 java.lang.String) binds: [B:34:0x0061, B:32:0x005e] A[DONT_GENERATE, DONT_INLINE]
      0x0063: PHI (r5v4 java.lang.String) = (r5v1 java.lang.String), (r5v5 java.lang.String) binds: [B:34:0x0061, B:32:0x005e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00f2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void injectReply(java.util.Map<java.lang.Object, ? extends java.lang.Object> r21, final X.InterfaceC920680a4A<java.lang.Object> r22) {
        /*
            Method dump skipped, instruction units count: 251
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.liveinteract.multihost.biz.autotest.AutoTestCohostService.injectReply(java.util.Map, X.0a4A):void");
    }
}
