package X;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0078, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class AnonymousClass0078 implements InterfaceC1282004zy {
    public final String LL;
    public final String LLILLJJLI;
    public final int LLILLL;
    public final int LLILZ;

    public AnonymousClass0078() {
        this(null, 0, 15);
    }

    @Override // X.InterfaceC1282004zy
    public final boolean checkExtraParamKey() {
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AnonymousClass0078)) {
            return false;
        }
        AnonymousClass0078 anonymousClass0078 = (AnonymousClass0078) obj;
        return Intrinsics.LJFF(this.LL, anonymousClass0078.LL) && Intrinsics.LJFF(this.LLILLJJLI, anonymousClass0078.LLILLJJLI) && this.LLILLL == anonymousClass0078.LLILLL && this.LLILZ == anonymousClass0078.LLILZ;
    }

    public final int hashCode() {
        return (((((this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode()) * 31) + this.LLILLL) * 31) + this.LLILZ;
    }

    @Override // X.InterfaceC1282004zy
    public final Map<String, Object> keyParams() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("show_options", this.LL);
        linkedHashMap.put("enter_method", this.LLILLJJLI);
        linkedHashMap.put("is_danmaku_entry_available", Integer.valueOf(this.LLILLL));
        linkedHashMap.put("is_landscape_screen", Integer.valueOf(this.LLILZ));
        return linkedHashMap;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("DanmakuOptionParams(showOptions=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", enterMethod=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", isDanmakuEntryAvailable=");
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

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ AnonymousClass0078(String str, int i, int i2) {
        String str2;
        if ((i2 & 1) != 0) {
            str2 = "";
        } else {
            str2 = null;
        }
        this(str2, (i2 & 2) != 0 ? "" : str, 0, (i2 & 8) != 0 ? 0 : i);
    }

    public AnonymousClass0078(String str, String str2, int i, int i2) {
        this.LL = str;
        this.LLILLJJLI = str2;
        this.LLILLL = i;
        this.LLILZ = i2;
    }
}
