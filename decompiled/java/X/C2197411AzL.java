package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.1AzL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
@C09DV(c = "com.ss.android.ugc.aweme.minis.payment.MinisRechargeBeanTask$startRechargeFlow$1", f = "MinisRechargeBeanTask.kt", l = {234}, m = "invokeSuspend")
public final class C2197411AzL extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public C2197471AzR LL;
    public int LLILLJJLI;
    public /* synthetic */ Object LLILLL;
    public final /* synthetic */ C2197471AzR LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ long LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2197411AzL(C2197471AzR c2197471AzR, String str, long j, InterfaceC1364105Vn<? super C2197411AzL> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZ = c2197471AzR;
        this.LLILZIL = str;
        this.LLILZLL = j;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C2197411AzL c2197411AzL = new C2197411AzL(this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
        c2197411AzL.LLILLL = obj;
        return c2197411AzL;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:0|2|(1:(1:5)(2:38|39))(10:9|(1:13)|14|(2:16|(2:29|7)(4:22|(1:24)|25|(2:27|28)))|8|40|30|(1:32)(1:35)|36|37)|6|7|8|40|30|(0)(0)|36|37) */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0092, code lost:
    
        r1 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0093, code lost:
    
        com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1);
        X.AbstractC2126608Uu.getCompatibleException(r1);
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x008b A[Catch: ExecutionException -> 0x0092, TRY_LEAVE, TryCatch #0 {ExecutionException -> 0x0092, blocks: (B:30:0x0085, B:32:0x008b), top: B:40:0x0085 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0099  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r19) {
        /*
            Method dump skipped, instruction units count: 220
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2197411AzL.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
