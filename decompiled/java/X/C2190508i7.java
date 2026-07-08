package X;

import java.io.IOException;

/* JADX INFO: renamed from: X.08i7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2190508i7 extends IOException {
    public C2190508i7() {
    }

    public C2190508i7(String str) {
        super(str);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C2190508i7(String str, String str2) {
        String strLIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        if (str2 == null) {
            strLIZIZ = "";
        } else {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(" (");
            sbLIZ2.append(str2);
            sbLIZ2.append(")");
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
        }
        sbLIZ.append(strLIZIZ);
        super(C2188811AlT.LIZIZ(sbLIZ));
    }
}
