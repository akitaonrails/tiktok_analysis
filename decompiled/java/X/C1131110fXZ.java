package X;

import Y.ARunnableS117S0100000_17;
import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import androidx.fragment.app.FragmentManager;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.gift.FastGiftVisibleChannel;
import com.bytedance.android.live.gift.GiftDialogDismissEvent;
import com.bytedance.android.live.gift.GiftGalleryMetrics;
import com.bytedance.android.live.gift.GiftSendPreCheckStart;
import com.bytedance.android.live.gift.GiftStartSendEvent;
import com.bytedance.android.live.gift.SendGiftAfterExchange;
import com.bytedance.android.live.gift.SendUpdateToUserEvent;
import com.bytedance.android.live.gift.SendUpdateToUserEventForFastGift;
import com.bytedance.android.live.gift.ShowRechargeDialogEvent;
import com.bytedance.android.live.wallet.IWalletCenter;
import com.bytedance.android.live.wallet.IWalletExchange;
import com.bytedance.android.live.wallet.IWalletService;
import com.bytedance.android.live.wallet.WalletExchange;
import com.bytedance.android.live.wallet.model.BalanceStructExtra;
import com.bytedance.android.live.wallet.model.WalletStruct;
import com.bytedance.android.livesdk.FastGiftCombEvent;
import com.bytedance.android.livesdk.RechargeExchangeCoinsDialogShowing;
import com.bytedance.android.livesdk.api.coin.incentive.ICoinIncentiveService;
import com.bytedance.android.livesdk.api.revenue.challenge.GiftChallengeChannel;
import com.bytedance.android.livesdk.api.revenue.level.IUserLevelService;
import com.bytedance.android.livesdk.api.revenue.strategy.IRevenueStrategyService;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.dataChannel.UserIsAnchorChannel;
import com.bytedance.android.livesdk.gift.base.platform.core.manager.GiftManager;
import com.bytedance.android.livesdk.gift.model.GiftListResult;
import com.bytedance.android.livesdk.gift.model.GiftResultData;
import com.bytedance.android.livesdk.gift.model.GiftSendFansClubInfo;
import com.bytedance.android.livesdk.gift.model.GiftStrategyData;
import com.bytedance.android.livesdk.gift.model.GiftsInfo;
import com.bytedance.android.livesdk.gift.model.SendGiftResult;
import com.bytedance.android.livesdk.gift.model.SponsorshipInfo;
import com.bytedance.android.livesdk.gift.model.TeamRankProgress;
import com.bytedance.android.livesdk.livesetting.gift.LiveGiftEffectLayerEnabledSetting;
import com.bytedance.android.livesdk.livesetting.gift.LiveGiftRankingExclusiveTabSetting;
import com.bytedance.android.livesdk.livesetting.gift.LiveGiftSendInterval;
import com.bytedance.android.livesdk.livesetting.level.LiveUserLevelBackEnableSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.FlyMicGiftPhase2ConfigSetting;
import com.bytedance.android.livesdk.livesetting.wallet.LiveBalanceTrackingSetting;
import com.bytedance.android.livesdk.model.Gift;
import com.bytedance.android.livesdk.model.message.GiftMessage;
import com.bytedance.android.livesdk.model.message.GiftMonitorInfo;
import com.bytedance.android.livesdk.model.message.common.Text;
import com.bytedance.android.livesdk.model.message.common.TextPiece;
import com.bytedance.android.livesdk.model.message.common.TextPieceUser;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdk.widgets.giftwidget.presenter.FastGiftConfirmDialog;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.message.CommonMessageData;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.Unit;
import kotlin.jvm.internal.AwS596S0100000_17;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0fXZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1131110fXZ implements InterfaceC1131620fYO {
    public boolean LIZJ;
    public DataChannel LJ;
    public BPEAHandler LJFF;
    public Context LJI;
    public boolean LJII;
    public InterfaceC1131100fXY LJIIIIZZ;
    public InterfaceC1132010fZ1 LJIIIZ;
    public int LJIIJJI;
    public final ArrayDeque<InterfaceC1131100fXY> LIZ = new ArrayDeque<>();
    public final ArrayDeque<InterfaceC1131100fXY> LIZIZ = new ArrayDeque<>();
    public final long LIZLLL = (long) (LiveGiftSendInterval.INSTANCE.getValue() * LSPassThroughRecordSizeConfig.DEFAULT);
    public boolean LJIIJ = true;
    public final C1131760fYc LJIIL = new C1131760fYc(this);
    public final ARunnableS117S0100000_17 LJIILIIL = new ARunnableS117S0100000_17(this, 240);
    public final AwS596S0100000_17 LJIILJJIL = new AwS596S0100000_17(this, 552);
    public final C1131880fYo LJIILL = new C476750Imn<InterfaceC2262081DgM>() { // from class: X.0fYo
        @Override // X.C476750Imn, X.InterfaceC626120Oh8
        public final void onNext(Object obj) {
            ((IWalletService) C1161920gLG.LIZJ(IWalletService.class)).walletCenter().Ri2(EnumC1805420x5A.USER_LOGIN_INFO_REFRESHED);
        }
    };

    @Override // X.InterfaceC1131620fYO
    public final void LJIIJJI() {
        this.LJII = false;
    }

    public final void LIZIZ() {
        InterfaceC1131100fXY interfaceC1131100fXYPollFirst;
        if (this.LIZ.isEmpty() || (interfaceC1131100fXYPollFirst = this.LIZ.pollFirst()) == null) {
            return;
        }
        LJJI(interfaceC1131100fXYPollFirst);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("sendGift, giftId:");
        sbLIZ.append(interfaceC1131100fXYPollFirst.getGiftId());
        C20441214yg.LIZIZ("SendGiftParallel", C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // X.InterfaceC1131620fYO
    public final void LJIILL() {
        InterfaceC1131100fXY interfaceC1131100fXYPollFirst = this.LIZ.pollFirst();
        if (interfaceC1131100fXYPollFirst != null) {
            LJJI(interfaceC1131100fXYPollFirst);
        }
    }

    @Override // X.InterfaceC1131620fYO
    public final boolean LJ() {
        return this.LJIIJ;
    }

    @Override // X.InterfaceC1131620fYO
    public final C1131880fYo LJI() {
        return this.LJIILL;
    }

    @Override // X.InterfaceC1131620fYO
    public final InterfaceC1132010fZ1 LJII() {
        return this.LJIIIZ;
    }

    @Override // X.InterfaceC1131620fYO
    public final Context getContext() {
        return this.LJI;
    }

    @Override // X.InterfaceC1131620fYO
    public final DataChannel getDataChannel() {
        return this.LJ;
    }

    @Override // X.InterfaceC1131620fYO
    public final int getRetryCount() {
        return this.LJIIJJI;
    }

    public static String LIZJ(InterfaceC1131100fXY interfaceC1131100fXY) {
        long giftId = interfaceC1131100fXY.getGiftId();
        C1143180fr2 c1143180fr2 = C1143170fr1.LIZJ;
        if (c1143180fr2 != null && giftId == c1143180fr2.LJI) {
            return "combo_click_gift";
        }
        interfaceC1131100fXY.getGiftId();
        return "single_gift";
    }

    public final boolean LIZ(final InterfaceC1131100fXY interfaceC1131100fXY) {
        FragmentManager fragmentManagerLJIL;
        String str;
        FragmentManager fragmentManager;
        boolean zLIZIZ = C1103140eoS.LIZIZ(interfaceC1131100fXY.getGiftId());
        if (interfaceC1131100fXY.LJJJJJL() && zLIZIZ) {
            Boolean boolLIZ = InterfaceC1094160eZy.D1.LIZ();
            Boolean bool = Boolean.TRUE;
            final boolean zLJFF = Intrinsics.LJFF(boolLIZ, bool);
            Context context = this.LJI;
            if (context != null) {
                fragmentManagerLJIL = C520010KaN.LJIL(context, false);
            } else {
                fragmentManagerLJIL = null;
            }
            InterfaceC1132680fa6 interfaceC1132680fa6 = new InterfaceC1132680fa6() { // from class: X.0fYN
                @Override // X.InterfaceC1132680fa6
                public final void LIZ() throws JSONException {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("showNewConfirmDialog sendGiftWithRetrofit ");
                    sbLIZ.append(zLJFF);
                    C20441214yg.LJIIIZ("NewGifter", C2188811AlT.LIZIZ(sbLIZ));
                    interfaceC1131100fXY.LJJLL(zLJFF ? "first_popup_new" : "first_popup");
                    C1126160fPa c1126160fPaLJJLIIIJJIZ = interfaceC1131100fXY.LJJLIIIJJIZ();
                    if ((c1126160fPaLJJLIIIJJIZ == null || c1126160fPaLJJLIIIJJIZ.LIZJ == null) && this.LIZ.LJJIIZ(interfaceC1131100fXY)) {
                        return;
                    }
                    this.LIZ.LJJIIJ(interfaceC1131100fXY);
                    DataChannel dataChannel = this.LIZ.LJ;
                    if (dataChannel != null) {
                        dataChannel.LC0(FastGiftCombEvent.class, Boolean.TRUE);
                    }
                }
            };
            DataChannel dataChannel = this.LJ;
            C474500IjA c474500IjALIZ = C0IJT.LIZ("shortcut_popup_show");
            c474500IjALIZ.LJIL();
            c474500IjALIZ.LIZ();
            FastGiftConfirmDialog fastGiftConfirmDialog = new FastGiftConfirmDialog();
            fastGiftConfirmDialog.LLJIJIL = interfaceC1132680fa6;
            fastGiftConfirmDialog.LLJJI = zLJFF;
            if (dataChannel != null && (fragmentManager = (FragmentManager) dataChannel.gg0(C748880TZe.class)) != null) {
                fragmentManagerLJIL = fragmentManager;
            } else if (fragmentManagerLJIL == null) {
                return true;
            }
            fastGiftConfirmDialog.show(fragmentManagerLJIL, "FastGiftConfirmDialog");
            if (dataChannel != null) {
                dataChannel.zW(FastGiftVisibleChannel.class, bool);
            }
            fastGiftConfirmDialog.setOnDismissListener(new DialogInterfaceOnDismissListenerC1151680g4k(dataChannel, 3));
            C474500IjA c474500IjALIZ2 = C0IJT.LIZ("convenient_gift_first_popup_show");
            c474500IjALIZ2.LJIL();
            if (zLJFF) {
                str = "new";
            } else {
                str = "normal";
            }
            c474500IjALIZ2.LJJII(str, "popup_type");
            c474500IjALIZ2.LIZ();
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC1131620fYO
    public final void LIZLLL(boolean z) {
        this.LJIIJ = z;
    }

    @Override // X.InterfaceC1131620fYO
    public final void LJFF(boolean z) {
        if (z) {
            C784440Upu.LIZ().LIZIZ(new Object() { // from class: X.0fXG
            });
            this.LIZ.clear();
            this.LJII = false;
        }
        C784440Upu.LIZ().LIZIZ(new Object() { // from class: X.0fSf
        });
        C784440Upu.LIZ().LIZIZ(new Object() { // from class: X.0fa5
        });
    }

    @Override // X.InterfaceC1131620fYO
    public final void LJIIL(SendGiftResult sendGiftResult) {
        GiftManager.inst().setGiftChallengeProgress(sendGiftResult.giftChallengeProgress);
        DataChannel dataChannel = this.LJ;
        if (dataChannel != null) {
            dataChannel.zW(GiftChallengeChannel.class, sendGiftResult.giftChallengeProgress);
        }
    }

    @Override // X.InterfaceC1131620fYO
    public final String LJIILJJIL(SendGiftResult sendGiftResult) {
        if (sendGiftResult != null) {
            try {
                String str = sendGiftResult.monitorExtra;
                if (str != null) {
                    return C2203708kF.LIZIZ(str);
                }
                return "";
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                C20441214yg.LJFF("GiftQueueSender", "Error parsing SendGiftResult", e);
                return "";
            }
        }
        return "";
    }

    @Override // X.InterfaceC1131620fYO
    public final void LJIILLIIL(Room room) {
        boolean zLJFF;
        if (room != null && LiveUserLevelBackEnableSetting.INSTANCE.getValue()) {
            ((IUserLevelService) C1161920gLG.LIZJ(IUserLevelService.class)).gN("level_back", Boolean.FALSE, "gifting");
            C1129650fVD giftRepository = GiftManager.inst().getGiftRepository();
            long id = room.getId();
            DataChannel dataChannel = this.LJ;
            if (dataChannel != null) {
                zLJFF = Intrinsics.LJFF(dataChannel.gg0(UserIsAnchorChannel.class), Boolean.TRUE);
            } else {
                zLJFF = false;
            }
            giftRepository.LJFF(15, id, zLJFF, new AbstractC1132980faa() { // from class: X.0fYl
                @Override // X.AbstractC1132980faa
                public final void LIZIZ(List<Gift> list) {
                }

                @Override // X.AbstractC1132980faa
                public final void LIZJ(List list, GiftsInfo giftsInfo, GiftStrategyData giftStrategyData, long j, int i) {
                    InterfaceC1132010fZ1 interfaceC1132010fZ1 = this.LIZ.LJIIIZ;
                    if (interfaceC1132010fZ1 != null) {
                        interfaceC1132010fZ1.LJJIIJZLJL(list);
                    }
                }
            }, "");
        }
    }

    @Override // X.InterfaceC1131620fYO
    public final void LJIIZILJ(int i) {
        this.LJIIJJI = i;
    }

    @Override // X.InterfaceC1131620fYO
    public final void LJIJJLI(InterfaceC1131100fXY interfaceC1131100fXY) {
        boolean zLJJIFFI;
        C1132120fZC c1132120fZC;
        String source = interfaceC1131100fXY.getSource();
        long jLJJJJIZL = ((long) interfaceC1131100fXY.LJJJJIZL()) - interfaceC1131100fXY.LJIJI();
        if (C1131140fXc.LIZJ(interfaceC1131100fXY) != 0) {
            C1126160fPa c1126160fPaLJJLIIIJJIZ = interfaceC1131100fXY.LJJLIIIJJIZ();
            if (c1126160fPaLJJLIIIJJIZ != null && (c1132120fZC = c1126160fPaLJJLIIIJJIZ.LIZJ) != null) {
                zLJJIFFI = c1132120fZC.LIZJ;
            } else {
                zLJJIFFI = interfaceC1131100fXY.LJJIFFI();
            }
            if (zLJJIFFI) {
                C766270U4b.LIZLLL(2131841612);
            } else {
                if (source != null && jLJJJJIZL > 0) {
                    C766270U4b.LJIIJJI(C497740JfY.LJIJJ(2131841638, C497740JfY.LJIJI(2131841632)));
                    IWalletExchange iWalletExchangeWalletExchange = ((IWalletService) C1161920gLG.LIZJ(IWalletService.class)).walletExchange();
                    Context context = this.LJI;
                    DataChannel dataChannel = this.LJ;
                    int iLIZJ = C1131140fXc.LIZJ(interfaceC1131100fXY);
                    Long lValueOf = Long.valueOf(interfaceC1131100fXY.getGiftId());
                    Long lValueOf2 = Long.valueOf(jLJJJJIZL);
                    C1129570fV5 c1129570fV5 = C1129570fV5.LIZ;
                    String source2 = interfaceC1131100fXY.getSource();
                    long giftId = interfaceC1131100fXY.getGiftId();
                    c1129570fV5.getClass();
                    ((WalletExchange) iWalletExchangeWalletExchange).LJIJJ(context, dataChannel, iLIZJ, lValueOf, source, lValueOf2, C1129570fV5.LIZ(interfaceC1131100fXY, source2, giftId), interfaceC1131100fXY.LJJLIIJ(), interfaceC1131100fXY.LJZL().LIZIZ);
                }
                C766270U4b.LIZLLL(2131841610);
            }
            if (source == null) {
                source = "";
            }
            IWalletExchange iWalletExchangeWalletExchange2 = ((IWalletService) C1161920gLG.LIZJ(IWalletService.class)).walletExchange();
            Context context2 = this.LJI;
            DataChannel dataChannel2 = this.LJ;
            int iLIZJ2 = C1131140fXc.LIZJ(interfaceC1131100fXY);
            Long lValueOf3 = Long.valueOf(interfaceC1131100fXY.getGiftId());
            Long lValueOf22 = Long.valueOf(jLJJJJIZL);
            C1129570fV5 c1129570fV52 = C1129570fV5.LIZ;
            String source22 = interfaceC1131100fXY.getSource();
            long giftId2 = interfaceC1131100fXY.getGiftId();
            c1129570fV52.getClass();
            ((WalletExchange) iWalletExchangeWalletExchange2).LJIJJ(context2, dataChannel2, iLIZJ2, lValueOf3, source, lValueOf22, C1129570fV5.LIZ(interfaceC1131100fXY, source22, giftId2), interfaceC1131100fXY.LJJLIIJ(), interfaceC1131100fXY.LJZL().LIZIZ);
        }
    }

    public final void LJJI(final InterfaceC1131100fXY interfaceC1131100fXY) throws JSONException {
        BalanceStructExtra balanceStructExtra;
        EnumC1131780fYe enumC1131780fYe;
        C1128760fTm.LJIIJ.getClass();
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_gift_send_precheck_start");
        c474500IjALIZ.LJIL();
        c474500IjALIZ.LJJII(C1128760fTm.LJFF(interfaceC1131100fXY.LJJJJZ().LIZ), "enter_from");
        c474500IjALIZ.LIZ();
        DataChannel dataChannel = this.LJ;
        if (dataChannel != null) {
            dataChannel.FQ2(GiftSendPreCheckStart.class);
        }
        C1131760fYc c1131760fYc = this.LJIIL;
        c1131760fYc.getClass();
        C1132030fZ3 c1132030fZ3 = new C1132030fZ3(c1131760fYc.LIZ(), new C1132180fZI(interfaceC1131100fXY, null));
        Iterator it2 = ((List) c1131760fYc.LIZJ.getValue()).iterator();
        while (it2.hasNext()) {
            try {
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C1AF0.LJ(th);
            }
            if (((AbstractC1131860fYm) it2.next()).LIZ(c1132030fZ3) instanceof C1132370fZb) {
                return;
            }
        }
        boolean zLJI = MethodIDManager.LJI(138036);
        int i = 2;
        if (interfaceC1131100fXY.LJLILLLLZI() != null) {
            final String strLJLILLLLZI = interfaceC1131100fXY.LJLILLLLZI();
            C1129570fV5 c1129570fV5 = C1129570fV5.LIZ;
            String source = interfaceC1131100fXY.getSource();
            long giftId = interfaceC1131100fXY.getGiftId();
            c1129570fV5.getClass();
            String strLIZ = C1129570fV5.LIZ(interfaceC1131100fXY, source, giftId);
            String source2 = interfaceC1131100fXY.getSource();
            if (source2 == null) {
                source2 = "";
            }
            DataChannel dataChannel2 = this.LJ;
            int iLJJJJIZL = interfaceC1131100fXY.LJJJJIZL();
            long giftId2 = interfaceC1131100fXY.getGiftId();
            String strLIZJ = LIZJ(interfaceC1131100fXY);
            final C1144350fsv c1144350fsv = new C1144350fsv(dataChannel2, iLJJJJIZL, giftId2, source2, strLIZ, strLIZJ, interfaceC1131100fXY.LJZL().LIZIZ, null);
            IWalletExchange iWalletExchangeWalletExchange = ((IWalletService) C1161920gLG.LIZJ(IWalletService.class)).walletExchange();
            Context context = this.LJI;
            InterfaceC1149850g1n interfaceC1149850g1n = new InterfaceC1149850g1n() { // from class: X.0fXu
                @Override // X.InterfaceC1149850g1n
                public final void LIZ(int i2) {
                }

                @Override // X.InterfaceC1149850g1n
                public final void LIZJ() {
                }

                @Override // X.InterfaceC1149850g1n
                public final void LIZLLL() {
                }

                @Override // X.InterfaceC1149850g1n
                public final void LJ(int i2, boolean z) {
                }

                @Override // X.InterfaceC1149850g1n
                public final void LJFF() {
                }

                @Override // X.InterfaceC1149850g1n
                public final void onShow() {
                }

                @Override // X.InterfaceC1149850g1n
                public final void LIZIZ(int i2, long j, boolean z, boolean z2, int i3, Boolean bool) {
                    boolean z3;
                    boolean z4;
                    interfaceC1131100fXY.LJJLIIIJL(strLJLILLLLZI);
                    boolean zLIZ = C1131530fYF.LIZ(interfaceC1131100fXY.getGiftId(), this.LJ, interfaceC1131100fXY.getSource());
                    boolean z5 = true;
                    if (C1131530fYF.LJ(interfaceC1131100fXY.getSource()) && zLIZ) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (C1131530fYF.LJFF(interfaceC1131100fXY.getSource()) && zLIZ) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    interfaceC1131100fXY.LJLJJI(z);
                    interfaceC1131100fXY.LJIIIZ(((IWalletService) C1161920gLG.LIZJ(IWalletService.class)).walletCenter().No0());
                    interfaceC1131100fXY.LJLJLJ(i3);
                    InterfaceC1131100fXY interfaceC1131100fXY2 = interfaceC1131100fXY;
                    if (z3 || z4) {
                        z5 = false;
                    }
                    interfaceC1131100fXY2.LJLLILLLL(z5);
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("onSendGiftWithExchange, exchangeType == ");
                    sbLIZ.append(i2);
                    C20441214yg.LJIIIZ("live_ug_task_loading_log", C2188811AlT.LIZIZ(sbLIZ));
                    DataChannel dataChannel3 = this.LJ;
                    if (dataChannel3 != null) {
                        interfaceC1131100fXY.getSource();
                        interfaceC1131100fXY.getGiftId();
                        dataChannel3.LC0(SendGiftAfterExchange.class, new C1132660fa4());
                    }
                    if (Intrinsics.LJFF(strLJLILLLLZI, "pre_claim")) {
                        this.LJJIIJZLJL(interfaceC1131100fXY, c1144350fsv, false, "creator_task_page");
                        return;
                    }
                    interfaceC1131100fXY.LJJIJLIJ(i2);
                    interfaceC1131100fXY.LJJIIJZLJL();
                    this.LJJIII(interfaceC1131100fXY);
                }
            };
            iWalletExchangeWalletExchange.getClass();
            if (context != null) {
                LiveBalanceTrackingSetting liveBalanceTrackingSetting = LiveBalanceTrackingSetting.INSTANCE;
                if (liveBalanceTrackingSetting.getValue()) {
                    if (!((WalletExchange) ((IWalletService) C1161920gLG.LIZJ(IWalletService.class)).walletExchange()).LIZIZ(iLJJJJIZL)) {
                        enumC1131780fYe = EnumC1131780fYe.INSUFFICIENT_EXCHANGE;
                    } else {
                        enumC1131780fYe = EnumC1131780fYe.SUFFICIENT_EXCHANGE;
                        interfaceC1149850g1n.LIZIZ(2, ((long) iLJJJJIZL) - ((IWalletService) C1161920gLG.LIZJ(IWalletService.class)).walletCenter().No0(), false, false, 112, Boolean.TRUE);
                        C1149680g1W.LJIJI();
                    }
                    if (liveBalanceTrackingSetting.getValue()) {
                        int value = enumC1131780fYe.getValue();
                        WalletExchange.LL.getClass();
                        C1150880g3S.LIZ(strLIZ, WalletExchange.LJIIJ(2, false), source2, value, giftId2, strLIZJ, null, iLJJJJIZL);
                    }
                } else if (((WalletExchange) ((IWalletService) C1161920gLG.LIZJ(IWalletService.class)).walletExchange()).LIZIZ(iLJJJJIZL)) {
                    interfaceC1149850g1n.LIZIZ(2, ((long) iLJJJJIZL) - ((IWalletService) C1161920gLG.LIZJ(IWalletService.class)).walletCenter().No0(), false, false, 112, Boolean.TRUE);
                    C1149680g1W.LJIJI();
                }
            }
            if (zLJI) {
                MethodIDManager.LJ();
                return;
            }
            return;
        }
        if (interfaceC1131100fXY.LJJJJL()) {
            LJJII(interfaceC1131100fXY, 1, false, 112);
            if (!zLJI) {
                return;
            }
            MethodIDManager.LJ();
            return;
        }
        if (interfaceC1131100fXY.LJJJZ()) {
            WalletStruct walletStructTF1 = ((IWalletService) C1161920gLG.LIZJ(IWalletService.class)).walletCenter().TF1();
            if (walletStructTF1 != null && (balanceStructExtra = walletStructTF1.LIZ) != null) {
                if (balanceStructExtra.getCoins() <= 0) {
                    i = 1;
                }
                ((IWalletService) C1161920gLG.LIZJ(IWalletService.class)).walletExchange().getClass();
                C1149680g1W.LJIJI();
                LJJII(interfaceC1131100fXY, i, true, 97);
                if (!zLJI) {
                    return;
                }
                MethodIDManager.LJ();
                return;
            }
            if (!zLJI) {
                return;
            }
            MethodIDManager.LJ();
            return;
        }
        interfaceC1131100fXY.LJJIIZI();
        if (LIZ(interfaceC1131100fXY)) {
            if (!zLJI) {
                return;
            }
            MethodIDManager.LJ();
            return;
        }
        C1126160fPa c1126160fPaLJJLIIIJJIZ = interfaceC1131100fXY.LJJLIIIJJIZ();
        if ((c1126160fPaLJJLIIIJJIZ != null && c1126160fPaLJJLIIIJJIZ.LIZJ != null) || !LJJIIZ(interfaceC1131100fXY)) {
            DataChannel dataChannel3 = this.LJ;
            if (dataChannel3 != null) {
                dataChannel3.zW(RechargeExchangeCoinsDialogShowing.class, Boolean.FALSE);
            }
            LJJIII(interfaceC1131100fXY);
            if (!zLJI) {
                return;
            }
            MethodIDManager.LJ();
            return;
        }
        if (!zLJI) {
            return;
        }
        MethodIDManager.LJ();
    }

    public final void LJJIII(InterfaceC1131100fXY interfaceC1131100fXY) throws JSONException {
        if (LIZ(interfaceC1131100fXY)) {
            return;
        }
        LJJIIJ(interfaceC1131100fXY);
    }

    public final void LJJIIJ(InterfaceC1131100fXY interfaceC1131100fXY) throws JSONException {
        boolean z;
        Long lValueOf;
        Long lValueOf2;
        Long lValueOf3;
        Long l;
        Long lValueOf4;
        Integer numValueOf;
        Object obj;
        long jLongValue;
        String str;
        int platform;
        Room room;
        String str2;
        Room room2;
        Room room3;
        IWalletCenter iWalletCenterWalletCenter;
        C1149150g0f c1149150g0fIz2;
        Gift giftFindGiftById = GiftManager.inst().findGiftById(interfaceC1131100fXY.getGiftId());
        Gift giftLJZI = interfaceC1131100fXY.LJZI();
        if (giftLJZI != null) {
            giftFindGiftById = giftLJZI;
        } else if (giftFindGiftById == null) {
            giftFindGiftById = new Gift();
            giftFindGiftById.id = interfaceC1131100fXY.getGiftId();
            giftFindGiftById.diamondCount = interfaceC1131100fXY.getDiamondCount();
            giftFindGiftById.type = interfaceC1131100fXY.getGiftType();
        }
        IWalletService iWalletService = (IWalletService) C1161920gLG.LIZJ(IWalletService.class);
        if (iWalletService != null && (iWalletCenterWalletCenter = iWalletService.walletCenter()) != null && (c1149150g0fIz2 = iWalletCenterWalletCenter.iz2()) != null && c1149150g0fIz2.LIZ == EnumC1151140g3s.SUCCESS) {
            z = true;
        } else {
            z = false;
        }
        interfaceC1131100fXY.LJLLI(z);
        String string = UUID.randomUUID().toString();
        interfaceC1131100fXY.LJJJI();
        C1124730fNH.LIZIZ();
        Room roomLIZ = interfaceC1131100fXY.LIZ();
        if (roomLIZ == null) {
            roomLIZ = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
            C1AF0.LJ(new Throwable("gift send event room is null"));
        }
        if (roomLIZ == null) {
            return;
        }
        C1131760fYc c1131760fYc = this.LJIIL;
        c1131760fYc.getClass();
        C1132030fZ3 c1132030fZ3 = new C1132030fZ3(c1131760fYc.LIZ(), new C1132180fZI(interfaceC1131100fXY, roomLIZ));
        Iterator it2 = ((List) c1131760fYc.LIZLLL.getValue()).iterator();
        while (it2.hasNext()) {
            try {
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C1AF0.LJ(th);
            }
            if (((AbstractC1131860fYm) it2.next()).LIZ(c1132030fZ3) instanceof C1132370fZb) {
                return;
            }
        }
        DataChannel dataChannel = this.LJ;
        if (dataChannel != null) {
            dataChannel.LC0(GiftStartSendEvent.class, giftFindGiftById);
        }
        if (!C1126610fQJ.LIZJ()) {
            this.LJIIIIZZ = interfaceC1131100fXY;
            this.LJII = true;
        }
        if (C1123380fL6.LIZIZ()) {
            C1123380fL6.LIZJ(501, false);
        }
        C1128760fTm c1128760fTm = C1128760fTm.LJIIJ;
        long jLJI = C1128460fTI.LJI();
        String strLJII = C1128460fTI.LJII();
        Long lValueOf5 = Long.valueOf(interfaceC1131100fXY.getGiftId());
        Integer numValueOf2 = Integer.valueOf(giftFindGiftById.type);
        C1132880faQ c1132880faQLIZJ = interfaceC1131100fXY.LIZJ();
        if (c1132880faQLIZJ != null) {
            lValueOf = Long.valueOf(c1132880faQLIZJ.LIZ);
        } else {
            lValueOf = null;
        }
        Integer numValueOf3 = Integer.valueOf(interfaceC1131100fXY.getCount());
        DataChannel dataChannel2 = this.LJ;
        String strName = interfaceC1131100fXY.LJJJJZ().LIZ.name();
        String strName2 = interfaceC1131100fXY.LJJJJZ().LIZIZ.name();
        int iHashCode = hashCode();
        boolean zLJJZZIII = interfaceC1131100fXY.LJJZZIII();
        String source = interfaceC1131100fXY.getSource();
        String strLIZIZ = interfaceC1131100fXY.LIZIZ();
        Map<String, Long> mapLJFF = interfaceC1131100fXY.LJFF();
        int iLJLJL = interfaceC1131100fXY.LJLJL();
        int iLJZ = interfaceC1131100fXY.LJZ();
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = new JSONObject();
        Long lValueOf6 = Long.valueOf(roomLIZ.getId());
        if (dataChannel2 != null && (room3 = (Room) dataChannel2.gg0(RoomChannel.class)) != null) {
            lValueOf2 = Long.valueOf(room3.getId());
        } else {
            lValueOf2 = null;
        }
        DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LLILZ;
        C0IR5 c0ir5 = (C0IR5) dataChannelGlobal.gg0(C1148310fzJ.class);
        if (c0ir5 != null && (room2 = c0ir5.LIZIZ) != null) {
            lValueOf3 = Long.valueOf(room2.getId());
        } else {
            lValueOf3 = null;
        }
        jSONObject3.put("send_room", lValueOf6);
        jSONObject3.put("datachannel_room", lValueOf2);
        jSONObject3.put("global_room", lValueOf3);
        jSONObject3.put("send_scenario", strName);
        jSONObject3.put("send_to_user_type", strName2);
        jSONObject3.put("is_guest_panel_open", zLJJZZIII ? 1 : 0);
        InterfaceC1133710fbl.LIZ.getClass();
        C1120710fGn.LIZ();
        jSONObject3.put("is_first_recharge", C1133940fc8.LJIIJJI() ? 1 : 0);
        C1130490fWZ c1130490fWZ = (C1130490fWZ) dataChannelGlobal.gg0(C1148340fzM.class);
        if (c1130490fWZ != null && (str2 = c1130490fWZ.LIZIZ) != null) {
            jSONObject3.put("strategy_task_detail", str2);
        }
        C0IR5 c0ir52 = (C0IR5) dataChannelGlobal.gg0(C1148310fzJ.class);
        if (c0ir52 != null) {
            l = c0ir52.LIZLLL;
        } else {
            l = null;
        }
        jSONObject3.put("global_anchor_id", l);
        jSONObject3.put("send_anchor_id", Long.valueOf(roomLIZ.getOwnerUserId()));
        if (dataChannel2 != null && (room = (Room) dataChannel2.gg0(RoomChannel.class)) != null) {
            lValueOf4 = Long.valueOf(room.getOwnerUserId());
        } else {
            lValueOf4 = null;
        }
        jSONObject3.put("datachannel_anchor_id", lValueOf4);
        jSONObject3.put("sender_hash_code", iHashCode);
        if (dataChannel2 != null) {
            numValueOf = Integer.valueOf(dataChannel2.hashCode());
        } else {
            numValueOf = null;
        }
        jSONObject3.put("datachannel_hash_code", numValueOf);
        C1129930fVf.LIZ(jSONObject3);
        Map map = (Map) dataChannelGlobal.gg0(C1148040fys.class);
        if (map == null || (obj = map.get("anchor_id")) == null) {
            obj = CardStruct.IStatusCode.DEFAULT;
        }
        jSONObject3.put("anchor_id", obj);
        jSONObject3.put("send_request_ms", C158B.LIZ());
        jSONObject3.put("gift_id", lValueOf5);
        jSONObject3.put("gift_type", numValueOf2);
        jSONObject3.put("to_user_id", lValueOf);
        jSONObject3.put("from_user_id", UserService.getInstance().user().getCurrentUserId());
        jSONObject3.put("repeat_count", numValueOf3);
        jSONObject3.put("gift_enter_from", source);
        C1135800ff8.LJIILJJIL(jSONObject, jSONObject3, C158B.LIZ(), System.currentTimeMillis());
        InterfaceC1128210fSt interfaceC1128210fStInst = GiftManager.inst();
        if (lValueOf5 != null) {
            jLongValue = lValueOf5.longValue();
        } else {
            jLongValue = 0;
        }
        Gift giftFindGiftById2 = interfaceC1128210fStInst.findGiftById(jLongValue);
        if (giftFindGiftById2 != null) {
            C1135800ff8.LJ(giftFindGiftById2, 0L, jSONObject, jSONObject3);
        }
        C1135800ff8.LJJIIZI(jSONObject, jSONObject2, giftFindGiftById2);
        if (dataChannel2 != null) {
            jSONObject.put("anchor_client_version", C1135800ff8.LJJI(dataChannel2));
            Room room4 = (Room) dataChannel2.gg0(RoomChannel.class);
            if (room4 != null) {
                platform = room4.getPlatform();
            } else {
                platform = 0;
            }
            jSONObject.put("anchor_os_type", platform);
        }
        C1123380fL6.LIZ(jSONObject3);
        C474500IjA c474500IjALIZ = C0IJT.LIZ("send_gift_request");
        c474500IjALIZ.LJIL();
        c474500IjALIZ.LJJIIJZLJL(jSONObject);
        c474500IjALIZ.LJJIIJZLJL(jSONObject2);
        c474500IjALIZ.LJJIIJZLJL(jSONObject3);
        c474500IjALIZ.LJJIJ(mapLJFF);
        c474500IjALIZ.LJJII(Long.valueOf(jLJI), "fans_club_level");
        c474500IjALIZ.LJJII(strLJII, "fans_status");
        c474500IjALIZ.LJJII(Integer.valueOf(C1131130fXb.LIZIZ(source, strLIZIZ)), "from_fans_task_page");
        ICoinIncentiveService iCoinIncentiveServiceLIZ = C1124730fNH.LIZ();
        if (iCoinIncentiveServiceLIZ != null) {
            iCoinIncentiveServiceLIZ.WC1();
        }
        c474500IjALIZ.LJJIIZI(null);
        if (iLJLJL != 1) {
            if (iLJLJL != 2) {
                str = "";
            } else {
                str = "anchor_income";
            }
        } else {
            str = "ug_exchange";
        }
        c474500IjALIZ.LJJII(str, "exchange_type");
        c474500IjALIZ.LJJII(C1131130fXb.LIZ(iLJZ, source), "exchange_scenario");
        c474500IjALIZ.LIZ();
        C1CC2.LIZJ("send_gift_request", jSONObject, jSONObject2, jSONObject3);
        if (!Intrinsics.LJFF(lValueOf2, lValueOf3)) {
            jSONObject.put("type", "room_error");
            C1CC2.LJ("gift_core_monitor", jSONObject, jSONObject2, jSONObject3);
        }
        LJIJJ(interfaceC1131100fXY, giftFindGiftById, roomLIZ, string, "");
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x023e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LJJIIZ(final X.InterfaceC1131100fXY r28) {
        /*
            Method dump skipped, instruction units count: 581
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1131110fXZ.LJJIIZ(X.0fXY):boolean");
    }

    public static void LJJIIZI(InterfaceC1131100fXY interfaceC1131100fXY, SendGiftResult sendGiftResult) {
        boolean z;
        IWalletCenter iWalletCenterWalletCenter = ((IWalletService) C1161920gLG.LIZJ(IWalletService.class)).walletCenter();
        long jNo0 = iWalletCenterWalletCenter.No0();
        iWalletCenterWalletCenter.Yb1(Math.min(sendGiftResult.mLeftDiamonds, jNo0));
        if (LiveBalanceTrackingSetting.INSTANCE.getValue()) {
            if (sendGiftResult.mLeftDiamonds != jNo0) {
                z = true;
            } else {
                z = false;
            }
            String value = EnumC1114500f6m.GIFT_SEND.getValue();
            C1129570fV5 c1129570fV5 = C1129570fV5.LIZ;
            String source = interfaceC1131100fXY.getSource();
            long giftId = interfaceC1131100fXY.getGiftId();
            c1129570fV5.getClass();
            iWalletCenterWalletCenter.JG(value, C1129570fV5.LIZ(interfaceC1131100fXY, source, giftId), z);
        }
        C1124730fNH.LIZIZ();
    }

    public static void LJJIJ(long j, InterfaceC1131100fXY interfaceC1131100fXY) {
        if (j <= 0) {
            return;
        }
        if (interfaceC1131100fXY.LJJI() == 18) {
            C1130100fVw.LIZ.getClass();
            C1131900fYq.LIZLLL(C497740JfY.LJII(), "last_sent_music_item", j);
            C1131900fYq.LIZLLL(C497740JfY.LJII(), "last_sent_music_tab_item", j);
        } else {
            if (!Intrinsics.LJFF(interfaceC1131100fXY.LIZIZ(), "music_gift_secondary_page")) {
                return;
            }
            C1130100fVw.LIZ.getClass();
            C1131900fYq.LIZLLL(C497740JfY.LJII(), "last_sent_music_item", j);
            C1131900fYq.LIZLLL(C497740JfY.LJII(), "last_sent_music_tab_item", 0L);
        }
    }

    @Override // X.InterfaceC1131620fYO
    public final long LJIIIZ(InterfaceC1131100fXY interfaceC1131100fXY, SendGiftResult sendGiftResult) {
        List<GiftResultData> list;
        if (sendGiftResult == null || (list = sendGiftResult.gifts) == null) {
            list = C13BV.INSTANCE;
        }
        long j = 0;
        for (GiftResultData giftResultData : list) {
            if (giftResultData.giftId == interfaceC1131100fXY.getGiftId() || giftResultData.mGift.isRandomGift) {
                j = giftResultData.mGift.primaryEffectId;
            }
        }
        if (j == 0) {
            return interfaceC1131100fXY.getEffectId();
        }
        return j;
    }

    @Override // X.InterfaceC1131620fYO
    public final void LJIIJ(InterfaceC1131100fXY interfaceC1131100fXY, boolean z) {
        EnumC1129230fUX enumC1129230fUX;
        List<Long> listSingletonList;
        long j;
        C1126150fPZ c1126150fPZLJJJJZ = interfaceC1131100fXY.LJJJJZ();
        if (c1126150fPZLJJJJZ != null) {
            enumC1129230fUX = c1126150fPZLJJJJZ.LIZ;
        } else {
            enumC1129230fUX = null;
        }
        if (enumC1129230fUX == EnumC1129230fUX.GIFT_PANEL_PORTRAIT || enumC1129230fUX == EnumC1129230fUX.FE_FIREWORKS_GIFT || enumC1129230fUX == EnumC1129230fUX.FE_RANDOM_GIFT || enumC1129230fUX == EnumC1129230fUX.FE_GIFT_HUB || enumC1129230fUX == EnumC1129230fUX.FAST_GIFT) {
            if (!interfaceC1131100fXY.LJIIJ().isEmpty()) {
                listSingletonList = interfaceC1131100fXY.LJIIJ();
            } else if (interfaceC1131100fXY.LIZJ() != null) {
                C1132880faQ c1132880faQLIZJ = interfaceC1131100fXY.LIZJ();
                if (c1132880faQLIZJ != null) {
                    j = c1132880faQLIZJ.LIZ;
                } else {
                    j = 0;
                }
                listSingletonList = Collections.singletonList(Long.valueOf(j));
            } else {
                listSingletonList = C13BV.INSTANCE;
            }
            if (this.LJ != null) {
                if (interfaceC1131100fXY.LJJJJZ().LIZ == EnumC1129230fUX.FAST_GIFT) {
                    DataChannel dataChannel = this.LJ;
                    if (dataChannel != null) {
                        dataChannel.LC0(SendUpdateToUserEventForFastGift.class, new C922880a7i(interfaceC1131100fXY.getGiftId(), listSingletonList, z));
                        return;
                    }
                    return;
                }
                DataChannel dataChannel2 = this.LJ;
                if (dataChannel2 == null) {
                    return;
                }
                dataChannel2.LC0(SendUpdateToUserEvent.class, new C922880a7i(interfaceC1131100fXY.getGiftId(), listSingletonList, z));
            }
        }
    }

    @Override // X.InterfaceC1131620fYO
    public final void LJIILIIL(InterfaceC1131100fXY interfaceC1131100fXY, SendGiftResult sendGiftResult) {
        List<SponsorshipInfo> list;
        long j;
        String source;
        long j2;
        C1132880faQ c1132880faQLIZJ;
        long j3;
        C1132880faQ c1132880faQLIZJ2;
        C1132880faQ c1132880faQLIZJ3;
        if (sendGiftResult != null && (list = sendGiftResult.sponsorshipInfo) != null) {
            for (SponsorshipInfo sponsorshipInfo : list) {
                if (sponsorshipInfo != null) {
                    if (!sponsorshipInfo.becomeSponsor && sendGiftResult.giftGalleryComboSponsor) {
                        C766270U4b.LIZLLL(2131841888);
                    }
                    InterfaceC1128210fSt interfaceC1128210fStInst = GiftManager.inst();
                    if (interfaceC1131100fXY != null && (c1132880faQLIZJ3 = interfaceC1131100fXY.LIZJ()) != null) {
                        j = c1132880faQLIZJ3.LIZ;
                    } else {
                        j = 0;
                    }
                    interfaceC1128210fStInst.updateGalleryInfoMap(j, sponsorshipInfo);
                    if (sponsorshipInfo.becomeSponsor) {
                        if (sponsorshipInfo.lightGiftUp) {
                            Long lValueOf = Long.valueOf(sponsorshipInfo.giftId);
                            Long lValueOf2 = Long.valueOf(sponsorshipInfo.galleryGiftsCollectedCount);
                            Long lValueOf3 = Long.valueOf(sponsorshipInfo.galleryGiftsCount);
                            if (interfaceC1131100fXY != null && (c1132880faQLIZJ2 = interfaceC1131100fXY.LIZJ()) != null) {
                                j3 = c1132880faQLIZJ2.LIZ;
                            } else {
                                j3 = 0;
                            }
                            boolean z = sponsorshipInfo.swapped;
                            GiftGalleryMetrics giftGalleryMetricsLIZJ = C1125140fNw.LIZJ();
                            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_gift_gallery_gift_lit_up_success");
                            c474500IjALIZ.LJIL();
                            c474500IjALIZ.LJIIIIZZ();
                            C1125140fNw.LIZ(c474500IjALIZ, j3);
                            c474500IjALIZ.LJJII(lValueOf, "gift_id");
                            c474500IjALIZ.LJJII(lValueOf2, "lit_progress");
                            c474500IjALIZ.LJJII(lValueOf3, "lit_target");
                            c474500IjALIZ.LJJII(Integer.valueOf(z ? 1 : 0), "is_anchor_add");
                            c474500IjALIZ.LJJII(Integer.valueOf(giftGalleryMetricsLIZJ.isFirstTimeUser), "is_first_time_user");
                            c474500IjALIZ.LJJII(Integer.valueOf(giftGalleryMetricsLIZJ.isNewToGallery), "is_new_to_gallery");
                            c474500IjALIZ.LIZ();
                        }
                        Long lValueOf4 = Long.valueOf(sponsorshipInfo.giftId);
                        if (interfaceC1131100fXY == null || (source = interfaceC1131100fXY.getSource()) == null) {
                            source = "";
                        }
                        int i = !sponsorshipInfo.lightGiftUp ? 1 : 0;
                        if (interfaceC1131100fXY != null && (c1132880faQLIZJ = interfaceC1131100fXY.LIZJ()) != null) {
                            j2 = c1132880faQLIZJ.LIZ;
                        } else {
                            j2 = 0;
                        }
                        boolean z2 = sponsorshipInfo.swapped;
                        GiftGalleryMetrics giftGalleryMetricsLIZJ2 = C1125140fNw.LIZJ();
                        C474500IjA c474500IjALIZ2 = C0IJT.LIZ("livesdk_gift_gallery_gift_title_success");
                        c474500IjALIZ2.LJIL();
                        c474500IjALIZ2.LJIIIIZZ();
                        C1125140fNw.LIZ(c474500IjALIZ2, j2);
                        c474500IjALIZ2.LJJII(lValueOf4, "gift_id");
                        c474500IjALIZ2.LJJII(source, "gift_enter_from");
                        c474500IjALIZ2.LJJII(Integer.valueOf(i), "is_overtake");
                        c474500IjALIZ2.LJJII(Integer.valueOf(z2 ? 1 : 0), "is_anchor_add");
                        c474500IjALIZ2.LJJII(Integer.valueOf(giftGalleryMetricsLIZJ2.isFirstTimeUser), "is_first_time_user");
                        c474500IjALIZ2.LJJII(Integer.valueOf(giftGalleryMetricsLIZJ2.isNewToGallery), "is_new_to_gallery");
                        c474500IjALIZ2.LIZ();
                    }
                }
            }
        }
    }

    @Override // X.InterfaceC1131620fYO
    public final void LJIJ(String str, SendGiftResult sendGiftResult) {
        if (str != null && Intrinsics.LJFF(str, "gift_panel")) {
            long j = sendGiftResult.mGiftId;
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("gift_id", j);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                C20441214yg.LJFF("GiftQueueSender", "Error JSONObject", e);
            }
            C389001fE.LIZ("live_stream_gift_sent_successfully_message", jSONObject, System.currentTimeMillis(), false);
        }
    }

    @Override // X.InterfaceC1131620fYO
    public final void LJIJI(Exception exc, InterfaceC1131100fXY interfaceC1131100fXY) {
        long errorCode;
        String source;
        boolean zLJJIL;
        C1132120fZC c1132120fZC;
        if (C1131140fXc.LIZJ(interfaceC1131100fXY) != 0) {
            if (exc instanceof C501520Jle) {
                errorCode = ((C501520Jle) exc).getErrorCode();
            } else {
                errorCode = -1;
            }
            if (interfaceC1131100fXY.getSource() != null) {
                source = interfaceC1131100fXY.getSource();
            } else {
                source = "";
            }
            IWalletExchange iWalletExchangeWalletExchange = ((IWalletService) C1161920gLG.LIZJ(IWalletService.class)).walletExchange();
            DataChannel dataChannel = this.LJ;
            C1126160fPa c1126160fPaLJJLIIIJJIZ = interfaceC1131100fXY.LJJLIIIJJIZ();
            if (c1126160fPaLJJLIIIJJIZ != null && (c1132120fZC = c1126160fPaLJJLIIIJJIZ.LIZJ) != null) {
                zLJJIL = c1132120fZC.LIZIZ;
            } else {
                zLJJIL = interfaceC1131100fXY.LJJIL();
            }
            Boolean boolValueOf = Boolean.valueOf(zLJJIL);
            int iLIZJ = C1131140fXc.LIZJ(interfaceC1131100fXY);
            C1129570fV5 c1129570fV5 = C1129570fV5.LIZ;
            String source2 = interfaceC1131100fXY.getSource();
            long giftId = interfaceC1131100fXY.getGiftId();
            c1129570fV5.getClass();
            String strLIZ = C1129570fV5.LIZ(interfaceC1131100fXY, source2, giftId);
            long jLJJJJIZL = ((long) interfaceC1131100fXY.LJJJJIZL()) - interfaceC1131100fXY.LJIJI();
            C1131140fXc.LIZIZ(interfaceC1131100fXY);
            ((WalletExchange) iWalletExchangeWalletExchange).LJJII(dataChannel, errorCode, boolValueOf, iLIZJ, source, strLIZ, jLJJJJIZL, interfaceC1131100fXY.LJZL().LIZIZ);
        }
    }

    public final void LJIL(InterfaceC1131100fXY interfaceC1131100fXY, boolean z) throws JSONException {
        boolean z2;
        Map<String, ? extends Object> map;
        if (GiftManager.inst().canSendGiftFree() && interfaceC1131100fXY.LJLJLLL()) {
            if (z) {
                LJJIIJ(interfaceC1131100fXY);
                return;
            } else {
                LJJIII(interfaceC1131100fXY);
                return;
            }
        }
        if (interfaceC1131100fXY.LJLJLLL()) {
            C766270U4b.LIZLLL(2131841953);
            long jLJJJJIZL = ((long) interfaceC1131100fXY.LJJJJIZL()) - ((IWalletService) C1161920gLG.LIZJ(IWalletService.class)).walletCenter().No0();
            C1129570fV5 c1129570fV5 = C1129570fV5.LIZ;
            String source = interfaceC1131100fXY.getSource();
            long giftId = interfaceC1131100fXY.getGiftId();
            c1129570fV5.getClass();
            C1127330fRT c1127330fRT = new C1127330fRT(C1129570fV5.LIZ(interfaceC1131100fXY, source, giftId), jLJJJJIZL, "normal", interfaceC1131100fXY.getSource(), null);
            c1127330fRT.LJII = LIZJ(interfaceC1131100fXY);
            c1127330fRT.LJIIIIZZ = interfaceC1131100fXY.getGiftId();
            c1127330fRT.LJIIIZ = interfaceC1131100fXY.LJJJJIZL();
            c1127330fRT.LJIIJ = interfaceC1131100fXY.LJJJLL();
            boolean z3 = true;
            c1127330fRT.LJFF = true;
            if (interfaceC1131100fXY.LJJJJZ().LIZ != EnumC1129230fUX.GIFT_PANEL_PORTRAIT && interfaceC1131100fXY.LJJJJZ().LIZ != EnumC1129230fUX.GIFT_PANEL_LANDSCAPE) {
                z2 = false;
            } else {
                z2 = true;
            }
            c1127330fRT.LJI = z2;
            C1125300fOC c1125300fOCLJJJLZIJ = interfaceC1131100fXY.LJJJLZIJ();
            if (c1125300fOCLJJJLZIJ != null && (map = c1125300fOCLJJJLZIJ.LIZIZ) != null) {
                c1127330fRT.LJIILIIL = map;
            }
            Map<String, Object> mapLJIILIIL = interfaceC1131100fXY.LJIILIIL();
            if (mapLJIILIIL != null) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                Map<String, ? extends Object> map2 = c1127330fRT.LJIILIIL;
                if (map2 != null) {
                    linkedHashMap.putAll(map2);
                }
                linkedHashMap.putAll(mapLJIILIIL);
                c1127330fRT.LJIILIIL = linkedHashMap;
            }
            if (interfaceC1131100fXY.LL() != null || interfaceC1131100fXY.LJLJJL() != null) {
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                Map<String, ? extends Object> map3 = c1127330fRT.LJIILIIL;
                if (map3 != null) {
                    linkedHashMap2.putAll(map3);
                }
                String strLL = interfaceC1131100fXY.LL();
                if (strLL != null) {
                    linkedHashMap2.put("request_panel_id", strLL);
                }
                String strLJLJJL = interfaceC1131100fXY.LJLJJL();
                if (strLJLJJL != null) {
                    linkedHashMap2.put("recommend_info", strLJLJJL);
                }
                c1127330fRT.LJIILIIL = linkedHashMap2;
            }
            DataChannel dataChannel = this.LJ;
            if (dataChannel != null) {
                dataChannel.LC0(ShowRechargeDialogEvent.class, c1127330fRT);
            }
            if (interfaceC1131100fXY.LJJLIIIJJIZ() != null) {
                z3 = false;
            }
            LJFF(z3);
            C1128760fTm.LJIIJ.getClass();
            C1128760fTm.LJJIJIIJI(interfaceC1131100fXY, "lack");
            C1128760fTm.LJJJJLI(interfaceC1131100fXY.getGiftId(), C1131140fXc.LIZJ(interfaceC1131100fXY), interfaceC1131100fXY.LJZ(), "3", "money", interfaceC1131100fXY.getSource(), interfaceC1131100fXY.LJJJJ(), interfaceC1131100fXY.LJJJJZI());
            InterfaceC1125350fOH interfaceC1125350fOHLJII = interfaceC1131100fXY.LJII();
            if (interfaceC1125350fOHLJII != null) {
                interfaceC1125350fOHLJII.LIZ(new Throwable() { // from class: X.0fLn
                });
            }
            LJIIJ(interfaceC1131100fXY, false);
            return;
        }
        InterfaceC1125350fOH interfaceC1125350fOHLJII2 = interfaceC1131100fXY.LJII();
        if (interfaceC1125350fOHLJII2 == null) {
            return;
        }
        interfaceC1125350fOHLJII2.LIZ(new Throwable() { // from class: X.0fLn
        });
    }

    public final void LJJ(InterfaceC1131100fXY interfaceC1131100fXY, SendGiftResult sendGiftResult) {
        long j = sendGiftResult.mGiftId;
        if (j > 0) {
            C20441214yg.LIZIZ("GiftPanelSwipe", "set default item");
            C1131900fYq.LIZLLL(this.LJI, "default_dialog_item", j);
        }
        if (C1126610fQJ.LIZJ()) {
            if (interfaceC1131100fXY.LJJI() != -1) {
                C1131900fYq.LIZJ(this.LJI, interfaceC1131100fXY.LJJI());
                if (j > 0 && interfaceC1131100fXY.LJJI() == 17) {
                    C1130100fVw.LIZ.getClass();
                    C1131900fYq.LIZLLL(C497740JfY.LJII(), "last_sent_interactive_item", j);
                }
                if (interfaceC1131100fXY.LJLIIL()) {
                    C1131900fYq.LIZJ(this.LJI, 1);
                }
            } else if (GiftManager.inst().isInteractiveGift(j)) {
                C1130100fVw.LIZ.getClass();
                C1131900fYq.LIZLLL(C497740JfY.LJII(), "last_sent_interactive_item", j);
            }
            LJJIJ(j, interfaceC1131100fXY);
            return;
        }
        InterfaceC1131100fXY interfaceC1131100fXY2 = this.LJIIIIZZ;
        if (interfaceC1131100fXY2 == null) {
            return;
        }
        if (interfaceC1131100fXY2.LJJI() != -1) {
            C1131900fYq.LIZJ(this.LJI, interfaceC1131100fXY2.LJJI());
            if (j > 0 && interfaceC1131100fXY2.LJJI() == 17) {
                C1130100fVw.LIZ.getClass();
                C1131900fYq.LIZLLL(C497740JfY.LJII(), "last_sent_interactive_item", j);
            }
        } else if (GiftManager.inst().isInteractiveGift(j)) {
            C1130100fVw.LIZ.getClass();
            C1131900fYq.LIZLLL(C497740JfY.LJII(), "last_sent_interactive_item", j);
        }
        LJJIJ(j, interfaceC1131100fXY2);
    }

    public final void LJJIFFI(InterfaceC1131100fXY interfaceC1131100fXY, boolean z) {
        if (z) {
            LJJIIJ(interfaceC1131100fXY);
            C20441214yg.LJIIIZ("NewGifter", "fromNewGifterLogic: sendGiftWithRetrofit");
        } else {
            LJJIII(interfaceC1131100fXY);
        }
    }

    public final void LJJII(InterfaceC1131100fXY interfaceC1131100fXY, int i, boolean z, int i2) {
        boolean z2;
        boolean z3;
        DataChannel dataChannel;
        boolean zLIZ = C1131530fYF.LIZ(interfaceC1131100fXY.getGiftId(), this.LJ, interfaceC1131100fXY.getSource());
        boolean z4 = true;
        if (C1131530fYF.LJ(interfaceC1131100fXY.getSource()) && zLIZ) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (C1131530fYF.LJFF(interfaceC1131100fXY.getSource()) && zLIZ) {
            z3 = true;
        } else {
            z3 = false;
        }
        interfaceC1131100fXY.LJLJJI(z);
        interfaceC1131100fXY.LJIIIZ(((IWalletService) C1161920gLG.LIZJ(IWalletService.class)).walletCenter().No0());
        interfaceC1131100fXY.LJLJLJ(i2);
        if (z2 || z3) {
            z4 = false;
        }
        interfaceC1131100fXY.LJLLILLLL(z4);
        interfaceC1131100fXY.LJJIJLIJ(i);
        interfaceC1131100fXY.LJJIIJZLJL();
        LJJIFFI(interfaceC1131100fXY, false);
        if (C1126610fQJ.LIZIZ(interfaceC1131100fXY) && (dataChannel = this.LJ) != null) {
            dataChannel.LC0(GiftDialogDismissEvent.class, Boolean.FALSE);
        }
    }

    public final void LJJIIJZLJL(InterfaceC1131100fXY interfaceC1131100fXY, C1144350fsv c1144350fsv, boolean z, String str) {
        ((IRevenueStrategyService) C1161920gLG.LIZJ(IRevenueStrategyService.class)).KE0().LJJ(c1144350fsv.LJ, interfaceC1131100fXY.getGiftId(), c1144350fsv.LIZIZ, new C1131670fYT(str, c1144350fsv, C158B.LIZ(), interfaceC1131100fXY, this, z));
    }

    /* JADX WARN: Removed duplicated region for block: B:168:0x046d  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0486  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x049a  */
    @Override // X.InterfaceC1131620fYO
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIJJ(final X.InterfaceC1131100fXY r104, final com.bytedance.android.livesdk.model.Gift r105, final com.bytedance.android.livesdkapi.depend.model.live.Room r106, final java.lang.String r107, final java.lang.String r108) {
        /*
            Method dump skipped, instruction units count: 1200
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1131110fXZ.LJIJJ(X.0fXY, com.bytedance.android.livesdk.model.Gift, com.bytedance.android.livesdkapi.depend.model.live.Room, java.lang.String, java.lang.String):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v8, types: [com.bytedance.android.livesdk.gift.model.SendGiftResult] */
    @Override // X.InterfaceC1131620fYO
    public final void LJIIIIZZ(SendGiftResult sendGiftResult, InterfaceC1131100fXY interfaceC1131100fXY, String str, Room room, boolean z, String str2) throws JSONException {
        SendGiftResult sendGiftResult2;
        IMessageManager iMessageManager;
        User user;
        long j;
        User userLIZ;
        ArrayList arrayList;
        String str3;
        GiftsInfo giftsInfo;
        User user2;
        int iIntValue;
        String str4;
        Room room2;
        String str5;
        String str6 = str;
        ?? r0 = "GiftQueueSender";
        C20441214yg.LIZIZ(r0, "handle send start");
        try {
            r0 = sendGiftResult;
            LJJIIZI(interfaceC1131100fXY, r0);
            sendGiftResult2 = r0;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C1128760fTm c1128760fTm = C1128760fTm.LJIIJ;
            C1128760fTm c1128760fTm2 = C1128760fTm.LJIIJ;
            String string = e.toString();
            c1128760fTm2.getClass();
            C1128760fTm.LJJJJI("error_update_wallet", string);
            sendGiftResult2 = r0;
        }
        if (!z) {
            try {
                LJJ(interfaceC1131100fXY, sendGiftResult2);
            } catch (Exception e2) {
                TryCatchGuardChecker.doCheck(e2);
                C1128760fTm c1128760fTm3 = C1128760fTm.LJIIJ;
                String string2 = e2.toString();
                c1128760fTm3.getClass();
                C1128760fTm.LJJJJI("error_shared_pref", string2);
            }
        }
        C01GW c01gw = C1131920fYs.LIZ;
        ((SharedPreferences) C1131920fYs.LIZ.getValue()).edit().putLong(String.valueOf(sendGiftResult2.mGiftId), interfaceC1131100fXY.LJIIL()).apply();
        User userLIZ2 = null;
        if (LiveGiftRankingExclusiveTabSetting.isEnabled()) {
            C1118340fCy teamRankManager = GiftManager.inst().getTeamRankManager();
            Integer numValueOf = Integer.valueOf(interfaceC1131100fXY.getToastDelaySeconds());
            DataChannel dataChannel = this.LJ;
            Boolean boolValueOf = Boolean.valueOf(z);
            teamRankManager.getClass();
            Room room3 = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
            if (room3 != null && room != null && room3.getId() == room.getId()) {
                if (numValueOf != null && numValueOf.intValue() > 1) {
                    iIntValue = numValueOf.intValue();
                } else {
                    iIntValue = 1;
                }
                TeamRankProgress teamRankProgress = sendGiftResult2.teamRankProgress;
                if (teamRankProgress != null) {
                    teamRankManager.LJ(teamRankProgress);
                    if (teamRankManager.LIZJ(sendGiftResult2.mGiftId)) {
                        GiftSendFansClubInfo giftSendFansClubInfo = sendGiftResult2.fansClubInfo;
                        if (giftSendFansClubInfo != null) {
                            str4 = giftSendFansClubInfo.fansGiftToast;
                        } else {
                            str4 = null;
                        }
                        if (C1533950q1J.LJ(str4) && (!Intrinsics.LJFF(boolValueOf, Boolean.TRUE) || (!TextUtils.equals(str2, "before") && !TextUtils.equals(str2, "sleeping")))) {
                            int i = teamRankProgress.contributedScore;
                            long j2 = sendGiftResult2.mGiftId;
                            if (dataChannel != null) {
                                room2 = (Room) dataChannel.gg0(RoomChannel.class);
                            } else {
                                room2 = null;
                            }
                            GiftSendFansClubInfo giftSendFansClubInfo2 = sendGiftResult2.fansClubInfo;
                            if (giftSendFansClubInfo2 != null) {
                                str5 = giftSendFansClubInfo2.fansGiftToast;
                            } else {
                                str5 = null;
                            }
                            ((LinkedList) teamRankManager.LJIIIIZZ).add(new C1096410edb(i, iIntValue, j2, room2, str5));
                            if (!teamRankManager.LJIIIZ) {
                                teamRankManager.LIZIZ();
                            }
                        }
                    }
                }
            }
        }
        if (interfaceC1131100fXY.LJJL()) {
            C1DFH c1dfh = C0PEM.LIZ;
            C23250099c.LIZLLL(C2296808zG.LIZ(C2107308Nj.LIZ), null, null, new C1096680ee2(null), 3);
        }
        try {
            if (sendGiftResult2.isFirstSend && this.LJ != null) {
                InterfaceC1094160eZy.D1.LIZJ(Boolean.FALSE);
            }
        } catch (Exception e3) {
            TryCatchGuardChecker.doCheck(e3);
            C1128760fTm c1128760fTm4 = C1128760fTm.LJIIJ;
            String string3 = e3.toString();
            c1128760fTm4.getClass();
            C1128760fTm.LJJJJI("error_first_send_update", string3);
        }
        if (str6 == null) {
            str6 = "";
        }
        Room room4 = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
        if (room4 != null && this.LJ != null) {
            if (room != null && room.getId() != room4.getId()) {
                C20441214yg.LJIIIZ("GiftQueueSender", "send gift in another room");
                C1AF0.LJFF(new Throwable("send gift in another room"), str6);
            } else {
                DataChannel dataChannel2 = this.LJ;
                if (dataChannel2 != null) {
                    iMessageManager = (IMessageManager) dataChannel2.gg0(C776250Uch.class);
                } else {
                    iMessageManager = null;
                }
                InterfaceC2262081DgM currentUser = UserService.getInstance().user().getCurrentUser();
                if ((currentUser instanceof User) && (user = (User) currentUser) != null) {
                    long id = room4.getId();
                    C1132880faQ c1132880faQLIZJ = interfaceC1131100fXY.LIZJ();
                    if (c1132880faQLIZJ != null) {
                        userLIZ2 = c1132880faQLIZJ.LIZ();
                    }
                    String strLIZIZ = interfaceC1131100fXY.LIZIZ();
                    ArrayList<GiftMessage> arrayList2 = new ArrayList();
                    List<GiftResultData> list = sendGiftResult2.gifts;
                    if (list != null) {
                        for (GiftResultData giftResultData : list) {
                            GiftMessage giftMessage = new GiftMessage();
                            giftMessage.LLILZIL = strLIZIZ;
                            giftMessage.mLogId = C2203708kF.LIZIZ(sendGiftResult2.monitorExtra);
                            CommonMessageData commonMessageData = new CommonMessageData();
                            commonMessageData.roomId = id;
                            commonMessageData.messageId = giftResultData.msgId;
                            commonMessageData.createTime = C158B.LIZ();
                            commonMessageData.showMsg = true;
                            commonMessageData.describe = giftResultData.describe;
                            Text text = giftResultData.displayText;
                            commonMessageData.displayText = text;
                            giftMessage.baseMessage = commonMessageData;
                            if (text != null && !C086I.LIZIZ(text.pieces)) {
                                Iterator<TextPiece> it2 = text.pieces.iterator();
                                while (true) {
                                    if (!it2.hasNext()) {
                                        break;
                                    }
                                    TextPiece next = it2.next();
                                    TextPieceUser textPieceUser = next.userValue;
                                    if (textPieceUser != null && (user2 = textPieceUser.user) != null) {
                                        if (user2.getId() == UserService.getInstance().user().getCurrentUserId()) {
                                            User user3 = next.userValue.user;
                                            if (user3 != null) {
                                                giftMessage.fromUser = user3;
                                            }
                                        }
                                    }
                                }
                                giftMessage.fromUser = user;
                            } else {
                                giftMessage.fromUser = user;
                            }
                            giftMessage.toMemberIdInt = sendGiftResult2.toMemberId;
                            giftMessage.toMemberNickname = sendGiftResult2.toMemberNickname;
                            giftMessage.colorId = Long.valueOf(sendGiftResult2.LIZ);
                            giftMessage.fanTicketCount = sendGiftResult2.fanTicketCount;
                            giftMessage.giftId = giftResultData.giftId;
                            giftMessage.toUser = userLIZ2;
                            giftMessage.repeatCount = giftResultData.repeatCount;
                            giftMessage.comboCount = giftResultData.comboCount;
                            giftMessage.groupCount = giftResultData.groupCount;
                            giftMessage.groupId = sendGiftResult2.groupId;
                            giftMessage.LLILLL = true;
                            giftMessage.isLocalInsertMsg = true;
                            giftMessage.giftsInBox = giftResultData.giftsInBox;
                            if (LiveGiftEffectLayerEnabledSetting.INSTANCE.isEnabled()) {
                                giftMessage.giftEffect = giftResultData.giftEffect;
                            } else {
                                giftMessage.asset = giftResultData.giftAsset;
                                giftMessage.assetBundle = giftResultData.assetBundle;
                                giftMessage.isAssetBundleGift = C176600m4.LIZIZ(Boolean.valueOf(giftResultData.isAssetBundleGift));
                                giftMessage.secondaryEffectInfo = sendGiftResult2.secondaryEffectInfo;
                            }
                            giftMessage.mTrayInfo = giftResultData.mTrayInfo;
                            giftMessage.isFirstSendGift = sendGiftResult2.isFirstSend;
                            giftMessage.displayTextForAnchor = giftResultData.displayTextForAnchor;
                            giftMessage.displayTextForAudience = giftResultData.displayTextForAudience;
                            giftMessage.displayTextForSender = giftResultData.displayTextForSender;
                            giftMessage.displayDurationMs = giftResultData.displayDurationMs;
                            Gift gift = giftResultData.mGift;
                            if (gift != null) {
                                giftMessage.mGift = gift;
                            } else {
                                giftMessage.mGift = GiftManager.inst().findGiftById(sendGiftResult2.mGiftId);
                            }
                            String str7 = sendGiftResult2.monitorExtra;
                            giftMessage.LLIZLLLIL = str7;
                            giftMessage.lynxExtra = sendGiftResult2.lynxExtra;
                            giftMessage.giftVariantId = sendGiftResult2.giftVariantId;
                            try {
                                giftMessage.giftMonitorInfo = (GiftMonitorInfo) C19748512Ol.LIZIZ.LJII(str7, GiftMonitorInfo.class);
                                C189200o6.m2constructorimpl(Unit.LIZ);
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                                C189200o6.m2constructorimpl(new C098200Yq(th));
                            }
                            giftMessage.linkmicGiftExpressionStrategy = sendGiftResult2.linkmicGiftExpressionStrategy;
                            giftMessage.matchInfo = sendGiftResult2.matchInfo;
                            giftMessage.flyingMicResources = sendGiftResult2.flyingMicResources;
                            giftMessage.multiGenerateMessage = sendGiftResult2.multiGenerateMessage;
                            if (FlyMicGiftPhase2ConfigSetting.INSTANCE.getValue().getShouldUseNewStrat()) {
                                giftMessage.flyingMicResourcesV2 = sendGiftResult2.flyingMicResourcesV2;
                            }
                            List<SponsorshipInfo> list2 = sendGiftResult2.sponsorshipInfo;
                            if (list2 != null) {
                                arrayList = new ArrayList(C15438062q.LJIJJ(list2, 10));
                                for (SponsorshipInfo sponsorshipInfo : list2) {
                                    GiftMessage.SponsorshipInfo sponsorshipInfo2 = new GiftMessage.SponsorshipInfo();
                                    sponsorshipInfo2.giftId = sponsorshipInfo.giftId;
                                    sponsorshipInfo2.sponsorId = sponsorshipInfo.sponsorId;
                                    sponsorshipInfo2.becomeAllSponsored = sponsorshipInfo.becomeAllSponsored;
                                    sponsorshipInfo2.giftGalleryClickSponsor = sponsorshipInfo.giftGalleryClickSponsor;
                                    GiftListResult giftListResult = GiftManager.inst().getGiftListResult();
                                    if (giftListResult != null && (giftsInfo = giftListResult.giftsInfo) != null) {
                                        str3 = giftsInfo.giftGalleryDetailPageSchemeUrl;
                                    } else {
                                        str3 = null;
                                    }
                                    sponsorshipInfo2.giftGalleryDetailPageSchemeUrl = str3;
                                    sponsorshipInfo2.LIZ = sponsorshipInfo.firstTitlePageSchemeUrl;
                                    sponsorshipInfo2.giftTrayStyle = sponsorshipInfo.giftTrayStyle;
                                    arrayList.add(sponsorshipInfo2);
                                }
                            } else {
                                arrayList = null;
                            }
                            giftMessage.sponsorshipInfo = arrayList;
                            arrayList2.add(giftMessage);
                        }
                        StringBuilder sb = new StringBuilder("success ");
                        ArrayList arrayList3 = new ArrayList(C15438062q.LJIJJ(arrayList2, 10));
                        Iterator it3 = arrayList2.iterator();
                        while (it3.hasNext()) {
                            arrayList3.add(Integer.valueOf(((GiftMessage) it3.next()).comboCount));
                        }
                        sb.append(arrayList3);
                        C20441214yg.LIZIZ("get message list", sb.toString());
                    }
                    Gift giftFindGiftById = GiftManager.inst().findGiftById(sendGiftResult2.mGiftId);
                    if (iMessageManager != null) {
                        long j3 = 0;
                        if (C0IKQ.LIZ(arrayList2)) {
                            long id2 = room4.getId();
                            C1132880faQ c1132880faQLIZJ2 = interfaceC1131100fXY.LIZJ();
                            if (c1132880faQLIZJ2 != null) {
                                userLIZ = c1132880faQLIZJ2.LIZ();
                            } else {
                                userLIZ = null;
                            }
                            GiftMessage giftMessageLIZLLL = C1135260feG.LIZLLL(id2, sendGiftResult2, userLIZ, user, interfaceC1131100fXY.LIZIZ());
                            interfaceC1131100fXY.LJJIJIIJIL(C1135800ff8.LJJIIJ(giftFindGiftById));
                            C1136460fgC c1136460fgC = C1136460fgC.LIZ;
                            DataChannel dataChannel3 = this.LJ;
                            c1136460fgC.getClass();
                            C1136460fgC.LJIJJ(dataChannel3, sendGiftResult2, interfaceC1131100fXY, giftMessageLIZLLL, str6);
                            iMessageManager.insertMessage(giftMessageLIZLLL);
                            long jLJJJJ = interfaceC1131100fXY.LJJJJ();
                            String str8 = sendGiftResult2.monitorExtra;
                            long j4 = sendGiftResult2.LIZIZ;
                            Long lValueOf = Long.valueOf(sendGiftResult2.mGiftId);
                            C1132880faQ c1132880faQLIZJ3 = interfaceC1131100fXY.LIZJ();
                            if (c1132880faQLIZJ3 != null) {
                                j3 = c1132880faQLIZJ3.LIZ;
                            }
                            C1131130fXb.LIZJ(jLJJJJ, str8, j4, lValueOf, Long.valueOf(j3), Integer.valueOf(interfaceC1131100fXY.getCount()), Long.valueOf(sendGiftResult2.msgId), LJIILJJIL(sendGiftResult2));
                        } else {
                            for (GiftMessage giftMessage2 : arrayList2) {
                                C1136460fgC c1136460fgC2 = C1136460fgC.LIZ;
                                DataChannel dataChannel4 = this.LJ;
                                c1136460fgC2.getClass();
                                C1136460fgC.LJIJJ(dataChannel4, sendGiftResult2, interfaceC1131100fXY, giftMessage2, str6);
                                iMessageManager.insertMessage(giftMessage2);
                                interfaceC1131100fXY.LJJIJIIJIL(C1135800ff8.LJJIIJ(giftFindGiftById));
                                long jLJJJJ2 = interfaceC1131100fXY.LJJJJ();
                                String str9 = sendGiftResult2.monitorExtra;
                                long j5 = sendGiftResult2.LIZIZ;
                                Long lValueOf2 = Long.valueOf(sendGiftResult2.mGiftId);
                                C1132880faQ c1132880faQLIZJ4 = interfaceC1131100fXY.LIZJ();
                                if (c1132880faQLIZJ4 != null) {
                                    j = c1132880faQLIZJ4.LIZ;
                                } else {
                                    j = 0;
                                }
                                C1131130fXb.LIZJ(jLJJJJ2, str9, j5, lValueOf2, Long.valueOf(j), Integer.valueOf(interfaceC1131100fXY.getCount()), Long.valueOf(sendGiftResult2.msgId), LJIILJJIL(sendGiftResult2));
                            }
                        }
                    } else {
                        C20441214yg.LIZIZ("GiftQueueSender", "message manager null");
                    }
                }
            }
        }
        if (!C1126610fQJ.LIZJ()) {
            LJIILL();
        }
        C20441214yg.LIZIZ("GiftQueueSender", "handle send success");
    }
}
