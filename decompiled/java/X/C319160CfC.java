package X;

import com.bytedance.android.livesdk.impl.revenue.enigma.paywall.PaywallViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.0CfC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.bytedance.android.livesdk.impl.revenue.enigma.paywall.PaywallViewModel$startPurchase$1$1$onCanceled$1", f = "PaywallViewModel.kt", l = {840}, m = "invokeSuspend")
public final class C319160CfC extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ PaywallViewModel LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C319160CfC(String str, PaywallViewModel paywallViewModel, InterfaceC1364105Vn<? super C319160CfC> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = str;
        this.LLILLL = paywallViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C319160CfC(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String str;
        C1C7U.LIZ("PaywallViewModel@d9cd.startPurchase$1$1$onCanceled$1");
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
            if (Intrinsics.LJFF(this.LLILLJJLI, EnumC2197951B0n.USER_SYNC_FAILED.getValue())) {
                this.LLILLL.LLIZLLLIL = true;
                str = "completed";
            } else {
                this.LLILLL.LLIZ = true;
                str = "cancel";
            }
            C0DT9.LIZ(this.LLILLL.HQ2(), str);
            C2252331DDr c2252331DDr = this.LLILLL.LLJIJIL;
            C319180CfE c319180CfE = C319180CfE.LIZ;
            this.LL = 1;
            if (c2252331DDr.emit(c319180CfE, this) == objLJFF) {
                C1C7U.LIZIZ("PaywallViewModel@d9cd.startPurchase$1$1$onCanceled$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("PaywallViewModel@d9cd.startPurchase$1$1$onCanceled$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
