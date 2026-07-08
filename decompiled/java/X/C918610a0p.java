package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0a0p, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C918610a0p {
    public final EnumC918840a1C LIZ;
    public final EnumC918770a15 LIZIZ;
    public final String LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C918610a0p)) {
            return false;
        }
        C918610a0p c918610a0p = (C918610a0p) obj;
        return this.LIZ == c918610a0p.LIZ && this.LIZIZ == c918610a0p.LIZIZ && Intrinsics.LJFF(this.LIZJ, c918610a0p.LIZJ);
    }

    public final int hashCode() {
        int iHashCode = ((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31;
        String str = this.LIZJ;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("InvitePreCheckResult(state=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", reason=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", message=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C918610a0p(EnumC918840a1C enumC918840a1C) {
        this(enumC918840a1C, EnumC918770a15.NONE, null);
    }

    public C918610a0p(EnumC918840a1C enumC918840a1C, EnumC918770a15 enumC918770a15, String str) {
        this.LIZ = enumC918840a1C;
        this.LIZIZ = enumC918770a15;
        this.LIZJ = str;
    }
}
