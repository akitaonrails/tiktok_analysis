package X;

import android.content.Context;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.framework.services.IUserService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0KMa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C516140KMa {
    public String LIZ = "";
    public String LIZIZ = "";
    public String LIZJ = "";
    public String LIZLLL = "";
    public String LJ = "";
    public String LJFF = "";

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v6, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r10v7, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r10v8, types: [java.util.HashMap, java.util.LinkedHashMap] */
    public final String LIZ(int i, Context context) {
        boolean z;
        boolean z2;
        boolean z3;
        String currentUserID;
        Object objLIZ;
        ?? LJ;
        boolean z4;
        boolean z5;
        boolean z6;
        Map map;
        Set setEntrySet;
        if (i != 206) {
            return null;
        }
        if (C0K7G.LJI("live_sub_faq_and_payment_feedback", 0) == 1) {
            z = true;
        } else {
            z = false;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        Keva keva = C0K58.LIZ;
        if ((jCurrentTimeMillis - keva.getLong("PAYMENT_QUESTIONNAIRE_LAST_SHOW_TIMESTAMP", 0L)) / TimeUnit.HOURS.toMillis(1L) >= C0K7G.LJI("live_sub_show_payment_feedback_dialog_hours_frequency", 24)) {
            z2 = true;
        } else {
            z2 = false;
        }
        long j = keva.getLong("PAYMENT_QUESTIONNAIRE_TOTAL_SHOW_TIMES", 0L);
        if (j < C0K7G.LJI("live_sub_show_payment_feedback_dialog_maximal_show_times", 3)) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (!z || !z2 || !z3) {
            return null;
        }
        IUserService iUserService = (IUserService) ServiceManager.get().getService(IUserService.class);
        if (iUserService != null) {
            currentUserID = iUserService.getCurrentUserID();
        } else {
            currentUserID = null;
        }
        if (context != null) {
            InterfaceC1870830ymf interfaceC1870830ymfLIZ = C1323690kYB.LIZ(context);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("user_subscribe_feedback_questionnaire_do_not_show_again_");
            sbLIZ.append(currentUserID);
            objLIZ = interfaceC1870830ymfLIZ.LIZ(C2188811AlT.LIZIZ(sbLIZ));
        } else {
            objLIZ = null;
        }
        if ((objLIZ instanceof Map) && (map = (Map) objLIZ) != null && (setEntrySet = map.entrySet()) != null) {
            ArrayList<Map.Entry> arrayList = new ArrayList();
            for (Object obj : setEntrySet) {
                Map.Entry entry = (Map.Entry) obj;
                if ((entry.getKey() instanceof String) && (entry.getValue() instanceof Boolean)) {
                    arrayList.add(obj);
                }
            }
            int iLIZIZ = C2097908Jt.LIZIZ(C15438062q.LJIJJ(arrayList, 10));
            if (iLIZIZ < 16) {
                iLIZIZ = 16;
            }
            LJ = new LinkedHashMap(iLIZIZ);
            for (Map.Entry entry2 : arrayList) {
                Pair pair = new Pair(entry2.getKey(), entry2.getValue());
                LJ.put(pair.getFirst(), pair.getSecond());
            }
        } else {
            LJ = C2097608Jq.LJ();
        }
        Boolean bool = (Boolean) LJ.get("doNotShowAgain");
        if (bool != null && bool.booleanValue()) {
            return null;
        }
        Keva keva2 = C0K58.LIZ;
        keva2.storeLong("PAYMENT_QUESTIONNAIRE_LAST_SHOW_TIMESTAMP", jCurrentTimeMillis);
        keva2.storeLong("PAYMENT_QUESTIONNAIRE_TOTAL_SHOW_TIMES", j + 1);
        if (this.LIZ.length() == 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (this.LIZIZ.length() == 0) {
            z5 = true;
        } else {
            z5 = false;
        }
        boolean z7 = z4 | z5;
        if (this.LIZJ.length() == 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (z7 | z6) {
            return null;
        }
        return UriProtector.parse(C0K7G.LJIIJJI()).buildUpon().appendQueryParameter("to_uid", this.LIZ).appendQueryParameter("tpl_id", this.LIZIZ).appendQueryParameter("sku_name", this.LIZJ).appendQueryParameter("subscribe_type", this.LIZLLL).appendQueryParameter("package_id", this.LJ).appendQueryParameter("anchor_id", this.LJFF).build().toString();
    }
}
