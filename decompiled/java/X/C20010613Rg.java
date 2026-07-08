package X;

import android.util.Log;
import com.ss.android.ugc.aweme.services.effect.IEffectModelLoggerService;
import com.ss.android.ugc.effectmanager.common.model.ExtendedUrlModel;
import com.ss.android.ugc.effectmanager.common.model.ModelInfo;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.Iterator;

/* JADX INFO: renamed from: X.13Rg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20010613Rg implements IEffectModelLoggerService {
    public static String LIZ(ModelInfo modelInfo) {
        String uri;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("model name:");
        sbLIZ.append(modelInfo.getName());
        sbLIZ.append("; model version:");
        sbLIZ.append(modelInfo.getVersion());
        sbLIZ.append("; model url:");
        sbLIZ.append(modelInfo.getFile_url());
        sbLIZ.append("; model size:");
        sbLIZ.append(modelInfo.getTotalSize());
        sbLIZ.append("k; model md5:");
        ExtendedUrlModel file_url = modelInfo.getFile_url();
        if (file_url != null) {
            uri = file_url.getUri();
        } else {
            uri = null;
        }
        sbLIZ.append(uri);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // com.ss.android.ugc.aweme.services.effect.IEffectModelLoggerService
    public final void startDownloadEffectModelAlog(Effect effect, Object obj, String str) {
        if ((obj instanceof ModelInfo) && effect != null) {
            StringBuilder sb = new StringBuilder();
            if (!C580130Mp9.LIZ(effect.getRequirements())) {
                Iterator<String> it2 = effect.getRequirements().iterator();
                while (it2.hasNext()) {
                    sb.append(it2.next());
                    sb.append(",");
                }
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(LIZ((ModelInfo) obj));
            sbLIZ.append("; effect id:");
            sbLIZ.append(effect.getEffectId());
            sbLIZ.append("; requirements");
            sbLIZ.append((Object) sb);
            sbLIZ.append("; effect_sdk_version:");
            sbLIZ.append(str);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            C13RX c13rx = C13RX.LIZIZ;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("effect_platform::report>>>start_download_effect_model: ");
            sbLIZ2.append(strLIZIZ);
            C201955140j.LIZJ(c13rx, C2188811AlT.LIZIZ(sbLIZ2));
            C0LAB c0lab = new C0LAB();
            c0lab.LJ("extra_info", strLIZIZ);
            C20684815ws.LJIILLIIL("start_download_effect_model", c0lab.LIZ);
        }
    }

    @Override // com.ss.android.ugc.aweme.services.effect.IEffectModelLoggerService
    public final void reportModelListAlog(boolean z, String str, long j, String str2) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("is_success:");
        sbLIZ.append(z);
        sbLIZ.append("; error_msg:");
        sbLIZ.append(str);
        sbLIZ.append("; duration:");
        sbLIZ.append(j);
        sbLIZ.append("ms; effect_sdk_version:");
        sbLIZ.append(str2);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        C13RX c13rx = C13RX.LIZIZ;
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("effect_platform::report>>>fetch_algorithm_model_list: ");
        sbLIZ2.append(strLIZIZ);
        C201955140j.LIZJ(c13rx, C2188811AlT.LIZIZ(sbLIZ2));
    }

    @Override // com.ss.android.ugc.aweme.services.effect.IEffectModelLoggerService
    public final void endDownloadEffectModelAlog(Effect effect, Object obj, long j, int i, Exception exc, String str) {
        if ((obj instanceof ModelInfo) && effect != null) {
            StringBuilder sb = new StringBuilder();
            if (!C580130Mp9.LIZ(effect.getRequirements())) {
                Iterator<String> it2 = effect.getRequirements().iterator();
                while (it2.hasNext()) {
                    sb.append(it2.next());
                    sb.append(",");
                }
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(LIZ((ModelInfo) obj));
            sbLIZ.append("; effect id:");
            sbLIZ.append(effect.getEffectId());
            sbLIZ.append("; requirements");
            sbLIZ.append((Object) sb);
            sbLIZ.append("; duration:");
            sbLIZ.append(j);
            sbLIZ.append("ms; effect_sdk_version:");
            sbLIZ.append(str);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            if (i == 0) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append(strLIZIZ);
                sbLIZ2.append("; errorcode: 0");
                strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
            } else if (exc != null) {
                String stackTraceString = Log.getStackTraceString(exc);
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append(strLIZIZ);
                sbLIZ3.append("; errorcode:");
                sbLIZ3.append(i);
                sbLIZ3.append("; errormsg:");
                sbLIZ3.append(stackTraceString);
                strLIZIZ = C2188811AlT.LIZIZ(sbLIZ3);
            }
            C13RX c13rx = C13RX.LIZIZ;
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append("effect_platform::report>>>end_download_effect_model: ");
            sbLIZ4.append(strLIZIZ);
            C201955140j.LIZJ(c13rx, C2188811AlT.LIZIZ(sbLIZ4));
            C0LAB c0lab = new C0LAB();
            c0lab.LJ("extra_info", strLIZIZ);
            C20684815ws.LJIILLIIL("end_download_effect_model", c0lab.LIZ);
        }
    }
}
