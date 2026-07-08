package X;

import com.bytedance.android.live.wallet.IWalletService;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0x2P, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
@C09DV(c = "com.bytedance.android.live.wallet.jsb.impl.PreloadLiveWalletCashierMethod$handle$1", f = "PreloadLiveWalletCashierMethod.kt", l = {58}, m = "invokeSuspend")
public final class C1803710x2P extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ int LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;
    public final /* synthetic */ InterfaceC1803740x2S LLILZ;
    public final /* synthetic */ C1803720x2Q LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1803710x2P(int i, boolean z, InterfaceC1803740x2S interfaceC1803740x2S, C1803720x2Q c1803720x2Q, InterfaceC1364105Vn<? super C1803710x2P> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = i;
        this.LLILLL = z;
        this.LLILZ = interfaceC1803740x2S;
        this.LLILZIL = c1803720x2Q;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1803710x2P(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PreloadLiveWalletCashierMethod@7088.handle$1");
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
            IWalletService iWalletService = (IWalletService) C1161920gLG.LIZJ(IWalletService.class);
            C1126800fQc.LIZ.py();
            String cashierV3 = iWalletService.getCashierV3(null, C1134860fdc.LIZ.LIZIZ(this.LLILLJJLI, 0), null, null, this.LLILLJJLI, false, false, this.LLILLL, this.LLILZ.getPreloadRequestPage(), this.LLILZ.getPreloadChargeFrom());
            C1803720x2Q c1803720x2Q = this.LLILZIL;
            C1805120x4g c1805120x4g = c1803720x2Q.LLILZ;
            if (c1805120x4g == null) {
                synchronized (c1803720x2Q) {
                    c1805120x4g = c1803720x2Q.LLILZ;
                    if (c1805120x4g == null) {
                        c1805120x4g = new C1805120x4g();
                        c1803720x2Q.LLILZ = c1805120x4g;
                    }
                }
            }
            C1154110g8f c1154110g8f = new C1154110g8f(cashierV3, false);
            this.LL = 1;
            if (c1805120x4g.LJ(c1154110g8f, this) == objLJFF) {
                C1C7U.LIZIZ("PreloadLiveWalletCashierMethod@7088.handle$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("PreloadLiveWalletCashierMethod@7088.handle$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
