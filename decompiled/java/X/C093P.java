package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.093P, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.slideslip.fullwidthhorizontal.EffectPrefetcherComponentImpl$runQueueDrainer$1$1$1$1", f = "EffectPrefetcherComponent.kt", l = {298, 239}, m = "invokeSuspend")
public final class C093P extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public InterfaceC383701eN LL;
    public C093Q LLILLJJLI;
    public int LLILLL;
    public /* synthetic */ Object LLILZ;
    public final /* synthetic */ C093Q LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C093P(C093Q c093q, InterfaceC1364105Vn<? super C093P> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZIL = c093q;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C093P c093p = new C093P(this.LLILZIL, interfaceC1364105Vn);
        c093p.LLILZ = obj;
        return c093p;
    }

    /* JADX WARN: Path cross not found for [B:45:0x00cf, B:47:0x00d3], limit reached: 70 */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004e A[Catch: Exception -> 0x00ec, TRY_ENTER, TryCatch #2 {Exception -> 0x00ec, blocks: (B:43:0x00bf, B:45:0x00cf, B:48:0x00d5, B:19:0x004e), top: B:65:0x00bf }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x006c A[Catch: all -> 0x00e1, TryCatch #0 {all -> 0x00e1, blocks: (B:22:0x0062, B:25:0x006c, B:27:0x0079, B:29:0x007d, B:30:0x0081), top: B:61:0x0062, outer: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0092 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:53:0x00e9 -> B:16:0x003e). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:55:0x00ec
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
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            Method dump skipped, instruction units count: 249
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C093P.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
