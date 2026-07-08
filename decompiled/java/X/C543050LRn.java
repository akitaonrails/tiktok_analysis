package X;

import com.ss.android.ugc.aweme.aigc.asynctask.AbsTaskOutput;

/* JADX INFO: renamed from: X.0LRn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.aigc.asynctask.tasks.newframework.infra.AbstractParentTask", f = "AbstractParentTask.kt", l = {202, 207, 208, 210}, m = "stepPrepareTask")
public final class C543050LRn extends AbstractC23140094w {
    public AbstractC542960LRe LL;
    public C09JG LLILLJJLI;
    public AbsTaskOutput LLILLL;
    public /* synthetic */ Object LLILZ;
    public final /* synthetic */ AbstractC543030LRl<C09JG, AbsTaskOutput> LLILZIL;
    public int LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C543050LRn(AbstractC543030LRl<C09JG, AbsTaskOutput> abstractC543030LRl, InterfaceC1364105Vn<? super C543050LRn> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZIL = abstractC543030LRl;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AbstractParentTask@ae12.stepPrepareTask$1");
        this.LLILZ = obj;
        this.LLILZLL |= Integer.MIN_VALUE;
        Object objLJJLIIIJL = this.LLILZIL.LJJLIIIJL(null, null, this);
        C1C7U.LIZIZ("AbstractParentTask@ae12.stepPrepareTask$1");
        return objLJJLIIIJL;
    }
}
