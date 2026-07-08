package X;

/* JADX INFO: renamed from: X.0pyv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1532470pyv {
    public Integer LIZ;
    public String LIZIZ;
    public StringBuilder LIZJ;

    public final void LIZ(String str) {
        StringBuilder sb = this.LIZJ;
        if (sb != null) {
            sb.append("; ");
        } else {
            sb = new StringBuilder();
        }
        sb.append(str);
        this.LIZJ = sb;
    }

    public final void LIZIZ(int i, String str) {
        Integer numValueOf = this.LIZ;
        if (numValueOf == null) {
            numValueOf = Integer.valueOf(i);
        }
        this.LIZ = numValueOf;
        if (this.LIZIZ != null) {
            LIZ(str);
        } else {
            this.LIZIZ = str;
        }
    }
}
