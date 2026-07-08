package X;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0P8O, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0P8O implements InterfaceC1618170sD9<C0P8O> {
    public final String LL;
    public final boolean LLILLJJLI;

    public C0P8O() {
        this(0);
    }

    @Override // X.InterfaceC1282004zy
    public final boolean checkExtraParamKey() {
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0P8O)) {
            return false;
        }
        C0P8O c0p8o = (C0P8O) obj;
        return Intrinsics.LJFF(this.LL, c0p8o.LL) && this.LLILLJJLI == c0p8o.LLILLJJLI;
    }

    public final int hashCode() {
        return (this.LL.hashCode() * 31) + C786410Ut5.Z2(this.LLILLJJLI);
    }

    @Override // X.InterfaceC1282004zy
    public final Map<String, Object> keyParams() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("search_stack_id", this.LL);
        linkedHashMap.put("search_stack_top", Boolean.valueOf(this.LLILLJJLI));
        return linkedHashMap;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SearchStackState(searchStackId=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", searchStackTop=");
        sbLIZ.append(this.LLILLJJLI);
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

    public /* synthetic */ C0P8O(int i) {
        this("", true);
    }

    public C0P8O(String str, boolean z) {
        this.LL = str;
        this.LLILLJJLI = z;
        C0P8T.LIZ();
    }
}
