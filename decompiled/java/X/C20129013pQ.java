package X;

/* JADX INFO: renamed from: X.13pQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20129013pQ extends Exception {
    public C20129013pQ() {
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C20129013pQ(String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("JavaScript RangeError: ");
        sbLIZ.append(str);
        super(C2188811AlT.LIZIZ(sbLIZ));
    }

    public C20129013pQ(Throwable th) {
        super(th);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C20129013pQ(String str, Throwable th) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("JavaScript RangeError: ");
        sbLIZ.append(str);
        super(C2188811AlT.LIZIZ(sbLIZ), th);
    }
}
