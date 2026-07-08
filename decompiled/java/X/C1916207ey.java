package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.07ey, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1916207ey {
    public static final C1916207ey LIZIZ = new C1916207ey(C13BV.INSTANCE);
    public final List<C1240530iO3> LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1916207ey) && Intrinsics.LJFF(this.LIZ, ((C1916207ey) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("InboxRelationResult(users=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1916207ey(List<C1240530iO3> list) {
        this.LIZ = list;
    }
}
