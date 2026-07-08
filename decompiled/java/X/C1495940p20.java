package X;

import com.bytedance.speech.speechengine.SpeechEngineDefines;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import okio.ByteString;

/* JADX INFO: renamed from: X.0p20, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1495940p20 {
    public final C1496670p3B LIZIZ;
    public final List<C1495840p1q> LIZ = new ArrayList();
    public C1495840p1q[] LJ = new C1495840p1q[8];
    public int LJFF = 7;
    public int LJI = 0;
    public int LJII = 0;
    public final int LIZJ = SpeechEngineDefines.TTS_WORK_MODE_BOTH;
    public int LIZLLL = SpeechEngineDefines.TTS_WORK_MODE_BOTH;

    public final ByteString LIZLLL() {
        int i = this.LIZIZ.readByte() & 255;
        boolean z = (i & 128) == 128;
        int iLJ = LJ(i, 127);
        if (!z) {
            return this.LIZIZ.LJLILLLLZI(iLJ);
        }
        C1496130p2J c1496130p2J = C1496130p2J.LIZLLL;
        byte[] bArrLJJIJ = this.LIZIZ.LJJIJ(iLJ);
        c1496130p2J.getClass();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        C1496160p2M c1496160p2M = c1496130p2J.LIZ;
        int i2 = 0;
        int i3 = 0;
        for (byte b : bArrLJJIJ) {
            i3 = (i3 << 8) | (b & 255);
            i2 += 8;
            while (i2 >= 8) {
                int i4 = i2 - 8;
                c1496160p2M = c1496160p2M.LIZ[(i3 >>> i4) & 255];
                if (c1496160p2M.LIZ == null) {
                    byteArrayOutputStream.write(c1496160p2M.LIZIZ);
                    i2 -= c1496160p2M.LIZJ;
                    c1496160p2M = c1496130p2J.LIZ;
                } else {
                    i2 = i4;
                }
            }
        }
        while (i2 > 0) {
            C1496160p2M c1496160p2M2 = c1496160p2M.LIZ[(i3 << (8 - i2)) & 255];
            if (c1496160p2M2.LIZ != null || c1496160p2M2.LIZJ > i2) {
                break;
            }
            byteArrayOutputStream.write(c1496160p2M2.LIZIZ);
            i2 -= c1496160p2M2.LIZJ;
            c1496160p2M = c1496130p2J.LIZ;
        }
        return ByteString.of(byteArrayOutputStream.toByteArray());
    }

    public C1495940p20(C1495980p24 c1495980p24) {
        this.LIZIZ = new C1496670p3B(c1495980p24);
    }

    public final int LIZ(int i) {
        int i2;
        int i3 = 0;
        if (i > 0) {
            int length = this.LJ.length - 1;
            while (true) {
                i2 = this.LJFF;
                if (length < i2 || i <= 0) {
                    break;
                }
                int i4 = this.LJ[length].LIZJ;
                i -= i4;
                this.LJII -= i4;
                this.LJI--;
                i3++;
                length--;
            }
            C1495840p1q[] c1495840p1qArr = this.LJ;
            System.arraycopy(c1495840p1qArr, i2 + 1, c1495840p1qArr, i2 + 1 + i3, this.LJI);
            this.LJFF += i3;
        }
        return i3;
    }

    public final ByteString LIZIZ(int i) {
        if (i >= 0 && i <= C1496360p2g.LIZ.length - 1) {
            return C1496360p2g.LIZ[i].LIZ;
        }
        int length = this.LJFF + 1 + (i - C1496360p2g.LIZ.length);
        if (length >= 0) {
            C1495840p1q[] c1495840p1qArr = this.LJ;
            if (length < c1495840p1qArr.length) {
                return c1495840p1qArr[length].LIZ;
            }
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Header index too large ");
        sbLIZ.append(i + 1);
        throw new IOException(C2188811AlT.LIZIZ(sbLIZ));
    }

    public final void LIZJ(C1495840p1q c1495840p1q) {
        ((ArrayList) this.LIZ).add(c1495840p1q);
        int i = c1495840p1q.LIZJ;
        int i2 = this.LIZLLL;
        if (i > i2) {
            Arrays.fill(this.LJ, (Object) null);
            this.LJFF = this.LJ.length - 1;
            this.LJI = 0;
            this.LJII = 0;
            return;
        }
        LIZ((this.LJII + i) - i2);
        int i3 = this.LJI + 1;
        C1495840p1q[] c1495840p1qArr = this.LJ;
        if (i3 > c1495840p1qArr.length) {
            C1495840p1q[] c1495840p1qArr2 = new C1495840p1q[c1495840p1qArr.length * 2];
            System.arraycopy(c1495840p1qArr, 0, c1495840p1qArr2, c1495840p1qArr.length, c1495840p1qArr.length);
            this.LJFF = this.LJ.length - 1;
            this.LJ = c1495840p1qArr2;
        }
        int i4 = this.LJFF;
        this.LJFF = i4 - 1;
        this.LJ[i4] = c1495840p1q;
        this.LJI++;
        this.LJII += i;
    }

    public final int LJ(int i, int i2) {
        int i3 = i & i2;
        if (i3 < i2) {
            return i3;
        }
        int i4 = 0;
        while (true) {
            int i5 = this.LIZIZ.readByte() & 255;
            if ((i5 & 128) != 0) {
                i2 += (i5 & 127) << i4;
                i4 += 7;
            } else {
                return i2 + (i5 << i4);
            }
        }
    }
}
