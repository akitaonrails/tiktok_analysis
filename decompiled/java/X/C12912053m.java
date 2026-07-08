package X;

/* JADX INFO: renamed from: X.053m, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C12912053m implements C053Z {
    public final int LIZ;
    public final EnumC12930054e LIZIZ = EnumC12930054e.MAX_TIMES;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C12912053m) && this.LIZ == ((C12912053m) obj).LIZ;
    }

    public final int hashCode() {
        return this.LIZ;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MaxTimesRuleConfig(times=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.C053Z
    public final String getTag() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this.LIZIZ.getTag());
        sbLIZ.append('_');
        sbLIZ.append(this.LIZ);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C12912053m(int i) {
        this.LIZ = i;
    }
}
