package X;

import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.04zo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1281004zo {
    public final String LIZ;
    public final boolean LIZIZ;
    public final Set<C1281104zp> LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1281004zo)) {
            return false;
        }
        C1281004zo c1281004zo = (C1281004zo) obj;
        return Intrinsics.LJFF(this.LIZ, c1281004zo.LIZ) && this.LIZIZ == c1281004zo.LIZIZ && Intrinsics.LJFF(this.LIZJ, c1281004zo.LIZJ);
    }

    public final int hashCode() {
        return (((this.LIZ.hashCode() * 31) + C786410Ut5.Z2(this.LIZIZ)) * 31) + this.LIZJ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SessionState(sessionId=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", wasFeedPlayingAtEntry=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", blockers=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1281004zo(String str, boolean z) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        this.LIZ = str;
        this.LIZIZ = z;
        this.LIZJ = linkedHashSet;
    }
}
