package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0E2g, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C358120E2g {
    public final String LIZ;

    public C358120E2g() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C358120E2g) && Intrinsics.LJFF(this.LIZ, ((C358120E2g) obj).LIZ);
    }

    public final int hashCode() {
        String str = this.LIZ;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Result(strippedMusicSlotId=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C358120E2g(String str) {
        this.LIZ = str;
    }
}
