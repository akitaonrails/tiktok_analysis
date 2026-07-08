package X;

/* JADX INFO: renamed from: X.163j, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C207129163j implements C164H {
    public final boolean LIZ;
    public final EnumC715680S5m LIZIZ;
    public final boolean LIZJ;
    public String LIZLLL;
    public String LJ;
    public String LJFF;
    public boolean LJI;

    public final C903380ZcG LIZ() {
        boolean z = this.LJI;
        return new C903380ZcG(this.LIZLLL, this.LJ, this.LJFF, this.LIZJ, z);
    }

    public C207129163j(boolean z, EnumC715680S5m enumC715680S5m) {
        boolean z2;
        this.LIZ = z;
        this.LIZIZ = enumC715680S5m;
        if (enumC715680S5m == EnumC715680S5m.OVERRIDE_TO_TRANSLATED) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.LIZJ = z2;
        this.LIZLLL = "";
    }
}
