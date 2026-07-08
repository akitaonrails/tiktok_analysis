package X;

import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0I7z, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C461530I7z implements C0I80 {
    public final Set<C14IR> LIZ;
    public final Object LIZIZ;
    public final boolean LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C461530I7z)) {
            return false;
        }
        C461530I7z c461530I7z = (C461530I7z) obj;
        return Intrinsics.LJFF(this.LIZ, c461530I7z.LIZ) && Intrinsics.LJFF(this.LIZIZ, c461530I7z.LIZIZ) && this.LIZJ == c461530I7z.LIZJ;
    }

    public final int hashCode() {
        int iHashCode = this.LIZ.hashCode() * 31;
        Object obj = this.LIZIZ;
        return ((iHashCode + (obj == null ? 0 : obj.hashCode())) * 31) + C786410Ut5.Z2(this.LIZJ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SkeletonItemDiff(slotChange=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", contentChange=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", canReuseVH=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.C0I80
    public final boolean LIZ() {
        return this.LIZJ;
    }

    public /* synthetic */ C461530I7z(Set set) {
        this(null, set, true);
    }

    public C461530I7z(Object obj, Set set, boolean z) {
        this.LIZ = set;
        this.LIZIZ = obj;
        this.LIZJ = z;
    }

    public static C461530I7z LIZIZ(C461530I7z c461530I7z, C08CX c08cx, Object obj, int i) {
        boolean z;
        Set<C14IR> set = c08cx;
        if ((i & 1) != 0) {
            set = c461530I7z.LIZ;
        }
        if ((i & 2) != 0) {
            obj = c461530I7z.LIZIZ;
        }
        if ((i & 4) != 0) {
            z = c461530I7z.LIZJ;
        } else {
            z = false;
        }
        return new C461530I7z(obj, set, z);
    }
}
