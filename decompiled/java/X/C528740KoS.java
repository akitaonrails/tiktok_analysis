package X;

/* JADX INFO: renamed from: X.0KoS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C528740KoS {
    public final int LIZ;
    public final int LIZIZ;
    public final int LIZJ;

    public C528740KoS() {
        this(-1, -1, -1);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C528740KoS)) {
            return false;
        }
        C528740KoS c528740KoS = (C528740KoS) obj;
        return this.LIZ == c528740KoS.LIZ && this.LIZIZ == c528740KoS.LIZIZ && this.LIZJ == c528740KoS.LIZJ;
    }

    public C528740KoS(int i, int i2, int i3) {
        this.LIZ = i;
        this.LIZIZ = i2;
        this.LIZJ = i3;
    }
}
