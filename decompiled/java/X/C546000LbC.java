package X;

/* JADX INFO: renamed from: X.0LbC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C546000LbC {
    public final EnumC546020LbE LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C546000LbC) && this.LIZ == ((C546000LbC) obj).LIZ;
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LocalSnapshot(localState=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C546000LbC(EnumC546020LbE enumC546020LbE) {
        this.LIZ = enumC546020LbE;
    }
}
