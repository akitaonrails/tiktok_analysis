package X;

/* JADX INFO: renamed from: X.0gDz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1157410gDz implements InterfaceC1157420gE0 {
    public final int LIZ;
    public final EnumC1154770g9j LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1157410gDz)) {
            return false;
        }
        C1157410gDz c1157410gDz = (C1157410gDz) obj;
        return this.LIZ == c1157410gDz.LIZ && this.LIZIZ == c1157410gDz.LIZIZ;
    }

    public final int hashCode() {
        return (this.LIZ * 31) + this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("NonAnimated(stringRes=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", scene=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1157410gDz(int i, EnumC1154770g9j enumC1154770g9j) {
        this.LIZ = i;
        this.LIZIZ = enumC1154770g9j;
    }
}
