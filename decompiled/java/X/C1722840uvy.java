package X;

import com.ss.android.ugc.aweme.home.WalletHomeViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0uvy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.ss.android.ugc.aweme.home.WalletHomeViewModel$clearCachedData$1", f = "WalletHomeViewModel.kt", l = {149}, m = "invokeSuspend")
public final class C1722840uvy extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ WalletHomeViewModel LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1722840uvy(WalletHomeViewModel walletHomeViewModel, InterfaceC1364105Vn<? super C1722840uvy> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = walletHomeViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1722840uvy(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("WalletHomeViewModel@b687.clearCachedData$1");
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
            InterfaceC1722860uw0 interfaceC1722860uw0 = (InterfaceC1722860uw0) this.LLILLJJLI.wQ2().getOperator();
            C491101vh c491101vh = C491101vh.LIZ;
            this.LL = 1;
            if (interfaceC1722860uw0.LLIIIZ(c491101vh, this) == objLJFF) {
                C1C7U.LIZIZ("WalletHomeViewModel@b687.clearCachedData$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("WalletHomeViewModel@b687.clearCachedData$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
