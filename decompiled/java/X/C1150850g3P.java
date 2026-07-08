package X;

import Y.ARunnableS117S0100000_17;
import android.content.Context;
import android.os.Bundle;
import com.bytedance.android.live.wallet.WalletExchange;
import com.bytedance.android.live.wallet.model.ExchangeParams;
import com.bytedance.android.livesdk.livesetting.other.LiveExchangeDialogNew;
import com.bytedance.android.livesdk.livesetting.wallet.LiveGiftExchangeFESchema;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdk.wallet.CustomErrorExtra;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.android.ugc.effectmanager.common.ConcurrentHashSet;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS205S0000000_17;
import kotlin.jvm.internal.AFwS254S0000000_17;

/* JADX INFO: renamed from: X.0g3P, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1150850g3P {
    public static final /* synthetic */ int LIZ = 0;

    /* JADX WARN: Removed duplicated region for block: B:38:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x009c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.C1151080g3m LIZJ() {
        /*
            java.lang.Class<com.bytedance.android.live.wallet.IWalletService> r0 = com.bytedance.android.live.wallet.IWalletService.class
            X.006A r0 = X.C1161920gLG.LIZJ(r0)
            com.bytedance.android.live.wallet.IWalletService r0 = (com.bytedance.android.live.wallet.IWalletService) r0
            com.bytedance.android.live.wallet.IWalletCenter r0 = r0.walletCenter()
            com.bytedance.android.live.wallet.model.WalletStruct r1 = r0.TF1()
            java.lang.Class<com.bytedance.android.live.wallet.IWalletService> r0 = com.bytedance.android.live.wallet.IWalletService.class
            X.006A r0 = X.C1161920gLG.LIZJ(r0)
            com.bytedance.android.live.wallet.IWalletService r0 = (com.bytedance.android.live.wallet.IWalletService) r0
            com.bytedance.android.live.wallet.IWalletCenter r0 = r0.walletCenter()
            com.bytedance.android.live.wallet.model.BalanceStruct r12 = r0.g52()
            r6 = 0
            if (r1 == 0) goto La4
            com.bytedance.android.live.wallet.model.BalanceStructExtra r10 = r1.LIZ
        L25:
            if (r12 == 0) goto La1
            com.bytedance.android.live.wallet.model.BalanceStructExtra r9 = r12.exchangeInfo
            com.bytedance.android.live.wallet.model.UserBalance r5 = r12.userBalance
        L2b:
            if (r1 == 0) goto L2f
            com.bytedance.android.live.wallet.model.RevenueExchange r6 = r1.revenue
        L2f:
            r3 = -1
            r4 = 2
            r11 = 1
            r7 = 0
            if (r6 == 0) goto L82
            boolean r0 = r6.enableExchange
            if (r0 == 0) goto L82
            if (r10 == 0) goto L82
            long r1 = r6.balance
            int r0 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r0 <= 0) goto L51
            long r1 = r10.getCoins()
            int r0 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r0 <= 0) goto L80
        L4a:
            r3 = -2
        L4b:
            X.0g3m r0 = new X.0g3m
            r0.<init>(r3, r4)
            return r0
        L51:
            if (r12 == 0) goto L70
            boolean r0 = r12.validUser
            if (r0 != r11) goto L70
            if (r9 == 0) goto L70
            if (r5 == 0) goto L70
            long r1 = r5.balance
            int r0 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r0 <= 0) goto L70
            long r1 = r9.getCoins()
            int r0 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r0 > 0) goto L4b
            long r1 = r5.balance
            int r0 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r0 <= 0) goto L9c
            goto L9a
        L70:
            long r1 = r10.getCoins()
            int r0 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r0 > 0) goto L4a
            long r1 = r6.balance
            int r0 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r0 > 0) goto L80
            r4 = 0
            goto L4a
        L80:
            r4 = 1
            goto L4a
        L82:
            if (r12 == 0) goto L9e
            boolean r0 = r12.validUser
            if (r0 != r11) goto L9e
            if (r9 == 0) goto L9e
            if (r5 == 0) goto L9e
            long r1 = r9.getCoins()
            int r0 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r0 > 0) goto L4b
            long r1 = r5.balance
            int r0 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r0 <= 0) goto L9c
        L9a:
            r4 = 1
            goto L4b
        L9c:
            r4 = 0
            goto L4b
        L9e:
            r3 = 0
            r4 = 0
            goto L4b
        La1:
            r9 = r6
            r5 = r6
            goto L2b
        La4:
            r10 = r6
            goto L25
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1150850g3P.LIZJ():X.0g3m");
    }

    public static final void LIZ(Bundle bundle) {
        C1151080g3m c1151080g3mLIZJ = LIZJ();
        bundle.putInt("key_bundle_show_balance", c1151080g3mLIZJ.LIZ);
        bundle.putInt("key_bundle_can_exchange", c1151080g3mLIZJ.LIZIZ);
    }

    public static final boolean LIZLLL(Context context, C1144350fsv c1144350fsv, InterfaceC1149850g1n interfaceC1149850g1n) {
        if (LiveGiftExchangeFESchema.INSTANCE.isEnableLynxGiftExchange()) {
            return C1150830g3N.LIZIZ(context, interfaceC1149850g1n, c1144350fsv, "exchange");
        }
        ConcurrentHashSet<String> concurrentHashSet = AbstractC1149720g1a.LJI;
        InterfaceC1150010g23 interfaceC1150010g23LIZ = C1144360fsw.LIZ(EnumC1144380fsy.LIVE_INCOME, context, c1144350fsv, interfaceC1149850g1n, WalletExchange.LL.LJFF(11));
        if (interfaceC1150010g23LIZ != null) {
            return interfaceC1150010g23LIZ.show();
        }
        return false;
    }

    public static final boolean LJ(Context context, C1144350fsv c1144350fsv, InterfaceC1149850g1n interfaceC1149850g1n) {
        if (LiveGiftExchangeFESchema.INSTANCE.isEnableLynxGiftExchange()) {
            return C1150830g3N.LIZJ(context, interfaceC1149850g1n, c1144350fsv, "exchange");
        }
        if (LiveExchangeDialogNew.INSTANCE.getValue()) {
            ConcurrentHashSet<String> concurrentHashSet = AbstractC1149720g1a.LJI;
            InterfaceC1150010g23 interfaceC1150010g23LIZ = C1144360fsw.LIZ(EnumC1144380fsy.UG_INCOME, context, c1144350fsv, interfaceC1149850g1n, WalletExchange.LL.LJFF(11));
            if (interfaceC1150010g23LIZ != null) {
                return interfaceC1150010g23LIZ.show();
            }
            return false;
        }
        return true;
    }

    public static void LIZIZ(final long j, final Context context, final InterfaceC1149850g1n interfaceC1149850g1n, final ExchangeParams exchangeParams, final DataChannel dataChannel, final String str, final Function0 function0, final Function1 function1, final boolean z) {
        WalletExchange.LL.LJ(context, str, z, exchangeParams, new InterfaceC1151070g3l() { // from class: X.0g3h
            @Override // X.InterfaceC1151070g3l
            public final void LIZ(final Throwable th) {
                int statusCode;
                int i;
                Exception exc;
                function1.invoke(th);
                String strLJIJI = C497740JfY.LJIJI(2131841598);
                if (th instanceof C501470JlZ) {
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
                final Context context2 = context;
                if (context2 != null) {
                    final ExchangeParams exchangeParams2 = exchangeParams;
                    final DataChannel dataChannel2 = dataChannel;
                    final long j2 = j;
                    final String str2 = str;
                    final boolean z2 = z;
                    final InterfaceC1149850g1n interfaceC1149850g1n2 = interfaceC1149850g1n;
                    Runnable runnable = new Runnable() { // from class: X.0g3W
                        public final void LIZ() {
                            exchangeParams2.skipKycReminder = true;
                            Throwable th2 = th;
                            CustomErrorExtra customErrorExtra = CustomErrorExtra.getCustomErrorExtra(th2 instanceof C501470JlZ ? (Exception) th2 : null);
                            exchangeParams2.penaltyWarningSkip = customErrorExtra == null ? "" : customErrorExtra.getPenaltyWarningSkip();
                            Context context3 = context2;
                            DataChannel dataChannel3 = dataChannel2;
                            C1150850g3P.LIZIZ(j2, context3, interfaceC1149850g1n2, exchangeParams2, dataChannel3, str2, AFwS205S0000000_17.get$arr$(3), AFwS254S0000000_17.get$arr$(6), z2);
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            boolean zLIZ;
                            C1C7U.LIZ("ExchangeHandleUtil@354b.doExchange$3$onExchangeFail$1$onNegative$1");
                            try {
                                LIZ();
                            } finally {
                                if (!zLIZ) {
                                }
                            }
                            C1C7U.LIZIZ("ExchangeHandleUtil@354b.doExchange$3$onExchangeFail$1$onNegative$1");
                        }
                    };
                    ARunnableS117S0100000_17 aRunnableS117S0100000_17 = new ARunnableS117S0100000_17(interfaceC1149850g1n2, 1);
                    C1802410x0J c1802410x0J = new C1802410x0J();
                    c1802410x0J.LIZIZ = statusCode;
                    c1802410x0J.LJIIJJI = exchangeParams2.source;
                    c1802410x0J.LJIIL = exchangeParams2.way;
                    c1802410x0J.LJIILIIL = false;
                    if (th instanceof Exception) {
                        exc = (Exception) th;
                    } else {
                        exc = null;
                    }
                    c1802410x0J.LIZLLL = exc;
                    C1151120g3q c1151120g3qLIZ = C1151130g3r.LIZ(c1802410x0J);
                    c1151120g3qLIZ.LIZJ = aRunnableS117S0100000_17;
                    c1151120g3qLIZ.LIZLLL = runnable;
                    c1151120g3qLIZ.LJ = exchangeParams2;
                    if (C1797270ws1.LIZ().LIZ(context2, c1151120g3qLIZ, "exchange_fail_block", null).LIZIZ()) {
                        return;
                    }
                }
                if (statusCode == 4005205) {
                    C1803800x2Y.LIZ.getClass();
                    C1803800x2Y.LJIJJ();
                    C766270U4b.LJIIJJI(strLJIJI);
                } else if (statusCode == 10034) {
                    C766270U4b.LJIIJJI(strLJIJI);
                    InterfaceC1149850g1n interfaceC1149850g1n3 = interfaceC1149850g1n;
                    if (interfaceC1149850g1n3 != null) {
                        interfaceC1149850g1n3.LIZJ();
                    }
                } else {
                    if (statusCode != 429) {
                        switch (statusCode) {
                            case 4005282:
                                i = 2131843929;
                                break;
                            case 4005283:
                                i = 2131843930;
                                break;
                            default:
                                i = 2131841598;
                                break;
                        }
                    } else {
                        i = 2131844674;
                    }
                    C766270U4b.LIZLLL(i);
                    InterfaceC1149850g1n interfaceC1149850g1n4 = interfaceC1149850g1n;
                    if (interfaceC1149850g1n4 != null) {
                        interfaceC1149850g1n4.LIZJ();
                    }
                }
                long j3 = j;
                C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_recharge_exchange_failed");
                c474500IjALIZ.LJIL();
                c474500IjALIZ.LJJII(Long.valueOf(j3), "gift_id");
                c474500IjALIZ.LJJII(Integer.valueOf(statusCode), "error_code");
                c474500IjALIZ.LJJII("live_detail", "request_page");
                c474500IjALIZ.LJJII(Long.valueOf(UserService.getInstance().user().getCurrentUserId()), "user_id");
                c474500IjALIZ.LIZ();
                C1149680g1W.LJIIZILJ(statusCode, dataChannel, "anchor_income", str, false);
            }

            @Override // X.InterfaceC1151070g3l
            public final void LIZIZ(String str2) {
                function0.invoke();
                C1149680g1W.LJIILLIIL(dataChannel, j, str, exchangeParams.way, false);
                if (WalletExchange.LL.LJIL()) {
                    C766270U4b.LIZLLL(2131852251);
                } else {
                    C766270U4b.LIZLLL(2131841597);
                }
                C784440Upu.LIZ().LIZIZ(new C1149590g1N());
                C784440Upu.LIZ().LIZIZ(new C1124340fMe((int) exchangeParams.coinsCount, true, false, 0L, false, false, null, 0, 1016));
            }
        });
    }
}
