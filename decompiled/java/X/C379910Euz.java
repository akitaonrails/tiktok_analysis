package X;

/* JADX INFO: renamed from: X.0Euz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C379910Euz {
    public final EnumC379800Euo LIZ;
    public final boolean LIZIZ = false;
    public final boolean LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C379910Euz)) {
            return false;
        }
        C379910Euz c379910Euz = (C379910Euz) obj;
        return this.LIZ == c379910Euz.LIZ && this.LIZIZ == c379910Euz.LIZIZ && this.LIZJ == c379910Euz.LIZJ;
    }

    public final int hashCode() {
        return (((this.LIZ.hashCode() * 31) + C786410Ut5.Z2(this.LIZIZ)) * 31) + C786410Ut5.Z2(this.LIZJ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AIGCFunctionItemModel(type=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", isInPopup=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", enabled=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C379910Euz(EnumC379800Euo enumC379800Euo, boolean z) {
        this.LIZ = enumC379800Euo;
        this.LIZJ = z;
    }
}
