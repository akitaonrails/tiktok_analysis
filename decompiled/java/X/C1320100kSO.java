package X;

/* JADX INFO: renamed from: X.0kSO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1320100kSO {
    public final String LIZ;
    public final C1320110kSP LIZIZ;
    public C1320110kSP LIZJ;

    public final String toString() {
        StringBuilder sb = new StringBuilder(32);
        sb.append(this.LIZ);
        sb.append('{');
        C1320110kSP c1320110kSP = this.LIZIZ.LIZJ;
        String str = "";
        while (c1320110kSP != null) {
            sb.append(str);
            String str2 = c1320110kSP.LIZ;
            if (str2 != null) {
                sb.append(str2);
                sb.append('=');
            }
            sb.append(c1320110kSP.LIZIZ);
            c1320110kSP = c1320110kSP.LIZJ;
            str = ", ";
        }
        sb.append('}');
        return sb.toString();
    }

    public C1320100kSO(String str) {
        C1320110kSP c1320110kSP = new C1320110kSP();
        this.LIZIZ = c1320110kSP;
        this.LIZJ = c1320110kSP;
        str.getClass();
        this.LIZ = str;
    }

    public final void LIZ(String str, boolean z) {
        LIZIZ(String.valueOf(z), str);
    }

    public final void LIZIZ(Object obj, String str) {
        C1320110kSP c1320110kSP = new C1320110kSP();
        this.LIZJ.LIZJ = c1320110kSP;
        this.LIZJ = c1320110kSP;
        c1320110kSP.LIZIZ = obj;
        c1320110kSP.LIZ = str;
    }
}
