package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.11v4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19654411v4 implements InterfaceC1556330qbP {
    public final EnumC19646311tl LIZ;
    public final String LIZIZ;
    public final Boolean LIZJ;
    public final Boolean LIZLLL;

    public C19654411v4() {
        this(null, null, null, null, 15);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C19654411v4)) {
            return false;
        }
        C19654411v4 c19654411v4 = (C19654411v4) obj;
        return this.LIZ == c19654411v4.LIZ && Intrinsics.LJFF(this.LIZIZ, c19654411v4.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c19654411v4.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c19654411v4.LIZLLL);
    }

    public final int hashCode() {
        EnumC19646311tl enumC19646311tl = this.LIZ;
        int iHashCode = (enumC19646311tl == null ? 0 : enumC19646311tl.hashCode()) * 31;
        String str = this.LIZIZ;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.LIZJ;
        int iHashCode3 = (iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.LIZLLL;
        return iHashCode3 + (bool2 != null ? bool2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Status(boxState=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", errorMsg=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", previewLinkCanShow=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", disable=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C19654411v4(EnumC19646311tl enumC19646311tl, String str, Boolean bool, Boolean bool2, int i) {
        enumC19646311tl = (i & 1) != 0 ? null : enumC19646311tl;
        str = (i & 2) != 0 ? null : str;
        bool = (i & 4) != 0 ? null : bool;
        bool2 = (i & 8) != 0 ? null : bool2;
        this.LIZ = enumC19646311tl;
        this.LIZIZ = str;
        this.LIZJ = bool;
        this.LIZLLL = bool2;
    }
}
