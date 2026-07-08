package X;

/* JADX INFO: renamed from: X.0FNp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C389150FNp {
    public C0FOA LIZ;
    public final int LIZIZ;

    public C389150FNp() {
        this(null, 3, 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C389150FNp)) {
            return false;
        }
        C389150FNp c389150FNp = (C389150FNp) obj;
        return this.LIZ == c389150FNp.LIZ && this.LIZIZ == c389150FNp.LIZIZ;
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + this.LIZIZ;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LyricEffectItemStatus(state=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", progress=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C389150FNp(C0FOA c0foa, int i) {
        this.LIZ = c0foa;
        this.LIZIZ = i;
    }

    public /* synthetic */ C389150FNp(C0FOA c0foa, int i, int i2) {
        this((i & 1) != 0 ? C0FOA.IDEL : c0foa, 0);
    }
}
