package X;

import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.07nX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1969307nX extends RuntimeException {
    public final int LL;

    public int getCode() {
        return this.LL;
    }

    public C1969307nX(String str, Throwable th) {
        super(str, th);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C1969307nX(int i, String str, Throwable th) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append(":[code:");
        sbLIZ.append(i);
        sbLIZ.append(e3.f);
        super(C2188811AlT.LIZIZ(sbLIZ), th);
        this.LL = i;
    }
}
