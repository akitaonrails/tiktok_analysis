package X;

/* JADX INFO: renamed from: X.1Anm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public class C2190241Anm extends Exception {
    public final String LL;

    public String getMissingField() {
        return this.LL;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C2190241Anm(String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Missing mandatory configuration field: ");
        sbLIZ.append(str);
        super(C2188811AlT.LIZIZ(sbLIZ));
        this.LL = str;
    }
}
