package X;

import android.app.Activity;
import com.ss.android.ugc.aweme.biz.bnpl.network.model.BaseResponse;
import com.ss.android.ugc.aweme.biz.wallet.network.CommonBizContentRequestWrapper;
import com.ss.android.ugc.aweme.biz.wallet.network.WalletApi;
import com.ss.android.ugc.aweme.biz.wallet.network.model.WalletFlowDecision;
import com.ss.android.ugc.aweme.foundation.network.PipoAccountApi;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.pipo.IPipoService;
import defpackage.PipoPaRetrofitRefactorConfigSettings;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0uoH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1718070uoH implements InterfaceC1717100umi {
    public static final Object LJLZ(String str, String str2, C1718240uoY c1718240uoY) {
        if (Intrinsics.LJFF(PipoPaRetrofitRefactorConfigSettings.LIZ().useNewFlow, true)) {
            C1717580unU c1717580unU = PipoAccountApi.LIZ;
            C1716550ulp.LIZ.getClass();
            String strLIZJ = C1716550ulp.LIZJ(str);
            c1717580unU.getClass();
            PipoAccountApi pipoAccountApiLIZ = C1717580unU.LIZ(strLIZJ);
            String strLJ = C1716550ulp.LJ(str);
            if (strLJ == null) {
                strLJ = "";
            }
            return pipoAccountApiLIZ.createUser(strLJ, str2, c1718240uoY);
        }
        WalletApi.LIZ.getClass();
        return C1717570unT.LIZ(str).createUser(str2, c1718240uoY);
    }

    public static final Object LLJLILLLLZIIL(String str, String str2, C1718250uoZ c1718250uoZ) {
        if (Intrinsics.LJFF(PipoPaRetrofitRefactorConfigSettings.LIZ().useNewFlow, true)) {
            C1717580unU c1717580unU = PipoAccountApi.LIZ;
            C1716550ulp.LIZ.getClass();
            String strLIZJ = C1716550ulp.LIZJ(str);
            c1717580unU.getClass();
            PipoAccountApi pipoAccountApiLIZ = C1717580unU.LIZ(strLIZJ);
            String strLJ = C1716550ulp.LJ(str);
            if (strLJ == null) {
                strLJ = "";
            }
            return pipoAccountApiLIZ.createUserAgreement(strLJ, str2, c1718250uoZ);
        }
        WalletApi.LIZ.getClass();
        return C1717570unT.LIZ(str).createUserAgreement(str2, c1718250uoZ);
    }

    public static final Object LLZLLIL(String str, String str2, C1718220uoW c1718220uoW) {
        if (Intrinsics.LJFF(PipoPaRetrofitRefactorConfigSettings.LIZ().useNewFlow, true)) {
            C1717580unU c1717580unU = PipoAccountApi.LIZ;
            C1716550ulp.LIZ.getClass();
            String strLIZJ = C1716550ulp.LIZJ(str);
            c1717580unU.getClass();
            PipoAccountApi pipoAccountApiLIZ = C1717580unU.LIZ(strLIZJ);
            String strLJ = C1716550ulp.LJ(str);
            if (strLJ == null) {
                strLJ = "";
            }
            return pipoAccountApiLIZ.openCaAccount(strLJ, str2, c1718220uoW);
        }
        WalletApi.LIZ.getClass();
        return C1717570unT.LIZ(str).openCaAccount(str2, c1718220uoW);
    }

    @Override // X.InterfaceC1717100umi
    public final Object m0(String str, String str2, String str3, CommonBizContentRequestWrapper commonBizContentRequestWrapper, InterfaceC1364105Vn<? super C0X52<BaseResponse<WalletFlowDecision>>> interfaceC1364105Vn) {
        if (Intrinsics.LJFF(PipoPaRetrofitRefactorConfigSettings.LIZ().useNewFlow, true)) {
            C1717580unU c1717580unU = PipoAccountApi.LIZ;
            C1716550ulp.LIZ.getClass();
            String strLIZJ = C1716550ulp.LIZJ(str);
            c1717580unU.getClass();
            return C1717580unU.LIZ(strLIZJ).getRegisterFlowDecisionV2(str2, str3, commonBizContentRequestWrapper, interfaceC1364105Vn);
        }
        WalletApi.LIZ.getClass();
        return C1717570unT.LIZ(str).getRegisterFlowDecisionV2(str2, str3, commonBizContentRequestWrapper, interfaceC1364105Vn);
    }

    @Override // X.InterfaceC1717100umi
    public final Object LLILLL(String str, String str2, String str3, String str4, String str5, InterfaceC1364105Vn<? super C0X52<BaseResponse<WalletFlowDecision>>> interfaceC1364105Vn) throws JSONException {
        boolean zLJFF;
        Activity activityLIZIZ;
        Boolean boolValueOf;
        AbstractC1387200mCc abstractC1387200mCcLIZJ = C1717770unn.LIZIZ().LIZJ();
        if (abstractC1387200mCcLIZJ != null && (activityLIZIZ = abstractC1387200mCcLIZJ.LIZIZ()) != null) {
            IPipoService iPipoService = (IPipoService) PluggableExtentionKt.pluggableSpi$default(IPipoService.class, false, false, false, 14, null);
            if (iPipoService != null) {
                boolValueOf = Boolean.valueOf(iPipoService.LJIIJ(activityLIZIZ));
            } else {
                boolValueOf = null;
            }
            zLJFF = Intrinsics.LJFF(boolValueOf, true);
        } else {
            zLJFF = false;
        }
        JSONObject jSONObject = new JSONObject(str5);
        jSONObject.put("support_biometric", zLJFF);
        if (Intrinsics.LJFF(PipoPaRetrofitRefactorConfigSettings.LIZ().useNewFlow, true)) {
            C1717580unU c1717580unU = PipoAccountApi.LIZ;
            C1716550ulp.LIZ.getClass();
            String strLIZJ = C1716550ulp.LIZJ(str);
            c1717580unU.getClass();
            return C1717580unU.LIZ(strLIZJ).getRegisterFlowDecision(str2, str3, str4, C786410Ut5.J3(jSONObject), interfaceC1364105Vn);
        }
        WalletApi.LIZ.getClass();
        return C1717570unT.LIZ(str).getRegisterFlowDecision(str2, str3, str4, C786410Ut5.J3(jSONObject), interfaceC1364105Vn);
    }
}
