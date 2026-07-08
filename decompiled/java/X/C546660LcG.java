package X;

/* JADX INFO: renamed from: X.0LcG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C546660LcG implements C0LUH {
    public final EnumC546990Lcn LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C546660LcG) && this.LIZ == ((C546660LcG) obj).LIZ;
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AutoLifecycleConfig(handleType=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C546660LcG(EnumC546990Lcn enumC546990Lcn) {
        this.LIZ = enumC546990Lcn;
    }
}
