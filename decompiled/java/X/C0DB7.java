package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0DB7, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0DB7 extends C0DB8 {
    public final String LIZ;
    public final boolean LIZIZ;
    public final boolean LIZJ;

    public C0DB7() {
        this(null, false, false);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0DB7)) {
            return false;
        }
        C0DB7 c0db7 = (C0DB7) obj;
        return Intrinsics.LJFF(this.LIZ, c0db7.LIZ) && this.LIZIZ == c0db7.LIZIZ && this.LIZJ == c0db7.LIZJ;
    }

    public final int hashCode() {
        String str = this.LIZ;
        return ((((str == null ? 0 : str.hashCode()) * 31) + C786410Ut5.Z2(this.LIZIZ)) * 31) + C786410Ut5.Z2(this.LIZJ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Ready(inlineMessage=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", isRefreshing=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", isBuildingToken=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0DB7(String str, boolean z, boolean z2) {
        this.LIZ = str;
        this.LIZIZ = z;
        this.LIZJ = z2;
    }
}
