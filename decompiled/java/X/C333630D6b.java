package X;

import com.ss.android.ugc.aweme.commercialize.ucp.impl.data.ordersv2.LocalOrderWrapper;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0D6b, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.commercialize.ucp.impl.data.ordersv2.OrderLocalStoreV2$processPendingQueue$2$jobs$1$1", f = "OrdersV2LocalStore.kt", l = {333, 182, 343}, m = "invokeSuspend")
public final class C333630D6b extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public Object LL;
    public Object LLILLJJLI;
    public Object LLILLL;
    public C333640D6c LLILZ;
    public Object LLILZIL;
    public Object LLILZLL;
    public int LLIZ;
    public /* synthetic */ Object LLIZLLLIL;
    public final /* synthetic */ C333640D6c LLJ;
    public final /* synthetic */ String LLJI;
    public final /* synthetic */ C0D6F LLJIJIL;
    public final /* synthetic */ LocalOrderWrapper LLJILJIL;
    public final /* synthetic */ String LLJILJILJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C333630D6b(C333640D6c c333640D6c, String str, C0D6F c0d6f, LocalOrderWrapper localOrderWrapper, String str2, InterfaceC1364105Vn<? super C333630D6b> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLJ = c333640D6c;
        this.LLJI = str;
        this.LLJIJIL = c0d6f;
        this.LLJILJIL = localOrderWrapper;
        this.LLJILJILJ = str2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C333630D6b c333630D6b = new C333630D6b(this.LLJ, this.LLJI, this.LLJIJIL, this.LLJILJIL, this.LLJILJILJ, interfaceC1364105Vn);
        c333630D6b.LLIZLLLIL = obj;
        return c333630D6b;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x016f A[Catch: all -> 0x0225, TryCatch #0 {all -> 0x0225, blocks: (B:53:0x0154, B:54:0x0169, B:56:0x016f, B:58:0x017f, B:61:0x0185, B:63:0x018f, B:64:0x01d3, B:65:0x01f4), top: B:76:0x0154 }] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0185 A[Catch: all -> 0x0225, TryCatch #0 {all -> 0x0225, blocks: (B:53:0x0154, B:54:0x0169, B:56:0x016f, B:58:0x017f, B:61:0x0185, B:63:0x018f, B:64:0x01d3, B:65:0x01f4), top: B:76:0x0154 }] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0182 A[SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x00dc -> B:42:0x00f8). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:38:0x00ea
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
    public final java.lang.Object invokeSuspend(java.lang.Object r25) {
        /*
            Method dump skipped, instruction units count: 565
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C333630D6b.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
