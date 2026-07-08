package X;

import com.ss.android.ugc.aweme.exp.DMInboxChangeRightZoneClickableSizeExp;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0NTg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.internalshare.impl.chatroomeasteregg.UnreadIMAwemeIdProvider$updateAwemeIdList$1", f = "UnreadIMAwemeIdProvider.kt", l = {130, DMInboxChangeRightZoneClickableSizeExp.NEW_DP_SIZE, 88}, m = "invokeSuspend")
public final class C594460NTg extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public InterfaceC383701eN LL;
    public C594480NTi LLILLJJLI;
    public Object LLILLL;
    public int LLILZ;
    public final /* synthetic */ C594480NTi LLILZIL;
    public final /* synthetic */ boolean LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C594460NTg(C594480NTi c594480NTi, boolean z, InterfaceC1364105Vn<? super C594460NTg> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZIL = c594480NTi;
        this.LLILZLL = z;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C594460NTg(this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00b7 A[Catch: all -> 0x019a, TryCatch #0 {all -> 0x019a, blocks: (B:33:0x00b3, B:35:0x00b7, B:36:0x00c0, B:38:0x00c6, B:40:0x00d7, B:43:0x00e1, B:49:0x00ed, B:51:0x00f5, B:57:0x010a, B:58:0x010e, B:59:0x0117, B:61:0x011d, B:63:0x0136, B:64:0x013a, B:65:0x0148, B:67:0x014e, B:69:0x015d, B:71:0x0163), top: B:88:0x00b3 }] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0170  */
    /* JADX WARN: Type inference failed for: r10v1, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r10v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v3, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r10v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r10v8 */
    /* JADX WARN: Type inference failed for: r10v9 */
    /* JADX WARN: Type inference failed for: r8v3, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r8v4, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r8v7, types: [java.util.ArrayList] */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:84:0x019c
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
    public final java.lang.Object invokeSuspend(java.lang.Object r24) {
        /*
            Method dump skipped, instruction units count: 420
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C594460NTg.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
