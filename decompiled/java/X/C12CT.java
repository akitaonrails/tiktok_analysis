package X;

import android.graphics.Bitmap;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.12CT, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C12CT {
    public static final Map<String, Integer> LIZ = new LinkedHashMap();
    public static final Map<String, Integer> LIZIZ = new LinkedHashMap();

    public static Bitmap LIZ(Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        if (bitmap.isRecycled()) {
            return bitmap;
        }
        try {
            Bitmap.Config config = bitmap.getConfig();
            if (config == null) {
                config = Bitmap.Config.ARGB_8888;
            }
            bitmap = bitmap.copy(config, false);
            return bitmap;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return bitmap;
        }
    }

    public static Integer LJI(String str, C12CP c12cp, boolean z) {
        if (C123100dR.LIZ(str)) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(str);
            sbLIZ.append(c12cp);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            if (z) {
                return (Integer) ((LinkedHashMap) LIZ).get(strLIZIZ);
            }
            return (Integer) ((LinkedHashMap) LIZIZ).get(strLIZIZ);
        }
        return null;
    }

    public static C0SKU LJ(String str, String str2, boolean z, float f, boolean z2) {
        Integer numLIZJ = LIZJ(str, z, str2, z2, f, C12CP.TOP);
        Integer numLIZJ2 = LIZJ(str, z, str2, z2, f, C12CP.BOTTOM);
        if (numLIZJ != null && numLIZJ2 != null) {
            return new C0SKU(numLIZJ.intValue(), numLIZJ2.intValue());
        }
        return null;
    }

    public static Integer LIZJ(String str, boolean z, String str2, boolean z2, float f, C12CP c12cp) {
        Integer numLJI = LJI(str, c12cp, z);
        Integer numLJI2 = LJI(str2, c12cp, z2);
        if (numLJI != null && f == 0.0f) {
            return numLJI;
        }
        if (numLJI2 != null && f == 1.0f) {
            return numLJI2;
        }
        if (numLJI != null && numLJI2 != null) {
            return Integer.valueOf(C2441009hQ.LJI(f, numLJI.intValue(), numLJI2.intValue()));
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00db  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJFF(java.lang.String r8, android.graphics.Bitmap r9, android.graphics.Bitmap r10, X.C12CP r11, X.C12CL r12, X.InterfaceC1364105Vn<? super java.lang.Integer> r13) {
        /*
            Method dump skipped, instruction units count: 234
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C12CT.LJFF(java.lang.String, android.graphics.Bitmap, android.graphics.Bitmap, X.12CP, X.12CL, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x00ae  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZLLL(java.lang.String r17, android.graphics.Bitmap r18, android.graphics.Bitmap r19, java.lang.String r20, android.graphics.Bitmap r21, android.graphics.Bitmap r22, float r23, X.C12CL r24, X.InterfaceC1364105Vn<? super X.C0SKU> r25) {
        /*
            r16 = this;
            r3 = r25
            r9 = r20
            r6 = r17
            r14 = r24
            r12 = r23
            boolean r0 = r3 instanceof X.C12CU
            r5 = r16
            if (r0 == 0) goto Lae
            r15 = r3
            X.12CU r15 = (X.C12CU) r15
            int r2 = r15.LLJILJIL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto Lae
            int r2 = r2 - r1
            r15.LLJILJIL = r2
        L1e:
            java.lang.Object r0 = r15.LLJI
            java.lang.Object r2 = X.C099R.LJFF()
            int r4 = r15.LLJILJIL
            r1 = 2
            r3 = 1
            if (r4 == 0) goto L3f
            if (r4 == r3) goto L6d
            if (r4 != r1) goto Lb5
            int r3 = r15.LLJ
            X.C155000ia.LIZIZ(r0)
        L33:
            java.lang.Number r0 = (java.lang.Number) r0
            int r1 = r0.intValue()
            X.0SKU r0 = new X.0SKU
            r0.<init>(r3, r1)
            return r0
        L3f:
            X.C155000ia.LIZIZ(r0)
            android.graphics.Bitmap r7 = LIZ(r18)
            android.graphics.Bitmap r8 = LIZ(r19)
            android.graphics.Bitmap r10 = LIZ(r21)
            android.graphics.Bitmap r11 = LIZ(r22)
            X.12CP r13 = X.C12CP.TOP
            r15.LL = r6
            r15.LLILLJJLI = r9
            r15.LLILLL = r14
            r15.LLILZ = r7
            r15.LLILZIL = r8
            r15.LLILZLL = r10
            r15.LLIZ = r11
            r15.LLIZLLLIL = r12
            r15.LLJILJIL = r3
            java.lang.Object r0 = r5.LIZIZ(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            if (r0 != r2) goto L8c
            return r2
        L6d:
            float r12 = r15.LLIZLLLIL
            java.lang.Object r11 = r15.LLIZ
            android.graphics.Bitmap r11 = (android.graphics.Bitmap) r11
            java.lang.Object r10 = r15.LLILZLL
            android.graphics.Bitmap r10 = (android.graphics.Bitmap) r10
            java.lang.Object r8 = r15.LLILZIL
            android.graphics.Bitmap r8 = (android.graphics.Bitmap) r8
            java.lang.Object r7 = r15.LLILZ
            android.graphics.Bitmap r7 = (android.graphics.Bitmap) r7
            X.12CL r14 = r15.LLILLL
            java.lang.Object r9 = r15.LLILLJJLI
            java.lang.String r9 = (java.lang.String) r9
            java.lang.Object r6 = r15.LL
            java.lang.String r6 = (java.lang.String) r6
            X.C155000ia.LIZIZ(r0)
        L8c:
            java.lang.Number r0 = (java.lang.Number) r0
            int r3 = r0.intValue()
            X.12CP r13 = X.C12CP.BOTTOM
            r0 = 0
            r15.LL = r0
            r15.LLILLJJLI = r0
            r15.LLILLL = r0
            r15.LLILZ = r0
            r15.LLILZIL = r0
            r15.LLILZLL = r0
            r15.LLIZ = r0
            r15.LLJ = r3
            r15.LLJILJIL = r1
            java.lang.Object r0 = r5.LIZIZ(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            if (r0 != r2) goto L33
            return r2
        Lae:
            X.12CU r15 = new X.12CU
            r15.<init>(r5, r3)
            goto L1e
        Lb5:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C12CT.LIZLLL(java.lang.String, android.graphics.Bitmap, android.graphics.Bitmap, java.lang.String, android.graphics.Bitmap, android.graphics.Bitmap, float, X.12CL, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x00a0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZIZ(java.lang.String r17, android.graphics.Bitmap r18, android.graphics.Bitmap r19, java.lang.String r20, android.graphics.Bitmap r21, android.graphics.Bitmap r22, float r23, X.C12CP r24, X.C12CL r25, X.InterfaceC1364105Vn<? super java.lang.Integer> r26) {
        /*
            r16 = this;
            r3 = r26
            r8 = r20
            r7 = r21
            r6 = r22
            r13 = r24
            r14 = r25
            r5 = r23
            boolean r0 = r3 instanceof X.C12CV
            r9 = r16
            if (r0 == 0) goto La0
            r15 = r3
            X.12CV r15 = (X.C12CV) r15
            int r2 = r15.LLJI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto La0
            int r2 = r2 - r1
            r15.LLJI = r2
        L22:
            java.lang.Object r4 = r15.LLIZLLLIL
            java.lang.Object r3 = X.C099R.LJFF()
            int r1 = r15.LLJI
            r2 = 2
            r0 = 1
            if (r1 == 0) goto L48
            if (r1 == r0) goto L66
            if (r1 != r2) goto La7
            int r1 = r15.LLIZ
            float r5 = r15.LLILZLL
            X.C155000ia.LIZIZ(r4)
        L39:
            java.lang.Number r4 = (java.lang.Number) r4
            int r0 = r4.intValue()
            int r0 = X.C2441009hQ.LJI(r5, r1, r0)
            java.lang.Integer r0 = X.C2286608xc.LJ(r0)
            return r0
        L48:
            X.C155000ia.LIZIZ(r4)
            r15.LL = r8
            r15.LLILLJJLI = r7
            r15.LLILLL = r6
            r15.LLILZ = r13
            r15.LLILZIL = r14
            r15.LLILZLL = r5
            r15.LLJI = r0
            r12 = r19
            r11 = r18
            r10 = r17
            java.lang.Object r4 = r9.LJFF(r10, r11, r12, r13, r14, r15)
            if (r4 != r3) goto L7b
            return r3
        L66:
            float r5 = r15.LLILZLL
            X.12CL r14 = r15.LLILZIL
            X.12CP r13 = r15.LLILZ
            java.lang.Object r6 = r15.LLILLL
            android.graphics.Bitmap r6 = (android.graphics.Bitmap) r6
            java.lang.Object r7 = r15.LLILLJJLI
            android.graphics.Bitmap r7 = (android.graphics.Bitmap) r7
            java.lang.Object r8 = r15.LL
            java.lang.String r8 = (java.lang.String) r8
            X.C155000ia.LIZIZ(r4)
        L7b:
            java.lang.Number r4 = (java.lang.Number) r4
            int r1 = r4.intValue()
            r0 = 0
            r15.LL = r0
            r15.LLILLJJLI = r0
            r15.LLILLL = r0
            r15.LLILZ = r0
            r15.LLILZIL = r0
            r15.LLILZLL = r5
            r15.LLIZ = r1
            r15.LLJI = r2
            r9 = r9
            r13 = r13
            r14 = r14
            r15 = r15
            r12 = r6
            r11 = r7
            r10 = r8
            java.lang.Object r4 = r9.LJFF(r10, r11, r12, r13, r14, r15)
            if (r4 != r3) goto L39
            return r3
        La0:
            X.12CV r15 = new X.12CV
            r15.<init>(r9, r3)
            goto L22
        La7:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C12CT.LIZIZ(java.lang.String, android.graphics.Bitmap, android.graphics.Bitmap, java.lang.String, android.graphics.Bitmap, android.graphics.Bitmap, float, X.12CP, X.12CL, X.05Vn):java.lang.Object");
    }
}
