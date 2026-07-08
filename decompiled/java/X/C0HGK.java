package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0HGK, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0HGK implements InterfaceC440090HNn {
    public final String LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0HGK) && Intrinsics.LJFF(this.LIZ, ((C0HGK) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TextElement(text=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0HGK(String str) {
        this.LIZ = str;
    }
}
