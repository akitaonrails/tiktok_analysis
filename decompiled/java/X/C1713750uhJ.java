package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.pipo.verify.base.model.VerifyDetail;
import com.bytedance.pipo.verify.base.model.VerifyInfo;
import com.bytedance.pipo.verify.base.tracking.VerifyAnalysisSession;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.n;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS268S0000000_26;
import kotlin.jvm.internal.AwS175S1100000_26;
import kotlin.text.a0;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0uhJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1713750uhJ {
    public static final /* synthetic */ int LJIIIZ = 0;
    public final int LIZ;
    public volatile C1713570uh1 LIZIZ;
    public volatile C1713520ugw LIZJ;
    public volatile long LIZLLL;
    public final AtomicBoolean LJ;
    public final C1708050uY7 LJFF;
    public volatile long LJI;
    public final AtomicBoolean LJII;
    public volatile int LJIIIIZZ;

    public C1713750uhJ() {
        this(1);
    }

    public final VerifyAnalysisSession LIZ() {
        VerifyInfo verifyInfoLJIIIZ;
        C1713570uh1 c1713570uh1 = this.LIZIZ;
        String str = (c1713570uh1 == null || (verifyInfoLJIIIZ = c1713570uh1.LJIIIZ()) == null) ? null : verifyInfoLJIIIZ.verifyId;
        C1707060uWW.LIZ.getClass();
        return C1707060uWW.LIZ(str);
    }

    public final Map<String, String> LIZJ() {
        String str;
        VerifyDetail verifyDetailLJIIIIZZ;
        String str2;
        VerifyInfo verifyInfoLJIIIZ;
        VerifyDetail verifyDetail;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Pair pair : (ArrayList) LJFF()) {
            linkedHashMap.put(pair.getFirst(), pair.getSecond());
        }
        for (Map.Entry<String, String> entry : LIZLLL().entrySet()) {
            linkedHashMap.put(entry.getKey(), entry.getValue());
        }
        C1713570uh1 c1713570uh1 = this.LIZIZ;
        String str3 = "";
        if (c1713570uh1 == null || (verifyInfoLJIIIZ = c1713570uh1.LJIIIZ()) == null || (verifyDetail = verifyInfoLJIIIZ.verifyDetail) == null || (str = verifyDetail.paymentMethod) == null) {
            str = "";
        }
        linkedHashMap.put("payment_method", str);
        C1713570uh1 c1713570uh12 = this.LIZIZ;
        if (c1713570uh12 != null && (verifyDetailLJIIIIZZ = c1713570uh12.LJIIIIZZ()) != null && (str2 = verifyDetailLJIIIIZZ.verifyMethod) != null) {
            str3 = str2;
        }
        linkedHashMap.put("verify_method", str3);
        linkedHashMap.put("jailbroken_or_rooted", LJ());
        return linkedHashMap;
    }

    public final Map<String, String> LIZLLL() {
        C1713590uh3 c1713590uh3;
        C1713840uhS c1713840uhS;
        C00IO c00io;
        Map<String, String> mapLIZ;
        C1713840uhS c1713840uhSLIZLLL;
        C00IO c00io2;
        Map<String, String> mapLIZ2;
        C1713570uh1 c1713570uh1 = this.LIZIZ;
        if (c1713570uh1 != null && (c1713840uhSLIZLLL = c1713570uh1.LIZLLL()) != null && (c00io2 = c1713840uhSLIZLLL.LIZIZ) != null && (mapLIZ2 = c00io2.LIZ()) != null) {
            return mapLIZ2;
        }
        C1713520ugw c1713520ugw = this.LIZJ;
        return (c1713520ugw == null || (c1713590uh3 = c1713520ugw.LIZ) == null || (c1713840uhS = c1713590uh3.LIZ) == null || (c00io = c1713840uhS.LIZIZ) == null || (mapLIZ = c00io.LIZ()) == null) ? C2097608Jq.LJ() : mapLIZ;
    }

    public final List<Pair<String, String>> LJFF() {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        ArrayList arrayList = new ArrayList();
        arrayList.add(new Pair("current_step", String.valueOf(this.LIZ)));
        arrayList.add(new Pair("concurrent_request", String.valueOf(this.LJIIIIZZ)));
        C1713570uh1 c1713570uh1 = this.LIZIZ;
        str = "";
        if (c1713570uh1 != null) {
            VerifyDetail verifyDetailLJIIIIZZ = c1713570uh1.LJIIIIZZ();
            if (verifyDetailLJIIIIZZ == null || (str2 = verifyDetailLJIIIIZZ.experimentGroup) == null) {
                str2 = "";
            }
            arrayList.add(new Pair("experiment_group", str2));
            VerifyInfo verifyInfoLJIIIZ = c1713570uh1.LJIIIZ();
            if (verifyInfoLJIIIZ == null || (str3 = verifyInfoLJIIIZ.verifyId) == null) {
                str3 = "";
            }
            arrayList.add(new Pair("verify_id", str3));
            VerifyInfo verifyInfoLJIIIZ2 = c1713570uh1.LJIIIZ();
            if (verifyInfoLJIIIZ2 == null || (str4 = verifyInfoLJIIIZ2.verifyType) == null) {
                str4 = "";
            }
            arrayList.add(new Pair("verify_type", str4));
            String str9 = c1713570uh1.LJIIIZ().actionType;
            if (str9 == null) {
                str9 = "";
            }
            arrayList.add(new Pair("action_type", str9));
            VerifyDetail verifyDetail = c1713570uh1.LJIIIZ().verifyDetail;
            if (verifyDetail == null || (str5 = verifyDetail.pipoProductCat) == null) {
                str5 = "";
            }
            arrayList.add(new Pair("busi_type", str5));
            VerifyDetail verifyDetail2 = c1713570uh1.LJIIIZ().verifyDetail;
            if (verifyDetail2 == null || (str6 = verifyDetail2.bizType) == null) {
                str6 = "";
            }
            arrayList.add(new Pair("biz_type", str6));
            arrayList.add(new Pair("page_style", c1713570uh1.LJFF() != EnumC1714450uiR.FULL_PAGE ? "half" : "full"));
            String str10 = c1713570uh1.LIZ.LIZJ.LIZ;
            if (str10 == null) {
                str10 = "";
            }
            arrayList.add(new Pair("session_id", str10));
            VerifyDetail verifyDetailLJIIIIZZ2 = c1713570uh1.LJIIIIZZ();
            if (verifyDetailLJIIIIZZ2 == null || (str7 = verifyDetailLJIIIIZZ2.merchantId) == null) {
                str7 = "";
            }
            arrayList.add(new Pair("merchant_id", str7));
            VerifyDetail verifyDetailLJIIIIZZ3 = c1713570uh1.LJIIIIZZ();
            if (verifyDetailLJIIIIZZ3 != null && (str8 = verifyDetailLJIIIIZZ3.merchantUserId) != null) {
                str = str8;
            }
            arrayList.add(new Pair("merchant_user_id", str));
            Object obj = ((Map) c1713570uh1.LJFF.getValue()).get("tried_times");
            Integer num = obj instanceof Integer ? (Integer) obj : null;
            arrayList.add(new Pair("tried_times", String.valueOf(num != null ? num.intValue() : 0)));
        } else {
            C1713520ugw c1713520ugw = this.LIZJ;
            if (c1713520ugw != null) {
                JSONObject jSONObject = new JSONObject(c1713520ugw.LIZ.LIZJ);
                arrayList.add(new Pair("verify_id", jSONObject.optString("verify_id")));
                arrayList.add(new Pair("verify_type", jSONObject.optString("verify_type")));
                String strOptString = jSONObject.optString("verify_detail");
                if (!a0.LJJJIL(strOptString)) {
                    arrayList.add(new Pair("biz_type", new JSONObject(strOptString).optString("biz_type")));
                }
                n nVar = c1713520ugw.LIZ.LIZ.LIZ;
                arrayList.add(new Pair("busi_type", nVar != null ? C1714060uho.LIZ(nVar.LJJIIZ("busi_type")) : ""));
                arrayList.add(new Pair("page_style", c1713520ugw.LIZIZ.LIZ != EnumC1714450uiR.FULL_PAGE ? "half" : "full"));
                String str11 = c1713520ugw.LIZJ.LIZ;
                arrayList.add(new Pair("session_id", str11 != null ? str11 : ""));
            }
        }
        if (C1714240ui6.LIZ()) {
            try {
                LIZIZ(arrayList);
                C189200o6.m2constructorimpl(Unit.LIZ);
                return arrayList;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
            }
        }
        return arrayList;
    }

    public static String LJ() {
        SettingsManager.LIZLLL().getClass();
        return SettingsManager.LIZ("pipo_verification_jailbroken_or_rooted_enabled", false) ? String.valueOf(C1717770unn.LIZJ().LJIILLIIL()) : "unknown";
    }

    public final void LJIIJ() {
        this.LIZLLL = System.currentTimeMillis();
        C1708030uY5.LIZ.LIZ(this.LJFF).LIZLLL(null, AFwS268S0000000_26.get$arr$(780));
    }

    public C1713750uhJ(int i) {
        this.LIZ = i;
        this.LJ = new AtomicBoolean(false);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(System.identityHashCode(this));
        sbLIZ.append('_');
        sbLIZ.append(i);
        this.LJFF = new C1708050uY7("BNPL", "handle_verify_center_init", "verify_center_init_trace_id", C2188811AlT.LIZIZ(sbLIZ));
        this.LJII = new AtomicBoolean(false);
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0110  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZIZ(java.util.List<kotlin.Pair<java.lang.String, java.lang.String>> r15) {
        /*
            Method dump skipped, instruction units count: 352
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1713750uhJ.LIZIZ(java.util.List):void");
    }

    public final void LJIIIZ(String str) {
        C1707050uWV.LIZ(new AwS175S1100000_26(this, str, 12));
    }

    public static void LJIIIIZZ(C1713750uhJ c1713750uhJ, String str, int i, int i2) {
        if ((i2 & 2) != 0) {
            i = 1;
        }
        C1707050uWV.LIZ(new C1711290udL(c1713750uhJ, str, i, null));
    }

    public static void LJII(C1713750uhJ c1713750uhJ, boolean z, String str, boolean z2, int i) {
        String str2 = str;
        if ((i & 4) != 0) {
            str2 = null;
        }
        C1707050uWV.LIZ(new C1713760uhK(c1713750uhJ, z, null, str2, z2));
    }

    public static void LJI(C1713750uhJ c1713750uhJ, String str, String str2, String str3, String str4, Long l, int i) {
        String str5 = str4;
        String str6 = str3;
        String str7 = str2;
        Long l2 = null;
        if ((i & 2) != 0) {
            str7 = null;
        }
        if ((i & 4) != 0) {
            str6 = null;
        }
        if ((i & 8) != 0) {
            str5 = null;
        }
        if ((i & 16) == 0) {
            l2 = l;
        }
        C1707050uWV.LIZ(new C1713770uhL(c1713750uhJ, str, false, str7, str6, str5, l2));
    }

    public static void LJIIJJI(C1713750uhJ c1713750uhJ, String str, String str2, String str3, String str4, String str5, boolean z) {
        if (C1714240ui6.LIZ()) {
            C1707050uWV.LIZ(new C1713810uhP(c1713750uhJ, str, str2, str3, str4, str5, z, null, null));
        }
    }

    public final void LJIIL(long j, String str, String str2, String str3, String str4, String str5, boolean z) {
        if (!C1714240ui6.LIZLLL()) {
            return;
        }
        C1707050uWV.LIZ(new C1713800uhO(this, str, j, z, str2, str3, str4, str5));
    }
}
