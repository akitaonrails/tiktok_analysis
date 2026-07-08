package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.04vp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1256304vp implements InterfaceC1256404vq {
    public final String LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1256304vp) && Intrinsics.LJFF(this.LIZ, ((C1256304vp) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Paused(sourceId=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1256304vp(String str) {
        this.LIZ = str;
    }
}
