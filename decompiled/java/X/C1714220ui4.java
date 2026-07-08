package X;

import com.ss.android.ugc.aweme.verify.otp.OtpFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0ui4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.ss.android.ugc.aweme.verify.otp.OtpFragment$onValidateCode$1$1", f = "OtpFragment.kt", l = {693, 697}, m = "invokeSuspend")
public final class C1714220ui4 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public long LL;
    public int LLILLJJLI;
    public final /* synthetic */ OtpFragment LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ String LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1714220ui4(OtpFragment otpFragment, String str, String str2, InterfaceC1364105Vn<? super C1714220ui4> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = otpFragment;
        this.LLILZ = str;
        this.LLILZIL = str2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1714220ui4(this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0083  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) throws org.json.JSONException {
        /*
            r14 = this;
            java.lang.String r6 = "OtpFragment@1dbf.onValidateCode$1$1"
            X.C1C7U.LIZ(r6)
            java.lang.Object r1 = X.C099R.LJFF()
            int r0 = r14.LLILLJJLI
            r2 = 2
            r4 = 1
            r9 = 0
            if (r0 == 0) goto L1d
            if (r0 == r4) goto L57
            if (r0 != r2) goto L87
            X.C155000ia.LIZIZ(r15)
        L17:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r6)
            return r0
        L1d:
            X.C155000ia.LIZIZ(r15)
            org.json.JSONObject r5 = new org.json.JSONObject
            r5.<init>()
            java.lang.String r3 = r14.LLILZ
            java.lang.String r0 = "code"
            r5.put(r0, r3)
            long r10 = java.lang.System.currentTimeMillis()
            com.ss.android.ugc.aweme.verify.otp.OtpFragment r0 = r14.LLILLL
            X.0ui0 r3 = r0.iS()
            java.lang.String r0 = "DoVerify"
            r3.LJIIIZ(r0)
            com.ss.android.ugc.aweme.verify.otp.OtpFragment r0 = r14.LLILLL
            X.0uh1 r3 = r0.SR()
            if (r3 == 0) goto L55
            java.lang.String r0 = X.C786410Ut5.J3(r5)
            r14.LL = r10
            r14.LLILLJJLI = r4
            java.lang.Object r15 = X.C1713570uh1.LIZIZ(r3, r0, r14)
            if (r15 != r1) goto L5c
            X.C1C7U.LIZIZ(r6)
            return r1
        L55:
            r15 = r9
            goto L5e
        L57:
            long r10 = r14.LL
            X.C155000ia.LIZIZ(r15)
        L5c:
            X.0X52 r15 = (X.C0X52) r15
        L5e:
            if (r15 == 0) goto L64
            T r9 = r15.LIZIZ
            com.ss.android.ugc.aweme.pipo.common.network.model.BaseResponse r9 = (com.ss.android.ugc.aweme.pipo.common.network.model.BaseResponse) r9
        L64:
            com.ss.android.ugc.aweme.verify.otp.OtpFragment r0 = r14.LLILLL
            X.0ui0 r0 = r0.iS()
            r0.LJIIJ(r15)
            X.1DFH r0 = X.C0PEM.LIZ
            X.08pq r0 = X.C2107308Nj.LIZ
            X.0uik r7 = new X.0uik
            com.ss.android.ugc.aweme.verify.otp.OtpFragment r8 = r14.LLILLL
            java.lang.String r12 = r14.LLILZIL
            r13 = 0
            r7.<init>(r8, r9, r10, r12, r13)
            r14.LLILLJJLI = r2
            java.lang.Object r0 = X.C23250099c.LJI(r14, r0, r7)
            if (r0 != r1) goto L17
            X.C1C7U.LIZIZ(r6)
            return r1
        L87:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1714220ui4.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
