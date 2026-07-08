package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.07ew, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1916007ew {
    public static final C1916007ew LIZIZ = new C1916007ew(C13BV.INSTANCE);
    public final List<List<C1240530iO3>> LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1916007ew) && Intrinsics.LJFF(this.LIZ, ((C1916007ew) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("InboxLocalSearchResult(tiers=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1916007ew(List<? extends List<C1240530iO3>> list) {
        this.LIZ = list;
    }
}
