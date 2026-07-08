package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.creative.model.ContentCheckInfo;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.PrivacySettingModel;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import kotlin.jvm.internal.AFwS201S0000000_14;

/* JADX INFO: renamed from: X.0XiV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C856290XiV {
    public static final C01GW LIZ = C452501pT.LIZIZ(AFwS201S0000000_14.get$arr$(434));

    public static boolean LIZ(String str) {
        Keva keva = (Keva) LIZ.getValue();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append("_content_check_mvp_status");
        boolean z = keva.getBoolean(C2188811AlT.LIZIZ(sbLIZ), false);
        C385220F8m c385220F8m = C385220F8m.LIZIZ;
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(" getManualContentCheckStatus userId:");
        sbLIZ2.append(str);
        sbLIZ2.append(" ,result :");
        sbLIZ2.append(z);
        C201955140j.LIZJ(c385220F8m, C2188811AlT.LIZIZ(sbLIZ2));
        return z;
    }

    public static void LIZIZ(VideoPublishEditModel videoPublishEditModel, Boolean bool, String str) {
        CreativeModel creativeModel;
        PrivacySettingModel privacySettingModel;
        ContentCheckInfo contentCheckInfo;
        Integer numValueOf;
        if ((videoPublishEditModel == null || (creativeModel = videoPublishEditModel.creativeModel) == null || (privacySettingModel = creativeModel.privacySettingModel) == null || (contentCheckInfo = privacySettingModel.contentCheckInfo) == null || (numValueOf = Integer.valueOf(contentCheckInfo.usageCountToday)) == null || numValueOf.intValue() < 3) && bool != null) {
            Keva keva = (Keva) LIZ.getValue();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(str);
            sbLIZ.append("_content_check_mvp_status");
            keva.storeBoolean(C2188811AlT.LIZIZ(sbLIZ), bool.booleanValue());
            C385220F8m c385220F8m = C385220F8m.LIZIZ;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("storeManualContentCheckStatus :");
            sbLIZ2.append(bool);
            C201955140j.LIZJ(c385220F8m, C2188811AlT.LIZIZ(sbLIZ2));
        }
    }
}
