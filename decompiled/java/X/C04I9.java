package X;

/* JADX INFO: renamed from: X.04I9, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C04I9 {
    public final int LIZ;
    public final boolean LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C04I9)) {
            return false;
        }
        C04I9 c04i9 = (C04I9) obj;
        return this.LIZ == c04i9.LIZ && this.LIZIZ == c04i9.LIZIZ;
    }

    public C04I9(int i, boolean z) {
        this.LIZ = i;
        this.LIZIZ = z;
    }
}
