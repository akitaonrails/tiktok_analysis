package X;

import com.bytedance.android.starship.engine.graph.config.GraphConfig;
import com.bytedance.android.starship.engine.graph.config.NodeConfig;
import com.bytedance.android.starship.strategy.repository.StrategyModel;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0k65, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
@C09DV(c = "com.bytedance.android.starship.strategy.graph.StrategyGraphContainer$initGraphEngine$1", f = "StrategyGraphContainer.kt", l = {88, 89}, m = "invokeSuspend")
public final class C1306270k65 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public Object LL;
    public C1306250k63 LLILLJJLI;
    public Object LLILLL;
    public Object LLILZ;
    public Object LLILZIL;
    public InterfaceC1307160k7W LLILZLL;
    public Object LLIZ;
    public int LLIZLLLIL;
    public final /* synthetic */ InterfaceC1307160k7W LLJ;
    public final /* synthetic */ String LLJI;
    public final /* synthetic */ C1306250k63 LLJIJIL;
    public final /* synthetic */ Map<String, StrategyModel> LLJILJIL;
    public final /* synthetic */ Map<String, GraphConfig> LLJILJILJ;
    public final /* synthetic */ Map<String, NodeConfig> LLJILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1306270k65(InterfaceC1307160k7W interfaceC1307160k7W, String str, C1306250k63 c1306250k63, Map<String, StrategyModel> map, Map<String, GraphConfig> map2, Map<String, NodeConfig> map3, InterfaceC1364105Vn<? super C1306270k65> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLJ = interfaceC1307160k7W;
        this.LLJI = str;
        this.LLJIJIL = c1306250k63;
        this.LLJILJIL = map;
        this.LLJILJILJ = map2;
        this.LLJILLL = map3;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1306270k65(this.LLJ, this.LLJI, this.LLJIJIL, this.LLJILJIL, this.LLJILJILJ, this.LLJILLL, interfaceC1364105Vn);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00f1 A[Catch: all -> 0x012c, TryCatch #9 {all -> 0x012c, blocks: (B:34:0x00e2, B:36:0x00f1, B:37:0x0100, B:39:0x0106, B:41:0x0116, B:42:0x011e), top: B:93:0x00e2 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0124  */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [X.0k7W, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v10, types: [java.lang.AutoCloseable] */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5, types: [java.lang.AutoCloseable] */
    /* JADX WARN: Type inference failed for: r6v6, types: [java.lang.AutoCloseable] */
    /* JADX WARN: Type inference failed for: r6v8, types: [java.lang.AutoCloseable] */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v2, types: [X.0k7W] */
    /* JADX WARN: Type inference failed for: r8v3, types: [X.0k7W] */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r8v8 */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 344
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1306270k65.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
