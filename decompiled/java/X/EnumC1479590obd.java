package X;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0obd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public enum EnumC1479590obd implements InterfaceC1479910oc9 {
    Normal("prepare_time", "first_frame_time", true),
    Local("prepare_time", "first_frame_time", true),
    Story("story_prepare_time", "story_first_frame_time", false);

    public static final Map<String, String> LLIZLLLIL;
    public final boolean LL;
    public final String LLILLJJLI;
    public final String LLILLL;
    public boolean LLILZ = true;
    public boolean LLILZIL = C1474810oTv.LLIIL();
    public String LLILZLL;
    public String LLIZ;

    static {
        HashMap map = new HashMap();
        LLIZLLLIL = map;
        map.put("prepare_time", "video_bitrate_prepare_time");
        map.put("story_prepare_time", "story_video_bitrate_prepare_time");
        map.put("first_frame_time", "aweme_video_bitrate_first_frame_log");
        map.put("story_first_frame_time", "story_video_bitrate_first_frame_time");
    }

    @Override // X.InterfaceC1479910oc9
    public String getFirstFrameKey() {
        if (!C607330Nrv.LIZ.LIZIZ().videoBitRateEnabled()) {
            return this.LLILLL;
        }
        return (String) ((HashMap) LLIZLLLIL).get(this.LLILLL);
    }

    @Override // X.InterfaceC1479910oc9
    public String getPrepareKey() {
        if (!C607330Nrv.LIZ.LIZIZ().videoBitRateEnabled()) {
            return this.LLILLJJLI;
        }
        return (String) ((HashMap) LLIZLLLIL).get(this.LLILLJJLI);
    }

    public String getSubTag() {
        return this.LLIZ;
    }

    public String getTag() {
        return this.LLILZLL;
    }

    @Override // X.InterfaceC1479910oc9
    public boolean isLoop() {
        return this.LL;
    }

    @Override // X.InterfaceC1479910oc9
    public boolean isPlayLoop() {
        return this.LLILZ;
    }

    public boolean isUseSuperResolution() {
        return this.LLILZIL;
    }

    public static EnumC1479590obd valueOf(String str) {
        return (EnumC1479590obd) C08FF.LIZ(EnumC1479590obd.class, str);
    }

    public void setLoop(boolean z) {
        this.LLILZ = z;
    }

    public void setSubTag(String str) {
        this.LLIZ = str;
    }

    public void setTag(String str) {
        this.LLILZLL = str;
    }

    public void setUseSuperResolution(boolean z) {
        this.LLILZIL = z;
    }

    EnumC1479590obd(String str, String str2, boolean z) {
        this.LL = z;
        this.LLILLJJLI = str;
        this.LLILLL = str2;
    }
}
