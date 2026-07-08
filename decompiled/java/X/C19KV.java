package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.19KV, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C19KV {
    public final String LIZ;
    public final List<C19KZ> LIZIZ;
    public final C19KZ LIZJ;
    public final String LIZLLL;
    public final List<String> LJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C19KV)) {
            return false;
        }
        C19KV c19kv = (C19KV) obj;
        return Intrinsics.LJFF(this.LIZ, c19kv.LIZ) && Intrinsics.LJFF(this.LIZIZ, c19kv.LIZIZ) && this.LIZJ == c19kv.LIZJ && Intrinsics.LJFF(this.LIZLLL, c19kv.LIZLLL) && Intrinsics.LJFF(this.LJ, c19kv.LJ);
    }

    public final int hashCode() {
        int iHashCode = ((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode()) * 31;
        String str = this.LIZLLL;
        return ((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.LJ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AdsActivityHistoryNormalizedParams(source=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", tabs=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", defaultTab=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", extraMsg=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", fallbackReasons=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C19KV(String str, List<? extends C19KZ> list, C19KZ c19kz, String str2, List<String> list2) {
        this.LIZ = str;
        this.LIZIZ = list;
        this.LIZJ = c19kz;
        this.LIZLLL = str2;
        this.LJ = list2;
    }
}
