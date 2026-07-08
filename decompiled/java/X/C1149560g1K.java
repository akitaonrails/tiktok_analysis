package X;

import Y.ARunnableS103S0100000_3;
import Y.ARunnableS50S0300000_17;
import android.content.Context;
import com.bytedance.android.live.wallet.IWalletExceptionService;
import com.bytedance.android.live.wallet.IWalletService;
import com.bytedance.android.live.wallet.WalletExchange;
import com.bytedance.android.live.wallet.model.ExchangeDisplayInfo;
import com.bytedance.android.live.wallet.model.ExchangeParams;
import com.bytedance.android.livesdk.dataChannel.BroadcastPageChannel;
import com.bytedance.android.livesdk.firstrecharge.RechargePanelExchangeParams;
import com.bytedance.android.livesdk.firstrecharge.RechargePanelInputParams;
import com.bytedance.android.livesdk.wallet.CustomErrorExtra;
import com.bytedance.android.livesdk.wallet.Diamond;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.math.BigDecimal;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS596S0100000_17;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import org.json.JSONObject;
import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.0g1K, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1149560g1K {
    public static final String LIZIZ(ExchangeParams exchangeParams) {
        int i = exchangeParams.way;
        if (i != 0) {
            if (i != 1) {
                return "refund_credit";
            }
            return "anchor_income";
        }
        return "ug_exchange";
    }

    public static boolean LIZJ(RechargePanelExchangeParams rechargePanelExchangeParams) {
        Long l;
        if (rechargePanelExchangeParams == null || (l = rechargePanelExchangeParams.maxCoins) == null || l.longValue() <= 0) {
            return false;
        }
        return true;
    }

    public static final boolean LIZLLL(RechargePanelInputParams rechargePanelInputParams) {
        if (rechargePanelInputParams == null) {
            return false;
        }
        if (!Intrinsics.LJFF(rechargePanelInputParams.giftEnterFrom, "balance_page") && !Intrinsics.LJFF(rechargePanelInputParams.enterMethod, "balance") && !Intrinsics.LJFF(rechargePanelInputParams.requestPage, "my_profile")) {
            return false;
        }
        return true;
    }

    public static final void LJ(C474500IjA c474500IjA) {
        try {
            C1CC2.LIZJ(c474500IjA.LJIJ(), C2348809Ig.LIZLLL(c474500IjA.LJIJI()), new JSONObject(), new JSONObject());
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    public static final String LIZ(long j, RechargePanelExchangeParams rechargePanelExchangeParams) {
        int iIntValue;
        C1149570g1L c1149570g1L;
        Long l = rechargePanelExchangeParams.basePackagePrice;
        String str = "";
        if (l != null) {
            long jLongValue = l.longValue();
            if (rechargePanelExchangeParams.realDot != null) {
                BigDecimal bigDecimalMultiply = new BigDecimal(j).multiply(new BigDecimal(jLongValue).divide(new BigDecimal(Math.pow(10.0d, (int) r2.longValue()))));
                Integer num = rechargePanelExchangeParams.keepDot;
                String str2 = rechargePanelExchangeParams.currencyCode;
                if (num != null) {
                    iIntValue = num.intValue();
                } else {
                    iIntValue = 2;
                }
                if (str2 == null) {
                    str2 = "USD";
                }
                if (C1697810uHb.LJIIJJI("IDR", "BRL", "").contains(str2)) {
                    c1149570g1L = new C1149570g1L(e3.d, ",", iIntValue, 4);
                } else {
                    c1149570g1L = new C1149570g1L(null, null, iIntValue, 7);
                }
                double dDoubleValue = bigDecimalMultiply.doubleValue();
                double dPow = Math.pow(10.0d, c1149570g1L.LIZLLL);
                List listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL(String.valueOf(Math.ceil(dDoubleValue * dPow) / dPow), new String[]{c1149570g1L.LIZ}, 0, 6);
                String str3 = (String) ListProtector.get(listLJJLIIIJILLIZJL, 0);
                if (listLJJLIIIJILLIZJL.size() > 1 && c1149570g1L.LIZLLL > 0) {
                    str = (String) ListProtector.get(listLJJLIIIJILLIZJL, 1);
                }
                String strReplace = c1149570g1L.LIZJ.replace(str3, new AwS596S0100000_17(c1149570g1L, 630));
                if (str.length() > 0) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(strReplace);
                    sbLIZ.append(c1149570g1L.LIZIZ);
                    sbLIZ.append(str);
                    strReplace = C2188811AlT.LIZIZ(sbLIZ);
                }
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append(rechargePanelExchangeParams.symbol);
                sbLIZ2.append(strReplace);
                return C2188811AlT.LIZIZ(sbLIZ2);
            }
        }
        return "";
    }

    public static final void LJFF(final ExchangeParams exchangeParams, final Function1<? super Boolean, Unit> function1) {
        List<Diamond> listLJIIJJI;
        Diamond diamond;
        final String strLJFF = ((WalletExchange) C1148670fzt.LIZ().walletExchange()).LJFF(exchangeParams.source);
        final long jLIZ = C158B.LIZ();
        Boolean boolValueOf = null;
        C1804840x4E c1804840x4ELJIILIIL = C1148670fzt.LIZ().getRechargeService().LJIILIIL(C07LT.LIZ(0), null, null);
        if (c1804840x4ELJIILIIL != null && (listLJIIJJI = c1804840x4ELJIILIIL.LJIIJJI(null, false)) != null && (diamond = (Diamond) C13LP.LJJJLL(listLJIIJJI)) != null) {
            boolValueOf = Boolean.valueOf(diamond.LIZIZ());
        }
        final boolean zLIZIZ = C176600m4.LIZIZ(boolValueOf);
        ((WalletExchange) C1148670fzt.LIZ().walletExchange()).LJ(C176600m4.LIZ(), null, false, exchangeParams, new InterfaceC1151070g3l() { // from class: X.0g1O
            @Override // X.InterfaceC1151070g3l
            public final void LIZ(Throwable th) {
                int statusCode;
                String str;
                Exception exc;
                ARunnableS103S0100000_3 aRunnableS103S0100000_3;
                String str2;
                Function1<Boolean, Unit> function12;
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
                Context contextLIZ = C176600m4.LIZ();
                if (contextLIZ != null) {
                    ARunnableS50S0300000_17 aRunnableS50S0300000_17 = null;
                    if (z) {
                        exc = (Exception) th;
                    } else {
                        exc = null;
                    }
                    CustomErrorExtra customErrorExtra = CustomErrorExtra.getCustomErrorExtra(exc);
                    Boolean boolCq0 = C1148670fzt.LIZ().walletException().cq0(customErrorExtra, statusCode);
                    if (boolCq0.booleanValue()) {
                        ExchangeParams exchangeParams2 = exchangeParams;
                        Function1<Boolean, Unit> function13 = function1;
                        aRunnableS50S0300000_17 = new ARunnableS50S0300000_17(exchangeParams2, customErrorExtra, function13, 20);
                        aRunnableS103S0100000_3 = new ARunnableS103S0100000_3(function13, 135);
                    } else {
                        aRunnableS103S0100000_3 = null;
                    }
                    IWalletExceptionService iWalletExceptionServiceWalletException = C1148670fzt.LIZ().walletException();
                    ExchangeParams exchangeParams3 = exchangeParams;
                    int i = exchangeParams3.source;
                    int i2 = exchangeParams3.way;
                    if (zLIZIZ) {
                        str2 = "tiktok";
                    } else {
                        str2 = "google_play";
                    }
                    if (!iWalletExceptionServiceWalletException.NO1(contextLIZ, th, aRunnableS50S0300000_17, aRunnableS103S0100000_3, i, i2, null, exchangeParams3, str2).LIZ) {
                        C766270U4b.LJIIJJI(strLJIJI);
                    }
                    if (!boolCq0.booleanValue() && (function12 = function1) != null) {
                        function12.invoke(Boolean.FALSE);
                    }
                }
                C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_recharge_exchange_failed");
                c474500IjALIZ.LJIL();
                c474500IjALIZ.LJJII(Integer.valueOf(statusCode), "error_code");
                int i3 = exchangeParams.source;
                if (i3 != 0) {
                    if (i3 != 9) {
                        str = "";
                    } else {
                        str = "my_profile";
                    }
                } else {
                    str = "live_detail";
                }
                c474500IjALIZ.LJJII(str, "request_page");
                c474500IjALIZ.LJJIIZI(exchangeParams.eventParams);
                c474500IjALIZ.LIZ();
                C474500IjA c474500IjALIZ2 = C0IJT.LIZ("livesdk_recharge_exchange_result_return");
                c474500IjALIZ2.LJIL();
                c474500IjALIZ2.LJJII("failed", FollowStatusChangeMethod.PARAM_FOLLOW_STATUS);
                c474500IjALIZ2.LJJII(Integer.valueOf(statusCode), "error_code");
                c474500IjALIZ2.LJJII(Long.valueOf(C158B.LIZ() - jLIZ), "loading_duration");
                c474500IjALIZ2.LJJII(C1149560g1K.LIZIZ(exchangeParams), "exchange_type");
                c474500IjALIZ2.LJJIIZI(exchangeParams.eventParams);
                c474500IjALIZ2.LIZ();
                C474500IjA c474500IjALIZ3 = C0IJT.LIZ("livesdk_exchange_fail");
                c474500IjALIZ3.LJJII(Integer.valueOf(statusCode), "error_code");
                c474500IjALIZ3.LJJIIZI(exchangeParams.eventParams);
                c474500IjALIZ3.LIZ();
                C1149560g1K.LJ(c474500IjALIZ3);
            }

            @Override // X.InterfaceC1151070g3l
            public final void LIZIZ(String str) {
                String str2;
                String str3;
                String str4;
                int i;
                C766270U4b.LIZLLL(2131841597);
                ExchangeDisplayInfo exchangeDisplayInfoKL2 = C1148670fzt.LIZ().walletCenter().kL2();
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
                    int i3 = exchangeParams.source;
                    if (i3 != 0) {
                        if (i3 != 9) {
                            str4 = "";
                        } else {
                            str4 = "my_profile";
                        }
                    } else {
                        str4 = "live_detail";
                    }
                    c474500IjALIZ.LJJII(str4, "request_page");
                    c474500IjALIZ.LJJII(C1149560g1K.LIZIZ(exchangeParams), "charge_reason");
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
                    c474500IjALIZ2.LJJII(C1149560g1K.LIZIZ(exchangeParams), "charge_reason");
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
                c474500IjALIZ3.LJJII(strLJFF, "exchange_entrance");
                c474500IjALIZ3.LJJII(C1149560g1K.LIZIZ(exchangeParams), "exchange_type");
                c474500IjALIZ3.LJJIIZI(exchangeParams.eventParams);
                c474500IjALIZ3.LIZ();
                C474500IjA c474500IjALIZ4 = C0IJT.LIZ("livesdk_exchange_success");
                c474500IjALIZ4.LJJII(Long.valueOf(C158B.LIZ() - jLIZ), "time_consuming");
                boolean z = zLIZIZ;
                if (C1148670fzt.LIZ().isV3Phase2(0)) {
                    if (z) {
                        str2 = "tiktok";
                    } else {
                        str2 = "google_play";
                    }
                    c474500IjALIZ4.LJJII(str2, "panel_channel");
                    c474500IjALIZ4.LJJII(Integer.valueOf(((IWalletService) C1161920gLG.LIZJ(IWalletService.class)).getRechargeService().LIZJ()), "recharge_v3_version");
                }
                c474500IjALIZ4.LJJIIZI(exchangeParams.eventParams);
                c474500IjALIZ4.LIZ();
                C1149560g1K.LJ(c474500IjALIZ4);
                C784440Upu.LIZ().LIZIZ(new C1149590g1N());
                C784440Upu.LIZ().LIZIZ(new C1124340fMe((int) exchangeParams.coinsCount, true, false, 0L, false, false, null, 0, 1016));
                Function1<Boolean, Unit> function12 = function1;
                if (function12 != null) {
                    function12.invoke(Boolean.TRUE);
                }
                ((IWalletService) C1161920gLG.LIZJ(IWalletService.class)).walletCenter().X41(EnumC1805570x5P.EXCHANGE_SUCCESS);
            }
        });
    }
}
