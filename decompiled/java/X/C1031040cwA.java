package X;

/* JADX INFO: renamed from: X.0cwA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1031040cwA {
    public final int LIZ;
    public final String LIZIZ;
    public final Integer LIZJ;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("errorCode=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", cid=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", brandSafetyValue=");
        sbLIZ.append(this.LIZJ);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C1031040cwA(int i, String str, int i2) {
        this(i, (i2 & 2) != 0 ? null : str, (Integer) null);
    }

    public C1031040cwA(int i, String str, Integer num) {
        this.LIZ = i;
        this.LIZIZ = str;
        this.LIZJ = num;
    }
}
