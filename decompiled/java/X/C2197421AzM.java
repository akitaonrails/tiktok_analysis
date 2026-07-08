package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.1AzM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
@C09DV(c = "com.ss.android.ugc.aweme.minis.payment.MinisRechargeAndPayTask$startPayFlow$1", f = "MinisRechargeAndPayTask.kt", l = {71}, m = "invokeSuspend")
public final class C2197421AzM extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public C2197431AzN LL;
    public int LLILLJJLI;
    public final /* synthetic */ C2197431AzN LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ String LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2197421AzM(C2197431AzN c2197431AzN, String str, String str2, InterfaceC1364105Vn<? super C2197421AzM> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c2197431AzN;
        this.LLILZ = str;
        this.LLILZIL = str2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2197421AzM(this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(13:0|2|(1:(1:5)(2:37|38))(10:13|(2:15|(2:28|7)(4:21|(1:23)|24|(2:26|27)))|8|(1:10)(1:12)|11|39|29|(1:31)(1:34)|35|36)|6|7|8|(0)(0)|11|39|29|(0)(0)|35|36) */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00fe, code lost:
    
        r1 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00ff, code lost:
    
        com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1);
        X.AbstractC2126608Uu.getCompatibleException(r1);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00f9 A[Catch: ExecutionException -> 0x00fe, TRY_LEAVE, TryCatch #0 {ExecutionException -> 0x00fe, blocks: (B:29:0x00f3, B:31:0x00f9), top: B:39:0x00f3 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0105  */
    /* JADX WARN: Type inference failed for: r11v0 */
    /* JADX WARN: Type inference failed for: r11v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r11v9 */
    /* JADX WARN: Type inference failed for: r15v0 */
    /* JADX WARN: Type inference failed for: r22v0 */
    /* JADX WARN: Type inference failed for: r4v2, types: [X.11NZ] */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r36) {
        /*
            Method dump skipped, instruction units count: 349
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2197421AzM.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
