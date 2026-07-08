package X;

import java.io.File;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0tZe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1670560tZe implements InterfaceC1667140tU8 {
    public final File LIZ;
    public final InterfaceC1320380kSq LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1670560tZe)) {
            return false;
        }
        C1670560tZe c1670560tZe = (C1670560tZe) obj;
        return Intrinsics.LJFF(this.LIZ, c1670560tZe.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1670560tZe.LIZIZ);
    }

    public final int hashCode() {
        int iHashCode = this.LIZ.hashCode() * 31;
        InterfaceC1320380kSq interfaceC1320380kSq = this.LIZIZ;
        return iHashCode + (interfaceC1320380kSq == null ? 0 : interfaceC1320380kSq.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LocalFileResource(file=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", scaleType=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1670560tZe(File file, InterfaceC1320380kSq interfaceC1320380kSq) {
        this.LIZ = file;
        this.LIZIZ = interfaceC1320380kSq;
    }
}
