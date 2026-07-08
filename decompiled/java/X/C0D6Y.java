package X;

import com.ss.android.ugc.aweme.commercialize.ucp.impl.data.ordersv2.LocalOrderWrapper;
import com.ss.android.ugc.aweme.commercialize.ucp.impl.data.ordersv2.OrderFirstPageCacheV1;
import com.ss.android.ugc.aweme.commercialize.ucp.impl.data.ordersv2.OrderSnapshotV2;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0D6Y, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.commercialize.ucp.impl.data.ordersv2.OrderRepositoryV2$loadInitial$2", f = "OrdersV2Repository.kt", l = {27}, m = "invokeSuspend")
public final class C0D6Y extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super OrderSnapshotV2>, Object> {
    public int LL;
    public final /* synthetic */ C0D6E LLILLJJLI;
    public final /* synthetic */ String LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0D6Y(C0D6E c0d6e, String str, InterfaceC1364105Vn<? super C0D6Y> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c0d6e;
        this.LLILLL = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0D6Y(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("OrderRepositoryV2@4b06.loadInitial$2");
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
            C333640D6c c333640D6c = this.LLILLJJLI.LIZ;
            String str = this.LLILLL;
            this.LL = 1;
            obj = c333640D6c.LJ(str, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("OrderRepositoryV2@4b06.loadInitial$2");
                return objLJFF;
            }
        }
        C0D6Z c0d6z = (C0D6Z) obj;
        C0D6E c0d6e = this.LLILLJJLI;
        List<LocalOrderWrapper> list = c0d6z.LIZ.items;
        OrderFirstPageCacheV1 orderFirstPageCacheV1 = c0d6z.LIZIZ;
        List<LocalOrderWrapper> list2 = orderFirstPageCacheV1.items;
        long j = orderFirstPageCacheV1.cursor;
        boolean z = orderFirstPageCacheV1.hasMore;
        C13BV c13bv = C13BV.INSTANCE;
        c0d6e.getClass();
        OrderSnapshotV2 orderSnapshotV2LIZ = C0D6E.LIZ(z, j, list, list2, c13bv);
        C1C7U.LIZIZ("OrderRepositoryV2@4b06.loadInitial$2");
        return orderSnapshotV2LIZ;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super OrderSnapshotV2> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
