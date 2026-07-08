package X;

/* JADX INFO: renamed from: X.0NTd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C594430NTd {
    /* JADX WARN: Removed duplicated region for block: B:11:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ(int r14, int r15, java.lang.String r16, java.lang.String r17, java.lang.String r18, X.InterfaceC1364105Vn r19) {
        /*
            r13 = this;
            r3 = r19
            boolean r0 = r3 instanceof X.C594400NTa
            if (r0 == 0) goto L23
            r6 = r3
            X.0NTa r6 = (X.C594400NTa) r6
            int r2 = r6.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L23
            int r2 = r2 - r1
            r6.LLILLL = r2
        L14:
            java.lang.Object r1 = r6.LL
            java.lang.Object r5 = X.C099R.LJFF()
            int r0 = r6.LLILLL
            r4 = 0
            r3 = 1
            if (r0 == 0) goto L35
            if (r0 != r3) goto L2d
            goto L29
        L23:
            X.0NTa r6 = new X.0NTa
            r6.<init>(r13, r3)
            goto L14
        L29:
            X.C155000ia.LIZIZ(r1)     // Catch: X.C1500760p9m -> L67 java.io.IOException -> L85
            return r1
        L2d:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L35:
            X.C155000ia.LIZIZ(r1)
            com.ss.android.ugc.gamora.editor.sticker.pov.api.PovRequest r7 = new com.ss.android.ugc.gamora.editor.sticker.pov.api.PovRequest
            java.lang.Integer r9 = X.C2286608xc.LJ(r14)
            java.lang.Integer r10 = X.C2286608xc.LJ(r15)
            r12 = r18
            r11 = r17
            r8 = r16
            r7.<init>(r8, r9, r10, r11, r12)
            X.1Ds4 r0 = X.C0CHQ.LIZ()
            X.0niP r2 = r0.getNetworkService()
            java.lang.String r1 = "https://api-va.tiktokv.com"
            java.lang.Class<X.0NTb> r0 = X.InterfaceC594410NTb.class
            java.lang.Object r0 = r2.createRetrofit(r1, r3, r0)
            X.0NTb r0 = (X.InterfaceC594410NTb) r0
            r6.LLILLL = r3     // Catch: X.C1500760p9m -> L67 java.io.IOException -> L85
            java.lang.Object r1 = r0.LIZ(r7, r6)     // Catch: X.C1500760p9m -> L67 java.io.IOException -> L85
            if (r1 != r5) goto L66
            return r5
        L66:
            return r1
        L67:
            r3 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r3)
            X.0n63 r2 = X.C1421570n63.LIZIZ
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "HttpException:"
            r1.append(r0)
            java.lang.String r0 = r3.getMessage()
            r1.append(r0)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            X.C201955140j.LJII(r2, r0)
            return r4
        L85:
            r3 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r3)
            X.0n63 r2 = X.C1421570n63.LIZIZ
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "IOException:"
            r1.append(r0)
            java.lang.String r0 = r3.getMessage()
            r1.append(r0)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            X.C201955140j.LJII(r2, r0)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C594430NTd.LIZ(int, int, java.lang.String, java.lang.String, java.lang.String, X.05Vn):java.lang.Object");
    }
}
