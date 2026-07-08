package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.17pV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21148717pV extends AbstractC21148617pU {
    public final InterfaceC21374418ko LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C21148717pV) && Intrinsics.LJFF(this.LIZ, ((C21148717pV) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Video(item=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C21148717pV(InterfaceC21374418ko interfaceC21374418ko) {
        this.LIZ = interfaceC21374418ko;
    }
}
