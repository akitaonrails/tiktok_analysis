package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.09YY, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.minis.performance.MinisPreloadWorkFlow$runOneGroup$2", f = "MinisPreloadWorkFlow.kt", l = {66}, m = "invokeSuspend")
public final class C09YY extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super List<? extends Unit>>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ List<C09YW> LLILLL;
    public final /* synthetic */ C2390309Yf LLILZ;
    public final /* synthetic */ List<Throwable> LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C09YY(List<? extends C09YW> list, C2390309Yf c2390309Yf, List<Throwable> list2, InterfaceC1364105Vn<? super C09YY> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = list;
        this.LLILZ = c2390309Yf;
        this.LLILZIL = list2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C09YY c09yy = new C09YY(this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
        c09yy.LLILLJJLI = obj;
        return c09yy;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("MinisPreloadWorkFlow@4198.runOneGroup$2");
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
            InterfaceC497601wk interfaceC497601wk = (InterfaceC497601wk) this.LLILLJJLI;
            List<C09YW> list = this.LLILLL;
            C2390309Yf c2390309Yf = this.LLILZ;
            List<Throwable> list2 = this.LLILZIL;
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
            Iterator<C09YW> it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList.add(C23250099c.LIZIZ(interfaceC497601wk, null, null, new C09YX(it2.next(), c2390309Yf, list2, null), 3));
            }
            this.LL = 1;
            obj = C1D9F.LIZ(arrayList, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("MinisPreloadWorkFlow@4198.runOneGroup$2");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("MinisPreloadWorkFlow@4198.runOneGroup$2");
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super List<? extends Unit>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
