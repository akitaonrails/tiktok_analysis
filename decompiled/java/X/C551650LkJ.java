package X;

import com.ss.android.vesdk.VEUtils;

/* JADX INFO: renamed from: X.0LkJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.aigc.graph.nodes.node.I2VOfflineProcessingPostProcessingNode", f = "I2VOfflineProcessingPostProcessingNode.kt", l = {363, 364, 373}, m = "generateSegmentListOrThrow")
public final class C551650LkJ extends AbstractC23140094w {
    public Object LL;
    public Object LLILLJJLI;
    public VEUtils.VEVideoFileInfo LLILLL;
    public long LLILZ;
    public /* synthetic */ Object LLILZIL;
    public final /* synthetic */ C551590LkD LLILZLL;
    public int LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C551650LkJ(C551590LkD c551590LkD, InterfaceC1364105Vn<? super C551650LkJ> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZLL = c551590LkD;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("I2VOfflineProcessingPostProcessingNode@f0cf.generateSegmentListOrThrow$1");
        this.LLILZIL = obj;
        this.LLIZ |= Integer.MIN_VALUE;
        Object objLJIIIIZZ = this.LLILZLL.LJIIIIZZ(0, null, null, null, this);
        C1C7U.LIZIZ("I2VOfflineProcessingPostProcessingNode@f0cf.generateSegmentListOrThrow$1");
        return objLJIIIIZZ;
    }
}
