package com.bytedance.android.live.broadcast.model;

import X.C09CT;
import X.C2188811AlT;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class PushStreamInfo {

    @C09CT("default_quality")
    public Quality defaultQuality;

    @C09CT("multi_default_qualities")
    public Map<String, Quality> multiDefaultQualities;

    @C09CT("multi_qualities")
    public Map<String, QualityList> multiQualities;

    @C09CT("qualities")
    public List<Quality> qualityList;

    /* JADX INFO: loaded from: classes13.dex */
    public static class Quality {

        @C09CT("default_bitrate")
        public long default_bitrate;

        @C09CT("fps")
        public long fps;

        @C09CT("height")
        public long height;

        @C09CT("max_bitrate")
        public long max_bitrate;

        @C09CT("min_bitrate")
        public long min_bitrate;

        @C09CT("width")
        public long width;

        @C09CT("name")
        public String name = "";

        @C09CT("desc")
        public String desc = "";

        @C09CT("sdk_key")
        public String sdkKey = "";

        public final String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Quality(name=");
            sbLIZ.append(this.name);
            sbLIZ.append(", sdkKey=");
            sbLIZ.append(this.sdkKey);
            sbLIZ.append(", defaultBitrate=");
            sbLIZ.append(this.default_bitrate);
            sbLIZ.append(")");
            return C2188811AlT.LIZIZ(sbLIZ);
        }
    }

    public static final class QualityList {

        @C09CT("qualities")
        public List<Quality> qualities;

        public final String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("QualityList(qualities=");
            sbLIZ.append(this.qualities);
            sbLIZ.append(")");
            return C2188811AlT.LIZIZ(sbLIZ);
        }
    }
}
