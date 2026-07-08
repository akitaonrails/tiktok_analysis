package X;

/* JADX INFO: renamed from: X.0N9j, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C589290N9j extends Exception {
    public final int LL;

    public final int getErrorCode() {
        return this.LL;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C589290N9j(int i, String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Persisted streaming error [");
        sbLIZ.append(i);
        sbLIZ.append("]: ");
        sbLIZ.append(str);
        super(C2188811AlT.LIZIZ(sbLIZ));
        this.LL = i;
    }
}
