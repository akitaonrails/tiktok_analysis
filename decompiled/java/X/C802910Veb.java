package X;

import java.util.Arrays;
import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.0Veb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C802910Veb {
    public Long[] LIZ;
    public final String LIZIZ;

    public C802910Veb(String str) {
        this.LIZIZ = str;
    }

    public final String LIZ(long j) {
        long jLongValue;
        Long[] lArr = this.LIZ;
        if (lArr == null) {
            return "";
        }
        int length = lArr.length;
        int i = 0;
        long jLongValue2 = Long.MIN_VALUE;
        while (true) {
            if (i < length) {
                Long l = lArr[i];
                if (j >= l.longValue()) {
                    jLongValue2 = l.longValue();
                    i++;
                } else {
                    jLongValue = l.longValue() - 1;
                    break;
                }
            } else {
                jLongValue = Long.MAX_VALUE;
                break;
            }
        }
        String strLIZIZ = e3.e;
        if (jLongValue2 != Long.MIN_VALUE) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(e3.e);
            sbLIZ.append(jLongValue2);
            sbLIZ.append(this.LIZIZ);
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(strLIZIZ);
        sbLIZ2.append(" - ");
        String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
        if (jLongValue != Long.MAX_VALUE) {
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append(strLIZIZ2);
            sbLIZ3.append(jLongValue);
            sbLIZ3.append(this.LIZIZ);
            strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ3);
        }
        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
        sbLIZ4.append(strLIZIZ2);
        sbLIZ4.append(e3.f);
        return C2188811AlT.LIZIZ(sbLIZ4);
    }

    public final void LIZJ(Long[] lArr) {
        Arrays.sort(lArr);
        this.LIZ = lArr;
    }

    public final void LIZIZ(long j, long j2) {
        int i = ((int) ((j - 0) / j2)) + 1;
        Long[] lArr = new Long[i];
        int i2 = 0;
        while (true) {
            int i3 = i - 1;
            if (i2 < i3) {
                lArr[i2] = Long.valueOf((((long) i2) * j2) + 0);
                i2++;
            } else {
                lArr[i3] = Long.valueOf(j);
                LIZJ(lArr);
                return;
            }
        }
    }
}
