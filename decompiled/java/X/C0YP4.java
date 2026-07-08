package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0YP4, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0YP4 implements InterfaceC873710YPh {
    public final C0YP2 LIZ;
    public final String LIZIZ;
    public final long LIZJ;
    public final boolean LIZLLL;
    public final boolean LJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0YP4)) {
            return false;
        }
        C0YP4 c0yp4 = (C0YP4) obj;
        return Intrinsics.LJFF(this.LIZ, c0yp4.LIZ) && Intrinsics.LJFF(this.LIZIZ, c0yp4.LIZIZ) && this.LIZJ == c0yp4.LIZJ && this.LIZLLL == c0yp4.LIZLLL;
    }

    public final int hashCode() {
        return (((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + C786410Ut5.Y2(this.LIZJ)) * 31) + C786410Ut5.Z2(this.LIZLLL);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("New(params=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", msgUuid=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", createdAt=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", toStringPrivacyFilter=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC873710YPh
    public final String getConversationId() {
        InterfaceC1265604xK interfaceC1265604xK = this.LIZ.LIZ;
        if (interfaceC1265604xK instanceof C1265504xJ) {
            return ((C1265504xJ) interfaceC1265604xK).LIZ;
        }
        if (interfaceC1265604xK instanceof C1265404xI) {
            return "";
        }
        throw new C1954807lC();
    }

    @Override // X.InterfaceC873710YPh
    public final boolean LJIIIIZZ() {
        return this.LJ;
    }

    public /* synthetic */ C0YP4(C0YP2 c0yp2, String str) {
        this(c0yp2, str, System.currentTimeMillis(), false);
    }

    public C0YP4(C0YP2 c0yp2, String str, long j, boolean z) {
        this.LIZ = c0yp2;
        this.LIZIZ = str;
        this.LIZJ = j;
        this.LIZLLL = z;
        this.LJ = true;
    }
}
