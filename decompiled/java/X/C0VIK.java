package X;

import android.os.Build;

/* JADX INFO: renamed from: X.0VIK, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0VIK {
    public static final C0VIK LJIIIIZZ = new C0VIK(new C0VIQ());
    public EnumC794930VGh LIZ;
    public boolean LIZIZ;
    public boolean LIZJ;
    public boolean LIZLLL;
    public boolean LJ;
    public long LJFF;
    public long LJI;
    public C0VIV LJII;

    public final int hashCode() {
        int iHashCode = ((((((((this.LIZ.hashCode() * 31) + (this.LIZIZ ? 1 : 0)) * 31) + (this.LIZJ ? 1 : 0)) * 31) + (this.LIZLLL ? 1 : 0)) * 31) + (this.LJ ? 1 : 0)) * 31;
        long j = this.LJFF;
        int i = (iHashCode + ((int) (j ^ (j >>> 32)))) * 31;
        long j2 = this.LJI;
        return ((i + ((int) (j2 ^ (j2 >>> 32)))) * 31) + this.LJII.hashCode();
    }

    public C0VIK() {
        this.LIZ = EnumC794930VGh.NOT_REQUIRED;
        this.LJFF = -1L;
        this.LJI = -1L;
        this.LJII = new C0VIV();
    }

    public C0VIK(C0VIQ c0viq) {
        this.LIZ = EnumC794930VGh.NOT_REQUIRED;
        this.LJFF = -1L;
        this.LJI = -1L;
        this.LJII = new C0VIV();
        this.LIZIZ = c0viq.LIZ;
        this.LIZJ = false;
        this.LIZ = c0viq.LIZIZ;
        this.LIZLLL = c0viq.LIZJ;
        this.LJ = false;
        if (Build.VERSION.SDK_INT >= 24) {
            this.LJII = c0viq.LJFF;
            this.LJFF = c0viq.LIZLLL;
            this.LJI = c0viq.LJ;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0VIK.class != obj.getClass()) {
            return false;
        }
        C0VIK c0vik = (C0VIK) obj;
        if (this.LIZIZ != c0vik.LIZIZ || this.LIZJ != c0vik.LIZJ || this.LIZLLL != c0vik.LIZLLL || this.LJ != c0vik.LJ || this.LJFF != c0vik.LJFF || this.LJI != c0vik.LJI || this.LIZ != c0vik.LIZ) {
            return false;
        }
        return this.LJII.equals(c0vik.LJII);
    }

    public C0VIK(C0VIK c0vik) {
        this.LIZ = EnumC794930VGh.NOT_REQUIRED;
        this.LJFF = -1L;
        this.LJI = -1L;
        this.LJII = new C0VIV();
        this.LIZIZ = c0vik.LIZIZ;
        this.LIZJ = c0vik.LIZJ;
        this.LIZ = c0vik.LIZ;
        this.LIZLLL = c0vik.LIZLLL;
        this.LJ = c0vik.LJ;
        this.LJII = c0vik.LJII;
    }
}
