package X;

import com.ss.android.ugc.aweme.poi.quiz.map.PoiQuizMapClusterPicLoader;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS194S1100000_18;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.0glb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
@C09DV(c = "com.ss.android.ugc.aweme.poi.quiz.map.PoiQuizMapClusterPicLoader$loadFinishBitMap$job$1", f = "PoiQuizMapClusterPicLoader.kt", l = {}, m = "invokeSuspend")
public final class C1178250glb extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ PoiQuizMapClusterPicLoader LL;
    public final /* synthetic */ String LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1178250glb(PoiQuizMapClusterPicLoader poiQuizMapClusterPicLoader, String str, InterfaceC1364105Vn<? super C1178250glb> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = poiQuizMapClusterPicLoader;
        this.LLILLJJLI = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1178250glb(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Iterable data;
        Object next;
        C1C7U.LIZ("PoiQuizMapClusterPicLoader@cbe3.loadFinishBitMap$job$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        InterfaceC1177110gjl<C1178200glW> interfaceC1177110gjl = this.LL.LLILLJJLI;
        if (interfaceC1177110gjl != null && (data = interfaceC1177110gjl.getData()) != null) {
            String str = this.LLILLJJLI;
            Iterator it2 = data.iterator();
            while (true) {
                if (it2.hasNext()) {
                    next = it2.next();
                    if (Intrinsics.LJFF(((C1178200glW) next).LIZ, str)) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            C1178200glW c1178200glW = (C1178200glW) next;
            if (c1178200glW != null) {
                PoiQuizMapClusterPicLoader poiQuizMapClusterPicLoader = this.LL;
                C1178200glW c1178200glWLIZJ = C1178200glW.LIZJ(c1178200glW, null, true, false, false, 2043);
                AwS194S1100000_18 awS194S1100000_18 = new AwS194S1100000_18(this.LL, this.LLILLJJLI, 1);
                poiQuizMapClusterPicLoader.getClass();
                PoiQuizMapClusterPicLoader.LIZ(c1178200glWLIZJ, awS194S1100000_18);
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("PoiQuizMapClusterPicLoader@cbe3.loadFinishBitMap$job$1");
                return unit;
            }
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("PoiQuizMapClusterPicLoader@cbe3.loadFinishBitMap$job$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
