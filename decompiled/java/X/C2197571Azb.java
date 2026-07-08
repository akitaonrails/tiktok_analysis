package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.1Azb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
@C09DV(c = "com.ss.android.ugc.aweme.minis.payment.subscription.flow.MinisSubscriptionBaseTask$startRechargeFlow$1", f = "MinisSubscriptionBaseTask.kt", l = {246}, m = "invokeSuspend")
public final class C2197571Azb extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public C2197541AzY LL;
    public int LLILLJJLI;
    public final /* synthetic */ C2197541AzY LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ String LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2197571Azb(C2197541AzY c2197541AzY, String str, String str2, String str3, InterfaceC1364105Vn<? super C2197571Azb> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c2197541AzY;
        this.LLILZ = str;
        this.LLILZIL = str2;
        this.LLILZLL = str3;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2197571Azb(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00e1 A[PHI: r2
      0x00e1: PHI (r2v15 java.lang.String) = (r2v9 java.lang.String), (r2v16 java.lang.String) binds: [B:32:0x00df, B:30:0x00db] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00e5 A[PHI: r2
      0x00e5: PHI (r2v14 java.lang.String) = (r2v9 java.lang.String), (r2v15 java.lang.String) binds: [B:32:0x00df, B:34:0x00e3] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00e9 A[PHI: r1 r2
      0x00e9: PHI (r1v15 java.lang.String) = (r1v22 java.lang.String), (r1v23 java.lang.String) binds: [B:36:0x00e7, B:34:0x00e3] A[DONT_GENERATE, DONT_INLINE]
      0x00e9: PHI (r2v10 java.lang.String) = (r2v14 java.lang.String), (r2v15 java.lang.String) binds: [B:36:0x00e7, B:34:0x00e3] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Type inference failed for: r2v8, types: [T, com.ss.android.ugc.aweme.minis.model.payment.common.MinisPaymentNetworkResponse] */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r33) {
        /*
            Method dump skipped, instruction units count: 401
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2197571Azb.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
