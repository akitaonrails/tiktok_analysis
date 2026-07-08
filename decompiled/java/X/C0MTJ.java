package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.inbox.widget.multi.horizontal.SkylightData;
import com.ss.android.ugc.aweme.inbox.widget.multi.horizontal.TemplateData;
import com.ss.android.ugc.aweme.story.celebration.StoryCelebrationInboxParam;

/* JADX INFO: renamed from: X.0MTJ, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0MTJ {
    public static final /* synthetic */ int LIZ = 0;

    public static StoryCelebrationInboxParam LIZ(SkylightData skylightData) {
        TemplateData templateData;
        String str;
        if (skylightData != null && (templateData = skylightData.templateData) != null && (str = templateData.extraData) != null) {
            try {
                return (StoryCelebrationInboxParam) C051M.LIZIZ(StoryCelebrationInboxParam.class, str);
            } catch (C0XIO e) {
                TryCatchGuardChecker.doCheck(e);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("json parse error! ");
                String message = e.getMessage();
                if (message == null) {
                    message = String.valueOf(e.getErrorCode());
                }
                sbLIZ.append(message);
                C2188811AlT.LIZIZ(sbLIZ);
                return null;
            }
        }
        return null;
    }
}
