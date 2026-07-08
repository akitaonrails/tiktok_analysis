package X;

import h0.n2;

/* JADX INFO: renamed from: X.0tkz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1677590tkz {
    public static C1677580tky LIZ(float f, float f2, int i) {
        long j;
        long j2;
        if ((i & 2) != 0) {
            f2 = 0.0f;
        }
        if ((i & 4) != 0) {
            j = Long.MIN_VALUE;
        } else {
            j = 0;
        }
        if ((i & 8) != 0) {
            j2 = Long.MIN_VALUE;
        } else {
            j2 = 0;
        }
        return new C1677580tky(n2.LIZ, Float.valueOf(f), new C1677280tkU(f2), j, j2, false);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public static C1677580tky LIZIZ(C1677610tl1 c1677610tl1, Object obj, Object obj2) {
        return new C1677580tky(c1677610tl1, obj, (AbstractC1677260tkS) c1677610tl1.LIZ.invoke((T) obj2), Long.MIN_VALUE, Long.MIN_VALUE, false);
    }

    public static C1677580tky LIZJ(C1677580tky c1677580tky, float f, float f2, int i) {
        long j;
        boolean z;
        if ((i & 1) != 0) {
            f = ((Number) c1677580tky.getValue()).floatValue();
        }
        if ((i & 2) != 0) {
            f2 = ((C1677280tkU) c1677580tky.LLILLL).LIZ;
        }
        long j2 = 0;
        if ((i & 4) != 0) {
            j = c1677580tky.LLILZ;
        } else {
            j = 0;
        }
        if ((i & 8) != 0) {
            j2 = c1677580tky.LLILZIL;
        }
        if ((i & 16) != 0) {
            z = c1677580tky.LLILZLL;
        } else {
            z = false;
        }
        return new C1677580tky(c1677580tky.LL, Float.valueOf(f), new C1677280tkU(f2), j, j2, z);
    }
}
