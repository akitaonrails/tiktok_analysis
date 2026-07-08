package X;

import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;

/* JADX INFO: renamed from: X.0LuB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.aigc.graph.net.AIGCWorkflowNetwork", f = "AIGCWorkflowNetwork.kt", l = {BaseNotice.RECOMMEND_LIVE}, m = "createAIGCTaskLongTimeout")
public final class C557770LuB extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C557760LuA LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C557770LuB(C557760LuA c557760LuA, InterfaceC1364105Vn<? super C557770LuB> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = c557760LuA;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AIGCWorkflowNetwork@9b9a.createAIGCTaskLongTimeout$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objLIZIZ = this.LLILLJJLI.LIZIZ(null, this);
        C1C7U.LIZIZ("AIGCWorkflowNetwork@9b9a.createAIGCTaskLongTimeout$1");
        return objLIZIZ;
    }
}
