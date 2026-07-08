package X;

import com.bytedance.android.live.wallet.IWalletService;
import com.bytedance.android.live.walletnew.jsb.ChargeMethodNew;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0x2G, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
@C09DV(c = "com.bytedance.android.live.walletnew.jsb.ChargeMethodNew$tryPreloadCashierAgain$1", f = "ChargeMethodNew.kt", l = {713}, m = "invokeSuspend")
public final class C1803620x2G extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ ChargeMethodNew LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1803620x2G(ChargeMethodNew chargeMethodNew, InterfaceC1364105Vn<? super C1803620x2G> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = chargeMethodNew;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1803620x2G(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        EnumC1805800x5m enumC1805800x5m;
        String hash;
        C1C7U.LIZ("ChargeMethodNew@31e8.tryPreloadCashierAgain$1");
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
            int i2 = !this.LLILLJJLI.LJIIIZ() ? 1 : 0;
            if (i2 == 1) {
                enumC1805800x5m = EnumC1805800x5m.WALLET;
            } else {
                enumC1805800x5m = EnumC1805800x5m.LIVE_DETAIL;
            }
            String value = enumC1805800x5m.getValue();
            C1804110x33 c1804110x33 = EnumC1804100x32.Companion;
            Integer numLJ = C2286608xc.LJ(i2);
            boolean zCanRedirectRechargeV3 = ((IWalletService) C1161920gLG.LIZJ(IWalletService.class)).canRedirectRechargeV3();
            boolean zIsV3Phase2 = ((IWalletService) C1161920gLG.LIZJ(IWalletService.class)).isV3Phase2(i2);
            c1804110x33.getClass();
            EnumC1804100x32 enumC1804100x32LIZ = C1804110x33.LIZ(zCanRedirectRechargeV3, numLJ, zIsV3Phase2);
            if (enumC1804100x32LIZ != null) {
                hash = enumC1804100x32LIZ.getHash();
            } else {
                hash = null;
            }
            IWalletService iWalletService = (IWalletService) C1161920gLG.LIZJ(IWalletService.class);
            C1126800fQc.LIZ.py();
            String cashierV3 = iWalletService.getCashierV3(null, C1134860fdc.LIZ.LIZIZ(i2, 0), null, null, i2, false, false, true, value, hash);
            ChargeMethodNew chargeMethodNew = this.LLILLJJLI;
            C1805120x4g c1805120x4g = chargeMethodNew.LLJ;
            if (c1805120x4g == null) {
                synchronized (chargeMethodNew) {
                    c1805120x4g = chargeMethodNew.LLJ;
                    if (c1805120x4g == null) {
                        c1805120x4g = new C1805120x4g();
                        chargeMethodNew.LLJ = c1805120x4g;
                    }
                }
            }
            C1154110g8f c1154110g8f = new C1154110g8f(cashierV3, true);
            this.LL = 1;
            if (c1805120x4g.LJ(c1154110g8f, this) == objLJFF) {
                C1C7U.LIZIZ("ChargeMethodNew@31e8.tryPreloadCashierAgain$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ChargeMethodNew@31e8.tryPreloadCashierAgain$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
