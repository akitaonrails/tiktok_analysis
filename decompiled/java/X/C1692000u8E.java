package X;

/* JADX INFO: renamed from: X.0u8E, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1692000u8E {
    public final EnumC1692020u8G LIZ;
    public final long LIZIZ;
    public final EnumC1692010u8F LIZJ;
    public final boolean LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1692000u8E)) {
            return false;
        }
        C1692000u8E c1692000u8E = (C1692000u8E) obj;
        return this.LIZ == c1692000u8E.LIZ && C1378605aS.LIZJ(this.LIZIZ, c1692000u8E.LIZIZ) && this.LIZJ == c1692000u8E.LIZJ && this.LIZLLL == c1692000u8E.LIZLLL;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SelectionHandleInfo(handle=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", position=");
        sbLIZ.append((Object) C1378605aS.LJIIIIZZ(this.LIZIZ));
        sbLIZ.append(", anchor=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", visible=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final int hashCode() {
        return (((((this.LIZ.hashCode() * 31) + C786410Ut5.Y2(this.LIZIZ)) * 31) + this.LIZJ.hashCode()) * 31) + C786410Ut5.Z2(this.LIZLLL);
    }

    public C1692000u8E(EnumC1692020u8G enumC1692020u8G, long j, EnumC1692010u8F enumC1692010u8F, boolean z) {
        this.LIZ = enumC1692020u8G;
        this.LIZIZ = j;
        this.LIZJ = enumC1692010u8F;
        this.LIZLLL = z;
    }
}
