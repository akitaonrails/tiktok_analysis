package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.commercialize.ucp.impl.data.ordersv2.LocalOrderWrapper;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.0D6d, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.commercialize.ucp.impl.data.ordersv2.OrderLocalStoreV2$processPendingQueue$2", f = "OrdersV2LocalStore.kt", l = {333, 237}, m = "invokeSuspend")
public final class C333650D6d extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super List<? extends Unit>>, Object> {
    public C1DEV LL;
    public C333640D6c LLILLJJLI;
    public Object LLILLL;
    public int LLILZ;
    public /* synthetic */ Object LLILZIL;
    public final /* synthetic */ C333640D6c LLILZLL;
    public final /* synthetic */ String LLIZ;
    public final /* synthetic */ C0D6F LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C333650D6d(C333640D6c c333640D6c, String str, C0D6F c0d6f, InterfaceC1364105Vn<? super C333650D6d> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZLL = c333640D6c;
        this.LLIZ = str;
        this.LLIZLLLIL = c0d6f;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C333650D6d c333650D6d = new C333650D6d(this.LLILZLL, this.LLIZ, this.LLIZLLLIL, interfaceC1364105Vn);
        c333650D6d.LLILZIL = obj;
        return c333650D6d;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        InterfaceC497601wk interfaceC497601wk;
        C333640D6c c333640D6c;
        C1DEV c1dev;
        String str;
        C099G c099gLIZIZ;
        Object objLIZ = obj;
        C1C7U.LIZ("OrderLocalStoreV2@4ab3.processPendingQueue$2");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILZ;
        try {
            if (i != 0) {
                if (i != 1) {
                    if (i == 2) {
                        C155000ia.LIZIZ(objLIZ);
                        C1C7U.LIZIZ("OrderLocalStoreV2@4ab3.processPendingQueue$2");
                        return objLIZ;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                str = (String) this.LLILLL;
                c333640D6c = this.LLILLJJLI;
                c1dev = this.LL;
                interfaceC497601wk = (InterfaceC497601wk) this.LLILZIL;
                C155000ia.LIZIZ(objLIZ);
            } else {
                C155000ia.LIZIZ(objLIZ);
                interfaceC497601wk = (InterfaceC497601wk) this.LLILZIL;
                c333640D6c = this.LLILZLL;
                c1dev = c333640D6c.LIZ;
                str = this.LLIZ;
                this.LLILZIL = interfaceC497601wk;
                this.LL = c1dev;
                this.LLILLJJLI = c333640D6c;
                this.LLILLL = str;
                this.LLILZ = 1;
                if (c1dev.LIZLLL(null, this) == objLJFF) {
                    C1C7U.LIZIZ("OrderLocalStoreV2@4ab3.processPendingQueue$2");
                    return objLJFF;
                }
            }
            c333640D6c.getClass();
            List<LocalOrderWrapper> list = C333640D6c.LIZJ(str).items;
            c1dev.LIZIZ(null);
            C333640D6c c333640D6c2 = this.LLILZLL;
            C0D6F c0d6f = this.LLIZLLLIL;
            String str2 = this.LLIZ;
            ArrayList arrayList = new ArrayList();
            for (LocalOrderWrapper localOrderWrapper : list) {
                String orderId = localOrderWrapper.getOrderId();
                if (orderId != null && !Intrinsics.LJFF(localOrderWrapper.state, C0D6O.INSTANCE)) {
                    c099gLIZIZ = C23250099c.LIZIZ(interfaceC497601wk, C0PEM.LIZJ, null, new C333630D6b(c333640D6c2, orderId, c0d6f, localOrderWrapper, str2, null), 2);
                } else {
                    c099gLIZIZ = null;
                }
                if (c099gLIZIZ != null) {
                    arrayList.add(c099gLIZIZ);
                }
            }
            this.LLILZIL = null;
            this.LL = null;
            this.LLILLJJLI = null;
            this.LLILLL = null;
            this.LLILZ = 2;
            objLIZ = C1D9F.LIZ(arrayList, this);
            if (objLIZ == objLJFF) {
                C1C7U.LIZIZ("OrderLocalStoreV2@4ab3.processPendingQueue$2");
                return objLJFF;
            }
            C1C7U.LIZIZ("OrderLocalStoreV2@4ab3.processPendingQueue$2");
            return objLIZ;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c1dev.LIZIZ(null);
            throw th;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super List<? extends Unit>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
