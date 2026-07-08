package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.pns.consent.core.network.ConsentRecordRequestBody;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.0zwy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1915660zwy {
    public static final /* synthetic */ int LIZJ = 0;
    public final String LIZ;
    public final C01GW LIZIZ = C452501pT.LIZIZ(new C1915670zwz());

    public C1915660zwy(String str) {
        this.LIZ = str;
    }

    public final void LIZJ(String str, Map<String, String> map) {
        try {
            LinkedHashMap linkedHashMap = new LinkedHashMap(map);
            linkedHashMap.put("app_id", this.LIZ);
            linkedHashMap.put("sdk_name", "pns_consent_sdk");
            linkedHashMap.put("sdk_version", "2.7.4.4");
            ((InterfaceC1519030pdF) this.LIZIZ.getValue()).LIZ(str, linkedHashMap);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public final void LIZLLL(String str, List<C1876860ywO> list) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("enter_from", str);
        if (list != null && !list.isEmpty()) {
            linkedHashMap.put("consent_key", ((C1876860ywO) ListProtector.get(list, 0)).LIZ);
            linkedHashMap.put("consent_status", ((C1876860ywO) ListProtector.get(list, 0)).LIZIZ.toString());
            linkedHashMap.put("collection_flow", ((C1876860ywO) ListProtector.get(list, 0)).LIZJ);
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
            Iterator<C1876860ywO> it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList.add(it2.next().LIZ);
            }
            linkedHashMap.put("consent_keys", C13LP.LJJLIIIJ(arrayList, ",", null, null, 0, null, null, 62));
            ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(list, 10));
            Iterator<C1876860ywO> it3 = list.iterator();
            while (it3.hasNext()) {
                arrayList2.add(it3.next().LIZIZ);
            }
            linkedHashMap.put("consent_statuses", C13LP.LJJLIIIJ(arrayList2, ",", null, null, 0, null, null, 62));
            ArrayList arrayList3 = new ArrayList(C15438062q.LJIJJ(list, 10));
            Iterator<C1876860ywO> it4 = list.iterator();
            while (it4.hasNext()) {
                arrayList3.add(it4.next().LIZJ);
            }
            linkedHashMap.put("collection_flows", C13LP.LJJLIIIJ(arrayList3, ",", null, null, 0, null, null, 62));
        }
        LIZJ("pns_consent_sdk", linkedHashMap);
    }

    public final void LIZ(String str, String str2, String str3, String str4, List<ConsentRecordRequestBody> list) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("api_name", str);
        linkedHashMap.put("api_status_code", str2);
        linkedHashMap.put("api_status_msg", str3);
        linkedHashMap.put("enter_from", str4);
        if (list != null && !list.isEmpty()) {
            String str5 = ((ConsentRecordRequestBody) ListProtector.get(list, 0)).entityKey;
            String str6 = "";
            if (str5 == null) {
                str5 = "";
            }
            linkedHashMap.put("consent_key", str5);
            linkedHashMap.put("consent_status", String.valueOf(((ConsentRecordRequestBody) ListProtector.get(list, 0)).status));
            String str7 = ((ConsentRecordRequestBody) ListProtector.get(list, 0)).businessFlow;
            if (str7 != null) {
                str6 = str7;
            }
            linkedHashMap.put("collection_flow", str6);
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
            Iterator<ConsentRecordRequestBody> it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList.add(it2.next().entityKey);
            }
            linkedHashMap.put("consent_keys", C13LP.LJJLIIIJ(arrayList, ",", null, null, 0, null, null, 62));
            ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(list, 10));
            Iterator<ConsentRecordRequestBody> it3 = list.iterator();
            while (it3.hasNext()) {
                arrayList2.add(Integer.valueOf(it3.next().status));
            }
            linkedHashMap.put("consent_statuses", C13LP.LJJLIIIJ(arrayList2, ",", null, null, 0, null, null, 62));
            ArrayList arrayList3 = new ArrayList(C15438062q.LJIJJ(list, 10));
            Iterator<ConsentRecordRequestBody> it4 = list.iterator();
            while (it4.hasNext()) {
                arrayList3.add(it4.next().businessFlow);
            }
            linkedHashMap.put("collection_flows", C13LP.LJJLIIIJ(arrayList3, ",", null, null, 0, null, null, 62));
        }
        LIZJ("pns_consent_sdk_api", linkedHashMap);
    }
}
