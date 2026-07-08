package X;

import X.C09JG;
import com.ss.android.ugc.aweme.aigc.asynctask.AbsTaskOutput;

/* JADX INFO: renamed from: X.0LRm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.aigc.asynctask.tasks.newframework.infra.AbstractParentTask", f = "AbstractParentTask.kt", l = {144, 145, 153, 158, 162, 165, 168, 170}, m = "run$suspendImpl")
public final class C543040LRm<IN extends C09JG, OUT extends AbsTaskOutput> extends AbstractC23140094w {
    public AbstractC543030LRl LL;
    public C09JG LLILLJJLI;
    public Object LLILLL;
    public /* synthetic */ Object LLILZ;
    public final /* synthetic */ AbstractC543030LRl<IN, OUT> LLILZIL;
    public int LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C543040LRm(AbstractC543030LRl<? super IN, ? extends OUT> abstractC543030LRl, InterfaceC1364105Vn<? super C543040LRm> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZIL = abstractC543030LRl;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AbstractParentTask@ae12.run$1");
        this.LLILZ = obj;
        this.LLILZLL |= Integer.MIN_VALUE;
        Object objLJJLIIIJ = AbstractC543030LRl.LJJLIIIJ(this.LLILZIL, null, this);
        C1C7U.LIZIZ("AbstractParentTask@ae12.run$1");
        return objLJJLIIIJ;
    }
}
