package X;

import com.bytedance.android.livesdk.livesetting.wallet.LiveWalletCashierPreloadTimeoutSetting;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS296S0000000_12;
import kotlin.jvm.internal.AFwS336S0000000_12;
import njp.a;

/* JADX INFO: renamed from: X.0x9e, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
@C09DV(c = "com.bytedance.android.live.walletclean.domain.usecase.preload.FECashierPreloadUseCase$execute$2", f = "FECashierPreloadUseCase.kt", l = {}, m = "invokeSuspend")
public final class C1808200x9e extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ C1154110g8f LLILLJJLI;
    public final /* synthetic */ C1805120x4g LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1808200x9e(String str, C1154110g8f c1154110g8f, C1805120x4g c1805120x4g, InterfaceC1364105Vn<? super C1808200x9e> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = str;
        this.LLILLJJLI = c1154110g8f;
        this.LLILLL = c1805120x4g;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1808200x9e(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("FECashierPreloadUseCase@95f6.execute$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C1537060q6K c1537060q6K = C1529590puH.LIZ;
        C1097680efe c1097680efe = new C1097680efe();
        c1097680efe.LJIIZILJ = true;
        c1097680efe.LIZ = "live_wallet_recharge_v3_cashier";
        c1097680efe.LJIJ = 1;
        c1097680efe.LJIJI = LiveWalletCashierPreloadTimeoutSetting.INSTANCE.getValue();
        c1097680efe.LIZIZ = 1;
        c1097680efe.LIZJ = 1;
        c1097680efe.LJII = 2;
        c1097680efe.LJIIIIZZ = AFwS296S0000000_12.get$arr$(10);
        c1097680efe.LJIJJ = AFwS336S0000000_12.get$arr$(3);
        c1097680efe.LJIJJLI = new ArrayList();
        c1097680efe.LJIL = C1697810uHb.LJ("*");
        c1097680efe.LJJ = true;
        C1537060q6K.LJIIL(c1097680efe, Boolean.FALSE);
        C1537060q6K.LJIIJJI(c1537060q6K, this.LL, "live_wallet_recharge_v3_cashier", new C1537480q70(), null, true, null, 40);
        long jLIZ = C158B.LIZ();
        C1154110g8f c1154110g8f = this.LLILLJJLI;
        C1805120x4g c1805120x4g = this.LLILLL;
        String str = this.LL;
        if (!c1154110g8f.LIZIZ) {
            c1805120x4g.getClass();
            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_wallet_cashier_v3_preload");
            c474500IjALIZ.LJJII(Long.valueOf(jLIZ), "timestamp");
            c474500IjALIZ.LJJII(str, "schema");
            C1803800x2Y.LIZ.getClass();
            C1803800x2Y.LJJJJJL(c474500IjALIZ);
            C389001fE.LIZ("live_recharge_v3_will_preload_cashier", null, System.currentTimeMillis(), false);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("FECashierPreloadUseCase@95f6.execute$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
