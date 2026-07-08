package X;

/* JADX INFO: renamed from: X.0Ybm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C877600Ybm {
    public final AbstractC877620Ybo LIZ;
    public final long LIZIZ;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("NextCursorData(cursor=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", id=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C877600Ybm(AbstractC877620Ybo abstractC877620Ybo, int i) {
        this((i & 1) != 0 ? new C877610Ybn(Long.MAX_VALUE) : abstractC877620Ybo, (i & 2) == 0 ? 0L : Long.MAX_VALUE);
    }

    public C877600Ybm(AbstractC877620Ybo abstractC877620Ybo, long j) {
        this.LIZ = abstractC877620Ybo;
        this.LIZIZ = j;
    }
}
