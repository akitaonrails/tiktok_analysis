package X;

import com.bytedance.android.starship.engine.graph.config.GraphConfig;
import com.bytedance.android.starship.engine.graph.config.NodeConfig;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0k64, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
@C09DV(c = "com.bytedance.android.starship.strategy.graph.StrategyGraphContainer$update$1$3$costTime$1$1", f = "StrategyGraphContainer.kt", l = {387, 390, 415, 416}, m = "invokeSuspend")
public final class C1306260k64 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public Object LL;
    public Object LLILLJJLI;
    public C1306250k63 LLILLL;
    public Object LLILZ;
    public Object LLILZIL;
    public int LLILZLL;
    public final /* synthetic */ InterfaceC1307160k7W LLIZ;
    public final /* synthetic */ C1306250k63 LLIZLLLIL;
    public final /* synthetic */ List<String> LLJ;
    public final /* synthetic */ Map<String, GraphConfig> LLJI;
    public final /* synthetic */ Map<String, NodeConfig> LLJIJIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1306260k64(InterfaceC1307160k7W interfaceC1307160k7W, C1306250k63 c1306250k63, List<String> list, Map<String, GraphConfig> map, Map<String, NodeConfig> map2, InterfaceC1364105Vn<? super C1306260k64> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLIZ = interfaceC1307160k7W;
        this.LLIZLLLIL = c1306250k63;
        this.LLJ = list;
        this.LLJI = map;
        this.LLJIJIL = map2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1306260k64(this.LLIZ, this.LLIZLLLIL, this.LLJ, this.LLJI, this.LLJIJIL, interfaceC1364105Vn);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:33:0x009b A[Catch: all -> 0x0188, TRY_LEAVE, TryCatch #6 {all -> 0x0188, blocks: (B:16:0x004c, B:31:0x0095, B:33:0x009b, B:34:0x00a1, B:29:0x008e, B:30:0x0091, B:25:0x007a), top: B:110:0x0010 }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00e7 A[Catch: all -> 0x0178, TryCatch #5 {all -> 0x0178, blocks: (B:48:0x00d9, B:49:0x00e1, B:51:0x00e7, B:54:0x00fb, B:56:0x00ff, B:57:0x0103, B:59:0x010a, B:60:0x010e, B:62:0x0114, B:64:0x0122, B:66:0x0126, B:67:0x012a, B:69:0x0130, B:70:0x013a), top: B:112:0x00d9 }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x010a A[Catch: all -> 0x0178, TryCatch #5 {all -> 0x0178, blocks: (B:48:0x00d9, B:49:0x00e1, B:51:0x00e7, B:54:0x00fb, B:56:0x00ff, B:57:0x0103, B:59:0x010a, B:60:0x010e, B:62:0x0114, B:64:0x0122, B:66:0x0126, B:67:0x012a, B:69:0x0130, B:70:0x013a), top: B:112:0x00d9 }] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x015c  */
    /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v35, types: [java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v36 */
    /* JADX WARN: Type inference failed for: r0v37, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v41, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v16 */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.AutoCloseable] */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v7, types: [java.lang.AutoCloseable] */
    /* JADX WARN: Type inference failed for: r4v9, types: [java.lang.AutoCloseable] */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [X.0k63] */
    /* JADX WARN: Type inference failed for: r5v8, types: [X.0k63] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x00b5 -> B:31:0x0095). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:98:0x0190
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
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            Method dump skipped, instruction units count: 408
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1306260k64.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
