package X;

import android.content.Context;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.03bm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.osp.payment.backup.BackupPaymentFlowCoordinator$openEnableGuide$1", f = "BackupPaymentFlowCoordinator.kt", l = {501}, m = "invokeSuspend")
public final class C877203bm extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public Object LL;
    public int LLILLJJLI;
    public final /* synthetic */ C876403be LLILLL;
    public final /* synthetic */ C867003a8 LLILZ;
    public final /* synthetic */ boolean LLILZIL;
    public final /* synthetic */ Function0<Unit> LLILZLL;
    public final /* synthetic */ Context LLIZ;
    public final /* synthetic */ C877303bn LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C877203bm(C876403be c876403be, C867003a8 c867003a8, boolean z, Function0<Unit> function0, Context context, C877303bn c877303bn, InterfaceC1364105Vn<? super C877203bm> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c876403be;
        this.LLILZ = c867003a8;
        this.LLILZIL = z;
        this.LLILZLL = function0;
        this.LLIZ = context;
        this.LLIZLLLIL = c877303bn;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C877203bm(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003b A[PHI: r2
      0x003b: PHI (r2v6 com.ss.android.ugc.aweme.ecommerce.base.payment.dto.Cashier) = 
      (r2v1 com.ss.android.ugc.aweme.ecommerce.base.payment.dto.Cashier)
      (r2v9 com.ss.android.ugc.aweme.ecommerce.base.payment.dto.Cashier)
     binds: [B:13:0x0039, B:11:0x0030] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r22) {
        /*
            Method dump skipped, instruction units count: 317
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C877203bm.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
