package X;

import com.ss.android.ugc.aweme.commercialize.ucp.impl.data.ordersv2.LocalOrderWrapper;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0D6e, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.commercialize.ucp.impl.data.ordersv2.OrderLocalStoreV2$processPendingQueue$2$jobs$1$1$1$1", f = "OrdersV2LocalStore.kt", l = {183}, m = "invokeSuspend")
public final class C333660D6e extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Long>, Object> {
    public int LL;
    public final /* synthetic */ C0D6F LLILLJJLI;
    public final /* synthetic */ LocalOrderWrapper LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C333660D6e(C0D6F c0d6f, LocalOrderWrapper localOrderWrapper, InterfaceC1364105Vn<? super C333660D6e> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c0d6f;
        this.LLILLL = localOrderWrapper;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C333660D6e(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object objLIZIZ;
        C1C7U.LIZ("OrderLocalStoreV2@4ab3.processPendingQueue$2$jobs$1$1$1$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
                objLIZIZ = ((C189200o6) obj).m10unboximpl();
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            C0D6F c0d6f = this.LLILLJJLI;
            LocalOrderWrapper localOrderWrapper = this.LLILLL;
            this.LL = 1;
            objLIZIZ = c0d6f.LIZIZ(localOrderWrapper, this);
            if (objLIZIZ == objLJFF) {
                C1C7U.LIZIZ("OrderLocalStoreV2@4ab3.processPendingQueue$2$jobs$1$1$1$1");
                return objLJFF;
            }
        }
        C155000ia.LIZIZ(objLIZIZ);
        C1C7U.LIZIZ("OrderLocalStoreV2@4ab3.processPendingQueue$2$jobs$1$1$1$1");
        return objLIZIZ;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Long> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
