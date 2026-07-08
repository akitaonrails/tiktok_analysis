package X;

/* JADX INFO: renamed from: X.0Jlb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public class C501490Jlb extends C501520Jle {
    @Override // X.C501520Jle, java.lang.Throwable
    public String getMessage() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(" TYPE = ApiLocalException ");
        sbLIZ.append(super.getMessage());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C501490Jlb(int i) {
        super(i);
    }

    public C501490Jlb(int i, Throwable th) {
        super(i, th);
    }
}
