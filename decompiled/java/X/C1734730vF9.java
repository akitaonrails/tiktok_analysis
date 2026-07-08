package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0vF9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1734730vF9 {
    public static final C1734730vF9 LIZJ = new C1734730vF9("", EnumC1734720vF8.NONE);
    public final String LIZ;
    public final EnumC1734720vF8 LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1734730vF9)) {
            return false;
        }
        C1734730vF9 c1734730vF9 = (C1734730vF9) obj;
        return Intrinsics.LJFF(this.LIZ, c1734730vF9.LIZ) && this.LIZIZ == c1734730vF9.LIZIZ;
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PrefillResult(value=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", source=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1734730vF9(String str, EnumC1734720vF8 enumC1734720vF8) {
        this.LIZ = str;
        this.LIZIZ = enumC1734720vF8;
    }
}
