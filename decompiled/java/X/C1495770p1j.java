package X;

/* JADX INFO: renamed from: X.0p1j, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1495770p1j {
    public final boolean LIZ;
    public String[] LIZIZ;
    public String[] LIZJ;
    public boolean LIZLLL;

    public C1495770p1j(C1495750p1h c1495750p1h) {
        this.LIZ = c1495750p1h.LIZ;
        this.LIZIZ = c1495750p1h.LIZJ;
        this.LIZJ = c1495750p1h.LIZLLL;
        this.LIZLLL = c1495750p1h.LIZIZ;
    }

    public final void LIZ(String... strArr) {
        if (this.LIZ) {
            if (strArr.length != 0) {
                this.LIZIZ = (String[]) strArr.clone();
                return;
            }
            throw new IllegalArgumentException("At least one cipher suite is required");
        }
        throw new IllegalStateException("no cipher suites for cleartext connections");
    }

    public final void LIZIZ(C1495760p1i... c1495760p1iArr) {
        if (this.LIZ) {
            String[] strArr = new String[c1495760p1iArr.length];
            for (int i = 0; i < c1495760p1iArr.length; i++) {
                strArr[i] = c1495760p1iArr[i].LIZ;
            }
            LIZ(strArr);
            return;
        }
        throw new IllegalStateException("no cipher suites for cleartext connections");
    }

    public final void LIZJ(String... strArr) {
        if (this.LIZ) {
            if (strArr.length != 0) {
                this.LIZJ = (String[]) strArr.clone();
                return;
            }
            throw new IllegalArgumentException("At least one TLS version is required");
        }
        throw new IllegalStateException("no TLS versions for cleartext connections");
    }

    public final void LIZLLL(EnumC1495780p1k... enumC1495780p1kArr) {
        if (this.LIZ) {
            String[] strArr = new String[enumC1495780p1kArr.length];
            for (int i = 0; i < enumC1495780p1kArr.length; i++) {
                strArr[i] = enumC1495780p1kArr[i].LL;
            }
            LIZJ(strArr);
            return;
        }
        throw new IllegalStateException("no TLS versions for cleartext connections");
    }

    public C1495770p1j(boolean z) {
        this.LIZ = z;
    }
}
