package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05ki, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.tiktok.pns.activitycenter.watchhistory.feeds.WHFeedsBridgeModel$onReceiveBehavior$1", f = "WHFeedsBridgeModel.kt", l = {561, 278}, m = "invokeSuspend")
public final class C1442205ki extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public InterfaceC383701eN LL;
    public C1884130z87 LLILLJJLI;
    public Object LLILLL;
    public long LLILZ;
    public int LLILZIL;
    public final /* synthetic */ C1884130z87 LLILZLL;
    public final /* synthetic */ List<InterfaceC1876680yw6> LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1442205ki(C1884130z87 c1884130z87, List<? extends InterfaceC1876680yw6> list, InterfaceC1364105Vn<? super C1442205ki> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZLL = c1884130z87;
        this.LLIZ = list;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1442205ki(this.LLILZLL, this.LLIZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1884130z87 c1884130z87;
        InterfaceC383701eN interfaceC383701eN;
        List<InterfaceC1876680yw6> list;
        long jCurrentTimeMillis;
        C1C7U.LIZ("WHFeedsBridgeModel@17b3.onReceiveBehavior$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILZIL;
        try {
            if (i != 0) {
                if (i != 1) {
                    if (i == 2) {
                        jCurrentTimeMillis = this.LLILZ;
                        list = (List) this.LLILLL;
                        c1884130z87 = this.LLILLJJLI;
                        interfaceC383701eN = this.LL;
                        C155000ia.LIZIZ(obj);
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("load ");
                        sbLIZ.append(list.size());
                        sbLIZ.append(" aweme finished, cost: ");
                        sbLIZ.append(System.currentTimeMillis() - jCurrentTimeMillis);
                        C2188811AlT.LIZIZ(sbLIZ);
                        c1884130z87.LLILZLL = false;
                        interfaceC383701eN.LIZIZ(null);
                        Unit unit = Unit.LIZ;
                        C1C7U.LIZIZ("WHFeedsBridgeModel@17b3.onReceiveBehavior$1");
                        return unit;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                list = (List) this.LLILLL;
                c1884130z87 = this.LLILLJJLI;
                interfaceC383701eN = this.LL;
                C155000ia.LIZIZ(obj);
            } else {
                C155000ia.LIZIZ(obj);
                c1884130z87 = this.LLILZLL;
                interfaceC383701eN = c1884130z87.LLILZ;
                list = this.LLIZ;
                this.LL = interfaceC383701eN;
                this.LLILLJJLI = c1884130z87;
                this.LLILLL = list;
                this.LLILZIL = 1;
                if (interfaceC383701eN.LIZLLL(null, this) == objLJFF) {
                    C1C7U.LIZIZ("WHFeedsBridgeModel@17b3.onReceiveBehavior$1");
                    return objLJFF;
                }
            }
            if (!c1884130z87.LLILZLL) {
                c1884130z87.LLILZLL = true;
                jCurrentTimeMillis = System.currentTimeMillis();
                this.LL = interfaceC383701eN;
                this.LLILLJJLI = c1884130z87;
                this.LLILLL = list;
                this.LLILZ = jCurrentTimeMillis;
                this.LLILZIL = 2;
                if (c1884130z87.LJIIJ(this) == objLJFF) {
                    C1C7U.LIZIZ("WHFeedsBridgeModel@17b3.onReceiveBehavior$1");
                    return objLJFF;
                }
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("load ");
                sbLIZ2.append(list.size());
                sbLIZ2.append(" aweme finished, cost: ");
                sbLIZ2.append(System.currentTimeMillis() - jCurrentTimeMillis);
                C2188811AlT.LIZIZ(sbLIZ2);
                c1884130z87.LLILZLL = false;
            }
            interfaceC383701eN.LIZIZ(null);
            Unit unit2 = Unit.LIZ;
            C1C7U.LIZIZ("WHFeedsBridgeModel@17b3.onReceiveBehavior$1");
            return unit2;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            interfaceC383701eN.LIZIZ(null);
            throw th;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
