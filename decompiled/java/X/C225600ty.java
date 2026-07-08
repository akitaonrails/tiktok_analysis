package X;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.00ty, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C225600ty implements InterfaceC0241006d {
    public final Integer LL;
    public final String LLILLJJLI;
    public final Double LLILLL;
    public final Integer LLILZ;

    @Override // X.InterfaceC1282004zy
    public final boolean checkExtraParamKey() {
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C225600ty)) {
            return false;
        }
        C225600ty c225600ty = (C225600ty) obj;
        return Intrinsics.LJFF(this.LL, c225600ty.LL) && Intrinsics.LJFF(this.LLILLJJLI, c225600ty.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c225600ty.LLILLL) && Intrinsics.LJFF(this.LLILZ, c225600ty.LLILZ);
    }

    public final int hashCode() {
        Integer num = this.LL;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.LLILLJJLI;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Double d = this.LLILLL;
        int iHashCode3 = (iHashCode2 + (d == null ? 0 : d.hashCode())) * 31;
        Integer num2 = this.LLILZ;
        return iHashCode3 + (num2 != null ? num2.hashCode() : 0);
    }

    @Override // X.InterfaceC1282004zy
    public final Map<String, Object> keyParams() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("is_fullscreen", this.LL);
        linkedHashMap.put("feature_flag", this.LLILLJJLI);
        linkedHashMap.put("launch_volume_pct", this.LLILLL);
        linkedHashMap.put("is_captions_intro_show", this.LLILZ);
        return linkedHashMap;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("VideoPlayExtraParams(isFullscreen=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", featureFlag=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", launchVolumePct=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", isCaptionsIntroShow=");
        sbLIZ.append(this.LLILZ);
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

    public C225600ty(Integer num, String str, Double d, Integer num2) {
        this.LL = num;
        this.LLILLJJLI = str;
        this.LLILLL = d;
        this.LLILZ = num2;
    }
}
