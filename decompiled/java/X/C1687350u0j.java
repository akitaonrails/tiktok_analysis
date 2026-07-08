package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0u0j, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1687350u0j implements InterfaceC1672680td4 {
    public final String LIZ;
    public final String LIZIZ;
    public final EnumC1687410u0p LIZJ;
    public final boolean LIZLLL;
    public final long LJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1687350u0j)) {
            return false;
        }
        C1687350u0j c1687350u0j = (C1687350u0j) obj;
        return Intrinsics.LJFF(this.LIZ, c1687350u0j.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1687350u0j.LIZIZ) && this.LIZJ == c1687350u0j.LIZJ && this.LIZLLL == c1687350u0j.LIZLLL && this.LJ == c1687350u0j.LJ;
    }

    public final int hashCode() {
        return (((((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode()) * 31) + C786410Ut5.Z2(this.LIZLLL)) * 31) + C786410Ut5.Y2(this.LJ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TextData(uuid=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", content=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", messageType=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", isComplete=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", roundId=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1672680td4
    public final long LIZ() {
        return this.LJ;
    }

    @Override // X.InterfaceC1672680td4
    public final String getContent() {
        return this.LIZIZ;
    }

    @Override // X.InterfaceC1672680td4
    public final EnumC1687410u0p getMessageType() {
        return this.LIZJ;
    }

    @Override // X.InterfaceC1672680td4
    public final String getUuid() {
        return this.LIZ;
    }

    public static C1687350u0j LIZIZ(C1687350u0j c1687350u0j, String str) {
        String str2 = c1687350u0j.LIZIZ;
        EnumC1687410u0p enumC1687410u0p = c1687350u0j.LIZJ;
        boolean z = c1687350u0j.LIZLLL;
        long j = c1687350u0j.LJ;
        c1687350u0j.getClass();
        return new C1687350u0j(str, str2, enumC1687410u0p, z, j);
    }

    public C1687350u0j(String str, String str2, EnumC1687410u0p enumC1687410u0p, boolean z, long j) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = enumC1687410u0p;
        this.LIZLLL = z;
        this.LJ = j;
    }
}
