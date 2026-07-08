package X;

/* JADX INFO: renamed from: X.13yX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20185513yX {
    public long LIZ;
    public long LIZIZ;
    public long LIZJ;
    public EnumC1335310kqv LIZLLL;

    public C20185513yX() {
        this(null, 15);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C20185513yX)) {
            return false;
        }
        C20185513yX c20185513yX = (C20185513yX) obj;
        return this.LIZ == c20185513yX.LIZ && this.LIZIZ == c20185513yX.LIZIZ && this.LIZJ == c20185513yX.LIZJ && this.LIZLLL == c20185513yX.LIZLLL;
    }

    public C20185513yX(EnumC1335310kqv enumC1335310kqv, int i) {
        long j;
        long j2;
        if ((i & 1) != 0) {
            j = -1;
        } else {
            j = 0;
        }
        if ((i & 2) != 0) {
            j2 = 1;
        } else {
            j2 = 0;
        }
        long j3 = (i & 4) != 0 ? 1L : 0L;
        enumC1335310kqv = (i & 8) != 0 ? EnumC1335310kqv.COMMON : enumC1335310kqv;
        this.LIZ = j;
        this.LIZIZ = j2;
        this.LIZJ = j3;
        this.LIZLLL = enumC1335310kqv;
    }
}
