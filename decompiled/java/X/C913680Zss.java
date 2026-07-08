package X;

import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.im.common.model.GroupCheckMsg;
import com.ss.android.ugc.aweme.im.service.analytics.IIMChatDetailAnalytics;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0Zss, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C913680Zss implements InterfaceC908170Zjz {
    public static final C913680Zss LL;
    public static final ConcurrentHashMap<String, Pair<AbstractC879060Ye8, InterfaceC866850XzX>> LLILLJJLI;
    public static Keva LLILLL;
    public static volatile String LLILZ;
    public static final Object LLILZIL;
    public static final C913670Zsr LLILZLL;

    /* JADX WARN: Type inference failed for: r0v5, types: [X.0Zsr] */
    static {
        C913680Zss c913680Zss = new C913680Zss();
        LL = c913680Zss;
        LLILLJJLI = new ConcurrentHashMap<>();
        LLILZ = "-1";
        LLILZIL = new Object();
        C0I0B.LJFF.LIZ().LIZLLL(c913680Zss);
        LLILZLL = new InterfaceC866830XzV() { // from class: X.0Zsr
            @Override // X.InterfaceC866830XzV, X.InterfaceC868050Y3n
            public final void LJJJJJL(C0Y8T c0y8t) {
            }

            @Override // X.InterfaceC866830XzV, X.InterfaceC868050Y3n
            public final void LJJLJLI(List<C0YAE> list) {
            }

            @Override // X.InterfaceC866830XzV, X.InterfaceC868050Y3n
            public final void LJJLL(List<C0YAE> list) {
            }

            @Override // X.InterfaceC866830XzV, X.InterfaceC868050Y3n
            public final void LJJZZI(List<C0YAE> list) {
            }

            @Override // X.InterfaceC866830XzV, X.InterfaceC868050Y3n
            public final void LJLI(String str, List<C0YAE> list) {
            }

            @Override // X.InterfaceC866830XzV, X.InterfaceC868050Y3n
            public final void LJLILLLLZI(C0Y8T c0y8t) {
            }

            @Override // X.InterfaceC866830XzV, X.InterfaceC868050Y3n
            public final void LJLJI(int i, C0Y8T c0y8t) {
            }

            @Override // X.InterfaceC866830XzV, X.InterfaceC868050Y3n
            public final void LJLL(C1711306n1 c1711306n1) {
            }

            @Override // X.InterfaceC866830XzV, X.InterfaceC868050Y3n
            public final void LJZI(C0Y8T c0y8t) {
            }

            @Override // X.InterfaceC866830XzV, X.InterfaceC868050Y3n
            public final void LLIIII(int i, String str) {
            }

            @Override // X.InterfaceC866830XzV, X.InterfaceC868050Y3n
            public final void LLIILZL(int i, String str, List list) {
            }

            @Override // X.InterfaceC866830XzV, X.InterfaceC868050Y3n
            public final int LLLIIII() {
                return 0;
            }

            @Override // X.InterfaceC866830XzV, X.InterfaceC867280Y0o
            public final void LLLIZZ(Map<String, C0Y8T> map) {
            }

            @Override // X.InterfaceC866830XzV, X.InterfaceC868050Y3n
            public final void LJJLIIIJ(C0Y8T c0y8t) {
                if (c0y8t != null && c0y8t.isTemp() && c0y8t.isGroupChat()) {
                    C913680Zss.LL.LIZIZ(c0y8t.getConversationId());
                }
            }
        };
    }

    public static final Keva LIZLLL() {
        Keva repo;
        String strLIZIZ = C461720I8s.LIZIZ();
        if (LLILLL != null && Intrinsics.LJFF(LLILZ, strLIZIZ)) {
            return LLILLL;
        }
        synchronized (LLILZIL) {
            try {
                LLILZ = strLIZIZ;
                LL.getClass();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("group_creation_local_mock_repo_");
                sbLIZ.append(strLIZIZ);
                repo = Keva.getRepo(C2188811AlT.LIZIZ(sbLIZ));
                LLILLL = repo;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return repo;
    }

    public static String LIZJ(String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("event_report_action_");
        sbLIZ.append(str);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static String LJ(String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("invite_user_action_");
        sbLIZ.append(str);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static void LJFF(String str) {
        ConcurrentHashMap<String, Pair<AbstractC879060Ye8, InterfaceC866850XzX>> concurrentHashMap = LLILLJJLI;
        if (concurrentHashMap.keySet().contains(str)) {
            return;
        }
        InterfaceC866850XzX interfaceC866850XzX = new InterfaceC866850XzX() { // from class: X.0Zsv
            @Override // X.InterfaceC866850XzX, X.InterfaceC868050Y3n
            public final void LJJJJJL(C0Y8T c0y8t) {
            }

            @Override // X.InterfaceC866850XzX, X.InterfaceC868050Y3n
            public final void LJJLIIIJ(C0Y8T c0y8t) {
            }

            @Override // X.InterfaceC866850XzX, X.InterfaceC868050Y3n
            public final void LJJLJLI(List<C0YAE> list) {
            }

            @Override // X.InterfaceC866850XzX, X.InterfaceC868050Y3n
            public final void LJJLL(List<C0YAE> list) {
            }

            @Override // X.InterfaceC866850XzX, X.InterfaceC868050Y3n
            public final void LJJZZI(List<C0YAE> list) {
            }

            @Override // X.InterfaceC866850XzX, X.InterfaceC868050Y3n
            public final void LJLI(String str2, List<C0YAE> list) {
            }

            @Override // X.InterfaceC866850XzX, X.InterfaceC868050Y3n
            public final void LJLILLLLZI(C0Y8T c0y8t) {
            }

            @Override // X.InterfaceC866850XzX, X.InterfaceC868050Y3n
            public final void LJLJI(int i, C0Y8T c0y8t) {
            }

            @Override // X.InterfaceC866850XzX, X.InterfaceC868050Y3n
            public final void LJZI(C0Y8T c0y8t) {
            }

            @Override // X.InterfaceC866850XzX, X.InterfaceC868050Y3n
            public final void LLIIII(int i, String str2) {
            }

            @Override // X.InterfaceC866850XzX, X.InterfaceC868050Y3n
            public final void LLIILZL(int i, String str2, List list) {
            }

            @Override // X.InterfaceC868050Y3n
            public final int LLLIIII() {
                return 0;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r15v5, types: [com.ss.android.ugc.aweme.im.service.analytics.IIMChatDetailAnalytics] */
            /* JADX WARN: Type inference failed for: r19v3, types: [java.util.List] */
            /* JADX WARN: Type inference failed for: r1v43, types: [java.util.Map] */
            /* JADX WARN: Type inference failed for: r1v44 */
            /* JADX WARN: Type inference failed for: r1v46, types: [java.util.HashMap, java.util.LinkedHashMap] */
            /* JADX WARN: Type inference failed for: r24v2, types: [java.util.Map] */
            /* JADX WARN: Type inference failed for: r2v22, types: [X.13BV] */
            /* JADX WARN: Type inference failed for: r2v23 */
            /* JADX WARN: Type inference failed for: r2v24, types: [java.util.ArrayList] */
            @Override // X.InterfaceC866850XzX, X.InterfaceC868050Y3n
            public final void LJLL(C1711306n1 c1711306n1) throws JSONException {
                Long l;
                JSONObject jSONObject;
                boolean z;
                String string;
                Object c098200Yq;
                JSONObject jSONObjectOptJSONObject;
                Object c098200Yq2;
                long j;
                long j2;
                C1227680i3K c1227680i3K;
                long j3;
                C0ZBV c0zbv;
                String statusMsg;
                JSONObject jSONObjectOptJSONObject2;
                JSONObject jSONObjectOptJSONObject3;
                ?? arrayList;
                String conversationId;
                ?? LJ;
                GroupCheckMsg groupCheckMsg;
                int iIntValue;
                Integer statusCode;
                String checkMsg;
                String string2;
                Object c098200Yq3;
                String strName;
                Set<String> allKey;
                if (c1711306n1 != null && (l = c1711306n1.LIZ) != null) {
                    long jLongValue = l.longValue();
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("receive ConversationSyncEvent, assignConvShortId: ");
                    sbLIZ.append(jLongValue);
                    C2188811AlT.LIZIZ(sbLIZ);
                    C0Y8T c0y8t = c1711306n1.LIZIZ;
                    C0YMW c0ymw = c1711306n1.LIZJ;
                    C742250T9r c742250T9r = c1711306n1.LIZLLL;
                    C913680Zss c913680Zss = C913680Zss.LL;
                    String strValueOf = String.valueOf(jLongValue);
                    c913680Zss.getClass();
                    String strLIZJ = C913680Zss.LIZJ(strValueOf);
                    Keva kevaLIZLLL = C913680Zss.LIZLLL();
                    Object obj = null;
                    if (kevaLIZLLL != null && (string2 = kevaLIZLLL.getString(strLIZJ, "{}")) != null) {
                        try {
                            c098200Yq3 = new JSONObject(string2);
                            C189200o6.m2constructorimpl(c098200Yq3);
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            c098200Yq3 = new C098200Yq(th);
                            C189200o6.m2constructorimpl(c098200Yq3);
                        }
                        if (C189200o6.m5exceptionOrNullimpl(c098200Yq3) != null) {
                            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                            sbLIZ2.append("getETCache error: repoName:");
                            C913680Zss c913680Zss2 = C913680Zss.LL;
                            Keva kevaLIZLLL2 = C913680Zss.LIZLLL();
                            if (kevaLIZLLL2 != null) {
                                strName = kevaLIZLLL2.name();
                            } else {
                                strName = null;
                            }
                            sbLIZ2.append(strName);
                            sbLIZ2.append(" key:");
                            sbLIZ2.append(strLIZJ);
                            sbLIZ2.append(", allKeys:");
                            Keva kevaLIZLLL3 = C913680Zss.LIZLLL();
                            if (kevaLIZLLL3 != null) {
                                allKey = kevaLIZLLL3.getAllKey();
                            } else {
                                allKey = null;
                            }
                            sbLIZ2.append(allKey);
                            C2188811AlT.LIZIZ(sbLIZ2);
                        }
                        if (C189200o6.m7isFailureimpl(c098200Yq3)) {
                            c098200Yq3 = null;
                        }
                        jSONObject = (JSONObject) c098200Yq3;
                    } else {
                        jSONObject = null;
                    }
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("restore report ET after retry complete, etJson != null: ");
                    if (jSONObject != null) {
                        z = true;
                    } else {
                        z = false;
                    }
                    sbLIZ3.append(z);
                    C2188811AlT.LIZIZ(sbLIZ3);
                    if (jSONObject != null && (jSONObjectOptJSONObject3 = jSONObject.optJSONObject("create_chat")) != null) {
                        C913680Zss.LL.getClass();
                        String strOptString = jSONObjectOptJSONObject3.optString("type");
                        JSONArray jSONArrayOptJSONArray = jSONObjectOptJSONObject3.optJSONArray("list");
                        if (jSONArrayOptJSONArray != null) {
                            int length = jSONArrayOptJSONArray.length();
                            arrayList = new ArrayList(length);
                            for (int i = 0; i < length; i++) {
                                arrayList.add(jSONArrayOptJSONArray.optString(i));
                            }
                        } else {
                            arrayList = C13BV.INSTANCE;
                        }
                        String strOptString2 = jSONObjectOptJSONObject3.optString("chat_type");
                        String strOptString3 = jSONObjectOptJSONObject3.optString("version");
                        if (c0y8t != null) {
                            conversationId = c0y8t.getConversationId();
                        } else {
                            conversationId = null;
                        }
                        String strLJI = C1229100i5c.LJI(conversationId);
                        String strOptString4 = jSONObjectOptJSONObject3.optString("enter_method");
                        String strOptString5 = jSONObjectOptJSONObject3.optString("enter_from");
                        JSONObject jSONObjectOptJSONObject4 = jSONObjectOptJSONObject3.optJSONObject("extra_mob_map");
                        if (jSONObjectOptJSONObject4 != null) {
                            Sequence sequenceLIZIZ = C09R4.LIZIZ(jSONObjectOptJSONObject4.keys());
                            LJ = new LinkedHashMap();
                            for (Object obj2 : sequenceLIZIZ) {
                                LJ.put(obj2, jSONObjectOptJSONObject4.optString((String) obj2));
                            }
                        } else {
                            LJ = C2097608Jq.LJ();
                        }
                        if (c0ymw != null && (checkMsg = c0ymw.getCheckMsg()) != null) {
                            groupCheckMsg = (GroupCheckMsg) C051M.LIZIZ(GroupCheckMsg.class, checkMsg);
                        } else {
                            groupCheckMsg = null;
                        }
                        ?? r15 = (IIMChatDetailAnalytics) PluggableExtentionKt.pluggableSpiForReal(IIMChatDetailAnalytics.class);
                        if (r15 != 0) {
                            if (groupCheckMsg != null && (statusCode = groupCheckMsg.getStatusCode()) != null) {
                                iIntValue = statusCode.intValue();
                            } else {
                                iIntValue = -1;
                            }
                            r15.LIZJ(iIntValue, c0y8t, strOptString, arrayList, strOptString2, strOptString3, strOptString4, strOptString5, LJ, strLJI, true, C0I0B.LJFF.LIZIZ());
                        }
                    }
                    if (jSONObject != null && (jSONObjectOptJSONObject2 = jSONObject.optJSONObject("imsdk_group_chat_create")) != null) {
                        C913680Zss.LL.getClass();
                        C1227670i3J.LJIIJJI(c742250T9r, Integer.valueOf(C1232370iAt.LIZIZ(c0ymw)), jSONObjectOptJSONObject2.optString("chat_type"), jSONObjectOptJSONObject2.optString("group_type"));
                    }
                    if (jSONObject != null && (jSONObjectOptJSONObject = jSONObject.optJSONObject("group_chat_create_result")) != null) {
                        C913680Zss.LL.getClass();
                        String strOptString6 = jSONObjectOptJSONObject.optString("group_type");
                        String strOptString7 = jSONObjectOptJSONObject.optString("chat_type");
                        int iOptInt = jSONObjectOptJSONObject.optInt("member_num");
                        String strOptString8 = jSONObjectOptJSONObject.optString("conversation_id");
                        try {
                            c098200Yq2 = (C1227700i3M) C09EF.LIZ.LJII(jSONObjectOptJSONObject.optString("create_group_data", ""), C1227700i3M.class);
                            C189200o6.m2constructorimpl(c098200Yq2);
                        } catch (Throwable th2) {
                            TryCatchGuardChecker.doCheck(th2);
                            c098200Yq2 = new C098200Yq(th2);
                            C189200o6.m2constructorimpl(c098200Yq2);
                        }
                        if (C189200o6.m7isFailureimpl(c098200Yq2)) {
                            c098200Yq2 = null;
                        }
                        C1227700i3M c1227700i3M = (C1227700i3M) c098200Yq2;
                        long j4 = -1;
                        if (c0y8t == null) {
                            if (c742250T9r != null) {
                                j3 = c742250T9r.LIZIZ - c742250T9r.LIZ;
                                j4 = c742250T9r.LIZJ - c742250T9r.LIZIZ;
                            } else {
                                j3 = -1;
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
                            c1227680i3K = new C1227680i3K(strOptString8, strOptString7, strOptString6, iOptInt, j3, j4, 0, c0zbv, numValueOf, statusMsg, 64);
                        } else {
                            int memberCount = c0y8t.getMemberCount();
                            if (c742250T9r != null) {
                                j = c742250T9r.LIZIZ - c742250T9r.LIZ;
                                j2 = c742250T9r.LIZJ - c742250T9r.LIZIZ;
                            } else {
                                j = -1;
                                j2 = -1;
                            }
                            c1227680i3K = new C1227680i3K(strOptString8, strOptString7, strOptString6, iOptInt, j, j2, memberCount, C0ZBV.SUCCESS, null, null, 768);
                        }
                        if (c1227700i3M != null) {
                            C1227670i3J.LJIIL(c1227680i3K, c1227700i3M, true);
                        }
                    }
                    if (c0y8t != null) {
                        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                        sbLIZ4.append("retry create group success, convId: ");
                        sbLIZ4.append(c0y8t.getConversationId());
                        C2188811AlT.LIZIZ(sbLIZ4);
                        C913680Zss c913680Zss3 = C913680Zss.LL;
                        String conversationId2 = c0y8t.getConversationId();
                        Keva kevaLIZLLL4 = C913680Zss.LIZLLL();
                        if (kevaLIZLLL4 != null) {
                            string = kevaLIZLLL4.getString(C913680Zss.LJ(conversationId2), "");
                        } else {
                            string = null;
                        }
                        try {
                            c098200Yq = (C913730Zsx) C09EF.LIZ.LJII(string, C913730Zsx.class);
                            C189200o6.m2constructorimpl(c098200Yq);
                        } catch (Throwable th3) {
                            TryCatchGuardChecker.doCheck(th3);
                            c098200Yq = new C098200Yq(th3);
                            C189200o6.m2constructorimpl(c098200Yq);
                        }
                        if (!C189200o6.m7isFailureimpl(c098200Yq)) {
                            obj = c098200Yq;
                        }
                        final C913730Zsx c913730Zsx = (C913730Zsx) obj;
                        StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                        sbLIZ5.append("restore send invite after retry success, inviteUserCache: ");
                        sbLIZ5.append(c913730Zsx);
                        C2188811AlT.LIZIZ(sbLIZ5);
                        if (c913730Zsx != null) {
                            C913680Zss.LL.getClass();
                            String str2 = c913730Zsx.LIZ;
                            List<Long> list = c913730Zsx.LIZJ;
                            long jLIZJ = C461720I8s.LIZJ();
                            C900560ZUo c900560ZUo = c913730Zsx.LIZLLL;
                            C1230650i87 c1230650i87 = EnumC1230500i7s.Companion;
                            String str3 = c913730Zsx.LJ;
                            c1230650i87.getClass();
                            HashMap mapLIZ = C1229420i68.LIZ(jLIZJ, "send_invite", c900560ZUo, C1230650i87.LIZ(str3), 2);
                            mapLIZ.put("a:group_type", c913730Zsx.LIZIZ);
                            C0YUN.LIZIZ(new C873240YNm(str2, list, mapLIZ, false, 112), new InterfaceC867020Xzo<List<? extends C0YAE>>() { // from class: X.0Zsw
                                @Override // X.InterfaceC867020Xzo
                                public final void LIZ(C868810Y6l<List<? extends C0YAE>> c868810Y6l) {
                                    Integer numValueOf2;
                                    C742250T9r c742250T9r2 = c868810Y6l.LIZJ;
                                    C0YMW c0ymw2 = c868810Y6l.LIZIZ;
                                    C913630Zsn.LJIIJJI.getClass();
                                    C1227540i36 c1227540i36 = C1227540i36.LIZIZ;
                                    String str4 = c913730Zsx.LIZ;
                                    if (c0ymw2 != null) {
                                        numValueOf2 = Integer.valueOf(c0ymw2.getCode());
                                    } else {
                                        numValueOf2 = null;
                                    }
                                    c1227540i36.LJIILIIL(str4, c742250T9r2, numValueOf2);
                                }

                                @Override // X.InterfaceC867020Xzo
                                public final void LIZIZ(C0Y00 c0y00) {
                                    C742250T9r c742250T9r2 = c0y00.LIZIZ;
                                    C0YMW c0ymw2 = c0y00.LIZ;
                                    C913630Zsn.LJIIJJI.getClass();
                                    C1227540i36.LIZIZ.LJIILIIL(c913730Zsx.LIZ, c742250T9r2, Integer.valueOf(C1232370iAt.LIZIZ(c0ymw2)));
                                }
                            });
                        }
                    }
                    C913680Zss.LL.LIZIZ(String.valueOf(jLongValue));
                }
            }
        };
        C866530Xz1 c866530Xz1LIZIZ = C0YNP.LIZIZ(str);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("register retry observer for convId: ");
        sbLIZ.append(str);
        C2188811AlT.LIZIZ(sbLIZ);
        Pair<AbstractC879060Ye8, InterfaceC866850XzX> pair = new Pair<>(c866530Xz1LIZIZ, interfaceC866850XzX);
        c866530Xz1LIZIZ.LJIIJJI(interfaceC866850XzX);
        concurrentHashMap.put(str, pair);
    }

    public final void LIZIZ(String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("clear scene restore cache for convId: ");
        sbLIZ.append(str);
        C2188811AlT.LIZIZ(sbLIZ);
        Keva kevaLIZLLL = LIZLLL();
        if (kevaLIZLLL != null) {
            LL.getClass();
            kevaLIZLLL.erase(LIZJ(str));
            kevaLIZLLL.erase(LJ(str));
        }
        Pair<AbstractC879060Ye8, InterfaceC866850XzX> pairRemove = LLILLJJLI.remove(str);
        if (pairRemove != null) {
            pairRemove.getFirst().LJIILLIIL(pairRemove.getSecond());
        }
    }

    @Override // X.InterfaceC908170Zjz
    public final void onAccountResult(int i, boolean z, int i2, User user) {
        String uid;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onAccountResult: ");
        sbLIZ.append(i);
        sbLIZ.append(", success: ");
        sbLIZ.append(z);
        sbLIZ.append(", userId: ");
        if (user != null) {
            uid = user.getUid();
        } else {
            uid = null;
        }
        sbLIZ.append(uid);
        C2188811AlT.LIZIZ(sbLIZ);
        if (!z) {
            return;
        }
        if (i != 2 && i != 3) {
            return;
        }
        LLILZ = "-1";
        LLILLL = null;
    }
}
