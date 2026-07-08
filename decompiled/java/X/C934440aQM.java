package X;

/* JADX INFO: renamed from: X.0aQM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C934440aQM {
    public final Boolean LIZ = null;
    public final Boolean LIZIZ = null;
    public boolean LIZJ;
    public boolean LIZLLL;

    public final int LIZ() {
        Boolean bool = this.LIZ;
        if (bool == null || this.LIZIZ == null) {
            return -1;
        }
        if (bool.booleanValue() && this.LIZIZ.booleanValue()) {
            return 3;
        }
        if (!this.LIZ.booleanValue() || this.LIZIZ.booleanValue()) {
            return (!this.LIZIZ.booleanValue() || this.LIZ.booleanValue()) ? 0 : 2;
        }
        return 1;
    }
}
