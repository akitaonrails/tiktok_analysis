package X;

/* JADX INFO: renamed from: X.0Psk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C658800Psk {
    public final boolean LIZ;
    public final int LIZIZ;
    public final Boolean LIZJ;
    public final boolean LIZLLL;

    public C658800Psk() {
        this(false, 0, null, 15);
    }

    public C658800Psk(boolean z, int i, Boolean bool, int i2) {
        z = (i2 & 1) != 0 ? false : z;
        i = (i2 & 2) != 0 ? 0 : i;
        bool = (i2 & 4) != 0 ? null : bool;
        boolean z2 = (i2 & 8) != 0;
        this.LIZ = z;
        this.LIZIZ = i;
        this.LIZJ = bool;
        this.LIZLLL = z2;
    }
}
