package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Gjm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C423920Gjm implements InterfaceC423930Gjn {
    public final String LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C423920Gjm) && Intrinsics.LJFF(this.LIZ, ((C423920Gjm) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Paragraph(content=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C423920Gjm(String str) {
        this.LIZ = str;
    }
}
