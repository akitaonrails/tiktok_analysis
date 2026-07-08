package X;

import com.bytedance.android.live.liveinteract.multilive.social.model.RecommendAckReq;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.hangout.component.livecard.viewmodel.MultiTopLivePlayFeedListViewModel;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Iq5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
@C09DV(c = "com.ss.android.ugc.aweme.hangout.component.livecard.viewmodel.MultiTopLivePlayFeedListViewModel$recommendAck$1", f = "MultiTopLivePlayFeedListViewModel.kt", l = {638}, m = "invokeSuspend")
public final class C478790Iq5 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ MultiTopLivePlayFeedListViewModel LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C478790Iq5(MultiTopLivePlayFeedListViewModel multiTopLivePlayFeedListViewModel, InterfaceC1364105Vn<? super C478790Iq5> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = multiTopLivePlayFeedListViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C478790Iq5 c478790Iq5 = new C478790Iq5(this.LLILLL, interfaceC1364105Vn);
        c478790Iq5.LLILLJJLI = obj;
        return c478790Iq5;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        ?? arrayList;
        Object c098200Yq;
        ?? r4;
        C1C7U.LIZ("MultiTopLivePlayFeedListViewModel@15dd.recommendAck$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                arrayList = this.LLILLJJLI;
                try {
                    C155000ia.LIZIZ(obj);
                    arrayList = arrayList;
                } catch (Throwable th) {
                    th = th;
                    TryCatchGuardChecker.doCheck(th);
                    c098200Yq = new C098200Yq(th);
                    C189200o6.m2constructorimpl(c098200Yq);
                    r4 = arrayList;
                }
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            List<AbstractC479160Iqg> list = ((C479490IrD) this.LLILLL.getState()).LL.LLILZ;
            if (list != null) {
                arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
                Iterator<AbstractC479160Iqg> it2 = list.iterator();
                while (it2.hasNext()) {
                    arrayList.add(C2286608xc.LJFF(it2.next().LIZ().LIZ));
                }
            } else {
                arrayList = 0;
            }
            MultiTopLivePlayFeedListViewModel multiTopLivePlayFeedListViewModel = this.LLILLL;
            try {
                InterfaceC478670Ipt interfaceC478670Ipt = (InterfaceC478670Ipt) multiTopLivePlayFeedListViewModel.LLILZLL.getValue().getOperator();
                RecommendAckReq recommendAckReq = new RecommendAckReq();
                recommendAckReq.reqFrom = multiTopLivePlayFeedListViewModel.vQ2(3);
                if (arrayList != 0) {
                    recommendAckReq.idList = new ArrayList((Collection) arrayList);
                    recommendAckReq.genTime = System.currentTimeMillis();
                    this.LLILLJJLI = arrayList;
                    this.LL = 1;
                    obj = interfaceC478670Ipt.recommendAck(recommendAckReq, this);
                    arrayList = arrayList;
                    if (obj == objLJFF) {
                        C1C7U.LIZIZ("MultiTopLivePlayFeedListViewModel@15dd.recommendAck$1");
                        return objLJFF;
                    }
                } else {
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("MultiTopLivePlayFeedListViewModel@15dd.recommendAck$1");
                    return unit;
                }
            } catch (Throwable th2) {
                th = th2;
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
                r4 = arrayList;
            }
        }
        c098200Yq = (C470590Icr) obj;
        C189200o6.m2constructorimpl(c098200Yq);
        r4 = arrayList;
        if (C189200o6.m8isSuccessimpl(c098200Yq)) {
            C20441214yg.LIZIZ("MultiTopLivePlayFeedListVM", "RecommendAck success " + r4);
        }
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl != null) {
            C501530Jlf.LIZ(C176600m4.LIZ(), thM5exceptionOrNullimpl, null);
            C20441214yg.LJFF("MultiTopLivePlayFeedListVM", "RecommendAck failed", thM5exceptionOrNullimpl);
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("MultiTopLivePlayFeedListViewModel@15dd.recommendAck$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
