package X;

import com.bytedance.speech.speechengine.SpeechEngine;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.ttnet.TTNetInit;
import com.ss.android.ugc.aweme.pgc.hybrid.xbridge.impl.speech.SpeechErrorResponse;
import com.ss.android.ugc.aweme.pgc.hybrid.xbridge.impl.speech.SpeechResult;
import com.ss.android.ugc.aweme.pgc.hybrid.xbridge.impl.speech.SpeechResultResponse;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.text.Charsets;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0wyb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1801350wyb implements SpeechEngine.SpeechListener {
    public SpeechEngine LIZ;
    public C1801390wyf LIZIZ;

    public C1801350wyb() {
        TTNetInit.forceInitCronetKernel();
    }

    public final SpeechResultResponse LIZ(byte[] bArr) {
        SpeechResultResponse speechResultResponse;
        if (bArr == null) {
            return null;
        }
        try {
            speechResultResponse = (SpeechResultResponse) C7740030o.LIZ().getGson().LJII(new String(bArr, Charsets.UTF_8), SpeechResultResponse.class);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C1801390wyf c1801390wyf = this.LIZIZ;
            if (c1801390wyf != null) {
                c1801390wyf.LIZJ(-1, e);
            }
        }
        if (!(!speechResultResponse.result.isEmpty())) {
            return null;
        }
        return speechResultResponse;
    }

    @Override // com.bytedance.speech.speechengine.SpeechEngine.SpeechListener
    public final void onSpeechMessage(int i, byte[] bArr, int i2) throws JSONException {
        SpeechErrorResponse speechErrorResponse;
        String str;
        Integer num;
        String string;
        List<SpeechResult> list;
        String string2;
        List<SpeechResult> list2;
        SpeechResult speechResult;
        String str2;
        C1801390wyf c1801390wyf;
        C1537480q70 c1537480q70;
        Float fLJIIIIZZ;
        String str3 = "";
        if (i != 1003) {
            if (i != 1201) {
                if (i != 1204) {
                    if (i == 1600 && bArr != null && (fLJIIIIZZ = C2327809Ae.LJIIIIZZ(new String(bArr, Charsets.UTF_8))) != null) {
                        float fFloatValue = fLJIIIIZZ.floatValue();
                        C1801390wyf c1801390wyf2 = this.LIZIZ;
                        if (c1801390wyf2 != null) {
                            ((Function1) c1801390wyf2.LLILZIL.getValue()).invoke(Float.valueOf(fFloatValue));
                            return;
                        }
                        return;
                    }
                    return;
                }
                SpeechResultResponse speechResultResponseLIZ = LIZ(bArr);
                if (speechResultResponseLIZ != null && (list2 = speechResultResponseLIZ.result) != null && (speechResult = (SpeechResult) C13LP.LJJJLL(list2)) != null && (str2 = speechResult.text) != null && (c1801390wyf = this.LIZIZ) != null && (c1537480q70 = (C1537480q70) c1801390wyf.LLILZ.getValue()) != null) {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("type", 1204);
                    jSONObject.put("data", str2);
                    c1537480q70.LJJIIJZLJL(jSONObject, "studio.asrStateChange");
                }
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("finish: ");
                if (speechResultResponseLIZ != null && (string2 = speechResultResponseLIZ.toString()) != null) {
                    str3 = string2;
                }
                sbLIZ.append(str3);
                C2188811AlT.LIZIZ(sbLIZ);
                return;
            }
            SpeechResultResponse speechResultResponseLIZ2 = LIZ(bArr);
            if (speechResultResponseLIZ2 != null && (list = speechResultResponseLIZ2.result) != null) {
                C13LP.LJJJLL(list);
            }
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("speaking: ");
            if (speechResultResponseLIZ2 != null && (string = speechResultResponseLIZ2.toString()) != null) {
                str3 = string;
            }
            sbLIZ2.append(str3);
            C2188811AlT.LIZIZ(sbLIZ2);
            return;
        }
        int iIntValue = -1;
        if (bArr != null) {
            try {
                speechErrorResponse = (SpeechErrorResponse) C7740030o.LIZ().getGson().LJII(new String(bArr, Charsets.UTF_8), SpeechErrorResponse.class);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                C1801390wyf c1801390wyf3 = this.LIZIZ;
                if (c1801390wyf3 != null) {
                    c1801390wyf3.LIZJ(-1, e);
                }
                speechErrorResponse = null;
            }
        } else {
            speechErrorResponse = null;
        }
        C1801390wyf c1801390wyf4 = this.LIZIZ;
        if (c1801390wyf4 != null) {
            if (speechErrorResponse != null && (num = speechErrorResponse.errorCode) != null) {
                iIntValue = num.intValue();
            }
            if (speechErrorResponse != null && (str = speechErrorResponse.errorMsg) != null) {
                str3 = str;
            }
            c1801390wyf4.LIZJ(iIntValue, new Exception(str3));
        }
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("error: ");
        if (bArr == null) {
            return;
        }
        sbLIZ3.append(new String(bArr, Charsets.UTF_8));
        C2188811AlT.LIZIZ(sbLIZ3);
    }
}
