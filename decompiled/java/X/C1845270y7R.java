package X;

import android.util.Size;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: X.0y7R, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1845270y7R implements Serializable {
    public static final int $stable = 8;
    public final String businessTag;
    public final transient Size containerSize;
    public final Long duration;
    public final Long expireTime;
    public final String fileHash;
    public final List<String> hashTags;
    public final Integer height;
    public final String msgId;
    public final Map<String, String> params;
    public final boolean trackVideoPlayStatus;
    public final List<String> urlList;
    public final String vid;
    public final String videoModel;
    public final String videoUrl;
    public final Integer width;

    public C1845270y7R() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, 32767, null);
    }

    public int hashCode() {
        String str = this.videoModel;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.vid;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.fileHash;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        List<String> list = this.urlList;
        int iHashCode4 = (iHashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        Integer num = this.width;
        int iHashCode5 = (iHashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.height;
        int iHashCode6 = (iHashCode5 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Size size = this.containerSize;
        int iHashCode7 = (iHashCode6 + (size == null ? 0 : size.hashCode())) * 31;
        String str4 = this.businessTag;
        int iHashCode8 = (iHashCode7 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.videoUrl;
        int iHashCode9 = (iHashCode8 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Long l = this.duration;
        int iHashCode10 = (iHashCode9 + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.expireTime;
        int iHashCode11 = (iHashCode10 + (l2 == null ? 0 : l2.hashCode())) * 31;
        String str6 = this.msgId;
        int iHashCode12 = (iHashCode11 + (str6 == null ? 0 : str6.hashCode())) * 31;
        List<String> list2 = this.hashTags;
        int iHashCode13 = (iHashCode12 + (list2 == null ? 0 : list2.hashCode())) * 31;
        Map<String, String> map = this.params;
        return ((iHashCode13 + (map != null ? map.hashCode() : 0)) * 31) + C786410Ut5.Z2(this.trackVideoPlayStatus);
    }

    public C1845270y7R(String str, String str2, String str3, List<String> list, Integer num, Integer num2, Size size, String str4, String str5, Long l, Long l2, String str6, List<String> list2, Map<String, String> map, boolean z) {
        this.videoModel = str;
        this.vid = str2;
        this.fileHash = str3;
        this.urlList = list;
        this.width = num;
        this.height = num2;
        this.containerSize = size;
        this.businessTag = str4;
        this.videoUrl = str5;
        this.duration = l;
        this.expireTime = l2;
        this.msgId = str6;
        this.hashTags = list2;
        this.params = map;
        this.trackVideoPlayStatus = z;
    }

    public C1845270y7R(String str, String str2, String str3, List list, Integer num, Integer num2, Size size, String str4, String str5, Long l, Long l2, String str6, List list2, Map map, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? C13BV.INSTANCE : list, (i & 16) != 0 ? 0 : num, (i & 32) != 0 ? 0 : num2, (i & 64) != 0 ? null : size, (i & 128) != 0 ? null : str4, (i & 256) == 0 ? str5 : "", (i & 512) != 0 ? 0L : l, (i & 1024) != 0 ? null : l2, (i & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) == 0 ? str6 : null, (i & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0 ? C13BV.INSTANCE : list2, (i & 8192) != 0 ? new LinkedHashMap() : map, (i & 16384) == 0 ? z : false);
    }
}
