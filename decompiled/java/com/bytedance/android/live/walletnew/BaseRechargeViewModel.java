package com.bytedance.android.live.walletnew;

import X.C01GW;
import X.C07LT;
import X.C09IR;
import X.C09JN;
import X.C0UO0;
import X.C0VYA;
import X.C1103530ep5;
import X.C1124340fMe;
import X.C1126800fQc;
import X.C1134860fdc;
import X.C1149180g0i;
import X.C1161920gLG;
import X.C11JF;
import X.C11NJ;
import X.C13BV;
import X.C1548820qPI;
import X.C158B;
import X.C1776960wLG;
import X.C1796560wqs;
import X.C1796880wrO;
import X.C1797010wrb;
import X.C1797030wrd;
import X.C1797100wrk;
import X.C1797120wrm;
import X.C1797200wru;
import X.C1797210wrv;
import X.C1797220wrw;
import X.C1797250wrz;
import X.C1797270ws1;
import X.C1797350ws9;
import X.C1800380wx2;
import X.C1802730x0p;
import X.C1803450x1z;
import X.C1803480x22;
import X.C1803510x25;
import X.C1803540x28;
import X.C1803550x29;
import X.C1803910x2j;
import X.C1803930x2l;
import X.C1803940x2m;
import X.C1804840x4E;
import X.C1804990x4T;
import X.C1805240x4s;
import X.C1807890x99;
import X.C1871910yoP;
import X.C19748512Ol;
import X.C1AF0;
import X.C20441214yg;
import X.C2188811AlT;
import X.C2252331DDr;
import X.C262100zr;
import X.C480460Ism;
import X.C497740JfY;
import X.C500260Jjc;
import X.C784440Upu;
import X.EnumC1803160x1W;
import X.EnumC1805420x5A;
import X.EnumC1805570x5P;
import X.EnumC1805800x5m;
import X.InterfaceC1107590evd;
import X.InterfaceC1133710fbl;
import X.InterfaceC1141530foN;
import X.InterfaceC1487280oo2;
import X.InterfaceC1791930wjP;
import X.InterfaceC1796910wrR;
import X.InterfaceC1797050wrf;
import X.InterfaceC1803460x20;
import X.InterfaceC1803980x2q;
import X.InterfaceC1804390x3V;
import Y.AfS196S0100000_27;
import Y.AfS1S0400100_27;
import android.os.SystemClock;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.bytedance.android.live.iap.service.IapService;
import com.bytedance.android.live.wallet.IWalletService;
import com.bytedance.android.live.wallet.api.IapApi;
import com.bytedance.android.live.wallet.data.api.IRechargeApi;
import com.bytedance.android.live.wallet.model.WalletStruct;
import com.bytedance.android.live.wallet.model.recharge.RechargeRequestParams;
import com.bytedance.android.live.wallet.model.recharge.RecommendStrategyParam;
import com.bytedance.android.live.walletnew.BaseRechargeViewModel;
import com.bytedance.android.livesdk.api.revenue.strategy.IRevenueStrategyService;
import com.bytedance.android.livesdk.livesetting.wallet.LiveWalletLoadingIndicatorSetting;
import com.bytedance.android.livesdk.livesetting.wallet.LiveWalletQueryProductTimeOut;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdk.wallet.Diamond;
import com.bytedance.android.livesdk.wallet.NoticesResult;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.internal.AwS571S0100000_27;
import kotlin.jvm.internal.Intrinsics;
import tikcast.api.wallet.tiktok.DiamondBuyRequestParams;
import tikcast.api.wallet.tiktok.GetABSStatusResponse;
import tikcast.api.wallet.tiktok.UnlockVoucherParams;
import webcast.api.profit.IapListResult;

