package X;

/* JADX INFO: renamed from: X.0Ccb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C317550Ccb extends Exception {
    public C317550Ccb() {
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C317550Ccb(String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("JavaScript TypeError: ");
        sbLIZ.append(str);
        super(C2188811AlT.LIZIZ(sbLIZ));
    }

    public C317550Ccb(Throwable th) {
        super(th);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C317550Ccb(String str, Throwable th) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("JavaScript TypeError: ");
        sbLIZ.append(str);
        super(C2188811AlT.LIZIZ(sbLIZ), th);
    }
}
