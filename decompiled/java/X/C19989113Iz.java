package X;

import kotlin.text.a0;

/* JADX INFO: renamed from: X.13Iz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19989113Iz extends C19987913In {
    @Override // X.C19987913In, X.AbstractC19987713Il
    public final byte LJFF() {
        String str = this.LJ;
        int iLJJI = LJJI();
        if (iLJJI >= str.length() || iLJJI == -1) {
            return (byte) 10;
        }
        this.LIZ = iLJJI + 1;
        return C13JC.LIZ(str.charAt(iLJJI));
    }

    @Override // X.AbstractC19987713Il
    public final byte LJIJJLI() {
        String str = this.LJ;
        int iLJJI = LJJI();
        if (iLJJI >= str.length() || iLJJI == -1) {
            return (byte) 10;
        }
        this.LIZ = iLJJI;
        return C13JC.LIZ(str.charAt(iLJJI));
    }

    @Override // X.C19987913In, X.AbstractC19987713Il
    public final int LJJI() {
        int i;
        int iLJJIZ = this.LIZ;
        if (iLJJIZ == -1) {
            return iLJJIZ;
        }
        String str = this.LJ;
        while (iLJJIZ < str.length()) {
            char cCharAt = str.charAt(iLJJIZ);
            if (cCharAt != ' ' && cCharAt != '\n' && cCharAt != '\r' && cCharAt != '\t') {
                if (cCharAt != '/' || (i = iLJJIZ + 1) >= str.length()) {
                    break;
                }
                char cCharAt2 = str.charAt(i);
                if (cCharAt2 == '*') {
                    int iLJJJ = a0.LJJJ(str, "*/", iLJJIZ + 2, false, 4);
                    if (iLJJJ == -1) {
                        this.LIZ = str.length();
                        AbstractC19987713Il.LJIILLIIL(this, "Expected end of the block comment: \"*/\", but had EOF instead", 0, null, 6);
                        throw null;
                    }
                    iLJJIZ = iLJJJ + 2;
                } else {
                    if (cCharAt2 != '/') {
                        break;
                    }
                    iLJJIZ = a0.LJJIZ(str, '\n', iLJJIZ + 2, false, 4);
                    if (iLJJIZ == -1) {
                        iLJJIZ = str.length();
                    }
                }
            }
            iLJJIZ++;
        }
        this.LIZ = iLJJIZ;
        return iLJJIZ;
    }

    @Override // X.C19987913In, X.AbstractC19987713Il
    public final boolean LIZJ() {
        int iLJJI = LJJI();
        if (iLJJI >= this.LJ.length() || iLJJI == -1) {
            return false;
        }
        return AbstractC19987713Il.LJIJI(this.LJ.charAt(iLJJI));
    }

    public C19989113Iz(String str) {
        super(str);
    }

    @Override // X.C19987913In, X.AbstractC19987713Il
    public final void LJII(char c) {
        String str = this.LJ;
        int iLJJI = LJJI();
        if (iLJJI < str.length() && iLJJI != -1) {
            char cCharAt = str.charAt(iLJJI);
            this.LIZ = iLJJI + 1;
            if (cCharAt == c) {
                return;
            }
            LJJIIJ(c);
            throw null;
        }
        this.LIZ = -1;
        LJJIIJ(c);
        throw null;
    }
}
