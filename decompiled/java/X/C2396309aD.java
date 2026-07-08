package X;

/* JADX INFO: renamed from: X.09aD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2396309aD extends IndexOutOfBoundsException {
    public C2396309aD(String str) {
        super(str);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C2396309aD(int i, int i2) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Index ");
        sbLIZ.append(i);
        sbLIZ.append(" requested, with a size of ");
        sbLIZ.append(i2);
        super(C2188811AlT.LIZIZ(sbLIZ));
    }
}
