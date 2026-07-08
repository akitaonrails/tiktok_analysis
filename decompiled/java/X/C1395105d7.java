package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: renamed from: X.05d7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1395105d7 {
    public static final void LIZ(C1395205d8 c1395205d8, C20066813fO c20066813fO) {
        if (C05ZS.LIZ(c20066813fO)) {
            C1395305d9 c1395305d9 = c1395205d8.LIZ;
            C1395605dC[] c1395605dCArr = c1395305d9.LIZLLL;
            Arrays.fill(c1395605dCArr, 0, c1395605dCArr.length, (Object) null);
            c1395305d9.LJ = 0;
            C1395305d9 c1395305d92 = c1395205d8.LIZIZ;
            C1395605dC[] c1395605dCArr2 = c1395305d92.LIZLLL;
            Arrays.fill(c1395605dCArr2, 0, c1395605dCArr2.length, (Object) null);
            c1395305d92.LJ = 0;
            c1395205d8.LIZJ = 0L;
        }
        if (!C05ZS.LIZJ(c20066813fO)) {
            List list = c20066813fO.LJIIJ;
            if (list == null) {
                list = C13BV.INSTANCE;
            }
            int size = list.size();
            for (int i = 0; i < size; i++) {
                C1395905dF c1395905dF = (C1395905dF) ListProtector.get(list, i);
                c1395205d8.LIZ(c1395905dF.LIZ, c1395905dF.LIZJ);
            }
            c1395205d8.LIZ(c20066813fO.LIZIZ, c20066813fO.LJIIJJI);
        }
        if (C05ZS.LIZJ(c20066813fO) && c20066813fO.LIZIZ - c1395205d8.LIZJ > 40) {
            C1395305d9 c1395305d93 = c1395205d8.LIZ;
            C1395605dC[] c1395605dCArr3 = c1395305d93.LIZLLL;
            Arrays.fill(c1395605dCArr3, 0, c1395605dCArr3.length, (Object) null);
            c1395305d93.LJ = 0;
            C1395305d9 c1395305d94 = c1395205d8.LIZIZ;
            C1395605dC[] c1395605dCArr4 = c1395305d94.LIZLLL;
            Arrays.fill(c1395605dCArr4, 0, c1395605dCArr4.length, (Object) null);
            c1395305d94.LJ = 0;
            c1395205d8.LIZJ = 0L;
        }
        c1395205d8.LIZJ = c20066813fO.LIZIZ;
    }

    public static final float LIZIZ(float[] fArr, float[] fArr2) {
        int length = fArr.length;
        float f = 0.0f;
        for (int i = 0; i < length; i++) {
            f += fArr[i] * fArr2[i];
        }
        return f;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0043 A[LOOP:3: B:20:0x0041->B:21:0x0043, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x004f A[LOOP:4: B:23:0x004d->B:24:0x004f, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014 A[LOOP:0: B:7:0x0012->B:8:0x0014, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LIZJ(float[] r16, float[] r17, int r18, float[] r19) {
        /*
            Method dump skipped, instruction units count: 218
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1395105d7.LIZJ(float[], float[], int, float[]):void");
    }
}
