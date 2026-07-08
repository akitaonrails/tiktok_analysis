package X;

import com.ss.ttlivestreamer.livestreamv2.videoquality.portrait.VideoQualityPortrait;
import java.util.Map;

/* JADX INFO: renamed from: X.1D53, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
public final class C1D53 {
    public C1D5I LIZ;
    public C1D50 LIZIZ;
    public C2250011D4t LIZJ;
    public Map<String, VideoQualityPortrait> LIZLLL;

    public final float LIZ(String str) {
        Float f;
        Map<String, VideoQualityPortrait> map = this.LIZLLL;
        if (map != null && map.containsKey(str)) {
            VideoQualityPortrait videoQualityPortrait = this.LIZLLL.get(str);
            if (videoQualityPortrait.dataType == EnumC2215461BnM.FLOAT && (f = videoQualityPortrait.LIZ) != null) {
                return f.floatValue();
            }
            return -1.0f;
        }
        return -1.0f;
    }
}
