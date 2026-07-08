package X;

/* JADX INFO: renamed from: X.0PvN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C660430PvN implements InterfaceC657170Pq7, InterfaceC660760Pvu {
    public final boolean LIZ = true;
    public final boolean LIZIZ = true;
    public final EnumC660440PvO LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C660430PvN)) {
            return false;
        }
        C660430PvN c660430PvN = (C660430PvN) obj;
        return this.LIZ == c660430PvN.LIZ && this.LIZIZ == c660430PvN.LIZIZ && this.LIZJ == c660430PvN.LIZJ;
    }

    public final int hashCode() {
        return (((C786410Ut5.Z2(this.LIZ) * 31) + C786410Ut5.Z2(this.LIZIZ)) * 31) + this.LIZJ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BigCommentAnchorData(hideLabel=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", hideCLAArea=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", theme=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC660760Pvu
    public final boolean LIZ() {
        return this.LIZIZ;
    }

    @Override // X.InterfaceC657170Pq7
    public final boolean LIZIZ() {
        return this.LIZ;
    }

    public C660430PvN(EnumC660440PvO enumC660440PvO) {
        this.LIZJ = enumC660440PvO;
    }
}
