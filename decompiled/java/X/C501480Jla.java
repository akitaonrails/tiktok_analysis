package X;

/* JADX INFO: renamed from: X.0Jla, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C501480Jla extends C501490Jlb {
    public C501480Jla() {
        super(-1);
    }

    @Override // X.C501490Jlb, X.C501520Jle, java.lang.Throwable
    public String getMessage() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(" TYPE = EmptyResponseException ");
        sbLIZ.append(super.getMessage());
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
