package X;

/* JADX INFO: renamed from: X.0opn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1488370opn extends RuntimeException {
    public static final C1488380opo Companion = new Object() { // from class: X.0opo
    };
    public final String LL;

    public final String getCode() {
        return this.LL;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C1488370opn(String str, String str2) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append(':');
        sbLIZ.append(str2);
        super(C2188811AlT.LIZIZ(sbLIZ));
        this.LL = str;
    }
}
