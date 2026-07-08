package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.fe.method.feeds.pojo.FeedsResponse;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0dqF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
@C09DV(c = "com.ss.android.ugc.tiktok.pns.activitycenter.watchhistory.feeds.WHFeedsBridgeModel$openAweme$1$2$onSuccess$1$1", f = "WHFeedsBridgeModel.kt", l = {}, m = "invokeSuspend")
public final class C1065810dqF extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C1884130z87 LL;
    public final /* synthetic */ C118300cf LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1065810dqF(C1884130z87 c1884130z87, C118300cf c118300cf, InterfaceC1364105Vn<? super C1065810dqF> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c1884130z87;
        this.LLILLJJLI = c118300cf;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1065810dqF(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        List<Aweme> list;
        Object obj2;
        C1C7U.LIZ("WHFeedsBridgeModel@17b3.openAweme$1$2$onSuccess$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        FeedsResponse feedsResponse = (FeedsResponse) this.LL.mData;
        Unit unit = null;
        String eventType = null;
        unit = null;
        unit = null;
        if (feedsResponse != null && (list = feedsResponse.list) != null && (obj2 = ListProtector.get(list, this.LLILLJJLI.element)) != null) {
            C1884130z87 c1884130z87 = this.LL;
            c1884130z87.getClass();
            C737030Svd c737030Svd = new C737030Svd(21, obj2);
            C2189821An6 c2189821An6 = c1884130z87.LLJILJIL;
            if (c2189821An6 != null) {
                eventType = c2189821An6.getEventType();
            }
            c737030Svd.LJ = eventType;
            C1440005kM.LIZ(c737030Svd);
            unit = Unit.LIZ;
        }
        C1C7U.LIZIZ("WHFeedsBridgeModel@17b3.openAweme$1$2$onSuccess$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
