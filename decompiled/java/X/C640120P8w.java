package X;

import java.util.Map;
import kotlin.jvm.internal.AFwS293S0000000_10;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0P8w, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C640120P8w implements InterfaceC639120P5a {
    public final Map<String, String> LL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C640120P8w) && Intrinsics.LJFF(this.LL, ((C640120P8w) obj).LL);
    }

    public final int hashCode() {
        Map<String, String> map = this.LL;
        if (map == null) {
            return 0;
        }
        return map.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("UpdateRefineSearchExtraRequestParamsAction(newRequestParamsMap=");
        sbLIZ.append(this.LL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    static {
        C0Q3E.LJFF().SL1().LIZIZ(C13LE.LIZ(C640120P8w.class), AFwS293S0000000_10.get$arr$(112));
    }

    @Override // X.C0PWT
    public final boolean isLog() {
        return C0P9U.LIZ();
    }

    public C640120P8w(Map<String, String> map) {
        this.LL = map;
    }
}
