package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0041, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class AnonymousClass0041 {
    public final List<String> LIZ;
    public final List<String> LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AnonymousClass0041)) {
            return false;
        }
        AnonymousClass0041 anonymousClass0041 = (AnonymousClass0041) obj;
        return Intrinsics.LJFF(this.LIZ, anonymousClass0041.LIZ) && Intrinsics.LJFF(this.LIZIZ, anonymousClass0041.LIZIZ);
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CoHostUserListDiff(addedUids=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", removedUids=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public AnonymousClass0041(List<String> list, List<String> list2) {
        this.LIZ = list;
        this.LIZIZ = list2;
    }
}
