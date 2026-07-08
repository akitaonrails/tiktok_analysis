package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.aigc.asynctask.AbsTaskOutput;
import com.ss.android.ugc.aweme.aigc.asynctask.models.PublicTaskInput;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0LJp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.aigc.asynctask.tasks.newframework.infra.AbstractParentTask$startBackgroundTasks$1", f = "AbstractParentTask.kt", l = {447}, m = "invokeSuspend")
public final class C540990LJp extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ AbstractC543030LRl<C09JG, AbsTaskOutput> LLILLL;
    public final /* synthetic */ PublicTaskInput LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C540990LJp(AbstractC543030LRl<C09JG, AbsTaskOutput> abstractC543030LRl, PublicTaskInput publicTaskInput, InterfaceC1364105Vn<? super C540990LJp> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = abstractC543030LRl;
        this.LLILZ = publicTaskInput;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C540990LJp c540990LJp = new C540990LJp(this.LLILLL, this.LLILZ, interfaceC1364105Vn);
        c540990LJp.LLILLJJLI = obj;
        return c540990LJp;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AbstractParentTask@ae12.startBackgroundTasks$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        try {
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C155000ia.LIZIZ(obj);
            } else {
                C155000ia.LIZIZ(obj);
                InterfaceC497601wk interfaceC497601wk = (InterfaceC497601wk) this.LLILLJJLI;
                AbstractC543030LRl<C09JG, AbsTaskOutput> abstractC543030LRl = this.LLILLL;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Starting ");
                sbLIZ.append(((ArrayList) this.LLILLL.LJIIJJI).size());
                sbLIZ.append(" background tasks");
                abstractC543030LRl.LJJJJIZL(C2188811AlT.LIZIZ(sbLIZ));
                AbstractC543030LRl<C09JG, AbsTaskOutput> abstractC543030LRl2 = this.LLILLL;
                List<AbstractC542960LRe<C09JG, AbsTaskOutput>> list = abstractC543030LRl2.LJIIJJI;
                PublicTaskInput publicTaskInput = this.LLILZ;
                ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
                Iterator it2 = ((ArrayList) list).iterator();
                while (it2.hasNext()) {
                    arrayList.add(C23250099c.LIZIZ(interfaceC497601wk, null, null, new C541000LJq(abstractC543030LRl2, (AbstractC542960LRe) it2.next(), publicTaskInput, null), 3));
                }
                this.LL = 1;
                if (C1D9F.LIZ(arrayList, this) == objLJFF) {
                    C1C7U.LIZIZ("AbstractParentTask@ae12.startBackgroundTasks$1");
                    return objLJFF;
                }
            }
            this.LLILLL.LJJJJIZL("All background tasks completed");
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            AbstractC543030LRl<C09JG, AbsTaskOutput> abstractC543030LRl3 = this.LLILLL;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("Background tasks execution failed: ");
            sbLIZ2.append(e.getMessage());
            abstractC543030LRl3.LJJJJIZL(C2188811AlT.LIZIZ(sbLIZ2));
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("AbstractParentTask@ae12.startBackgroundTasks$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
