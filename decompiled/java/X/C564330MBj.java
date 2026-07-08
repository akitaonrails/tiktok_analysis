package X;

import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.NowsShootModel;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.model.SimpleEffect;
import com.ss.android.ugc.aweme.shortvideo.ui.TimeSpeedModelExtension;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.functions.Function1;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0MBj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C564330MBj extends C09AY implements Function1<VideoPublishEditModel, Boolean> {
    public C564330MBj() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(VideoPublishEditModel videoPublishEditModel) {
        String extra;
        SimpleEffect simpleEffect;
        String extra2;
        String extra3;
        VideoPublishEditModel videoPublishEditModel2 = videoPublishEditModel;
        ArrayList<TimeSpeedModelExtension> finalVideoList = videoPublishEditModel2.getFinalVideoList();
        if (finalVideoList != null) {
            Iterator<TimeSpeedModelExtension> it2 = finalVideoList.iterator();
            while (it2.hasNext()) {
                SimpleEffect effectInfo = it2.next().getEffectInfo();
                if (effectInfo != null && (extra3 = effectInfo.getExtra()) != null) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("AIGCManager -> recordEffectHasAIGC -> extra = ");
                    sbLIZ.append(extra3);
                    C201955140j.LIZ(C2188811AlT.LIZIZ(sbLIZ));
                    if (extra3.length() > 0 && new JSONObject(extra3).optBoolean("is_aigc_content")) {
                        return Boolean.TRUE;
                    }
                }
            }
        }
        CreativeModel creativeModel = videoPublishEditModel2.creativeModel;
        if (!creativeModel.aigcOfflineModel.isOfflineAIGCEffectGenerated && !creativeModel.aigcMetadataModel.isAigcEffect) {
            if (creativeModel.nowsShootModel != null || C1428470nHB.LLIFFJFJJ(videoPublishEditModel2)) {
                NowsShootModel nowsShootModel = videoPublishEditModel2.creativeModel.nowsShootModel;
                if (((nowsShootModel != null && (nowsShootModel.type == 0 || nowsShootModel.type == 3)) || C1428470nHB.LLIFFJFJJ(videoPublishEditModel2)) && (simpleEffect = videoPublishEditModel2.creativeModel.recordEffectModel.effectInfo) != null && (extra2 = simpleEffect.getExtra()) != null) {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("AIGCManager -> effecInfo.extra = ");
                    sbLIZ2.append(extra2);
                    C201955140j.LIZ(C2188811AlT.LIZIZ(sbLIZ2));
                    if (extra2.length() > 0 && new JSONObject(extra2).optBoolean("is_aigc_content")) {
                        videoPublishEditModel2.creativeModel.aigcExtraModel.aigcEdited = true;
                        return Boolean.TRUE;
                    }
                }
                ArrayList<TimeSpeedModelExtension> finalVideoList2 = videoPublishEditModel2.getFinalVideoList();
                if (finalVideoList2 != null) {
                    Iterator<TimeSpeedModelExtension> it3 = finalVideoList2.iterator();
                    while (it3.hasNext()) {
                        SimpleEffect effectInfo2 = it3.next().getEffectInfo();
                        if (effectInfo2 != null && (extra = effectInfo2.getExtra()) != null && extra.length() > 0 && new JSONObject(extra).optBoolean("is_aigc_content")) {
                            return Boolean.TRUE;
                        }
                    }
                }
            }
            return Boolean.FALSE;
        }
        return Boolean.TRUE;
    }
}
