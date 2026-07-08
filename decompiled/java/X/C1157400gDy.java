package X;

/* JADX INFO: renamed from: X.0gDy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1157400gDy implements InterfaceC1157420gE0 {
    public final int LIZ;
    public final EnumC1154770g9j LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1157400gDy)) {
            return false;
        }
        C1157400gDy c1157400gDy = (C1157400gDy) obj;
        return this.LIZ == c1157400gDy.LIZ && this.LIZIZ == c1157400gDy.LIZIZ;
    }

    public final int hashCode() {
        return (this.LIZ * 31) + this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Animated(stringRes=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", scene=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1157400gDy(int i, EnumC1154770g9j enumC1154770g9j) {
        this.LIZ = i;
        this.LIZIZ = enumC1154770g9j;
    }
}
