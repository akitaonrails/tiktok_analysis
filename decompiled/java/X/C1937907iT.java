package X;

/* JADX INFO: renamed from: X.07iT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1937907iT extends IllegalArgumentException {
    public final String LL;

    @Override // java.lang.Throwable
    public String getMessage() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("cannot parse schema modifier settings, missing arg: ");
        sbLIZ.append(this.LL);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1937907iT(String str) {
        this.LL = str;
    }
}
