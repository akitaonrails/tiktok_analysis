package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0uCT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1694630uCT {
    public final int LIZ;
    public C1694700uCa LIZIZ;
    public C1694700uCa LIZJ;
    public int LIZLLL;
    public Long LJ;
    public boolean LJFF;

    public C1694630uCT() {
        this(0);
    }

    public C1694630uCT(int i) {
        this.LIZ = 100000;
    }

    public final void LIZ(C1686970u07 c1686970u07) {
        C1686970u07 c1686970u072;
        String str;
        C1694700uCa c1694700uCa;
        C1686970u07 c1686970u073;
        this.LJFF = false;
        C1694700uCa c1694700uCa2 = this.LIZIZ;
        if (c1694700uCa2 != null) {
            c1686970u072 = c1694700uCa2.LIZIZ;
        } else {
            c1686970u072 = null;
        }
        if (Intrinsics.LJFF(c1686970u07, c1686970u072)) {
            return;
        }
        String str2 = c1686970u07.LIZ.LLILLJJLI;
        C1694700uCa c1694700uCa3 = this.LIZIZ;
        if (c1694700uCa3 != null && (c1686970u073 = c1694700uCa3.LIZIZ) != null) {
            str = c1686970u073.LIZ.LLILLJJLI;
        } else {
            str = null;
        }
        if (Intrinsics.LJFF(str2, str)) {
            C1694700uCa c1694700uCa4 = this.LIZIZ;
            if (c1694700uCa4 != null) {
                c1694700uCa4.LIZIZ = c1686970u07;
                return;
            }
            return;
        }
        this.LIZIZ = new C1694700uCa(this.LIZIZ, c1686970u07);
        this.LIZJ = null;
        int length = this.LIZLLL + c1686970u07.LIZ.LLILLJJLI.length();
        this.LIZLLL = length;
        if (length <= this.LIZ || (c1694700uCa = this.LIZIZ) == null || c1694700uCa.LIZ == null) {
            return;
        }
        while (c1694700uCa != null) {
            C1694700uCa c1694700uCa5 = c1694700uCa.LIZ;
            if (c1694700uCa5 != null) {
                if (c1694700uCa5.LIZ != null) {
                    c1694700uCa = c1694700uCa.LIZ;
                } else if (c1694700uCa == null) {
                    return;
                }
            }
            c1694700uCa.LIZ = null;
            return;
        }
    }

    public static void LIZIZ(C1694630uCT c1694630uCT, C1686970u07 c1686970u07) {
        long jLongValue;
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (!c1694630uCT.LJFF) {
            Long l = c1694630uCT.LJ;
            if (l != null) {
                jLongValue = l.longValue();
            } else {
                jLongValue = 0;
            }
            if (jCurrentTimeMillis <= jLongValue + ((long) 5000)) {
                return;
            }
        }
        c1694630uCT.LJ = Long.valueOf(jCurrentTimeMillis);
        c1694630uCT.LIZ(c1686970u07);
    }
}
