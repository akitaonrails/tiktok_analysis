package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0fwa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1146620fwa extends AbstractC1146640fwc {
    public final C1146350fw9 LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1146620fwa) && Intrinsics.LJFF(this.LIZ, ((C1146620fwa) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ListGiftClickEvent(item=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1146620fwa(C1146350fw9 c1146350fw9) {
        this.LIZ = c1146350fw9;
    }
}
