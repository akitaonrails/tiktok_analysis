package X;

import com.bytedance.pns.psi.PsiEncrypt;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import kotlin.ranges.IntRange;

/* JADX INFO: renamed from: X.13ML, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C13ML {
    public static boolean LIZ(long j, long j2, byte[] bArr, byte[] bArr2) {
        ArrayList arrayList = new ArrayList();
        C531650Kt9 it2 = new IntRange(0, (int) Math.max(j2 - 1, 0L)).iterator();
        while (it2.LLILLL) {
            int iNextInt = it2.nextInt();
            PsiEncrypt.Companion companion = PsiEncrypt.LIZ;
            byte b = (byte) iNextInt;
            int length = bArr2.length;
            byte[] bArrCopyOf = Arrays.copyOf(bArr2, length + 1);
            bArrCopyOf[length] = b;
            arrayList.add(Integer.valueOf((int) ((((long) ((int) companion.murmur3_32(bArrCopyOf))) & 4294967295L) % (((long) ((int) j)) & 4294967295L))));
        }
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            int iIntValue = ((Number) it3.next()).intValue();
            int i = iIntValue % 8;
            if (((1 << (7 - (i + ((((i ^ 8) & ((-i) | i)) >> 31) & 8)))) & bArr[iIntValue / 8]) == 0) {
                return false;
            }
        }
        return true;
    }
}
