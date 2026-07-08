package X;

import android.content.Context;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.tiktok.tpsc.model.PrivacySettingsAgreementRecord;

/* JADX INFO: renamed from: X.10BV, reason: invalid class name */
/* JADX INFO: loaded from: classes29.dex */
public final class C10BV {
    public static final /* synthetic */ int LIZ = 0;

    public static String LIZ(Context context, VideoPublishEditModel videoPublishEditModel) {
        if (videoPublishEditModel != null) {
            C548590LfN.LIZ.getClass();
            if (C548590LfN.LIZLLL().LIZ(videoPublishEditModel.creativeModel)) {
                C547860LeC.LIZ.getClass();
                String strLIZLLL = C547860LeC.LJI().LIZLLL(C0LOK.LIZ, 2131826083, null);
                if (strLIZLLL == null) {
                    return context.getString(2131844946);
                }
                return strLIZLLL;
            }
        }
        PrivacySettingsAgreementRecord privacySettingsAgreementRecordLJJIJ = ComplianceServiceProvider.LJIJJ().LJJIJ("video_visibility_select");
        if (privacySettingsAgreementRecordLJJIJ != null && 1 == privacySettingsAgreementRecordLJJIJ.status) {
            return context.getString(2131845582);
        }
        return context.getString(2131844946);
    }
}
