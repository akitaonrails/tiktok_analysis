package X;

/* JADX INFO: renamed from: X.0Ora, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C632600Ora {
    public final int LIZ;
    public final int LIZIZ = 10;
    public final int LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C632600Ora)) {
            return false;
        }
        C632600Ora c632600Ora = (C632600Ora) obj;
        return this.LIZ == c632600Ora.LIZ && this.LIZIZ == c632600Ora.LIZIZ && this.LIZJ == c632600Ora.LIZJ;
    }

    public C632600Ora(int i, int i2) {
        this.LIZ = i;
        this.LIZJ = i2;
    }
}
