package X;

import android.content.Context;
import com.bytedance.android.livesdk.livesetting.subscription.LiveSubscribeQuestionnairePageSchemaSetting;
import com.bytedance.android.livesdk.livesetting.subscription.LiveSubscriptionPaymentShowFeedbackQuestionnaireSetting;
import com.bytedance.android.livesdk.livesetting.subscription.LiveSubscriptionQuestionnaireHourFrequencySetting;
import com.bytedance.android.livesdk.livesetting.subscription.LiveSubscriptionQuestionnaireMaxShowTimesSetting;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0KMt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C516330KMt {
    public String LIZ = "";
    public String LIZIZ = "";
    public String LIZJ = "";
    public String LIZLLL = "";
    public String LJ = "";
    public String LJFF = "";

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.HashMap, java.util.LinkedHashMap] */
    public static boolean LIZ(Context context) {
        Object objLIZ;
        ?? LJ;
        Set setEntrySet;
        long currentUserId = UserService.getInstance().user().getCurrentUserId();
        Map map = null;
        if (context != null) {
            InterfaceC1870830ymf interfaceC1870830ymfLIZ = C1323690kYB.LIZ(context);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("user_subscribe_feedback_questionnaire_do_not_show_again_");
            sbLIZ.append(currentUserId);
            objLIZ = interfaceC1870830ymfLIZ.LIZ(C2188811AlT.LIZIZ(sbLIZ));
        } else {
            objLIZ = null;
        }
        if (objLIZ instanceof Map) {
            map = (Map) objLIZ;
        }
        if (map != null && (setEntrySet = map.entrySet()) != null) {
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
        if (bool == null) {
            return false;
        }
        return bool.booleanValue();
    }

    public final String LIZIZ(int i, Context context) {
        long jDoubleValue;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        Double dLIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("errorCode:");
        sbLIZ.append(i);
        C20441214yg.LIZIZ("SubscribePaymentBehavior", C2188811AlT.LIZIZ(sbLIZ));
        if (i != 206) {
            return null;
        }
        boolean enablePaymentFeedBackQuestionnaire = LiveSubscriptionPaymentShowFeedbackQuestionnaireSetting.getEnablePaymentFeedBackQuestionnaire();
        double dCurrentTimeMillis = System.currentTimeMillis();
        long jDoubleValue2 = 0;
        try {
            dLIZ = C0KPJ.qe.LIZ();
        } catch (NumberFormatException e) {
            TryCatchGuardChecker.doCheck(e);
        }
        if (dLIZ != null) {
            jDoubleValue = (long) dLIZ.doubleValue();
        } else {
            jDoubleValue = 0;
        }
        boolean z5 = true;
        if ((dCurrentTimeMillis - jDoubleValue) / TimeUnit.HOURS.toMillis(1L) >= LiveSubscriptionQuestionnaireHourFrequencySetting.getSubPaymentDialogHourFrequency()) {
            z = true;
        } else {
            z = false;
        }
        try {
            Double dLIZ2 = C0KPJ.re.LIZ();
            if (dLIZ2 != null) {
                jDoubleValue2 = (long) dLIZ2.doubleValue();
            }
        } catch (NumberFormatException e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        if (jDoubleValue2 < LiveSubscriptionQuestionnaireMaxShowTimesSetting.getSubPaymentDialogMaximalShowTimes()) {
            z2 = true;
        } else {
            z2 = false;
        }
        C20441214yg.LIZIZ("SubscribePaymentBehavior", "experimentEnable:" + enablePaymentFeedBackQuestionnaire + ", frequentEnable:" + z + "showTimesEnable:" + z2 + ", neverShowAgain:" + LIZ(context));
        if (!enablePaymentFeedBackQuestionnaire || !z || !z2 || LIZ(context)) {
            return null;
        }
        C0KPJ.qe.LIZJ(Double.valueOf(dCurrentTimeMillis));
        C0KPJ.re.LIZJ(Double.valueOf(jDoubleValue2 + 1));
        if (this.LIZ.length() == 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (this.LIZIZ.length() == 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        boolean z6 = z3 | z4;
        if (this.LIZJ.length() != 0) {
            z5 = false;
        }
        if (z6 | z5) {
            return null;
        }
        C495520Jby c495520Jby = new C495520Jby(LiveSubscribeQuestionnairePageSchemaSetting.INSTANCE.getValue().getQuestionHalfScreen());
        c495520Jby.LIZJ("to_uid", this.LIZ);
        c495520Jby.LIZJ("tpl_id", this.LIZIZ);
        c495520Jby.LIZJ("sku_name", this.LIZJ);
        c495520Jby.LIZJ("subscribe_type", this.LIZLLL);
        c495520Jby.LIZJ("package_id", this.LJ);
        c495520Jby.LIZJ("anchor_id", this.LJFF);
        return c495520Jby.LIZLLL();
    }
}
