package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0P7t, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C639830P7t implements InterfaceC1618170sD9<C639830P7t> {
    public final boolean LL;

    public C639830P7t() {
        this(false);
    }

    @Override // X.InterfaceC1282004zy
    public final boolean checkExtraParamKey() {
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C639830P7t) && this.LL == ((C639830P7t) obj).LL;
    }

    public final int hashCode() {
        return C786410Ut5.Z2(this.LL);
    }

    @Override // X.InterfaceC1282004zy
    public final Map<String, Object> keyParams() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("auto_triggered", Boolean.valueOf(this.LL));
        return linkedHashMap;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SearchLocationState(autoTriggered=");
        sbLIZ.append(this.LL);
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

    public C639830P7t(boolean z) {
        this.LL = z;
        C0P8T.LIZ();
    }
}
