package X;

import Y.AfS3S1101100_23;
import com.bytedance.scene.Scene;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.pns.usercommunication.api.NetworkUniversalPopupDispatchResponse;
import com.ss.android.ugc.aweme.pns.usercommunication.api.NetworkUniversalPopupResponse;
import com.ss.android.ugc.aweme.pns.usercommunication.api.PolicyNoticeUPSdk;
import com.ss.android.ugc.aweme.pns.usercommunication.api.UserCommunicationProcessorModel;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS212S0000000_23;
import kotlin.jvm.internal.AwS567S0100000_23;

/* JADX INFO: renamed from: X.0pcT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1518550pcT {
    public static AwS567S0100000_23 LJ;
    public static final C1518550pcT LIZ = new C1518550pcT();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS212S0000000_23.get$arr$(265));
    public static final Map<String, NetworkUniversalPopupDispatchResponse> LIZJ = new LinkedHashMap();
    public static final C1518560pcU LIZLLL = new C1518560pcU();
    public static String LJFF = "/tiktok";

    public static void LIZIZ(NetworkUniversalPopupDispatchResponse networkUniversalPopupDispatchResponse) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        List<PolicyNoticeUPSdk> list = networkUniversalPopupDispatchResponse.policyNotices;
        if (list != null) {
            for (PolicyNoticeUPSdk policyNoticeUPSdk : list) {
                List list2 = (List) linkedHashMap2.get(policyNoticeUPSdk.business);
                if (list2 != null) {
                    list2.add(policyNoticeUPSdk);
                } else {
                    linkedHashMap2.put(policyNoticeUPSdk.business, C1697810uHb.LJIILJJIL(policyNoticeUPSdk));
                }
            }
        }
        List<NetworkUniversalPopupResponse> list3 = networkUniversalPopupDispatchResponse.popupResponses;
        if (list3 != null) {
            for (NetworkUniversalPopupResponse networkUniversalPopupResponse : list3) {
                List list4 = (List) linkedHashMap.get(networkUniversalPopupResponse.popupMeta.business);
                if (list4 != null) {
                    list4.add(networkUniversalPopupResponse);
                } else {
                    linkedHashMap.put(networkUniversalPopupResponse.popupMeta.business, C1697810uHb.LJIILJJIL(networkUniversalPopupResponse));
                }
            }
        }
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        for (Map.Entry entry : linkedHashMap2.entrySet()) {
            linkedHashMap3.put(entry.getKey(), new NetworkUniversalPopupDispatchResponse((List) entry.getValue(), null, networkUniversalPopupDispatchResponse.status_code, networkUniversalPopupDispatchResponse.status_msg, networkUniversalPopupDispatchResponse.mscConfig, networkUniversalPopupDispatchResponse.log, 2, null));
        }
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            linkedHashMap3.put(entry2.getKey(), new NetworkUniversalPopupDispatchResponse(null, (List) entry2.getValue(), networkUniversalPopupDispatchResponse.status_code, networkUniversalPopupDispatchResponse.status_msg, networkUniversalPopupDispatchResponse.mscConfig, networkUniversalPopupDispatchResponse.log, 1, null));
        }
        for (Map.Entry entry3 : linkedHashMap3.entrySet()) {
            LIZJ.put((String) entry3.getKey(), (NetworkUniversalPopupDispatchResponse) entry3.getValue());
        }
    }

    public static void LIZJ(InterfaceC1524005xu interfaceC1524005xu) {
        LIZLLL.LIZ.put(interfaceC1524005xu.LIZ(), interfaceC1524005xu);
    }

    public static void LIZ(C1518550pcT c1518550pcT, String str, Function1 function1) {
        c1518550pcT.getClass();
        Object obj = ((LinkedHashMap) LIZJ).get(str);
        if (obj != null) {
            function1.invoke(obj);
            return;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("{\"id\": \"");
        sbLIZ.append(str);
        sbLIZ.append("\"}");
        linkedHashMap.put("extra", C2188811AlT.LIZIZ(sbLIZ));
        LIZLLL(c1518550pcT, EnumC1518670pcf.SCENE_PULL_WITH_ID.getValue(), linkedHashMap, function1);
    }

    public static void LJI(UserCommunicationProcessorModel userCommunicationProcessorModel, Integer num, Map map) {
        LinkedHashMap linkedHashMap;
        int iIntValue;
        InterfaceC1524005xu interfaceC1524005xu;
        C1518560pcU c1518560pcU = LIZLLL;
        c1518560pcU.getClass();
        if (map != null) {
            linkedHashMap = new LinkedHashMap(map);
        } else {
            linkedHashMap = new LinkedHashMap();
        }
        if (num != null) {
            linkedHashMap.put(Scene.SCENE_SERVICE, num);
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            Object value = entry.getValue();
            if ((value instanceof String) && value != null) {
                linkedHashMap2.put(entry.getKey(), value);
            }
        }
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = -1;
        }
        linkedHashMap2.put(Scene.SCENE_SERVICE, String.valueOf(iIntValue));
        linkedHashMap2.put("action_id", userCommunicationProcessorModel.processorID);
        Object obj = linkedHashMap.get("enter_from");
        if (!(obj instanceof String) || obj == null) {
            obj = "pns_uc_default_enter_from";
        }
        linkedHashMap2.put("enter_from", obj);
        C100C.LIZ.LIZJ().LIZ("pns_uc_action_trigger", linkedHashMap2);
        Object obj2 = ((LinkedHashMap) c1518560pcU.LIZ).get(userCommunicationProcessorModel.processorID);
        if ((obj2 instanceof InterfaceC1524005xu) && (interfaceC1524005xu = (InterfaceC1524005xu) obj2) != null) {
            try {
                interfaceC1524005xu.LIZIZ(userCommunicationProcessorModel.processorData, num, linkedHashMap);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                C100C.LIZ.LIZJ().LIZ("pns_uc_action_trigger_fail", linkedHashMap2);
            }
        }
    }

    public static void LIZLLL(C1518550pcT c1518550pcT, final int i, Map map, final Function1 function1) {
        final String str = null;
        c1518550pcT.getClass();
        HashMap mapLJI = C2097608Jq.LJI(new Pair(Scene.SCENE_SERVICE, String.valueOf(i)));
        if (map != null) {
            mapLJI.putAll(map);
        }
        final long jCurrentTimeMillis = System.currentTimeMillis();
        InterfaceC1518570pcV interfaceC1518570pcVLIZLLL = C100C.LIZ.LIZLLL();
        if (interfaceC1518570pcVLIZLLL.LIZLLL()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(LJFF);
            sbLIZ.append("/popup/dispatch/v1");
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            C1518410pcF c1518410pcFLIZIZ = interfaceC1518570pcVLIZLLL.LIZIZ();
            C1518500pcO c1518500pcO = new C1518500pcO(strLIZIZ, null);
            ((LinkedHashMap) c1518500pcO.LIZLLL).clear();
            c1518500pcO.LIZLLL.putAll(mapLJI);
            c1518410pcFLIZIZ.LIZ(c1518500pcO.LIZ(), NetworkUniversalPopupDispatchResponse.class, true, new InterfaceC1518350pc9<NetworkUniversalPopupDispatchResponse>() { // from class: X.0pc6
                @Override // X.InterfaceC1518350pc9
                public final void LIZ(C1518330pc7<NetworkUniversalPopupDispatchResponse> c1518330pc7) {
                    int iIntValue;
                    NetworkUniversalPopupDispatchResponse networkUniversalPopupDispatchResponse = c1518330pc7.LIZ;
                    long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
                    C1518550pcT.LIZ.getClass();
                    C1518550pcT.LIZIZ(networkUniversalPopupDispatchResponse);
                    Integer num = networkUniversalPopupDispatchResponse.status_code;
                    if (num != null) {
                        iIntValue = num.intValue();
                    } else {
                        iIntValue = 0;
                    }
                    C1518550pcT.LJ(iIntValue, jCurrentTimeMillis2, "/popup/dispatch/", true);
                    int i2 = i;
                    String str2 = str;
                    if (str2 == null) {
                        str2 = "";
                    }
                    C1518550pcT.LJFF(i2, 0, str2, true);
                    String str3 = str;
                    if (str3 != null) {
                        C1518550pcT.LJI(new UserCommunicationProcessorModel(str3, networkUniversalPopupDispatchResponse, null), Integer.valueOf(i), C2097908Jt.LIZJ(new Pair("enter_from", "request_communication_config")));
                    }
                    Function1 function12 = function1;
                    if (function12 != null) {
                        function12.invoke(networkUniversalPopupDispatchResponse);
                    }
                }

                @Override // X.InterfaceC1518350pc9
                public final void onError(Throwable th) {
                    long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
                    int iLIZ = C1501910pBd.LIZ(th);
                    C1518550pcT.LIZ.getClass();
                    C1518550pcT.LJ(iLIZ, jCurrentTimeMillis2, "/popup/dispatch/", false);
                    int i2 = i;
                    String str2 = str;
                    if (str2 == null) {
                        str2 = "";
                    }
                    C1518550pcT.LJFF(i2, iLIZ, str2, false);
                    Function1 function12 = function1;
                    if (function12 != null) {
                        function12.invoke(null);
                    }
                }
            });
            return;
        }
        InterfaceC1502240pCA interfaceC1502240pCA = (InterfaceC1502240pCA) LIZIZ.getValue();
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        LIZ.getClass();
        sbLIZ2.append(LJFF);
        sbLIZ2.append("/popup/dispatch/v1");
        interfaceC1502240pCA.LIZIZ(C2188811AlT.LIZIZ(sbLIZ2), mapLJI).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new AfS3S1101100_23(jCurrentTimeMillis, i, null, function1, 0), new AfS3S1101100_23(jCurrentTimeMillis, i, null, function1, 1));
    }

    public static void LJ(int i, long j, String str, boolean z) {
        String str2;
        InterfaceC1519030pdF interfaceC1519030pdFLIZJ = C100C.LIZ.LIZJ();
        Pair[] pairArr = new Pair[4];
        if (z) {
            str2 = "1";
        } else {
            str2 = CardStruct.IStatusCode.DEFAULT;
        }
        pairArr[0] = new Pair("isSuccess", str2);
        pairArr[1] = new Pair("service", str);
        pairArr[2] = new Pair("code", String.valueOf(i));
        pairArr[3] = new Pair("duration", String.valueOf(j));
        interfaceC1519030pdFLIZJ.LIZ("compliance_api_status", C2097608Jq.LJIIIIZZ(pairArr));
    }

    public static void LJFF(int i, int i2, String str, boolean z) {
        String str2;
        InterfaceC1519030pdF interfaceC1519030pdFLIZJ = C100C.LIZ.LIZJ();
        Pair[] pairArr = new Pair[4];
        if (z) {
            str2 = "1";
        } else {
            str2 = CardStruct.IStatusCode.DEFAULT;
        }
        pairArr[0] = new Pair("success", str2);
        pairArr[1] = new Pair(Scene.SCENE_SERVICE, String.valueOf(i));
        pairArr[2] = new Pair("action_id", str);
        pairArr[3] = new Pair("error_code", String.valueOf(i2));
        interfaceC1519030pdFLIZJ.LIZ("pns_request_communication_config", C2097608Jq.LJIIIIZZ(pairArr));
    }
}
