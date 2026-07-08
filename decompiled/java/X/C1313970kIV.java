package X;

import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.0kIV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public class C1313970kIV {
    public final String LIZ;

    public C1313970kIV() {
        throw null;
    }

    public C1314650kJb LIZ(AbstractC1317090kNX abstractC1317090kNX) {
        return null;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(e3.e);
        sbLIZ.append(getClass().getSimpleName());
        sbLIZ.append(" - ");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(e3.f);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1313970kIV(String str) {
        this.LIZ = str;
    }

    public AbstractC1313520kHm LIZIZ(AbstractC1317090kNX abstractC1317090kNX) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this.LIZ);
        sbLIZ.append(" is a virtual node, do not have real ui!");
        throw new RuntimeException(C2188811AlT.LIZIZ(sbLIZ));
    }
}
