package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05Jc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.feed.platform.dispatch.ComponentDispatcher$triggerVideoFirstFrame$1", f = "ComponentDispatcher.kt", l = {116, 117}, m = "invokeSuspend")
public final class C1331805Jc extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ List<AbstractC1333605Ju<Object, Object>> LLILLL;
    public final /* synthetic */ C1333305Jr<Object, Object> LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1331805Jc(List<? extends AbstractC1333605Ju<Object, Object>> list, C1333305Jr<Object, Object> c1333305Jr, InterfaceC1364105Vn<? super C1331805Jc> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = list;
        this.LLILZ = c1333305Jr;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1331805Jc c1331805Jc = new C1331805Jc(this.LLILLL, this.LLILZ, interfaceC1364105Vn);
        c1331805Jc.LLILLJJLI = obj;
        return c1331805Jc;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ComponentDispatcher@4f48.triggerVideoFirstFrame$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C155000ia.LIZIZ(obj);
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("ComponentDispatcher@4f48.triggerVideoFirstFrame$1");
                    return unit;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            InterfaceC497601wk interfaceC497601wk = (InterfaceC497601wk) this.LLILLJJLI;
            List<AbstractC1333605Ju<Object, Object>> list = this.LLILLL;
            C1333305Jr<Object, Object> c1333305Jr = this.LLILZ;
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
            Iterator<AbstractC1333605Ju<Object, Object>> it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList.add(C23250099c.LIZIZ(interfaceC497601wk, null, null, new C1331705Jb(c1333305Jr, it2.next(), null), 3));
            }
            this.LL = 1;
            if (C1D9F.LIZ(arrayList, this) == objLJFF) {
                C1C7U.LIZIZ("ComponentDispatcher@4f48.triggerVideoFirstFrame$1");
                return objLJFF;
            }
        }
        C1DFH c1dfh = C0PEM.LIZ;
        AbstractC2238408pq abstractC2238408pq = C2107308Nj.LIZ;
        C1331905Jd c1331905Jd = new C1331905Jd(this.LLILZ, null);
        this.LL = 2;
        if (C23250099c.LJI(this, abstractC2238408pq, c1331905Jd) == objLJFF) {
            C1C7U.LIZIZ("ComponentDispatcher@4f48.triggerVideoFirstFrame$1");
            return objLJFF;
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("ComponentDispatcher@4f48.triggerVideoFirstFrame$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
