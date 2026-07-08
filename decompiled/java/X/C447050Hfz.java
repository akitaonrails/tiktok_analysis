package X;

/* JADX INFO: renamed from: X.0Hfz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C447050Hfz extends C343950De5 {
    public final EnumC447020Hfw LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C447050Hfz) && this.LIZ == ((C447050Hfz) obj).LIZ;
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CategoryIconReason(code=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C447050Hfz(EnumC447020Hfw enumC447020Hfw) {
        this.LIZ = enumC447020Hfw;
    }
}
