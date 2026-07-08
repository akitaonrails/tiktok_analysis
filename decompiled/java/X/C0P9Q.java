package X;

import java.util.Map;
import kotlin.jvm.internal.AFwS293S0000000_10;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0P9Q, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0P9Q implements InterfaceC639120P5a {
    public final Map<String, String> LL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0P9Q) && Intrinsics.LJFF(this.LL, ((C0P9Q) obj).LL);
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
        sbLIZ.append("AppendSearchExtraRequestParamMapAction(toAppendRequestParamMap=");
        sbLIZ.append(this.LL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    static {
        C0Q3E.LJFF().SL1().LIZIZ(C13LE.LIZ(C0P9Q.class), AFwS293S0000000_10.get$arr$(166));
    }

    @Override // X.C0PWT
    public final boolean isLog() {
        return C0P9U.LIZ();
    }

    public C0P9Q(Map<String, String> map) {
        this.LL = map;
    }
}
