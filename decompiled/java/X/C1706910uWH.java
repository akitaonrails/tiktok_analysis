package X;

import com.bytedance.pipo.verify.base.model.response.GetPinPublicKeyResponse;
import com.ss.android.ugc.aweme.pipo.common.network.model.BaseResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0uWH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.bytedance.pipo.verify.base.network.NetworkHandler$getPinPublicKey$2", f = "NetworkHandler.kt", l = {174}, m = "invokeSuspend")
public final class C1706910uWH extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super C0X52<BaseResponse<GetPinPublicKeyResponse>>>, Object> {
    public long LL;
    public int LLILLJJLI;
    public final /* synthetic */ C1713530ugx LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1706910uWH(C1713530ugx c1713530ugx, InterfaceC1364105Vn<? super C1706910uWH> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c1713530ugx;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1706910uWH(this.LLILLL, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x005d  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            r14 = this;
            java.lang.String r6 = "NetworkHandler@fac6.getPinPublicKey$2"
            X.C1C7U.LIZ(r6)
            java.lang.Object r5 = X.C099R.LJFF()
            int r0 = r14.LLILLJJLI
            r4 = 1
            if (r0 == 0) goto L1b
            if (r0 != r4) goto L13
            long r0 = r14.LL
            goto L42
        L13:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L1b:
            X.C155000ia.LIZIZ(r15)
            long r0 = java.lang.System.currentTimeMillis()
            X.0ugx r2 = r14.LLILLL     // Catch: java.lang.Exception -> L4d
            X.01GW r2 = r2.LIZJ     // Catch: java.lang.Exception -> L4d
            java.lang.Object r3 = r2.getValue()     // Catch: java.lang.Exception -> L4d
            com.bytedance.pipo.verify.base.network.api.WalletApiService r3 = (com.bytedance.pipo.verify.base.network.api.WalletApiService) r3     // Catch: java.lang.Exception -> L4d
            if (r3 == 0) goto L72
            X.0ugx r2 = r14.LLILLL     // Catch: java.lang.Exception -> L4d
            java.lang.String r2 = r2.LIZIZ()     // Catch: java.lang.Exception -> L4d
            r14.LL = r0     // Catch: java.lang.Exception -> L4d
            r14.LLILLJJLI = r4     // Catch: java.lang.Exception -> L4d
            java.lang.Object r15 = r3.getPinPublicKey(r2, r14)     // Catch: java.lang.Exception -> L4d
            if (r15 != r5) goto L45
            X.C1C7U.LIZIZ(r6)
            return r5
        L42:
            X.C155000ia.LIZIZ(r15)     // Catch: java.lang.Exception -> L4f
        L45:
            X.0X52 r15 = (X.C0X52) r15     // Catch: java.lang.Exception -> L4f
            if (r15 == 0) goto L72
            X.C1C7U.LIZIZ(r6)     // Catch: java.lang.Exception -> L4f
            return r15
        L4d:
            r3 = move-exception
            goto L50
        L4f:
            r3 = move-exception
        L50:
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r3)
            X.0ugx r2 = r14.LLILLL
            X.0uh1 r2 = r2.LIZ
            X.0uhJ r7 = r2.LJII()
            if (r7 == 0) goto L72
            java.lang.String r8 = "/wallet/v1/user/exchange_session"
            r9 = 0
            java.lang.String r11 = r3.toString()
            long r2 = java.lang.System.currentTimeMillis()
            long r2 = r2 - r0
            java.lang.Long r12 = X.C2286608xc.LJFF(r2)
            r13 = 6
            r10 = r9
            X.C1713750uhJ.LJI(r7, r8, r9, r10, r11, r12, r13)
        L72:
            X.C1C7U.LIZIZ(r6)
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1706910uWH.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super C0X52<BaseResponse<GetPinPublicKeyResponse>>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
