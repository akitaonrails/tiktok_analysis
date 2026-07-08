package X;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0073, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class AnonymousClass0073 implements InterfaceC1282004zy {
    public String LL;
    public Map<String, ? extends Object> LLILLJJLI;

    public AnonymousClass0073() {
        this(null);
    }

    @Override // X.InterfaceC1282004zy
    public final boolean checkExtraParamKey() {
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AnonymousClass0073)) {
            return false;
        }
        AnonymousClass0073 anonymousClass0073 = (AnonymousClass0073) obj;
        return Intrinsics.LJFF(this.LL, anonymousClass0073.LL) && Intrinsics.LJFF(this.LLILLJJLI, anonymousClass0073.LLILLJJLI);
    }

    public final int hashCode() {
        String str = this.LL;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Map<String, ? extends Object> map = this.LLILLJJLI;
        return iHashCode + (map != null ? map.hashCode() : 0);
    }

    @Override // X.InterfaceC1282004zy
    public final Map<String, Object> keyParams() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("live_tab_style", this.LL);
        return linkedHashMap;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LiveHomePageMobParamGroup(liveTabStyle=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", map=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1282004zy
    public final Map<String, Object> getExtraParam() {
        Map<String, ? extends Object> map = this.LLILLJJLI;
        return map == null ? C2097608Jq.LJ() : map;
    }

    @Override // X.InterfaceC1282004zy
    public final Map<String, Object> filteredParams() {
        return keyParams();
    }

    public AnonymousClass0073(Object obj) {
        this.LL = null;
        this.LLILLJJLI = null;
    }
}