/* JADX INFO: loaded from: classes28.dex */
public class BaseRechargeViewModel extends ViewModel implements InterfaceC1141530foN {
    public static final long LLJJJ = LiveWalletQueryProductTimeOut.INSTANCE.getValue();
    public InterfaceC1803460x20 LLILLJJLI;
    public final long LLILLL;
    public final long LLILZ;
    public final int LLILZIL;
    public InterfaceC1797050wrf LLILZLL;
    public C1804840x4E LLIZ;
    public Diamond LLJILJIL;
    public int LLJILJILJ;
    public NoticesResult.Notice LLJILLL;
    public C11JF LLJJ;
    public RechargeRequestParams LLJJI;
    public long LLJJIII;
    public final C2252331DDr LLJJIJIIJIL;
    public final C2252331DDr LLJJIJIL;
    public final /* synthetic */ C1103530ep5 LL = new C1103530ep5();
    public final MutableLiveData<Unit> LLIZLLLIL = new MutableLiveData<>();
    public final MutableLiveData<Unit> LLJ = new MutableLiveData<>();
    public final MutableLiveData<Unit> LLJI = new MutableLiveData<>();
    public final MutableLiveData<Boolean> LLJIJIL = new MutableLiveData<>();
    public final C1800380wx2 LLJJIJI = new InterfaceC1796910wrR() { // from class: X.0wx2
        @Override // X.InterfaceC1796910wrR
        public final void LIZIZ(int i, C1797200wru c1797200wru) {
        }

        @Override // X.InterfaceC1796910wrR
        public final void LIZJ(int i, C1797010wrb c1797010wrb) {
        }

        @Override // X.InterfaceC1796910wrR
        public final void LIZLLL(int i, C1797200wru c1797200wru) {
        }

        @Override // X.InterfaceC1796910wrR
        public final void LJFF(int i, C1797200wru c1797200wru) {
        }

        @Override // X.InterfaceC1796910wrR
        public final void LJI(int i, C1797010wrb c1797010wrb) {
        }

        @Override // X.InterfaceC1796910wrR
        public final void LJIIIZ(int i, C1797200wru c1797200wru) {
        }

        @Override // X.InterfaceC1796910wrR
        public final void LJIILJJIL(int i, C1797010wrb c1797010wrb) {
        }

        @Override // X.InterfaceC1796910wrR
        public final void LJIILL(int i, C1797200wru c1797200wru) {
        }

        @Override // X.InterfaceC1796910wrR
        public final void LJIILLIIL(int i, C1797010wrb c1797010wrb) {
        }

        @Override // X.InterfaceC1796910wrR
        public final void LJIIZILJ(int i, C1797200wru c1797200wru) {
        }

        @Override // X.InterfaceC1796910wrR
        public final String getPayload() {
            return "";
        }

        @Override // X.InterfaceC1796910wrR
        public final InterfaceC1797050wrf LIZ() {
            return this.LIZ.yQ2();
        }

        @Override // X.InterfaceC1796910wrR
        public final void LJII(C1796960wrW c1796960wrW) {
            C1796950wrV.LIZ(this, c1796960wrW);
        }

        @Override // X.InterfaceC1796910wrR
        public final void LJIIJ(boolean z) {
            BaseRechargeViewModel baseRechargeViewModel = this.LIZ;
            baseRechargeViewModel.getClass();
            if (LiveWalletLoadingIndicatorSetting.INSTANCE.getValue()) {
                if (z) {
                    baseRechargeViewModel.CQ2();
                } else {
                    baseRechargeViewModel.PQ2(2131855633, 0L);
                }
            }
        }

        @Override // X.InterfaceC1796910wrR
        public final void LJIIJJI(C1777440wM2 c1777440wM2) {
            BaseRechargeViewModel baseRechargeViewModel = this.LIZ;
            baseRechargeViewModel.CQ2();
            InterfaceC1803460x20 interfaceC1803460x20 = baseRechargeViewModel.LLILLJJLI;
            if (interfaceC1803460x20 != null) {
                interfaceC1803460x20.ww(c1777440wM2);
            }
        }

        @Override // X.InterfaceC1796910wrR
        public final void LJIILIIL(C1797010wrb c1797010wrb) {
            this.LIZ.JQ2(c1797010wrb);
        }

        @Override // X.InterfaceC1796910wrR
        public final void LJ(int i, C1797200wru c1797200wru) {
            BaseRechargeViewModel baseRechargeViewModel = this.LIZ;
            baseRechargeViewModel.CQ2();
            baseRechargeViewModel.RQ2(c1797200wru.getOrderId());
            C1797250wrz c1797250wrzLIZ = C1797210wrv.LIZ(c1797200wru);
            c1797250wrzLIZ.LJII = baseRechargeViewModel.LLJJI;
            InterfaceC1803460x20 interfaceC1803460x20 = baseRechargeViewModel.LLILLJJLI;
            if (interfaceC1803460x20 != null) {
                interfaceC1803460x20.zz(i, c1797200wru.getErrorCode(), c1797200wru.getDetailCode(), c1797200wru.getMappedErrorCode(), c1797200wru.getMappedErrorMessage(), c1797250wrzLIZ, true);
            }
        }

        @Override // X.InterfaceC1796910wrR
        public final void LJIIIIZZ(int i, C1797010wrb c1797010wrb) {
            BaseRechargeViewModel baseRechargeViewModel = this.LIZ;
            baseRechargeViewModel.CQ2();
            LiveWalletLoadingIndicatorSetting liveWalletLoadingIndicatorSetting = LiveWalletLoadingIndicatorSetting.INSTANCE;
            if (liveWalletLoadingIndicatorSetting.getValue()) {
                baseRechargeViewModel.PQ2(2131855633, 0L);
            } else {
                baseRechargeViewModel.PQ2(0, 0L);
            }
            C1796560wqs c1796560wqs = c1797010wrb.LIZJ;
            String str = c1796560wqs.LIZIZ;
            String str2 = "";
            if (str == null) {
                str = "";
            }
            String str3 = c1796560wqs.LIZ;
            if (str3 != null) {
                str2 = str3;
            }
            int i2 = c1796560wqs.LIZJ;
            if (str.length() > 0 && str2.length() > 0) {
                C1797100wrk.LIZIZ.LIZLLL(str2, str, i2, baseRechargeViewModel.LLJJIJI, false);
            } else {
                if (!liveWalletLoadingIndicatorSetting.getValue()) {
                    return;
                }
                baseRechargeViewModel.CQ2();
            }
        }

        @Override // X.InterfaceC1796910wrR
        public final void LJIIL(int i, C1797200wru c1797200wru) {
            BaseRechargeViewModel baseRechargeViewModel = this.LIZ;
            baseRechargeViewModel.CQ2();
            baseRechargeViewModel.RQ2(c1797200wru.getOrderId());
            C1797250wrz c1797250wrzLIZ = C1797210wrv.LIZ(c1797200wru);
            c1797250wrzLIZ.LJII = baseRechargeViewModel.LLJJI;
            InterfaceC1803460x20 interfaceC1803460x20 = baseRechargeViewModel.LLILLJJLI;
            if (interfaceC1803460x20 != null) {
                interfaceC1803460x20.zz(i, c1797200wru.getErrorCode(), c1797200wru.getDetailCode(), c1797200wru.getMappedErrorCode(), c1797200wru.getMappedErrorMessage(), c1797250wrzLIZ, true);
            }
        }
    };

