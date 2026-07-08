package X;

import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.007K, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C007K {
    public final Set<String> LIZ;
    public final String LIZIZ;

    public C007K() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C007K)) {
            return false;
        }
        C007K c007k = (C007K) obj;
        return Intrinsics.LJFF(this.LIZ, c007k.LIZ) && Intrinsics.LJFF(this.LIZIZ, c007k.LIZIZ);
    }

    public final int hashCode() {
        Set<String> set = this.LIZ;
        int iHashCode = (set == null ? 0 : set.hashCode()) * 31;
        String str = this.LIZIZ;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MultiTopLiveRoomMatchSceneState(anchorIdList=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", subType=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C007K(Object obj) {
        this.LIZ = null;
        this.LIZIZ = null;
    }
}
