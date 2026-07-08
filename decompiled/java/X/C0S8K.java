package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.videohotswap.service.PaidContentVideoHotSwapServiceImpl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0S8K, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
@C09DV(c = "com.ss.android.ugc.aweme.videohotswap.service.PaidContentVideoHotSwapServiceImpl$fetchListOfAwemesVhs$5", f = "PaidContentVideoHotSwapServiceImpl.kt", l = {402}, m = "invokeSuspend")
public final class C0S8K extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super List<? extends Unit>>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ List<C0S81> LLILLL;
    public final /* synthetic */ Function2<List<? extends Aweme>, Boolean, Unit> LLILZ;
    public final /* synthetic */ PaidContentVideoHotSwapServiceImpl LLILZIL;
    public final /* synthetic */ C0S8O LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C0S8K(List<C0S81> list, Function2<? super List<? extends Aweme>, ? super Boolean, Unit> function2, PaidContentVideoHotSwapServiceImpl paidContentVideoHotSwapServiceImpl, C0S8O c0s8o, InterfaceC1364105Vn<? super C0S8K> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = list;
        this.LLILZ = function2;
        this.LLILZIL = paidContentVideoHotSwapServiceImpl;
        this.LLILZLL = c0s8o;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C0S8K c0s8k = new C0S8K(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
        c0s8k.LLILLJJLI = obj;
        return c0s8k;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object objLIZ = obj;
        C1C7U.LIZ("PaidContentVideoHotSwapServiceImpl@1955.fetchListOfAwemesVhs$5");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        int i2 = 1;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(objLIZ);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(objLIZ);
            InterfaceC497601wk interfaceC497601wk = (InterfaceC497601wk) this.LLILLJJLI;
            List<C0S81> list = this.LLILLL;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (C0S81 c0s81 : list) {
                Class<?> cls = c0s81.LIZIZ.getClass();
                Object arrayList = linkedHashMap.get(cls);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    linkedHashMap.put(cls, arrayList);
                }
                ((List) arrayList).add(c0s81);
            }
            Function2<List<? extends Aweme>, Boolean, Unit> function2 = this.LLILZ;
            List<C0S81> list2 = this.LLILLL;
            PaidContentVideoHotSwapServiceImpl paidContentVideoHotSwapServiceImpl = this.LLILZIL;
            C0S8O c0s8o = this.LLILZLL;
            ArrayList arrayList2 = new ArrayList(linkedHashMap.size());
            Iterator it2 = linkedHashMap.entrySet().iterator();
            while (it2.hasNext()) {
                List list3 = (List) ((Map.Entry) it2.next()).getValue();
                Function2<List<? extends Aweme>, Boolean, Unit> function22 = function2;
                C099G c099gLIZIZ = C23250099c.LIZIZ(interfaceC497601wk, null, null, new C0S8J(list3, function2, list2, paidContentVideoHotSwapServiceImpl, c0s8o, null), 3);
                ArrayList arrayList3 = new ArrayList(C15438062q.LJIJJ(list3, 10));
                Iterator it3 = list3.iterator();
                while (it3.hasNext()) {
                    arrayList3.add(paidContentVideoHotSwapServiceImpl.LIZLLL.put(((C0S81) it3.next()).LIZ.getAid(), c099gLIZIZ));
                }
                arrayList2.add(c099gLIZIZ);
                function2 = function22;
                i2 = 1;
            }
            this.LL = i2;
            objLIZ = C1D9F.LIZ(arrayList2, this);
            if (objLIZ == objLJFF) {
                C1C7U.LIZIZ("PaidContentVideoHotSwapServiceImpl@1955.fetchListOfAwemesVhs$5");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("PaidContentVideoHotSwapServiceImpl@1955.fetchListOfAwemesVhs$5");
        return objLIZ;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super List<? extends Unit>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
