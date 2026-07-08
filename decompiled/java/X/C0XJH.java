package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0XJH, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0XJH extends C0XJJ {
    public final String LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0XJH) && Intrinsics.LJFF(this.LIZ, ((C0XJH) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Key(key=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0XJH(String str) {
        this.LIZ = str;
    }
}
