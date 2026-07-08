package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.creative.model.AIGCOfflineModel;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0MSC, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0MSC {
    public static final boolean LIZ(VideoPublishEditModel videoPublishEditModel) {
        C1428640nHS.LIZ.getClass();
        if (!C1428640nHS.LIZJ(videoPublishEditModel)) {
            return false;
        }
        AIGCOfflineModel aIGCOfflineModel = videoPublishEditModel.creativeModel.aigcOfflineModel;
        boolean z = aIGCOfflineModel.isCreatorPreview;
        String str = aIGCOfflineModel.isAsync;
        String str2 = aIGCOfflineModel.isAiProp;
        if (Intrinsics.LJFF(str, "1") && Intrinsics.LJFF(str2, "1") && z && Intrinsics.LJFF("scan", videoPublishEditModel.mShootWay)) {
            SettingsManager.LIZLLL().getClass();
            if (SettingsManager.LIZ("enable_i2v_support_multi_input", true)) {
                return false;
            }
        }
        return true;
    }
}
