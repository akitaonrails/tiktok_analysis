package X;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0zFe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
@C09DV(c = "com.bytedance.android.livesdk.broadcast.interaction.widget.livecenter.journey.LiveJourneyViewHolder$claimAllRewards$1", f = "LiveJourneyViewHolder.kt", l = {289}, m = "invokeSuspend")
public final class C1888800zFe extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public C1888810zFf LL;
    public C118300cf LLILLJJLI;
    public Object LLILLL;
    public Object LLILZ;
    public int LLILZIL;
    public final /* synthetic */ List<Integer> LLILZLL;
    public final /* synthetic */ C1888810zFf LLIZ;
    public final /* synthetic */ DialogC780480UjW LLIZLLLIL;
    public final /* synthetic */ C118300cf LLJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1888800zFe(List<Integer> list, C1888810zFf c1888810zFf, DialogC780480UjW dialogC780480UjW, C118300cf c118300cf, InterfaceC1364105Vn<? super C1888800zFe> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZLL = list;
        this.LLIZ = c1888810zFf;
        this.LLIZLLLIL = dialogC780480UjW;
        this.LLJ = c118300cf;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1888800zFe(this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0074 A[Catch: Exception -> 0x00d3, TryCatch #2 {Exception -> 0x00d3, blocks: (B:18:0x0066, B:20:0x0074, B:22:0x0080, B:23:0x00b2, B:25:0x00c6), top: B:53:0x0066 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00dd  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0072 -> B:12:0x003a). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0080 -> B:12:0x003a). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x00c4 -> B:12:0x003a). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x00c6 -> B:12:0x003a). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:28:0x00d6
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
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            Method dump skipped, instruction units count: 302
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1888800zFe.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
