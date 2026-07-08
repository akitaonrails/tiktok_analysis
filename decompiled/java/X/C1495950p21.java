package X;

import com.bytedance.speech.speechengine.SpeechEngineDefines;
import java.util.Arrays;
import okio.ByteString;

/* JADX INFO: renamed from: X.0p21, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1495950p21 {
    public final C1496690p3D LIZ;
    public boolean LIZJ;
    public int LJI;
    public int LJII;
    public int LIZIZ = Integer.MAX_VALUE;
    public C1495840p1q[] LJ = new C1495840p1q[8];
    public int LJFF = 7;
    public int LIZLLL = SpeechEngineDefines.TTS_WORK_MODE_BOTH;

    public C1495950p21(C1496690p3D c1496690p3D) {
        this.LIZ = c1496690p3D;
    }

    public final void LIZ(int i) {
        int i2;
        if (i > 0) {
            int length = this.LJ.length - 1;
            int i3 = 0;
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
            int i5 = i2 + 1;
            System.arraycopy(c1495840p1qArr, i5, c1495840p1qArr, i5 + i3, this.LJI);
            C1495840p1q[] c1495840p1qArr2 = this.LJ;
            int i6 = this.LJFF + 1;
            Arrays.fill(c1495840p1qArr2, i6, i6 + i3, (Object) null);
            this.LJFF += i3;
        }
    }

    public final void LIZIZ(C1495840p1q c1495840p1q) {
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

    public final void LIZJ(ByteString byteString) {
        C1496130p2J.LIZLLL.getClass();
        long j = 0;
        long j2 = 0;
        for (int i = 0; i < byteString.size(); i++) {
            j2 += (long) C1496130p2J.LIZJ[byteString.getByte(i) & 255];
        }
        if (((int) ((j2 + 7) >> 3)) < byteString.size()) {
            C1496690p3D c1496690p3D = new C1496690p3D();
            C1496130p2J.LIZLLL.getClass();
            int i2 = 0;
            for (int i3 = 0; i3 < byteString.size(); i3++) {
                int i4 = byteString.getByte(i3) & 255;
                int i5 = C1496130p2J.LIZIZ[i4];
                byte b = C1496130p2J.LIZJ[i4];
                j = (j << b) | ((long) i5);
                i2 += b;
                while (i2 >= 8) {
                    i2 -= 8;
                    c1496690p3D.writeByte((int) (j >> i2));
                }
            }
            if (i2 > 0) {
                c1496690p3D.writeByte((int) ((j << (8 - i2)) | ((long) (255 >>> i2))));
            }
            ByteString byteStringLJIJJ = c1496690p3D.LJIJJ();
            LJ(byteStringLJIJJ.size(), 127, 128);
            C1496690p3D c1496690p3D2 = this.LIZ;
            c1496690p3D2.getClass();
            byteStringLJIJJ.write$jvm(c1496690p3D2);
            return;
        }
        LJ(byteString.size(), 127, 0);
        C1496690p3D c1496690p3D3 = this.LIZ;
        c1496690p3D3.getClass();
        byteString.write$jvm(c1496690p3D3);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0092 A[PHI: r1 r8
      0x0092: PHI (r1v8 int) = (r1v2 int), (r1v10 int) binds: [B:28:0x008b, B:21:0x0068] A[DONT_GENERATE, DONT_INLINE]
      0x0092: PHI (r8v6 int) = (r8v3 int), (r8v7 int) binds: [B:28:0x008b, B:21:0x0068] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ab A[PHI: r1
      0x00ab: PHI (r1v7 int) = (r1v2 int), (r1v8 int) binds: [B:52:0x00ab, B:29:0x0092] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00be  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZLLL(java.util.List<X.C1495840p1q> r12) {
        /*
            Method dump skipped, instruction units count: 231
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1495950p21.LIZLLL(java.util.List):void");
    }

    public final void LJ(int i, int i2, int i3) {
        if (i < i2) {
            this.LIZ.LJJJZ(i | i3);
            return;
        }
        this.LIZ.LJJJZ(i3 | i2);
        int i4 = i - i2;
        while (i4 >= 128) {
            this.LIZ.LJJJZ(128 | (i4 & 127));
            i4 >>>= 7;
        }
        this.LIZ.LJJJZ(i4);
    }
}
