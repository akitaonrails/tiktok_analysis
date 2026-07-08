package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0h7S, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1191800h7S extends AbstractC1191910h7d {
    public final C03IT LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1191800h7S) && Intrinsics.LJFF(this.LIZ, ((C1191800h7S) obj).LIZ);
    }

    public final int hashCode() {
        C03IT c03it = this.LIZ;
        if (c03it == null) {
            return 0;
        }
        return c03it.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Image(image=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1191800h7S(C03IT c03it) {
        this.LIZ = c03it;
    }
}
