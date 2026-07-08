package X;

/* JADX INFO: renamed from: X.03QB, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public abstract class C03QB {
    public final String LIZ;

    public final String LIZ() {
        if (!(this instanceof C03QC)) {
            return this.LIZ;
        }
        C03QC c03qc = (C03QC) this;
        if (!C123100dR.LIZ(c03qc.LIZJ)) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(this.LIZ);
            sbLIZ.append('_');
            sbLIZ.append(c03qc.LIZIZ);
            return C2188811AlT.LIZIZ(sbLIZ);
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(this.LIZ);
        sbLIZ2.append('_');
        sbLIZ2.append(c03qc.LIZIZ);
        sbLIZ2.append('_');
        sbLIZ2.append(c03qc.LIZJ);
        return C2188811AlT.LIZIZ(sbLIZ2);
    }

    public C03QB(String str) {
        this.LIZ = str;
    }
}
