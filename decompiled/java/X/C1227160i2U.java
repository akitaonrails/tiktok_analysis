package X;

/* JADX INFO: renamed from: X.0i2U, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1227160i2U {
    public final EnumC1227200i2Y LIZ;
    public final EnumC1227180i2W LIZIZ;

    public C1227160i2U() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1227160i2U)) {
            return false;
        }
        C1227160i2U c1227160i2U = (C1227160i2U) obj;
        return this.LIZ == c1227160i2U.LIZ && this.LIZIZ == c1227160i2U.LIZIZ;
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("UserCountKey(relation=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", source=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C1227160i2U(int i) {
        this(EnumC1227200i2Y.OTHER, EnumC1227180i2W.NORMAL);
    }

    public C1227160i2U(EnumC1227200i2Y enumC1227200i2Y, EnumC1227180i2W enumC1227180i2W) {
        this.LIZ = enumC1227200i2Y;
        this.LIZIZ = enumC1227180i2W;
    }
}
