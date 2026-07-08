package X;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0qnl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1563990qnl {
    public final String LIZ;
    public final String LIZIZ;
    public final Map<String, String> LIZJ;

    public C1563990qnl() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1563990qnl)) {
            return false;
        }
        C1563990qnl c1563990qnl = (C1563990qnl) obj;
        return Intrinsics.LJFF(this.LIZ, c1563990qnl.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1563990qnl.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c1563990qnl.LIZJ);
    }

    public final int hashCode() {
        return (((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ChainInfo(triggerSource=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", chainId=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", extra=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1563990qnl(String str, String str2) {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = concurrentHashMap;
    }
}
