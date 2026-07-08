package X;

import android.content.Context;
import android.os.SystemClock;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.actionhandler.IActionHandlerService;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.design.app.LiveDialog;
import com.bytedance.android.live.function.IRoomFunctionService;
import com.bytedance.android.live.pincard.event.LivePinCardVisibilityChannel;
import com.bytedance.android.live.pincard.service.IPinCardService;
import com.bytedance.android.live.publicscreen.api.IPublicScreenService;
import com.bytedance.android.livesdk.chatroom.api.SubPinCard;
import com.bytedance.android.livesdk.chatroom.ui.PortraitAudienceInteractionFragment;
import com.bytedance.android.livesdk.comp.impl.subscription.service.impl.LiveSdkSubscriptionRoomService$registerLoadWidgetCallback$1;
import com.bytedance.android.livesdk.comp.impl.subscription.widget.SubscriptionWidget;
import com.bytedance.android.livesdk.dataChannel.CustomPollCardVisibility;
import com.bytedance.android.livesdk.dataChannel.CustomizedPerksCardVisibilityChannel;
import com.bytedance.android.livesdk.dataChannel.HighPrioritySlotVisibilityChannel;
import com.bytedance.android.livesdk.dataChannel.HighPriorityTooltipVisibilityChannel;
import com.bytedance.android.livesdk.dataChannel.IsLiveStudioMonitorChannel;
import com.bytedance.android.livesdk.dataChannel.KeyboardStatusChannel;
import com.bytedance.android.livesdk.dataChannel.LiveEventCardVisibility;
import com.bytedance.android.livesdk.dataChannel.LockScreenChannel;
import com.bytedance.android.livesdk.dataChannel.PublicScreenGiftPollStateVisibilityChannel;
import com.bytedance.android.livesdk.dataChannel.PublicScreenNormalPollStateVisibilityChannel;
import com.bytedance.android.livesdk.dataChannel.SubGoalCardVisibilityChannel;
import com.bytedance.android.livesdk.dataChannel.SubOnlyLiveAudienceStatusChannel;
import com.bytedance.android.livesdk.dataChannel.UserIsAnchorChannel;
import com.bytedance.android.livesdk.event.PartnershipPromoteGameCardShowBooleanChannel;
import com.bytedance.android.livesdk.livesetting.level.FansClubCustomizeBenefitSetting;
import com.bytedance.android.livesdk.slot.FrameL2SlotVisibilityChannel;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.event.LiveGoalPinCardVisibilityChannel;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0ewT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1108110ewT {
    public volatile boolean LIZ;

    public static final C492420JSu LIZJ() {
        return new C492420JSu("go_live_page");
    }

    public static final void LJFF() {
        JSONObject jSONObject = new JSONObject();
        C0K04.LJFF("show_entrance", "live_take_page", jSONObject);
        C510380Jzw.LJJ("subscription_broadcast_entrance_hide", jSONObject);
    }

    public static final void LJI() {
        JSONObject jSONObject = new JSONObject();
        C0K04.LJFF("show_entrance", "live_take_page", jSONObject);
        C510380Jzw.LJJ("subscription_broadcast_entrance_show", jSONObject);
    }

    public static final void LJII() {
        ((IPinCardService) C1161920gLG.LIZJ(IPinCardService.class)).Y70(EnumC1107860ew4.SUB_PERKS, new C1108560exC());
    }

    public static final void LJIIIIZZ() {
        ((IPinCardService) C1161920gLG.LIZJ(IPinCardService.class)).Y70(EnumC1107860ew4.SUB_PERKS, new C1108560exC() { // from class: X.0exB
            public final C01GW LLJJI = C452501pT.LIZIZ(new C1108740exU(this));

            @Override // X.C1108560exC, X.AbstractC1108380ewu
            public final boolean LJIIL(C1108790exZ c1108790exZ) {
                long jLongValue;
                EnumC1108060ewO enumC1108060ewO;
                if (!this.LLIZ && ((enumC1108060ewO = this.LLIZLLLIL) == EnumC1108060ewO.LOCK_SCREEN || enumC1108060ewO == EnumC1108060ewO.KEY_BOARD)) {
                    LJIJI(c1108790exZ, System.currentTimeMillis() / ((long) LSPassThroughRecordSizeConfig.DEFAULT));
                    return false;
                }
                SubPinCard subPinCard = c1108790exZ.LIZ;
                if (!C494680Jac.LJI(LJI()) && !LJIIIIZZ().Qi(EnumC1107860ew4.SUB_PERKS)) {
                    if (!LJ(subPinCard)) {
                        C20441214yg.LIZIZ("CustomizedPerksBehavior", "can not pass pin card frequency control");
                    } else {
                        Long l = c1108790exZ.LIZJ;
                        if (l != null) {
                            jLongValue = l.longValue();
                        } else {
                            jLongValue = 0;
                        }
                        this.LLJILJIL = jLongValue;
                        ((C515810KKt) this.LLJJ.getValue()).LIZJ(LJFF(), this.LLILZIL, subPinCard, new C1108660exM(this, subPinCard, c1108790exZ));
                        LJIJI(c1108790exZ, 0L);
                        return true;
                    }
                }
                return false;
            }

            @Override // X.AbstractC1108380ewu, X.InterfaceC1141530foN
            public final void mh2(C262100zr c262100zr) {
                InterfaceC1107590evd interfaceC1107590evd;
                final String string;
                super.mh2(c262100zr);
                if (Intrinsics.LJFF(c262100zr.LIZ, "subscription_pin_card_click_subscribe") && (interfaceC1107590evd = c262100zr.LIZIZ) != null && (string = interfaceC1107590evd.getString("scheme")) != null) {
                    if (((Boolean) this.LLJJI.getValue()).booleanValue()) {
                        C784440Upu c784440UpuLIZ = C784440Upu.LIZ();
                        C0IF2 c0if2 = new C0IF2("audience_subscribe_pin_card_click");
                        c0if2.LIZJ = new InterfaceC463410IFf() { // from class: X.0exV
                            @Override // X.InterfaceC463410IFf
                            public final void LIZ(C19EG c19eg) {
                                ((IActionHandlerService) C1161920gLG.LIZJ(IActionHandlerService.class)).handle(c19eg, string);
                            }
                        };
                        c784440UpuLIZ.LIZIZ(c0if2);
                        return;
                    }
                    ((IActionHandlerService) C1161920gLG.LIZJ(IActionHandlerService.class)).handle(LJFF(), string);
                }
            }

            @Override // X.AbstractC1108380ewu, X.InterfaceC1107910ew9
            public final void LIZ(EnumC1108010ewJ enumC1108010ewJ, Map<String, ? extends Object> map) {
                EnumC1108700exQ enumC1108700exQ;
                long jLongValue;
                Long l;
                Object obj;
                this.LLJI = SystemClock.elapsedRealtime();
                int i = C1108020ewK.LIZ[enumC1108010ewJ.ordinal()];
                Object obj2 = null;
                if (i != 1) {
                    if (i != 2) {
                        if (map != null) {
                            obj = map.get("reason");
                        } else {
                            obj = null;
                        }
                        if (!(obj instanceof EnumC1108700exQ) || (enumC1108700exQ = (EnumC1108700exQ) obj) == null) {
                            enumC1108700exQ = EnumC1108700exQ.OTHER;
                        }
                    } else {
                        enumC1108700exQ = EnumC1108700exQ.REPLACED;
                    }
                } else {
                    enumC1108700exQ = EnumC1108700exQ.AUTO;
                }
                if (enumC1108700exQ != EnumC1108700exQ.HIDE) {
                    LJI().SX0(C1108840exe.class, null);
                }
                if (map != null) {
                    obj2 = map.get("operatorUserId");
                }
                if ((obj2 instanceof Long) && (l = (Long) obj2) != null) {
                    jLongValue = l.longValue();
                } else {
                    jLongValue = this.LLJILJIL;
                }
                if (jLongValue == UserService.getInstance().user().getCurrentUserId()) {
                    LJIIJ(enumC1108700exQ);
                }
                this.LLJ = -1L;
                this.LLJI = -1L;
                this.LLJILJIL = 0L;
                ((LinkedHashMap) this.LLJIJIL).clear();
            }

            @Override // X.C1108560exC, X.AbstractC1108380ewu, X.InterfaceC1107910ew9
            public final void LIZIZ(C1107460evQ c1107460evQ, Map<String, ? extends Object> map) {
                super.LIZIZ(c1107460evQ, map);
                C1548820qPI.LJIIIIZZ("subscription_pin_card_click_subscribe", this);
            }

            @Override // X.AbstractC1108380ewu, X.InterfaceC1107910ew9
            public final void LIZLLL(C1107460evQ c1107460evQ, Map<String, ? extends Object> map) {
                Room room;
                SubPinCard subPinCard;
                super.LIZLLL(c1107460evQ, map);
                if (((Boolean) this.LLJJI.getValue()).booleanValue()) {
                    DataChannel dataChannelLJI = LJI();
                    dataChannelLJI.BQ2(LJII(), LockScreenChannel.class, new C1108630exJ(this));
                    dataChannelLJI.BQ2(LJII(), KeyboardStatusChannel.class, new C1108640exK(this));
                }
                C1548820qPI.LIZLLL("subscription_pin_card_click_subscribe", this);
                if (!FansClubCustomizeBenefitSetting.INSTANCE.getValue() && (room = this.LLILZIL) != null && (subPinCard = room.subPinCard) != null && subPinCard.type == 1) {
                    room.subPinCard = null;
                }
                Room room2 = this.LLILZIL;
                if (room2 != null && room2.subPinCard != null) {
                    LJI().SX0(C1108840exe.class, null);
                    LJIILL(this.LLILZIL);
                    return;
                }
                C1108820exc c1108820exc = (C1108820exc) LJI().gg0(C1108840exe.class);
                if (c1108820exc == null) {
                    return;
                }
                Room room3 = this.LLILZIL;
                if (room3 != null && room3.getId() == c1108820exc.LIZJ && c1108820exc.LIZ != null) {
                    ((Boolean) this.LLJJI.getValue()).booleanValue();
                    C1108790exZ c1108790exZ = c1108820exc.LIZ;
                    if (c1108790exZ == null) {
                        return;
                    }
                    if (c1108820exc.LIZIZ > 0) {
                        c1108790exZ.LIZ.timeToLive = (System.currentTimeMillis() / ((long) LSPassThroughRecordSizeConfig.DEFAULT)) + (c1108790exZ.LIZ.timeToLive - c1108820exc.LIZIZ);
                    }
                    LJI().SX0(C1108840exe.class, null);
                    LJIIL(c1108790exZ);
                    return;
                }
                LJI().SX0(C1108840exe.class, null);
            }

            public final void LJIJI(C1108790exZ c1108790exZ, long j) {
                long id;
                DataChannel dataChannelLJI = LJI();
                Room room = this.LLILZIL;
                if (room != null) {
                    id = room.getId();
                } else {
                    id = 0;
                }
                C500260Jjc.LJJJI((Boolean) LJI().gg0(C0TZM.class));
                dataChannelLJI.SX0(C1108840exe.class, new C1108820exc(c1108790exZ, j, id));
            }
        });
    }

    public static final void LJIIJ() {
        ((IPinCardService) C1161920gLG.LIZJ(IPinCardService.class)).Y70(EnumC1107860ew4.SUB_GOAL, new AbstractC1108380ewu() { // from class: X.0exA
            public final int LLJILLL = 2;

            @Override // X.AbstractC1108380ewu
            public final int LJIIIZ() {
                return this.LLJILLL;
            }

            @Override // X.AbstractC1108380ewu
            public final void LJIIJ(EnumC1108700exQ enumC1108700exQ) {
                if (C500260Jjc.LJIIZILJ(LJI())) {
                    C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_anchor_sub_goal_pin_duration");
                    c474500IjALIZ.LJIJJLI(LJI());
                    c474500IjALIZ.LJJIIZI(this.LLJIJIL);
                    c474500IjALIZ.LJJII(Long.valueOf((this.LLJI - this.LLJ) / ((long) LSPassThroughRecordSizeConfig.DEFAULT)), "anchor_pin_duration");
                    c474500IjALIZ.LJJII(enumC1108700exQ.name().toLowerCase(Locale.ROOT), "finished_type");
                    c474500IjALIZ.LIZ();
                }
            }

            @Override // X.AbstractC1108380ewu
            public final boolean LJIIL(C1108790exZ c1108790exZ) {
                long jLongValue;
                SubPinCard subPinCard = c1108790exZ.LIZ;
                if (C494680Jac.LJI(LJI())) {
                    return false;
                }
                IPinCardService iPinCardServiceLJIIIIZZ = LJIIIIZZ();
                EnumC1107860ew4 enumC1107860ew4 = EnumC1107860ew4.SUB_GOAL;
                if (iPinCardServiceLJIIIIZZ.Qi(enumC1107860ew4) || !LJ(subPinCard)) {
                    return false;
                }
                Long l = c1108790exZ.LIZJ;
                if (l != null) {
                    jLongValue = l.longValue();
                } else {
                    jLongValue = 0;
                }
                this.LLJILJIL = jLongValue;
                return LJIIIIZZ().DP(enumC1107860ew4, new InterfaceC1107960ewE(subPinCard, this.LLJIJIL, LJI()) { // from class: X.011P
                    public final SubPinCard LL;
                    public final Map<String, String> LLILLJJLI;
                    public final DataChannel LLILLL;

                    @Override // X.InterfaceC1108000ewI
                    public final boolean LIZJ() {
                        return false;
                    }

                    /* JADX WARN: Removed duplicated region for block: B:41:0x00bc  */
                    @Override // X.InterfaceC1107960ewE
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final java.lang.String LJ() {
                        /*
                            Method dump skipped, instruction units count: 231
                            To view this dump add '--comments-level debug' option
                        */
                        throw new UnsupportedOperationException("Method not decompiled: X.C011P.LJ():java.lang.String");
                    }

                    @Override // X.InterfaceC1107960ewE
                    public final Function1<SparkContext, Unit> LJFF() {
                        return new C203100qL(this.LL);
                    }

                    {
                        this.LL = subPinCard;
                        this.LLILLJJLI = map;
                        this.LLILLL = dataChannel;
                    }
                }, c1108790exZ.LIZIZ, 30000L, null);
            }

            @Override // X.AbstractC1108380ewu
            public final void LJIIZILJ(final Function1<? super C512740K8y, Unit> function1) {
                if (LJIIIIZZ().Qi(EnumC1107860ew4.SUB_GOAL)) {
                    LJIILLIIL(function1, true);
                    return;
                }
                final C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_anchor_sub_goal_pin_confirm_click");
                c474500IjALIZ.LJIJJLI(LJI());
                c474500IjALIZ.LJJIIZI(this.LLJIJIL);
                c474500IjALIZ.LJJII(this.LLIZLLLIL.name().toLowerCase(Locale.ROOT), "original_card_type");
                C782110Um9 c782110Um9 = new C782110Um9(LJFF());
                c782110Um9.LJIIZILJ(2131844399);
                c782110Um9.LJII(2131844398);
                c782110Um9.LJIILIIL(2131843773, new InterfaceC743640TFa() { // from class: X.0exE
                    @Override // X.InterfaceC743640TFa
                    public final void LIZ(LiveDialog liveDialog) {
                        if (((IRoomFunctionService) C1161920gLG.LIZJ(IRoomFunctionService.class)).Ly1()) {
                            ((IRoomFunctionService) C1161920gLG.LIZJ(IRoomFunctionService.class)).bC1(new C1108770exX(this.LIZ, function1));
                        } else {
                            LJIILLIIL(function1, true);
                        }
                        liveDialog.dismiss();
                        C474500IjA c474500IjA = c474500IjALIZ;
                        c474500IjA.LJJII(this.LIZ.LLIZLLLIL.name().toLowerCase(Locale.ROOT), "original_card_type");
                        c474500IjA.LJJII("confirm", "click_type");
                        c474500IjA.LIZ();
                    }
                });
                c782110Um9.LJIIJ(2131843772, new InterfaceC743640TFa() { // from class: X.0exI
                    @Override // X.InterfaceC743640TFa
                    public final void LIZ(LiveDialog liveDialog) {
                        LJIILLIIL(function1, false);
                        liveDialog.dismiss();
                        C474500IjA c474500IjA = c474500IjALIZ;
                        c474500IjA.LJJII("cancel", "click_type");
                        c474500IjA.LIZ();
                    }
                });
                C786410Ut5.E4(c782110Um9.LIZ());
            }

            @Override // X.AbstractC1108380ewu, X.InterfaceC1107910ew9
            public final void LIZLLL(C1107460evQ c1107460evQ, Map<String, ? extends Object> map) {
                super.LIZLLL(c1107460evQ, map);
                LJIILL(this.LLILZIL);
            }

            @Override // X.AbstractC1108380ewu
            public final void LJIJ(EnumC1108700exQ enumC1108700exQ, Long l) {
                EnumC1108010ewJ enumC1108010ewJ;
                long jLongValue;
                IPinCardService iPinCardServiceLJIIIIZZ = LJIIIIZZ();
                EnumC1107860ew4 enumC1107860ew4 = EnumC1107860ew4.SUB_GOAL;
                int i = C1108710exR.LIZ[enumC1108700exQ.ordinal()];
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3 && i != 4) {
                            enumC1108010ewJ = EnumC1108010ewJ.OTHERS;
                        } else {
                            enumC1108010ewJ = EnumC1108010ewJ.MANUALLY_CLOSE;
                        }
                    } else {
                        enumC1108010ewJ = EnumC1108010ewJ.COVER;
                    }
                } else {
                    enumC1108010ewJ = EnumC1108010ewJ.AUTO;
                }
                Pair[] pairArr = new Pair[2];
                pairArr[0] = new Pair("reason", enumC1108700exQ);
                if (l != null) {
                    jLongValue = l.longValue();
                } else {
                    jLongValue = 0;
                }
                pairArr[1] = new Pair("operatorUserId", Long.valueOf(jLongValue));
                iPinCardServiceLJIIIIZZ.Rg(enumC1107860ew4, enumC1108010ewJ, C2097608Jq.LJIIIIZZ(pairArr));
            }
        });
    }

    public static final void LJIIJJI() throws JSONException {
        User owner;
        Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
        if (room == null || (owner = room.getOwner()) == null) {
            return;
        }
        Object objLIZIZ = C1338270kvh.LIZIZ("subscription_settings");
        if (objLIZIZ instanceof JSONObject) {
            JSONObject jSONObject = (JSONObject) objLIZIZ;
            if (!jSONObject.optBoolean("has_subscription_history", false)) {
                jSONObject.put("has_subscription_history", true);
                try {
                    C1338270kvh.LIZLLL.LIZIZ("subscription_settings").put("subscription_settings", objLIZIZ);
                } catch (JSONException e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                ((ConcurrentHashMap) C1338270kvh.LIZ).remove("subscription_settings");
            }
        }
        owner.setSubscribeStatus(true);
    }

    public final void LIZLLL() {
        if (this.LIZ) {
            return;
        }
        this.LIZ = true;
        IPublicScreenService iPublicScreenService = (IPublicScreenService) C1161920gLG.LIZJ(IPublicScreenService.class);
        iPublicScreenService.jc0(new C1109330eyR());
        iPublicScreenService.bQ1(10, new C517120KPu());
    }

    public static final SubscriptionWidget LIZ(C0KFS c0kfs) {
        SubscriptionWidget subscriptionWidget = new SubscriptionWidget();
        subscriptionWidget.args = new C0KFS[]{c0kfs};
        return subscriptionWidget;
    }

    public static final void LJ(DataChannel dataChannel) {
        if (dataChannel != null) {
            if ((!Intrinsics.LJFF(dataChannel.gg0(C0TZM.class), Boolean.TRUE) || (dataChannel != null && Intrinsics.LJFF(dataChannel.gg0(IsLiveStudioMonitorChannel.class), Boolean.TRUE))) && dataChannel != null) {
                C1108350ewr c1108350ewr = C1108350ewr.LL;
                DataChannelGlobal.LLILZ.zQ2(c1108350ewr);
                IMessageManager iMessageManager = (IMessageManager) dataChannel.gg0(C776250Uch.class);
                if (iMessageManager != null) {
                    iMessageManager.removeMessageListener(c1108350ewr);
                }
                C1108350ewr.LLILLJJLI.LIZIZ();
                C1108350ewr.LLILLL.LIZIZ();
                C1108350ewr.LLILZ.LIZIZ();
                C1548820qPI.LJIIIIZZ("subscription_pin_card_request", c1108350ewr);
                C1548820qPI.LJIIIIZZ("subscription_unpin_card_request", c1108350ewr);
                C1548820qPI.LJIIIIZZ("subscription_pin_card_close", c1108350ewr);
            }
        }
    }

    public static final void LIZIZ(Room room, DataChannel dataChannel, LifecycleOwner lifecycleOwner) {
        if (dataChannel != null) {
            if ((!Intrinsics.LJFF(dataChannel.gg0(C0TZM.class), Boolean.TRUE) || (dataChannel != null && Intrinsics.LJFF(dataChannel.gg0(IsLiveStudioMonitorChannel.class), Boolean.TRUE))) && dataChannel != null) {
                C1108350ewr c1108350ewr = C1108350ewr.LL;
                IMessageManager iMessageManager = (IMessageManager) dataChannel.gg0(C776250Uch.class);
                if (iMessageManager != null) {
                    iMessageManager.addMessageListener(C001A.SUB_PIN_EVENT_MESSAGE.getIntType(), c1108350ewr);
                }
                dataChannel.BQ2(lifecycleOwner, FrameL2SlotVisibilityChannel.class, new C1108160ewY());
                dataChannel.BQ2(lifecycleOwner, LiveEventCardVisibility.class, new C1108170ewZ());
                dataChannel.BQ2(lifecycleOwner, PublicScreenNormalPollStateVisibilityChannel.class, new C1108180ewa());
                dataChannel.BQ2(lifecycleOwner, PublicScreenGiftPollStateVisibilityChannel.class, new C1108190ewb());
                dataChannel.BQ2(lifecycleOwner, CustomPollCardVisibility.class, new C1108070ewP());
                if (!C916790Zxt.LIZ(8)) {
                    dataChannel.BQ2(lifecycleOwner, HighPrioritySlotVisibilityChannel.class, new C1108080ewQ());
                    dataChannel.BQ2(lifecycleOwner, HighPriorityTooltipVisibilityChannel.class, new C1108090ewR());
                }
                dataChannel.BQ2(lifecycleOwner, SubOnlyLiveAudienceStatusChannel.class, new C1108050ewN());
                dataChannel.BQ2(lifecycleOwner, CustomizedPerksCardVisibilityChannel.class, new C1108200ewc());
                dataChannel.BQ2(lifecycleOwner, SubGoalCardVisibilityChannel.class, new C1108210ewd());
                dataChannel.BQ2(lifecycleOwner, PartnershipPromoteGameCardShowBooleanChannel.class, new C1108340ewq());
                if (C500260Jjc.LJJIFFI((Boolean) dataChannel.gg0(UserIsAnchorChannel.class)) && C500260Jjc.LJJIFFI((Boolean) dataChannel.gg0(C0TZM.class))) {
                    dataChannel.BQ2(lifecycleOwner, LockScreenChannel.class, new C1108120ewU());
                    dataChannel.BQ2(lifecycleOwner, KeyboardStatusChannel.class, new C1108140ewW());
                }
                dataChannel.BQ2(lifecycleOwner, LivePinCardVisibilityChannel.class, new C1108040ewM());
                dataChannel.BQ2(lifecycleOwner, LiveGoalPinCardVisibilityChannel.class, new C1108100ewS());
                C1119470fEn<Integer> c1119470fEn = C1108350ewr.LLILLL;
                c1119470fEn.LJFF(1, 0);
                c1119470fEn.LJFF(2, 0);
                C1119470fEn<Integer> c1119470fEn2 = C1108350ewr.LLILZ;
                c1119470fEn2.LJFF(1, 0);
                c1119470fEn2.LJFF(2, 0);
                C1108350ewr.LIZ(room);
                C1548820qPI.LIZLLL("subscription_pin_card_request", c1108350ewr);
                C1548820qPI.LIZLLL("subscription_unpin_card_request", c1108350ewr);
                C1548820qPI.LIZLLL("subscription_pin_card_close", c1108350ewr);
            }
        }
    }

    public static final void LJIIIZ(PortraitAudienceInteractionFragment portraitAudienceInteractionFragment, Room room, DataChannel dataChannel, Context context, C1078130eA7 c1078130eA7) {
        C1108220ewe c1108220ewe = new C1108220ewe(portraitAudienceInteractionFragment, room, context, dataChannel, null, null, c1078130eA7);
        c1108220ewe.LIZJ();
        portraitAudienceInteractionFragment.getLifecycle().addObserver(new LiveSdkSubscriptionRoomService$registerLoadWidgetCallback$1(c1108220ewe));
    }
}
