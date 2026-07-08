package X;

import androidx.lifecycle.LifecycleCoroutineScope;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.videohotswap.service.PaidContentVideoHotSwapServiceImpl;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0S8B, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
@C09DV(c = "com.ss.android.ugc.aweme.videohotswap.service.PaidContentVideoHotSwapServiceImpl$maybeQueueEligibleAwemesForFullFetchVhs$1", f = "PaidContentVideoHotSwapServiceImpl.kt", l = {135, 150}, m = "invokeSuspend")
public final class C0S8B extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public Object LL;
    public int LLILLJJLI;
    public final /* synthetic */ PaidContentVideoHotSwapServiceImpl LLILLL;
    public final /* synthetic */ List<Aweme> LLILZ;
    public final /* synthetic */ int LLILZIL;
    public final /* synthetic */ Aweme LLILZLL;
    public final /* synthetic */ boolean LLIZ;
    public final /* synthetic */ LifecycleCoroutineScope LLIZLLLIL;
    public final /* synthetic */ C0S8H LLJ;
    public final /* synthetic */ String LLJI;
    public final /* synthetic */ String LLJIJIL;
    public final /* synthetic */ String LLJILJIL;
    public final /* synthetic */ C0S8O LLJILJILJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C0S8B(PaidContentVideoHotSwapServiceImpl paidContentVideoHotSwapServiceImpl, List<? extends Aweme> list, int i, Aweme aweme, boolean z, LifecycleCoroutineScope lifecycleCoroutineScope, C0S8H c0s8h, String str, String str2, String str3, C0S8O c0s8o, InterfaceC1364105Vn<? super C0S8B> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = paidContentVideoHotSwapServiceImpl;
        this.LLILZ = list;
        this.LLILZIL = i;
        this.LLILZLL = aweme;
        this.LLIZ = z;
        this.LLIZLLLIL = lifecycleCoroutineScope;
        this.LLJ = c0s8h;
        this.LLJI = str;
        this.LLJIJIL = str2;
        this.LLJILJIL = str3;
        this.LLJILJILJ = c0s8o;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0S8B(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, this.LLJI, this.LLJIJIL, this.LLJILJIL, this.LLJILJILJ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Pair pair;
        List<Aweme> listSubList;
        Aweme aweme;
        Object next;
        C1C7U.LIZ("PaidContentVideoHotSwapServiceImpl@1955.maybeQueueEligibleAwemesForFullFetchVhs$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILLJJLI;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C155000ia.LIZIZ(obj);
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("PaidContentVideoHotSwapServiceImpl@1955.maybeQueueEligibleAwemesForFullFetchVhs$1");
                    return unit;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            listSubList = (List) this.LL;
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            PaidContentVideoHotSwapServiceImpl paidContentVideoHotSwapServiceImpl = this.LLILLL;
            int size = this.LLILZ.size();
            int i2 = this.LLILZIL;
            paidContentVideoHotSwapServiceImpl.getClass();
            if (size >= 1 && i2 >= 0 && i2 < size) {
                int i3 = i2 % 5;
                int i4 = (i2 / 5) * 5;
                int i5 = (i4 + 5) - 1;
                int i6 = 0;
                if (5 - i3 < 2) {
                    if (i4 < 0) {
                        i4 = 0;
                    }
                    Integer numValueOf = Integer.valueOf(i4);
                    int i7 = i5 + 5;
                    if (i7 <= size) {
                        size = i7;
                    }
                    pair = new Pair(numValueOf, Integer.valueOf(size));
                } else if (i3 < 2) {
                    int i8 = i4 - 5;
                    if (i8 >= 0) {
                        i6 = i8;
                    }
                    Integer numValueOf2 = Integer.valueOf(i6);
                    if (i5 <= size) {
                        size = i5;
                    }
                    pair = new Pair(numValueOf2, Integer.valueOf(size));
                } else {
                    if (i4 < 0) {
                        i4 = 0;
                    }
                    Integer numValueOf3 = Integer.valueOf(i4);
                    if (i5 <= size) {
                        size = i5;
                    }
                    pair = new Pair(numValueOf3, Integer.valueOf(size));
                }
            } else {
                pair = new Pair(C2286608xc.LJ(this.LLILZIL), C2286608xc.LJ(this.LLILZIL));
            }
            listSubList = this.LLILZ.subList(((Number) pair.getFirst()).intValue(), ((Number) pair.getSecond()).intValue());
            if (!(!listSubList.isEmpty()) && ((aweme = this.LLILZLL) == null || (listSubList = Collections.singletonList(aweme)) == null)) {
                listSubList = C13BV.INSTANCE;
            }
            PaidContentVideoHotSwapServiceImpl paidContentVideoHotSwapServiceImpl2 = this.LLILLL;
            boolean z = this.LLIZ;
            paidContentVideoHotSwapServiceImpl2.getClass();
            ArrayList arrayList = new ArrayList();
            Iterator<Aweme> it2 = listSubList.iterator();
            while (it2.hasNext()) {
                C0S8A<Object> c0s8aLJIILJJIL = paidContentVideoHotSwapServiceImpl2.LJIILJJIL(it2.next(), z);
                if (c0s8aLJIILJJIL != null) {
                    arrayList.add(c0s8aLJIILJJIL);
                }
            }
            Aweme aweme2 = this.LLILZLL;
            if (aweme2 != null) {
                PaidContentVideoHotSwapServiceImpl paidContentVideoHotSwapServiceImpl3 = this.LLILLL;
                LifecycleCoroutineScope lifecycleCoroutineScope = this.LLIZLLLIL;
                C0S8H c0s8h = this.LLJ;
                String str = this.LLJI;
                String str2 = this.LLJIJIL;
                String str3 = this.LLJILJIL;
                boolean z2 = this.LLIZ;
                this.LL = listSubList;
                this.LLILLJJLI = 1;
                if (paidContentVideoHotSwapServiceImpl3.LJIILIIL(aweme2, arrayList, lifecycleCoroutineScope, c0s8h, str, str2, str3, z2, this) == objLJFF) {
                    C1C7U.LIZIZ("PaidContentVideoHotSwapServiceImpl@1955.maybeQueueEligibleAwemesForFullFetchVhs$1");
                    return objLJFF;
                }
            }
        }
        PaidContentVideoHotSwapServiceImpl paidContentVideoHotSwapServiceImpl4 = this.LLILLL;
        paidContentVideoHotSwapServiceImpl4.getClass();
        ArrayList arrayList2 = new ArrayList();
        for (Aweme aweme3 : listSubList) {
            Iterator it3 = ((CopyOnWriteArrayList) paidContentVideoHotSwapServiceImpl4.LIZJ).iterator();
            while (true) {
                if (it3.hasNext()) {
                    next = it3.next();
                    if (((C0S8V) next).LIZJ(aweme3)) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            C0S8V c0s8v = (C0S8V) next;
            if (c0s8v != null) {
                arrayList2.add(new C0S81(aweme3, c0s8v));
            }
        }
        PaidContentVideoHotSwapServiceImpl paidContentVideoHotSwapServiceImpl5 = this.LLILLL;
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : arrayList2) {
            if (!paidContentVideoHotSwapServiceImpl5.LIZLLL.containsKey(((C0S81) obj2).LIZ.getAid())) {
                arrayList3.add(obj2);
            }
        }
        C1DFH c1dfh = C0PEM.LIZ;
        AbstractC2238408pq abstractC2238408pq = C2107308Nj.LIZ;
        C0S8C c0s8c = new C0S8C(this.LLILLL, arrayList3, this.LLJILJILJ, this.LLIZLLLIL, this.LLJI, null);
        this.LL = null;
        this.LLILLJJLI = 2;
        if (C23250099c.LJI(this, abstractC2238408pq, c0s8c) == objLJFF) {
            C1C7U.LIZIZ("PaidContentVideoHotSwapServiceImpl@1955.maybeQueueEligibleAwemesForFullFetchVhs$1");
            return objLJFF;
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("PaidContentVideoHotSwapServiceImpl@1955.maybeQueueEligibleAwemesForFullFetchVhs$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
