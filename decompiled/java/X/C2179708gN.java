package X;

import com.ss.android.ugc.aweme.relation.ffp.nearby.network.ConnectNowNetworkAPI;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.08gN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.relation.ffp.nearby.ui.ConnectNowFragment$onBackPressed_Activity$1$2$1", f = "ConnectNowFragment.kt", l = {301}, m = "invokeSuspend")
public final class C2179708gN extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;

    public C2179708gN(InterfaceC1364105Vn<? super C2179708gN> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2179708gN(interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ConnectNowFragment@7e4a.onBackPressed_Activity$1$2$1");
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
            ConnectNowNetworkAPI connectNowNetworkAPI = ConnectNowNetworkAPI.INSTANCE;
            this.LL = 1;
            if (connectNowNetworkAPI.exitPage(true, this) == objLJFF) {
                C1C7U.LIZIZ("ConnectNowFragment@7e4a.onBackPressed_Activity$1$2$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ConnectNowFragment@7e4a.onBackPressed_Activity$1$2$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return new C2179708gN(interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
    }
}
