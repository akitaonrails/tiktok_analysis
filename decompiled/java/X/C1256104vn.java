package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.04vn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1256104vn implements InterfaceC1256404vq {
    public final String LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1256104vn) && Intrinsics.LJFF(this.LIZ, ((C1256104vn) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Playing(sourceId=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1256104vn(String str) {
        this.LIZ = str;
    }
}