    public boolean DQ2() {
        return false;
    }

    public void LQ2(List<NoticesResult.Notice> list) {
    }

    public long MQ2() {
        return 0L;
    }

    public void wQ2(Integer num, Integer num2, Integer num3, List<String> list) {
    }

    public static boolean EQ2() {
        GetABSStatusResponse.ABSData aBSData = C1797220wrw.LL;
        GetABSStatusResponse.ABSData aBSData2 = C1797220wrw.LL;
        if (aBSData2 != null) {
            return aBSData2.isAbsOn;
        }
        return false;
    }

    public final void CQ2() {
        if (LiveWalletLoadingIndicatorSetting.INSTANCE.getValue()) {
            this.LLJJIJIIJIL.LIZJ(C1803910x2j.LIZ);
            return;
        }
        InterfaceC1803460x20 interfaceC1803460x20 = this.LLILLJJLI;
        if (interfaceC1803460x20 != null) {
            interfaceC1803460x20.L0();
        }
    }

    public final boolean FQ2() {
        C1804840x4E c1804840x4E = this.LLIZ;
        return C500260Jjc.LJJJI(c1804840x4E != null ? Boolean.valueOf(c1804840x4E.LJIJ()) : null);
    }

    public final void NQ2() {
        if (((IWalletService) C1161920gLG.LIZJ(IWalletService.class)).isValidForRechargeV3()) {
            C1548820qPI.LIZLLL("cus_panel_recharge_click", this);
            C1548820qPI.LIZLLL("recharge_cashier_cancel", this);
            C1548820qPI.LIZLLL("live_js_event_fe_recharge_finish", this);
            if (C1797270ws1.LIZJ().LJIIIIZZ()) {
                C1548820qPI.LIZLLL("cancel_recharge_v3_retention_popup_switch_tab", this);
                C1548820qPI.LIZLLL("cancel_recharge_v3_retention_popup_cancel", this);
                C1548820qPI.LIZLLL("cancel_recharge_v3_popup_continue_iap_charge_res", this);
            }
        }
    }

    public final long No0() {
        return ((IWalletService) C1161920gLG.LIZJ(IWalletService.class)).walletCenter().No0();
    }

    public void onDestroy() {
        C11JF c11jf;
        C11JF c11jf2 = this.LLJJ;
        if (c11jf2 != null && !c11jf2.isDisposed() && (c11jf = this.LLJJ) != null) {
            c11jf.dispose();
        }
        this.LLILLJJLI = null;
        ((C11NJ) this.LL.LIZ.getValue()).dispose();
        C1548820qPI.LJIIIIZZ("live_js_event_fe_update_notification_and_abs", this);
        if (((IWalletService) C1161920gLG.LIZJ(IWalletService.class)).isValidForRechargeV3()) {
            C1548820qPI.LJIIIIZZ("cus_panel_recharge_click", this);
            C1548820qPI.LJIIIIZZ("recharge_cashier_cancel", this);
            C1548820qPI.LJIIIIZZ("cancel_recharge_v3_retention_popup_cancel", this);
            C1548820qPI.LJIIIIZZ("cancel_recharge_v3_retention_popup_switch_tab", this);
            C1548820qPI.LJIIIIZZ("cancel_recharge_v3_popup_continue_iap_charge_res", this);
            C1548820qPI.LJIIIIZZ("live_js_event_fe_recharge_finish", this);
        }
    }

    public InterfaceC1797050wrf yQ2() {
        return this.LLILZLL;
    }

    public final void GQ2(String str) {
        C11JF c11jf;
        boolean zLJI = MethodIDManager.LJI(202147);
        C11JF c11jf2 = this.LLJJ;
        if (c11jf2 != null && !c11jf2.isDisposed() && (c11jf = this.LLJJ) != null) {
            c11jf.dispose();
        }
        C480460Ism.LIZ().getClass();
        this.LLJJ = (C11JF) ((IapApi) C480460Ism.LIZLLL(IapApi.class)).getNotifications(str, C1797270ws1.LIZIZ().LIZLLL(), ((InterfaceC1791930wjP) C1161920gLG.LIZJ(IapService.class)).getBillingCountryCode()).LJIILIIL(new C0UO0()).LJJLL(new AfS196S0100000_27(this, 14), new C09JN() { // from class: X.0gG9
            @Override // X.C09JN
            public final void accept(Object obj) {
                C1C7U.LIZ("BaseRechargeViewModel@dbdb.loadNotification$2");
                Throwable th = (Throwable) obj;
                if (th instanceof C501520Jle) {
                    ((C501520Jle) th).getErrorCode();
                }
                C1C7U.LIZIZ("BaseRechargeViewModel@dbdb.loadNotification$2");
            }
        });
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }

    public void JQ2(C1797010wrb c1797010wrb) {
        CQ2();
        Diamond diamond = this.LLJILJIL;
        if (diamond != null) {
            C784440Upu.LIZ().LIZIZ(vQ2(diamond, c1797010wrb.LIZLLL.LIZJ));
            C1796880wrO c1796880wrO = c1797010wrb.LIZLLL;
            C1796560wqs c1796560wqs = new C1796560wqs(c1796880wrO.LIZJ, c1796880wrO.LIZ, c1796880wrO.LIZIZ, null, c1797010wrb.LJIIIIZZ, 8);
            InterfaceC1803460x20 interfaceC1803460x20 = this.LLILLJJLI;
            if (interfaceC1803460x20 != null) {
                interfaceC1803460x20.TI(diamond, c1796560wqs, true);
            }
            if (C1797030wrd.LIZIZ) {
                C1803540x28.LJII(null, null, null);
            }
        }
    }

