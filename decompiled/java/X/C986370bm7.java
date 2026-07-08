package X;

/* JADX INFO: renamed from: X.0bm7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C986370bm7 extends AbstractC986390bm9 {
    public final EnumC986350bm5 LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C986370bm7) && this.LIZ == ((C986370bm7) obj).LIZ;
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Fail(reason=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C986370bm7(EnumC986350bm5 enumC986350bm5) {
        this.LIZ = enumC986350bm5;
    }
}
