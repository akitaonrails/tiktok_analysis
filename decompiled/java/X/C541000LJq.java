package X;

import com.ss.android.ugc.aweme.aigc.asynctask.AbsTaskOutput;
import com.ss.android.ugc.aweme.aigc.asynctask.models.PublicTaskInput;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0LJq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.aigc.asynctask.tasks.newframework.infra.AbstractParentTask$startBackgroundTasks$1$1$1", f = "AbstractParentTask.kt", l = {445}, m = "invokeSuspend")
public final class C541000LJq extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ AbstractC543030LRl<C09JG, AbsTaskOutput> LLILLJJLI;
    public final /* synthetic */ AbstractC542960LRe<C09JG, AbsTaskOutput> LLILLL;
    public final /* synthetic */ PublicTaskInput LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C541000LJq(AbstractC543030LRl<C09JG, AbsTaskOutput> abstractC543030LRl, AbstractC542960LRe<C09JG, AbsTaskOutput> abstractC542960LRe, PublicTaskInput publicTaskInput, InterfaceC1364105Vn<? super C541000LJq> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = abstractC543030LRl;
        this.LLILLL = abstractC542960LRe;
        this.LLILZ = publicTaskInput;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C541000LJq(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AbstractParentTask@ae12.startBackgroundTasks$1$1$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            AbstractC543030LRl<C09JG, AbsTaskOutput> abstractC543030LRl = this.LLILLJJLI;
            AbstractC542960LRe<C09JG, AbsTaskOutput> abstractC542960LRe = this.LLILLL;
            PublicTaskInput publicTaskInput = this.LLILZ;
            this.LL = 1;
            if (abstractC543030LRl.LJJLIIIJILLIZJL(abstractC542960LRe, publicTaskInput, this) == objLJFF) {
                C1C7U.LIZIZ("AbstractParentTask@ae12.startBackgroundTasks$1$1$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("AbstractParentTask@ae12.startBackgroundTasks$1$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
