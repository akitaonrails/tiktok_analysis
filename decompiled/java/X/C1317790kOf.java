package X;

import android.util.Base64;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.zip.GZIPOutputStream;

/* JADX INFO: renamed from: X.0kOf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1317790kOf {
    public final int LIZ;
    public final int LIZIZ;
    public final int LIZJ;
    public final ArrayList<Integer[]> LIZLLL;
    public double LJ;

    public final C1521660phU LIZIZ() {
        int i;
        String strEncodeToString;
        int i2 = this.LIZ;
        if (i2 <= 0 || (i = this.LIZIZ) <= 0) {
            return new C1521660phU();
        }
        int i3 = this.LIZJ;
        int i4 = ((i - 1) / i3) + 1;
        int i5 = ((i2 - 1) / i3) + 1;
        int i6 = i4 * i5;
        int i7 = i5 - 1;
        int i8 = i4 - 1;
        byte[] bArr = new byte[(i6 >> 3) + 1];
        int i9 = 0;
        int iMin = i7;
        int iMin2 = i8;
        int i10 = 0;
        int iMax = 0;
        int iMax2 = 0;
        for (Integer[] numArr : this.LIZLLL) {
            int iMax3 = Math.max(i9, numArr[i9].intValue() / this.LIZJ);
            int iMax4 = Math.max(i9, numArr[1].intValue() / this.LIZJ);
            int iMin3 = Math.min(i7, numArr[2].intValue() / this.LIZJ);
            int iMin4 = Math.min(i8, numArr[3].intValue() / this.LIZJ);
            if (numArr[4].intValue() == 1) {
                if (iMax4 <= iMin4) {
                    int i11 = iMax4;
                    while (true) {
                        if (iMax3 <= iMin3) {
                            int i12 = iMax3;
                            while (true) {
                                int i13 = (i5 * i11) + i12;
                                int i14 = i13 >> 3;
                                int i15 = (7 - i13) & 7;
                                byte b = bArr[i14];
                                if (((b >>> i15) & 1) == 0) {
                                    bArr[i14] = (byte) (b | ((byte) (1 << i15)));
                                    i10++;
                                }
                                if (i12 == iMin3) {
                                    break;
                                }
                                i12++;
                            }
                        }
                        if (i11 == iMin4) {
                            break;
                        }
                        i11++;
                    }
                }
                iMin = Math.min(iMin, iMax3);
                iMax = Math.max(iMax, iMin3);
                iMin2 = Math.min(iMin2, iMax4);
                iMax2 = Math.max(iMax2, iMin4);
            }
            i9 = 0;
        }
        float f = i6;
        float fMax = (Math.max(Math.max(iMin * i4, (i7 - iMax) * i4), Math.max(iMin2 * i5, (i8 - iMax2) * i5)) * 1.0f) / f;
        float f2 = (i10 * 1.0f) / f;
        if (EnumC1521240pgo.blankBitmap.isEnabled()) {
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
                gZIPOutputStream.write(bArr);
                gZIPOutputStream.close();
                strEncodeToString = Base64.encodeToString(byteArrayOutputStream.toByteArray(), 2);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                int i16 = C2187451AjH.LIZ;
                C1521730phb.LIZJ("HybridMonitor", "Failed to generate blank bitmap string", th);
                strEncodeToString = "";
            }
        } else {
            strEncodeToString = "";
        }
        return new C1521660phU(f2, fMax, strEncodeToString, i5, i4, this.LIZLLL.size(), this.LJ);
    }

    public C1317790kOf(int i, int i2) {
        int iMax = Math.max(1, (int) (Math.max(i, i2) / 100.0f));
        this.LIZ = i;
        this.LIZIZ = i2;
        this.LIZJ = iMax;
        this.LIZLLL = new ArrayList<>();
    }

    public final void LIZ(int i, int i2, int i3, int i4, int i5) {
        if (i5 != 0) {
            this.LIZLLL.add(new Integer[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5)});
        }
    }
}
