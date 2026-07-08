package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0brc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C989780brc extends AbstractC991610buZ {
    public final String LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C989780brc) && Intrinsics.LJFF(this.LIZ, ((C989780brc) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ToShow(componentType=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C989780brc(String str) {
        this.LIZ = str;
    }
}
