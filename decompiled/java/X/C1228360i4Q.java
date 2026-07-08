package X;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0i4Q, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
@C09DV(c = "com.ss.android.ugc.aweme.selector.inviteguest.LiveInviteGuestContentTabDataSourceProtocol$onRefresh$2", f = "LiveInviteGuestContentTabDataSourceProtocol.kt", l = {102, 104}, m = "invokeSuspend")
public final class C1228360i4Q extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super C1223660hwq>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C1228370i4R LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1228360i4Q(C1228370i4R c1228370i4R, InterfaceC1364105Vn<? super C1228360i4Q> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c1228370i4R;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1228360i4Q c1228360i4Q = new C1228360i4Q(this.LLILLL, interfaceC1364105Vn);
        c1228360i4Q.LLILLJJLI = obj;
        return c1228360i4Q;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        List<? extends AbstractC1223800hx4> list;
        C1C7U.LIZ("LiveInviteGuestContentTabDataSourceProtocol@c79b.onRefresh$2");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C155000ia.LIZIZ(obj);
                    list = (List) obj;
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                C155000ia.LIZIZ(obj);
                list = (List) obj;
            }
        } else {
            C155000ia.LIZIZ(obj);
            InterfaceC497601wk interfaceC497601wk = (InterfaceC497601wk) this.LLILLJJLI;
            C1228370i4R c1228370i4R = this.LLILLL;
            C099G c099g = c1228370i4R.LLILZ;
            list = c1228370i4R.LLILZIL;
            if (list == null) {
                if (c099g != null && c099g.isActive()) {
                    this.LL = 1;
                    obj = c099g.LJLIIIL(this);
                    if (obj == objLJFF) {
                        C1C7U.LIZIZ("LiveInviteGuestContentTabDataSourceProtocol@c79b.onRefresh$2");
                        return objLJFF;
                    }
                    list = (List) obj;
                } else {
                    C099G c099gLIZIZ = C23250099c.LIZIZ(interfaceC497601wk, null, null, new C1228330i4N(c1228370i4R, null), 3);
                    this.LL = 2;
                    obj = c099gLIZIZ.LJLIIIL(this);
                    if (obj == objLJFF) {
                        C1C7U.LIZIZ("LiveInviteGuestContentTabDataSourceProtocol@c79b.onRefresh$2");
                        return objLJFF;
                    }
                    list = (List) obj;
                }
            }
        }
        C1223660hwq c1223660hwq = new C1223660hwq(list);
        C1C7U.LIZIZ("LiveInviteGuestContentTabDataSourceProtocol@c79b.onRefresh$2");
        return c1223660hwq;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super C1223660hwq> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
