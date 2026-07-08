package X;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0EzK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editorpro.aiediting.aigc.panel.base.preview.EPAIGCPreviewComponent$saveSelectedMediaToPersistentStorage$2", f = "EPAIGCPreviewComponent.kt", l = {}, m = "invokeSuspend")
public final class C382600EzK extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super List<C379170Etn>>, Object> {
    public /* synthetic */ Object LL;
    public final /* synthetic */ List<C379170Etn> LLILLJJLI;
    public final /* synthetic */ C382590EzJ LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C382600EzK(List<C379170Etn> list, C382590EzJ c382590EzJ, InterfaceC1364105Vn<? super C382600EzK> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = list;
        this.LLILLL = c382590EzJ;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C382600EzK c382600EzK = new C382600EzK(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
        c382600EzK.LL = obj;
        return c382600EzK;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:30:0x00bb
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1182)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    @Override // njp.a
    public final java.lang.Object invokeSuspend(java.lang.Object r26) {
        /*
            Method dump skipped, instruction units count: 411
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C382600EzK.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super List<C379170Etn>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
