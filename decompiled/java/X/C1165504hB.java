package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.04hB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1165504hB {
    public final String LIZ;

    public C1165504hB() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1165504hB) && Intrinsics.LJFF(this.LIZ, ((C1165504hB) obj).LIZ);
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
        sbLIZ.append("AudienceDecorationRoomExitData(unloadSource=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1165504hB(String str) {
        this.LIZ = str;
    }
}
