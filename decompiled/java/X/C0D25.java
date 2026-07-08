package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0D25, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.commercialize.ucp.impl.data.network.fetcher.UcpAsyncFetcher$startBackgroundRetry$1", f = "UcpAsyncFetcher.kt", l = {130, 141, 157}, m = "invokeSuspend")
public final class C0D25 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public int LLILLJJLI;
    public int LLILLL;
    public int LLILZ;
    public final /* synthetic */ C0D27<T> LLILZIL;
    public final /* synthetic */ String LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0D25(C0D27<T> c0d27, String str, InterfaceC1364105Vn<? super C0D25> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZIL = c0d27;
        this.LLILZLL = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0D25(this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:23|(1:25)|61|26|(3:28|59|60)|63|29|(0)(0)|39|(0)(2:41|42)) */
    /* JADX WARN: Can't wrap try/catch for region: R(7:10|(2:65|11)|63|29|(1:31)(1:32)|39|(6:43|(2:53|(1:55))(3:45|(1:47)|(4:49|(2:51|52)|8|9))|56|(4:14|(2:16|17)|19|(10:23|(1:25)|61|26|(3:28|59|60)|63|29|(0)(0)|39|(0)(2:41|42))(2:21|22))|8|9)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00bd, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00bf, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0090 A[Catch: Exception -> 0x00bd, TryCatch #1 {Exception -> 0x00bd, blocks: (B:29:0x008c, B:31:0x0090, B:32:0x0095), top: B:63:0x008c }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0095 A[Catch: Exception -> 0x00bd, TRY_LEAVE, TryCatch #1 {Exception -> 0x00bd, blocks: (B:29:0x008c, B:31:0x0090, B:32:0x0095), top: B:63:0x008c }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00df  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x0088 -> B:63:0x008c). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x00c2 -> B:39:0x00cd). Please report as a decompilation issue!!! */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            Method dump skipped, instruction units count: 286
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0D25.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
