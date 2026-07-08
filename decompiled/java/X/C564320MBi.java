package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.record.CameraLayoutModel;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.model.SimpleEffect;
import com.ss.android.ugc.aweme.shortvideo.ui.TimeSpeedModelExtension;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0MBi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C564320MBi {
    public static final boolean LIZ(String str) {
        Object c098200Yq;
        if (str == null || str.length() == 0) {
            return false;
        }
        try {
            c098200Yq = Boolean.valueOf(Intrinsics.LJFF(new JSONObject(str).optString("AIGCSubType"), "v2v"));
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Boolean bool = Boolean.FALSE;
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = bool;
        }
        return ((Boolean) c098200Yq).booleanValue();
    }

    public static final boolean LIZIZ(VideoPublishEditModel videoPublishEditModel) {
        String sdkExtra;
        ArrayList<TimeSpeedModelExtension> arrayList;
        String sdkExtra2;
        String sdkExtra3;
        if (!C1444940nhk.LJII(videoPublishEditModel.getCanvasVideoData()) && !C1428470nHB.LJJIJIL(videoPublishEditModel)) {
            return false;
        }
        CreativeModel creativeModel = videoPublishEditModel.creativeModel;
        if (creativeModel.aigcOfflineModel.isOfflineAIGCEffectGenerated) {
            return false;
        }
        SimpleEffect simpleEffect = creativeModel.recordEffectModel.effectInfo;
        if (simpleEffect != null) {
            sdkExtra = simpleEffect.getSdkExtra();
        } else {
            sdkExtra = null;
        }
        if (LIZ(sdkExtra)) {
            return true;
        }
        ArrayList<TimeSpeedModelExtension> finalVideoList = videoPublishEditModel.getFinalVideoList();
        if (finalVideoList != null) {
            Iterator<TimeSpeedModelExtension> it2 = finalVideoList.iterator();
            while (it2.hasNext()) {
                SimpleEffect effectInfo = it2.next().getEffectInfo();
                if (effectInfo != null) {
                    sdkExtra3 = effectInfo.getSdkExtra();
                } else {
                    sdkExtra3 = null;
                }
                if (LIZ(sdkExtra3)) {
                    return true;
                }
            }
        }
        CameraLayoutModel cameraLayoutModel = videoPublishEditModel.creativeModel.cameraLayoutModel;
        if (cameraLayoutModel != null && (arrayList = cameraLayoutModel.captureSegments) != null) {
            Iterator<TimeSpeedModelExtension> it3 = arrayList.iterator();
            while (it3.hasNext()) {
                SimpleEffect effectInfo2 = it3.next().getEffectInfo();
                if (effectInfo2 != null) {
                    sdkExtra2 = effectInfo2.getSdkExtra();
                } else {
                    sdkExtra2 = null;
                }
                if (LIZ(sdkExtra2)) {
                    return true;
                }
            }
        }
        return false;
    }
}
