package X;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.014S, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C014S implements InterfaceC0241006d {
    public Integer LL;
    public Integer LLILLJJLI;
    public int LLILLL;
    public Integer LLILZ;
    public int LLILZIL;
    public Integer LLILZLL;
    public Long LLIZ;

    public C014S() {
        this(null, 127);
    }

    @Override // X.InterfaceC1282004zy
    public final boolean checkExtraParamKey() {
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C014S)) {
            return false;
        }
        C014S c014s = (C014S) obj;
        return Intrinsics.LJFF(this.LL, c014s.LL) && Intrinsics.LJFF(this.LLILLJJLI, c014s.LLILLJJLI) && this.LLILLL == c014s.LLILLL && Intrinsics.LJFF(this.LLILZ, c014s.LLILZ) && this.LLILZIL == c014s.LLILZIL && Intrinsics.LJFF(this.LLILZLL, c014s.LLILZLL) && Intrinsics.LJFF(this.LLIZ, c014s.LLIZ);
    }

    public final int hashCode() {
        Integer num = this.LL;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.LLILLJJLI;
        int iHashCode2 = (((iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31) + this.LLILLL) * 31;
        Integer num3 = this.LLILZ;
        int iHashCode3 = (((iHashCode2 + (num3 == null ? 0 : num3.hashCode())) * 31) + this.LLILZIL) * 31;
        Integer num4 = this.LLILZLL;
        int iHashCode4 = (iHashCode3 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Long l = this.LLIZ;
        return iHashCode4 + (l != null ? l.hashCode() : 0);
    }

    @Override // X.InterfaceC1282004zy
    public final Map<String, Object> keyParams() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("preload_sub", this.LL);
        linkedHashMap.put("predicted_advanced_by", this.LLILLJJLI);
        linkedHashMap.put("user_setting_changed", Integer.valueOf(this.LLILLL));
        linkedHashMap.put("loaded_sub", this.LLILZ);
        linkedHashMap.put("preload_sub_match", Integer.valueOf(this.LLILZIL));
        linkedHashMap.put("video_first_caption_pts", this.LLILZLL);
        return linkedHashMap;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("OfflinePreloadStatus(preloadSub=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", predictedAdvancedBy=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", userSettingChanged=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", loadedSub=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", preloadSubMatch=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(", videoFirstCaptionPts=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(", predictedAt=");
        sbLIZ.append(this.LLIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1282004zy
    public final Map<String, Object> filteredParams() {
        return keyParams();
    }

    @Override // X.InterfaceC1282004zy
    public final Map<String, Object> getExtraParam() {
        return C2097608Jq.LJ();
    }

    public C014S(Integer num, int i) {
        this.LL = (i & 1) != 0 ? null : num;
        this.LLILLJJLI = null;
        this.LLILLL = 0;
        this.LLILZ = null;
        this.LLILZIL = 0;
        this.LLILZLL = null;
        this.LLIZ = null;
    }
}
