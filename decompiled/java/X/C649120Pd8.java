package X;

/* JADX INFO: renamed from: X.0Pd8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C649120Pd8 {
    public final String LIZ;
    public final C1537720q7O LIZIZ;
    public EnumC647870Pb7 LIZJ;
    public final boolean LIZLLL = false;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SparkLiteCache(name=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", kitView=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", preloadStatus=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", prerender=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C649120Pd8(String str, C1537720q7O c1537720q7O, EnumC647870Pb7 enumC647870Pb7) {
        this.LIZ = str;
        this.LIZIZ = c1537720q7O;
        this.LIZJ = enumC647870Pb7;
    }
}
