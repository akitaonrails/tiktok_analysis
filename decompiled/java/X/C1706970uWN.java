package X;

import com.bytedance.pipo.verify.base.model.response.GetIdentityPubKeyResponse;
import com.ss.android.ugc.aweme.pipo.common.network.model.BaseResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0uWN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.bytedance.pipo.verify.base.network.NetworkHandler$getIdentityPublicKey$2", f = "NetworkHandler.kt", l = {206}, m = "invokeSuspend")
public final class C1706970uWN extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super C0X52<BaseResponse<GetIdentityPubKeyResponse>>>, Object> {
    public long LL;
    public int LLILLJJLI;
    public final /* synthetic */ C1713530ugx LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1706970uWN(C1713530ugx c1713530ugx, InterfaceC1364105Vn<? super C1706970uWN> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c1713530ugx;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1706970uWN(this.LLILLL, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super C0X52<BaseResponse<GetIdentityPubKeyResponse>>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00b0  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r19) throws org.json.JSONException {
        /*
            r18 = this;
            r2 = r19
            java.lang.String r8 = "NetworkHandler@fac6.getIdentityPublicKey$2"
            X.C1C7U.LIZ(r8)
            java.lang.Object r5 = X.C099R.LJFF()
            r4 = r18
            int r0 = r4.LLILLJJLI
            r11 = 0
            r3 = 1
            if (r0 == 0) goto L20
            if (r0 != r3) goto L18
            long r0 = r4.LL
            goto L95
        L18:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L20:
            X.C155000ia.LIZIZ(r2)
            org.json.JSONObject r1 = new org.json.JSONObject
            r1.<init>()
            X.0ugx r0 = r4.LLILLL
            com.bytedance.pipo.verify.base.model.VerifyDetail r0 = r0.LIZJ()
            if (r0 == 0) goto L79
            java.lang.String r2 = r0.merchantUserId
        L32:
            java.lang.String r0 = "merchant_user_id"
            r1.put(r0, r2)
            com.bytedance.pipo.verify.base.model.request.GetIdentityPubKeyRequest r12 = new com.bytedance.pipo.verify.base.model.request.GetIdentityPubKeyRequest
            long r6 = java.lang.System.currentTimeMillis()
            java.lang.String r13 = java.lang.String.valueOf(r6)
            X.0ugx r0 = r4.LLILLL
            com.bytedance.pipo.verify.base.model.VerifyDetail r0 = r0.LIZJ()
            java.lang.String r16 = ""
            if (r0 == 0) goto L4f
            java.lang.String r14 = r0.merchantId
            if (r14 != 0) goto L51
        L4f:
            r14 = r16
        L51:
            X.0ugx r0 = r4.LLILLL
            com.bytedance.pipo.verify.base.model.VerifyInfo r0 = r0.LIZLLL()
            if (r0 == 0) goto L5d
            java.lang.String r15 = r0.verifyId
            if (r15 != 0) goto L5f
        L5d:
            r15 = r16
        L5f:
            X.0ugx r0 = r4.LLILLL
            com.bytedance.pipo.verify.base.model.VerifyInfo r0 = r0.LIZLLL()
            if (r0 == 0) goto L6d
            java.lang.String r0 = r0.verifyType
            if (r0 == 0) goto L6d
            r16 = r0
        L6d:
            java.lang.String r17 = X.C786410Ut5.J3(r1)
            r12.<init>(r13, r14, r15, r16, r17)
            long r0 = java.lang.System.currentTimeMillis()
            goto L7b
        L79:
            r2 = r11
            goto L32
        L7b:
            X.0ugx r2 = r4.LLILLL     // Catch: java.lang.Throwable -> La0
            X.01GW r2 = r2.LIZIZ     // Catch: java.lang.Throwable -> La0
            java.lang.Object r2 = r2.getValue()     // Catch: java.lang.Throwable -> La0
            com.bytedance.pipo.verify.base.network.api.VerifyApiService r2 = (com.bytedance.pipo.verify.base.network.api.VerifyApiService) r2     // Catch: java.lang.Throwable -> La0
            if (r2 == 0) goto Lc4
            r4.LL = r0     // Catch: java.lang.Throwable -> La0
            r4.LLILLJJLI = r3     // Catch: java.lang.Throwable -> La0
            java.lang.Object r2 = r2.getIdentifyPubkey(r12, r4)     // Catch: java.lang.Throwable -> La0
            if (r2 != r5) goto L98
            X.C1C7U.LIZIZ(r8)
            return r5
        L95:
            X.C155000ia.LIZIZ(r2)     // Catch: java.lang.Throwable -> La2
        L98:
            X.0X52 r2 = (X.C0X52) r2     // Catch: java.lang.Throwable -> La2
            if (r2 == 0) goto Lc4
            X.C1C7U.LIZIZ(r8)     // Catch: java.lang.Throwable -> La2
            return r2
        La0:
            r3 = move-exception
            goto La3
        La2:
            r3 = move-exception
        La3:
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r3)
            X.0ugx r2 = r4.LLILLL
            X.0uh1 r2 = r2.LIZ
            X.0uhJ r9 = r2.LJII()
            if (r9 == 0) goto Lc4
            java.lang.String r10 = "/wallet/v1/user/exchange_session"
            java.lang.String r13 = r3.toString()
            long r2 = java.lang.System.currentTimeMillis()
            long r2 = r2 - r0
            java.lang.Long r14 = X.C2286608xc.LJFF(r2)
            r15 = 6
            r12 = r11
            X.C1713750uhJ.LJI(r9, r10, r11, r12, r13, r14, r15)
        Lc4:
            X.C1C7U.LIZIZ(r8)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1706970uWN.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
