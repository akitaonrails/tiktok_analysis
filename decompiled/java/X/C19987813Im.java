package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.13Im, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public class C19987813Im extends AbstractC19987713Il {
    public final InterfaceC1336170ksJ LJ;
    public final char[] LJFF;
    public int LJI = 128;
    public final C13EK LJII;

    @Override // X.AbstractC19987713Il
    public final String LJIJJ(String str, boolean z) {
        return null;
    }

    @Override // X.AbstractC19987713Il
    public final String LJ() {
        LJII('\"');
        int i = this.LIZ;
        C13EK c13ek = this.LJII;
        int i2 = c13ek.LLILLJJLI;
        int i3 = i;
        while (true) {
            if (i3 >= i2) {
                break;
            }
            if (c13ek.LL[i3] != '\"') {
                i3++;
            } else if (i3 != -1) {
                for (int i4 = i; i4 < i3; i4++) {
                    C13EK c13ek2 = this.LJII;
                    if (c13ek2.LL[i4] == '\\') {
                        return LJIIJ(this.LIZ, i4, c13ek2);
                    }
                }
                this.LIZ = i3 + 1;
                return LJJIFFI(i, i3);
            }
        }
        int iLJJ = LJJ(i);
        if (iLJJ != -1) {
            return LJIIJ(this.LIZ, iLJJ, this.LJII);
        }
        String strLIZIZ = C13JC.LIZIZ((byte) 1);
        int i5 = this.LIZ;
        int i6 = i5 - 1;
        C13EK c13ek3 = this.LJII;
        String strValueOf = (i5 == c13ek3.LLILLJJLI || i6 < 0) ? "EOF" : String.valueOf(c13ek3.LL[i6]);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Expected ");
        sbLIZ.append(strLIZIZ);
        sbLIZ.append(", but had '");
        sbLIZ.append(strValueOf);
        sbLIZ.append("' instead");
        AbstractC19987713Il.LJIILLIIL(this, C2188811AlT.LIZIZ(sbLIZ), i6, null, 4);
        throw null;
    }

    @Override // X.AbstractC19987713Il
    public final void LJIILIIL() {
        int i = this.LJII.LLILLJJLI - this.LIZ;
        if (i > this.LJI) {
            return;
        }
        LJJIIJZLJL(i);
    }

    @Override // X.AbstractC19987713Il
    public int LJJI() {
        int iLJJ;
        char c;
        int i = this.LIZ;
        while (true) {
            iLJJ = LJJ(i);
            if (iLJJ == -1 || !((c = this.LJII.LL[iLJJ]) == ' ' || c == '\n' || c == '\r' || c == '\t')) {
                break;
            }
            i = iLJJ + 1;
        }
        this.LIZ = iLJJ;
        return iLJJ;
    }

    public final void LJJIIZ() {
        C13JO c13jo = C13JO.LIZJ;
        char[] cArr = this.LJFF;
        c13jo.getClass();
        if (cArr.length != 16384) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Inconsistent internal invariant: unexpected array size ");
            sbLIZ.append(cArr.length);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            strLIZIZ.toString();
            throw new IllegalArgumentException(strLIZIZ);
        }
        synchronized (c13jo) {
            try {
                int i = c13jo.LIZIZ;
                if (cArr.length + i < C1225204qo.LIZ) {
                    c13jo.LIZIZ = i + cArr.length;
                    c13jo.LIZ.addLast(cArr);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    @Override // X.AbstractC19987713Il
    public boolean LIZJ() {
        LJIILIIL();
        int i = this.LIZ;
        while (true) {
            int iLJJ = LJJ(i);
            if (iLJJ == -1) {
                this.LIZ = iLJJ;
                return false;
            }
            char c = this.LJII.LL[iLJJ];
            if (c != ' ' && c != '\n' && c != '\r' && c != '\t') {
                this.LIZ = iLJJ;
                return AbstractC19987713Il.LJIJI(c);
            }
            i = iLJJ + 1;
        }
    }

    @Override // X.AbstractC19987713Il
    public byte LJFF() {
        byte bLIZ;
        LJIILIIL();
        C13EK c13ek = this.LJII;
        int i = this.LIZ;
        do {
            int iLJJ = LJJ(i);
            if (iLJJ == -1) {
                this.LIZ = iLJJ;
                return (byte) 10;
            }
            i = iLJJ + 1;
            bLIZ = C13JC.LIZ(c13ek.LL[iLJJ]);
        } while (bLIZ == 3);
        this.LIZ = i;
        return bLIZ;
    }

    @Override // X.AbstractC19987713Il
    public final /* bridge */ /* synthetic */ CharSequence LJIJ() {
        return this.LJII;
    }

    @Override // X.AbstractC19987713Il
    public void LJII(char c) {
        LJIILIIL();
        C13EK c13ek = this.LJII;
        int i = this.LIZ;
        while (true) {
            int iLJJ = LJJ(i);
            if (iLJJ != -1) {
                i = iLJJ + 1;
                char c2 = c13ek.LL[iLJJ];
                if (c2 != ' ' && c2 != '\n' && c2 != '\r' && c2 != '\t') {
                    this.LIZ = i;
                    if (c2 == c) {
                        return;
                    }
                    LJJIIJ(c);
                    throw null;
                }
            } else {
                this.LIZ = iLJJ;
                LJJIIJ(c);
                throw null;
            }
        }
    }

    @Override // X.AbstractC19987713Il
    public final int LJJ(int i) {
        if (i < this.LJII.LLILLJJLI) {
            return i;
        }
        this.LIZ = i;
        LJIILIIL();
        if (this.LIZ == 0 && this.LJII.length() != 0) {
            return 0;
        }
        return -1;
    }

    public final void LJJIIJZLJL(int i) {
        char[] cArr = this.LJII.LL;
        if (i != 0) {
            int i2 = this.LIZ;
            System.arraycopy(cArr, i2, cArr, 0, (i2 + i) - i2);
        }
        int i3 = this.LJII.LLILLJJLI;
        while (true) {
            if (i == i3) {
                break;
            }
            int iLIZ = this.LJ.LIZ(cArr, i, i3 - i);
            if (iLIZ == -1) {
                C13EK c13ek = this.LJII;
                c13ek.LLILLJJLI = Math.min(c13ek.LL.length, i);
                this.LJI = -1;
                break;
            }
            i += iLIZ;
        }
        this.LIZ = 0;
    }

    public C19987813Im(C1336140ksG c1336140ksG, char[] cArr) {
        this.LJ = c1336140ksG;
        this.LJFF = cArr;
        this.LJII = new C13EK(cArr);
        LJJIIJZLJL(0);
    }

    @Override // X.AbstractC19987713Il
    public final void LIZIZ(int i, int i2) {
        this.LIZLLL.append(this.LJII.LL, i, i2 - i);
    }

    @Override // X.AbstractC19987713Il
    public final String LJJIFFI(int i, int i2) {
        C13EK c13ek = this.LJII;
        char[] cArr = c13ek.LL;
        int iMin = Math.min(i2, c13ek.LLILLJJLI);
        C19973713Db c19973713Db = AbstractC19974313Dh.LL;
        int length = cArr.length;
        c19973713Db.getClass();
        C19973713Db.LIZ(i, iMin, length);
        return new String(cArr, i, iMin - i);
    }
}
