package X;

import Y.AfS196S0100000_27;
import android.content.Context;
import com.bytedance.WalletRechargeService;
import com.bytedance.android.live.browser.IHybridStorageService;
import com.bytedance.android.live.iap.service.IapService;
import com.bytedance.android.live.wallet.IWalletService;
import com.bytedance.android.live.wallet.api.IapApi;
import com.bytedance.android.live.wallet.data.api.IRechargeApi;
import com.bytedance.android.live.wallet.model.recharge.RecommendStrategyParam;
import com.bytedance.android.livesdk.api.revenue.strategy.IRevenueStrategyService;
import com.bytedance.android.livesdk.livesetting.other.SlardarSampleSetting;
import com.bytedance.android.livesdk.livesetting.wallet.LiveRechargePanelRefactorSetting;
import com.bytedance.android.livesdk.livesetting.wallet.LiveWalletCacheMappingSetting;
import com.bytedance.android.livesdk.livesetting.wallet.LiveWalletClearCacheFirstPaymentSetting;
import com.bytedance.android.livesdk.livesetting.wallet.LiveWalletNewCacheEnabledSetting;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdk.wallet.Diamond;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AFwS314S0000000_27;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import tikcast.api.wallet.tiktok.GetABSStatusResponse;
import webcast.api.profit.IapListResult;
import webcast.api.profit.ListV3Result;

