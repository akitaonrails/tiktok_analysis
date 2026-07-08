package X;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.00I9, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C00I9 implements InterfaceC1282004zy {
    public final int LL;
    public final String LLILLJJLI;
    public final int LLILLL;
    public final int LLILZ;
    public final String LLILZIL;
    public final int LLILZLL;

    public C00I9() {
        this(0, 0, 0, null, null, 0, 63);
    }

    @Override // X.InterfaceC1282004zy
    public final boolean checkExtraParamKey() {
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C00I9)) {
            return false;
        }
        C00I9 c00i9 = (C00I9) obj;
        return this.LL == c00i9.LL && Intrinsics.LJFF(this.LLILLJJLI, c00i9.LLILLJJLI) && this.LLILLL == c00i9.LLILLL && this.LLILZ == c00i9.LLILZ && Intrinsics.LJFF(this.LLILZIL, c00i9.LLILZIL) && this.LLILZLL == c00i9.LLILZLL;
    }

    public final int hashCode() {
        return (((((((((this.LL * 31) + this.LLILLJJLI.hashCode()) * 31) + this.LLILLL) * 31) + this.LLILZ) * 31) + this.LLILZIL.hashCode()) * 31) + this.LLILZLL;
    }

    @Override // X.InterfaceC1282004zy
    public final Map<String, Object> keyParams() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("shown_danmaku_cnt", Integer.valueOf(this.LL));
        linkedHashMap.put("danmaku_id_list", this.LLILLJJLI);
        linkedHashMap.put("uniq_danmaku_cnt", Integer.valueOf(this.LLILLL));
        linkedHashMap.put("play_order", Integer.valueOf(this.LLILZ));
        linkedHashMap.put("enter_method", this.LLILZIL);
        linkedHashMap.put("is_landscape_screen", Integer.valueOf(this.LLILZLL));
        return linkedHashMap;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("DanmakuConsumerParams(shownDanmakuCnt=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", danmakuIdList=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", uniqDanmakuCnt=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", playOrder=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", enterMethod=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(", isLandscapeScreen=");
        sbLIZ.append(this.LLILZLL);
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

    public C00I9(int i, int i2, int i3, String str, String str2, int i4, int i5) {
        i = (i5 & 1) != 0 ? 0 : i;
        str = (i5 & 2) != 0 ? "" : str;
        i2 = (i5 & 4) != 0 ? 0 : i2;
        i3 = (i5 & 8) != 0 ? -1 : i3;
        str2 = (i5 & 16) != 0 ? "" : str2;
        i4 = (i5 & 32) != 0 ? 0 : i4;
        this.LL = i;
        this.LLILLJJLI = str;
        this.LLILLL = i2;
        this.LLILZ = i3;
        this.LLILZIL = str2;
        this.LLILZLL = i4;
    }
}
