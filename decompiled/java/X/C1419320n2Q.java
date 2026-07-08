package X;

import com.bytedance.ies.smartmovie.jni.NLEModelRequestCallback;
import com.bytedance.ies.smartmovie.jni.NLEModelRequestParams;
import com.bytedance.ies.smartmovie.jni.SmartMovieErrorCode;
import com.bytedance.ies.smartmovie.jni.SmartMovieJniJNI;
import com.bytedance.ies.smartmovie.jni.UnorderedMapStrStr;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0n2Q, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1419320n2Q extends C09AY implements InterfaceC1631630sYr<Integer, Integer, String, String, Unit> {
    public final /* synthetic */ NLEModelRequestCallback LL;
    public final /* synthetic */ C1419310n2P LLILLJJLI;
    public final /* synthetic */ NLEModelRequestParams LLILLL;
    public final /* synthetic */ boolean LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1419320n2Q(NLEModelRequestCallback nLEModelRequestCallback, NLEModelRequestParams nLEModelRequestParams, C1419310n2P c1419310n2P, boolean z) {
        super(4);
        this.LL = nLEModelRequestCallback;
        this.LLILLJJLI = c1419310n2P;
        this.LLILLL = nLEModelRequestParams;
        this.LLILZ = z;
    }

    @Override // X.InterfaceC1631630sYr
    public final Unit invoke(Integer num, Integer num2, String str, String str2) {
        String strLIZJ;
        String strNLEModelRequestParams_getRecKey;
        String str3;
        int iIntValue = num.intValue();
        int iIntValue2 = num2.intValue();
        String str4 = str;
        String str5 = str2;
        C1398350mUb c1398350mUb = C1398350mUb.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(" errorMsg=");
        sbLIZ.append(str4);
        C201955140j.LIZLLL(c1398350mUb, "AutoCutNLEModelDelegate", C2188811AlT.LIZIZ(sbLIZ));
        UnorderedMapStrStr unorderedMapStrStr = new UnorderedMapStrStr();
        if (C306440Bzm.LIZ() && iIntValue == 5000 && (iIntValue2 == -199 || iIntValue2 == -106)) {
            unorderedMapStrStr.put("weak_net", "weak_net");
        }
        unorderedMapStrStr.put("sub_error_code", String.valueOf(iIntValue2));
        NLEModelRequestCallback nLEModelRequestCallback = this.LL;
        if (nLEModelRequestCallback != null) {
            nLEModelRequestCallback.onFailure(SmartMovieErrorCode.CONFIG_REQUEST_FAILURE.swigValue(), str4, unorderedMapStrStr);
        }
        InterfaceC1419480n2g interfaceC1419480n2g = this.LLILLJJLI.LIZIZ;
        if (interfaceC1419480n2g != null) {
            NLEModelRequestParams nLEModelRequestParams = this.LLILLL;
            String str6 = null;
            if (nLEModelRequestParams != null) {
                strLIZJ = nLEModelRequestParams.LIZJ();
            } else {
                strLIZJ = null;
            }
            NLEModelRequestParams nLEModelRequestParams2 = this.LLILLL;
            if (nLEModelRequestParams2 != null) {
                strNLEModelRequestParams_getRecKey = SmartMovieJniJNI.NLEModelRequestParams_getRecKey(nLEModelRequestParams2.LIZ, nLEModelRequestParams2);
            } else {
                strNLEModelRequestParams_getRecKey = null;
            }
            NLEModelRequestParams nLEModelRequestParams3 = this.LLILLL;
            if (nLEModelRequestParams3 != null) {
                str3 = (String) nLEModelRequestParams3.LIZ().get("autocut_template_type");
            } else {
                str3 = null;
            }
            NLEModelRequestParams nLEModelRequestParams4 = this.LLILLL;
            if (nLEModelRequestParams4 != null) {
                str6 = (String) nLEModelRequestParams4.LIZ().get("source");
            }
            interfaceC1419480n2g.LIZLLL(false, iIntValue, iIntValue2, str4, strLIZJ, strNLEModelRequestParams_getRecKey, str5, null, null, null, str3, str6, this.LLILZ);
        }
        return Unit.LIZ;
    }
}
