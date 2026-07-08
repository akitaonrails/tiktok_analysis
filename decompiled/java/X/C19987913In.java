package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.13In, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public class C19987913In extends AbstractC19987713Il {
    public final String LJ;

    @Override // X.AbstractC19987713Il
    public boolean LIZJ() {
        int i = this.LIZ;
        if (i == -1) {
            return false;
        }
        String str = this.LJ;
        while (i < str.length()) {
            char cCharAt = str.charAt(i);
            if (cCharAt != ' ' && cCharAt != '\n' && cCharAt != '\r' && cCharAt != '\t') {
                this.LIZ = i;
                return AbstractC19987713Il.LJIJI(cCharAt);
            }
            i++;
        }
        this.LIZ = i;
        return false;
    }

    @Override // X.AbstractC19987713Il
    public final String LJ() {
        LJII('\"');
        int i = this.LIZ;
        int iLJJIZ = a0.LJJIZ(this.LJ, '\"', i, false, 4);
        if (iLJJIZ != -1) {
            for (int i2 = i; i2 < iLJJIZ; i2++) {
                if (this.LJ.charAt(i2) == '\\') {
                    return LJIIJ(this.LIZ, i2, this.LJ);
                }
            }
            this.LIZ = iLJJIZ + 1;
            return this.LJ.substring(i, iLJJIZ);
        }
        LJIIJJI();
        String strLIZIZ = C13JC.LIZIZ((byte) 1);
        int i3 = this.LIZ;
        String strValueOf = (i3 == this.LJ.length() || i3 < 0) ? "EOF" : String.valueOf(this.LJ.charAt(i3));
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Expected ");
        sbLIZ.append(strLIZIZ);
        sbLIZ.append(", but had '");
        sbLIZ.append(strValueOf);
        sbLIZ.append("' instead");
        AbstractC19987713Il.LJIILLIIL(this, C2188811AlT.LIZIZ(sbLIZ), i3, null, 4);
        throw null;
    }

    @Override // X.AbstractC19987713Il
    public byte LJFF() {
        String str = this.LJ;
        int i = this.LIZ;
        while (i != -1 && i < str.length()) {
            int i2 = i + 1;
            char cCharAt = str.charAt(i);
            if (cCharAt != ' ' && cCharAt != '\n' && cCharAt != '\r' && cCharAt != '\t') {
                this.LIZ = i2;
                return C13JC.LIZ(cCharAt);
            }
            i = i2;
        }
        this.LIZ = str.length();
        return (byte) 10;
    }

    @Override // X.AbstractC19987713Il
    public int LJJI() {
        char cCharAt;
        int i = this.LIZ;
        if (i == -1) {
            return i;
        }
        String str = this.LJ;
        while (i < str.length() && ((cCharAt = str.charAt(i)) == ' ' || cCharAt == '\n' || cCharAt == '\r' || cCharAt == '\t')) {
            i++;
        }
        this.LIZ = i;
        return i;
    }

    @Override // X.AbstractC19987713Il
    public final /* bridge */ /* synthetic */ CharSequence LJIJ() {
        return this.LJ;
    }

    public C19987913In(String str) {
        this.LJ = str;
    }

    @Override // X.AbstractC19987713Il
    public void LJII(char c) {
        int i = this.LIZ;
        if (i != -1) {
            String str = this.LJ;
            while (i < str.length()) {
                int i2 = i + 1;
                char cCharAt = str.charAt(i);
                if (cCharAt != ' ' && cCharAt != '\n' && cCharAt != '\r' && cCharAt != '\t') {
                    this.LIZ = i2;
                    if (cCharAt == c) {
                        return;
                    }
                    LJJIIJ(c);
                    throw null;
                }
                i = i2;
            }
            this.LIZ = -1;
            LJJIIJ(c);
            throw null;
        }
        LJJIIJ(c);
        throw null;
    }

    @Override // X.AbstractC19987713Il
    public final int LJJ(int i) {
        if (i >= this.LJ.length()) {
            return -1;
        }
        return i;
    }

    @Override // X.AbstractC19987713Il
    public final String LJIJJ(String str, boolean z) {
        int i = this.LIZ;
        try {
            if (LJFF() == 6 && Intrinsics.LJFF(LJIL(z), str)) {
                this.LIZJ = null;
                if (LJFF() == 5) {
                    String strLJIL = LJIL(z);
                    this.LIZ = i;
                    this.LIZJ = null;
                    return strLJIL;
                }
            }
            this.LIZ = i;
            this.LIZJ = null;
            return null;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.LIZ = i;
            this.LIZJ = null;
            throw th;
        }
    }
}
