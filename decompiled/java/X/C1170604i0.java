package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.04i0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1170604i0 {
    public final String LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1170604i0) && Intrinsics.LJFF(this.LIZ, ((C1170604i0) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LinkMicPosIdentityExtra(contentLinkMicId=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1170604i0(String str) {
        this.LIZ = str;
    }
}
