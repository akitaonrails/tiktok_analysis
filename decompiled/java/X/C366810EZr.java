package X;

import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0EZr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C366810EZr {
    public static final boolean LIZ(VideoPublishEditModel videoPublishEditModel) {
        Integer num;
        if (!videoPublishEditModel.hadRecordWithVolume() && videoPublishEditModel.getVoiceVolume() == 0.0f && videoPublishEditModel.hasMusic() && videoPublishEditModel.getMusicVolume() > 0.0f && !C277710AuX.LIZ()) {
            String musicId = videoPublishEditModel.getMusicId();
            if (musicId != null && musicId.length() != 0) {
                Map<String, Integer> map = C366800EZq.LIZJ;
                if (map.containsKey(videoPublishEditModel.getMusicId())) {
                    LinkedHashMap linkedHashMap = (LinkedHashMap) map;
                    Integer num2 = (Integer) linkedHashMap.get(videoPublishEditModel.getMusicId());
                    if ((num2 == null || num2.intValue() != 1) && ((num = (Integer) linkedHashMap.get(videoPublishEditModel.getMusicId())) == null || num.intValue() != 2)) {
                        return true;
                    }
                } else {
                    return true;
                }
            } else {
                return true;
            }
        }
        return false;
    }
}
