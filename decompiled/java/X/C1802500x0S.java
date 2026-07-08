package X;

import android.content.Context;
import com.bytedance.android.live.actionhandler.IActionHandlerService;
import com.bytedance.android.live.wallet.IWalletExchange;
import com.bytedance.android.live.wallet.IWalletService;
import com.bytedance.android.live.wallet.WalletExchange;
import com.bytedance.android.live.wallet.model.recharge.RechargeRequestParams;
import com.bytedance.android.livesdk.livesetting.wallet.LiveWalletGPInsufficientFundGuidanceSetting;
import com.bytedance.android.livesdk.wallet.Diamond;
import kotlin.jvm.internal.AwS571S0100000_27;

/* JADX INFO: renamed from: X.0x0S, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1802500x0S {
    public static final C1802500x0S LIZ = new C1802500x0S();
    public static volatile boolean LIZIZ;

    public static void LIZ(InterfaceC1797260ws0 interfaceC1797260ws0) {
        interfaceC1797260ws0.LIZIZ("recharge_pay_fail", C1697810uHb.LJIILJJIL(new AbstractC1802540x0W() { // from class: X.0x0n
            @Override // X.AbstractC1802540x0W
            public final C1802630x0f LIZIZ(Context context, C1797250wrz c1797250wrz) {
                C1802730x0p c1802730x0p;
                int i;
                int i2;
                Diamond diamond;
                String message;
                String strValueOf;
                String strLIZLLL;
                Integer numValueOf;
                String strLIZJ;
                RechargeRequestParams rechargeRequestParams = c1797250wrz.LJII;
                String message2 = null;
                if (rechargeRequestParams != null && (c1802730x0p = rechargeRequestParams.LIZ) != null && c1802730x0p.LIZ.length() > 0 && (i = c1797250wrz.LIZ) == 203 && (i2 = c1797250wrz.LJI) != 1 && i2 != 11) {
                    RechargeRequestParams rechargeRequestParams2 = c1797250wrz.LJII;
                    if (rechargeRequestParams2 != null) {
                        diamond = rechargeRequestParams2.diamond;
                    } else {
                        diamond = null;
                    }
                    C1802580x0a c1802580x0a = C1802580x0a.LIZ;
                    C1802410x0J c1802410x0J = c1797250wrz.LJIIIIZZ;
                    int i3 = c1797250wrz.LIZIZ;
                    Exception exc = c1797250wrz.LIZJ;
                    String strLJ = "";
                    if (exc == null || (message = exc.getMessage()) == null) {
                        message = "";
                    }
                    if (c1797250wrz.LJIIIZ.get("request_page") != null) {
                        strValueOf = String.valueOf(c1797250wrz.LJIIIZ.get("request_page"));
                    } else {
                        strValueOf = "unknown";
                    }
                    c1802580x0a.getClass();
                    String strLIZJ2 = C1802580x0a.LIZJ(c1802410x0J, i, i3, i2, message, strValueOf);
                    C495520Jby c495520Jby = new C495520Jby(c1802730x0p.LIZ);
                    c495520Jby.LIZJ("enter_from", "iap_failure");
                    c495520Jby.LIZJ("access_panel", "live_room");
                    c495520Jby.LIZJ("anchor_id", String.valueOf(c1802730x0p.LJ));
                    c495520Jby.LIZJ("room_id", String.valueOf(c1802730x0p.LJFF));
                    if (diamond != null) {
                        strLIZLLL = C1804850x4F.LIZLLL(diamond);
                    } else {
                        strLIZLLL = null;
                    }
                    c495520Jby.LIZJ("inapp_price", strLIZLLL);
                    if (diamond != null) {
                        numValueOf = Integer.valueOf(diamond.count);
                    } else {
                        numValueOf = null;
                    }
                    c495520Jby.LIZJ("coins_amount", String.valueOf(numValueOf));
                    if (diamond != null) {
                        if (diamond.customPriceCurrency != null) {
                            strLJ = C1804850x4F.LJ(diamond.customPriceCurrency, new AwS571S0100000_27(diamond, 1032));
                        }
                    } else {
                        strLJ = null;
                    }
                    c495520Jby.LIZJ("custom_price", strLJ);
                    if (diamond != null) {
                        strLIZJ = C1804850x4F.LIZJ(diamond);
                    } else {
                        strLIZJ = null;
                    }
                    c495520Jby.LIZJ("price_difference", strLIZJ);
                    c495520Jby.LIZJ("discount_amount", String.valueOf(c1802730x0p.LIZLLL));
                    c495520Jby.LIZ(c1797250wrz.LIZ, "charge_error_code");
                    c495520Jby.LIZ(c1797250wrz.LIZIZ, "detail_error_code");
                    c495520Jby.LIZ(c1797250wrz.LJI, "internal_error_code");
                    Exception exc2 = c1797250wrz.LIZJ;
                    if (exc2 != null) {
                        message2 = exc2.getMessage();
                    }
                    c495520Jby.LIZJ("error_message", message2);
                    c495520Jby.LIZJ("try_now_url", c1802730x0p.LIZIZ);
                    c495520Jby.LIZJ("faq_url", strLIZJ2);
                    if (C497740JfY.LJIL()) {
                        ((IActionHandlerService) C1161920gLG.LIZJ(IActionHandlerService.class)).handle(context, c495520Jby.LIZLLL());
                    } else {
                        C784440Upu c784440UpuLIZ = C784440Upu.LIZ();
                        c784440UpuLIZ.LIZIZ(new C0IF2(1));
                        c784440UpuLIZ.LIZIZ(new C1146860fwy("NormalRechargePanel"));
                        C786410Ut5.LJLIIL(500L, C820670WHh.LIZ, new RunnableC514501zT(context, c495520Jby, 15));
                    }
                    return C1802640x0g.LIZIZ();
                }
                return C1802640x0g.LIZ();
            }
        }, new AbstractC1802540x0W() { // from class: X.0x0T
            @Override // X.AbstractC1802540x0W
            public final C1802630x0f LIZIZ(Context context, C1797250wrz c1797250wrz) {
                if (context == null) {
                    return C1802640x0g.LIZ();
                }
                if (LiveWalletGPInsufficientFundGuidanceSetting.INSTANCE.getValue() != 0 && c1797250wrz.LIZ == 203 && c1797250wrz.LJI == 11) {
                    return C1802640x0g.LIZIZ();
                }
                return C1802640x0g.LIZ();
            }
        }, new AbstractC1802540x0W() { // from class: X.0x0V
            @Override // X.AbstractC1802540x0W
            public final C1802630x0f LIZIZ(Context context, C1797250wrz c1797250wrz) {
                if (context == null) {
                    return C1802640x0g.LIZ();
                }
                C1802410x0J c1802410x0J = c1797250wrz.LJIIIIZZ;
                if (c1802410x0J != null && c1802410x0J.LIZIZ == -205) {
                    return C1802640x0g.LIZIZ();
                }
                return C1802640x0g.LIZ();
            }
        }, new C1802670x0j(), new C1802660x0i(), new C1802750x0r(), new AbstractC1802540x0W() { // from class: X.0x0U
            @Override // X.AbstractC1802540x0W
            public final C1802630x0f LIZIZ(Context context, C1797250wrz c1797250wrz) {
                if (c1797250wrz.LIZ == 208) {
                    C786410Ut5.LJJZZIII(C820670WHh.LIZ, new Runnable() { // from class: X.00kN
                        @Override // java.lang.Runnable
                        public final void run() {
                            boolean zLIZ;
                            C1C7U.LIZ("PurchaseLockBlockedHandler@5820.handleRechargeException$1");
                            try {
                                C766270U4b.LJIIJJI(C497740JfY.LJIJI(2131844619));
                            } finally {
                                if (!zLIZ) {
                                }
                            }
                            C1C7U.LIZIZ("PurchaseLockBlockedHandler@5820.handleRechargeException$1");
                        }
                    });
                    return C1802640x0g.LIZIZ();
                }
                return C1802640x0g.LIZ();
            }
        }, C1802770x0t.LIZ, new AbstractC1802540x0W() { // from class: X.0x0X
            @Override // X.AbstractC1802540x0W
            public final C1802630x0f LIZIZ(Context context, C1797250wrz c1797250wrz) {
                return C1802640x0g.LIZ();
            }
        }, new C1802810x0x(), new InterfaceC1797320ws6() { // from class: X.0x0R
            @Override // X.InterfaceC1797320ws6
            public final InterfaceC1797280ws2 LIZ(Context context, InterfaceC1151090g3n interfaceC1151090g3n, String str) {
                C1802410x0J c1802410x0J;
                if ((interfaceC1151090g3n instanceof C1797250wrz) && (c1802410x0J = ((C1797250wrz) interfaceC1151090g3n).LJIIIIZZ) != null) {
                    C1802580x0a.LJ(context, c1802410x0J);
                    return C1802640x0g.LIZIZ();
                }
                return C1802640x0g.LIZ();
            }
        }));
        interfaceC1797260ws0.LIZIZ("exchange_fail_block", C1697810uHb.LJIILJJIL(new C1802810x0x(), new InterfaceC1797320ws6() { // from class: X.0x0Q
            @Override // X.InterfaceC1797320ws6
            public final InterfaceC1797280ws2 LIZ(Context context, InterfaceC1151090g3n interfaceC1151090g3n, String str) {
                int statusCode;
                int i;
                int i2 = 2131841598;
                if (interfaceC1151090g3n instanceof C1151120g3q) {
                    C1151120g3q c1151120g3q = (C1151120g3q) interfaceC1151090g3n;
                    C1802410x0J c1802410x0J = c1151120g3q.LJFF;
                    if (C1802460x0O.LIZ(c1151120g3q.LIZ)) {
                        if (c1802410x0J != null) {
                            C1802580x0a.LJ(context, c1802410x0J);
                            return C1802640x0g.LIZIZ();
                        }
                    } else {
                        Exception exc = c1151120g3q.LIZIZ;
                        String strLJIJI = C497740JfY.LJIJI(2131841598);
                        if (exc instanceof C501470JlZ) {
                            C501470JlZ c501470JlZ = (C501470JlZ) exc;
                            statusCode = c501470JlZ.getErrorCode();
                            strLJIJI = c501470JlZ.getPrompt();
                            if (strLJIJI == null) {
                                strLJIJI = C497740JfY.LJIJI(2131841598);
                            }
                        } else if (exc instanceof C1811850xFX) {
                            statusCode = ((C1811850xFX) exc).statusCode;
                        } else {
                            if (exc instanceof C1494690ozz) {
                                statusCode = ((C1494690ozz) exc).getStatusCode();
                            }
                            C766270U4b.LJIIJJI(C497740JfY.LJIJI(i2));
                            return C1802640x0g.LIZIZ();
                        }
                        if (statusCode != 10034) {
                            int i3 = 0;
                            if (statusCode != 40001) {
                                if (statusCode != 4005205) {
                                    if (statusCode != 4005285) {
                                        if (statusCode != 429) {
                                            switch (statusCode) {
                                                case 4005282:
                                                    i2 = 2131843929;
                                                    break;
                                                case 4005283:
                                                    i2 = 2131843930;
                                                    break;
                                            }
                                        } else {
                                            i2 = 2131844674;
                                        }
                                        C766270U4b.LJIIJJI(C497740JfY.LJIJI(i2));
                                    } else {
                                        IWalletExchange iWalletExchangeWalletExchange = ((IWalletService) C1161920gLG.LIZJ(IWalletService.class)).walletExchange();
                                        if (c1802410x0J != null) {
                                            i = c1802410x0J.LJIIJJI;
                                            i3 = c1802410x0J.LJIIL;
                                        } else {
                                            i = 0;
                                        }
                                        ((WalletExchange) iWalletExchangeWalletExchange).LJJIII(context, i, i3, strLJIJI);
                                    }
                                } else {
                                    C1803800x2Y.LIZ.getClass();
                                    C1803800x2Y.LJIJJ();
                                    C766270U4b.LJIIJJI(strLJIJI);
                                }
                            } else if (c1802410x0J != null && (c1802410x0J.LJIIJJI == 9 || c1802410x0J.LJIIJJI == 10)) {
                                C766270U4b.LIZLLL(2131841018);
                            }
                        } else {
                            C766270U4b.LJIIJJI(strLJIJI);
                        }
                        return C1802640x0g.LIZIZ();
                    }
                } else {
                    C766270U4b.LJIIJJI(C497740JfY.LJIJI(2131841598));
                }
                return C1802640x0g.LIZ();
            }
        }));
    }
}
