package X;

/* JADX INFO: renamed from: X.00gr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C144300gr {
    public final String LIZ;
    public final String LIZIZ;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PrefetchData(type=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", url=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C144300gr() {
        this("", "");
    }

    public C144300gr(String str, String str2) {
        this.LIZ = str;
        this.LIZIZ = str2;
    }
}
