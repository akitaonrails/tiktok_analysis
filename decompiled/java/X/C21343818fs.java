package X;

import java.util.ArrayList;

/* JADX INFO: renamed from: X.18fs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21343818fs {
    public final C21343918ft LIZ;
    public final C21328818dS LIZIZ;
    public C21344018fu LIZJ = new C21344018fu(32, "");
    public C21344018fu LIZLLL = new C21344018fu(32, "");
    public final C1489750os1 LJ = new C1489750os1();
    public final ArrayList<Object> LJFF = new ArrayList<>();

    /* JADX WARN: Removed duplicated region for block: B:147:0x03b5  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x028a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ() {
        /*
            Method dump skipped, instruction units count: 1028
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21343818fs.LIZ():void");
    }

    public final int LIZJ(byte b) {
        this.LJ.LIZ(b);
        byte b2 = (byte) 0;
        this.LJ.LIZ(b2);
        this.LJ.LIZ(b2);
        return this.LJ.LIZIZ - 2;
    }

    public final boolean LJ(int i) {
        if (this.LIZLLL.LIZ == i) {
            LIZ();
            return true;
        }
        return false;
    }

    public final void LJFF(int i) {
        C1489750os1 c1489750os1 = this.LJ;
        int i2 = c1489750os1.LIZIZ;
        int i3 = (i2 - i) - 2;
        byte b = (byte) (i3 >>> 8);
        if (i < i2) {
            byte[] bArr = c1489750os1.LIZ;
            bArr[i] = b;
            int i4 = i + 1;
            byte b2 = (byte) (i3 & 255);
            if (i4 < i2) {
                bArr[i4] = b2;
                return;
            }
            throw new IndexOutOfBoundsException(c1489750os1.LIZJ(i4, "set"));
        }
        throw new IndexOutOfBoundsException(c1489750os1.LIZJ(i, "set"));
    }

    public C21343818fs(C21343918ft c21343918ft, C21328818dS c21328818dS) {
        this.LIZ = c21343918ft;
        this.LIZIZ = c21328818dS;
    }

    public final void LIZIZ(int i, String str) {
        if (this.LIZLLL.LIZ == i) {
            LIZ();
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(i);
        sbLIZ.append(':');
        sbLIZ.append(this.LIZLLL.LIZIZ);
        sbLIZ.append(',');
        sbLIZ.append(str);
        throw new C1488370opn("parser_syntax_error", C2188811AlT.LIZIZ(sbLIZ));
    }

    public final void LIZLLL(byte b, byte b2, Object obj) {
        this.LJFF.add(obj);
        int size = this.LJFF.size() - 1;
        if (size <= 127) {
            this.LJ.LIZ(b);
            this.LJ.LIZ((byte) size);
        } else {
            this.LJ.LIZ(b2);
            this.LJ.LIZ((byte) (size >>> 8));
            this.LJ.LIZ((byte) (size & 255));
        }
    }
}
