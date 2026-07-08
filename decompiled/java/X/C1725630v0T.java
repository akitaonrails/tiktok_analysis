package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.pipo.hybrid.settings.PipoContainerEventReportConfig;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.jvm.internal.AFwS268S0000000_26;
import kotlin.jvm.internal.AwS605S0100000_26;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0v0T, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1725630v0T {
    public C1725610v0R LIZ;
    public final List<C1725640v0U> LIZIZ;
    public final List<C1725650v0V> LIZJ;

    public final JSONObject LJFF() throws JSONException {
        int iNextIndex;
        int iNextIndex2;
        int iNextIndex3;
        JSONObject jSONObject;
        int iLJIIJ = C1697810uHb.LJIIJ(this.LIZIZ);
        int iLJIIJ2 = C1697810uHb.LJIIJ(this.LIZIZ) - 1;
        List<C1725640v0U> listSubList = iLJIIJ >= 0 ? this.LIZIZ.subList(0, iLJIIJ) : C13BV.INSTANCE;
        ListIterator<C1725640v0U> listIterator = listSubList.listIterator(listSubList.size());
        while (true) {
            iNextIndex = -1;
            if (!listIterator.hasPrevious()) {
                iNextIndex2 = -1;
                break;
            }
            if (Intrinsics.LJFF(listIterator.previous().LIZJ, "decision")) {
                iNextIndex2 = listIterator.nextIndex();
                break;
            }
        }
        ListIterator<C1725640v0U> listIterator2 = listSubList.listIterator(listSubList.size());
        while (listIterator2.hasPrevious()) {
            C1725640v0U c1725640v0UPrevious = listIterator2.previous();
            if (Intrinsics.LJFF(c1725640v0UPrevious.LIZJ, "finish") || Intrinsics.LJFF(c1725640v0UPrevious.LIZJ, "redirect")) {
                iNextIndex3 = listIterator2.nextIndex();
                break;
            }
        }
        iNextIndex3 = -1;
        ListIterator<C1725640v0U> listIterator3 = listSubList.listIterator(listSubList.size());
        while (true) {
            if (!listIterator3.hasPrevious()) {
                break;
            }
            if (Intrinsics.LJFF(listIterator3.previous().LIZJ, "error")) {
                iNextIndex = listIterator3.nextIndex();
                break;
            }
        }
        C1725640v0U c1725640v0U = iLJIIJ >= 0 ? (C1725640v0U) ListProtector.get(this.LIZIZ, iLJIIJ) : null;
        C1725640v0U c1725640v0U2 = iLJIIJ2 >= 0 ? (C1725640v0U) ListProtector.get(this.LIZIZ, iLJIIJ2) : null;
        C1725640v0U c1725640v0U3 = iNextIndex2 >= 0 ? (C1725640v0U) ListProtector.get(this.LIZIZ, iNextIndex2) : null;
        C1725640v0U c1725640v0U4 = iNextIndex3 >= 0 ? (C1725640v0U) ListProtector.get(this.LIZIZ, iNextIndex3) : null;
        C1725640v0U c1725640v0U5 = iNextIndex >= 0 ? (C1725640v0U) ListProtector.get(this.LIZIZ, iNextIndex) : null;
        JSONObject jSONObjectLIZ = c1725640v0U != null ? c1725640v0U.LIZ(null) : null;
        JSONObject jSONObjectLIZ2 = c1725640v0U2 != null ? c1725640v0U2.LIZ("prev") : null;
        JSONObject jSONObjectLIZ3 = c1725640v0U3 != null ? c1725640v0U3.LIZ("prev_decision") : null;
        JSONObject jSONObjectLIZ4 = c1725640v0U4 != null ? c1725640v0U4.LIZ("prev_finish") : null;
        JSONObject jSONObjectLIZ5 = c1725640v0U5 != null ? c1725640v0U5.LIZ("prev_error") : null;
        if (c1725640v0U == null) {
            jSONObject = null;
        } else {
            jSONObject = new JSONObject();
            if (c1725640v0U2 != null) {
                jSONObject.put("time_elap_since_last_step", c1725640v0U.LJFF - c1725640v0U2.LJFF);
            }
            if (c1725640v0U3 != null) {
                jSONObject.put("time_elap_since_last_decision", c1725640v0U.LJFF - c1725640v0U3.LJFF);
            }
            if (c1725640v0U4 != null) {
                jSONObject.put("time_elap_since_last_finish", c1725640v0U.LJFF - c1725640v0U4.LJFF);
            }
            if (c1725640v0U5 != null) {
                jSONObject.put("time_elap_since_last_error", c1725640v0U.LJFF - c1725640v0U5.LJFF);
            }
            C1725610v0R c1725610v0R = this.LIZ;
            if (c1725610v0R != null) {
                jSONObject.put("time_elap_since_start", c1725640v0U.LJFF - c1725610v0R.LJI);
            }
        }
        JSONObject jSONObject2 = new JSONObject();
        List<C1725640v0U> list = this.LIZIZ;
        ArrayList arrayList = new ArrayList();
        for (C1725640v0U c1725640v0U6 : list) {
            if (Intrinsics.LJFF(c1725640v0U6.LIZJ, "decision")) {
                arrayList.add(c1725640v0U6);
            }
        }
        jSONObject2.put("index_decision", arrayList.size());
        List<C1725640v0U> list2 = this.LIZIZ;
        ArrayList arrayList2 = new ArrayList();
        for (C1725640v0U c1725640v0U7 : list2) {
            if (Intrinsics.LJFF(c1725640v0U7.LIZJ, "error")) {
                arrayList2.add(c1725640v0U7);
            }
        }
        jSONObject2.put("index_error", arrayList2.size());
        List<C1725640v0U> list3 = this.LIZIZ;
        ArrayList arrayList3 = new ArrayList();
        for (C1725640v0U c1725640v0U8 : list3) {
            C1725640v0U c1725640v0U9 = c1725640v0U8;
            if (Intrinsics.LJFF(c1725640v0U9.LIZJ, "finish") || Intrinsics.LJFF(c1725640v0U9.LIZJ, "redirect")) {
                arrayList3.add(c1725640v0U8);
            }
        }
        jSONObject2.put("index_finish", arrayList3.size());
        C1725610v0R c1725610v0R2 = this.LIZ;
        return C1530940pwS.LIZ(c1725610v0R2 != null ? C1725610v0R.LIZ(c1725610v0R2, false, false, 3) : null, jSONObjectLIZ, jSONObjectLIZ2, jSONObjectLIZ3, jSONObjectLIZ4, jSONObjectLIZ5, jSONObject, jSONObject2);
    }

    public final JSONObject LJ() {
        long j;
        boolean z;
        boolean z2;
        int i;
        long jCurrentTimeMillis = System.currentTimeMillis();
        ArrayList<C1725640v0U> arrayList = new ArrayList();
        int size = this.LIZIZ.size();
        int i2 = 0;
        while (i2 < this.LIZIZ.size()) {
            C1725640v0U c1725640v0U = (C1725640v0U) ListProtector.get(this.LIZIZ, i2);
            if (Intrinsics.LJFF(c1725640v0U.LIZJ, "decision")) {
                while (true) {
                    i = i2 + 1;
                    if (i >= size) {
                        break;
                    }
                    C1725640v0U c1725640v0U2 = (C1725640v0U) ListProtector.get(this.LIZIZ, i);
                    if (Intrinsics.LJFF(c1725640v0U2.LIZJ, "decision") || !LIZLLL(c1725640v0U, c1725640v0U2)) {
                        break;
                    }
                    i2 = i;
                }
                C1725640v0U c1725640v0U3 = (C1725640v0U) ListProtector.get(this.LIZIZ, i2);
                c1725640v0U3.LJIIIIZZ = (i < size ? ((C1725640v0U) ListProtector.get(this.LIZIZ, i)).LJFF : jCurrentTimeMillis) - c1725640v0U.LJFF;
                arrayList.add(c1725640v0U3);
                i2 = i;
            } else {
                arrayList.add(ListProtector.get(this.LIZIZ, i2));
                i2++;
            }
        }
        C1725640v0U c1725640v0U4 = (C1725640v0U) C13LP.LJJJLL(this.LIZIZ);
        if (c1725640v0U4 != null) {
            long j2 = c1725640v0U4.LJFF;
            C1725610v0R c1725610v0R = this.LIZ;
            j = j2 - (c1725610v0R != null ? c1725610v0R.LJI : 0L);
        } else {
            j = 0;
        }
        JSONArray jSONArray = new JSONArray();
        int i3 = 0;
        for (Object obj : arrayList) {
            int i4 = i3 + 1;
            if (i3 < 0) {
                C1697810uHb.LJIJI();
                throw null;
            }
            jSONArray.put(((C1725640v0U) obj).LJIIIIZZ);
            i3 = i4;
        }
        JSONArray jSONArray2 = new JSONArray();
        int i5 = 0;
        for (Object obj2 : arrayList) {
            int i6 = i5 + 1;
            if (i5 < 0) {
                C1697810uHb.LJIJI();
                throw null;
            }
            jSONArray2.put(((C1725640v0U) obj2).LIZJ);
            i5 = i6;
        }
        jSONArray2.put(C13LP.LJJLIIIJ(this.LIZIZ, "", null, null, 0, null, new AwS605S0100000_26(this, 566), 30));
        if (arrayList.isEmpty()) {
            z = false;
        } else {
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                if (Intrinsics.LJFF(((C1725640v0U) it2.next()).LIZJ, "error")) {
                    z = true;
                    break;
                }
            }
            z = false;
        }
        if (arrayList.isEmpty()) {
            z2 = false;
        } else {
            Iterator it3 = arrayList.iterator();
            while (it3.hasNext()) {
                if (Intrinsics.LJFF(((C1725640v0U) it3.next()).LIZJ, "decision")) {
                    z2 = true;
                    break;
                }
            }
            z2 = false;
        }
        boolean z3 = !this.LIZJ.isEmpty();
        StringBuilder sb = new StringBuilder();
        if (z) {
            if (sb.length() > 0) {
                sb.append("|");
            }
            sb.append("load_error");
        }
        if (z2) {
            if (sb.length() > 0) {
                sb.append("|");
            }
            sb.append("un_finished_url");
        }
        if (z3) {
            if (sb.length() > 0) {
                sb.append("|");
            }
            sb.append("resource_error");
        }
        String string = sb.length() == 0 ? "success" : sb.toString();
        C1725610v0R c1725610v0R2 = this.LIZ;
        long j3 = jCurrentTimeMillis - (c1725610v0R2 != null ? c1725610v0R2.LJI : 0L);
        int size2 = arrayList.size();
        String strLJJLIIIJ = C13LP.LJJLIIIJ(arrayList, "||", null, null, 0, null, AFwS268S0000000_26.get$arr$(577), 30);
        String string2 = jSONArray.toString();
        String string3 = jSONArray2.toString();
        int size3 = this.LIZJ.size();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("result", string);
        jSONObject.put("duration", j3);
        jSONObject.put("web_router_num", size2);
        jSONObject.put("web_router_info_summary", strLJJLIIIJ);
        jSONObject.put("web_router_result", string3);
        jSONObject.put("web_router_metrics", string2);
        jSONObject.put("resource_error_cnt", size3);
        jSONObject.put("load_latency", j);
        JSONArray jSONArray3 = new JSONArray();
        for (C1725640v0U c1725640v0U5 : arrayList) {
            c1725640v0U5.getClass();
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("step", c1725640v0U5.LIZJ);
            jSONObject2.put("url_host", c1725640v0U5.LIZ);
            jSONObject2.put("url_path", c1725640v0U5.LIZIZ);
            jSONObject2.put("load_latency", c1725640v0U5.LJI);
            jSONObject2.put("stay_duration", c1725640v0U5.LJIIIIZZ);
            String str = c1725640v0U5.LIZLLL;
            if (str != null) {
                jSONObject2.put("error_code", str);
            }
            String str2 = c1725640v0U5.LJ;
            if (str2 != null) {
                jSONObject2.put("error_message", str2);
            }
            JSONObject jSONObject3 = new JSONObject();
            Iterator<String> itKeys = jSONObject2.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                List<String> list = C1725380v04.LIZ().keysOfWebRouterInfo;
                if (list != null && list.contains(next)) {
                    jSONObject3.put(next, jSONObject2.opt(next));
                }
            }
            jSONArray3.put(jSONObject3);
        }
        JSONObject jSONObjectPut = new JSONObject().put("web_router_info", jSONArray3.toString());
        C1725610v0R c1725610v0R3 = this.LIZ;
        return C1530940pwS.LIZ(c1725610v0R3 != null ? C1725610v0R.LIZ(c1725610v0R3, false, true, 1) : null, jSONObject, jSONObjectPut);
    }

    public C1725630v0T(int i) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        this.LIZ = null;
        this.LIZIZ = arrayList;
        this.LIZJ = arrayList2;
    }

    public static boolean LIZLLL(C1725640v0U c1725640v0U, C1725640v0U c1725640v0U2) {
        if (Intrinsics.LJFF(c1725640v0U.LIZIZ, c1725640v0U2.LIZIZ) && Intrinsics.LJFF(c1725640v0U.LIZ, c1725640v0U2.LIZ)) {
            return true;
        }
        return false;
    }

    public final void LIZ(C1725640v0U c1725640v0U, C1725640v0U c1725640v0U2, List<JSONObject> list) {
        long j;
        if (C1725380v04.LIZ().enableAddManualDecision) {
            if (c1725640v0U != null) {
                j = c1725640v0U.LJFF;
            } else {
                j = c1725640v0U2.LJFF;
            }
            LIZIZ("decision", j, c1725640v0U2, list);
        }
    }

    public final void LIZJ(C1725640v0U c1725640v0U, C1725640v0U c1725640v0U2, List<JSONObject> list) {
        PipoContainerEventReportConfig pipoContainerEventReportConfigLIZ = C1725380v04.LIZ();
        long j = c1725640v0U.LJFF;
        if (pipoContainerEventReportConfigLIZ.enableAddManualRedirect) {
            LIZIZ("redirect", j, c1725640v0U, list);
        }
        if (pipoContainerEventReportConfigLIZ.enableAddManualDecision) {
            LIZIZ("decision", j, c1725640v0U2, list);
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [X.0v0X] */
    public final void LIZIZ(String str, long j, C1725640v0U c1725640v0U, List<JSONObject> list) {
        ?? r1 = new Object() { // from class: X.0v0X
        };
        List<C1725640v0U> list2 = this.LIZIZ;
        C1725640v0U c1725640v0U2 = new C1725640v0U(c1725640v0U.LIZ, c1725640v0U.LIZIZ, str, j, 24);
        c1725640v0U2.LJII = r1;
        list2.add(c1725640v0U2);
        ((ArrayList) list).add(LJFF());
    }
}
