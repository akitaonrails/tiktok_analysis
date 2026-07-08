package X;

import com.bytedance.android.livesdk.livesetting.wallet.LiveWalletPreloadWebviewConfigSetting;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS315S0000000_28;
import kotlin.jvm.internal.AFwS350S0000000_28;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.0zK1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
@C09DV(c = "com.bytedance.android.live.walletclean.domain.usecase.preload.MoneyPlatformContainerPreloadUseCase$execute$2", f = "MoneyPlatformContainerPreloadUseCase.kt", l = {}, m = "invokeSuspend")
public final class C1891510zK1 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ LiveWalletPreloadWebviewConfigSetting.WalletPreloadWebviewConfig LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1891510zK1(LiveWalletPreloadWebviewConfigSetting.WalletPreloadWebviewConfig walletPreloadWebviewConfig, InterfaceC1364105Vn<? super C1891510zK1> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = walletPreloadWebviewConfig;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1891510zK1(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("MoneyPlatformContainerPreloadUseCase@6220.execute$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C1097680efe c1097680efe = new C1097680efe();
        LiveWalletPreloadWebviewConfigSetting.WalletPreloadWebviewConfig walletPreloadWebviewConfig = this.LL;
        c1097680efe.LJIIZILJ = true;
        c1097680efe.LIZ = "money_platform";
        c1097680efe.LJIJ = 1;
        c1097680efe.LJIJI = walletPreloadWebviewConfig.ttlSeconds;
        c1097680efe.LIZIZ = 1;
        c1097680efe.LIZJ = 1;
        c1097680efe.LJIJJ = AFwS350S0000000_28.get$arr$(6);
        c1097680efe.LJIIIIZZ = AFwS315S0000000_28.get$arr$(38);
        c1097680efe.LJJ = true;
        c1097680efe.LJ = true;
        C1537060q6K c1537060q6K = C1529590puH.LIZ;
        C1537060q6K.LJIIL(c1097680efe, Boolean.FALSE);
        final SparkContext sparkContext = new SparkContext();
        sparkContext.LJJLIIJ("aweme://webview");
        sparkContext.LJJJJZI(new C19336810kw(1));
        final C013C c013c = new C013C();
        C1537060q6K.LJIIJJI(c1537060q6K, "aweme://webview", "money_platform", sparkContext, new C1537070q6L() { // from class: X.0zJz
            @Override // X.C1537070q6L
            public final void LIZLLL(String str, String str2, InterfaceC1105930esx interfaceC1105930esx) {
                if (c013c.element) {
                    SparkContext sparkContext2 = sparkContext;
                    try {
                        C1537060q6K c1537060q6K2 = C1529590puH.LIZ;
                        C1537060q6K.LIZIZ("aweme://webview", "money_platform", sparkContext2);
                        C189200o6.m2constructorimpl(Unit.LIZ);
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        C189200o6.m2constructorimpl(new C098200Yq(th));
                    }
                }
            }
        }, false, null, 48);
        C1537900q7g c1537900q7g = C1541950qED.LIZJ;
        AbstractC1538690q8x abstractC1538690q8x = new AbstractC1538690q8x() { // from class: X.0zK0
            @Override // X.AbstractC1538690q8x
            public final String LJI() {
                return "money_platform";
            }

            @Override // X.AbstractC1538690q8x
            public final void LJ(SparkContext sparkContext2, String str) {
                super.LJ(sparkContext2, str);
                if (!Intrinsics.LJFF(str, "money_platform")) {
                    return;
                }
                sparkContext2.LJJJJZI(new C19336910kx(c013c, 2));
            }
        };
        c1537900q7g.getClass();
        C1537900q7g.LJIIIIZZ(abstractC1538690q8x);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("MoneyPlatformContainerPreloadUseCase@6220.execute$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