    public void OQ2(C1804840x4E c1804840x4E) {
        this.LLIZ = c1804840x4E;
    }

    public final void RQ2(String str) {
        String str2;
        String str3;
        DiamondBuyRequestParams diamondBuyRequestParams;
        C1797350ws9 c1797350ws9LIZJ = C1797270ws1.LJ().LIZJ(str);
        String str4 = "";
        try {
            Gson gson = C19748512Ol.LIZIZ;
            if (c1797350ws9LIZJ != null && (diamondBuyRequestParams = c1797350ws9LIZJ.LIZ) != null) {
                str3 = diamondBuyRequestParams.voucherTokenList;
            } else {
                str3 = null;
            }
            str2 = (String) ((List) gson.LJIIIIZZ(str3, new TypeToken<List<? extends String>>() { // from class: X.0x1o
            }.getType())).get(0);
            if (str2 == null) {
                return;
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            str2 = "";
        }
        if (str2.length() != 0) {
            C480460Ism.LIZ().getClass();
            IRechargeApi iRechargeApi = (IRechargeApi) C480460Ism.LIZLLL(IRechargeApi.class);
            UnlockVoucherParams unlockVoucherParams = new UnlockVoucherParams();
            if (str2 != null) {
                str4 = str2;
            }
            unlockVoucherParams.voucherToken = str4;
            unlockVoucherParams.paymentOrderId = str;
            iRechargeApi.unlockVoucher(unlockVoucherParams).LJIILIIL(new C0UO0()).LJJLL(new AfS196S0100000_27(this, 15), new AfS196S0100000_27(this, 16));
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // X.InterfaceC1141530foN
    public final void mh2(C262100zr c262100zr) {
        InterfaceC1107590evd interfaceC1107590evd;
        Diamond diamond;
        InterfaceC1107590evd interfaceC1107590evd2;
        InterfaceC1107590evd interfaceC1107590evd3;
        String str = c262100zr.LIZ;
        switch (str.hashCode()) {
            case -2035413805:
                if (str.equals("live_js_event_fe_recharge_finish") && (interfaceC1107590evd = c262100zr.LIZIZ) != null && (diamond = this.LLJILJIL) != null && Intrinsics.LJFF(C1871910yoP.LJFF(interfaceC1107590evd, "panel_channel", ""), "tiktok")) {
                    boolean z = true;
                    if (C1871910yoP.LIZLLL(interfaceC1107590evd, "is_success", 0) != 1) {
                        z = false;
                    }
                    int iLIZLLL = C1871910yoP.LIZLLL(interfaceC1107590evd, "coin_number", 0);
                    String strLJFF = C1871910yoP.LJFF(interfaceC1107590evd, "order_id", "");
                    int iLIZLLL2 = C1871910yoP.LIZLLL(interfaceC1107590evd, "error_code", 0);
                    String strLJFF2 = C1871910yoP.LJFF(interfaceC1107590evd, "error_msg", "");
                    if (z) {
                        C1796560wqs c1796560wqs = new C1796560wqs(iLIZLLL, diamond.iapId, strLJFF, String.valueOf(UserService.getInstance().user().getCurrentUserId()), false, 16);
                        InterfaceC1803460x20 interfaceC1803460x20 = this.LLILLJJLI;
                        if (interfaceC1803460x20 != null) {
                            interfaceC1803460x20.TI(diamond, c1796560wqs, false);
                        }
                    } else {
                        C1797200wru c1797200wru = new C1797200wru(2, -206, iLIZLLL2, String.valueOf(iLIZLLL2), strLJFF2, "", new Exception(strLJFF2), null, null, 0, 0, null, 3968, null);
                        C1797250wrz c1797250wrzLIZ = C1797210wrv.LIZ(c1797200wru);
                        InterfaceC1803460x20 interfaceC1803460x202 = this.LLILLJJLI;
                        if (interfaceC1803460x202 != null) {
                            interfaceC1803460x202.zz(2, c1797200wru.getErrorCode(), c1797200wru.getDetailCode(), c1797200wru.getMappedErrorCode(), c1797200wru.getMappedErrorMessage(), c1797250wrzLIZ, false);
                        }
                    }
                    break;
                }
                break;
            case -1783585591:
                if (str.equals("cus_panel_recharge_click") && (interfaceC1107590evd2 = c262100zr.LIZIZ) != null) {
                    int iLIZLLL3 = C1871910yoP.LIZLLL(interfaceC1107590evd2, "custom_coins_count", 0);
                    int iLIZLLL4 = C1871910yoP.LIZLLL(interfaceC1107590evd2, "custom_local_amount", 0);
                    String strLJFF3 = C1871910yoP.LJFF(interfaceC1107590evd2, "selected_voucher_token_list", "");
                    int iLIZLLL5 = C1871910yoP.LIZLLL(interfaceC1107590evd2, "input_option", 0);
                    List<String> list = C13BV.INSTANCE;
                    if (C500260Jjc.LJJIIZ(strLJFF3)) {
                        list = (List) GsonProtectorUtils.fromJson(C19748512Ol.LIZIZ, strLJFF3, new TypeToken<List<? extends String>>() { // from class: X.0x21
                        }.getType());
                    }
                    wQ2(Integer.valueOf(iLIZLLL3), Integer.valueOf(iLIZLLL4), Integer.valueOf(iLIZLLL5), list);
                    break;
                }
                break;
            case -1205386830:
                if (str.equals("cancel_recharge_v3_popup_continue_iap_charge_res") && (interfaceC1107590evd3 = c262100zr.LIZIZ) != null) {
                    try {
                        this.LLJIJIL.setValue(Boolean.valueOf(Intrinsics.LJFF(((Map) interfaceC1107590evd3.LIZ().get("charge_response")).get("code"), 0)));
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                        C1AF0.LIZIZ();
                        return;
                    }
                    break;
                }
                break;
            case -326034412:
                if (str.equals("live_js_event_fe_update_notification_and_abs")) {
                    GQ2("recharge_panel");
                    C1797270ws1.LIZJ().LJIIJJI(null);
                }
                break;
            case -11681459:
                if (str.equals("cancel_recharge_v3_retention_popup_switch_tab")) {
                    this.LLJ.setValue(Unit.LIZ);
                    C20441214yg.LJIIIZ("BaseRechargeViewModel", "Receive JS: cancel_recharge_retention_popup_switch_tab");
                }
                break;
            case 1088494909:
                if (str.equals("cancel_recharge_v3_retention_popup_cancel")) {
                    this.LLJI.setValue(Unit.LIZ);
                    C20441214yg.LJIIIZ("BaseRechargeViewModel", "Receive JS: cancel_recharge_retention_popup_switch_tab");
                }
                break;
            case 1157995534:
                if (str.equals("recharge_cashier_cancel")) {
                    if (LiveWalletLoadingIndicatorSetting.INSTANCE.getValue()) {
                        CQ2();
                    }
                    this.LLIZLLLIL.setValue(Unit.LIZ);
                }
                break;
        }
    }

    public static Throwable IQ2(BaseRechargeViewModel baseRechargeViewModel, Throwable th) {
        InterfaceC1803460x20 interfaceC1803460x20 = baseRechargeViewModel.LLILLJJLI;
        if (interfaceC1803460x20 != null) {
            interfaceC1803460x20.LJIIL();
        }
        if (th instanceof C0VYA) {
            C0VYA c0vya = (C0VYA) th;
            if (!c0vya.getExceptions().isEmpty()) {
                Throwable cause = ((Throwable) ListProtector.get(c0vya.getExceptions(), 0)).getCause();
                if (cause == null) {
                    th = C1803480x22.LIZ(th);
                } else {
                    th = cause;
                }
            }
        }
        baseRechargeViewModel.KQ2(th, null, ((IWalletService) C1161920gLG.LIZJ(IWalletService.class)).walletCenter().vx1());
        return th;
    }

    public final void PQ2(int i, long j) {
        String strLJIJI;
        C1803940x2m c1803940x2m;
        if (LiveWalletLoadingIndicatorSetting.INSTANCE.getValue()) {
            if (i == 0) {
                strLJIJI = "Empty";
            } else {
                strLJIJI = C497740JfY.LJIJI(i);
            }
            C20441214yg.LJIIIZ("ShowProgress", strLJIJI);
            C2252331DDr c2252331DDr = this.LLJJIJIIJIL;
            if (i == 0) {
                c1803940x2m = null;
            } else {
                c1803940x2m = new C1803940x2m(i, new Object[0]);
            }
            c2252331DDr.LIZJ(new C1803930x2l(c1803940x2m, j));
            return;
        }
        InterfaceC1803460x20 interfaceC1803460x20 = this.LLILLJJLI;
        if (interfaceC1803460x20 == null) {
            return;
        }
        interfaceC1803460x20.cE(i, j);
    }

    public final void QQ2(final Diamond diamond, final int i) {
        final long jNo0 = No0();
        final long jUptimeMillis = SystemClock.uptimeMillis();
        ((IWalletService) C1161920gLG.LIZJ(IWalletService.class)).walletCenter().X41(EnumC1805570x5P.RECHARGE_SUCCESS);
        ((IWalletService) C1161920gLG.LIZJ(IWalletService.class)).walletCenter().aF2(EnumC1805800x5m.WALLET, EnumC1805420x5A.CHARGE_SUCCESS, new InterfaceC1803980x2q() { // from class: X.0x1Q
            @Override // X.InterfaceC1803980x2q
            public final void LIZ(long j) {
                long j2;
                HashMap map = new HashMap();
                long j3 = diamond.count * i;
                long j4 = jNo0;
                if (j3 + j4 == j) {
                    C1796590wqv.LIZ("ttlive_update_wallet_info_order", map);
                } else {
                    map.put("originCoins", Long.valueOf(j4));
                    map.put("preCoins", Integer.valueOf(diamond.count));
                    map.put("error_msg", "UPDATE_WALLET_INFO_NOT_MATCH_CODE");
                    C1796590wqv.LIZJ("ttlive_update_wallet_info_order", 62, -1, "update wallet info fail", map);
                }
                WalletStruct walletStructTF1 = ((IWalletService) C1161920gLG.LIZJ(IWalletService.class)).walletCenter().TF1();
                if (walletStructTF1 != null) {
                    j2 = walletStructTF1.coinsBalanceVersionV2;
                } else {
                    j2 = 0;
                }
                C1796530wqp.LJIIJJI(SystemClock.uptimeMillis() - jUptimeMillis, jNo0, j, this.LLJJIII, j2, null, null, true);
            }

            @Override // X.InterfaceC1803980x2q
            public final void LIZIZ(Throwable th) {
                int errorCode;
                if (th instanceof C501520Jle) {
                    errorCode = ((C501520Jle) th).getErrorCode();
                } else {
                    errorCode = 61;
                }
                C1796590wqv.LIZIZ(errorCode, "ttlive_update_wallet_info_order", "update wallet info fail");
                C1796530wqp.LJIIJJI(SystemClock.uptimeMillis() - jUptimeMillis, 0L, 0L, this.LLJJIII, 0L, th.toString(), null, false);
            }
        });
    }

    public final C1124340fMe vQ2(Diamond diamond, int i) {
        C1124340fMe c1124340fMe = new C1124340fMe(this.LLJILJILJ + (diamond.count * i), false, DQ2(), MQ2(), false, false, null, 0, 992);
        this.LLJILJILJ = 0;
        return c1124340fMe;
    }

    public void KQ2(Throwable th, InterfaceC1804390x3V interfaceC1804390x3V, IapListResult.ListResultExtra listResultExtra) {
        if (th instanceof C1797200wru) {
            InterfaceC1803460x20 interfaceC1803460x20 = this.LLILLJJLI;
            if (interfaceC1803460x20 != null) {
                C1797200wru c1797200wru = (C1797200wru) th;
                interfaceC1803460x20.ey(c1797200wru.getErrorCode(), c1797200wru.getDetailCode(), c1797200wru.getInternalCode(), c1797200wru.getMappedErrorCode(), c1797200wru.getMappedErrorMessage(), c1797200wru.getException(), interfaceC1804390x3V, listResultExtra);
                return;
            }
            return;
        }
        if (th instanceof Exception) {
            InterfaceC1803460x20 interfaceC1803460x202 = this.LLILLJJLI;
            if (interfaceC1803460x202 == null) {
                return;
            }
            interfaceC1803460x202.ey(0, 0, 0, CardStruct.IStatusCode.DEFAULT, String.valueOf(th.getMessage()), (Exception) th, interfaceC1804390x3V, listResultExtra);
            return;
        }
        InterfaceC1803460x20 interfaceC1803460x203 = this.LLILLJJLI;
        if (interfaceC1803460x203 == null) {
            return;
        }
        String strValueOf = String.valueOf(th.getMessage());
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("unknow ");
        sbLIZ.append(th.getMessage());
        interfaceC1803460x203.ey(0, 0, 0, CardStruct.IStatusCode.DEFAULT, strValueOf, new C1149180g0i(C2188811AlT.LIZIZ(sbLIZ)), interfaceC1804390x3V, listResultExtra);
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [X.0wx2] */
    public BaseRechargeViewModel(InterfaceC1803460x20 interfaceC1803460x20, long j, long j2, int i) {
        this.LLILLJJLI = interfaceC1803460x20;
        this.LLILLL = j;
        this.LLILZ = j2;
        this.LLILZIL = i;
        C2252331DDr c2252331DDrLIZIZ = C09IR.LIZIZ(1, 0, null, 6);
        this.LLJJIJIIJIL = c2252331DDrLIZIZ;
        this.LLJJIJIL = c2252331DDrLIZIZ;
    }

    public final void HQ2(RecommendStrategyParam recommendStrategyParam, final EnumC1803160x1W enumC1803160x1W, long j, int i) {
        if (C1803550x29.LIZ) {
            C1803550x29.LIZLLL = C158B.LIZ();
        }
        InterfaceC1803460x20 interfaceC1803460x20 = this.LLILLJJLI;
        if (interfaceC1803460x20 != null) {
            interfaceC1803460x20.LJ();
        }
        final HashMap map = new HashMap();
        map.put("charge_source", Integer.valueOf(this.LLILZIL));
        final long jCurrentTimeMillis = System.currentTimeMillis();
        C1807890x99 c1807890x99 = new C1807890x99();
        Map<Integer, Integer> map2 = C07LT.LIZ;
        final int iLIZ = C07LT.LIZ(this.LLILZIL);
        C1126800fQc.LIZ.py();
        final int iLIZJ = C1134860fdc.LIZ.LIZJ(iLIZ, i);
        ((C11NJ) this.LL.LIZ.getValue()).LIZ(C1797270ws1.LIZJ().LJ(iLIZ, this.LLILLL, this.LLILZ, recommendStrategyParam, enumC1803160x1W, iLIZJ, c1807890x99, false).LJLJI(j, TimeUnit.SECONDS).LJIILIIL(new C0UO0()).LJJIJIL(new AfS196S0100000_27(c1807890x99, 3)).LJJIIZI(new AfS196S0100000_27(c1807890x99, 4)).LJJLIIIIJ(new InterfaceC1487280oo2() { // from class: X.0x2d
            public final /* synthetic */ boolean LL = true;

            @Override // X.InterfaceC1487280oo2
            public final Object apply(Object obj) throws Throwable {
                C1804840x4E c1804840x4ELJIILIIL;
                Throwable th = (Throwable) obj;
                if (this.LL && (c1804840x4ELJIILIIL = C1797270ws1.LIZJ().LJIILIIL(iLIZ, EnumC587980N4i.STRATEGY_TASK, String.valueOf(iLIZJ))) != null) {
                    map.put("cost", Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis));
                    map.put("error_msg", th.toString());
                    map.put("use_fallback_cache", 1);
                    map.put("cache_policy", enumC1803160x1W.toString());
                    map.put("hit_cache", 1);
                    InterfaceC1804040x2w.LIZ.getClass();
                    C1804060x2y.LIZIZ.getValue().LIZIZ(InterfaceC1806350x6f.class, new C1803860x2e());
                    C1803440x1y.LIZ("ttlive_wallet_recharge_panel_use_fallback_cache", map);
                    C1796530wqp.LJIIJ(map);
                    C1803550x29.LJIJI = true;
                    return c1804840x4ELJIILIIL;
                }
                throw th;
            }
        }).LJJLL(new AfS1S0400100_27(jCurrentTimeMillis, enumC1803160x1W, this, c1807890x99, map, 0), new AfS1S0400100_27(jCurrentTimeMillis, enumC1803160x1W, this, c1807890x99, map, 1)));
    }

    public final void xQ2(C1803450x1z c1803450x1z, C1776960wLG c1776960wLG, C1797120wrm c1797120wrm, String str) {
        long j;
        int iIntValue;
        Diamond diamond = c1803450x1z.LIZIZ;
        this.LLJILJIL = diamond;
        if (c1797120wrm != null && diamond != null) {
            Integer num = c1797120wrm.LIZ;
            if (num != null) {
                iIntValue = num.intValue();
            } else {
                iIntValue = 0;
            }
            diamond.LJIIIIZZ = iIntValue;
        }
        WalletStruct walletStructTF1 = ((IWalletService) C1161920gLG.LIZJ(IWalletService.class)).walletCenter().TF1();
        if (walletStructTF1 != null) {
            j = walletStructTF1.coinsBalanceVersionV2;
        } else {
            j = 0;
        }
        this.LLJJIII = j;
        PQ2(2131851961, 0L);
        RechargeRequestParams rechargeRequestParamsBQ2 = BQ2(c1803450x1z.LIZIZ, c1803450x1z.LIZJ, c1803450x1z.LIZLLL, c1803450x1z.LJ, c1803450x1z.LJFF, c1803450x1z.LJI, c1803450x1z.LJII, c1803450x1z.LJIIIIZZ, c1803450x1z.LJIIIZ);
        this.LLJJI = rechargeRequestParamsBQ2;
        C1803510x25.LIZJ.LIZIZ();
        C1797100wrk.LIZIZ.LIZJ(c1803450x1z.LIZ, c1803450x1z.LIZIZ, this.LLJJIJI, Long.valueOf(this.LLILLL), rechargeRequestParamsBQ2, c1776960wLG, c1797120wrm, str, c1803450x1z.LJIIJ, new AwS571S0100000_27(this, 129));
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x008c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C1803370x1r zQ2(X.EnumC1802790x0v r26, long r27, com.bytedance.android.live.wallet.model.recharge.RechargeRequestParams r29, X.C1803830x2b r30, long r31, boolean r33) {
        /*
            r25 = this;
            r3 = 1
            r15 = r33
            r2 = r30
            r0 = r29
            r11 = r27
            r20 = r31
            r8 = r26
            if (r2 == 0) goto L94
            boolean r1 = r2.LJIIJ
            if (r1 != r3) goto L94
            java.lang.String r5 = r2.LJI
            int r1 = r5.length()
            if (r1 != 0) goto L3f
            java.lang.String r4 = r2.LIZLLL
            int r3 = r4.hashCode()
            r1 = -982480788(0xffffffffc570886c, float:-3848.5264)
            if (r3 == r1) goto L7c
            r1 = 1206987122(0x47f12972, float:123474.89)
            if (r3 == r1) goto L6c
            r1 = 1913428154(0x720c98ba, float:2.7848023E30)
            if (r3 != r1) goto L8c
            java.lang.String r1 = "redpacket_new"
            boolean r1 = r4.equals(r1)
            if (r1 == 0) goto L8c
            r1 = 2131841634(0x7f115262, float:1.9316582E38)
            java.lang.String r5 = X.C497740JfY.LJIJI(r1)
        L3f:
            long r3 = r2.LJII
            long r6 = r25.No0()
            long r3 = r3 - r6
            com.bytedance.android.livesdk.wallet.Diamond r1 = r0.diamond
            int r13 = r1.count
            java.lang.String r14 = r1.price
            long r1 = r2.LJFF
            int r6 = (int) r1
            int r1 = (int) r3
            X.0x1r r7 = new X.0x1r
            java.lang.String r9 = "NormalRechargePanel"
            java.lang.String r10 = "consumption"
            java.lang.Integer r16 = java.lang.Integer.valueOf(r6)
            java.lang.Integer r18 = java.lang.Integer.valueOf(r1)
            r19 = 0
            r24 = 9216(0x2400, float:1.2914E-41)
            r22 = r0
            r23 = r19
            r17 = r5
            r7.<init>(r8, r9, r10, r11, r13, r14, r15, r16, r17, r18, r19, r20, r22, r23, r24)
            return r7
        L6c:
            java.lang.String r1 = "star_comment"
            boolean r1 = r4.equals(r1)
            if (r1 == 0) goto L8c
            r1 = 2131844127(0x7f115c1f, float:1.9321638E38)
            java.lang.String r5 = X.C497740JfY.LJIJI(r1)
            goto L3f
        L7c:
            java.lang.String r1 = "portal"
            boolean r1 = r4.equals(r1)
            if (r1 == 0) goto L8c
            r1 = 2131841633(0x7f115261, float:1.931658E38)
            java.lang.String r5 = X.C497740JfY.LJIJI(r1)
            goto L3f
        L8c:
            r1 = 2131841632(0x7f115260, float:1.9316577E38)
            java.lang.String r5 = X.C497740JfY.LJIJI(r1)
            goto L3f
        L94:
            com.bytedance.android.livesdk.livesetting.wallet.WalletRegionTerms r1 = com.bytedance.android.livesdk.livesetting.wallet.WalletRegionTerms.INSTANCE
            boolean r1 = r1.isEU()
            if (r1 == 0) goto Lba
            java.lang.String r10 = "standard"
        L9e:
            com.bytedance.android.livesdk.wallet.Diamond r1 = r0.diamond
            int r13 = r1.count
            java.lang.String r14 = r1.price
            X.0x1r r7 = new X.0x1r
            java.lang.String r9 = "NormalRechargePanel"
            r16 = 0
            r24 = 10112(0x2780, float:1.417E-41)
            r17 = r16
            r18 = r16
            r19 = r16
            r22 = r0
            r23 = r16
            r7.<init>(r8, r9, r10, r11, r13, r14, r15, r16, r17, r18, r19, r20, r22, r23, r24)
            return r7
        Lba:
            java.lang.String r10 = "general"
            goto L9e
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.walletnew.BaseRechargeViewModel.zQ2(X.0x0v, long, com.bytedance.android.live.wallet.model.recharge.RechargeRequestParams, X.0x2b, long, boolean):X.0x1r");
    }

    public final RechargeRequestParams BQ2(Diamond diamond, int i, List<String> list, String str, String str2, Boolean bool, int i2, Integer num, Integer num2) {
        IapListResult.ListResultExtra listResultExtraLJII;
        IapListResult.IapCustomData iapCustomData;
        String str3;
        IapListResult.ListResultExtra listResultExtraLJII2;
        IapListResult.IapCustomData iapCustomData2;
        IapListResult.ListResultExtra listResultExtraLJII3;
        IapListResult.IapCustomData iapCustomData3;
        String str4;
        IapListResult.ListResultExtra listResultExtraLJII4;
        IapListResult.IapCustomData iapCustomData4;
        IapListResult.ListResultExtra listResultExtraLJII5;
        IapListResult.IapCustomData iapCustomData5;
        IRevenueStrategyService iRevenueStrategyService = C1126800fQc.LIZ;
        iRevenueStrategyService.py();
        int iLIZIZ = C1134860fdc.LIZ.LIZIZ(this.LLILZIL, i2);
        if (iLIZIZ != 0 && iRevenueStrategyService.KE0().LJIIJJI(103)) {
            C01GW<InterfaceC1133710fbl> c01gw = C1805240x4s.LJIIJ;
            this.LLJILJILJ = C1804990x4T.LIZ(diamond.count);
        }
        RechargeRequestParams rechargeRequestParams = new RechargeRequestParams();
        rechargeRequestParams.chargeSource = i;
        rechargeRequestParams.firstRecharge = bool;
        rechargeRequestParams.voucherList = list;
        rechargeRequestParams.chargeReason = str;
        rechargeRequestParams.requestPage = str2;
        rechargeRequestParams.campaignType = iLIZIZ;
        rechargeRequestParams.vaultGiftId = num;
        rechargeRequestParams.subSource = num2;
        C1804840x4E c1804840x4E = this.LLIZ;
        int i3 = 0;
        if (c1804840x4E != null && (listResultExtraLJII = c1804840x4E.LJII()) != null && (iapCustomData = listResultExtraLJII.iapCustomData) != null && iapCustomData.enableFailureCustomEntranceGuide) {
            C1804840x4E c1804840x4E2 = this.LLIZ;
            String str5 = null;
            if (c1804840x4E2 != null && (listResultExtraLJII5 = c1804840x4E2.LJII()) != null && (iapCustomData5 = listResultExtraLJII5.iapCustomData) != null) {
                str5 = iapCustomData5.failurePopupUrl;
            }
            String str6 = "";
            if (str5 == null) {
                str5 = "";
            }
            C1804840x4E c1804840x4E3 = this.LLIZ;
            if (c1804840x4E3 == null || (listResultExtraLJII4 = c1804840x4E3.LJII()) == null || (iapCustomData4 = listResultExtraLJII4.iapCustomData) == null || (str3 = iapCustomData4.failureTryNowUrl) == null) {
                str3 = "";
            }
            C1804840x4E c1804840x4E4 = this.LLIZ;
            if (c1804840x4E4 != null && (listResultExtraLJII3 = c1804840x4E4.LJII()) != null && (iapCustomData3 = listResultExtraLJII3.iapCustomData) != null && (str4 = iapCustomData3.insufficientTryNowUrl) != null) {
                str6 = str4;
            }
            C1804840x4E c1804840x4E5 = this.LLIZ;
            if (c1804840x4E5 != null && (listResultExtraLJII2 = c1804840x4E5.LJII()) != null && (iapCustomData2 = listResultExtraLJII2.iapCustomData) != null) {
                i3 = iapCustomData2.discountRate;
            }
            rechargeRequestParams.LIZ = new C1802730x0p(this.LLILZ, this.LLILLL, str5, i3, str3, str6);
        }
        rechargeRequestParams.LIZ(diamond);
        return rechargeRequestParams;
    }
}
