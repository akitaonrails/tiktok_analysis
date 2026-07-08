package X;

import android.net.Uri;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.report.OutreachReportRequest;
import com.ss.android.ugc.aweme.report.S2SEventBean;
import java.net.NetworkInterface;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import kotlin.jvm.internal.AFwS190S0000000_4;
import kotlin.jvm.internal.AFwS231S0000000_3;
import kotlin.jvm.internal.AFwS245S0000000_12;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0DJf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C337050DJf {
    public static final C337050DJf LIZ = new C337050DJf();
    public static final InterfaceC315020CWm LIZIZ;
    public static final C01GW LIZJ;

    static {
        InterfaceC315020CWm.LIZ.getClass();
        LIZIZ = C313160CPi.LIZJ;
        LIZJ = C452501pT.LIZIZ(AFwS190S0000000_4.get$arr$(3008));
    }

    public static void LIZ(Uri uri, JSONObject jSONObject, String str, int i, String str2) throws JSONException {
        String str3;
        if (((Number) C0ACC.LIZ.getValue()).intValue() == 1) {
            String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "outreach_type");
            String str4 = "";
            if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter == null) {
                strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = "";
            }
            if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter.length() == 0 && (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = jSONObject.optString("outreach_type")) == null) {
                strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = "";
            }
            String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "outreach_key");
            if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 == null) {
                strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 = "";
            }
            if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2.length() == 0 && (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 = jSONObject.optString("outreach_key")) == null) {
                strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 = "";
            }
            JSONObject jSONObject2 = new JSONObject();
            Iterator<String> itKeys = jSONObject.keys();
            JSONObject jSONObject3 = new JSONObject();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                if (!Intrinsics.LJFF(next, "clear_schema")) {
                    jSONObject2.put(next, jSONObject.get(next));
                }
                if (Intrinsics.LJFF(next, "outreach_content")) {
                    jSONObject3.put("af_c_id", jSONObject.get(next));
                }
            }
            jSONObject2.put("af_params", jSONObject3);
            Integer numValueOf = Integer.valueOf(i);
            Long lValueOf = Long.valueOf(System.currentTimeMillis());
            String strLJ = C2222691Bz1.LJ();
            new Object() { // from class: X.0DJg
            }.getClass();
            try {
                ArrayList list = Collections.list(NetworkInterface.getNetworkInterfaces());
                ArrayList arrayList = new ArrayList();
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    C19719612Di.LJJI(Collections.list(((NetworkInterface) it2.next()).getInetAddresses()), arrayList);
                }
                str3 = (String) C09RB.LJIIL(new C08LY(C09RB.LJIIIZ(new C08LY(C09RB.LJIIIZ(new C1939607ik(arrayList), AFwS245S0000000_12.get$arr$(90)), AFwS231S0000000_3.get$arr$(101)), new C020N(true, 4)), new C020N(true, 3)));
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
                str3 = null;
            }
            String strLJI = C1603330rpD.LIZIZ.LJI("other");
            String strLIZJ = AnonymousClass1440.LIZJ();
            if (strLIZJ == null) {
                strLIZJ = "";
            }
            String strLIZIZ = AnonymousClass1440.LIZIZ();
            String strLIZJ2 = AnonymousClass1440.LIZJ();
            if (strLIZJ2 != null) {
                str4 = strLIZJ2;
            }
            OutreachReportRequest outreachReportRequest = new OutreachReportRequest("s2s", new S2SEventBean(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter, strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2, numValueOf, str2, str, lValueOf, 1, strLJ, str3, strLJI, strLIZJ, strLIZIZ, str4, C786410Ut5.J3(jSONObject2)));
            if (LIZIZ == null) {
                C20571615ec.LIZ.getClass();
                C20571615ec.LIZ("report fail: API instance is null}");
            } else {
                C23250099c.LIZLLL((InterfaceC497601wk) LIZJ.getValue(), null, null, new C315040CWo(outreachReportRequest, null), 3);
            }
        }
    }
}
