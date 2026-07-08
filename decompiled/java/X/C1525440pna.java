package X;

/* JADX INFO: renamed from: X.0pna, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public class C1525440pna {
    public EnumC1525460pnc LIZ;
    public String LIZIZ;

    public final int hashCode() {
        EnumC1525460pnc enumC1525460pnc = this.LIZ;
        int iHashCode = enumC1525460pnc == null ? 0 : enumC1525460pnc.hashCode();
        String str = this.LIZIZ;
        return iHashCode + ((str != null ? str.hashCode() : 0) * 31);
    }

    public final String toString() {
        String strReplace = this.LIZIZ.replace('\n', (char) 182);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Diff(");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(",\"");
        sbLIZ.append(strReplace);
        sbLIZ.append("\")");
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1525440pna.class != obj.getClass()) {
            return false;
        }
        C1525440pna c1525440pna = (C1525440pna) obj;
        if (this.LIZ != c1525440pna.LIZ) {
            return false;
        }
        String str = this.LIZIZ;
        if (str == null) {
            if (c1525440pna.LIZIZ != null) {
                return false;
            }
        } else if (!str.equals(c1525440pna.LIZIZ)) {
            return false;
        }
        return true;
    }

    public C1525440pna(EnumC1525460pnc enumC1525460pnc, String str) {
        this.LIZ = enumC1525460pnc;
        this.LIZIZ = str;
    }
}
