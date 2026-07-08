package X;

import com.ss.android.ugc.aweme.explore.assem.ExploreViewPagerComponent;
import com.ss.android.ugc.aweme.explore.domian.ExploreCustomTopicDataSource;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;
import org.json.JSONException;

/* JADX INFO: renamed from: X.0y1f, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
@C09DV(c = "com.ss.android.ugc.aweme.explore.assem.ExploreViewPagerComponent$onAccountResult$1", f = "ExploreViewPagerComponent.kt", l = {896}, m = "invokeSuspend")
public final class C1841690y1f extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ ExploreViewPagerComponent LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1841690y1f(ExploreViewPagerComponent exploreViewPagerComponent, InterfaceC1364105Vn<? super C1841690y1f> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = exploreViewPagerComponent;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1841690y1f(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws JSONException {
        C1C7U.LIZ("ExploreViewPagerComponent@6933.onAccountResult$1");
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
            ExploreCustomTopicDataSource.Companion.getClass();
            InterfaceC1841670y1d fetchInRAMJob = C1841760y1m.LIZ.getFetchInRAMJob();
            if (fetchInRAMJob != null) {
                this.LL = 1;
                if (fetchInRAMJob.LJJZ(this) == objLJFF) {
                    C1C7U.LIZIZ("ExploreViewPagerComponent@6933.onAccountResult$1");
                    return objLJFF;
                }
            }
        }
        ExploreViewPagerComponent exploreViewPagerComponent = this.LLILLJJLI;
        ExploreCustomTopicDataSource.Companion.getClass();
        exploreViewPagerComponent.QC2(C1841760y1m.LIZ.getTopicRAMResponse());
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ExploreViewPagerComponent@6933.onAccountResult$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
