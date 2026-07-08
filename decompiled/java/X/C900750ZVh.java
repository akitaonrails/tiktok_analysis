package X;

/* JADX INFO: renamed from: X.0ZVh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C900750ZVh implements InterfaceC900840ZVq {
    public final C0IBX LIZ;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CTAButton(ctaButtonType=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final int hashCode() {
        return this.LIZ.getType();
    }

    public C900750ZVh(C0IBX c0ibx) {
        this.LIZ = c0ibx;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C900750ZVh) || hashCode() != ((C900750ZVh) obj).hashCode()) {
            return false;
        }
        return true;
    }
}
