package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.07Wz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1877507Wz {
    public final String LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1877507Wz) && Intrinsics.LJFF(this.LIZ, ((C1877507Wz) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("URLConfig(cacheDir=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1877507Wz() {
        this("");
    }

    public C1877507Wz(String str) {
        this.LIZ = str;
    }
}
