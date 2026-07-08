package X;

import android.content.Context;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.compliance.api.services.policy.ICompliancePolicyService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.pns.consent.collector.api.CollectConsentParam;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.AwS572S0100000_28;
import kotlin.jvm.internal.AwS607S0100000_28;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0zu7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1913890zu7 implements InterfaceC1914160zuY {
    public final Context LIZ;
    public final String LIZIZ;
    public final CollectConsentParam LIZJ;
    public final Set<String> LIZLLL;
    public final String LJ;
    public String LJFF;
    public String LJI;
    public final C01GW LJII;
    public final String LJIIIIZZ;
    public String LJIIIZ;
    public final String LJIIJ;
    public String LJIIJJI;
    public final String LJIIL;
    public final String LJIILIIL;
    public final String LJIILJJIL;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:139:0x06c5  */
    /* JADX WARN: Type inference failed for: r0v4, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r28v2, types: [java.util.List] */
    @Override // X.InterfaceC1914160zuY
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C15O7<com.ss.android.ugc.aweme.pns.universalpopup.core.model.UniversalPopupResponse> LIZIZ() throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 1755
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1913890zu7.LIZIZ():X.15O7");
    }

    public final Map<String, String> LIZJ() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("key", this.LIZJ.consentKey);
        jSONObject.put(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, EnumC1876780ywG.APPROVE.getI());
        jSONObject.put("flow", this.LIZJ.flow);
        jSONObject.put("scenario", this.LIZJ.scenario);
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("consent_data", jSONObject);
        return C2097908Jt.LIZJ(new Pair("agree_button", C786410Ut5.J3(jSONObject2)));
    }

    public static String LIZLLL(String str) {
        String strLIZJ;
        ICompliancePolicyService iCompliancePolicyServiceLJIIIIZZ = ComplianceServiceProvider.LJIIIIZZ();
        if (iCompliancePolicyServiceLJIIIIZZ != null) {
            strLIZJ = iCompliancePolicyServiceLJIIIIZZ.LIZJ(new C1913610ztf(EnumC1913590ztd.CONSENT_BOX_ROW.getValue(), str, false, false, false, null, false, 124));
        } else {
            strLIZJ = null;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("aweme://webview?url=");
        sbLIZ.append(strLIZJ);
        sbLIZ.append("&use_spark=1");
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static void LJ(String str) {
        ICompliancePolicyService iCompliancePolicyServiceLJIIIIZZ = ComplianceServiceProvider.LJIIIIZZ();
        if (iCompliancePolicyServiceLJIIIIZZ != null) {
            EnumC1913590ztd.CONSENT_BOX_ROW.getValue();
            iCompliancePolicyServiceLJIIIIZZ.LIZLLL();
        }
    }

    @Override // X.InterfaceC1914160zuY
    public final C15O7<Unit> LIZ(String str, Map<String, String> map) {
        C100C.LIZ.LIZIZ().LIZ(new AwS607S0100000_28(this, 170));
        return C15O7.LJIIJ(Unit.LIZ);
    }

    public C1913890zu7(Context context, String str, CollectConsentParam collectConsentParam) {
        String storeRegionUpperCase;
        String str2;
        String str3;
        this.LIZ = context;
        this.LIZIZ = str;
        this.LIZJ = collectConsentParam;
        HashSet hashSet = new HashSet(C1697810uHb.LJIILJJIL("US", "AS", "GU", "MP", "PR", "VI", "UM"));
        this.LIZLLL = hashSet;
        IAccountService iAccountService = (IAccountService) PluggableExtentionKt.pluggableSpi$default(IAccountService.class, false, false, false, 14, null);
        if (iAccountService != null) {
            storeRegionUpperCase = iAccountService.getStoreRegionUpperCase();
        } else {
            storeRegionUpperCase = null;
        }
        this.LJ = storeRegionUpperCase;
        if (Intrinsics.LJFF(str, "EU")) {
            str2 = "eu_dnu_consent_box";
        } else if (hashSet.contains(str)) {
            str2 = "us_dnu_consent_box";
        } else if (Intrinsics.LJFF(str, "KR")) {
            str2 = "kr_dnu_consent_box";
        } else {
            str2 = "row_dnu_consent_box";
        }
        this.LJFF = str2;
        if (Intrinsics.LJFF(str, "KR")) {
            str3 = "v1803";
        } else {
            str3 = "v1";
        }
        this.LJI = str3;
        this.LJII = C452501pT.LIZIZ(new AwS572S0100000_28(this, 660));
        this.LJIIIIZZ = context.getString(2131829455);
        this.LJIIIZ = context.getString(2131829454);
        this.LJIIJ = context.getString(2131829453);
        this.LJIIJJI = context.getString(2131829456);
        this.LJIIL = context.getString(2131821683);
        this.LJIILIIL = context.getString(2131821684);
        this.LJIILJJIL = context.getString(2131829448);
    }
}
