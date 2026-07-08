package X;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Rpk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C707900Rpk {
    public final String LIZ;
    public final EnumC707860Rpg LIZIZ;
    public Map<String, ? extends Object> LIZJ = C2097608Jq.LJ();

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C707900Rpk)) {
            return false;
        }
        C707900Rpk c707900Rpk = (C707900Rpk) obj;
        return Intrinsics.LJFF(this.LIZ, c707900Rpk.LIZ) && this.LIZIZ == c707900Rpk.LIZIZ;
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FcpTraceNode(identifier=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", nodeType=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C707900Rpk(String str, EnumC707860Rpg enumC707860Rpg) {
        this.LIZ = str;
        this.LIZIZ = enumC707860Rpg;
    }
}
