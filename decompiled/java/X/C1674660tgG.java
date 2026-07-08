package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0tgG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1674660tgG implements InterfaceC1674710tgL {
    public final EnumC1674690tgJ LIZ;
    public final String LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1674660tgG)) {
            return false;
        }
        C1674660tgG c1674660tgG = (C1674660tgG) obj;
        return this.LIZ == c1674660tgG.LIZ && Intrinsics.LJFF(this.LIZIZ, c1674660tgG.LIZIZ);
    }

    public final int hashCode() {
        int iHashCode = this.LIZ.hashCode() * 31;
        String str = this.LIZIZ;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CreateOrUpdateCollectionSuccess(type=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", collectionId=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1674660tgG(EnumC1674690tgJ enumC1674690tgJ, String str) {
        this.LIZ = enumC1674690tgJ;
        this.LIZIZ = str;
    }
}
