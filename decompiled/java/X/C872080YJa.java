package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0YJa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.ss.android.ugc.aweme.data.source.ReadReceiptDataSource$ReadReceiptDataProcessorExecutor$submit$1", f = "ReadReceiptDataSource.kt", l = {190, 174}, m = "invokeSuspend")
public final class C872080YJa extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public InterfaceC383701eN LL;
    public Object LLILLJJLI;
    public C0YJZ LLILLL;
    public Object LLILZ;
    public int LLILZIL;
    public final /* synthetic */ C0YJZ LLILZLL;

    /* JADX INFO: Incorrect field signature: TT; */
    public final /* synthetic */ InterfaceC872130YJf LLIZ;
    public final /* synthetic */ D LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Incorrect types in method signature: (LX/0YJZ;TT;TD;LX/05Vn<-LX/0YJa;>;)V */
    /* JADX WARN: Multi-variable type inference failed */
    public C872080YJa(C0YJZ c0yjz, InterfaceC872130YJf interfaceC872130YJf, Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZLL = c0yjz;
        this.LLIZ = interfaceC872130YJf;
        this.LLIZLLLIL = obj;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C872080YJa(this.LLILZLL, this.LLIZ, this.LLIZLLLIL, interfaceC1364105Vn);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:0|2|31|(1:(1:(5:6|32|7|25|26)(2:10|11))(1:12))(2:13|(2:15|16))|34|17|(2:19|20)|25|26|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x009a, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x009c, code lost:
    
        r3 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00c3, code lost:
    
        com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00c6, code lost:
    
        r4.LIZIZ(null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00c9, code lost:
    
        throw r0;
     */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 202
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C872080YJa.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
