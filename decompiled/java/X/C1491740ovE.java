package X;

import kotlin.text.a0;

/* JADX INFO: renamed from: X.0ovE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1491740ovE extends AbstractC1491750ovF {
    public final C1491690ov9 LIZ;
    public final String LIZIZ;

    @Override // X.AbstractC1491750ovF
    public final void LIZ(String str) {
        C1491690ov9 c1491690ov9 = this.LIZ;
        if (c1491690ov9 != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(this.LIZIZ);
            sbLIZ.append('.');
            sbLIZ.append(str);
            c1491690ov9.LIZLLL(C2188811AlT.LIZIZ(sbLIZ), Long.valueOf(System.currentTimeMillis()));
        }
    }

    @Override // X.AbstractC1491750ovF
    public final C1491740ovE LIZIZ(String str) {
        String strLIZIZ;
        C1491690ov9 c1491690ov9 = this.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        if (a0.LJJJIL(this.LIZIZ)) {
            strLIZIZ = "";
        } else {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(this.LIZIZ);
            sbLIZ2.append('.');
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
        }
        sbLIZ.append(strLIZIZ);
        sbLIZ.append(str);
        return new C1491740ovE(c1491690ov9, C2188811AlT.LIZIZ(sbLIZ));
    }

    public C1491740ovE(C1491690ov9 c1491690ov9, String str) {
        this.LIZ = c1491690ov9;
        this.LIZIZ = str;
    }

    @Override // X.AbstractC1491750ovF
    public final void LIZJ(long j, String str) {
        C1491690ov9 c1491690ov9 = this.LIZ;
        if (c1491690ov9 != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(this.LIZIZ);
            sbLIZ.append('.');
            sbLIZ.append(str);
            c1491690ov9.LIZLLL(C2188811AlT.LIZIZ(sbLIZ), Long.valueOf(j));
        }
    }
}
