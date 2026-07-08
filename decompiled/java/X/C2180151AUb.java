package X;

import Y.ARunnableS109S0100000_9;
import android.app.Activity;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.hybrid.spark.page.SparkActivity;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.search.common.utils.SAFHelper;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.AFwS279S0000000_33;
import kotlin.jvm.internal.AwS44S0000100_33;
import kotlin.text.a0;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.1AUb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C2180151AUb {
    public static final LinkedHashMap<Integer, C2180161AUc> LIZ = new LinkedHashMap<>();
    public static final List<C2180171AUd> LIZIZ = new ArrayList();

    static {
        C1906580ziK.LIZJ().LJIIIZ().LJLLLLLL(new C09JN() { // from class: X.0ziO
            @Override // X.C09JN
            public final void accept(Object obj) {
                String strLLLLLZL;
                C1C7U.LIZ("SearchPageReclaimMonitor@d14a.observeViaRootPageMonitor$1");
                C813430VvZ c813430VvZ = (C813430VvZ) obj;
                Object obj2 = c813430VvZ.LIZ.LIZ;
                if (obj2 instanceof SparkActivity) {
                    SparkActivity sparkActivity = (SparkActivity) obj2;
                    SparkContext sparkContext = sparkActivity.LL;
                    if (sparkContext == null || (strLLLLLZL = sparkContext.LJIJI()) == null) {
                        strLLLLLZL = sparkActivity.LLLLLZL();
                    }
                    if (strLLLLLZL != null && a0.LJJIIZI(strLLLLLZL, "target_handler=search_page", false)) {
                        LinkedHashMap<Integer, C2180161AUc> linkedHashMap = C2180151AUb.LIZ;
                        C2180151AUb.LIZJ(c813430VvZ.LIZIZ, "SparkActivity", obj2);
                    }
                }
                C1C7U.LIZIZ("SearchPageReclaimMonitor@d14a.observeViaRootPageMonitor$1");
            }
        });
        C1906580ziK.LIZJ().LJIIL().LJLLLLLL(new C09JN() { // from class: X.0Q8C
            @Override // X.C09JN
            public final void accept(Object obj) {
                C1C7U.LIZ("SearchPageReclaimMonitor@d14a.observeViaRootPageMonitor$2");
                C813430VvZ c813430VvZ = (C813430VvZ) obj;
                if (C2180151AUb.LIZ.containsKey(Integer.valueOf(System.identityHashCode(c813430VvZ.LIZ.LIZ)))) {
                    C2180151AUb.LJ(c813430VvZ.LIZ.LIZ);
                }
                C1C7U.LIZIZ("SearchPageReclaimMonitor@d14a.observeViaRootPageMonitor$2");
            }
        });
        C1906580ziK.LIZJ().LJIIJ().LJLLLLLL(new C09JN() { // from class: X.0Q8D
            @Override // X.C09JN
            public final void accept(Object obj) {
                C1C7U.LIZ("SearchPageReclaimMonitor@d14a.observeViaRootPageMonitor$3");
                AbstractC1387200mCc abstractC1387200mCc = (AbstractC1387200mCc) obj;
                LinkedHashMap<Integer, C2180161AUc> linkedHashMap = C2180151AUb.LIZ;
                C2180151AUb.LIZIZ(System.identityHashCode(abstractC1387200mCc.LIZ), abstractC1387200mCc.LIZ);
                C1C7U.LIZIZ("SearchPageReclaimMonitor@d14a.observeViaRootPageMonitor$3");
            }
        });
        C1906580ziK.LIZJ().LJII().LJLLLLLL(new C09JN() { // from class: X.0Q8B
            @Override // X.C09JN
            public final void accept(Object obj) {
                Activity activity;
                C1C7U.LIZ("SearchPageReclaimMonitor@d14a.observeViaRootPageMonitor$4");
                AbstractC1387200mCc abstractC1387200mCc = (AbstractC1387200mCc) obj;
                if (C2180151AUb.LIZ.containsKey(Integer.valueOf(System.identityHashCode(abstractC1387200mCc.LIZ)))) {
                    SAFHelper sAFHelper = SAFHelper.LIZ;
                    Object obj2 = abstractC1387200mCc.LIZ;
                    if (obj2 instanceof Activity) {
                        activity = (Activity) obj2;
                    } else {
                        activity = null;
                    }
                    sAFHelper.getClass();
                    C2180151AUb.LIZLLL(abstractC1387200mCc.LIZ, SAFHelper.LJJJJIZL(activity));
                }
                C1C7U.LIZIZ("SearchPageReclaimMonitor@d14a.observeViaRootPageMonitor$4");
            }
        });
    }

    public static String LIZ() {
        try {
            return C13LQ.LJJJ(C1906580ziK.LJII(), ",", null, null, AFwS279S0000000_33.get$arr$(435), 30);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return "error";
        }
    }

    public static void LJ(Object obj) {
        C2180161AUc c2180161AUc = LIZ.get(Integer.valueOf(System.identityHashCode(obj)));
        if (c2180161AUc != null) {
            c2180161AUc.LJII = Long.valueOf(System.currentTimeMillis());
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("onPageStateSaved: ");
            sbLIZ.append(c2180161AUc.LIZJ);
            C2188811AlT.LIZIZ(sbLIZ);
        }
    }

    public static void LJFF(JSONObject jSONObject) {
        C823050WQl.LIZLLL().execute(new ARunnableS109S0100000_9(jSONObject, 237));
    }

    public static void LIZIZ(int i, Object obj) {
        String strLIZIZ;
        if (((ArrayList) LIZIZ).isEmpty()) {
            return;
        }
        C2180161AUc c2180161AUc = LIZ.get(Integer.valueOf(i));
        if (c2180161AUc == null || (strLIZIZ = c2180161AUc.LIZJ) == null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(obj.getClass().getSimpleName());
            sbLIZ.append('#');
            sbLIZ.append(i);
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        }
        C13E8 c13e8 = new C13E8();
        c13e8.addLast(Integer.valueOf(i));
        while (!c13e8.isEmpty()) {
            int iIntValue = ((Number) c13e8.removeFirst()).intValue();
            Iterator it2 = ((ArrayList) LIZIZ).iterator();
            while (it2.hasNext()) {
                C2180171AUd c2180171AUd = (C2180171AUd) it2.next();
                Integer num = c2180171AUd.LJI;
                if (num != null && num.intValue() == iIntValue) {
                    it2.remove();
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("page_type", c2180171AUd.LIZIZ);
                    jSONObject.put("reclaim_type", "skipped");
                    jSONObject.put("page_name", c2180171AUd.LIZJ);
                    String str = c2180171AUd.LIZLLL;
                    if (str != null) {
                        jSONObject.put("page_url", str);
                    }
                    String str2 = c2180171AUd.LJII;
                    if (str2 == null) {
                        str2 = "unknown";
                    }
                    jSONObject.put("expected_parent", str2);
                    jSONObject.put("actual_parent", strLIZIZ);
                    Long l = c2180171AUd.LJFF;
                    if (l != null) {
                        jSONObject.put("saved_state_duration_ms", c2180171AUd.LJ - l.longValue());
                    }
                    jSONObject.put("page_stack_snapshot", LIZ());
                    LJFF(jSONObject);
                    c13e8.addLast(Integer.valueOf(c2180171AUd.LIZ));
                }
            }
        }
    }

    public static void LIZLLL(Object obj, boolean z) {
        boolean z2;
        C2180161AUc c2180161AUcRemove = LIZ.remove(Integer.valueOf(System.identityHashCode(obj)));
        if (c2180161AUcRemove == null) {
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onPageDestroyed: ");
        sbLIZ.append(c2180161AUcRemove.LIZJ);
        sbLIZ.append(", isFinishing=");
        sbLIZ.append(z);
        sbLIZ.append(", backPressed=");
        sbLIZ.append(c2180161AUcRemove.LJIIIIZZ);
        sbLIZ.append(", stateSaved=");
        if (c2180161AUcRemove.LJII != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        sbLIZ.append(z2);
        C2188811AlT.LIZIZ(sbLIZ);
        if (!z && !c2180161AUcRemove.LJIIIIZZ && c2180161AUcRemove.LJII != null) {
            List<C2180171AUd> list = LIZIZ;
            ((ArrayList) list).add(new C2180171AUd(c2180161AUcRemove.LIZ, c2180161AUcRemove.LIZIZ, c2180161AUcRemove.LIZJ, c2180161AUcRemove.LIZLLL, System.currentTimeMillis(), c2180161AUcRemove.LJII, c2180161AUcRemove.LJFF, c2180161AUcRemove.LJI));
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("page_type", c2180161AUcRemove.LIZIZ);
            jSONObject.put("reclaim_type", "reclaimed");
            jSONObject.put("page_name", c2180161AUcRemove.LIZJ);
            String str = c2180161AUcRemove.LIZLLL;
            if (str != null) {
                jSONObject.put("page_url", str);
            }
            String str2 = c2180161AUcRemove.LJI;
            if (str2 == null) {
                str2 = "unknown";
            }
            jSONObject.put("expected_parent", str2);
            Long l = c2180161AUcRemove.LJII;
            if (l != null) {
                jSONObject.put("saved_state_duration_ms", System.currentTimeMillis() - l.longValue());
            }
            jSONObject.put("page_stack_snapshot", LIZ());
            LJFF(jSONObject);
            C19719612Di.LJJIIJ(list, new AwS44S0000100_33(System.currentTimeMillis(), 9), true);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:59:0x0173, code lost:
    
        if (r3 != null) goto L34;
     */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x014a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZJ(android.os.Bundle r21, java.lang.String r22, java.lang.Object r23) {
        /*
            Method dump skipped, instruction units count: 424
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2180151AUb.LIZJ(android.os.Bundle, java.lang.String, java.lang.Object):void");
    }
}
