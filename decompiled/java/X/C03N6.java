package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.PollOrderStatusRequest;
import com.ss.android.ugc.aweme.ecommerce.base.osp.utils.QueryOrderAfterAuthManager;
import java.util.UUID;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.03N6, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.osp.utils.QueryOrderAfterAuthManager$queryOrderStateInternal$1", f = "PollOrderStatusManager.kt", l = {143}, m = "invokeSuspend")
public final class C03N6 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public QueryOrderAfterAuthManager LL;
    public int LLILLJJLI;
    public final /* synthetic */ QueryOrderAfterAuthManager LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C03N6(QueryOrderAfterAuthManager queryOrderAfterAuthManager, InterfaceC1364105Vn<? super C03N6> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = queryOrderAfterAuthManager;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C03N6(this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        QueryOrderAfterAuthManager queryOrderAfterAuthManager;
        C03NA c03na;
        String string;
        C1C7U.LIZ("QueryOrderAfterAuthManager@fdb8.queryOrderStateInternal$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILLJJLI;
        try {
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.LLILLL.LIZIZ(null);
        }
        if (i != 0) {
            if (i == 1) {
                queryOrderAfterAuthManager = this.LL;
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            UUID.randomUUID().toString();
            System.currentTimeMillis();
            queryOrderAfterAuthManager = this.LLILLL;
            PollOrderStatusRequest pollOrderStatusRequest = queryOrderAfterAuthManager.LJI;
            if (pollOrderStatusRequest != null) {
                C03WX c03wx = queryOrderAfterAuthManager.LIZIZ;
                if (c03wx != null) {
                    Integer num = queryOrderAfterAuthManager.LJIIIZ;
                    if (num != null) {
                        string = num.toString();
                    } else {
                        string = null;
                    }
                    pollOrderStatusRequest.LIZ = string;
                    this.LL = queryOrderAfterAuthManager;
                    this.LLILLJJLI = 1;
                    obj = c03wx.LJJJJJL(pollOrderStatusRequest, this);
                    if (obj == objLJFF) {
                        C1C7U.LIZIZ("QueryOrderAfterAuthManager@fdb8.queryOrderStateInternal$1");
                        return objLJFF;
                    }
                } else {
                    c03na = null;
                    queryOrderAfterAuthManager.LIZIZ(c03na);
                }
            }
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("QueryOrderAfterAuthManager@fdb8.queryOrderStateInternal$1");
            return unit;
        }
        c03na = (C03NA) obj;
        queryOrderAfterAuthManager.LIZIZ(c03na);
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("QueryOrderAfterAuthManager@fdb8.queryOrderStateInternal$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
