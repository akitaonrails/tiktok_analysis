package X;

import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.socialavatar.mixstudio.network.MixStudioNetworkAPI;

/* JADX INFO: renamed from: X.0HT4, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0HT4 implements InterfaceC441440HSs {
    public static final C0HTA LIZIZ = new C0HTA();
    public static final C1910890zpH LIZJ = C1910890zpH.LIZLLL.LIZ(EnumC1910860zpE.SOCIAL_AVATAR);
    public final MixStudioNetworkAPI LIZ;

    public C0HT4(MixStudioNetworkAPI mixStudioNetworkAPI) {
        this.LIZ = mixStudioNetworkAPI;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0020  */
    @Override // X.InterfaceC441440HSs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ(X.InterfaceC1364105Vn<? super com.ss.android.ugc.aweme.socialavatar.mixstudio.network.MixStudioStatusResponse> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof X.C0HTE
            if (r0 == 0) goto L20
            r4 = r6
            X.0HTE r4 = (X.C0HTE) r4
            int r2 = r4.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L20
            int r2 = r2 - r1
            r4.LLILLL = r2
        L12:
            java.lang.Object r2 = r4.LL
            java.lang.Object r3 = X.C099R.LJFF()
            int r0 = r4.LLILLL
            r1 = 1
            if (r0 == 0) goto L32
            if (r0 != r1) goto L2a
            goto L26
        L20:
            X.0HTE r4 = new X.0HTE
            r4.<init>(r5, r6)
            goto L12
        L26:
            X.C155000ia.LIZIZ(r2)     // Catch: java.io.IOException -> L47 X.C0XIR -> L53 java.net.SocketTimeoutException -> L5f X.C094W -> L6b
            return r2
        L2a:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L32:
            X.C155000ia.LIZIZ(r2)
            X.0HT8 r2 = new X.0HT8     // Catch: java.io.IOException -> L47 X.C0XIR -> L53 java.net.SocketTimeoutException -> L5f X.C094W -> L6b
            r0 = 0
            r2.<init>(r5, r0)     // Catch: java.io.IOException -> L47 X.C0XIR -> L53 java.net.SocketTimeoutException -> L5f X.C094W -> L6b
            r4.LLILLL = r1     // Catch: java.io.IOException -> L47 X.C0XIR -> L53 java.net.SocketTimeoutException -> L5f X.C094W -> L6b
            r0 = 10000(0x2710, double:4.9407E-320)
            java.lang.Object r2 = X.C099A.LIZIZ(r0, r2, r4)     // Catch: java.io.IOException -> L47 X.C0XIR -> L53 java.net.SocketTimeoutException -> L5f X.C094W -> L6b
            if (r2 != r3) goto L46
            return r3
        L46:
            return r2
        L47:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            X.0HSx r1 = new X.0HSx
            X.0HSu r0 = X.EnumC441460HSu.NETWORK_EXCEPTION
            r1.<init>(r0)
            throw r1
        L53:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            X.0HSx r1 = new X.0HSx
            X.0HSu r0 = X.EnumC441460HSu.NETWORK_EXCEPTION
            r1.<init>(r0)
            throw r1
        L5f:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            X.0HSx r1 = new X.0HSx
            X.0HSu r0 = X.EnumC441460HSu.TIMEOUT
            r1.<init>(r0)
            throw r1
        L6b:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            X.0HSx r1 = new X.0HSx
            X.0HSu r0 = X.EnumC441460HSu.TIMEOUT
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0HT4.LIZ(X.05Vn):java.lang.Object");
    }

    @Override // X.InterfaceC441440HSs
    public final Object LIZIZ(String str, C441410HSp c441410HSp) {
        return LIZIZ.LIZ(c441410HSp, new C0HT7(this, str, null));
    }

    @Override // X.InterfaceC441440HSs
    public final Object LIZJ(Integer num, InterfaceC1364105Vn<? super BaseResponse> interfaceC1364105Vn) {
        return LIZIZ.LIZ(interfaceC1364105Vn, new C0HT9(this, num, null));
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0020  */
    @Override // X.InterfaceC441440HSs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZLLL(com.ss.android.ugc.aweme.socialavatar.mixstudio.network.MixStudioAppendRequest r6, X.InterfaceC1364105Vn<? super com.ss.android.ugc.aweme.base.api.BaseResponse> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof X.C0HTD
            if (r0 == 0) goto L20
            r4 = r7
            X.0HTD r4 = (X.C0HTD) r4
            int r2 = r4.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L20
            int r2 = r2 - r1
            r4.LLILLL = r2
        L12:
            java.lang.Object r2 = r4.LL
            java.lang.Object r3 = X.C099R.LJFF()
            int r0 = r4.LLILLL
            r1 = 1
            if (r0 == 0) goto L32
            if (r0 != r1) goto L2a
            goto L26
        L20:
            X.0HTD r4 = new X.0HTD
            r4.<init>(r5, r7)
            goto L12
        L26:
            X.C155000ia.LIZIZ(r2)     // Catch: java.io.IOException -> L47 X.C0XIR -> L53 java.net.SocketTimeoutException -> L70 X.C094W -> L7c
            return r2
        L2a:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L32:
            X.C155000ia.LIZIZ(r2)
            X.0HT6 r2 = new X.0HT6     // Catch: java.io.IOException -> L47 X.C0XIR -> L53 java.net.SocketTimeoutException -> L70 X.C094W -> L7c
            r0 = 0
            r2.<init>(r5, r6, r0)     // Catch: java.io.IOException -> L47 X.C0XIR -> L53 java.net.SocketTimeoutException -> L70 X.C094W -> L7c
            r4.LLILLL = r1     // Catch: java.io.IOException -> L47 X.C0XIR -> L53 java.net.SocketTimeoutException -> L70 X.C094W -> L7c
            r0 = 10000(0x2710, double:4.9407E-320)
            java.lang.Object r2 = X.C099A.LIZIZ(r0, r2, r4)     // Catch: java.io.IOException -> L47 X.C0XIR -> L53 java.net.SocketTimeoutException -> L70 X.C094W -> L7c
            if (r2 != r3) goto L46
            return r3
        L46:
            return r2
        L47:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            X.0HTG r1 = new X.0HTG
            X.0HTF r0 = X.C0HTF.NETWORK_EXCEPTION
            r1.<init>(r0)
            throw r1
        L53:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            int r1 = r0.getErrorCode()
            r0 = 3002555(0x2dd0bb, float:4.207476E-39)
            if (r1 != r0) goto L68
            X.0HTG r1 = new X.0HTG
            X.0HTF r0 = X.C0HTF.TASK_SUBMISSION
            r1.<init>(r0)
            throw r1
        L68:
            X.0HTG r1 = new X.0HTG
            X.0HTF r0 = X.C0HTF.NETWORK_EXCEPTION
            r1.<init>(r0)
            throw r1
        L70:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            X.0HTG r1 = new X.0HTG
            X.0HTF r0 = X.C0HTF.TIMEOUT
            r1.<init>(r0)
            throw r1
        L7c:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            X.0HTG r1 = new X.0HTG
            X.0HTF r0 = X.C0HTF.TIMEOUT
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0HT4.LIZLLL(com.ss.android.ugc.aweme.socialavatar.mixstudio.network.MixStudioAppendRequest, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0020  */
    @Override // X.InterfaceC441440HSs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object generate(com.ss.android.ugc.aweme.socialavatar.mixstudio.network.MixStudioCreationRequest r6, X.InterfaceC1364105Vn<? super com.ss.android.ugc.aweme.socialavatar.mixstudio.network.MixStudioCreationResponse> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof X.C0HTC
            if (r0 == 0) goto L20
            r4 = r7
            X.0HTC r4 = (X.C0HTC) r4
            int r2 = r4.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L20
            int r2 = r2 - r1
            r4.LLILLL = r2
        L12:
            java.lang.Object r2 = r4.LL
            java.lang.Object r3 = X.C099R.LJFF()
            int r0 = r4.LLILLL
            r1 = 1
            if (r0 == 0) goto L32
            if (r0 != r1) goto L2a
            goto L26
        L20:
            X.0HTC r4 = new X.0HTC
            r4.<init>(r5, r7)
            goto L12
        L26:
            X.C155000ia.LIZIZ(r2)     // Catch: java.io.IOException -> L47 X.C0XIR -> L53 java.net.SocketTimeoutException -> L86 X.C094W -> L92
            return r2
        L2a:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L32:
            X.C155000ia.LIZIZ(r2)
            X.0HT5 r2 = new X.0HT5     // Catch: java.io.IOException -> L47 X.C0XIR -> L53 java.net.SocketTimeoutException -> L86 X.C094W -> L92
            r0 = 0
            r2.<init>(r5, r6, r0)     // Catch: java.io.IOException -> L47 X.C0XIR -> L53 java.net.SocketTimeoutException -> L86 X.C094W -> L92
            r4.LLILLL = r1     // Catch: java.io.IOException -> L47 X.C0XIR -> L53 java.net.SocketTimeoutException -> L86 X.C094W -> L92
            r0 = 10000(0x2710, double:4.9407E-320)
            java.lang.Object r2 = X.C099A.LIZIZ(r0, r2, r4)     // Catch: java.io.IOException -> L47 X.C0XIR -> L53 java.net.SocketTimeoutException -> L86 X.C094W -> L92
            if (r2 != r3) goto L46
            return r3
        L46:
            return r2
        L47:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            X.0HSw r1 = new X.0HSw
            X.0HT2 r0 = X.C0HT2.NETWORK_EXCEPTION
            r1.<init>(r0)
            throw r1
        L53:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            int r0 = r0.getErrorCode()
            switch(r0) {
                case 3002554: goto L66;
                case 3002555: goto L6e;
                case 3002556: goto L76;
                case 3002557: goto L7e;
                default: goto L5e;
            }
        L5e:
            X.0HSw r1 = new X.0HSw
            X.0HT2 r0 = X.C0HT2.NETWORK_EXCEPTION
            r1.<init>(r0)
            throw r1
        L66:
            X.0HSw r1 = new X.0HSw
            X.0HT2 r0 = X.C0HT2.QUOTA_CHECK
            r1.<init>(r0)
            throw r1
        L6e:
            X.0HSw r1 = new X.0HSw
            X.0HT2 r0 = X.C0HT2.TASK_SUBMISSION
            r1.<init>(r0)
            throw r1
        L76:
            X.0HSw r1 = new X.0HSw
            X.0HT2 r0 = X.C0HT2.IMAGE_FETCH
            r1.<init>(r0)
            throw r1
        L7e:
            X.0HSw r1 = new X.0HSw
            X.0HT2 r0 = X.C0HT2.TNS_CHECK
            r1.<init>(r0)
            throw r1
        L86:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            X.0HSw r1 = new X.0HSw
            X.0HT2 r0 = X.C0HT2.TIMEOUT
            r1.<init>(r0)
            throw r1
        L92:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            X.0HSw r1 = new X.0HSw
            X.0HT2 r0 = X.C0HT2.TIMEOUT
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0HT4.generate(com.ss.android.ugc.aweme.socialavatar.mixstudio.network.MixStudioCreationRequest, X.05Vn):java.lang.Object");
    }
}
