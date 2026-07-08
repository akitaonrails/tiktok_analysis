package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ZYz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C901710ZYz implements C0ZZ3 {
    public final InterfaceC460300I3g LIZ;
    public final boolean LIZIZ;
    public final String LIZJ;
    public final C1622006Ws<Boolean> LIZLLL = new C1622006Ws<>(Boolean.FALSE);

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C901710ZYz)) {
            return false;
        }
        C901710ZYz c901710ZYz = (C901710ZYz) obj;
        return Intrinsics.LJFF(this.LIZ, c901710ZYz.LIZ) && this.LIZIZ == c901710ZYz.LIZIZ && Intrinsics.LJFF(this.LIZJ, c901710ZYz.LIZJ);
    }

    public final int hashCode() {
        int iHashCode = ((this.LIZ.hashCode() * 31) + C786410Ut5.Z2(this.LIZIZ)) * 31;
        String str = this.LIZJ;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("NotInLive(reason=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", isFollowing=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", shareLiveIntent=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.C0ZZ3
    public final C1622006Ws<Boolean> LIZ() {
        return this.LIZLLL;
    }

    public C901710ZYz(C1233704sB c1233704sB, String str, boolean z) {
        this.LIZ = c1233704sB;
        this.LIZIZ = z;
        this.LIZJ = str;
    }
}
