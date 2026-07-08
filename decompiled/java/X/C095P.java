package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.095P, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.autocut.sdk.smartmovie.domain.SmartMovieNLEPipeline$execute$1$1", f = "SmartMovieNLEPipeline.kt", l = {64, 85, 86}, m = "invokeSuspend")
public final class C095P extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public C09AE LL;
    public C09AE LLILLJJLI;
    public C09AE LLILLL;
    public InterfaceC824740WWy LLILZ;
    public int LLILZIL;
    public /* synthetic */ Object LLILZLL;
    public final /* synthetic */ C23186096q LLIZ;
    public final /* synthetic */ InterfaceC346701Wf<C096H> LLIZLLLIL;
    public final /* synthetic */ C095X LLJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C095P(C23186096q c23186096q, InterfaceC346701Wf<? super C096H> interfaceC346701Wf, C095X c095x, InterfaceC1364105Vn<? super C095P> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLIZ = c23186096q;
        this.LLIZLLLIL = interfaceC346701Wf;
        this.LLJ = c095x;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C095P c095p = new C095P(this.LLIZ, this.LLIZLLLIL, this.LLJ, interfaceC1364105Vn);
        c095p.LLILZLL = obj;
        return c095p;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0202 A[Catch: all -> 0x0238, TryCatch #0 {all -> 0x0238, blocks: (B:33:0x01e7, B:36:0x01fa, B:38:0x0202), top: B:55:0x01e7 }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0226  */
    /* JADX WARN: Type inference failed for: r4v0, types: [X.0955] */
    /* JADX WARN: Type inference failed for: r4v1, types: [X.095E, X.1DEK] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v3, types: [X.0955, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v0, types: [X.09AE] */
    /* JADX WARN: Type inference failed for: r5v1, types: [X.0956, X.09AE] */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v5, types: [X.09AE] */
    /* JADX WARN: Type inference failed for: r5v6, types: [X.09AE] */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:39:0x021b -> B:55:0x01e7). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:51:0x023f
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1182)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r39) {
        /*
            Method dump skipped, instruction units count: 590
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C095P.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
