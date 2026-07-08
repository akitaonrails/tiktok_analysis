package X;

/* JADX INFO: renamed from: X.0Cfi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C319480Cfi {
    public final int LIZ;
    public final EnumC948930anj LIZIZ;
    public final long LIZJ;

    public C319480Cfi() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C319480Cfi)) {
            return false;
        }
        C319480Cfi c319480Cfi = (C319480Cfi) obj;
        return this.LIZ == c319480Cfi.LIZ && this.LIZIZ == c319480Cfi.LIZIZ && this.LIZJ == c319480Cfi.LIZJ;
    }

    public /* synthetic */ C319480Cfi(int i) {
        this(0, EnumC948930anj.IDLE, 0L);
    }

    public C319480Cfi(int i, EnumC948930anj enumC948930anj, long j) {
        this.LIZ = i;
        this.LIZIZ = enumC948930anj;
        this.LIZJ = j;
    }
}
