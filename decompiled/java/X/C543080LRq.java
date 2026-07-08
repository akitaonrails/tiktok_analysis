package X;

import X.C09JG;
import com.ss.android.ugc.aweme.aigc.asynctask.AbsTaskOutput;

/* JADX INFO: renamed from: X.0LRq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.aigc.asynctask.tasks.newframework.infra.AbstractParentTask", f = "AbstractParentTask.kt", l = {511, 514}, m = "cancel$suspendImpl")
public final class C543080LRq<IN extends C09JG, OUT extends AbsTaskOutput> extends AbstractC23140094w {
    public AbstractC543030LRl LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ AbstractC543030LRl<IN, OUT> LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C543080LRq(AbstractC543030LRl<? super IN, ? extends OUT> abstractC543030LRl, InterfaceC1364105Vn<? super C543080LRq> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = abstractC543030LRl;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AbstractParentTask@ae12.cancel$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objLJJJLL = AbstractC543030LRl.LJJJLL(this.LLILLL, this);
        C1C7U.LIZIZ("AbstractParentTask@ae12.cancel$1");
        return objLJJJLL;
    }
}
