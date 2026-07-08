package X;

/* JADX INFO: renamed from: X.0CwP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C329830CwP extends RuntimeException {
    public static final C329820CwO Companion = new Object() { // from class: X.0CwO
    };
    public final int LL;

    public C329830CwP() {
        this(1);
    }

    @Override // java.lang.Throwable
    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CallException(code=[");
        sbLIZ.append(this.LL);
        sbLIZ.append("])");
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final int getCode() {
        return this.LL;
    }

    public int hashCode() {
        return this.LL;
    }

    public C329830CwP(int i) {
        this.LL = i;
    }

    public boolean equals(Object obj) {
        if ((obj instanceof C329830CwP) && this.LL == ((C329830CwP) obj).LL) {
            return true;
        }
        return false;
    }
}
