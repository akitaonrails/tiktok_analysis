package X;

import java.util.Map;

/* JADX INFO: renamed from: X.0PA7, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0PA7 implements InterfaceC1618170sD9<C0PA7> {
    public final boolean LL;

    public C0PA7() {
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
        return (obj instanceof C0PA7) && this.LL == ((C0PA7) obj).LL;
    }

    public final int hashCode() {
        return C786410Ut5.Z2(this.LL);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SearchSevenScreenContextState(isAlive=");
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

    @Override // X.InterfaceC1282004zy
    public final Map<String, Object> keyParams() {
        return C2097608Jq.LJ();
    }

    public C0PA7(boolean z) {
        this.LL = z;
        C0P8T.LIZ();
    }
}
