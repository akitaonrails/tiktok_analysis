package X;

import X.C09JG;
import com.ss.android.ugc.aweme.aigc.asynctask.AbsTaskOutput;

/* JADX INFO: renamed from: X.0LRr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.aigc.asynctask.tasks.newframework.infra.AbstractParentTask", f = "AbstractParentTask.kt", l = {506}, m = "stop$suspendImpl")
public final class C543090LRr<IN extends C09JG, OUT extends AbsTaskOutput> extends AbstractC23140094w {
    public AbstractC543030LRl LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ AbstractC543030LRl<IN, OUT> LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C543090LRr(AbstractC543030LRl<? super IN, ? extends OUT> abstractC543030LRl, InterfaceC1364105Vn<? super C543090LRr> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = abstractC543030LRl;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AbstractParentTask@ae12.stop$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objLJJLIIIJLJLI = AbstractC543030LRl.LJJLIIIJLJLI(this.LLILLL, this);
        C1C7U.LIZIZ("AbstractParentTask@ae12.stop$1");
        return objLJJLIIIJLJLI;
    }
}
