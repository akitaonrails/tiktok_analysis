package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.04jJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1178704jJ implements InterfaceC1178904jL {
    public final String LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1178704jJ) && Intrinsics.LJFF(this.LIZ, ((C1178704jJ) obj).LIZ);
    }

    @Override // X.InterfaceC1178904jL
    public final String getKey() {
        return "last_filter_id";
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
        sbLIZ.append("FilterId(value=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1178904jL
    public final String getValue() {
        return this.LIZ;
    }

    public C1178704jJ(String str) {
        this.LIZ = str;
    }
}
