package X;

import com.bytedance.android.live.wallet.IWalletService;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0x2M, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
@C09DV(c = "com.bytedance.android.live.wallet.service.recharge.impl.RechargeService$preloadCashier$1", f = "RechargeService.kt", l = {633}, m = "invokeSuspend")
public final class C1803680x2M extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ int LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;
    public final /* synthetic */ boolean LLILZ;
    public final /* synthetic */ C1804210x3D LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1803680x2M(int i, boolean z, boolean z2, C1804210x3D c1804210x3D, InterfaceC1364105Vn<? super C1803680x2M> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = i;
        this.LLILLL = z;
        this.LLILZ = z2;
        this.LLILZIL = c1804210x3D;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1803680x2M(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        EnumC1805800x5m enumC1805800x5m;
        String hash;
        C1C7U.LIZ("RechargeService@2914.preloadCashier$1");
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
            if (this.LLILLJJLI == 1) {
                enumC1805800x5m = EnumC1805800x5m.WALLET;
            } else {
                enumC1805800x5m = EnumC1805800x5m.LIVE_DETAIL;
            }
            String value = enumC1805800x5m.getValue();
            C1804110x33 c1804110x33 = EnumC1804100x32.Companion;
            Integer numLJ = C2286608xc.LJ(this.LLILLJJLI);
            boolean zCanRedirectRechargeV3 = ((IWalletService) C1161920gLG.LIZJ(IWalletService.class)).canRedirectRechargeV3();
            boolean zIsV3Phase2 = ((IWalletService) C1161920gLG.LIZJ(IWalletService.class)).isV3Phase2(this.LLILLJJLI);
            c1804110x33.getClass();
            EnumC1804100x32 enumC1804100x32LIZ = C1804110x33.LIZ(zCanRedirectRechargeV3, numLJ, zIsV3Phase2);
            if (enumC1804100x32LIZ != null) {
                hash = enumC1804100x32LIZ.getHash();
            } else {
                hash = null;
            }
            IWalletService iWalletService = (IWalletService) C1161920gLG.LIZJ(IWalletService.class);
            C1126800fQc.LIZ.py();
            C1154110g8f c1154110g8f = new C1154110g8f(iWalletService.getCashierV3(null, C1134860fdc.LIZ.LIZIZ(this.LLILLJJLI, 0), null, null, this.LLILLJJLI, false, false, this.LLILLL, value, hash), this.LLILZ);
            C1804210x3D c1804210x3D = this.LLILZIL;
            C1805120x4g c1805120x4g = c1804210x3D.LIZLLL;
            if (c1805120x4g == null) {
                synchronized (c1804210x3D) {
                    c1805120x4g = c1804210x3D.LIZLLL;
                    if (c1805120x4g == null) {
                        c1805120x4g = new C1805120x4g();
                        c1804210x3D.LIZLLL = c1805120x4g;
                    }
                }
            }
            this.LL = 1;
            if (c1805120x4g.LJ(c1154110g8f, this) == objLJFF) {
                C1C7U.LIZIZ("RechargeService@2914.preloadCashier$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("RechargeService@2914.preloadCashier$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
