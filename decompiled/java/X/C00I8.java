package X;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.00I8, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C00I8 implements InterfaceC1282004zy {
    public final String LL;
    public final int LLILLJJLI;
    public final String LLILLL;
    public final int LLILZ;

    /* JADX WARN: Illegal instructions before constructor call */
    public C00I8() {
        String str = null;
        this(0, str, str, 15);
    }

    @Override // X.InterfaceC1282004zy
    public final boolean checkExtraParamKey() {
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C00I8)) {
            return false;
        }
        C00I8 c00i8 = (C00I8) obj;
        return Intrinsics.LJFF(this.LL, c00i8.LL) && this.LLILLJJLI == c00i8.LLILLJJLI && Intrinsics.LJFF(this.LLILLL, c00i8.LLILLL) && this.LLILZ == c00i8.LLILZ;
    }

    public final int hashCode() {
        return (((((this.LL.hashCode() * 31) + this.LLILLJJLI) * 31) + this.LLILLL.hashCode()) * 31) + this.LLILZ;
    }

    @Override // X.InterfaceC1282004zy
    public final Map<String, Object> keyParams() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("danmaku_id", this.LL);
        linkedHashMap.put("is_sender", Integer.valueOf(this.LLILLJJLI));
        linkedHashMap.put("enter_method", this.LLILLL);
        linkedHashMap.put("is_landscape_screen", Integer.valueOf(this.LLILZ));
        return linkedHashMap;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("DanmakuConsumerItemParams(danmakuId=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", isSender=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", enterMethod=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", isLandscapeScreen=");
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

    public /* synthetic */ C00I8(int i, String str, String str2, int i2) {
        this((i2 & 1) != 0 ? "" : str, 0, (i2 & 4) != 0 ? "" : str2, (i2 & 8) != 0 ? 0 : i);
    }

    public C00I8(String str, int i, String str2, int i2) {
        this.LL = str;
        this.LLILLJJLI = i;
        this.LLILLL = str2;
        this.LLILZ = i2;
    }
}
