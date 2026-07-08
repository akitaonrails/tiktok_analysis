package X;

/* JADX INFO: renamed from: X.01Wx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C348501Wx {
    public static final C348501Wx LIZ = new C348501Wx();

    /* JADX WARN: Removed duplicated region for block: B:11:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ(java.lang.String r19, java.lang.Object r20, long r21, X.InterfaceC1364105Vn<? super org.json.JSONObject> r23) {
        /*
            r18 = this;
            r3 = r23
            r7 = r20
            r12 = r21
            boolean r0 = r3 instanceof X.C348601Wy
            if (r0 == 0) goto L2c
            r4 = r3
            X.01Wy r4 = (X.C348601Wy) r4
            int r2 = r4.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L2c
            int r2 = r2 - r1
            r4.LLILZ = r2
        L18:
            java.lang.Object r6 = r4.LLILLJJLI
            java.lang.Object r1 = X.C099R.LJFF()
            int r5 = r4.LLILZ
            java.lang.String r2 = "error_code"
            java.lang.String r3 = "error_msg"
            r0 = 1
            if (r5 == 0) goto L40
            if (r5 != r0) goto L38
            long r12 = r4.LL
            goto L34
        L2c:
            X.01Wy r4 = new X.01Wy
            r0 = r18
            r4.<init>(r0, r3)
            goto L18
        L34:
            X.C155000ia.LIZIZ(r6)     // Catch: java.lang.Exception -> L73 X.C094W -> L9a
            return r6
        L38:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L40:
            X.C155000ia.LIZIZ(r6)
            boolean r5 = r7 instanceof org.json.JSONObject     // Catch: java.lang.Exception -> L73 X.C094W -> L98
            if (r5 == 0) goto L4b
            r8 = r7
            org.json.JSONObject r8 = (org.json.JSONObject) r8     // Catch: java.lang.Exception -> L73 X.C094W -> L98
            goto L4c
        L4b:
            r8 = 0
        L4c:
            if (r8 != 0) goto L55
            org.json.JSONObject r8 = new org.json.JSONObject     // Catch: java.lang.Exception -> L73 X.C094W -> L98
            java.util.Map r7 = (java.util.Map) r7     // Catch: java.lang.Exception -> L73 X.C094W -> L98
            r8.<init>(r7)     // Catch: java.lang.Exception -> L73 X.C094W -> L98
        L55:
            r14 = 100
            r16 = 10000(0x2710, double:4.9407E-320)
            long r9 = X.C13LZ.LJFF(r12, r14, r16)     // Catch: java.lang.Exception -> L73 X.C094W -> L98
            X.01Wz r6 = new X.01Wz     // Catch: java.lang.Exception -> L73 X.C094W -> L98
            r11 = 0
            r7 = r19
            r6.<init>(r7, r8, r9, r11)     // Catch: java.lang.Exception -> L73 X.C094W -> L98
            r4.LL = r12     // Catch: X.C094W -> L71 java.lang.Exception -> L73
            r4.LLILZ = r0     // Catch: X.C094W -> L71 java.lang.Exception -> L73
            java.lang.Object r6 = X.C099A.LIZIZ(r9, r6, r4)     // Catch: X.C094W -> L71 java.lang.Exception -> L73
            if (r6 != r1) goto L70
            return r1
        L70:
            return r6
        L71:
            r4 = move-exception
            goto L9b
        L73:
            r4 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r4)
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "run error:"
            r1.append(r0)
            java.lang.String r0 = r4.getMessage()
            r1.append(r0)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            org.json.JSONObject r1 = new org.json.JSONObject
            r1.<init>()
            r1.put(r3, r0)
            r0 = -3
            r1.put(r2, r0)
            return r1
        L98:
            r4 = move-exception
            goto L9b
        L9a:
            r4 = move-exception
        L9b:
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r4)
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "timeout="
            r1.append(r0)
            r1.append(r12)
            java.lang.String r0 = " error:"
            r1.append(r0)
            java.lang.String r0 = r4.getMessage()
            r1.append(r0)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            org.json.JSONObject r1 = new org.json.JSONObject
            r1.<init>()
            r1.put(r3, r0)
            r0 = -2
            r1.put(r2, r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C348501Wx.LIZ(java.lang.String, java.lang.Object, long, X.05Vn):java.lang.Object");
    }
}
