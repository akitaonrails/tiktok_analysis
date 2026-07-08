package com.bytedance.android.live.walletnew;

import X.AnonymousClass1688;
import X.C01GW;
import X.C0IF2;
import X.C0IJT;
import X.C0IR5;
import X.C0IXL;
import X.C0J1N;
import X.C0UO0;
import X.C1121450fHz;
import X.C1123320fL0;
import X.C1126800fQc;
import X.C1148310fzJ;
import X.C1149680g1W;
import X.C1150020g24;
import X.C1161920gLG;
import X.C11NJ;
import X.C11RD;
import X.C13BV;
import X.C13LE;
import X.C15438062q;
import X.C1548820qPI;
import X.C158B;
import X.C1697810uHb;
import X.C1776960wLG;
import X.C1796440wqg;
import X.C1797010wrb;
import X.C1797120wrm;
import X.C1797190wrt;
import X.C1797200wru;
import X.C1797270ws1;
import X.C1797350ws9;
import X.C1803450x1z;
import X.C1803700x2O;
import X.C1803800x2Y;
import X.C1803830x2b;
import X.C1803840x2c;
import X.C1804050x2x;
import X.C1804170x39;
import X.C1804180x3A;
import X.C1804840x4E;
import X.C1804850x4F;
import X.C1804990x4T;
import X.C1805120x4g;
import X.C1805240x4s;
import X.C1805400x58;
import X.C1805580x5Q;
import X.C1805620x5U;
import X.C1805670x5Z;
import X.C1805790x5l;
import X.C1805920x5y;
import X.C1806040x6A;
import X.C1806150x6L;
import X.C1806550x6z;
import X.C1806600x74;
import X.C1806690x7D;
import X.C1806860x7U;
import X.C1807200x82;
import X.C19719512Dh;
import X.C19748512Ol;
import X.C20441214yg;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C23250099c;
import X.C452501pT;
import X.C474500IjA;
import X.C495520Jby;
import X.C500260Jjc;
import X.C751340Tdc;
import X.C766270U4b;
import X.C784440Upu;
import X.EnumC1121470fI1;
import X.EnumC1704090uRj;
import X.EnumC1803160x1W;
import X.EnumC1805420x5A;
import X.EnumC1805450x5D;
import X.EnumC1805520x5K;
import X.EnumC1805630x5V;
import X.EnumC1805800x5m;
import X.InterfaceC1133710fbl;
import X.InterfaceC1150050g27;
import X.InterfaceC1797050wrf;
import X.InterfaceC1803460x20;
import X.InterfaceC1805160x4k;
import X.InterfaceC1805480x5G;
import X.InterfaceC1806200x6Q;
import X.InterfaceC1807440x8Q;
import X.InterfaceC2217461Bqa;
import X.InterfaceC420801kM;
import Y.AfS161S0200000_27;
import Y.AfS196S0100000_27;
import Y.AfS43S1200000_17;
import android.content.Context;
import android.os.Bundle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStoreOwner;
import com.bytedance.android.live.iap.service.IapService;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.live.liveinteract.match.service.ILiveMatchService;
import com.bytedance.android.live.network.response.BaseResponse;
import com.bytedance.android.live.wallet.IWalletCenter;
import com.bytedance.android.live.wallet.IWalletService;
import com.bytedance.android.live.wallet.model.ExchangeDisplayInfo;
import com.bytedance.android.live.wallet.model.RevenueExchange;
import com.bytedance.android.live.wallet.model.WalletStruct;
import com.bytedance.android.live.wallet.model.recharge.RecommendStrategyParam;
import com.bytedance.android.live.wallet.viewmodel.recharge.component.banner.VaultRechargeUnlockGiftViewModel;
import com.bytedance.android.live.wallet.viewmodel.recharge.component.incentive.KycIncentiveFooterViewModel;
import com.bytedance.android.live.walletnew.RechargeViewModel;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.dataChannel.UserIsAnchorChannel;
import com.bytedance.android.livesdk.livesetting.wallet.LiveRechargeHitCacheOptimizationSetting;
import com.bytedance.android.livesdk.livesetting.wallet.LiveRechargeInsufficientPackageRecommendationTimeout;
import com.bytedance.android.livesdk.livesetting.wallet.LiveRechargeKycAnnualCapSetting;
import com.bytedance.android.livesdk.livesetting.wallet.LiveRechargePanelLoadDataSetting;
import com.bytedance.android.livesdk.livesetting.wallet.LiveRechargePanelRefactorSetting;
import com.bytedance.android.livesdk.wallet.Diamond;
import com.bytedance.android.livesdk.wallet.NoticesResult;
import com.bytedance.android.livesdk.wallet.datachannel.FCRechargePackageSelectedEvent;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.user.IHostPad;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.router.SmartRouter;
import com.bytedance.tracking.TrackingEventV3Data;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS216S0000000_27;
import kotlin.jvm.internal.AwS428S0200000_27;
import kotlin.jvm.internal.AwS571S0100000_27;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.u;
import qo2.w;
import tikcast.api.wallet.tiktok.QueryOrderResult;
import webcast.api.profit.IapListResult;
import webcast.api.profit.ListV3Result;

