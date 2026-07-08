package X;

import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.02rw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C722602rw {
    public final String LIZ;
    public final Set<String> LIZIZ;
    public final Set<String> LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C722602rw)) {
            return false;
        }
        C722602rw c722602rw = (C722602rw) obj;
        return Intrinsics.LJFF(this.LIZ, c722602rw.LIZ) && Intrinsics.LJFF(this.LIZIZ, c722602rw.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c722602rw.LIZJ);
    }

    public final int hashCode() {
        return (((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SlotRuleMatcher(slotId=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", whitelistComponentKeys=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", blacklistComponentKeys=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C722602rw(Set set, Set set2, String str) {
        this.LIZ = str;
        this.LIZIZ = set;
        this.LIZJ = set2;
    }
}
