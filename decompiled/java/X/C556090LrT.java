package X;

import com.ss.android.ugc.aweme.aigc.graph.plugin.IAIGCWorkflowPlugin;

/* JADX INFO: renamed from: X.0LrT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.plugin.AIGCWorkflowEventHub", f = "AIGCWorkflowEventHub.kt", l = {479}, m = "runPluginStep")
public final class C556090LrT extends AbstractC23140094w {
    public IAIGCWorkflowPlugin LL;
    public C2217908mX LLILLJJLI;
    public /* synthetic */ Object LLILLL;
    public final /* synthetic */ C556080LrS LLILZ;
    public int LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C556090LrT(C556080LrS c556080LrS, InterfaceC1364105Vn<? super C556090LrT> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZ = c556080LrS;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AIGCWorkflowEventHub@14b7.runPluginStep$1");
        this.LLILLL = obj;
        this.LLILZIL |= Integer.MIN_VALUE;
        Object objLJ = this.LLILZ.LJ(null, null, this);
        C1C7U.LIZIZ("AIGCWorkflowEventHub@14b7.runPluginStep$1");
        return objLJ;
    }
}