/* JADX INFO: loaded from: classes28.dex */
public final class RechargeViewModel extends BaseRechargeViewModel implements InterfaceC1805480x5G {
    public static final C1805620x5U LLLLL;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLLLLIL;
    public static final String LLLLLILLIL;
    public final Bundle LLJJJIL;
    public final C1803830x2b LLJJJJ;
    public DataChannel LLJJJJJIL;
    public final InterfaceC1805160x4k LLJJJJLIIL;
    public final InterfaceC1805480x5G LLJJL;
    public final C01GW LLJJLIIIJLLLLLLLZ;
    public final C01GW LLJL;
    public final C01GW LLJLIL;
    public final C01GW LLJLILLLLZIIL;
    public final C01GW LLJLL;
    public final C01GW LLJLLIL;
    public final C01GW LLJLLL;
    public int LLJZ;
    public final C01GW LLJZIJLIL;
    public final C01GW LLL;
    public final C01GW LLLF;
    public final C01GW LLLFF;
    public int LLLFFI;
    public final C01GW LLLFZ;
    public final C01GW LLLI;
    public final C01GW LLLII;
    public final C01GW LLLIIII;
    public boolean LLLIIIIL;
    public boolean LLLIIIL;
    public long LLLIIL;
    public final C01GW LLLIILIL;
    public final VaultRechargeUnlockGiftViewModel LLLIL;
    public final C01GW LLLILZ;
    public final C01GW LLLILZJ;
    public final C01GW LLLILZLLLI;
    public C1803450x1z LLLIZZ;
    public InterfaceC420801kM LLLJ;
    public Map<String, String> LLLJIL;
    public boolean LLLJL;
    public final MutableLiveData<Boolean> LLLL;
    public InterfaceC1797050wrf LLLLII;
    public final MutableLiveData<Long> LLLLIIIILLL;
    public Diamond LLLLIIL;
    public final MutableLiveData<Diamond> LLLLIILL;
    public final MutableLiveData<Boolean> LLLLIILLL;
    public final MutableLiveData<Integer> LLLLIL;
    public boolean LLLLILI;
    public final MutableLiveData<C1806690x7D> LLLLJ;
    public volatile C1805120x4g LLLLJI;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(RechargeViewModel.class, "cashierPreloadUseCase", "getCashierPreloadUseCase()Lcom/bytedance/android/live/walletclean/domain/usecase/preload/IFECashierPreloadUseCase;", 0);
        C13LE.LIZ.getClass();
        LLLLLIL = new InterfaceC2217461Bqa[]{c2217381BqS};
        LLLLL = new C1805620x5U();
        LLLLLILLIL = "RechargeViewModel";
    }

    @Override // X.InterfaceC1805480x5G
    public final void Em1(String str, boolean z, Diamond diamond, boolean z2, Function1<? super C1804840x4E, ? extends LinkedList<C1806600x74>> function1) {
        this.LLJJL.Em1(str, z, diamond, z2, function1);
    }

    @Override // X.InterfaceC1805480x5G
    public final String Ht0() {
        return this.LLJJL.Ht0();
    }

    @Override // X.InterfaceC1805480x5G
    public final void Nj2(String str, String str2, int i, C1804840x4E c1804840x4E) {
        this.LLJJL.Nj2(str, str2, i, c1804840x4E);
    }

    @Override // X.InterfaceC1805480x5G
    public final LiveData<C1804170x39> ZQ0() {
        return this.LLJJL.ZQ0();
    }

    @Override // X.InterfaceC1805480x5G
    public final boolean dx1() {
        return this.LLJJL.dx1();
    }

    @Override // X.InterfaceC1805480x5G
    public final String g60() {
        return this.LLJJL.g60();
    }

    @Override // X.InterfaceC1805480x5G
    public final ListV3Result.Extra mq2() {
        return this.LLJJL.mq2();
    }

    @Override // X.InterfaceC1805480x5G
    public final TrackingEventV3Data og1(boolean z) {
        return this.LLJJL.og1(z);
    }

    @Override // X.InterfaceC1805480x5G
    public final Diamond ru0() {
        return this.LLJJL.ru0();
    }

    @Override // com.bytedance.android.live.walletnew.BaseRechargeViewModel
    public final boolean DQ2() {
        C1803830x2b c1803830x2b = this.LLJJJJ;
        return c1803830x2b.LJIIJ && c1803830x2b.LJIIJJI;
    }

    @Override // com.bytedance.android.live.walletnew.BaseRechargeViewModel
    public final long MQ2() {
        return this.LLJJJJ.LJFF;
    }

    public final List<Diamond> VQ2() {
        List<Diamond> listLJIIJ;
        C1804840x4E c1804840x4E = this.LLIZ;
        if (c1804840x4E == null || (listLJIIJ = c1804840x4E.LJIIJ(g60())) == null) {
            return C13BV.INSTANCE;
        }
        ArrayList arrayList = new ArrayList();
        for (Diamond diamond : listLJIIJ) {
            if (!diamond.LIZ()) {
                arrayList.add(diamond);
            }
        }
        return arrayList;
    }

    public final int WQ2() {
        KycIncentiveFooterViewModel kycIncentiveFooterViewModelBR2;
        IapListResult.ListResultExtra listResultExtraLJII;
        IapListResult.ListResultExtra listResultExtraLJII2;
        InterfaceC1806200x6Q interfaceC1806200x6Q = (InterfaceC1806200x6Q) this.LLLILZ.getValue();
        C1804840x4E c1804840x4E = this.LLIZ;
        IapListResult.ActivityInfo activityInfo = null;
        if (C500260Jjc.LJJIFFI(Boolean.valueOf(C1805400x58.LIZJ(interfaceC1806200x6Q, (c1804840x4E == null || (listResultExtraLJII2 = c1804840x4E.LJII()) == null) ? null : listResultExtraLJII2.activityInfo))) || ((kycIncentiveFooterViewModelBR2 = bR2()) != null && kycIncentiveFooterViewModelBR2.wQ2())) {
            return 0;
        }
        C1804840x4E c1804840x4E2 = this.LLIZ;
        if (c1804840x4E2 != null && (listResultExtraLJII = c1804840x4E2.LJII()) != null) {
            activityInfo = listResultExtraLJII.activityInfo;
        }
        if (C1805670x5Z.LIZ(activityInfo)) {
            return 3;
        }
        return fR2();
    }

    public final String XQ2() {
        return (String) this.LLJLL.getValue();
    }

    public final int YQ2() {
        return ((Number) this.LLJLILLLLZIIL.getValue()).intValue();
    }

    public final C1806860x7U aR2() {
        return (C1806860x7U) this.LLLIILIL.getValue();
    }

    public final KycIncentiveFooterViewModel bR2() {
        return (KycIncentiveFooterViewModel) this.LLLILZLLLI.getValue();
    }

    public final long cR2() {
        return ((Number) this.LLLFZ.getValue()).longValue();
    }

    public final String eR2() {
        return (String) this.LLJLIL.getValue();
    }

    public final int fR2() {
        return ((Number) this.LLLFF.getValue()).intValue();
    }

    public final boolean jR2() {
        return ((Boolean) this.LLLII.getValue()).booleanValue();
    }

    public final boolean lR2() {
        return ((Boolean) this.LLJJLIIIJLLLLLLLZ.getValue()).booleanValue();
    }

    public final void nR2() {
        Object value = this.LLLF.getValue();
        String strER2 = eR2();
        Object value2 = this.LLJZIJLIL.getValue();
        String strXQ2 = XQ2();
        String str = (String) this.LLJLLIL.getValue();
        boolean z = this.LLLFFI == 2;
        boolean zJR2 = jR2();
        int iYQ2 = YQ2();
        String strG60 = g60();
        C1803800x2Y c1803800x2Y = C1803800x2Y.LIZ;
        HashMap map = new HashMap();
        Integer numValueOf = Integer.valueOf(iYQ2);
        c1803800x2Y.getClass();
        C1803800x2Y.LJFF(numValueOf, map);
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_exchange_entrance_show");
        c474500IjALIZ.LJIL();
        c474500IjALIZ.LJJII(value, "exchange_type");
        c474500IjALIZ.LJJII(strER2, "request_page");
        c474500IjALIZ.LJJII(value2, "exchange_scenario");
        c474500IjALIZ.LJJII(strXQ2, "charge_reason");
        c474500IjALIZ.LJJII(str, "gift_enter_from");
        c474500IjALIZ.LJJII(C1149680g1W.LIZLLL(), "live_scene");
        c474500IjALIZ.LJJII(C1149680g1W.LJ(), "is_first_recharge");
        c474500IjALIZ.LJJII(z ? "1" : CardStruct.IStatusCode.DEFAULT, "could_exchange");
        c474500IjALIZ.LJJII(zJR2 ? "1" : CardStruct.IStatusCode.DEFAULT, "is_from_switch");
        c474500IjALIZ.LJJII(strG60, "panel_channel");
        c474500IjALIZ.LJJII(Integer.valueOf(((IWalletService) C1161920gLG.LIZJ(IWalletService.class)).getRechargeService().LIZJ()), "recharge_v3_version");
        c474500IjALIZ.LJJIIZI(map);
        C1149680g1W.LIZ(c474500IjALIZ);
        C1149680g1W.LIZJ(c474500IjALIZ, str);
        c474500IjALIZ.LIZ();
    }

    public final IapListResult.ListResultExtra vx1() {
        IapListResult.ListResultExtra listResultExtraLJII;
        C1804840x4E c1804840x4E = this.LLIZ;
        return (c1804840x4E == null || (listResultExtraLJII = c1804840x4E.LJII()) == null) ? ((IWalletService) C1161920gLG.LIZJ(IWalletService.class)).walletCenter().vx1() : listResultExtraLJII;
    }

    public final boolean wR2() {
        KycIncentiveFooterViewModel kycIncentiveFooterViewModelBR2;
        C1126800fQc.LIZ.GN();
        C1123320fL0 c1123320fL0LIZIZ = C1121450fHz.LIZIZ(EnumC1121470fI1.RECHARGE_BANNER_TP.getType());
        if ((c1123320fL0LIZIZ != null ? c1123320fL0LIZIZ.LIZLLL : null) != null) {
            return true;
        }
        if (fR2() == 0) {
            return false;
        }
        if (WQ2() != 3) {
            C01GW<InterfaceC1133710fbl> c01gw = C1805240x4s.LJIIJ;
            if (!C1804990x4T.LIZIZ()) {
                InterfaceC1806200x6Q interfaceC1806200x6Q = (InterfaceC1806200x6Q) this.LLLILZ.getValue();
                if (!C500260Jjc.LJJJI(interfaceC1806200x6Q != null ? Boolean.valueOf(interfaceC1806200x6Q.LIZJ(EnumC1805630x5V.LIVE_RECHARGE_PANEL_FOOTER)) : null) && ((kycIncentiveFooterViewModelBR2 = bR2()) == null || !kycIncentiveFooterViewModelBR2.wQ2())) {
                    return false;
                }
            }
        }
        return true;
    }

    public final int ZQ2() {
        IapListResult.QuickChargeConfig quickChargeConfig;
        IapListResult.ListResultExtra listResultExtraVx1 = vx1();
        if (listResultExtraVx1 == null || listResultExtraVx1.quickChargeConfig == null) {
            return -1;
        }
        IapListResult.ListResultExtra listResultExtraVx12 = vx1();
        return (listResultExtraVx12 == null || (quickChargeConfig = listResultExtraVx12.quickChargeConfig) == null || !quickChargeConfig.hasValidBizContract) ? 0 : 1;
    }

    @Override // com.bytedance.android.live.walletnew.BaseRechargeViewModel
    public final void onDestroy() {
        super.onDestroy();
        C1805920x5y c1805920x5y = (C1805920x5y) this.LLLILZJ.getValue();
        if (c1805920x5y.LIZLLL) {
            C1548820qPI.LJIIIIZZ("KYC_ANNUAL_LIMIT_EVENT", c1805920x5y.LIZIZ);
            C1548820qPI.LJIIIIZZ("submitKYC", c1805920x5y.LIZJ);
        }
        InterfaceC420801kM interfaceC420801kM = this.LLLJ;
        if (interfaceC420801kM != null) {
            interfaceC420801kM.dispose();
        }
        this.LLLJ = null;
        this.LLJJJJJIL = null;
    }

    public final void uR2() {
        List<Diamond> listVQ2 = VQ2();
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(listVQ2, 10));
        Iterator<Diamond> it2 = listVQ2.iterator();
        while (it2.hasNext()) {
            arrayList.add(Long.valueOf(C1804850x4F.LJFF(it2.next())));
        }
        MutableLiveData<Boolean> mutableLiveData = this.LLLLIILLL;
        boolean z = false;
        if (!arrayList.isEmpty()) {
            Integer value = this.LLLLIL.getValue();
            if (value == null) {
                z = true;
                break;
            }
            int iIntValue = value.intValue();
            if (!arrayList.isEmpty()) {
                Iterator it3 = arrayList.iterator();
                while (it3.hasNext()) {
                    if (((Number) it3.next()).longValue() <= iIntValue) {
                        z = true;
                        break;
                    }
                }
            }
        }
        mutableLiveData.postValue(Boolean.valueOf(z));
    }

    @Override // com.bytedance.android.live.walletnew.BaseRechargeViewModel
    public final InterfaceC1797050wrf yQ2() {
        return this.LLLLII;
    }

    public static boolean kR2(Diamond diamond) {
        String str;
        String str2 = diamond.LIZIZ;
        if (str2 == null || str2.length() == 0 || (str = diamond.customPriceCurrency) == null || str.length() == 0 || !Intrinsics.LJFF(diamond.LIZIZ, diamond.customPriceCurrency)) {
            return false;
        }
        return true;
    }

    @Override // com.bytedance.android.live.walletnew.BaseRechargeViewModel
    public final void JQ2(C1797010wrb c1797010wrb) {
        Integer numValueOf;
        String str;
        C1797350ws9 c1797350ws9LIZJ;
        BaseResponse<QueryOrderResult.ChargeOrderData, QueryOrderResult.ChargeOrderExtra> baseResponse;
        QueryOrderResult.ChargeOrderExtra chargeOrderExtra;
        QueryOrderResult.VaultGiftInfo vaultGiftInfo;
        VaultRechargeUnlockGiftViewModel vaultRechargeUnlockGiftViewModel = this.LLLIL;
        if (vaultRechargeUnlockGiftViewModel != null && (str = c1797010wrb.LIZLLL.LIZIZ) != null && (c1797350ws9LIZJ = C1797270ws1.LJ().LIZJ(str)) != null && (baseResponse = c1797350ws9LIZJ.LIZJ) != null && (chargeOrderExtra = (QueryOrderResult.ChargeOrderExtra) baseResponse.extra) != null && (vaultGiftInfo = chargeOrderExtra.vaultGiftInfo) != null) {
            vaultRechargeUnlockGiftViewModel.LLILZLL.put(str, vaultGiftInfo);
        }
        super.JQ2(c1797010wrb);
        DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LLILZ;
        Diamond diamond = this.LLJILJIL;
        if (diamond != null) {
            numValueOf = Integer.valueOf(diamond.id);
        } else {
            numValueOf = null;
        }
        dataChannelGlobal.JQ2(AnonymousClass1688.class, numValueOf);
    }

    @Override // com.bytedance.android.live.walletnew.BaseRechargeViewModel
    public final void LQ2(List<NoticesResult.Notice> list) {
        KycIncentiveFooterViewModel kycIncentiveFooterViewModelBR2;
        KycIncentiveFooterViewModel kycIncentiveFooterViewModelBR22 = bR2();
        if (kycIncentiveFooterViewModelBR22 != null) {
            EnumC1805450x5D enumC1805450x5D = null;
            kycIncentiveFooterViewModelBR22.LLILLJJLI = null;
            kycIncentiveFooterViewModelBR22.LLILLL = false;
            if (!list.isEmpty()) {
                for (NoticesResult.Notice notice : list) {
                    C1806550x6z c1806550x6z = EnumC1805450x5D.Companion;
                    String str = notice.id;
                    c1806550x6z.getClass();
                    try {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("NOTICE_ID_");
                        sbLIZ.append(str.toUpperCase(Locale.ROOT));
                        EnumC1805450x5D enumC1805450x5DValueOf = EnumC1805450x5D.valueOf(C2188811AlT.LIZIZ(sbLIZ));
                        if (enumC1805450x5DValueOf != null) {
                            if (kycIncentiveFooterViewModelBR22.LLILLJJLI == null && enumC1805450x5DValueOf.getLevel() == EnumC1704090uRj.L3) {
                                kycIncentiveFooterViewModelBR22.LLILLJJLI = notice.schemaUrl;
                            } else if (enumC1805450x5D == null && enumC1805450x5DValueOf.getLevel() != EnumC1704090uRj.L3) {
                                enumC1805450x5DValueOf.setTitle$livewallet_impl_release(notice.title);
                                enumC1805450x5DValueOf.setSchemaUrl$livewallet_impl_release(notice.schemaUrl);
                                enumC1805450x5D = enumC1805450x5DValueOf;
                            }
                        }
                    } catch (IllegalArgumentException e) {
                        TryCatchGuardChecker.doCheck(e);
                    }
                }
            }
            kycIncentiveFooterViewModelBR22.vQ2().setValue(enumC1805450x5D);
        }
        if (LiveRechargePanelLoadDataSetting.INSTANCE.getValue()) {
            KycIncentiveFooterViewModel kycIncentiveFooterViewModelBR23 = bR2();
            if ((kycIncentiveFooterViewModelBR23 == null || !kycIncentiveFooterViewModelBR23.wQ2()) && ((kycIncentiveFooterViewModelBR2 = bR2()) == null || !kycIncentiveFooterViewModelBR2.xQ2())) {
                return;
            }
        } else if (list.isEmpty()) {
            return;
        }
        mR2(false);
        C1805920x5y c1805920x5y = (C1805920x5y) this.LLLILZJ.getValue();
        if (!c1805920x5y.LIZLLL) {
            C1548820qPI.LIZLLL("KYC_ANNUAL_LIMIT_EVENT", c1805920x5y.LIZIZ);
            C1548820qPI.LIZLLL("submitKYC", c1805920x5y.LIZJ);
            c1805920x5y.LIZLLL = true;
        }
    }

    @Override // com.bytedance.android.live.walletnew.BaseRechargeViewModel
    public final void OQ2(C1804840x4E c1804840x4E) {
        this.LLIZ = c1804840x4E;
        this.LLJJL.Nj2(eR2(), XQ2(), YQ2(), c1804840x4E);
    }

    public final <T extends InterfaceC1150050g27> T gR2(Class<T> cls) {
        T tNewInstance = (T) ((HashMap) this.LLLIIII.getValue()).get(cls);
        if (tNewInstance == null) {
            synchronized (this) {
                try {
                    tNewInstance = cls.newInstance();
                    ((HashMap) this.LLLIIII.getValue()).put(cls, tNewInstance);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return tNewInstance;
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x0099, code lost:
    
        if (r4 == null) goto L38;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C1806600x74 hR2(com.bytedance.android.livesdk.wallet.Diamond r10) {
        /*
            Method dump skipped, instruction units count: 347
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.walletnew.RechargeViewModel.hR2(com.bytedance.android.livesdk.wallet.Diamond):X.0x74");
    }

    public final boolean iR2(long j) {
        if (this.LLLLIL.getValue() == null || j <= r0.intValue()) {
            return true;
        }
        return false;
    }

    public final void mR2(boolean z) {
        int i;
        if (fR2() == -1) {
            i = 0;
        } else {
            i = 1;
        }
        ((C1150020g24) gR2(C1150020g24.class)).LIZIZ(18, i, ((Number) this.LLL.getValue()).intValue());
        if (LiveRechargePanelRefactorSetting.INSTANCE.getValue()) {
            return;
        }
        boolean zLJ = C1804050x2x.LIZ().LJ();
        if (!z && !zLJ) {
            HQ2(null, EnumC1803160x1W.USE, BaseRechargeViewModel.LLJJJ, 0);
            return;
        }
        long jNo0 = ((IWalletService) C1161920gLG.LIZJ(IWalletService.class)).walletCenter().No0();
        RecommendStrategyParam recommendStrategyParam = new RecommendStrategyParam();
        C1803830x2b c1803830x2b = this.LLJJJJ;
        recommendStrategyParam.scene = c1803830x2b.LJIIIIZZ;
        recommendStrategyParam.chargeReason = c1803830x2b.LIZLLL;
        recommendStrategyParam.giftIds = C1697810uHb.LJIILJJIL(Long.valueOf(c1803830x2b.LJFF));
        long j = this.LLJJJJ.LJIIIZ;
        recommendStrategyParam.giftTotalCoins = j;
        recommendStrategyParam.coinsGap = j - jNo0;
        if (!z) {
            if (LiveRechargeHitCacheOptimizationSetting.INSTANCE.getValue().enable && recommendStrategyParam.coinsGap <= r1.getValue().coinsThreshold) {
                HQ2(null, EnumC1803160x1W.USE, BaseRechargeViewModel.LLJJJ, 0);
                return;
            }
        }
        HQ2(recommendStrategyParam, EnumC1803160x1W.NON_USE_AND_NON_CACHE, LiveRechargeInsufficientPackageRecommendationTimeout.INSTANCE.getValue(), 0);
    }

    public final void sR2(Context context) {
        if (fR2() == 0) {
            return;
        }
        PQ2(0, 500L);
        C1150020g24 c1150020g24 = (C1150020g24) gR2(C1150020g24.class);
        ((C11NJ) this.LL.LIZ.getValue()).LIZ(c1150020g24.LIZ().LJIILIIL(new C0UO0()).LJJIJIIJIL(new AfS43S1200000_17(c1150020g24, g60(), context, 1)).LJJLL(new AfS161S0200000_27(this, context, 2), new AfS196S0100000_27(this, 5)));
    }

    public final void tR2(boolean z) {
        C23250099c.LIZLLL(ViewModelKt.getViewModelScope(this), null, null, new C1803700x2O(this, z, null), 3);
    }

    public final void vR2(Diamond diamond) {
        Integer numValueOf;
        String str;
        Map<String, String> mapLIZ;
        boolean z;
        C1803800x2Y c1803800x2Y = C1803800x2Y.LIZ;
        C1803830x2b c1803830x2b = this.LLJJJJ;
        int i = diamond.count;
        String str2 = (String) this.LLJLLL.getValue();
        String strER2 = eR2();
        String strXQ2 = XQ2();
        int iYQ2 = YQ2();
        boolean z2 = this.LLLIIIIL;
        DataChannel dataChannel = this.LLJJJJJIL;
        Map<String, String> map = this.LLJJJJ.LIZJ;
        Diamond diamond2 = this.LLLLIIL;
        if (diamond2 != null) {
            numValueOf = Integer.valueOf(diamond2.count);
        } else {
            numValueOf = null;
        }
        Diamond diamond3 = this.LLLLIIL;
        if (diamond3 != null) {
            str = diamond3.LIZIZ;
        } else {
            str = null;
        }
        boolean zFQ2 = FQ2();
        Map<String, String> mapLIZIZ = aR2().LIZIZ(diamond.LIZIZ(), true, false);
        TrackingEventV3Data trackingEventV3DataOg1 = og1(false);
        if (trackingEventV3DataOg1 != null) {
            mapLIZ = trackingEventV3DataOg1.LIZ();
        } else {
            mapLIZ = null;
        }
        if (diamond.LIZ == 7) {
            z = true;
        } else {
            z = false;
        }
        int iZQ2 = ZQ2();
        c1803800x2Y.getClass();
        C1803800x2Y.LJJIL(c1803830x2b, i, str2, strER2, strXQ2, iYQ2, z2, dataChannel, map, numValueOf, str, zFQ2, mapLIZIZ, mapLIZ, z, iZQ2);
    }

    public final void xR2(LifecycleOwner lifecycleOwner) {
        if (C1161920gLG.LIZJ(IWalletService.class) != null) {
            ((C0J1N) ((IWalletService) C1161920gLG.LIZJ(IWalletService.class)).walletCenter().l22().LIZJ(C11RD.LJ(lifecycleOwner))).LIZJ(new AfS196S0100000_27(this, 17));
            IWalletCenter iWalletCenterWalletCenter = ((IWalletService) C1161920gLG.LIZJ(IWalletService.class)).walletCenter();
            C1805790x5l c1805790x5l = EnumC1805800x5m.Companion;
            String strER2 = eR2();
            c1805790x5l.getClass();
            iWalletCenterWalletCenter.JJ0(C1805790x5l.LIZ(strER2), EnumC1805420x5A.RECHARGE_PANEL);
            ((C0J1N) ((IWalletService) C1161920gLG.LIZJ(IWalletService.class)).walletCenter().XF().LIZJ(C11RD.LJ(lifecycleOwner))).LIZJ(new AfS196S0100000_27(this, 18));
            return;
        }
        C1803800x2Y c1803800x2Y = C1803800x2Y.LIZ;
        DataChannel dataChannel = this.LLJJJJJIL;
        c1803800x2Y.getClass();
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_recharge_service_error");
        c474500IjALIZ.LJJII(C1803800x2Y.LJIIL(null), "strategy_task_type");
        c474500IjALIZ.LJIJJLI(dataChannel);
        c474500IjALIZ.LIZ();
    }

    public final void yR2(Diamond diamond) {
        List<C1806600x74> list;
        C1806040x6A c1806040x6A;
        C1804170x39 value;
        LiveData<C1804170x39> liveDataZQ0 = ZQ0();
        InterfaceC1807440x8Q interfaceC1807440x8Q = null;
        if (liveDataZQ0 != null && (value = liveDataZQ0.getValue()) != null) {
            list = value.LIZ;
        } else {
            list = null;
        }
        if (C19719512Dh.LJI(list) && list != null) {
            Iterator<C1806600x74> it2 = list.iterator();
            int i = 0;
            int i2 = 0;
            while (true) {
                if (it2.hasNext()) {
                    Object obj = it2.next().LIZIZ;
                    if ((obj instanceof C1807200x82) || (obj instanceof C1806040x6A)) {
                        break;
                    } else {
                        i2++;
                    }
                } else {
                    i2 = -1;
                    break;
                }
            }
            C1806600x74 c1806600x74HR2 = hR2(diamond);
            if (i2 != -1) {
                ListProtector.remove(list, i2);
                Iterator<C1806600x74> it3 = list.iterator();
                i2 = 0;
                while (true) {
                    if (it3.hasNext()) {
                        Object obj2 = it3.next().LIZIZ;
                        if ((obj2 instanceof Diamond) && ((Diamond) obj2).LIZ == 0) {
                            break;
                        } else {
                            i2++;
                        }
                    } else {
                        i2 = -1;
                        break;
                    }
                }
            }
            if (c1806600x74HR2 != null) {
                if (i2 != -1) {
                    i = i2;
                }
                ListProtector.add(list, i, c1806600x74HR2);
                InterfaceC1803460x20 interfaceC1803460x20 = this.LLILLJJLI;
                if (interfaceC1803460x20 != null) {
                    Object obj3 = c1806600x74HR2.LIZIZ;
                    if ((obj3 instanceof C1806040x6A) && (c1806040x6A = (C1806040x6A) obj3) != null) {
                        interfaceC1807440x8Q = c1806040x6A.LIZIZ;
                    }
                    interfaceC1803460x20.A7(i2, c1806600x74HR2, interfaceC1807440x8Q);
                }
            }
        }
    }

    public final Diamond TQ2(Diamond diamond, List<? extends Diamond> list) {
        Object next;
        if (!LiveRechargeKycAnnualCapSetting.INSTANCE.getValue() || iR2(C1804850x4F.LJFF(diamond))) {
            return diamond;
        }
        Iterator it2 = ((ArrayList) list).iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                Diamond diamond2 = (Diamond) next;
                String str = diamond2.iapId;
                if (str != null && str.length() != 0 && diamond2.count > 0 && iR2(C1804850x4F.LJFF(diamond2))) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        return (Diamond) next;
    }

    public final void oR2(C1797200wru c1797200wru, Function0<Unit> function0) {
        int internalCode;
        C1805580x5Q c1805580x5Q = C1805580x5Q.LIZ;
        if (c1797200wru != null) {
            internalCode = c1797200wru.getInternalCode();
        } else {
            internalCode = 0;
        }
        if (c1805580x5Q.LIZLLL(internalCode, this.LLJZ)) {
            C1803800x2Y c1803800x2Y = C1803800x2Y.LIZ;
            C1803830x2b c1803830x2b = this.LLJJJJ;
            c1803800x2Y.getClass();
            C1803800x2Y.LJJIFFI(c1803830x2b, "go_to_google_store", true, c1797200wru);
            return;
        }
        if (LiveRechargePanelRefactorSetting.INSTANCE.getValue()) {
            function0.invoke();
        } else {
            mR2(false);
        }
    }

    public final void rR2(Diamond diamond, boolean z) {
        if (z) {
            this.LLLLIILL.postValue(diamond);
        } else {
            vR2(diamond);
            this.LLLLIILL.setValue(diamond);
        }
        DataChannel dataChannel = this.LLJJJJJIL;
        if (dataChannel != null) {
            dataChannel.LC0(FCRechargePackageSelectedEvent.class, Integer.valueOf(diamond.count));
        }
        yR2(diamond);
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0110  */
    @Override // com.bytedance.android.live.walletnew.BaseRechargeViewModel
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void KQ2(java.lang.Throwable r21, X.InterfaceC1804390x3V r22, webcast.api.profit.IapListResult.ListResultExtra r23) {
        /*
            Method dump skipped, instruction units count: 280
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.walletnew.RechargeViewModel.KQ2(java.lang.Throwable, X.0x3V, webcast.api.profit.IapListResult$ListResultExtra):void");
    }

    public final void SQ2(C495520Jby c495520Jby, String str, int i) {
        String str2;
        String str3;
        long jLongValue;
        c495520Jby.LIZJ("exchange_type", (String) this.LLLF.getValue());
        c495520Jby.LIZJ("request_page", eR2());
        c495520Jby.LIZJ("exchange_scenario", str);
        c495520Jby.LIZJ("charge_reason", XQ2());
        c495520Jby.LIZJ("gift_enter_from", (String) this.LLJLLIL.getValue());
        c495520Jby.LIZJ("live_scene", C1149680g1W.LIZLLL());
        c495520Jby.LIZ(0, "source");
        C1803800x2Y.LIZ.getClass();
        c495520Jby.LIZJ("is_first_recharge", C1803800x2Y.LJIILJJIL());
        c495520Jby.LIZ(i, "sub_source");
        C0IR5 c0ir5 = (C0IR5) DataChannelGlobal.LLILZ.gg0(C1148310fzJ.class);
        if (c0ir5 != null) {
            C0IXL c0ixl = c0ir5.LJFF;
            String str4 = null;
            if (c0ixl != null) {
                str2 = c0ixl.LIZIZ;
            } else {
                str2 = null;
            }
            c495520Jby.LIZJ("enter_from_merge", str2);
            C0IXL c0ixl2 = c0ir5.LJFF;
            if (c0ixl2 != null) {
                str3 = c0ixl2.LIZ;
            } else {
                str3 = null;
            }
            c495520Jby.LIZJ("enter_method", str3);
            C0IXL c0ixl3 = c0ir5.LJFF;
            if (c0ixl3 != null) {
                str4 = c0ixl3.LJFF;
            }
            c495520Jby.LIZJ("action_type", str4);
            Long l = c0ir5.LIZLLL;
            if (l != null) {
                jLongValue = l.longValue();
            } else {
                jLongValue = -1;
            }
            c495520Jby.LIZIZ(jLongValue, "anchor_id");
        }
    }

    public final LinkedList UQ2(String str, List list, boolean z, boolean z2) {
        List<IapListResult.VoucherItem> listLJIILLIIL;
        Object next;
        Object obj;
        Diamond diamond;
        IapListResult.ListResultExtra listResultExtraLJII;
        IapListResult.IapCustomData iapCustomData;
        if (list == null) {
            return new LinkedList();
        }
        LinkedList linkedList = new LinkedList(list);
        if (z) {
            Diamond diamond2 = new Diamond();
            diamond2.LIZ = 6;
            linkedList.addFirst(new C1806600x74(6, diamond2));
        }
        Iterator it2 = list.iterator();
        while (true) {
            listLJIILLIIL = null;
            if (it2.hasNext()) {
                next = it2.next();
                if (((C1806600x74) next).LIZIZ instanceof Diamond) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        C1806600x74 c1806600x74 = (C1806600x74) next;
        if (c1806600x74 != null) {
            obj = c1806600x74.LIZIZ;
        } else {
            obj = null;
        }
        if (obj instanceof Diamond) {
            diamond = (Diamond) obj;
        } else {
            diamond = null;
        }
        C1806600x74 c1806600x74HR2 = hR2(diamond);
        if (c1806600x74HR2 != null) {
            linkedList.addFirst(c1806600x74HR2);
        }
        int iWQ2 = WQ2();
        if (iWQ2 != 0) {
            Diamond diamond3 = new Diamond();
            diamond3.LIZ = iWQ2;
            linkedList.addFirst(new C1806600x74(iWQ2, diamond3));
        }
        C1804840x4E c1804840x4E = this.LLIZ;
        if (c1804840x4E != null && (listResultExtraLJII = c1804840x4E.LJII()) != null && (iapCustomData = listResultExtraLJII.iapCustomData) != null && iapCustomData.enableCustomOption) {
            Diamond diamond4 = new Diamond();
            diamond4.LIZ = 7;
            linkedList.addLast(new C1806600x74(7, diamond4));
        }
        C1806860x7U c1806860x7UAR2 = aR2();
        C1804840x4E c1804840x4E2 = this.LLIZ;
        if (c1804840x4E2 != null) {
            listLJIILLIIL = c1804840x4E2.LJIILLIIL(str);
        }
        c1806860x7UAR2.LJI(listLJIILLIIL, z2);
        if (aR2().LJFF != null) {
            Diamond diamond5 = new Diamond();
            diamond5.LIZ = 4;
            linkedList.addLast(new C1806600x74(diamond5.LIZ, diamond5));
        }
        return linkedList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void pR2(int i, int i2, Context context, Integer num) {
        boolean z;
        Object obj;
        int i3;
        String str;
        int i4;
        RevenueExchange revenueExchange;
        int i5;
        int i6;
        RevenueExchange revenueExchange2;
        int i7;
        Object value = this.LLLF.getValue();
        String strER2 = eR2();
        Object value2 = this.LLJZIJLIL.getValue();
        String strXQ2 = XQ2();
        String str2 = (String) this.LLJLLIL.getValue();
        if (this.LLLFFI == 2) {
            z = true;
        } else {
            z = false;
        }
        boolean zJR2 = jR2();
        int iYQ2 = YQ2();
        String strG60 = g60();
        C1803800x2Y c1803800x2Y = C1803800x2Y.LIZ;
        HashMap map = new HashMap();
        Integer numValueOf = Integer.valueOf(iYQ2);
        c1803800x2Y.getClass();
        C1803800x2Y.LJFF(numValueOf, map);
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_exchange_entrance_click");
        c474500IjALIZ.LJIL();
        c474500IjALIZ.LJJII(value, "exchange_type");
        c474500IjALIZ.LJJII(strER2, "request_page");
        c474500IjALIZ.LJJII(value2, "exchange_scenario");
        c474500IjALIZ.LJJII(strXQ2, "charge_reason");
        c474500IjALIZ.LJJII(str2, "gift_enter_from");
        c474500IjALIZ.LJJII(C1149680g1W.LIZLLL(), "live_scene");
        c474500IjALIZ.LJJII(C1149680g1W.LJ(), "is_first_recharge");
        String str3 = CardStruct.IStatusCode.DEFAULT;
        if (z) {
            obj = "1";
        } else {
            obj = CardStruct.IStatusCode.DEFAULT;
        }
        c474500IjALIZ.LJJII(obj, "could_exchange");
        if (zJR2) {
            str3 = "1";
        }
        c474500IjALIZ.LJJII(str3, "is_from_switch");
        c474500IjALIZ.LJJII(strG60, "panel_channel");
        c474500IjALIZ.LJJII(Integer.valueOf(((IWalletService) C1161920gLG.LIZJ(IWalletService.class)).getRechargeService().LIZJ()), "recharge_v3_version");
        c474500IjALIZ.LJJIIZI(map);
        C1149680g1W.LIZ(c474500IjALIZ);
        C1149680g1W.LIZJ(c474500IjALIZ, str2);
        c474500IjALIZ.LIZ();
        Map<String, String> map2 = this.LLJJJJ.LIZJ;
        DataChannel dataChannel = this.LLJJJJJIL;
        boolean zLJIIZILJ = C500260Jjc.LJIIZILJ(dataChannel);
        int iLJIJI = zLJIIZILJ;
        iLJIJI = zLJIIZILJ;
        if (dataChannel == null && map2 != null) {
            iLJIJI = zLJIIZILJ;
            if (map2.containsKey("is_anchor")) {
                iLJIJI = u.LJIJI(map2.get("is_anchor"), "1", false);
            }
        }
        ExchangeDisplayInfo exchangeDisplayInfoKL2 = ((IWalletService) C1161920gLG.LIZJ(IWalletService.class)).walletCenter().kL2();
        C474500IjA c474500IjALIZ2 = C0IJT.LIZ("livesdk_recharge_exchange_entrance");
        c474500IjALIZ2.LJIJJLI(dataChannel);
        c474500IjALIZ2.LJJII("live_detail", "request_page");
        if (i2 == 2) {
            i3 = 1;
        } else {
            i3 = 0;
        }
        c474500IjALIZ2.LJJII(Integer.valueOf(i3), "could_exchange");
        if (i == -1) {
            str = "ug_exchange";
        } else {
            str = "anchor_income";
        }
        c474500IjALIZ2.LJJII(str, "charge_reason");
        c474500IjALIZ2.LJJII(Integer.valueOf(iLJIJI), "is_anchor");
        c474500IjALIZ2.LJJII(C1803800x2Y.LJIILJJIL(), "is_first_recharge");
        c474500IjALIZ2.LJJII(C1803800x2Y.LJIIL(num), "strategy_task_type");
        c474500IjALIZ2.LJJII("package", "first_recharge_exchange_entrance_page");
        c474500IjALIZ2.LJJII(Integer.valueOf(!exchangeDisplayInfoKL2.isFirstExchange ? 1 : 0), "is_exchange_before");
        c474500IjALIZ2.LJJII(Integer.valueOf(exchangeDisplayInfoKL2.LIZ() ? 1 : 0), "is_tax_info_finished");
        c474500IjALIZ2.LIZ();
        Boolean boolValueOf = null;
        if (i2 != 1) {
            if (i2 != 2) {
                WalletStruct walletStructTF1 = ((IWalletService) C1161920gLG.LIZJ(IWalletService.class)).walletCenter().TF1();
                if (walletStructTF1 != null) {
                    boolValueOf = Boolean.valueOf(walletStructTF1.isPeriodicPayout);
                }
                if (i == -1) {
                    C766270U4b.LIZLLL(2131841605);
                    return;
                }
                if (fR2() != -2) {
                    return;
                }
                WalletStruct walletStructTF12 = ((IWalletService) C1161920gLG.LIZJ(IWalletService.class)).walletCenter().TF1();
                if (walletStructTF12 != null && (revenueExchange2 = walletStructTF12.revenue) != null && revenueExchange2.isRevenue()) {
                    if (Intrinsics.LJFF(boolValueOf, Boolean.TRUE)) {
                        i7 = 2131841548;
                    } else {
                        i7 = 2131841979;
                    }
                    C766270U4b.LIZLLL(i7);
                    return;
                }
                if (Intrinsics.LJFF(boolValueOf, Boolean.TRUE)) {
                    i6 = 2131841558;
                } else {
                    i6 = 2131841978;
                }
                C766270U4b.LIZLLL(i6);
                return;
            }
            if (!lR2()) {
                if (((IHostPad) C1161920gLG.LIZJ(IHostPad.class)).Nx()) {
                    sR2(context);
                    return;
                } else {
                    this.LLLLILI = true;
                    C784440Upu.LIZ().LIZIZ(new C0IF2(1));
                    return;
                }
            }
            sR2(context);
            return;
        }
        WalletStruct walletStructTF13 = ((IWalletService) C1161920gLG.LIZJ(IWalletService.class)).walletCenter().TF1();
        if (walletStructTF13 != null) {
            boolValueOf = Boolean.valueOf(walletStructTF13.isPeriodicPayout);
        }
        if (i == -1) {
            C766270U4b.LIZLLL(2131841604);
            return;
        }
        if (fR2() != -2) {
            return;
        }
        WalletStruct walletStructTF14 = ((IWalletService) C1161920gLG.LIZJ(IWalletService.class)).walletCenter().TF1();
        if (walletStructTF14 != null && (revenueExchange = walletStructTF14.revenue) != null && revenueExchange.isRevenue()) {
            if (Intrinsics.LJFF(boolValueOf, Boolean.TRUE)) {
                i5 = 2131841546;
            } else {
                i5 = 2131841977;
            }
            C766270U4b.LIZLLL(i5);
            return;
        }
        if (Intrinsics.LJFF(boolValueOf, Boolean.TRUE)) {
            i4 = 2131841555;
        } else {
            i4 = 2131841976;
        }
        C766270U4b.LIZLLL(i4);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v3, types: [int] */
    /* JADX WARN: Type inference failed for: r8v5 */
    public final void qR2(Context context, Map<String, String> map, TrackingEventV3Data trackingEventV3Data, C1797120wrm c1797120wrm) {
        boolean z;
        boolean z2;
        Map<String, String> mapLIZ;
        ?? LJJJI;
        boolean z3;
        this.LLLJIL = map;
        KycIncentiveFooterViewModel kycIncentiveFooterViewModelBR2 = bR2();
        if (kycIncentiveFooterViewModelBR2 != null) {
            Map<String, String> map2 = this.LLLJIL;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            if (kycIncentiveFooterViewModelBR2.xQ2()) {
                linkedHashMap.put("is_from_kyc", "1");
            }
            map2.putAll(linkedHashMap);
        }
        this.LLLIIIL = true;
        Diamond value = this.LLLLIILL.getValue();
        if (value != null) {
            String strER2 = eR2();
            String strXQ2 = XQ2();
            C1803800x2Y c1803800x2Y = C1803800x2Y.LIZ;
            c1803800x2Y.getClass();
            boolean zLJFF = Intrinsics.LJFF(C1803800x2Y.LJIILJJIL(), "1");
            C1797190wrt.LIZ = true;
            C1797190wrt.LIZJ = strER2;
            C1797190wrt.LIZLLL = C1796440wqg.LIZ();
            C1797190wrt.LJ = strXQ2;
            C1797190wrt.LJFF = C158B.LIZ();
            C1797190wrt.LIZIZ = zLJFF;
            C1803830x2b c1803830x2b = this.LLJJJJ;
            int i = value.count;
            boolean z4 = this.LLLIIIIL;
            DataChannel dataChannel = this.LLJJJJJIL;
            Diamond diamond = this.LLLLIIL;
            boolean zFQ2 = FQ2();
            boolean z5 = this.LLLJL;
            if (this.LLLFFI == 2) {
                z = true;
            } else {
                z = false;
            }
            boolean zEQ2 = BaseRechargeViewModel.EQ2();
            C1806860x7U c1806860x7UAR2 = aR2();
            if (value.LIZIZ()) {
                z2 = true;
            } else {
                z2 = false;
            }
            Map<String, String> mapLIZIZ = c1806860x7UAR2.LIZIZ(z2, true, true);
            Map<String, String> map3 = this.LLLJIL;
            Integer num = null;
            if (trackingEventV3Data != null) {
                mapLIZ = trackingEventV3Data.LIZ();
            } else {
                mapLIZ = null;
            }
            C1803800x2Y.LJJIJIIJI(c1803800x2Y, c1803830x2b, i, z4, dataChannel, diamond, zFQ2, z5, z, zEQ2, mapLIZIZ, map3, mapLIZ, ZQ2());
            if (context != null) {
                int iYQ2 = YQ2();
                List<String> listLIZJ = aR2().LIZJ();
                C1803830x2b c1803830x2b2 = this.LLJJJJ;
                String str = c1803830x2b2.LIZLLL;
                String str2 = c1803830x2b2.LJIIL;
                Boolean boolValueOf = Boolean.valueOf(C1803840x2c.LIZIZ(c1803830x2b2.LJ));
                VaultRechargeUnlockGiftViewModel vaultRechargeUnlockGiftViewModel = this.LLLIL;
                if (vaultRechargeUnlockGiftViewModel != null) {
                    num = vaultRechargeUnlockGiftViewModel.LL;
                }
                C1803450x1z c1803450x1z = new C1803450x1z(context, value, iYQ2, listLIZJ, str, str2, boolValueOf, num, C1804180x3A.LIZJ());
                KycIncentiveFooterViewModel kycIncentiveFooterViewModelBR22 = bR2();
                if (kycIncentiveFooterViewModelBR22 != null && kycIncentiveFooterViewModelBR22.xQ2()) {
                    KycIncentiveFooterViewModel kycIncentiveFooterViewModelBR23 = bR2();
                    if (kycIncentiveFooterViewModelBR23 != null) {
                        EnumC1805450x5D value2 = kycIncentiveFooterViewModelBR23.vQ2().getValue();
                        if (value2 != null) {
                            if (value2.getGroup() == EnumC1805520x5K.NEW) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            LJJJI = C500260Jjc.LJJJI(Boolean.valueOf(z3));
                        } else {
                            LJJJI = 0;
                        }
                        if (kycIncentiveFooterViewModelBR23.xQ2()) {
                            C1806150x6L c1806150x6L = new C1806150x6L();
                            c1806150x6L.LIZ("banner_type", "level3_incentive");
                            c1806150x6L.LIZ("kyc_incentive_level", String.valueOf(EnumC1704090uRj.L3.getLevelValue()));
                            c1806150x6L.LIZ("is_new_user", String.valueOf((int) LJJJI));
                            c1806150x6L.LIZIZ();
                        } else {
                            C20441214yg.LIZIZ("KycIncentiveFooterViewModel", "onRechargeButtonClickedForPreRechargePopup(): NOTREACHED");
                        }
                        kycIncentiveFooterViewModelBR23.LLILZ = true;
                        this.LLLIZZ = c1803450x1z;
                        SmartRouter.buildRoute(context, kycIncentiveFooterViewModelBR23.LLILLJJLI).open();
                        return;
                    }
                    return;
                }
                tR2(true);
                String json = GsonProtectorUtils.toJson(C19748512Ol.LIZIZ, og1(false));
                json.toString();
                xQ2(c1803450x1z, new C1776960wLG(((IWalletService) C1161920gLG.LIZJ(IWalletService.class)).isSupportPreloadReuseCashier(YQ2(), false), C158B.LIZ()), c1797120wrm, json);
            }
        }
    }

    @Override // com.bytedance.android.live.walletnew.BaseRechargeViewModel
    public final void wQ2(Integer num, Integer num2, Integer num3, List<String> list) {
        int iIntValue;
        boolean z;
        boolean z2;
        Map<String, String> mapLIZ;
        int iIntValue2;
        Integer num4;
        C1803800x2Y c1803800x2Y = C1803800x2Y.LIZ;
        C1803830x2b c1803830x2b = this.LLJJJJ;
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = 0;
        }
        boolean z3 = this.LLLIIIIL;
        DataChannel dataChannel = this.LLJJJJJIL;
        Diamond diamond = this.LLLLIIL;
        boolean zFQ2 = FQ2();
        boolean z4 = this.LLLJL;
        if (this.LLLFFI == 2) {
            z = true;
        } else {
            z = false;
        }
        boolean zEQ2 = BaseRechargeViewModel.EQ2();
        C1806860x7U c1806860x7UAR2 = aR2();
        Diamond value = this.LLLLIILL.getValue();
        if (value != null && value.LIZIZ()) {
            z2 = true;
        } else {
            z2 = false;
        }
        Map<String, String> mapLIZIZ = c1806860x7UAR2.LIZIZ(z2, true, true);
        Map<String, String> map = this.LLLJIL;
        TrackingEventV3Data trackingEventV3DataOg1 = og1(true);
        if (trackingEventV3DataOg1 != null) {
            mapLIZ = trackingEventV3DataOg1.LIZ();
        } else {
            mapLIZ = null;
        }
        C1803800x2Y.LJJIJIIJI(c1803800x2Y, c1803830x2b, iIntValue, z3, dataChannel, diamond, zFQ2, z4, z, zEQ2, mapLIZIZ, map, mapLIZ, ZQ2());
        Diamond diamondRu0 = ru0();
        if (diamondRu0 == null) {
            return;
        }
        if (num != null) {
            iIntValue2 = num.intValue();
        } else {
            iIntValue2 = 0;
        }
        diamondRu0.LJIIIIZZ = iIntValue2;
        int iYQ2 = YQ2();
        ArrayList arrayList = new ArrayList(list);
        C1803830x2b c1803830x2b2 = this.LLJJJJ;
        String str = c1803830x2b2.LIZLLL;
        String str2 = c1803830x2b2.LJIIL;
        Boolean boolValueOf = Boolean.valueOf(C1803840x2c.LIZIZ(c1803830x2b2.LJ));
        VaultRechargeUnlockGiftViewModel vaultRechargeUnlockGiftViewModel = this.LLLIL;
        if (vaultRechargeUnlockGiftViewModel != null) {
            num4 = vaultRechargeUnlockGiftViewModel.LL;
        } else {
            num4 = null;
        }
        C1803450x1z c1803450x1z = new C1803450x1z(null, diamondRu0, iYQ2, arrayList, str, str2, boolValueOf, num4, C1804180x3A.LIZJ());
        C1797120wrm c1797120wrm = new C1797120wrm(num, num2, num3);
        String json = GsonProtectorUtils.toJson(C19748512Ol.LIZIZ, og1(true));
        json.toString();
        xQ2(c1803450x1z, new C1776960wLG(((IWalletService) C1161920gLG.LIZJ(IWalletService.class)).isSupportPreloadReuseCashier(YQ2(), false), C158B.LIZ()), c1797120wrm, json);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public RechargeViewModel(Bundle bundle, C1803830x2b c1803830x2b, InterfaceC1803460x20 interfaceC1803460x20, DataChannel dataChannel, InterfaceC1805160x4k interfaceC1805160x4k, InterfaceC1805480x5G interfaceC1805480x5G) {
        long jLongValue;
        long ownerUserId;
        ViewModelStoreOwner viewModelStoreOwnerLLIIIILZ;
        VaultRechargeUnlockGiftViewModel vaultRechargeUnlockGiftViewModel;
        Room room;
        Long l;
        C1805620x5U c1805620x5U = LLLLL;
        c1805620x5U.getClass();
        if (dataChannel != null && (l = (Long) dataChannel.gg0(C751340Tdc.class)) != null) {
            jLongValue = l.longValue();
        } else {
            jLongValue = 0;
        }
        c1805620x5U.getClass();
        if (dataChannel != null && (room = (Room) dataChannel.gg0(RoomChannel.class)) != null) {
            ownerUserId = room.getOwnerUserId();
        } else {
            ownerUserId = 0;
        }
        super(interfaceC1803460x20, jLongValue, ownerUserId, c1803830x2b.LJ);
        this.LLJJJIL = bundle;
        this.LLJJJJ = c1803830x2b;
        this.LLJJJJJIL = dataChannel;
        this.LLJJJJLIIL = interfaceC1805160x4k;
        this.LLJJL = interfaceC1805480x5G;
        this.LLJJLIIIJLLLLLLLZ = C452501pT.LIZIZ(new AwS571S0100000_27(this, 151));
        this.LLJL = C452501pT.LIZIZ(new AwS571S0100000_27(this, 155));
        this.LLJLIL = C452501pT.LIZIZ(new AwS571S0100000_27(this, 156));
        this.LLJLILLLLZIIL = C452501pT.LIZIZ(new AwS571S0100000_27(this, 142));
        this.LLJLL = C452501pT.LIZIZ(new AwS571S0100000_27(this, 141));
        this.LLJLLIL = C452501pT.LIZIZ(new AwS571S0100000_27(this, 147));
        this.LLJLLL = C452501pT.LIZIZ(new AwS571S0100000_27(this, 148));
        this.LLJZIJLIL = C452501pT.LIZIZ(new AwS571S0100000_27(this, 144));
        this.LLL = C452501pT.LIZIZ(new AwS571S0100000_27(this, 145));
        this.LLLF = C452501pT.LIZIZ(new AwS571S0100000_27(this, 146));
        this.LLLFF = C452501pT.LIZIZ(new AwS571S0100000_27(this, 157));
        this.LLLFFI = c1803830x2b.LJIJ;
        this.LLLFZ = C452501pT.LIZIZ(new AwS571S0100000_27(this, 154));
        this.LLLI = C452501pT.LIZIZ(new AwS571S0100000_27(this, 149));
        this.LLLII = C452501pT.LIZIZ(new AwS571S0100000_27(this, 150));
        this.LLLIIII = C452501pT.LIZIZ(AFwS216S0000000_27.get$arr$(70));
        this.LLLIILIL = C452501pT.LIZIZ(new AwS571S0100000_27(this, 152));
        VaultRechargeUnlockGiftViewModel vaultRechargeUnlockGiftViewModel2 = null;
        if (interfaceC1805160x4k != null && (viewModelStoreOwnerLLIIIILZ = interfaceC1805160x4k.LLIIIILZ()) != null && (vaultRechargeUnlockGiftViewModel = (VaultRechargeUnlockGiftViewModel) new ViewModelProvider(viewModelStoreOwnerLLIIIILZ).get(VaultRechargeUnlockGiftViewModel.class)) != null) {
            if (bundle != null && bundle.containsKey("key_bundle_vault_gift_id")) {
                vaultRechargeUnlockGiftViewModel.LL = Integer.valueOf(bundle.getInt("key_bundle_vault_gift_id"));
            }
            vaultRechargeUnlockGiftViewModel2 = vaultRechargeUnlockGiftViewModel;
        }
        this.LLLIL = vaultRechargeUnlockGiftViewModel2;
        this.LLLILZ = C452501pT.LIZIZ(new AwS571S0100000_27(this, 143));
        this.LLLILZJ = C452501pT.LIZIZ(new AwS428S0200000_27(this, interfaceC1803460x20, 4));
        this.LLLILZLLLI = C452501pT.LIZIZ(new AwS571S0100000_27(this, 153));
        this.LLLJIL = new LinkedHashMap();
        this.LLLL = new MutableLiveData<>();
        this.LLLLII = new InterfaceC1797050wrf() { // from class: X.0x2Z
            @Override // X.InterfaceC1797050wrf
            public final void LIZ(HashMap map) {
                int i;
                Boolean boolValueOf;
                boolean z;
                boolean z2;
                Map<String, String> mapLIZ;
                int i2;
                String str;
                boolean zLJFF;
                Object obj;
                Object obj2;
                String str2;
                Integer numValueOf;
                String strLIZ;
                String str3;
                Object obj3;
                Object obj4;
                String str4;
                String billingCountryCode;
                Map<String, String> map2 = this.LIZ.LLLJIL;
                if (map != null) {
                    map2.putAll(map);
                }
                Map<String, String> map3 = this.LIZ.LLJJJJ.LIZJ;
                if (map3 != null) {
                    map2.putAll(map3);
                }
                C1803800x2Y c1803800x2Y = C1803800x2Y.LIZ;
                Diamond value = this.LIZ.LLLLIILL.getValue();
                if (value != null) {
                    i = value.count;
                } else {
                    i = 0;
                }
                RechargeViewModel rechargeViewModel = this.LIZ;
                C1803830x2b c1803830x2b2 = rechargeViewModel.LLJJJJ;
                DataChannel dataChannel2 = rechargeViewModel.LLJJJJJIL;
                boolean z3 = rechargeViewModel.LLLIIIIL;
                Diamond diamond = rechargeViewModel.LLLLIIL;
                C1804840x4E c1804840x4E = rechargeViewModel.LLIZ;
                if (c1804840x4E != null) {
                    boolValueOf = Boolean.valueOf(c1804840x4E.LJIJ());
                } else {
                    boolValueOf = null;
                }
                boolean zLJJJI = C500260Jjc.LJJJI(boolValueOf);
                RechargeViewModel rechargeViewModel2 = this.LIZ;
                boolean z4 = rechargeViewModel2.LLLJL;
                if (rechargeViewModel2.LLLFFI == 2) {
                    z = true;
                } else {
                    z = false;
                }
                C1806860x7U c1806860x7UAR2 = rechargeViewModel2.aR2();
                Diamond value2 = this.LIZ.LLLLIILL.getValue();
                if (value2 != null && value2.LIZIZ()) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                Map<String, String> mapLIZIZ = c1806860x7UAR2.LIZIZ(z2, false, true);
                TrackingEventV3Data trackingEventV3DataOg1 = this.LIZ.og1(false);
                if (trackingEventV3DataOg1 != null) {
                    mapLIZ = trackingEventV3DataOg1.LIZ();
                } else {
                    mapLIZ = null;
                }
                int iZQ2 = this.LIZ.ZQ2();
                c1803800x2Y.getClass();
                if (diamond != null && i == diamond.count) {
                    i2 = 1;
                } else {
                    i2 = 0;
                }
                Pair[] pairArr = new Pair[27];
                pairArr[0] = new Pair("request_page", c1803830x2b2.LJIIL);
                w.LIZ.getClass();
                if (Intrinsics.LJFF(w.LJIIL(), "portal")) {
                    str = "portal";
                } else {
                    str = c1803830x2b2.LIZLLL;
                }
                pairArr[1] = new Pair("charge_reason", str);
                pairArr[2] = new Pair("charge_style", "window");
                pairArr[3] = new Pair("pay_method", C1796440wqg.LIZ());
                pairArr[4] = new Pair("recharge_package", String.valueOf(i));
                pairArr[5] = new Pair("is_first_recharge", C1803800x2Y.LJIILJJIL());
                pairArr[6] = new Pair("is_first_cash_recharge", C1803800x2Y.LJIILIIL());
                pairArr[7] = new Pair("strategy_task_type", C1803800x2Y.LJIIL(Integer.valueOf(c1803830x2b2.LJ)));
                pairArr[8] = new Pair("second_entrance", c1803830x2b2.LJIILIIL);
                pairArr[9] = new Pair("timestamp", String.valueOf(C158B.LIZ()));
                pairArr[10] = new Pair("notification_type", C1803800x2Y.LJIIJ(c1803830x2b2.LJIILJJIL));
                String str5 = c1803830x2b2.LJIILJJIL;
                String str6 = c1803830x2b2.LJIILL;
                String str7 = "";
                if (!C1123580fLQ.LIZIZ(str5)) {
                    str6 = "";
                }
                pairArr[11] = new Pair("notification_request_id", str6);
                if (dataChannel2 != null) {
                    zLJFF = Intrinsics.LJFF(dataChannel2.gg0(UserIsAnchorChannel.class), Boolean.TRUE);
                } else {
                    zLJFF = false;
                }
                String str8 = "1";
                if (zLJFF) {
                    obj = "1";
                } else {
                    obj = "1";
                    str8 = CardStruct.IStatusCode.DEFAULT;
                }
                pairArr[12] = new Pair("is_anchor", str8);
                pairArr[13] = new Pair("is_multi", ((ILiveMatchService) C1161920gLG.LIZJ(ILiveMatchService.class)).sy0());
                pairArr[14] = new Pair("sub_match_type", ((ILiveMatchService) C1161920gLG.LIZJ(ILiveMatchService.class)).my());
                pairArr[15] = new Pair("portal_id", String.valueOf(w.LJIJ()));
                if (Intrinsics.LJFF(w.LJIIL(), "portal")) {
                    obj2 = obj;
                } else {
                    obj2 = CardStruct.IStatusCode.DEFAULT;
                }
                pairArr[16] = new Pair("is_portal_user", obj2);
                if (c1803830x2b2.LJIIJ) {
                    str2 = "rec_main";
                } else {
                    str2 = "normal";
                }
                pairArr[17] = new Pair("panel_type", str2);
                if (diamond != null) {
                    numValueOf = Integer.valueOf(diamond.count);
                } else {
                    numValueOf = null;
                }
                pairArr[18] = new Pair("call_package", String.valueOf(numValueOf));
                if (diamond != null) {
                    strLIZ = C1804850x4F.LIZ(diamond);
                } else {
                    strLIZ = null;
                }
                pairArr[19] = new Pair("currency", String.valueOf(strLIZ));
                pairArr[20] = new Pair("if_default_package", String.valueOf(i2));
                if (z3) {
                    str3 = "click";
                } else {
                    str3 = "call";
                }
                pairArr[21] = new Pair("preview_type", str3);
                if (z4) {
                    obj3 = obj;
                } else {
                    obj3 = CardStruct.IStatusCode.DEFAULT;
                }
                pairArr[22] = new Pair("if_has_exchange_option", obj3);
                if (z) {
                    obj4 = obj;
                } else {
                    obj4 = CardStruct.IStatusCode.DEFAULT;
                }
                pairArr[23] = new Pair("can_exchange", obj4);
                if (!c1803830x2b2.LJIJJ) {
                    obj = CardStruct.IStatusCode.DEFAULT;
                }
                pairArr[24] = new Pair("is_from_switch", obj);
                InterfaceC1791930wjP interfaceC1791930wjP = (InterfaceC1791930wjP) C1161920gLG.LIZJ(IapService.class);
                if (interfaceC1791930wjP != null && (billingCountryCode = interfaceC1791930wjP.getBillingCountryCode()) != null) {
                    str7 = billingCountryCode;
                }
                pairArr[25] = new Pair("app_store_front", str7);
                pairArr[26] = new Pair("is_quick_charge_on", String.valueOf(iZQ2));
                Map mapLJIIJ = C2097608Jq.LJIIJ(pairArr);
                mapLJIIJ.putAll(((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).getMatchLogParams());
                C1803800x2Y.LJ(mapLJIIJ);
                C1803800x2Y.LJFF(Integer.valueOf(c1803830x2b2.LJ), mapLJIIJ);
                Map mapLJII = C1803800x2Y.LJII(c1803830x2b2, i);
                Map mapLJIIIZ = C1803800x2Y.LJIIIZ();
                Map mapLJIIIIZZ = C1803800x2Y.LJIIIIZZ(c1803830x2b2, zLJJJI);
                if (mapLIZ != null) {
                    mapLJIIJ.putAll(mapLIZ);
                }
                C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_recharge_pay");
                c474500IjALIZ.LJJII(C1123580fLQ.LIZ(c1803830x2b2.LJIILJJIL), "gift_enter_from");
                c474500IjALIZ.LJJII(c1803830x2b2.LJIILLIIL, "gift_send_type");
                c474500IjALIZ.LJJII(c1803830x2b2.LJIJI, "has_gift_sent_before");
                if (C497740JfY.LJIL()) {
                    str4 = "portrait";
                } else {
                    str4 = "landscape";
                }
                c474500IjALIZ.LJJII(str4, "room_orientation");
                c474500IjALIZ.LJJIIZI(mapLJIIJ);
                c474500IjALIZ.LJJIIZI(mapLJII);
                c474500IjALIZ.LJJIIZI(mapLJIIIZ);
                c474500IjALIZ.LJJIIZI(mapLJIIIIZZ);
                c474500IjALIZ.LJJIIZI(map2);
                c474500IjALIZ.LJJIIZI(mapLIZIZ);
                c474500IjALIZ.LJIJJLI(dataChannel2);
                c474500IjALIZ.LJFF(C0IXW.LIZIZ(null, dataChannel2, "user_live_duration"));
                c474500IjALIZ.LIZ();
            }
        };
        this.LLLLIIIILLL = new MutableLiveData<>();
        this.LLLLIILL = new MutableLiveData<>();
        this.LLLLIILLL = new MutableLiveData<>(Boolean.TRUE);
        this.LLLLIL = new MutableLiveData<>();
        this.LLLLJ = new MutableLiveData<>();
    }

    public static C1797200wru dR2(int i, int i2, int i3, String str, String str2, Exception exc) {
        return new C1797200wru(1, i, i2, str, str2, "ttlive_query_pipo_purchase", exc, null, null, 0, i3, null, 2944, null);
    }
}
