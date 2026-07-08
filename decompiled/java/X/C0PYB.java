package X;

import defpackage.q0;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0PYB, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0PYB implements InterfaceC1618170sD9<C0PYB> {
    public final q0<C0PY7> LL;

    public C0PYB() {
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
        return (obj instanceof C0PYB) && Intrinsics.LJFF(this.LL, ((C0PYB) obj).LL);
    }

    public final int hashCode() {
        return this.LL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SearchLatestGroupIdState(lastTwoSearchGidInfoList=");
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

    public C0PYB(Object obj) {
        this.LL = new q0<>(2);
        C0P8T.LIZ();
    }
}
