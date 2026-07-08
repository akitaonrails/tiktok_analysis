package X;

import android.content.Context;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0uYV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.ss.android.ugc.aweme.pipo.cashier.common.bind.CashierBindPaymentMethodHelper$requestNewBindInfo$1", f = "CashierBindPaymentMethodHelper.kt", l = {883, 909, 1084}, m = "invokeSuspend")
public final class C1708290uYV extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public Object LL;
    public InterfaceC1708270uYT LLILLJJLI;
    public Object LLILLL;
    public C1708990uZd LLILZ;
    public C1708220uYO LLILZIL;
    public Object LLILZLL;
    public int LLIZ;
    public /* synthetic */ Object LLIZLLLIL;
    public final /* synthetic */ C1708320uYY LLJ;
    public final /* synthetic */ String LLJI;
    public final /* synthetic */ boolean LLJIJIL;
    public final /* synthetic */ InterfaceC1708270uYT LLJILJIL;
    public final /* synthetic */ Context LLJILJILJ;
    public final /* synthetic */ C1708990uZd LLJILLL;
    public final /* synthetic */ C1708220uYO LLJJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1708290uYV(C1708320uYY c1708320uYY, String str, boolean z, InterfaceC1708270uYT interfaceC1708270uYT, Context context, C1708990uZd c1708990uZd, C1708220uYO c1708220uYO, InterfaceC1364105Vn<? super C1708290uYV> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLJ = c1708320uYY;
        this.LLJI = str;
        this.LLJIJIL = z;
        this.LLJILJIL = interfaceC1708270uYT;
        this.LLJILJILJ = context;
        this.LLJILLL = c1708990uZd;
        this.LLJJ = c1708220uYO;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1708290uYV c1708290uYV = new C1708290uYV(this.LLJ, this.LLJI, this.LLJIJIL, this.LLJILJIL, this.LLJILJILJ, this.LLJILLL, this.LLJJ, interfaceC1364105Vn);
        c1708290uYV.LLIZLLLIL = obj;
        return c1708290uYV;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(13:0|2|(1:88)|(1:(1:(1:(3:7|8|9)(2:80|81))(6:10|65|74|(2:76|(2:78|79))|8|9))(2:11|12))(25:13|14|(1:16)(1:17)|18|(1:20)(1:21)|22|(1:24)|(1:26)(1:27)|(1:29)|30|(1:32)(1:33)|(1:35)|(2:89|37)(1:38)|(1:40)|86|41|(1:43)|(1:45)(1:46)|(1:48)|49|(1:53)|54|(1:56)(1:58)|57|(2:60|61))|84|62|(3:64|82|83)|65|74|(0)|8|9|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0171, code lost:
    
        r1 = th;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:76:0x018d  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r43) {
        /*
            Method dump skipped, instruction units count: 499
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1708290uYV.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
