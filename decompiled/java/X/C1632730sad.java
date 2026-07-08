package X;

/* JADX INFO: renamed from: X.0sad, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1632730sad<KEY, RESULT, INFO> {
    public final KEY LIZ;
    public final RESULT LIZIZ;
    public final boolean LIZJ;
    public final INFO LIZLLL;
    public final Long LJ;
    public final Exception LJFF;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ExecuteResult(key=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", result=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", cached=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", info=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", duration=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", exception=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1632730sad(KEY key, RESULT result, boolean z, INFO info, Long l, Exception exc) {
        this.LIZ = key;
        this.LIZIZ = result;
        this.LIZJ = z;
        this.LIZLLL = info;
        this.LJ = l;
        this.LJFF = exc;
    }
}
