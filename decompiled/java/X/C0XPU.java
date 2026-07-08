package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.shortvideo.edit.audioedit.common.vc.VCAudioResponse;
import com.ss.android.ugc.aweme.shortvideo.edit.audioedit.common.vc.VoiceConversionApi;
import com.ss.android.ugc.gamora.editor.audioservice.common.net.SamiRequestInterceptor;
import java.util.ArrayList;
import org.json.JSONArray;

/* JADX INFO: renamed from: X.0XPU, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0XPU {
    public static VCAudioResponse LIZ(JSONArray jSONArray, JSONArray jSONArray2, C0XPV c0xpv) {
        String str = "NetworkNotAvailabeException";
        InterfaceC1445350niP networkService = C0CHQ.LIZ().getNetworkService();
        String apiHost = C0CHQ.LIZ().getNetworkService().getApiHost();
        ArrayList arrayList = new ArrayList();
        arrayList.add(new SamiRequestInterceptor(c0xpv.LIZ));
        try {
            return ((VoiceConversionApi.Api) networkService.createRetrofitWithInterceptors(apiHost, true, VoiceConversionApi.Api.class, arrayList)).downloadVoiceConversion2(jSONArray, jSONArray2, 1, null).execute().LIZIZ;
        } catch (C1494450ozb e) {
            TryCatchGuardChecker.doCheck(e);
            VCAudioResponse vCAudioResponse = new VCAudioResponse();
            vCAudioResponse.status_code = e.getCronetInternalErrorCode();
            String message = e.getMessage();
            if (message != null) {
                str = message;
            }
            vCAudioResponse.statusMsg = str;
            return vCAudioResponse;
        } catch (C1494690ozz e2) {
            TryCatchGuardChecker.doCheck(e2);
            VCAudioResponse vCAudioResponse2 = new VCAudioResponse();
            vCAudioResponse2.status_code = e2.getCronetInternalErrorCode();
            String message2 = e2.getMessage();
            if (message2 != null) {
                str = message2;
            }
            vCAudioResponse2.statusMsg = str;
            return vCAudioResponse2;
        }
    }
}
