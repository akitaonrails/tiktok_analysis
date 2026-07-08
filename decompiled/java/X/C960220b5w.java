package X;

/* JADX INFO: renamed from: X.0b5w, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C960220b5w extends AbstractC214838195w {
    public final EnumC959840b5K LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C960220b5w) && this.LIZ == ((C960220b5w) obj).LIZ;
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("OnCelebrationAborted(reason=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C960220b5w(EnumC959840b5K enumC959840b5K) {
        this.LIZ = enumC959840b5K;
    }
}
