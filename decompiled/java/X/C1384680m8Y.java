package X;

/* JADX INFO: renamed from: X.0m8Y, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1384680m8Y {
    public final EnumC1384370m83 LIZ;
    public final boolean LIZIZ;
    public final long LIZJ;
    public final float LIZLLL;

    public C1384680m8Y() {
        this(null, false, 0L, 0.0f, 31);
    }

    public C1384680m8Y(EnumC1384370m83 enumC1384370m83, boolean z, long j, float f, int i) {
        enumC1384370m83 = (i & 1) != 0 ? EnumC1384370m83.NONE : enumC1384370m83;
        z = (i & 4) != 0 ? false : z;
        j = (i & 8) != 0 ? 0L : j;
        f = (i & 16) != 0 ? 1.0f : f;
        this.LIZ = enumC1384370m83;
        this.LIZIZ = z;
        this.LIZJ = j;
        this.LIZLLL = f;
    }
}
