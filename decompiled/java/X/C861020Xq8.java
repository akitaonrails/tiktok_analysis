package X;

import Y.AgS295S0100000_14;
import com.bytedance.android.live.wallet.viewmodel.recharge.component.banner.VaultRechargeUnlockGiftViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Xq8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.bytedance.android.live.walletnew.ui.banner.holders.VaultRechargeToUnlockBannerHolder$onBannerCreate$1$1$1", f = "VaultRechargeToUnlockBannerHolder.kt", l = {74}, m = "invokeSuspend")
public final class C861020Xq8 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ VaultRechargeUnlockGiftViewModel LLILLJJLI;
    public final /* synthetic */ C1806080x6E LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C861020Xq8(VaultRechargeUnlockGiftViewModel vaultRechargeUnlockGiftViewModel, C1806080x6E c1806080x6E, InterfaceC1364105Vn<? super C861020Xq8> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = vaultRechargeUnlockGiftViewModel;
        this.LLILLL = c1806080x6E;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C861020Xq8(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("VaultRechargeToUnlockBannerHolder@b2c.onBannerCreate$1$1$1");
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
            InterfaceC346201Wa<String> interfaceC346201Wa = this.LLILLJJLI.LLILZ;
            AgS295S0100000_14 agS295S0100000_14 = new AgS295S0100000_14(this.LLILLL, 36);
            this.LL = 1;
            if (interfaceC346201Wa.collect(agS295S0100000_14, this) == objLJFF) {
                C1C7U.LIZIZ("VaultRechargeToUnlockBannerHolder@b2c.onBannerCreate$1$1$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("VaultRechargeToUnlockBannerHolder@b2c.onBannerCreate$1$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
