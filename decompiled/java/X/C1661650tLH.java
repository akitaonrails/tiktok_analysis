package X;

/* JADX INFO: renamed from: X.0tLH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1661650tLH implements InterfaceC1461640o8g<C1678300tm8> {
    public final int LIZ;
    public final boolean LIZIZ;

    public C1661650tLH() {
        this(0, false);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1661650tLH)) {
            return false;
        }
        C1661650tLH c1661650tLH = (C1661650tLH) obj;
        return this.LIZ == c1661650tLH.LIZ && this.LIZIZ == c1661650tLH.LIZIZ;
    }

    public final int hashCode() {
        return (this.LIZ * 31) + C786410Ut5.Z2(this.LIZIZ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SendToDmItemState(saveLocalPercentage=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", showProgress=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1661650tLH(int i, boolean z) {
        this.LIZ = i;
        this.LIZIZ = z;
    }
}
