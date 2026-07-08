package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0gCZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1156530gCZ<T> {
    public final InterfaceC1680500tpg LIZ;

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        InterfaceC1680500tpg interfaceC1680500tpg = this.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SkippableUpdater(composer=");
        sbLIZ.append(interfaceC1680500tpg);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final boolean equals(Object obj) {
        InterfaceC1680500tpg interfaceC1680500tpg = this.LIZ;
        if (!(obj instanceof C1156530gCZ) || !Intrinsics.LJFF(interfaceC1680500tpg, ((C1156530gCZ) obj).LIZ)) {
            return false;
        }
        return true;
    }
}
