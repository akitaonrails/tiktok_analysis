package X;

/* JADX INFO: renamed from: X.09kO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2459409kO extends AbstractC2459509kP {
    public final int LIZ;
    public final long LIZIZ;

    public C2459409kO(int i, long j) {
        this.LIZ = i;
        this.LIZIZ = j;
    }

    @Override // X.AbstractC2459509kP
    public final int LIZ() {
        return this.LIZ;
    }

    @Override // X.AbstractC2459509kP
    public final long LIZIZ() {
        return this.LIZIZ;
    }

    public final int hashCode() {
        int i = this.LIZ ^ 1000003;
        long j = this.LIZIZ;
        return (i * 1000003) ^ ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        return "EventRecord{eventType=" + this.LIZ + ", eventTimestamp=" + this.LIZIZ + "}";
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC2459509kP) {
            AbstractC2459509kP abstractC2459509kP = (AbstractC2459509kP) obj;
            if (this.LIZ == abstractC2459509kP.LIZ() && this.LIZIZ == abstractC2459509kP.LIZIZ()) {
                return true;
            }
        }
        return false;
    }
}
