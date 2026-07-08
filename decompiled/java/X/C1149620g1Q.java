package X;

import Y.ARunnableS11S0500000_17;
import Y.ARunnableS86S0200000_17;
import android.content.Context;
import com.bytedance.android.live.wallet.IWalletExceptionService;
import com.bytedance.android.live.wallet.IWalletService;
import com.bytedance.android.live.wallet.WalletExchange;
import com.bytedance.android.live.wallet.model.ExchangeDisplayInfo;
import com.bytedance.android.live.wallet.model.ExchangeParams;
import com.bytedance.android.livesdk.dataChannel.BroadcastPageChannel;
import com.bytedance.android.livesdk.wallet.CustomErrorExtra;
import com.bytedance.android.livesdk.wallet.Diamond;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0g1Q, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1149620g1Q extends AbstractC1149640g1S {
    public static final /* synthetic */ int LLILZ = 0;
    public String LLILLL = "";

    public static String LIZJ(ExchangeParams exchangeParams) {
        int i = exchangeParams.way;
        if (i == 0) {
            return "ug_exchange";
        }
        if (i == 1) {
            return "anchor_income";
        }
        return "refund_credit";
    }

    public static void LJ(C474500IjA c474500IjA) {
        try {
            C1CC2.LIZJ(c474500IjA.LJIJ(), C2348809Ig.LIZLLL(c474500IjA.LJIJI()), new JSONObject(), new JSONObject());
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    public final void LIZLLL(final Context context, final ExchangeParams exchangeParams, final CompletionBlock<InterfaceC1149650g1T> completionBlock) {
        final long jLIZ = C158B.LIZ();
        ((WalletExchange) ((IWalletService) C1161920gLG.LIZJ(IWalletService.class)).walletExchange()).LJ(context, null, false, exchangeParams, new InterfaceC1151070g3l() { // from class: X.0g1P
            @Override // X.InterfaceC1151070g3l
            public final void LIZ(Throwable th) {
                int statusCode;
                Exception exc;
                ARunnableS11S0500000_17 aRunnableS11S0500000_17;
                ARunnableS86S0200000_17 aRunnableS86S0200000_17;
                Boolean boolValueOf;
                String str;
                List<Diamond> listLJIIJJI;
                Diamond diamond;
                String strLJIJI = C497740JfY.LJIJI(2131841598);
                boolean z = th instanceof C501470JlZ;
                if (z) {
                    C501470JlZ c501470JlZ = (C501470JlZ) th;
                    statusCode = c501470JlZ.getErrorCode();
                    strLJIJI = c501470JlZ.getPrompt();
                } else if (th instanceof C1811850xFX) {
                    statusCode = ((C1811850xFX) th).statusCode;
                } else if (th instanceof C1494690ozz) {
                    statusCode = ((C1494690ozz) th).getStatusCode();
                } else {
                    statusCode = -1;
                }
                String str2 = "";
                if (context != null) {
                    IWalletService iWalletService = (IWalletService) C1161920gLG.LIZJ(IWalletService.class);
                    if (z) {
                        exc = (Exception) th;
                    } else {
                        exc = null;
                    }
                    CustomErrorExtra customErrorExtra = CustomErrorExtra.getCustomErrorExtra(exc);
                    Boolean boolCq0 = iWalletService.walletException().cq0(customErrorExtra, statusCode);
                    if (boolCq0.booleanValue()) {
                        ExchangeParams exchangeParams2 = exchangeParams;
                        C1149620g1Q c1149620g1Q = this;
                        Context context2 = context;
                        CompletionBlock<InterfaceC1149650g1T> completionBlock2 = completionBlock;
                        aRunnableS11S0500000_17 = new ARunnableS11S0500000_17(exchangeParams2, customErrorExtra, c1149620g1Q, context2, completionBlock2, 2);
                        aRunnableS86S0200000_17 = new ARunnableS86S0200000_17(c1149620g1Q, completionBlock2, 34);
                    } else {
                        aRunnableS11S0500000_17 = null;
                        aRunnableS86S0200000_17 = null;
                    }
                    C1804840x4E c1804840x4ELJIILIIL = iWalletService.getRechargeService().LJIILIIL(C07LT.LIZ(0), null, null);
                    if (c1804840x4ELJIILIIL != null && (listLJIIJJI = c1804840x4ELJIILIIL.LJIIJJI(null, false)) != null && (diamond = (Diamond) C13LP.LJJJLL(listLJIIJJI)) != null) {
                        boolValueOf = Boolean.valueOf(diamond.LIZIZ());
                    } else {
                        boolValueOf = null;
                    }
                    boolean zLIZIZ = C176600m4.LIZIZ(boolValueOf);
                    IWalletExceptionService iWalletExceptionServiceWalletException = iWalletService.walletException();
                    Context context3 = context;
                    ExchangeParams exchangeParams3 = exchangeParams;
                    int i = exchangeParams3.source;
                    int i2 = exchangeParams3.way;
                    if (zLIZIZ) {
                        str = "tiktok";
                    } else {
                        str = "google_play";
                    }
                    if (!iWalletExceptionServiceWalletException.NO1(context3, th, aRunnableS11S0500000_17, aRunnableS86S0200000_17, i, i2, null, exchangeParams3, str).LIZ) {
                        C766270U4b.LJIIJJI(strLJIJI);
                    }
                    if (!boolCq0.booleanValue()) {
                        C1149620g1Q c1149620g1Q2 = this;
                        CompletionBlock<InterfaceC1149650g1T> completionBlock3 = completionBlock;
                        c1149620g1Q2.getClass();
                        InterfaceC1149650g1T interfaceC1149650g1T = (InterfaceC1149650g1T) C1909107dp.LIZJ(InterfaceC1149650g1T.class, null);
                        interfaceC1149650g1T.setOrderID("");
                        interfaceC1149650g1T.setResult(CardStruct.IStatusCode.DEFAULT);
                        completionBlock3.onSuccess(interfaceC1149650g1T, "");
                    }
                }
                C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_recharge_exchange_failed");
                c474500IjALIZ.LJIL();
                c474500IjALIZ.LJJII(Integer.valueOf(statusCode), "error_code");
                C1149620g1Q c1149620g1Q3 = this;
                ExchangeParams exchangeParams4 = exchangeParams;
                c1149620g1Q3.getClass();
                int i3 = exchangeParams4.source;
                if (i3 == 0) {
                    str2 = "live_detail";
                } else if (i3 == 9) {
                    str2 = "my_profile";
                }
                c474500IjALIZ.LJJII(str2, "request_page");
                c474500IjALIZ.LJJIIZI(exchangeParams.eventParams);
                c474500IjALIZ.LIZ();
                C474500IjA c474500IjALIZ2 = C0IJT.LIZ("livesdk_recharge_exchange_result_return");
                c474500IjALIZ2.LJIL();
                c474500IjALIZ2.LJJII("failed", FollowStatusChangeMethod.PARAM_FOLLOW_STATUS);
                c474500IjALIZ2.LJJII(Integer.valueOf(statusCode), "error_code");
                c474500IjALIZ2.LJJII(Long.valueOf(C158B.LIZ() - jLIZ), "loading_duration");
                C1149620g1Q c1149620g1Q4 = this;
                ExchangeParams exchangeParams5 = exchangeParams;
                c1149620g1Q4.getClass();
                c474500IjALIZ2.LJJII(C1149620g1Q.LIZJ(exchangeParams5), "exchange_type");
                c474500IjALIZ2.LJJIIZI(exchangeParams.eventParams);
                c474500IjALIZ2.LIZ();
                C474500IjA c474500IjALIZ3 = C0IJT.LIZ("livesdk_exchange_fail");
                c474500IjALIZ3.LJJII(Integer.valueOf(statusCode), "error_code");
                c474500IjALIZ3.LJJIIZI(exchangeParams.eventParams);
                c474500IjALIZ3.LIZ();
                this.getClass();
                C1149620g1Q.LJ(c474500IjALIZ3);
            }

            @Override // X.InterfaceC1151070g3l
            public final void LIZIZ(String str) {
                Boolean boolValueOf;
                String str2;
                List<Diamond> listLJIIJJI;
                Diamond diamond;
                String str3;
                String str4;
                int i;
                C766270U4b.LIZLLL(2131841597);
                ExchangeDisplayInfo exchangeDisplayInfoKL2 = ((IWalletService) C1161920gLG.LIZJ(IWalletService.class)).walletCenter().kL2();
                int i2 = exchangeParams.source;
                if (i2 != 10 && i2 != 15) {
                    C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_recharge_exchange_success");
                    c474500IjALIZ.LJIL();
                    c474500IjALIZ.LJJII(Integer.valueOf(exchangeParams.isFirstRecharge ? 1 : 0), "is_first_recharge");
                    c474500IjALIZ.LJJII(exchangeParams.exchangeLevel, "exchange_level");
                    if (C497740JfY.LJIL()) {
                        str3 = "portrait";
                    } else {
                        str3 = "landscape";
                    }
                    c474500IjALIZ.LJJII(str3, "room_orientation");
                    C1149620g1Q c1149620g1Q = this;
                    ExchangeParams exchangeParams2 = exchangeParams;
                    c1149620g1Q.getClass();
                    int i3 = exchangeParams2.source;
                    if (i3 == 0) {
                        str4 = "live_detail";
                    } else if (i3 != 9) {
                        str4 = "";
                    } else {
                        str4 = "my_profile";
                    }
                    c474500IjALIZ.LJJII(str4, "request_page");
                    C1149620g1Q c1149620g1Q2 = this;
                    ExchangeParams exchangeParams3 = exchangeParams;
                    c1149620g1Q2.getClass();
                    c474500IjALIZ.LJJII(C1149620g1Q.LIZJ(exchangeParams3), "charge_reason");
                    c474500IjALIZ.LJJII(Long.valueOf(exchangeParams.coinsCount), "exchange_coins");
                    c474500IjALIZ.LJJIIZI(exchangeParams.eventParams);
                    if (exchangeParams.source == 0) {
                        DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LLILZ;
                        if (dataChannelGlobal.gg0(BroadcastPageChannel.class) != null) {
                            EnumC500290Jjf enumC500290Jjf = (EnumC500290Jjf) dataChannelGlobal.gg0(BroadcastPageChannel.class);
                            if (enumC500290Jjf != null && enumC500290Jjf.isAudience()) {
                                i = 1;
                            } else {
                                i = 0;
                            }
                            c474500IjALIZ.LJJII(Integer.valueOf(i ^ 1), "is_anchor");
                        }
                    }
                    c474500IjALIZ.LIZ();
                } else {
                    C474500IjA c474500IjALIZ2 = C0IJT.LIZ("livesdk_withdraw_exchange_success");
                    c474500IjALIZ2.LJIL();
                    c474500IjALIZ2.LJJII(exchangeParams.exchangeLevel, "exchange_level");
                    C1149620g1Q c1149620g1Q3 = this;
                    ExchangeParams exchangeParams4 = exchangeParams;
                    c1149620g1Q3.getClass();
                    c474500IjALIZ2.LJJII(C1149620g1Q.LIZJ(exchangeParams4), "charge_reason");
                    c474500IjALIZ2.LJJII(Integer.valueOf(!exchangeDisplayInfoKL2.isFirstExchange ? 1 : 0), "is_exchange_before");
                    c474500IjALIZ2.LJJII(Integer.valueOf(exchangeDisplayInfoKL2.LIZ() ? 1 : 0), "is_tax_info_finished");
                    c474500IjALIZ2.LJJIIZI(exchangeParams.eventParams);
                    c474500IjALIZ2.LIZ();
                }
                C474500IjA c474500IjALIZ3 = C0IJT.LIZ("livesdk_recharge_exchange_result_return");
                c474500IjALIZ3.LJIL();
                c474500IjALIZ3.LJJII("success", FollowStatusChangeMethod.PARAM_FOLLOW_STATUS);
                c474500IjALIZ3.LJJII("", "error_code");
                c474500IjALIZ3.LJJII(Long.valueOf(C158B.LIZ() - jLIZ), "loading_duration");
                c474500IjALIZ3.LJJII(this.LLILLL, "exchange_entrance");
                C1149620g1Q c1149620g1Q4 = this;
                ExchangeParams exchangeParams5 = exchangeParams;
                c1149620g1Q4.getClass();
                c474500IjALIZ3.LJJII(C1149620g1Q.LIZJ(exchangeParams5), "exchange_type");
                c474500IjALIZ3.LJJIIZI(exchangeParams.eventParams);
                c474500IjALIZ3.LIZ();
                C474500IjA c474500IjALIZ4 = C0IJT.LIZ("livesdk_exchange_success");
                c474500IjALIZ4.LJJII(Long.valueOf(C158B.LIZ() - jLIZ), "time_consuming");
                IWalletService iWalletService = (IWalletService) C1161920gLG.LIZJ(IWalletService.class);
                if (iWalletService.isValidForRechargeV3()) {
                    C1804840x4E c1804840x4ELJIILIIL = iWalletService.getRechargeService().LJIILIIL(C07LT.LIZ(0), null, null);
                    if (c1804840x4ELJIILIIL != null && (listLJIIJJI = c1804840x4ELJIILIIL.LJIIJJI(null, false)) != null && (diamond = (Diamond) C13LP.LJJJLL(listLJIIJJI)) != null) {
                        boolValueOf = Boolean.valueOf(diamond.LIZIZ());
                    } else {
                        boolValueOf = null;
                    }
                    if (C176600m4.LIZIZ(boolValueOf)) {
                        str2 = "tiktok";
                    } else {
                        str2 = "google_play";
                    }
                    c474500IjALIZ4.LJJII(str2, "panel_channel");
                    c474500IjALIZ4.LJJII(Integer.valueOf(((IWalletService) C1161920gLG.LIZJ(IWalletService.class)).getRechargeService().LIZJ()), "recharge_v3_version");
                }
                c474500IjALIZ4.LJJIIZI(exchangeParams.eventParams);
                c474500IjALIZ4.LIZ();
                this.getClass();
                C1149620g1Q.LJ(c474500IjALIZ4);
                C784440Upu.LIZ().LIZIZ(new C1149590g1N());
                C784440Upu.LIZ().LIZIZ(new C1124340fMe((int) exchangeParams.coinsCount, true, false, 0L, false, false, null, 0, 1016));
                C1149620g1Q c1149620g1Q5 = this;
                CompletionBlock<InterfaceC1149650g1T> completionBlock2 = completionBlock;
                c1149620g1Q5.getClass();
                InterfaceC1149650g1T interfaceC1149650g1T = (InterfaceC1149650g1T) C1909107dp.LIZJ(InterfaceC1149650g1T.class, null);
                interfaceC1149650g1T.setOrderID(str);
                interfaceC1149650g1T.setResult("1");
                completionBlock2.onSuccess(interfaceC1149650g1T, "");
                ((IWalletService) C1161920gLG.LIZJ(IWalletService.class)).walletCenter().X41(EnumC1805570x5P.EXCHANGE_SUCCESS);
            }
        });
    }

    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        int iIntValue;
        Object obj;
        int iIntValue2;
        Integer num;
        InterfaceC1149630g1R interfaceC1149630g1R = (InterfaceC1149630g1R) xBaseParamModel;
        this.LLILLL = ((WalletExchange) ((IWalletService) C1161920gLG.LIZJ(IWalletService.class)).walletExchange()).LJFF(interfaceC1149630g1R.getSource().intValue());
        ExchangeParams exchangeParams = new ExchangeParams();
        exchangeParams.diamondId = interfaceC1149630g1R.getDiamondId().intValue();
        exchangeParams.symbol = interfaceC1149630g1R.getSymbol();
        exchangeParams.currency = interfaceC1149630g1R.getCurrencyCode();
        exchangeParams.way = interfaceC1149630g1R.getWay().intValue();
        exchangeParams.source = interfaceC1149630g1R.getSource().intValue();
        exchangeParams.coinsCount = interfaceC1149630g1R.getCoinsCount().longValue();
        exchangeParams.localAmount = interfaceC1149630g1R.getLocalAmount().longValue();
        exchangeParams.currencyDot = interfaceC1149630g1R.getCurrencyDot().longValue();
        exchangeParams.amount = interfaceC1149630g1R.getShowAmount();
        exchangeParams.exchangeLevel = interfaceC1149630g1R.getExchangeLevel();
        exchangeParams.isFirstRecharge = interfaceC1149630g1R.isFirstRecharge();
        String penaltyWarningSkip = interfaceC1149630g1R.getPenaltyWarningSkip();
        if (penaltyWarningSkip == null) {
            penaltyWarningSkip = "";
        }
        exchangeParams.penaltyWarningSkip = penaltyWarningSkip;
        Number subSource = interfaceC1149630g1R.getSubSource();
        if (subSource != null) {
            iIntValue = subSource.intValue();
        } else {
            iIntValue = -1;
        }
        exchangeParams.subSource = iIntValue;
        Map<String, Object> eventParams = interfaceC1149630g1R.getEventParams();
        Context context = null;
        if (eventParams != null) {
            obj = eventParams.get("campaign_type");
        } else {
            obj = null;
        }
        if ((obj instanceof Integer) && (num = (Integer) obj) != null) {
            iIntValue2 = num.intValue();
        } else {
            iIntValue2 = 0;
        }
        exchangeParams.campaignType = iIntValue2;
        Map<String, Object> eventParams2 = interfaceC1149630g1R.getEventParams();
        if (eventParams2 != null) {
            exchangeParams.eventParams = new HashMap<>();
            Iterator<T> it2 = eventParams2.entrySet().iterator();
            while (it2.hasNext()) {
                Map.Entry entry = (Map.Entry) it2.next();
                exchangeParams.eventParams.put((String) entry.getKey(), entry.getValue().toString());
            }
        }
        InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
        if (interfaceC634840OvC != null) {
            context = interfaceC634840OvC.getContext();
        }
        LIZLLL(context, exchangeParams, completionBlock);
    }
}