/* JADX INFO: renamed from: X.0x3D, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1804210x3D implements InterfaceC1803290x1j {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LJ;
    public final C054G LIZ = C2296808zG.LIZ(C0PEM.LIZJ);
    public final InterfaceC1321570kUl<C1284040jWE, C1804840x4E> LIZIZ;
    public volatile InterfaceC1804490x3f LIZJ;
    public volatile C1805120x4g LIZLLL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C1804210x3D.class, "getPackageListUseCase", "getGetPackageListUseCase()Lcom/bytedance/android/live/walletclean/domain/usecase/packagelist/IGetPackageListUseCase;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C1804210x3D.class, "feCashierPreloadUseCase", "getFeCashierPreloadUseCase()Lcom/bytedance/android/live/walletclean/domain/usecase/preload/IFECashierPreloadUseCase;", 0);
        c09r3.getClass();
        LJ = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
    }

    @Override // X.InterfaceC1803290x1j
    public final int LIZJ() {
        C1804820x4C c1804820x4C;
        Integer numLJIL;
        C1804840x4E c1804840x4ELJIILIIL = LJIILIIL(C07LT.LIZ(0), null, null);
        return (!(c1804840x4ELJIILIIL instanceof C1804820x4C) || (c1804820x4C = (C1804820x4C) c1804840x4ELJIILIIL) == null || (numLJIL = c1804820x4C.LJIL()) == null) ? EnumC1804200x3C.RECHARGE_V3_VERSION_UNKNOWN.getVersion() : numLJIL.intValue();
    }

    @Override // X.InterfaceC1803290x1j
    public final String LIZ() {
        Context context;
        IHybridStorageService iHybridStorageService;
        IHostAppContext iHostAppContext = (IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class);
        if (iHostAppContext == null || (context = iHostAppContext.context()) == null || (iHybridStorageService = (IHybridStorageService) C1161920gLG.LIZJ(IHybridStorageService.class)) == null) {
            return null;
        }
        return (String) iHybridStorageService.Pp2(context, "live_recharge_v3_last_tab_panel_channel", null);
    }

    @Override // X.InterfaceC1803290x1j
    public final void LJIIZILJ() {
        C1284020jWC c1284020jWC;
        if (LiveWalletClearCacheFirstPaymentSetting.INSTANCE.getValue()) {
            int iLIZJ = LIZJ();
            C1804190x3B c1804190x3B = EnumC1804200x3C.Companion;
            Integer numValueOf = Integer.valueOf(iLIZJ);
            c1804190x3B.getClass();
            int version = EnumC1804200x3C.RECHARGE_V3_VERSION_PHASE_2_1.getVersion();
            if (numValueOf == null || numValueOf.intValue() != version) {
                int version2 = EnumC1804200x3C.RECHARGE_V3_VERSION_PHASE_2_2_V1.getVersion();
                if (numValueOf == null || numValueOf.intValue() != version2) {
                    int version3 = EnumC1804200x3C.RECHARGE_V3_VERSION_PHASE_2_2_V2.getVersion();
                    if (numValueOf == null || numValueOf.intValue() != version3) {
                        return;
                    }
                }
            }
            IRevenueStrategyService iRevenueStrategyService = C1126800fQc.LIZ;
            if (!iRevenueStrategyService.M92().kb()) {
                iRevenueStrategyService.M92();
                if (!C1133940fc8.LJIIJJI()) {
                    return;
                }
            }
            InterfaceC1321570kUl<C1284040jWE, C1804840x4E> interfaceC1321570kUl = this.LIZIZ;
            if (!(interfaceC1321570kUl instanceof C1284020jWC) || (c1284020jWC = (C1284020jWC) interfaceC1321570kUl) == null) {
                return;
            }
            c1284020jWC.LIZ.clear();
        }
    }

    public final InterfaceC1804490x3f LJIJ() {
        InterfaceC1804490x3f interfaceC1804490x3f = this.LIZJ;
        if (interfaceC1804490x3f == null) {
            synchronized (this) {
                interfaceC1804490x3f = this.LIZJ;
                if (interfaceC1804490x3f == null) {
                    InterfaceC1804490x3f interfaceC1804490x3fLJJIFFI = C1807670x8n.LJJIFFI(new C1804410x3X((C1804610x3r) C1807670x8n.LJJIII(new C1805070x4b(new C1804400x3W()), C1807670x8n.LJIL(), C1807670x8n.LJIJJLI(), C1807670x8n.LJJI(), C1807670x8n.LJJ())), new C1804340x3Q((C1804610x3r) C1807670x8n.LJJIII(new C1805070x4b(new C1804400x3W()), C1807670x8n.LJIL(), C1807670x8n.LJIJJLI(), C1807670x8n.LJJI(), C1807670x8n.LJJ())), new C1804330x3P(), new C1796830wrJ(), new C1804220x3E(new C1796830wrJ(), (C1804610x3r) C1807670x8n.LJJIII(new C1805070x4b(new C1804400x3W()), C1807670x8n.LJIL(), C1807670x8n.LJIJJLI(), C1807670x8n.LJJI(), C1807670x8n.LJJ()), C1807670x8n.LJJI()), new C1804590x3p((C1804610x3r) C1807670x8n.LJJIII(new C1805070x4b(new C1804400x3W()), C1807670x8n.LJIL(), C1807670x8n.LJIJJLI(), C1807670x8n.LJJI(), C1807670x8n.LJJ())), new C1807890x99(), new C1803570x2B());
                    C1804300x3M c1804300x3MLJJII = C1807670x8n.LJJII(new C1804410x3X((C1804610x3r) C1807670x8n.LJJIII(new C1805070x4b(new C1804400x3W()), C1807670x8n.LJIL(), C1807670x8n.LJIJJLI(), C1807670x8n.LJJI(), C1807670x8n.LJJ())), new C1804430x3Z((C1804610x3r) C1807670x8n.LJJIII(new C1805070x4b(new C1804400x3W()), C1807670x8n.LJIL(), C1807670x8n.LJIJJLI(), C1807670x8n.LJJI(), C1807670x8n.LJJ())), new C1804320x3O(), new C1796830wrJ(), new C1804220x3E(new C1796830wrJ(), (C1804610x3r) C1807670x8n.LJJIII(new C1805070x4b(new C1804400x3W()), C1807670x8n.LJIL(), C1807670x8n.LJIJJLI(), C1807670x8n.LJJI(), C1807670x8n.LJJ()), C1807670x8n.LJJI()), new C1804590x3p((C1804610x3r) C1807670x8n.LJJIII(new C1805070x4b(new C1804400x3W()), C1807670x8n.LJIL(), C1807670x8n.LJIJJLI(), C1807670x8n.LJJI(), C1807670x8n.LJJ())), new C1807890x99(), new C1803570x2B());
                    if (((IWalletService) C1161920gLG.LIZJ(IWalletService.class)).canRedirectRechargeV3()) {
                        interfaceC1804490x3fLJJIFFI = c1804300x3MLJJII;
                    }
                    this.LIZJ = interfaceC1804490x3fLJJIFFI;
                    return interfaceC1804490x3fLJJIFFI;
                }
            }
        }
        return interfaceC1804490x3f;
    }

    @Override // X.InterfaceC1803290x1j
    public final String getStoreDescription() {
        WalletRechargeService walletRechargeService = (WalletRechargeService) PluggableExtentionKt.pluggableSpi$default(WalletRechargeService.class, false, false, false, 14, null);
        if (walletRechargeService != null) {
            walletRechargeService.getStoreDescription();
        }
        return null;
    }

    public C1804210x3D() {
        this.LIZIZ = LiveWalletNewCacheEnabledSetting.INSTANCE.getValue() ? new C1284020jWC() : new InterfaceC1321570kUl<C1284040jWE, C1804840x4E>() { // from class: X.0jbO
            public final C098J<String, C1804840x4E> LIZ = new C098J<>(3);

            @Override // X.InterfaceC1321570kUl
            public final void LIZ(C1284040jWE c1284040jWE) {
                this.LIZ.LIZ(c1284040jWE.LIZ());
            }

            @Override // X.InterfaceC1321570kUl
            public final C1804840x4E LIZIZ(InterfaceC1284030jWD interfaceC1284030jWD, C1284040jWE c1284040jWE) {
                C1284040jWE c1284040jWE2 = c1284040jWE;
                if (interfaceC1284030jWD.canUse()) {
                    C1804840x4E c1804840x4E = this.LIZ.get(c1284040jWE2.LIZ());
                    if (c1804840x4E == null || System.currentTimeMillis() - c1804840x4E.LIZLLL > 2147483647L) {
                        this.LIZ.LIZ(c1284040jWE2.LIZ());
                    } else {
                        return c1804840x4E;
                    }
                }
                return null;
            }

            @Override // X.InterfaceC1321570kUl
            public final void LIZJ(InterfaceC1284030jWD interfaceC1284030jWD, C1284040jWE c1284040jWE, C1804840x4E c1804840x4E) {
                C1284040jWE c1284040jWE2 = c1284040jWE;
                if (interfaceC1284030jWD.canCache()) {
                    this.LIZ.put(c1284040jWE2.LIZ(), c1804840x4E);
                }
            }
        };
    }

    @Override // X.InterfaceC1803290x1j
    public final boolean LJIIIIZZ() {
        int iLIZJ = LIZJ();
        C1804190x3B c1804190x3B = EnumC1804200x3C.Companion;
        Integer numValueOf = Integer.valueOf(iLIZJ);
        c1804190x3B.getClass();
        return numValueOf != null && numValueOf.intValue() == EnumC1804200x3C.RECHARGE_V3_VERSION_PHASE_2_2_V2.getVersion() && C1804180x3A.LIZJ();
    }

    @Override // X.InterfaceC1803290x1j
    public final boolean LIZLLL() {
        return C1804800x4A.LIZ;
    }

    public static void LJIJJ(String str) {
        if (((IWalletService) C1161920gLG.LIZJ(IWalletService.class)).canRedirectRechargeV3()) {
            ((IWalletService) C1161920gLG.LIZJ(IWalletService.class)).setRechargeV3Cache(Long.valueOf(UserService.getInstance().user().getCurrentUserId()), str);
        }
    }

    @Override // X.InterfaceC1803290x1j
    public final void LJFF(String str) {
        C480460Ism.LIZ().getClass();
        ((IRechargeApi) C480460Ism.LIZLLL(IRechargeApi.class)).ackCoinsSocket(str).LJIILIIL(new C0UO0()).LJJLJ();
    }

    @Override // X.InterfaceC1803290x1j
    public final void LJIIJ(GetABSStatusResponse.ABSData aBSData) {
        C1797220wrw.LL = aBSData;
    }

    @Override // X.InterfaceC1803290x1j
    public final void LJIIJJI(List<? extends Diamond> list) {
        String strLIZLLL;
        boolean zLJI = MethodIDManager.LJI(202213);
        if (list != null && !list.isEmpty()) {
            strLIZLLL = ((Diamond) ListProtector.get(list, 0)).LIZIZ;
        } else {
            strLIZLLL = C1797270ws1.LIZIZ().LIZLLL();
        }
        if ((!C1796440wqg.LIZIZ()) && strLIZLLL.length() != 0) {
            C480460Ism.LIZ().getClass();
            ((IapApi) C480460Ism.LIZLLL(IapApi.class)).getGoogleABSStatus(0, strLIZLLL).LJIILIIL(new C0UO0()).LJJLL(new C09JN() { // from class: X.0wsR
                @Override // X.C09JN
                public final void accept(Object obj) {
                    C1C7U.LIZ("RechargeService@2914.queryGoogleABSStatus$disposable$1");
                    GetABSStatusResponse.ABSData aBSData = C1797220wrw.LL;
                    C1797220wrw.LL = ((GetABSStatusResponse) obj).data;
                    C1C7U.LIZIZ("RechargeService@2914.queryGoogleABSStatus$disposable$1");
                }
            }, new C09JN() { // from class: X.0wsS
                @Override // X.C09JN
                public final /* bridge */ /* synthetic */ void accept(Object obj) {
                    C1C7U.LIZ("RechargeService@2914.queryGoogleABSStatus$disposable$2");
                    C1C7U.LIZIZ("RechargeService@2914.queryGoogleABSStatus$disposable$2");
                }
            });
            if (zLJI) {
                MethodIDManager.LJ();
                return;
            }
            return;
        }
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }

    @Override // X.InterfaceC1803290x1j
    public final void LJIILJJIL(Boolean bool) {
        if (bool != null) {
            bool.booleanValue();
            C1804800x4A.LIZ = bool.booleanValue();
        }
    }

    @Override // X.InterfaceC1803290x1j
    public final void LJIILL(boolean z) {
        if (((IWalletService) C1161920gLG.LIZJ(IWalletService.class)).isSupportPreloadReuseCashier(0, true)) {
            C23250099c.LIZLLL(this.LIZ, null, null, new C1803680x2M(0, true, z, this, null), 3);
        }
    }

    @Override // X.InterfaceC1803290x1j
    public final void LJIILLIIL(String str) {
        C1804450x3b.LIZ(str);
    }

    @Override // X.InterfaceC1803290x1j
    public final void LJIIL(EnumC587980N4i enumC587980N4i, String str) {
        int iIntValue;
        String strLIZJ = C1797270ws1.LIZIZ().LIZJ();
        Integer value = LiveWalletCacheMappingSetting.INSTANCE.getValue(2);
        if (value != null) {
            iIntValue = value.intValue();
        } else {
            iIntValue = 2;
        }
        this.LIZIZ.LIZ(new C1284040jWE(UserService.getInstance().user().getCurrentUserId(), iIntValue, strLIZJ, enumC587980N4i, str));
    }

    @Override // X.InterfaceC1803290x1j
    public final C1804840x4E LJIILIIL(int i, EnumC587980N4i enumC587980N4i, String str) {
        int iIntValue;
        Integer value = LiveWalletCacheMappingSetting.INSTANCE.getValue(i);
        if (value != null) {
            iIntValue = value.intValue();
        } else {
            iIntValue = 2;
        }
        return this.LIZIZ.LIZIZ(EnumC1803160x1W.USE, new C1284040jWE(UserService.getInstance().user().getCurrentUserId(), iIntValue, C1797270ws1.LIZIZ().LIZLLL(), enumC587980N4i, str));
    }

    @Override // X.InterfaceC1803290x1j
    public final void LIZIZ(InterfaceC1284030jWD interfaceC1284030jWD, int i, C1804840x4E c1804840x4E, String str, int i2) {
        int iIntValue;
        Integer value = LiveWalletCacheMappingSetting.INSTANCE.getValue(i);
        if (value != null) {
            iIntValue = value.intValue();
        } else {
            iIntValue = 2;
        }
        this.LIZIZ.LIZJ(interfaceC1284030jWD, new C1284040jWE(UserService.getInstance().user().getCurrentUserId(), iIntValue, str, EnumC587980N4i.STRATEGY_TASK, String.valueOf(i2)), c1804840x4E);
    }

    @Override // X.InterfaceC1803290x1j
    public final void LJI(final int i, final long j, final long j2, final EnumC1803160x1W enumC1803160x1W, final boolean z) {
        boolean zLJI = MethodIDManager.LJI(202530);
        C11NZ.LJIJJLI(new InterfaceC1478005qU() { // from class: X.0x3J
            @Override // X.InterfaceC1478005qU
            public final void subscribe(C09AJ<C1804840x4E> c09aj) {
                C1C7U.LIZ("RechargeService@2914.loadProductCache$1");
                if (LiveRechargePanelRefactorSetting.INSTANCE.getValue()) {
                    C1804210x3D c1804210x3D = this.LIZ;
                    C01KE.LIZ(c1804210x3D.LIZ, new C1804240x3G(c1804210x3D, i, enumC1803160x1W, j, j2, z, c09aj, null));
                } else {
                    C1807890x99 c1807890x99 = new C1807890x99();
                    C1804210x3D c1804210x3D2 = this.LIZ;
                    int i2 = i;
                    long j3 = j;
                    long j4 = j2;
                    InterfaceC1284030jWD interfaceC1284030jWD = enumC1803160x1W;
                    boolean z2 = z;
                    C1126800fQc.LIZ.py();
                    c09aj.onNext(c1804210x3D2.LJIJI(i2, j3, j4, interfaceC1284030jWD, true, null, z2, C1134860fdc.LIZ.LIZJ(i, 0), c1807890x99));
                    c09aj.onComplete();
                }
                C1C7U.LIZIZ("RechargeService@2914.loadProductCache$1");
            }
        }).LJL(C11S5.LIZ()).LJJLL(new C09JN() { // from class: X.00Lo
            @Override // X.C09JN
            public final /* bridge */ /* synthetic */ void accept(Object obj) {
                C1C7U.LIZ("RechargeService@2914.loadProductCache$2");
                C1C7U.LIZIZ("RechargeService@2914.loadProductCache$2");
            }
        }, new C09JN() { // from class: X.00Lp
            @Override // X.C09JN
            public final /* bridge */ /* synthetic */ void accept(Object obj) {
                C1C7U.LIZ("RechargeService@2914.loadProductCache$3");
                C1C7U.LIZIZ("RechargeService@2914.loadProductCache$3");
            }
        });
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }

    @Override // X.InterfaceC1803290x1j
    public final C1804840x4E LJII(int i, InterfaceC1284030jWD interfaceC1284030jWD, String str, EnumC587980N4i enumC587980N4i, String str2) {
        int iIntValue;
        Integer value = LiveWalletCacheMappingSetting.INSTANCE.getValue(i);
        if (value != null) {
            iIntValue = value.intValue();
        } else {
            iIntValue = 2;
        }
        return this.LIZIZ.LIZIZ(interfaceC1284030jWD, new C1284040jWE(UserService.getInstance().user().getCurrentUserId(), iIntValue, str, enumC587980N4i, str2));
    }

    @Override // X.InterfaceC1803290x1j
    public final C19482711Kf LJ(final int i, final long j, final long j2, final RecommendStrategyParam recommendStrategyParam, final InterfaceC1284030jWD interfaceC1284030jWD, final int i2, final InterfaceC1804390x3V interfaceC1804390x3V, final boolean z) {
        return C11NZ.LJIJJLI(new InterfaceC1478005qU() { // from class: X.0x3K
            @Override // X.InterfaceC1478005qU
            public final void subscribe(C09AJ<C1804840x4E> c09aj) {
                C1C7U.LIZ("RechargeService@2914.queryDiamond$1");
                if (LiveRechargePanelRefactorSetting.INSTANCE.getValue()) {
                    C1804210x3D c1804210x3D = this.LIZ;
                    C01KE.LIZ(c1804210x3D.LIZ, new C1804250x3H(c1804210x3D, i, interfaceC1284030jWD, j, j2, recommendStrategyParam, z, i2, c09aj, null));
                } else {
                    try {
                        c09aj.onNext(this.LIZ.LJIJI(i, j, j2, interfaceC1284030jWD, false, recommendStrategyParam, z, i2, interfaceC1804390x3V));
                        c09aj.onComplete();
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        if (c09aj.isDisposed()) {
                            C20441214yg.LJFF("RechargeService", " queryDiamond disposed", th);
                        } else {
                            c09aj.onError(th);
                        }
                    }
                }
                C1C7U.LIZIZ("RechargeService@2914.queryDiamond$1");
            }
        });
    }

    @Override // X.InterfaceC1803290x1j
    public final void LJIIIZ(boolean z, String str, int i, String str2, int i2, String str3, String str4, String str5) {
        if (z) {
            C1796810wrH.LIZ.LIZIZ(str4);
        } else {
            C1796810wrH.LIZ.LIZ(str, i, i2, str2, str3, str4, str5);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v11, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r3v12, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r3v13, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r8v12, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r8v13, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r8v14, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r9v5, types: [X.0x3I] */
    public final C1804840x4E LJIJI(final int i, final long j, final long j2, InterfaceC1284030jWD interfaceC1284030jWD, final boolean z, final RecommendStrategyParam recommendStrategyParam, boolean z2, final int i2, InterfaceC1804390x3V interfaceC1804390x3V) throws JSONException {
        C1803560x2A c1803560x2ALIZJ;
        int i3;
        C1804840x4E c1804840x4ELJII;
        long j3;
        String packageName;
        String str;
        int i4;
        String str2;
        ?? arrayList;
        List list;
        List<Diamond> list2;
        IapListResult.IapCustomData iapCustomData;
        Context context;
        String packageName2;
        String str3;
        final List list3;
        final List<Diamond> list4;
        Boolean boolValueOf;
        String str4;
        List<Diamond> list5;
        ?? arrayList2;
        boolean z3;
        List<Diamond> list6;
        IapListResult.IapCustomData iapCustomData2;
        Context context2;
        String strValueOf;
        boolean zLJI = MethodIDManager.LJI(202502);
        if (interfaceC1284030jWD == EnumC1803160x1W.USE) {
            InterfaceC1106030et7.R5.LJFF(Long.valueOf(System.currentTimeMillis()));
        }
        String strLIZ = null;
        if (SlardarSampleSetting.INSTANCE.isReport("ttlive_wallet_recharge_query_package_start_all", 0.0d)) {
            C1803440x1y.LIZ("ttlive_wallet_recharge_query_package_start", null);
        }
        if (z2) {
            if (i == 2) {
                strValueOf = "live_room";
            } else {
                strValueOf = String.valueOf(i);
            }
            c1803560x2ALIZJ = C1803540x28.LIZJ(strValueOf);
        } else {
            c1803560x2ALIZJ = null;
        }
        if (interfaceC1804390x3V != null) {
            interfaceC1804390x3V.LJFF();
        }
        final String strLIZJ = C1797270ws1.LIZIZ().LIZJ();
        if (interfaceC1804390x3V != null) {
            interfaceC1804390x3V.LIZLLL();
        }
        if (c1803560x2ALIZJ != null) {
            c1803560x2ALIZJ.LJFF = C158B.LIZ();
        }
        String str5 = "";
        if (c1803560x2ALIZJ != null) {
            c1803560x2ALIZJ.LIZ = !Intrinsics.LJFF(strLIZJ, "");
        }
        if (LiveWalletNewCacheEnabledSetting.INSTANCE.getValue()) {
            c1804840x4ELJII = LJII(i, interfaceC1284030jWD, strLIZJ, EnumC587980N4i.STRATEGY_TASK, String.valueOf(i2));
            i3 = i;
        } else {
            if (i2 != 0) {
                i3 = (i2 * 100) + i;
            } else {
                i3 = i;
            }
            c1804840x4ELJII = LJII(i3, interfaceC1284030jWD, strLIZJ, null, null);
        }
        if (c1804840x4ELJII != null) {
            C1803440x1y.LIZ("ttlive_wallet_recharge_query_package_get_cache", null);
            c1804840x4ELJII.LJ = true;
            if (c1803560x2ALIZJ != null) {
                c1803560x2ALIZJ.LIZIZ = true;
                c1803560x2ALIZJ.LJI = C158B.LIZ();
                c1803560x2ALIZJ.LIZJ = true;
                c1803560x2ALIZJ.LJII = C158B.LIZ();
                C1803540x28.LIZIZ(c1803560x2ALIZJ);
            }
            if (zLJI) {
                MethodIDManager.LJ();
            }
            return c1804840x4ELJII;
        }
        if (interfaceC1804390x3V != null) {
            interfaceC1804390x3V.LIZIZ();
        }
        if (((IWalletService) C1161920gLG.LIZJ(IWalletService.class)).canRedirectRechargeV3()) {
            Long lLIZ = C1804180x3A.LIZ();
            IWalletService iWalletService = (IWalletService) C1161920gLG.LIZJ(IWalletService.class);
            if (recommendStrategyParam != null) {
                strLIZ = recommendStrategyParam.LIZ();
            }
            String billingCountryCode = ((InterfaceC1791930wjP) C1161920gLG.LIZJ(IapService.class)).getBillingCountryCode();
            IHostAppContext iHostAppContext = (IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class);
            if (iHostAppContext == null || (context2 = iHostAppContext.context()) == null || (packageName2 = context2.getPackageName()) == null) {
                packageName2 = "";
            }
            ListV3Result listV3ResultLIZLLL = iWalletService.fetchDiamondV3(strLIZJ, i, j, j2, z, strLIZ, i2, billingCountryCode, packageName2, lLIZ, AFwS314S0000000_27.get$arr$(21)).LIZLLL();
            if (interfaceC1804390x3V != null) {
                interfaceC1804390x3V.LIZ();
            }
            ListV3Result.Extra extra = listV3ResultLIZLLL.extra;
            if (extra != null && (iapCustomData2 = extra.iapCustomData) != null) {
                str3 = iapCustomData2.rechargeV3PanelUrl;
            } else {
                str3 = null;
            }
            LJIJJ(str3);
            if (c1803560x2ALIZJ != null) {
                c1803560x2ALIZJ.LJI = C158B.LIZ();
                ListV3Result.Data data = listV3ResultLIZLLL.data;
                if (data != null && (list6 = data.list) != null && (!list6.isEmpty())) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                c1803560x2ALIZJ.LIZIZ = z3;
            }
            HashSet hashSet = new HashSet();
            ListV3Result.Data data2 = listV3ResultLIZLLL.data;
            if (data2 != null) {
                List<Diamond> list7 = data2.list;
                if (list7 != null) {
                    arrayList2 = new ArrayList(C15438062q.LJIJJ(list7, 10));
                    Iterator<Diamond> it2 = list7.iterator();
                    while (it2.hasNext()) {
                        arrayList2.add(it2.next().iapId);
                    }
                } else {
                    arrayList2 = C13BV.INSTANCE;
                }
                hashSet.addAll(arrayList2);
            }
            ListV3Result.Extra extra2 = listV3ResultLIZLLL.extra;
            if (extra2 != null && (list5 = extra2.fullList) != null) {
                ArrayList arrayList3 = new ArrayList(C15438062q.LJIJJ(list5, 10));
                Iterator<Diamond> it3 = list5.iterator();
                while (it3.hasNext()) {
                    arrayList3.add(it3.next().iapId);
                }
                hashSet.addAll(arrayList3);
            }
            List listLLIIII = C13LP.LLIIII(hashSet);
            if (interfaceC1804390x3V != null) {
                interfaceC1804390x3V.LJIIIZ();
            }
            final List<Diamond> listLIZ = C13BV.INSTANCE;
            try {
                listLIZ = new C1792960wl4(listLLIIII, false).LIZ();
                if (interfaceC1804390x3V != null) {
                    interfaceC1804390x3V.LJI();
                }
                if (c1803560x2ALIZJ != null) {
                    c1803560x2ALIZJ.LJII = C158B.LIZ();
                    c1803560x2ALIZJ.LIZJ = true ^ listLIZ.isEmpty();
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                C20441214yg.LIZIZ("RechargeService", e.getMessage());
                ListV3Result.Data data3 = listV3ResultLIZLLL.data;
                if (data3 != null) {
                    data3.list = new ArrayList();
                }
            }
            ListV3Result.Data data4 = listV3ResultLIZLLL.data;
            if (data4 == null || (list3 = data4.list) == null) {
                list3 = C13BV.INSTANCE;
            }
            if (data4 != null) {
                list4 = data4.listV3;
            } else {
                list4 = null;
            }
            final ListV3Result.Extra extra3 = listV3ResultLIZLLL.extra;
            C1804840x4E c1804840x4ELIZIZ = new C1804350x3R(list3, list4, extra3, listLIZ) { // from class: X.0x3I
                public final List<? extends Diamond> LIZLLL;
                public final List<? extends Diamond> LJ;
                public final ListV3Result.Extra LJFF;
                public final List<? extends Diamond> LJI;

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r4v0, types: [X.13BV] */
                /* JADX WARN: Type inference failed for: r4v1, types: [java.util.Collection] */
                /* JADX WARN: Type inference failed for: r4v2, types: [java.util.ArrayList] */
                public final C1804840x4E LIZIZ() {
                    List<? extends Diamond> list8;
                    ListV3Result.Extra extra4;
                    ?? arrayList4;
                    List list9;
                    ArrayList arrayList5 = new ArrayList();
                    ArrayList arrayList6 = new ArrayList();
                    List<? extends Diamond> list10 = this.LJI;
                    ArrayList arrayList7 = null;
                    if (list10 != null) {
                        int iLIZIZ = C2097908Jt.LIZIZ(C15438062q.LJIJJ(list10, 10));
                        if (iLIZIZ < 16) {
                            iLIZIZ = 16;
                        }
                        LinkedHashMap linkedHashMap = new LinkedHashMap(iLIZIZ);
                        for (Diamond diamond : list10) {
                            linkedHashMap.put(diamond.iapId, diamond);
                        }
                        LIZ(this.LIZLLL, linkedHashMap);
                        IapListResult.ListResultExtra listResultExtra = this.LIZIZ;
                        if (listResultExtra != null && listResultExtra.fullList == null && listResultExtra != null) {
                            listResultExtra.fullList = new ArrayList();
                        }
                        IapListResult.ListResultExtra listResultExtra2 = this.LIZIZ;
                        if (listResultExtra2 == null || (list9 = listResultExtra2.fullList) == null) {
                            list9 = C13BV.INSTANCE;
                        }
                        LIZ(list9, linkedHashMap);
                        for (Diamond diamond2 : this.LIZLLL) {
                            if (C2093608Ic.LJ(diamond2.LIZIZ)) {
                                arrayList6.add(diamond2);
                            } else {
                                arrayList5.add(diamond2);
                            }
                        }
                    }
                    IapListResult.ListResultExtra listResultExtra3 = this.LIZIZ;
                    if (listResultExtra3 != null) {
                        List<Diamond> list11 = listResultExtra3.fullList;
                        if (list11 != null) {
                            arrayList4 = new ArrayList();
                            for (Diamond diamond3 : list11) {
                                if (!C2093608Ic.LJ(diamond3.LIZIZ)) {
                                    arrayList4.add(diamond3);
                                }
                            }
                        } else {
                            arrayList4 = C13BV.INSTANCE;
                        }
                        listResultExtra3.fullList = new ArrayList((Collection) arrayList4);
                    }
                    boolean zIsValidForRechargeV3 = ((IWalletService) C1161920gLG.LIZJ(IWalletService.class)).isValidForRechargeV3();
                    String str6 = (!zIsValidForRechargeV3 || ((extra4 = this.LJFF) != null && extra4.lastTab == 1)) ? "google_play" : "tiktok";
                    if (zIsValidForRechargeV3 && (list8 = this.LJ) != null) {
                        arrayList7 = new ArrayList(C15438062q.LJIJJ(list8, 10));
                        for (Diamond diamond4 : list8) {
                            if (diamond4.LIZ()) {
                                diamond4.LIZ = 7;
                            }
                            arrayList7.add(diamond4);
                        }
                    }
                    return new C1804820x4C(arrayList5, this.LIZIZ, arrayList6, arrayList7, this.LJFF, str6);
                }

                public static void LIZ(List list8, Map map) {
                    Iterator it4 = list8.iterator();
                    while (it4.hasNext()) {
                        Diamond diamond = (Diamond) it4.next();
                        Diamond diamond2 = (Diamond) ((LinkedHashMap) map).get(diamond.iapId);
                        if (diamond2 != null) {
                            diamond.LJFF = diamond2.LJFF;
                            String str6 = diamond2.LIZIZ;
                            diamond.LJI = str6;
                            diamond.price = diamond2.price;
                            diamond.LIZJ = diamond2.LIZJ;
                            diamond.LIZIZ = str6;
                            diamond.LJ = diamond2.LJ;
                        }
                    }
                }

                {
                    super(list3, listLIZ, null);
                    this.LIZLLL = list3;
                    this.LJ = list4;
                    this.LJFF = extra3;
                    this.LJI = listLIZ;
                }
            }.LIZIZ();
            C1804820x4C c1804820x4C = (C1804820x4C) c1804840x4ELIZIZ;
            Diamond diamond = (Diamond) C13LP.LJJJLL(c1804820x4C.LJFF);
            if (diamond != null && (str4 = diamond.LIZIZ) != null) {
                str5 = str4;
            }
            C1797270ws1.LIZIZ().LJFF(str5);
            InterfaceC1803290x1j interfaceC1803290x1jLIZJ = C1797270ws1.LIZJ();
            IapListResult.ListResultExtra listResultExtra = c1804820x4C.LJI;
            if (listResultExtra != null) {
                boolValueOf = Boolean.valueOf(listResultExtra.coinSolutionAbEnabled);
            } else {
                boolValueOf = null;
            }
            interfaceC1803290x1jLIZJ.LJIILJJIL(boolValueOf);
            LIZIZ(interfaceC1284030jWD, i3, c1804840x4ELIZIZ, str5, i2);
            if (c1803560x2ALIZJ != null) {
                C1803540x28.LIZIZ(c1803560x2ALIZJ);
            }
            if (zLJI) {
                MethodIDManager.LJ();
            }
            return c1804840x4ELIZIZ;
        }
        String strLIZ2 = null;
        ((IWalletService) C1161920gLG.LIZJ(IWalletService.class)).setIapResultExtra(null);
        Object obj = new Object(strLIZJ, i, j, j2, z, recommendStrategyParam, i2) { // from class: X.0x42
        };
        if (C1792950wl3.LIZ()) {
            j3 = 8;
        } else {
            j3 = 0;
        }
        String billingCountryCode2 = ((InterfaceC1791930wjP) C1161920gLG.LIZJ(IapService.class)).getBillingCountryCode();
        IHostAppContext iHostAppContext2 = (IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class);
        if (iHostAppContext2 == null || (context = iHostAppContext2.context()) == null || (packageName = context.getPackageName()) == null) {
            packageName = "";
        }
        C480460Ism.LIZ().getClass();
        IRechargeApi iRechargeApi = (IRechargeApi) C480460Ism.LIZLLL(IRechargeApi.class);
        if (recommendStrategyParam != null) {
            strLIZ2 = recommendStrategyParam.LIZ();
        }
        IapListResult iapListResult = (IapListResult) iRechargeApi.fetchDiamondPackage(strLIZJ, j, j2, j3, i, z, strLIZ2, i2, billingCountryCode2, packageName).LJJIJIIJIL(new AfS196S0100000_27(obj, 48)).LJJIJIIJI(new AfS196S0100000_27(obj, 49)).LIZLLL();
        if (interfaceC1804390x3V != null) {
            interfaceC1804390x3V.LIZ();
        }
        IapListResult.ListResultExtra listResultExtra2 = iapListResult.extra;
        if (listResultExtra2 != null && (iapCustomData = listResultExtra2.iapCustomData) != null) {
            str = iapCustomData.rechargeV3PanelUrl;
        } else {
            str = null;
        }
        LJIJJ(str);
        ((IWalletService) C1161920gLG.LIZJ(IWalletService.class)).setIapResultExtra(iapListResult.extra);
        if (c1803560x2ALIZJ != null) {
            c1803560x2ALIZJ.LJI = C158B.LIZ();
            c1803560x2ALIZJ.LIZIZ = true;
        }
        HashSet hashSet2 = new HashSet();
        List<Diamond> list8 = iapListResult.data;
        if (list8 != null) {
            i4 = 10;
            ArrayList arrayList4 = new ArrayList(C15438062q.LJIJJ(list8, 10));
            Iterator<Diamond> it4 = list8.iterator();
            while (it4.hasNext()) {
                arrayList4.add(it4.next().iapId);
            }
            hashSet2.addAll(arrayList4);
        } else {
            i4 = 10;
        }
        IapListResult.ListResultExtra listResultExtra3 = iapListResult.extra;
        if (listResultExtra3 != null && (list2 = listResultExtra3.fullList) != null) {
            ArrayList arrayList5 = new ArrayList(C15438062q.LJIJJ(list2, i4));
            Iterator<Diamond> it5 = list2.iterator();
            while (it5.hasNext()) {
                arrayList5.add(it5.next().iapId);
            }
            hashSet2.addAll(arrayList5);
        }
        List listLLIIII2 = C13LP.LLIIII(hashSet2);
        if (interfaceC1804390x3V != null) {
            interfaceC1804390x3V.LJIIIZ();
        }
        List<Diamond> listLIZ2 = new C1792960wl4(listLLIIII2, false).LIZ();
        HashSet hashSet3 = new HashSet();
        List<Diamond> list9 = iapListResult.data;
        if (list9 != null) {
            Iterator<Diamond> it6 = list9.iterator();
            while (it6.hasNext()) {
                List<String> list10 = it6.next().backupIapIdList;
                if (list10 != null) {
                    hashSet3.addAll(list10);
                }
            }
        }
        Boolean boolValueOf2 = null;
        C01KE.LIZ(this.LIZ, new C05D8(C13LP.LLIIII(hashSet3), null));
        if (interfaceC1804390x3V != null) {
            interfaceC1804390x3V.LJI();
        }
        if (c1803560x2ALIZJ != null) {
            c1803560x2ALIZJ.LJII = C158B.LIZ();
            c1803560x2ALIZJ.LIZJ = !listLIZ2.isEmpty();
        }
        C1804350x3R c1804350x3R = new C1804350x3R(iapListResult.data, listLIZ2, iapListResult.extra);
        ArrayList arrayList6 = new ArrayList();
        ArrayList arrayList7 = new ArrayList();
        if (listLIZ2 != null) {
            int iLIZIZ = C2097908Jt.LIZIZ(C15438062q.LJIJJ(listLIZ2, i4));
            if (iLIZIZ < 16) {
                iLIZIZ = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(iLIZIZ);
            for (Diamond diamond2 : listLIZ2) {
                linkedHashMap.put(diamond2.iapId, diamond2);
            }
            C1804350x3R.LIZ(c1804350x3R.LIZ, linkedHashMap);
            IapListResult.ListResultExtra listResultExtra4 = c1804350x3R.LIZIZ;
            if (listResultExtra4 != null && listResultExtra4.fullList == null && listResultExtra4 != null) {
                listResultExtra4.fullList = new ArrayList();
            }
            IapListResult.ListResultExtra listResultExtra5 = c1804350x3R.LIZIZ;
            if (listResultExtra5 == null || (list = listResultExtra5.fullList) == null) {
                list = C13BV.INSTANCE;
            }
            C1804350x3R.LIZ(list, linkedHashMap);
            for (Diamond diamond3 : c1804350x3R.LIZ) {
                if (C2093608Ic.LJ(diamond3.LIZIZ)) {
                    arrayList7.add(diamond3);
                } else {
                    arrayList6.add(diamond3);
                }
            }
        }
        IapListResult.ListResultExtra listResultExtra6 = c1804350x3R.LIZIZ;
        if (listResultExtra6 != null) {
            List<Diamond> list11 = listResultExtra6.fullList;
            if (list11 != null) {
                arrayList = new ArrayList();
                for (Diamond diamond4 : list11) {
                    if (!C2093608Ic.LJ(diamond4.LIZIZ)) {
                        arrayList.add(diamond4);
                    }
                }
            } else {
                arrayList = C13BV.INSTANCE;
            }
            listResultExtra6.fullList = new ArrayList((Collection) arrayList);
        }
        IapListResult.ListResultExtra listResultExtra7 = c1804350x3R.LIZIZ;
        C1804840x4E c1804840x4E = new C1804840x4E(arrayList6, arrayList7, listResultExtra7);
        Diamond diamond5 = (Diamond) C13LP.LJJJLL(arrayList6);
        if (diamond5 != null && (str2 = diamond5.LIZIZ) != null) {
            str5 = str2;
        }
        C1797270ws1.LIZIZ().LJFF(str5);
        InterfaceC1803290x1j interfaceC1803290x1jLIZJ2 = C1797270ws1.LIZJ();
        if (listResultExtra7 != null) {
            boolValueOf2 = Boolean.valueOf(listResultExtra7.coinSolutionAbEnabled);
        }
        interfaceC1803290x1jLIZJ2.LJIILJJIL(boolValueOf2);
        LIZIZ(interfaceC1284030jWD, i3, c1804840x4E, str5, i2);
        if (c1803560x2ALIZJ != null) {
            C1803540x28.LIZIZ(c1803560x2ALIZJ);
        }
        if (zLJI) {
            MethodIDManager.LJ();
        }
        return c1804840x4E;
    }
}
