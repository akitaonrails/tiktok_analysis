package X;

/* JADX INFO: renamed from: X.0ZJ8, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0ZJ8 {
    public final String LIZ;
    public final boolean LIZIZ;
    public final Integer LIZJ;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ActivityStatusAccuracyInfo(toUid=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", isActive=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", rankIdx=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0ZJ8(Integer num, String str, boolean z) {
        this.LIZ = str;
        this.LIZIZ = z;
        this.LIZJ = num;
    }
}
