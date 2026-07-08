package X;

import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0cCR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1002690cCR {
    public Integer LIZ;
    public Integer LIZIZ;
    public EnumC993930byJ LIZJ = EnumC993930byJ.DEFAULT;
    public EnumC993920byI LIZLLL = EnumC993920byI.DEFAULT;

    public final Integer LIZ(C19EG c19eg) {
        Integer numLIZIZ = this.LIZIZ;
        if (numLIZIZ == null) {
            numLIZIZ = LIZIZ(c19eg);
        }
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("getBgColor bgColorInt:");
        sbLIZ.append(numLIZIZ);
        C2188811AlT.LIZIZ(sbLIZ);
        return numLIZIZ;
    }

    public final Integer LIZIZ(C19EG c19eg) {
        Integer numLIZJ;
        if (this.LIZ == null) {
            if (c19eg != null) {
                numLIZJ = C1308910kAL.LIZJ(R.attr.zm, c19eg);
            } else {
                numLIZJ = null;
            }
            this.LIZ = numLIZJ;
        }
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("getDefaultBgColor bgColorInt:");
        sbLIZ.append(this.LIZ);
        C2188811AlT.LIZIZ(sbLIZ);
        return this.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0086 A[PHI: r3
      0x0086: PHI (r3v1 java.lang.String) = (r3v0 java.lang.String), (r3v3 java.lang.String) binds: [B:41:0x0083, B:33:0x0054] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00b7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZJ(X.C19EG r7, java.lang.String r8) {
        /*
            Method dump skipped, instruction units count: 231
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1002690cCR.LIZJ(X.19EG, java.lang.String):void");
    }
}
