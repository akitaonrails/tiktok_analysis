package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.1B45, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1B45 {
    public static final C1B45 LIZLLL = new C1B45(0, 20000, "Success.");
    public static final C1B45 LJ = new C1B45(-1, 20013, "Cancel.");
    public static final C1B45 LJFF = new C1B45(-1, 22000, "Need to Upgrade TikTok Version.");
    public static final C1B45 LJI = new C1B45(-1, 22001, "Logged in user different than other platform.");
    public static final C1B45 LJII = new C1B45(-1, 22002, "User has no DM Permission.");
    public static final C1B45 LJIIIIZZ = new C1B45(-1, 22003, "Share to DM failed.");
    public static final C1B45 LJIIIZ = new C1B45(-1, 22004, "Missing the required parameter.");
    public static final C1B45 LJIIJ = new C1B45(-1, 22005, "Invalid DM Schema.");
    public static final C1B45 LJIIJJI = new C1B45(-1, 22006, "Copyright Invalid.");
    public final int LIZ;
    public final int LIZIZ;
    public final String LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1B45)) {
            return false;
        }
        C1B45 c1b45 = (C1B45) obj;
        return this.LIZ == c1b45.LIZ && this.LIZIZ == c1b45.LIZIZ && Intrinsics.LJFF(this.LIZJ, c1b45.LIZJ);
    }

    public final C1B4F LIZ() {
        return new C1B4F(this.LIZ, this.LIZIZ, this.LIZJ);
    }

    public C1B45(int i, int i2, String str) {
        this.LIZ = i;
        this.LIZIZ = i2;
        this.LIZJ = str;
    }
}
