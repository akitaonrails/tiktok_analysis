package X;

import com.bytedance.android.live.wallet.IWalletCenter;
import com.bytedance.android.live.wallet.IWalletService;
import com.bytedance.android.live.wallet.model.WalletStruct;
import com.bytedance.android.live.wallet.model.websocket.WSBalanceInfo;
import com.bytedance.android.live.wallet.model.websocket.WSBalancePayload;
import com.bytedance.android.livesdk.livesetting.wallet.LiveBalanceTrackingSetting;
import com.bytedance.common.wschannel.model.WsChannelMsg;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.Iterator;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;

/* JADX INFO: renamed from: X.0x2h, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1803890x2h implements InterfaceC486470J5x {
    public static final C1803890x2h LL = new C1803890x2h();
    public static volatile boolean LLILLJJLI;

    @Override // X.InterfaceC486470J5x
    public final void LIZIZ(WsChannelMsg wsChannelMsg) {
        IWalletCenter iWalletCenterWalletCenter;
        WSBalancePayload wSBalancePayload;
        boolean z;
        boolean z2;
        boolean z3;
        InterfaceC1803290x1j rechargeService;
        IWalletService iWalletService = (IWalletService) C1161920gLG.LIZJ(IWalletService.class);
        if (iWalletService != null && (rechargeService = iWalletService.getRechargeService()) != null) {
            rechargeService.LJIIZILJ();
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(' ');
        sbLIZ.append(wsChannelMsg.msgId);
        sbLIZ.append("  ");
        byte[] bArrLIZ = wsChannelMsg.LIZ();
        Charset charset = Charsets.UTF_8;
        sbLIZ.append(new String(bArrLIZ, charset));
        C20441214yg.LJIIIZ("LiveWalletCoinsUpdateWS", C2188811AlT.LIZIZ(sbLIZ));
        try {
            wSBalancePayload = (WSBalancePayload) C19748512Ol.LIZIZ.LJII(new String(wsChannelMsg.LIZ(), charset), WSBalancePayload.class);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        if (wSBalancePayload == null) {
            long jNo0 = ((IWalletService) C1161920gLG.LIZJ(IWalletService.class)).walletCenter().No0();
            C20441214yg.LJIIIZ("LiveWalletCoinsUpdateWS", "Control: balance coin, call API to update");
            LIZLLL(wsChannelMsg, null, null);
            LIZ(0, 0, jNo0, false, false, false);
        } else {
            long jNo02 = ((IWalletService) C1161920gLG.LIZJ(IWalletService.class)).walletCenter().No0();
            C389001fE.LIZ("live_js_wallet_refresh_balance", null, System.currentTimeMillis(), false);
            if (wSBalancePayload.forceSync) {
                if (!wSBalancePayload.isQuickCharge && !wSBalancePayload.chargeStatus) {
                    z3 = false;
                } else {
                    z3 = true;
                }
                LIZ(wSBalancePayload.coinCount, wSBalancePayload.payChannel, jNo02, false, true, z3);
                C20441214yg.LJIIIZ("LiveWalletCoinsUpdateWS", "Treatment: force sync");
            } else {
                for (WSBalanceInfo wSBalanceInfo : wSBalancePayload.wsBalanceInfo) {
                    if (wSBalanceInfo.accountType == EnumC1988207qa.LIVE_BALANCE.getType()) {
                        LIZLLL(wsChannelMsg, Long.valueOf(wSBalanceInfo.scores), Long.valueOf(wSBalanceInfo.version));
                        WalletStruct walletStructTF1 = ((IWalletService) C1161920gLG.LIZJ(IWalletService.class)).walletCenter().TF1();
                        if (walletStructTF1 == null || walletStructTF1.LIZIZ(wSBalanceInfo.version)) {
                            ((IWalletService) C1161920gLG.LIZJ(IWalletService.class)).walletCenter().a11(wSBalanceInfo.accountType, wSBalanceInfo.scores, wSBalanceInfo.version);
                            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                            sbLIZ2.append("preDiamonds: ");
                            sbLIZ2.append(jNo02);
                            sbLIZ2.append(", newDiamonds ");
                            sbLIZ2.append(wSBalanceInfo.scores);
                            C20441214yg.LJIIIZ("LiveWalletCoinsUpdateWS", C2188811AlT.LIZIZ(sbLIZ2));
                            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                            sbLIZ3.append("balance after updated: ");
                            sbLIZ3.append(((IWalletService) C1161920gLG.LIZJ(IWalletService.class)).walletCenter().No0());
                            sbLIZ3.append('}');
                            C20441214yg.LJIIIZ("LiveWalletCoinsUpdateWS", C2188811AlT.LIZIZ(sbLIZ3));
                            long j = wSBalanceInfo.scores;
                            if (!wSBalancePayload.isQuickCharge && !wSBalancePayload.chargeStatus) {
                                z = false;
                            } else {
                                z = true;
                            }
                            LIZJ(jNo02, false, wSBalancePayload.coinCount, true, wSBalancePayload.payChannel, j, z);
                            C20441214yg.LJIIIZ("LiveWalletCoinsUpdateWS", "Treatment: balance coin direct update");
                        }
                    } else {
                        if (!wSBalancePayload.isQuickCharge && !wSBalancePayload.chargeStatus) {
                            z2 = false;
                        } else {
                            z2 = true;
                        }
                        LIZ(wSBalancePayload.coinCount, wSBalancePayload.payChannel, jNo02, true, true, z2);
                        C20441214yg.LJIIIZ("LiveWalletCoinsUpdateWS", "Treatment: exchange fetch");
                    }
                }
            }
        }
        IWalletService iWalletService2 = (IWalletService) C1161920gLG.LIZJ(IWalletService.class);
        if (iWalletService2 != null && (iWalletCenterWalletCenter = iWalletService2.walletCenter()) != null) {
            iWalletCenterWalletCenter.X41(EnumC1805570x5P.WEB_SOCKET);
        }
    }

    public static void LIZLLL(WsChannelMsg wsChannelMsg, Long l, Long l2) {
        boolean z;
        WsChannelMsg.MsgHeader next;
        long jLongValue;
        String str;
        Long lLJIILIIL;
        long jNo0 = ((IWalletService) C1161920gLG.LIZJ(IWalletService.class)).walletCenter().No0();
        boolean zLIZIZ = false;
        if (l != null && jNo0 == l.longValue()) {
            z = false;
        } else {
            z = true;
        }
        Iterator<WsChannelMsg.MsgHeader> it2 = wsChannelMsg.msgHeaders.iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                if (Intrinsics.LJFF(next.key, "completion_ws_create_time")) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        WsChannelMsg.MsgHeader msgHeader = next;
        long jLIZ = 0;
        if (msgHeader != null && (str = msgHeader.value) != null && (lLJIILIIL = C2095008Iq.LJIILIIL(str)) != null) {
            jLongValue = lLJIILIIL.longValue();
        } else {
            jLongValue = 0;
        }
        HashMap mapLJI = C2097608Jq.LJI(new Pair("ws_msg_id", wsChannelMsg.msgId), new Pair("ws_log_id", Long.valueOf(wsChannelMsg.logId)), new Pair("log_info", wsChannelMsg.logInfo), new Pair("state", wsChannelMsg.state.name()), new Pair("seq_id", Long.valueOf(wsChannelMsg.seqId)), new Pair("service", Integer.valueOf(wsChannelMsg.service)), new Pair("method", Integer.valueOf(wsChannelMsg.method)), new Pair("channel_id", Integer.valueOf(wsChannelMsg.channelId)), new Pair("frontier_url", C2203431BLp.LIZIZ.LIZJ()));
        if (jLongValue > 0) {
            long jLIZ2 = C158B.LIZ() - jLongValue;
            mapLJI.put("completion_ws_create_time", Long.valueOf(jLongValue));
            mapLJI.put("completion_ws_latency", Long.valueOf(jLIZ2));
        }
        if (l != null) {
            mapLJI.put("is_balance_changed", String.valueOf(C500260Jjc.LJJJI(Boolean.valueOf(z)) ? 1 : 0));
        }
        if (l2 != null) {
            mapLJI.put("balance_version", l2.toString());
        }
        ((IWalletService) C1161920gLG.LIZJ(IWalletService.class)).getWalletMonitorService().LIZ(EnumC1796260wqO.BOTH, "livesdk_wallet_coins_update_ws_receive", C2348809Ig.LIZLLL(mapLJI), null, null, null, "wallet");
        if (l2 != null && LiveBalanceTrackingSetting.INSTANCE.getValue()) {
            WalletStruct walletStructTF1 = ((IWalletService) C1161920gLG.LIZJ(IWalletService.class)).walletCenter().TF1();
            if (walletStructTF1 != null) {
                zLIZIZ = walletStructTF1.LIZIZ(l2.longValue());
            }
            IWalletCenter iWalletCenterWalletCenter = ((IWalletService) C1161920gLG.LIZJ(IWalletService.class)).walletCenter();
            String value = EnumC1114500f6m.WALLET_WEBSOCKET_WEB.getValue();
            WalletStruct walletStructTF12 = ((IWalletService) C1161920gLG.LIZJ(IWalletService.class)).walletCenter().TF1();
            if (walletStructTF12 != null) {
                jLIZ = walletStructTF12.LIZ();
            }
            iWalletCenterWalletCenter.gi0(jLIZ, l2.longValue(), zLIZIZ, value);
        }
    }

    public static void LIZ(final int i, final int i2, final long j, final boolean z, final boolean z2, final boolean z3) {
        ((IWalletService) C1161920gLG.LIZJ(IWalletService.class)).walletCenter().aF2(EnumC1805800x5m.GLOBAL, EnumC1805420x5A.WALLET_WS_MSG, new InterfaceC1803980x2q() { // from class: X.0x2i
            @Override // X.InterfaceC1803980x2q
            public final void LIZIZ(Throwable th) {
            }

            @Override // X.InterfaceC1803980x2q
            public final void LIZ(long j2) {
                C1803890x2h.LIZJ(j, z, i, z2, i2, j2, z3);
            }
        });
    }

    public static void LIZJ(long j, boolean z, int i, boolean z2, int i2, long j2, boolean z3) {
        long j3 = j2 - j;
        if (j3 <= 0 && !z2) {
            return;
        }
        if (z3) {
            C784440Upu.LIZ().LIZIZ(new C1088050eQ7(i, z, z2, Long.valueOf(j2), i2));
        } else {
            C784440Upu.LIZ().LIZIZ(new C1124340fMe((int) j3, z, false, 0L, true, z2, Long.valueOf(j2), i2, 24));
        }
    }
}
