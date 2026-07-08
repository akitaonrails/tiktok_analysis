package X;

import Y.AfS196S0100000_27;
import android.app.Activity;
import android.content.Context;
import android.os.SystemClock;
import com.bytedance.android.live.iap.service.IapService;
import com.bytedance.android.live.liveinteract.match.service.ILiveMatchService;
import com.bytedance.android.live.wallet.IWalletCenter;
import com.bytedance.android.live.wallet.IWalletService;
import com.bytedance.android.live.wallet.model.WalletStruct;
import com.bytedance.android.live.wallet.model.recharge.RechargeRequestParams;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdk.wallet.Diamond;
import com.bytedance.android.livesdkapi.host.ILiveHostCrossRoomEventHelper;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AFwS216S0000000_27;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0x1H, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1803010x1H extends AbstractC1802990x1F implements InterfaceC1141530foN {
    public CompletionBlock<InterfaceC1802980x1E> LLILLL;
    public InterfaceC1803000x1G LLILZ;
    public long LLILZIL;
    public long LLILZLL;
    public Diamond LLIZ;
    public RechargeRequestParams LLJIJIL;
    public final C01GW LLIZLLLIL = C452501pT.LIZIZ(AFwS216S0000000_27.get$arr$(293));
    public final C01GW LLJ = C452501pT.LIZIZ(AFwS216S0000000_27.get$arr$(294));
    public final C1803030x1J LLJI = new InterfaceC1797050wrf() { // from class: X.0x1J
        @Override // X.InterfaceC1797050wrf
        public final void LIZ(HashMap map) {
            String str;
            String str2;
            String billingCountryCode;
            String strLIZ;
            HashMap map2 = new HashMap();
            if (map != null) {
                map2.putAll(map);
                this.LIZ.LIZJ(map);
            }
            C1803010x1H c1803010x1H = this.LIZ;
            c1803010x1H.getClass();
            HashMap<String, String> map3 = new HashMap<>();
            map3.put("charge_style", "window");
            if (C497740JfY.LJIL()) {
                str = "portrait";
            } else {
                str = "landscape";
            }
            map3.put("room_orientation", str);
            if (C500260Jjc.LJIJ(DataChannelGlobal.LLILZ)) {
                str2 = "1";
            } else {
                str2 = CardStruct.IStatusCode.DEFAULT;
            }
            map3.put("is_anchor", str2);
            map3.put("request_page", "live_detail");
            map3.put("is_multi", ((ILiveMatchService) C1161920gLG.LIZJ(ILiveMatchService.class)).sy0());
            map3.put("sub_match_type", ((ILiveMatchService) C1161920gLG.LIZJ(ILiveMatchService.class)).my());
            InterfaceC1791930wjP interfaceC1791930wjP = (InterfaceC1791930wjP) C1161920gLG.LIZJ(IapService.class);
            if (interfaceC1791930wjP == null || (billingCountryCode = interfaceC1791930wjP.getBillingCountryCode()) == null) {
                billingCountryCode = "";
            }
            map3.put("app_store_front", billingCountryCode);
            Diamond diamond = c1803010x1H.LLIZ;
            if (diamond != null) {
                strLIZ = C1804850x4F.LIZ(diamond);
            } else {
                strLIZ = null;
            }
            map3.put("currency", String.valueOf(strLIZ));
            c1803010x1H.LIZJ(map3);
            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_recharge_pay");
            c474500IjALIZ.LJIL();
            c474500IjALIZ.LJFF(C0IXW.LIZJ("user_live_duration"));
            c474500IjALIZ.LJJIIZI(map2);
            c474500IjALIZ.LJJIIZI(map3);
            c474500IjALIZ.LIZ();
        }
    };
    public final C1802970x1D LLJILJIL = new InterfaceC1796910wrR() { // from class: X.0x1D
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
        public final void LJIIJ(boolean z) {
        }

        @Override // X.InterfaceC1796910wrR
        public final void LJIIL(int i, C1797200wru c1797200wru) {
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
            return this.LIZ.LLJI;
        }

        @Override // X.InterfaceC1796910wrR
        public final void LJII(C1796960wrW c1796960wrW) {
            C1796950wrV.LIZ(this, c1796960wrW);
        }

        @Override // X.InterfaceC1796910wrR
        public final void LJIIJJI(C1777440wM2 c1777440wM2) {
            Context context;
            int iIntValue;
            Number campaignType;
            InterfaceC634840OvC interfaceC634840OvC = this.LIZ.IBridgeSdkContext;
            Long lValueOf = null;
            if (interfaceC634840OvC != null) {
                context = interfaceC634840OvC.getContext();
            } else {
                context = null;
            }
            IWalletService iWalletService = (IWalletService) C1161920gLG.LIZJ(IWalletService.class);
            C1803010x1H c1803010x1H = this.LIZ;
            Diamond diamond = c1803010x1H.LLIZ;
            InterfaceC1803000x1G interfaceC1803000x1G = c1803010x1H.LLILZ;
            if (interfaceC1803000x1G != null && (campaignType = interfaceC1803000x1G.getCampaignType()) != null) {
                iIntValue = campaignType.intValue();
            } else {
                iIntValue = 0;
            }
            String str = c1777440wM2.LIZJ;
            String str2 = c1777440wM2.LIZLLL;
            int i = c1777440wM2.LIZIZ;
            C1776960wLG c1776960wLG = c1777440wM2.LJFF;
            if (c1776960wLG != null) {
                lValueOf = Long.valueOf(c1776960wLG.LIZIZ);
            }
            iWalletService.openCashierV3(context, diamond, iIntValue, str, str2, i, lValueOf, ((IWalletService) C1161920gLG.LIZJ(IWalletService.class)).isSupportPreloadReuseCashier(c1777440wM2.LIZIZ, true), true, c1777440wM2.LJ, null);
        }

        @Override // X.InterfaceC1796910wrR
        public final void LJIILIIL(C1797010wrb c1797010wrb) {
            Activity activityLIZLLL;
            if (c1797010wrb.LJIIIIZZ) {
                InterfaceC634840OvC interfaceC634840OvC = this.LIZ.IBridgeSdkContext;
                if (interfaceC634840OvC != null) {
                    activityLIZLLL = interfaceC634840OvC.LIZLLL();
                } else {
                    activityLIZLLL = null;
                }
                C766270U4b.LIZIZ(activityLIZLLL, C497740JfY.LJIJI(2131855016), 3500L);
            }
            final long jUptimeMillis = SystemClock.uptimeMillis();
            final C1803010x1H c1803010x1H = this.LIZ;
            Diamond diamond = c1803010x1H.LLIZ;
            if (diamond != null) {
                ((IWalletService) C1161920gLG.LIZJ(IWalletService.class)).walletCenter().aF2(EnumC1805800x5m.LIVE_DETAIL, EnumC1805420x5A.JSB_CHARGE_FOR_LIVE, new InterfaceC1803980x2q() { // from class: X.0x1K
                    @Override // X.InterfaceC1803980x2q
                    public final void LIZ(long j) {
                        long j2;
                        IWalletCenter iWalletCenterWalletCenter;
                        WalletStruct walletStructTF1;
                        C784440Upu.LIZ().LIZIZ(new C1124340fMe((int) (j - c1803010x1H.LLILZIL), false, false, 0L, false, false, null, 0, 1020));
                        C1796590wqv.LIZ("ttlive_update_wallet_info_order", new HashMap());
                        IWalletService iWalletService = (IWalletService) C1161920gLG.LIZJ(IWalletService.class);
                        if (iWalletService != null && (iWalletCenterWalletCenter = iWalletService.walletCenter()) != null && (walletStructTF1 = iWalletCenterWalletCenter.TF1()) != null) {
                            j2 = walletStructTF1.coinsBalanceVersionV2;
                        } else {
                            j2 = 0;
                        }
                        C1803010x1H c1803010x1H2 = c1803010x1H;
                        long jUptimeMillis2 = SystemClock.uptimeMillis() - jUptimeMillis;
                        C1803010x1H c1803010x1H3 = c1803010x1H;
                        long j3 = c1803010x1H3.LLILZIL;
                        long j4 = c1803010x1H3.LLILZLL;
                        c1803010x1H2.getClass();
                        C1803010x1H.LJFF(true, jUptimeMillis2, j3, j, j4, j2, null);
                    }

                    @Override // X.InterfaceC1803980x2q
                    public final void LIZIZ(Throwable th) {
                        int errorCode;
                        if (th instanceof C501520Jle) {
                            errorCode = ((C501520Jle) th).getErrorCode();
                        } else {
                            errorCode = 61;
                        }
                        C1803010x1H c1803010x1H2 = c1803010x1H;
                        long jUptimeMillis2 = SystemClock.uptimeMillis() - jUptimeMillis;
                        long j = c1803010x1H.LLILZLL;
                        String string = th.toString();
                        c1803010x1H2.getClass();
                        C1803010x1H.LJFF(false, jUptimeMillis2, 0L, 0L, j, 0L, string);
                        C1796590wqv.LIZIZ(errorCode, "ttlive_update_wallet_info_order", "update wallet info fail");
                    }
                });
                C1796880wrO c1796880wrO = c1797010wrb.LIZLLL;
                c1803010x1H.LJII(diamond, new C1796560wqs(c1796880wrO.LIZJ, c1796880wrO.LIZ, c1796880wrO.LIZIZ, null, false, 24), true);
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:8:0x008d  */
        @Override // X.InterfaceC1796910wrR
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void LJ(int r26, X.C1797200wru r27) {
            /*
                Method dump skipped, instruction units count: 564
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: X.C1802970x1D.LJ(int, X.0wru):void");
        }

        @Override // X.InterfaceC1796910wrR
        public final void LJIIIIZZ(int i, C1797010wrb c1797010wrb) {
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
                ((InterfaceC1797160wrq) this.LIZ.LLIZLLLIL.getValue()).LIZLLL(str2, str, i2, this, false);
            }
        }
    };

    public static final boolean LIZLLL() {
        IWalletCenter iWalletCenterWalletCenter = ((IWalletService) C1161920gLG.LIZJ(IWalletService.class)).walletCenter();
        return iWalletCenterWalletCenter.JE1() ? iWalletCenterWalletCenter.kb() : C1126800fQc.LIZ.M92().kb();
    }

    public static final boolean LJ() {
        IWalletCenter iWalletCenterWalletCenter = ((IWalletService) C1161920gLG.LIZJ(IWalletService.class)).walletCenter();
        if (iWalletCenterWalletCenter.JE1()) {
            return iWalletCenterWalletCenter.isFirstRecharge();
        }
        C1126800fQc.LIZ.M92();
        return C1133940fc8.LJIIJJI();
    }

    public final void LIZJ(HashMap<String, String> map) {
        boolean zLJ;
        String str;
        String rechargeReason;
        String panelType;
        Map<String, Object> eventParams;
        String notificationType;
        Boolean firstRecharge;
        InterfaceC1803000x1G interfaceC1803000x1G = this.LLILZ;
        if (interfaceC1803000x1G != null && (firstRecharge = interfaceC1803000x1G.getFirstRecharge()) != null) {
            zLJ = firstRecharge.booleanValue();
        } else {
            zLJ = LJ();
        }
        if (zLJ) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        map.put("is_first_recharge", str);
        InterfaceC1803000x1G interfaceC1803000x1G2 = this.LLILZ;
        String giftEnterFrom = null;
        if (interfaceC1803000x1G2 != null) {
            rechargeReason = interfaceC1803000x1G2.getRechargeReason();
        } else {
            rechargeReason = null;
        }
        map.put("charge_reason", String.valueOf(rechargeReason));
        InterfaceC1803000x1G interfaceC1803000x1G3 = this.LLILZ;
        if (interfaceC1803000x1G3 != null) {
            panelType = interfaceC1803000x1G3.getPanelType();
        } else {
            panelType = null;
        }
        map.put("panel_type", String.valueOf(panelType));
        InterfaceC1803000x1G interfaceC1803000x1G4 = this.LLILZ;
        if (interfaceC1803000x1G4 != null) {
            giftEnterFrom = interfaceC1803000x1G4.getGiftEnterFrom();
        }
        String str2 = "";
        if (giftEnterFrom == null) {
            giftEnterFrom = "";
        }
        map.put("gift_enter_from", C1123580fLQ.LIZ(giftEnterFrom));
        InterfaceC1803000x1G interfaceC1803000x1G5 = this.LLILZ;
        if (interfaceC1803000x1G5 != null && (notificationType = interfaceC1803000x1G5.getNotificationType()) != null) {
            str2 = notificationType;
        }
        map.put("notification_type", str2);
        try {
            InterfaceC1803000x1G interfaceC1803000x1G6 = this.LLILZ;
            if (interfaceC1803000x1G6 != null && (eventParams = interfaceC1803000x1G6.getEventParams()) != null) {
                for (Map.Entry<String, Object> entry : eventParams.entrySet()) {
                    map.put(entry.getKey(), entry.getValue().toString());
                }
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    @Override // X.InterfaceC1141530foN
    public final void mh2(C262100zr c262100zr) {
        InterfaceC1107590evd interfaceC1107590evd;
        Diamond diamond;
        InterfaceC1803290x1j rechargeService;
        if (!Intrinsics.LJFF("live_js_event_fe_recharge_finish", c262100zr.LIZ) || (interfaceC1107590evd = c262100zr.LIZIZ) == null) {
            return;
        }
        boolean z = true;
        if (C1871910yoP.LIZLLL(interfaceC1107590evd, "is_success", 0) != 1) {
            z = false;
        }
        int iLIZLLL = C1871910yoP.LIZLLL(interfaceC1107590evd, "coin_number", 0);
        String strLJFF = C1871910yoP.LJFF(interfaceC1107590evd, "order_id", "");
        if (z && (diamond = this.LLIZ) != null) {
            IWalletService iWalletService = (IWalletService) C1161920gLG.LIZJ(IWalletService.class);
            if (iWalletService != null && (rechargeService = iWalletService.getRechargeService()) != null) {
                rechargeService.LJIIZILJ();
            }
            LJII(diamond, new C1796560wqs(iLIZLLL, diamond.iapId, strLJFF, String.valueOf(UserService.getInstance().user().getCurrentUserId()), false, 16), false);
        }
    }

    public final void LJII(Diamond diamond, C1796560wqs c1796560wqs, boolean z) {
        String str;
        String str2;
        String billingCountryCode;
        String strLIZ;
        Boolean boolValueOf;
        String str3;
        if (z) {
            int i = diamond.count;
            String strValueOf = String.valueOf(c1796560wqs.LIZIZ);
            String strValueOf2 = String.valueOf(c1796560wqs.LIZJ);
            HashMap<String, String> map = new HashMap<>();
            map.put("charge_style", "window");
            if (C500260Jjc.LJIJ(DataChannelGlobal.LLILZ)) {
                str = "1";
            } else {
                str = CardStruct.IStatusCode.DEFAULT;
            }
            map.put("is_anchor", str);
            map.put("is_multi", ((ILiveMatchService) C1161920gLG.LIZJ(ILiveMatchService.class)).sy0());
            map.put("sub_match_type", ((ILiveMatchService) C1161920gLG.LIZJ(ILiveMatchService.class)).my());
            map.put("request_page", "live_detail");
            if (C497740JfY.LJIL()) {
                str2 = "portrait";
            } else {
                str2 = "landscape";
            }
            map.put("room_orientation", str2);
            map.put("pay_method", C1796440wqg.LIZ());
            map.put("recharge_package", String.valueOf(i));
            map.put("order_id", strValueOf);
            map.put("package_quantity", strValueOf2);
            ILiveHostCrossRoomEventHelper iLiveHostCrossRoomEventHelper = (ILiveHostCrossRoomEventHelper) C1161920gLG.LIZJ(ILiveHostCrossRoomEventHelper.class);
            map.put("cohost_from_request_id", iLiveHostCrossRoomEventHelper.getFromRequestId());
            map.put("cohost_from_room_id", iLiveHostCrossRoomEventHelper.getFromRoomId());
            InterfaceC1791930wjP interfaceC1791930wjP = (InterfaceC1791930wjP) C1161920gLG.LIZJ(IapService.class);
            if (interfaceC1791930wjP == null || (billingCountryCode = interfaceC1791930wjP.getBillingCountryCode()) == null) {
                billingCountryCode = "";
            }
            map.put("app_store_front", billingCountryCode);
            Diamond diamond2 = this.LLIZ;
            if (diamond2 != null) {
                strLIZ = C1804850x4F.LIZ(diamond2);
            } else {
                strLIZ = null;
            }
            map.put("currency", String.valueOf(strLIZ));
            map.putAll(C467820IWe.LIZIZ());
            LIZJ(map);
            Diamond diamond3 = this.LLIZ;
            if (diamond3 != null) {
                boolValueOf = Boolean.valueOf(diamond3.LIZIZ());
            } else {
                boolValueOf = null;
            }
            if (C500260Jjc.LJJJI(boolValueOf)) {
                str3 = "tiktok";
            } else {
                str3 = "google_play";
            }
            map.put("panel_channel", str3);
            map.put("recharge_v3_version", String.valueOf(((IWalletService) C1161920gLG.LIZJ(IWalletService.class)).getRechargeService().LIZJ()));
            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_recharge_success");
            c474500IjALIZ.LJIL();
            c474500IjALIZ.LJJJ();
            c474500IjALIZ.LJFF(C0IXW.LIZJ("user_live_duration"));
            c474500IjALIZ.LJJIIZI(map);
            c474500IjALIZ.LIZ();
        }
        C389001fE.LIZ("tt_live_wallet_event_recharge_success", null, System.currentTimeMillis(), false);
        InterfaceC1802980x1E interfaceC1802980x1E = (InterfaceC1802980x1E) C1909107dp.LIZJ(InterfaceC1802980x1E.class, null);
        interfaceC1802980x1E.setStatus(1);
        interfaceC1802980x1E.setQuantity(Integer.valueOf(c1796560wqs.LIZJ));
        interfaceC1802980x1E.setTotalDiamondCount(Integer.valueOf(diamond.count * c1796560wqs.LIZJ));
        ((IWalletService) C1161920gLG.LIZJ(IWalletService.class)).getPayManager().LIZ();
        ((IWalletService) C1161920gLG.LIZJ(IWalletService.class)).walletCenter().X41(EnumC1805570x5P.RECHARGE_SUCCESS);
        CompletionBlock<InterfaceC1802980x1E> completionBlock = this.LLILLL;
        if (completionBlock != null) {
            completionBlock.onSuccess(interfaceC1802980x1E, "onPaySuccess");
        }
        C1548820qPI.LJIIIIZZ("live_js_event_fe_recharge_finish", this);
    }

    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, final CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        long j;
        final int iIntValue;
        Number chargeSource;
        IWalletCenter iWalletCenterWalletCenter;
        WalletStruct walletStructTF1;
        final InterfaceC1803000x1G interfaceC1803000x1G = (InterfaceC1803000x1G) xBaseParamModel;
        this.LLILLL = completionBlock;
        this.LLILZ = interfaceC1803000x1G;
        String iapId = interfaceC1803000x1G.getIapId();
        if (iapId == null) {
            iapId = "";
        }
        List listSingletonList = Collections.singletonList(iapId);
        this.LLILZIL = ((IWalletService) C1161920gLG.LIZJ(IWalletService.class)).walletCenter().No0();
        IWalletService iWalletService = (IWalletService) C1161920gLG.LIZJ(IWalletService.class);
        if (iWalletService != null && (iWalletCenterWalletCenter = iWalletService.walletCenter()) != null && (walletStructTF1 = iWalletCenterWalletCenter.TF1()) != null) {
            j = walletStructTF1.coinsBalanceVersionV2;
        } else {
            j = 0;
        }
        this.LLILZLL = j;
        InterfaceC1803000x1G interfaceC1803000x1G2 = this.LLILZ;
        int iIntValue2 = 0;
        if (interfaceC1803000x1G2 != null && (chargeSource = interfaceC1803000x1G2.getChargeSource()) != null) {
            iIntValue = chargeSource.intValue();
        } else {
            iIntValue = 0;
        }
        InterfaceC1796500wqm interfaceC1796500wqm = (InterfaceC1796500wqm) this.LLJ.getValue();
        int iLIZ = C07LT.LIZ(iIntValue);
        Number campaignType = interfaceC1803000x1G.getCampaignType();
        if (campaignType != null) {
            iIntValue2 = campaignType.intValue();
        }
        interfaceC1796500wqm.LJ(iLIZ, iIntValue2, false, listSingletonList).LJJIJIIJI(C11S5.LIZ()).LJJ(C1701940uOG.LIZIZ()).LJJIIZ(new C09JN() { // from class: X.0x1I
            /* JADX WARN: Removed duplicated region for block: B:21:0x005c  */
            /* JADX WARN: Removed duplicated region for block: B:24:0x006a  */
            /* JADX WARN: Removed duplicated region for block: B:27:0x0081  */
            /* JADX WARN: Removed duplicated region for block: B:37:0x00a7  */
            /* JADX WARN: Removed duplicated region for block: B:47:0x00ce  */
            /* JADX WARN: Removed duplicated region for block: B:68:0x0140  */
            /* JADX WARN: Removed duplicated region for block: B:71:0x0149  */
            /* JADX WARN: Removed duplicated region for block: B:75:0x01a2  */
            /* JADX WARN: Removed duplicated region for block: B:76:0x01a6  */
            /* JADX WARN: Removed duplicated region for block: B:80:0x01b6  */
            /* JADX WARN: Removed duplicated region for block: B:81:0x01b9  */
            /* JADX WARN: Removed duplicated region for block: B:82:0x01bc  */
            /* JADX WARN: Removed duplicated region for block: B:83:0x01bf  */
            /* JADX WARN: Removed duplicated region for block: B:84:0x01c3  */
            @Override // X.C09JN
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void accept(java.lang.Object r35) {
                /*
                    Method dump skipped, instruction units count: 459
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C1803020x1I.accept(java.lang.Object):void");
            }
        }, new AfS196S0100000_27(this, 40));
        C1548820qPI.LIZLLL("live_js_event_fe_recharge_finish", this);
    }

    public static void LJFF(boolean z, long j, long j2, long j3, long j4, long j5, String str) {
        String str2;
        String str3 = str;
        HashMap map = new HashMap();
        if (z) {
            str2 = "livesdk_wallet_update_info_aftPay_success";
        } else {
            str2 = "livesdk_wallet_update_info_aftPay_failed";
        }
        if (str3 == null) {
            str3 = "";
        }
        map.put("error_msg", str3);
        map.put("duration", Long.valueOf(j));
        InterfaceC1151200g3y walletMonitorService = ((IWalletService) C1161920gLG.LIZJ(IWalletService.class)).getWalletMonitorService();
        EnumC1796260wqO enumC1796260wqO = EnumC1796260wqO.BOTH;
        walletMonitorService.LIZ(enumC1796260wqO, str2, C2348809Ig.LIZLLL(map), null, null, null, "wallet");
        HashMap map2 = new HashMap();
        map2.put("charge_channel", C1796440wqg.LIZ());
        map2.put("scenario", "charge_for_live");
        map2.put("is_update", Integer.valueOf(walletMonitorService.LIZIZ(j2, j3) ? 1 : 0));
        map2.put("request_succeeded", Integer.valueOf(z ? 1 : 0));
        map2.put("original_coin_version", Long.valueOf(j4));
        map2.put("updated_coin_version", Long.valueOf(j5));
        walletMonitorService.LIZ(enumC1796260wqO, "livesdk_recharge_coins_balance_response", C2348809Ig.LIZLLL(map2), null, null, null, "wallet");
    }
}
