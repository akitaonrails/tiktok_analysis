package X;

import android.graphics.Matrix;
import com.bytedance.mt.protector.impl.string2number.CastFloatProtector;
import com.lynx.tasm.base.TraceEvent;

/* JADX INFO: renamed from: X.0kLd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1315910kLd {
    /* JADX WARN: Removed duplicated region for block: B:15:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String[] LIZJ(java.lang.String r10) {
        /*
            r9 = 0
            if (r10 == 0) goto L7e
            java.lang.String r0 = ""
            boolean r0 = r10.equalsIgnoreCase(r0)
            if (r0 != 0) goto L7e
            java.lang.String r0 = " "
            java.lang.String[] r7 = r10.split(r0)
            int r0 = r7.length
            r6 = 4
            if (r0 > r6) goto L7e
            r5 = 1
            r4 = 0
            r8 = 1
            r3 = 0
        L19:
            int r0 = r7.length
            int r0 = java.lang.Math.min(r0, r6)
            if (r3 >= r0) goto L7b
            r0 = r7[r3]
            java.lang.String r2 = "px"
            boolean r0 = r0.endsWith(r2)
            java.lang.String r1 = "%"
            if (r0 != 0) goto L38
            r0 = r7[r3]
            boolean r0 = r0.endsWith(r1)
            if (r0 != 0) goto L38
        L34:
            r8 = 0
        L35:
            int r3 = r3 + 1
            goto L19
        L38:
            r0 = r7[r3]
            boolean r0 = r0.endsWith(r2)
            java.lang.String r2 = "[+]?[0-9]*\\.?[0-9]+"
            if (r0 == 0) goto L5b
            r0 = r7[r3]
            int r0 = r0.length()
            r8 = 2
            if (r0 <= r8) goto L34
            r1 = r7[r3]
            int r0 = r1.length()
            int r0 = r0 - r8
            java.lang.String r0 = r1.substring(r4, r0)
            boolean r8 = r0.matches(r2)
            goto L35
        L5b:
            r0 = r7[r3]
            boolean r0 = r0.endsWith(r1)
            if (r0 == 0) goto L35
            r0 = r7[r3]
            int r0 = r0.length()
            if (r0 <= r5) goto L34
            r1 = r7[r3]
            int r0 = r1.length()
            int r0 = r0 - r5
            java.lang.String r0 = r1.substring(r4, r0)
            boolean r8 = r0.matches(r2)
            goto L35
        L7b:
            if (r8 == 0) goto L7e
            return r7
        L7e:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1315910kLd.LIZJ(java.lang.String):java.lang.String[]");
    }

    public static float[] LIZLLL(String[] strArr, int i, int i2) {
        if (strArr != null && strArr.length <= 4) {
            float[] fArr = {0.0f, 0.0f, 0.0f, 0.0f};
            for (int i3 = 0; i3 < strArr.length; i3++) {
                if (strArr[i3].endsWith("px")) {
                    String str = strArr[i3];
                    fArr[i3] = CastFloatProtector.parseFloat(str.substring(0, str.length() - 2));
                } else if (strArr[i3].endsWith("%")) {
                    if (i3 != 0 && i3 != 2) {
                        String str2 = strArr[i3];
                        fArr[i3] = CastFloatProtector.parseFloat(str2.substring(0, str2.length() - 2)) * i;
                    } else {
                        String str3 = strArr[i3];
                        fArr[i3] = CastFloatProtector.parseFloat(str3.substring(0, str3.length() - 2)) * i2;
                    }
                }
            }
            return fArr;
        }
        return null;
    }

    public static Matrix LJ(int i, int i2, int i3, int i4, InterfaceC1316000kLm interfaceC1316000kLm) {
        TraceEvent.LIZLLL("image.NinePatchHelper.getMatrix");
        Matrix matrix = new Matrix();
        float f = i;
        float f2 = i3;
        float f3 = (f * 1.0f) / f2;
        float f4 = i2;
        float f5 = i4;
        float f6 = (f4 * 1.0f) / f5;
        if (interfaceC1316000kLm == InterfaceC1316000kLm.LIZ) {
            matrix.preScale(f3, f6);
        } else if (interfaceC1316000kLm == InterfaceC1316000kLm.LIZIZ) {
            if (f3 > f6) {
                matrix.setScale(f6, f6);
                matrix.postTranslate((f - (f2 * f6)) / 2.0f, 0.0f);
            } else {
                matrix.setScale(f3, f3);
                matrix.postTranslate(0.0f, (f4 - (f5 * f3)) / 2.0f);
            }
        } else if (interfaceC1316000kLm == InterfaceC1316000kLm.LIZLLL) {
            if (f3 > f6) {
                matrix.setScale(f3, f3);
                matrix.postTranslate(0.0f, (f4 - (f5 * f3)) / 2.0f);
            } else {
                matrix.setScale(f6, f6);
                matrix.postTranslate((f - (f2 * f6)) / 2.0f, 0.0f);
            }
        } else {
            float fLIZIZ = C1311130kDv.LIZIZ(1.0f, 0.0f);
            float fRound = Math.round((f - (f2 * fLIZIZ)) * 0.5f);
            float fRound2 = Math.round((f4 - (f5 * fLIZIZ)) * 0.5f);
            matrix.setScale(fLIZIZ, fLIZIZ);
            matrix.postTranslate(fRound, fRound2);
        }
        TraceEvent.LJII("image.NinePatchHelper.getMatrix");
        return matrix;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x005e A[Catch: all -> 0x006c, TryCatch #0 {all -> 0x006c, blocks: (B:3:0x0008, B:5:0x0012, B:13:0x003f, B:15:0x0043, B:17:0x004a, B:19:0x0050, B:21:0x0057, B:24:0x0067, B:23:0x005e, B:9:0x0020, B:7:0x001a), top: B:30:0x0008, inners: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean LIZ(int r6, int r7, int r8, int r9, X.InterfaceC1316000kLm r10, java.lang.String r11, java.lang.String r12, android.graphics.Canvas r13, android.graphics.Bitmap r14) {
        /*
            java.lang.String r3 = "BaseRoundedCornerPostprocessor"
            java.lang.String r5 = "image.NinePatchHelper.drawNinePatch"
            com.lynx.tasm.base.TraceEvent.LIZIZ(r5)
            r4 = 0
            java.lang.String[] r0 = LIZJ(r11)     // Catch: java.lang.Throwable -> L6c
            float[] r11 = LIZLLL(r0, r8, r9)     // Catch: java.lang.Throwable -> L6c
            if (r12 == 0) goto L3a
            java.lang.String r0 = ""
            boolean r0 = r12.equalsIgnoreCase(r0)     // Catch: java.lang.Throwable -> L6c
            if (r0 != 0) goto L3a
            float r12 = com.bytedance.mt.protector.impl.string2number.CastFloatProtector.parseFloat(r12)     // Catch: java.lang.Throwable -> L1f
            goto L3c
        L1f:
            r2 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r2)     // Catch: java.lang.Throwable -> L6c
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()     // Catch: java.lang.Throwable -> L6c
            java.lang.String r0 = "initCapInsetsScale error "
            r1.append(r0)     // Catch: java.lang.Throwable -> L6c
            java.lang.String r0 = r2.getMessage()     // Catch: java.lang.Throwable -> L6c
            r1.append(r0)     // Catch: java.lang.Throwable -> L6c
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)     // Catch: java.lang.Throwable -> L6c
            com.lynx.base.log.LynxLog.w(r3, r0)     // Catch: java.lang.Throwable -> L6c
        L3a:
            r12 = 1065353216(0x3f800000, float:1.0)
        L3c:
            r2 = 1
            if (r11 == 0) goto L5e
            int r1 = r11.length     // Catch: java.lang.Throwable -> L6c
            r0 = 4
            if (r1 != r0) goto L5e
            r0 = r11[r4]     // Catch: java.lang.Throwable -> L6c
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L67
            r0 = r11[r2]     // Catch: java.lang.Throwable -> L6c
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L67
            r0 = 2
            r0 = r11[r0]     // Catch: java.lang.Throwable -> L6c
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L67
            r0 = 3
            r0 = r11[r0]     // Catch: java.lang.Throwable -> L6c
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L67
        L5e:
            android.graphics.Matrix r1 = LJ(r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L6c
            r0 = 0
            r13.drawBitmap(r14, r1, r0)     // Catch: java.lang.Throwable -> L6c
            goto L6a
        L67:
            LIZIZ(r6, r7, r8, r9, r10, r11, r12, r13, r14)     // Catch: java.lang.Throwable -> L6c
        L6a:
            r4 = 1
            goto L87
        L6c:
            r2 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r2)
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "process customDraw warn "
            r1.append(r0)
            java.lang.String r0 = r2.getMessage()
            r1.append(r0)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            com.lynx.base.log.LynxLog.w(r3, r0)
        L87:
            com.lynx.tasm.base.TraceEvent.LJII(r5)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1315910kLd.LIZ(int, int, int, int, X.0kLm, java.lang.String, java.lang.String, android.graphics.Canvas, android.graphics.Bitmap):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x00fa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZIZ(int r30, int r31, int r32, int r33, X.InterfaceC1316000kLm r34, float[] r35, float r36, android.graphics.Canvas r37, android.graphics.Bitmap r38) {
        /*
            Method dump skipped, instruction units count: 592
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1315910kLd.LIZIZ(int, int, int, int, X.0kLm, float[], float, android.graphics.Canvas, android.graphics.Bitmap):void");
    }
}
