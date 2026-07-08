package X;

import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0PCX, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0PCX implements InterfaceC1618170sD9<C0PCX> {
    public final Set<Integer> LL;

    public C0PCX() {
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
        return (obj instanceof C0PCX) && Intrinsics.LJFF(this.LL, ((C0PCX) obj).LL);
    }

    public final int hashCode() {
        return this.LL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SearchOuterFlowExposureState(exposedIdSet=");
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

    public /* synthetic */ C0PCX(int i) {
        this((Set<Integer>) Collections.synchronizedSet(new HashSet()));
    }

    public C0PCX(Set<Integer> set) {
        this.LL = set;
        C0P8T.LIZ();
    }
}
