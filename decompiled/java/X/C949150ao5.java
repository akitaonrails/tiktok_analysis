package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ao5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C949150ao5 implements InterfaceC949240aoE {
    public final String LIZ;
    public final EnumC947600ala LIZIZ;
    public final InterfaceC947660alg LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C949150ao5)) {
            return false;
        }
        C949150ao5 c949150ao5 = (C949150ao5) obj;
        return Intrinsics.LJFF(this.LIZ, c949150ao5.LIZ) && this.LIZIZ == c949150ao5.LIZIZ && Intrinsics.LJFF(this.LIZJ, c949150ao5.LIZJ);
    }

    public final int hashCode() {
        return (((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("UpsertPlayer(playerId=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", role=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", event=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C949150ao5(String str, EnumC947600ala enumC947600ala, InterfaceC947660alg interfaceC947660alg) {
        this.LIZ = str;
        this.LIZIZ = enumC947600ala;
        this.LIZJ = interfaceC947660alg;
    }
}
