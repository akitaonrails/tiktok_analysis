package X;

/* JADX INFO: renamed from: X.0TCi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C742940TCi extends AbstractC742900TCe {
    public final int LIZIZ;
    public final long LIZJ;
    public final String LIZLLL;
    public final Exception LJ;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("StateStartError{code = ");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(",subCode = ");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(",desc =");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(",exception = ");
        sbLIZ.append(this.LJ);
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C742940TCi(int i, long j, Exception exc, String str) {
        super(true);
        this.LIZIZ = i;
        this.LIZJ = j;
        this.LIZLLL = str;
        this.LJ = exc;
    }
}
