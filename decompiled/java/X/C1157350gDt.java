package X;

/* JADX INFO: renamed from: X.0gDt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1157350gDt {
    public final EnumC1342430l2P LIZ;
    public final EnumC1342610l2h LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1157350gDt)) {
            return false;
        }
        C1157350gDt c1157350gDt = (C1157350gDt) obj;
        return this.LIZ == c1157350gDt.LIZ && this.LIZIZ == c1157350gDt.LIZIZ;
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode();
    }

    public C1157350gDt(EnumC1342430l2P enumC1342430l2P, EnumC1342610l2h enumC1342610l2h) {
        this.LIZ = enumC1342430l2P;
        this.LIZIZ = enumC1342610l2h;
    }
}
