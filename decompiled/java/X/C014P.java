package X;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.014P, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C014P implements InterfaceC0241006d {
    public final int LL;
    public final int LLILLJJLI;
    public final Long LLILLL;

    @Override // X.InterfaceC1282004zy
    public final boolean checkExtraParamKey() {
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C014P)) {
            return false;
        }
        C014P c014p = (C014P) obj;
        return this.LL == c014p.LL && this.LLILLJJLI == c014p.LLILLJJLI && Intrinsics.LJFF(this.LLILLL, c014p.LLILLL);
    }

    public final int hashCode() {
        int i = ((this.LL * 31) + this.LLILLJJLI) * 31;
        Long l = this.LLILLL;
        return i + (l == null ? 0 : l.hashCode());
    }

    @Override // X.InterfaceC1282004zy
    public final Map<String, Object> keyParams() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("subtitle_id", Integer.valueOf(this.LL));
        linkedHashMap.put("is_translated_caption", Integer.valueOf(this.LLILLJJLI));
        linkedHashMap.put("video_first_caption_pts", this.LLILLL);
        return linkedHashMap;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SmartLoadInitParams(subId=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", isTranslatedCaption=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", videoFirstCaptionPts=");
        sbLIZ.append(this.LLILLL);
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

    public C014P(int i, int i2, Long l) {
        this.LL = i;
        this.LLILLJJLI = i2;
        this.LLILLL = l;
    }
}
