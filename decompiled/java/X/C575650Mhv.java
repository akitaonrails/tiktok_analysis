package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Mhv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.creative.tangram.workflow.ParseModelTask$schedule$4", f = "ParseModelTask.kt", l = {143}, m = "invokeSuspend")
public final class C575650Mhv extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super List<? extends Unit>>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ List<InterfaceC575760Mi6<?>> LLILLL;
    public final /* synthetic */ C575640Mhu LLILZ;
    public final /* synthetic */ ConcurrentHashMap<C575620Mhs, InterfaceC575760Mi6<?>> LLILZIL;
    public final /* synthetic */ InterfaceC569070MTp LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C575650Mhv(List<? extends InterfaceC575760Mi6<?>> list, C575640Mhu c575640Mhu, ConcurrentHashMap<C575620Mhs, InterfaceC575760Mi6<?>> concurrentHashMap, InterfaceC569070MTp interfaceC569070MTp, InterfaceC1364105Vn<? super C575650Mhv> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = list;
        this.LLILZ = c575640Mhu;
        this.LLILZIL = concurrentHashMap;
        this.LLILZLL = interfaceC569070MTp;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C575650Mhv c575650Mhv = new C575650Mhv(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
        c575650Mhv.LLILLJJLI = obj;
        return c575650Mhv;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ParseModelTask@a58a.schedule$4");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        int i2 = 1;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            InterfaceC497601wk interfaceC497601wk = (InterfaceC497601wk) this.LLILLJJLI;
            List<InterfaceC575760Mi6<?>> list = this.LLILLL;
            C575640Mhu c575640Mhu = this.LLILZ;
            ConcurrentHashMap<C575620Mhs, InterfaceC575760Mi6<?>> concurrentHashMap = this.LLILZIL;
            InterfaceC569070MTp interfaceC569070MTp = this.LLILZLL;
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
            Iterator<InterfaceC575760Mi6<?>> it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList.add(C23250099c.LIZIZ(interfaceC497601wk, null, null, new C575680Mhy(c575640Mhu, it2.next(), concurrentHashMap, interfaceC569070MTp, null), 3));
                i2 = 1;
            }
            this.LL = i2;
            obj = C1D9F.LIZ(arrayList, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("ParseModelTask@a58a.schedule$4");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("ParseModelTask@a58a.schedule$4");
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super List<? extends Unit>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
