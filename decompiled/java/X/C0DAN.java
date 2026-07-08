package X;

/* JADX INFO: renamed from: X.0DAN, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0DAN {
    public final EnumC334490D9j LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0DAN) && this.LIZ == ((C0DAN) obj).LIZ;
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CheckoutBlock(reason=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0DAN(EnumC334490D9j enumC334490D9j) {
        this.LIZ = enumC334490D9j;
    }
}
