package X;

import com.ss.android.ugc.aweme.framework.services.IRetrofit;
import com.ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.texttoimage.Text2ImageAIGCApi;
import com.ss.android.ugc.aweme.tools.AVApi;

/* JADX INFO: renamed from: X.0MdT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C572890MdT {
    public final Text2ImageAIGCApi LIZ;

    static {
        AVApi aVApi = (AVApi) PluggableExtentionKt.pluggableSpi$default(AVApi.class, false, false, false, 14, null);
        if (aVApi != null) {
            aVApi.LIZ();
        }
    }

    public C572890MdT() {
        IRetrofit iRetrofitCreateNewRetrofit;
        IRetrofitService iRetrofitService = (IRetrofitService) PluggableExtentionKt.pluggableSpi$default(IRetrofitService.class, false, false, false, 14, null);
        this.LIZ = (iRetrofitService == null || (iRetrofitCreateNewRetrofit = iRetrofitService.createNewRetrofit(C0CQT.LIZJ)) == null) ? null : (Text2ImageAIGCApi) iRetrofitCreateNewRetrofit.create(Text2ImageAIGCApi.class);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ(java.lang.String r7, X.InterfaceC1364105Vn<? super com.ss.android.ugc.aweme.base.api.BaseResponse> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof X.C572900MdU
            if (r0 == 0) goto L20
            r5 = r8
            X.0MdU r5 = (X.C572900MdU) r5
            int r2 = r5.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L20
            int r2 = r2 - r1
            r5.LLILLL = r2
        L12:
            java.lang.Object r1 = r5.LL
            java.lang.Object r4 = X.C099R.LJFF()
            int r0 = r5.LLILLL
            r3 = 1
            if (r0 == 0) goto L2e
            if (r0 != r3) goto L26
            goto L53
        L20:
            X.0MdU r5 = new X.0MdU
            r5.<init>(r6, r8)
            goto L12
        L26:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L2e:
            X.C155000ia.LIZIZ(r1)
            com.ss.android.ugc.aweme.texttoimage.Text2ImageAIGCApi r2 = r6.LIZ     // Catch: java.lang.Exception -> L5b
            if (r2 == 0) goto L59
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()     // Catch: java.lang.Exception -> L5b
            r0 = 91
            r1.append(r0)     // Catch: java.lang.Exception -> L5b
            r1.append(r7)     // Catch: java.lang.Exception -> L5b
            r0 = 93
            r1.append(r0)     // Catch: java.lang.Exception -> L5b
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)     // Catch: java.lang.Exception -> L5b
            r5.LLILLL = r3     // Catch: java.lang.Exception -> L5b
            java.lang.Object r1 = r2.cancel(r0, r5)     // Catch: java.lang.Exception -> L5b
            if (r1 != r4) goto L56
            return r4
        L53:
            X.C155000ia.LIZIZ(r1)     // Catch: java.lang.Exception -> L5b
        L56:
            com.ss.android.ugc.aweme.base.api.BaseResponse r1 = (com.ss.android.ugc.aweme.base.api.BaseResponse) r1     // Catch: java.lang.Exception -> L5b
            return r1
        L59:
            r1 = 0
            return r1
        L5b:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            com.ss.android.ugc.aweme.base.api.BaseResponse r1 = new com.ss.android.ugc.aweme.base.api.BaseResponse
            r1.<init>()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C572890MdT.LIZ(java.lang.String, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZIZ(java.lang.String r8, X.InterfaceC1364105Vn<? super com.ss.android.ugc.aweme.texttoimage.Text2ImageAIGCNotificationResponse> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof X.C572910MdV
            if (r0 == 0) goto L21
            r6 = r9
            X.0MdV r6 = (X.C572910MdV) r6
            int r2 = r6.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L21
            int r2 = r2 - r1
            r6.LLILLL = r2
        L12:
            java.lang.Object r1 = r6.LL
            java.lang.Object r5 = X.C099R.LJFF()
            int r0 = r6.LLILLL
            r4 = 1
            r3 = 0
            if (r0 == 0) goto L2f
            if (r0 != r4) goto L27
            goto L54
        L21:
            X.0MdV r6 = new X.0MdV
            r6.<init>(r7, r9)
            goto L12
        L27:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L2f:
            X.C155000ia.LIZIZ(r1)
            com.ss.android.ugc.aweme.texttoimage.Text2ImageAIGCApi r2 = r7.LIZ     // Catch: java.lang.Exception -> L5b
            if (r2 == 0) goto L5a
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()     // Catch: java.lang.Exception -> L5b
            r0 = 91
            r1.append(r0)     // Catch: java.lang.Exception -> L5b
            r1.append(r8)     // Catch: java.lang.Exception -> L5b
            r0 = 93
            r1.append(r0)     // Catch: java.lang.Exception -> L5b
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)     // Catch: java.lang.Exception -> L5b
            r6.LLILLL = r4     // Catch: java.lang.Exception -> L5b
            java.lang.Object r1 = r2.LIZ(r0, r6)     // Catch: java.lang.Exception -> L5b
            if (r1 != r5) goto L57
            return r5
        L54:
            X.C155000ia.LIZIZ(r1)     // Catch: java.lang.Exception -> L5b
        L57:
            com.ss.android.ugc.aweme.texttoimage.Text2ImageAIGCNotificationResponse r1 = (com.ss.android.ugc.aweme.texttoimage.Text2ImageAIGCNotificationResponse) r1     // Catch: java.lang.Exception -> L5b
            return r1
        L5a:
            return r3
        L5b:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            com.ss.android.ugc.aweme.texttoimage.Text2ImageAIGCNotificationResponse r1 = new com.ss.android.ugc.aweme.texttoimage.Text2ImageAIGCNotificationResponse
            r0 = 3
            r1.<init>(r3, r3, r0, r3)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C572890MdT.LIZIZ(java.lang.String, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZJ(java.lang.String r8, X.InterfaceC1364105Vn<? super com.ss.android.ugc.aweme.texttoimage.Text2ImageAIGCQueryResponse> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof X.C572920MdW
            if (r0 == 0) goto L21
            r6 = r9
            X.0MdW r6 = (X.C572920MdW) r6
            int r2 = r6.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L21
            int r2 = r2 - r1
            r6.LLILLL = r2
        L12:
            java.lang.Object r1 = r6.LL
            java.lang.Object r5 = X.C099R.LJFF()
            int r0 = r6.LLILLL
            r4 = 0
            r3 = 1
            if (r0 == 0) goto L2f
            if (r0 != r3) goto L27
            goto L54
        L21:
            X.0MdW r6 = new X.0MdW
            r6.<init>(r7, r9)
            goto L12
        L27:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L2f:
            X.C155000ia.LIZIZ(r1)
            com.ss.android.ugc.aweme.texttoimage.Text2ImageAIGCApi r2 = r7.LIZ     // Catch: java.lang.Exception -> L5b
            if (r2 == 0) goto L5a
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()     // Catch: java.lang.Exception -> L5b
            r0 = 91
            r1.append(r0)     // Catch: java.lang.Exception -> L5b
            r1.append(r8)     // Catch: java.lang.Exception -> L5b
            r0 = 93
            r1.append(r0)     // Catch: java.lang.Exception -> L5b
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)     // Catch: java.lang.Exception -> L5b
            r6.LLILLL = r3     // Catch: java.lang.Exception -> L5b
            java.lang.Object r1 = r2.query(r0, r6)     // Catch: java.lang.Exception -> L5b
            if (r1 != r5) goto L57
            return r5
        L54:
            X.C155000ia.LIZIZ(r1)     // Catch: java.lang.Exception -> L5b
        L57:
            com.ss.android.ugc.aweme.texttoimage.Text2ImageAIGCQueryResponse r1 = (com.ss.android.ugc.aweme.texttoimage.Text2ImageAIGCQueryResponse) r1     // Catch: java.lang.Exception -> L5b
            return r1
        L5a:
            return r4
        L5b:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            com.ss.android.ugc.aweme.texttoimage.Text2ImageAIGCQueryResponse r0 = new com.ss.android.ugc.aweme.texttoimage.Text2ImageAIGCQueryResponse
            r0.<init>(r4, r3, r4)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C572890MdT.LIZJ(java.lang.String, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZLLL(java.lang.String r9, java.lang.String r10, boolean r11, X.InterfaceC1364105Vn<? super com.ss.android.ugc.aweme.texttoimage.Text2ImageAIGCTextMagicResponse> r12) {
        /*
            r8 = this;
            boolean r0 = r12 instanceof X.C572930MdX
            if (r0 == 0) goto L22
            r6 = r12
            X.0MdX r6 = (X.C572930MdX) r6
            int r2 = r6.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L22
            int r2 = r2 - r1
            r6.LLILLL = r2
        L12:
            java.lang.Object r1 = r6.LL
            java.lang.Object r7 = X.C099R.LJFF()
            int r0 = r6.LLILLL
            r4 = 0
            r3 = 0
            r2 = 1
            if (r0 == 0) goto L30
            if (r0 != r2) goto L28
            goto L5a
        L22:
            X.0MdX r6 = new X.0MdX
            r6.<init>(r8, r12)
            goto L12
        L28:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L30:
            X.C155000ia.LIZIZ(r1)
            com.ss.android.ugc.aweme.texttoimage.Text2ImageAIGCApi r5 = r8.LIZ     // Catch: java.lang.Exception -> L61
            if (r5 == 0) goto L60
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()     // Catch: java.lang.Exception -> L61
            r0 = 91
            r1.append(r0)     // Catch: java.lang.Exception -> L61
            r1.append(r10)     // Catch: java.lang.Exception -> L61
            r0 = 93
            r1.append(r0)     // Catch: java.lang.Exception -> L61
            java.lang.String r1 = X.C2188811AlT.LIZIZ(r1)     // Catch: java.lang.Exception -> L61
            if (r11 == 0) goto L50
            r0 = 1
            goto L51
        L50:
            r0 = 0
        L51:
            r6.LLILLL = r2     // Catch: java.lang.Exception -> L61
            java.lang.Object r1 = r5.LIZIZ(r9, r1, r0, r6)     // Catch: java.lang.Exception -> L61
            if (r1 != r7) goto L5d
            return r7
        L5a:
            X.C155000ia.LIZIZ(r1)     // Catch: java.lang.Exception -> L61
        L5d:
            com.ss.android.ugc.aweme.texttoimage.Text2ImageAIGCTextMagicResponse r1 = (com.ss.android.ugc.aweme.texttoimage.Text2ImageAIGCTextMagicResponse) r1     // Catch: java.lang.Exception -> L61
            return r1
        L60:
            return r3
        L61:
            r1 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)
            boolean r0 = r1 instanceof X.C0XIR
            if (r0 == 0) goto L7a
            com.ss.android.ugc.aweme.texttoimage.Text2ImageAIGCTextMagicResponse r2 = new com.ss.android.ugc.aweme.texttoimage.Text2ImageAIGCTextMagicResponse
            X.093u r1 = (X.C23112093u) r1
            int r0 = r1.getErrorCode()
            java.lang.Integer r1 = X.C2286608xc.LJ(r0)
            r0 = 2
            r2.<init>(r1, r4, r0, r3)
            return r2
        L7a:
            com.ss.android.ugc.aweme.texttoimage.Text2ImageAIGCTextMagicResponse r1 = new com.ss.android.ugc.aweme.texttoimage.Text2ImageAIGCTextMagicResponse
            X.0y1K r0 = X.EnumC1841480y1K.NETWORK_ERROR
            java.lang.String r0 = r0.getType()
            int r0 = com.bytedance.mt.protector.impl.string2number.CastIntegerProtector.parseInt(r0)
            r1.<init>(r3, r0, r2, r3)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C572890MdT.LIZLLL(java.lang.String, java.lang.String, boolean, X.05Vn):java.lang.Object");
    }
}
