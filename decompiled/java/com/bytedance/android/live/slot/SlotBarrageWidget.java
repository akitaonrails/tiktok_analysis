package com.bytedance.android.live.slot;

import X.AbstractC1090290eTj;
import X.AbstractC1095150ebZ;
import X.AbstractC1136060ffY;
import X.C001A;
import X.C00HN;
import X.C0IJT;
import X.C0IMD;
import X.C0K9J;
import X.C0TZM;
import X.C1078480eAg;
import X.C1082930eHr;
import X.C1090300eTk;
import X.C1090630eUH;
import X.C1090690eUN;
import X.C1090710eUP;
import X.C1090780eUW;
import X.C1090810eUZ;
import X.C1090870eUf;
import X.C1090880eUg;
import X.C1090930eUl;
import X.C1090970eUp;
import X.C1090980eUq;
import X.C1091120eV4;
import X.C1091220eVE;
import X.C1091250eVH;
import X.C1094360eaI;
import X.C1095020ebM;
import X.C1095140ebY;
import X.C1161920gLG;
import X.C13LP;
import X.C1506330pIl;
import X.C1515210pX5;
import X.C1516680pZS;
import X.C158B;
import X.C1697810uHb;
import X.C20441214yg;
import X.C2188811AlT;
import X.C2252331DDr;
import X.C474500IjA;
import X.C495520Jby;
import X.C775900Uc8;
import X.C776250Uch;
import X.C786410Ut5;
import X.EnumC1100250ejn;
import X.EnumC1101430elh;
import X.EnumC1107830ew1;
import X.EnumC1133850fbz;
import X.EnumC775910Uc9;
import X.EnumC781860Ulk;
import X.InterfaceC1090750eUT;
import X.InterfaceC1093910eZZ;
import X.InterfaceC1102120emo;
import X.InterfaceC1102150emr;
import X.InterfaceC1106030et7;
import X.InterfaceC482090IvP;
import Y.AObjectS119S0000000_17;
import Y.AObjectS360S0100000_17;
import Y.AObjectS531S0100000_17;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import com.bytedance.android.live.BarrageAdjustmentEvent;
import com.bytedance.android.live.actionhandler.IActionHandlerService;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.BadgeStruct;
import com.bytedance.android.live.base.model.user.CombineBadgeStruct;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.gift.GiftDialogStatusChangeEvent;
import com.bytedance.android.live.gift.NormalGiftDisplayStatusEvent;
import com.bytedance.android.live.microom.IMicRoomService;
import com.bytedance.android.live.slot.SlotBarrageWidget;
import com.bytedance.android.livesdk.api.revenue.level.event.PublicLevelUpMessageEvent;
import com.bytedance.android.livesdk.api.revenue.level.event.UserLevelEvent;
import com.bytedance.android.livesdk.dataChannel.BarrierWidgetVisibility;
import com.bytedance.android.livesdk.dataChannel.ECStartClearScreenEvent;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.dataChannel.UserIsAnchorChannel;
import com.bytedance.android.livesdk.livesetting.barrage.LiveEcomBarrageRevampSetting;
import com.bytedance.android.livesdk.livesetting.fansclub.LiveReverseFanClubSetting;
import com.bytedance.android.livesdk.livesetting.level.BarrageGradeResConfig;
import com.bytedance.android.livesdk.livesetting.level.LiveLevelRenderEffectABControlSetting;
import com.bytedance.android.livesdk.livesetting.level.UserLevelBarrageSwitchSettings;
import com.bytedance.android.livesdk.livesetting.level.UserLevelDynamicConfig;
import com.bytedance.android.livesdk.livesetting.level.UserLevelSettings;
import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutRenderingScopeOptimizationSetting;
import com.bytedance.android.livesdk.livesetting.performance.LiveWidgetMinLoadSettingV2;
import com.bytedance.android.livesdk.livesetting.slot.LiveBarrageShowMapSetting;
import com.bytedance.android.livesdk.model.OfficialChannelInfo;
import com.bytedance.android.livesdk.model.message.AnimationData;
import com.bytedance.android.livesdk.model.message.BarrageMessage;
import com.bytedance.android.livesdk.model.message.BarrageTypeFansLevelParam;
import com.bytedance.android.livesdk.model.message.BarrageTypeUserGradeParam;
import com.bytedance.android.livesdk.model.message.CommonPopupMessage;
import com.bytedance.android.livesdk.model.message.common.Text;
import com.bytedance.android.livesdk.model.message.common.TextPiece;
import com.bytedance.android.livesdk.model.message.common.TextPieceImage;
import com.bytedance.android.livesdk.revenue.level.api.event.FansClubEvent;
import com.bytedance.android.livesdk.revenue.level.api.service.IFansClubService;
import com.bytedance.android.livesdk.revenue.level.api.service.IUserLevelBackService;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.message.CommonMessageData;
import com.bytedance.android.livesdkapi.message.ProtoMessageFetchResult;
import com.bytedance.android.message.IMessageService;
import com.bytedance.android.performanhtune.IPTFService;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.scene.Scene;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.ss.ugc.live.sdk.message.interfaces.OnMessageListener;
import com.tts.oecverify.BdTuring;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AwS596S0100000_17;

/* JADX INFO: loaded from: classes18.dex */
public class SlotBarrageWidget extends LiveRecyclableWidget implements OnMessageListener, InterfaceC1090750eUT, InterfaceC1102150emr {
    public static final List<Integer> LLJJIJI = Arrays.asList(2, 14);
    public IMessageManager LL;
    public View LLILLJJLI;
    public C1090810eUZ LLILLL;
    public boolean LLILZIL;
    public final BPEAHandler LLILZ = new BPEAHandler();
    public C1090710eUP LLILZLL = null;
    public C1090880eUg LLIZ = null;
    public C1090980eUq LLIZLLLIL = null;
    public C1091250eVH LLJ = null;
    public LinearLayout LLJI = null;
    public boolean LLJIJIL = false;
    public boolean LLJILJIL = false;
    public final boolean LLJILJILJ = UserLevelBarrageSwitchSettings.INSTANCE.getValue();
    public final boolean LLJILLL = true;
    public final boolean LLJJ = LiveLayoutRenderingScopeOptimizationSetting.INSTANCE.getValue().barrageOpt;
    public C1090870eUf LLJJI = null;
    public boolean LLJJIII = false;

    public final void H1() {
        this.LLILZIL = false;
        this.LLILLJJLI = null;
        if (this.LLILZLL != null) {
            Room room = (Room) this.dataChannel.gg0(RoomChannel.class);
            C1090710eUP c1090710eUP = this.LLILZLL;
            if (!c1090710eUP.LIZIZ.isEmpty() || !c1090710eUP.LIZJ.isEmpty()) {
                String strValueOf = String.valueOf(room != null ? Long.valueOf(room.getId()) : null);
                String strValueOf2 = String.valueOf(room != null ? Long.valueOf(room.getOwnerUserId()) : null);
                Iterator it2 = ((ArrayList) C13LP.LJLIL(c1090710eUP.LIZJ, c1090710eUP.LIZIZ)).iterator();
                int i = 0;
                int i2 = 0;
                int i3 = 0;
                int i4 = 0;
                while (it2.hasNext()) {
                    switch (((BarrageMessage) it2.next()).msgType) {
                        case 8:
                            i2++;
                            break;
                        case BdTuring.TYPE_ECAF /* 9 */:
                            i++;
                            break;
                        case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                            i4++;
                            break;
                        case BdTuring.TYPE_EMAIL /* 11 */:
                            i3++;
                            break;
                    }
                }
                C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_barrage_queue_destroy");
                c474500IjALIZ.LJIL();
                c474500IjALIZ.LJJII(strValueOf, "room_id");
                c474500IjALIZ.LJJII(strValueOf2, "anchor_id");
                c474500IjALIZ.LJJII(Integer.valueOf(i), "user_level_enter_room_size");
                c474500IjALIZ.LJJII(Integer.valueOf(i2), "user_level_upgrade_size");
                c474500IjALIZ.LJJII(Integer.valueOf(i3), "fans_club_enter_room_size");
                c474500IjALIZ.LJJII(Integer.valueOf(i4), "fans_club_upgrade_size");
                c474500IjALIZ.LIZ();
            }
            c1090710eUP.LJ = null;
            c1090710eUP.LIZLLL = false;
            c1090710eUP.LJIIIZ = null;
            c1090710eUP.LIZIZ.clear();
            c1090710eUP.LIZJ.clear();
            c1090710eUP.LJIIIIZZ.clear();
            this.LLILZLL = null;
        }
        C1090880eUg c1090880eUg = this.LLIZ;
        if (c1090880eUg != null) {
            c1090880eUg.LJIJJ();
            this.LLIZ = null;
        }
        C1090980eUq c1090980eUq = this.LLIZLLLIL;
        if (c1090980eUq != null) {
            LinearLayout linearLayout = (LinearLayout) c1090980eUq.LJFF.getValue();
            if (linearLayout != null) {
                C786410Ut5.R7(linearLayout, null);
            }
            this.LLIZLLLIL = null;
        }
        C1090870eUf c1090870eUf = this.LLJJI;
        if (c1090870eUf != null) {
            c1090870eUf.LJFF();
        }
        C1090810eUZ c1090810eUZ = this.LLILLL;
        if (c1090810eUZ != null) {
            if (LiveEcomBarrageRevampSetting.INSTANCE.enable()) {
                c1090810eUZ.LIZLLL = null;
            }
            this.LLILLL = null;
        }
    }

    @Override // X.InterfaceC1102150emr
    public final List<String> Q0() {
        return null;
    }

    @Override // X.InterfaceC1102150emr
    public final boolean e() {
        return true;
    }

    @Override // X.InterfaceC1102150emr
    public final int getComponentType() {
        return 0;
    }

    @Override // X.InterfaceC1102150emr
    public final C0K9J getUiInfo() {
        return null;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onInit(Object[] objArr) {
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public final boolean B1() {
        return Boolean.TRUE.equals(InterfaceC1093910eZZ.LLLLLLZZ.LIZ()) && LiveReverseFanClubSetting.INSTANCE.getValue() && !this.LLJILJIL;
    }

    public final void J1() {
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.zW(BarrierWidgetVisibility.class, Boolean.FALSE);
        }
        if (!this.LLJJ) {
            hide();
            return;
        }
        View view = this.LLILLJJLI;
        if (view != null) {
            C786410Ut5.LJLLLLLL(8, view);
        }
    }

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return this.LLJJ ? R.layout.hxm : R.layout.hxl;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onUnload() {
        IMessageManager iMessageManager = this.LL;
        if (iMessageManager != null) {
            iMessageManager.removeMessageListener(C001A.BARRAGE_MESSAGE.getIntType(), this);
            this.LL.removeMessageListener(C001A.COMMON_POPUP_MESSAGE.getIntType(), this);
        }
        ((IPTFService) C1161920gLG.LIZJ(IPTFService.class)).ph1(EnumC1101430elh.BARRAGE_ANIM_DOWNGRADE);
        this.LLILZ.removeCallbacksAndMessages(null);
        hide();
        this.dataChannel.zQ2(this);
        H1();
    }

    public final boolean z1() {
        C1090710eUP c1090710eUP = this.LLILZLL;
        if (c1090710eUP == null) {
            return false;
        }
        Iterator<BarrageMessage> it2 = c1090710eUP.LIZIZ.iterator();
        while (true) {
            if (!it2.hasNext()) {
                Iterator<BarrageMessage> it3 = c1090710eUP.LIZJ.iterator();
                while (it3.hasNext()) {
                    if (C1090780eUW.LJIILJJIL(it3.next())) {
                    }
                }
                return false;
            }
            if (C1090780eUW.LJIILJJIL(it2.next())) {
                break;
            }
        }
        return true;
    }

    public SlotBarrageWidget() {
        H1();
    }

    @Override // X.InterfaceC1102150emr
    public final EnumC1107830ew1 LJIIL() {
        return EnumC1107830ew1.CONSUME_MESSAGE;
    }

    @Override // X.InterfaceC1102150emr
    public final EnumC1100250ejn m() {
        return EnumC1100250ejn.PRIVILEGE;
    }

    public static void G1(C1090930eUl c1090930eUl) {
        int i;
        C1095140ebY c1095140ebYUw0 = ((IFansClubService) C1161920gLG.LIZJ(IFansClubService.class)).uw0();
        if (c1095140ebYUw0 != null) {
            i = (int) c1095140ebYUw0.LIZ;
        } else {
            i = 0;
        }
        C1090690eUN.LJ(c1090930eUl.LIZ, c1090930eUl.LIZIZ, c1090930eUl.LIZJ, c1090930eUl.LIZLLL, c1090930eUl.LJ, c1090930eUl.LJFF, "local_mock", c1090930eUl.LJI, i, -1, "local_mock", -1L);
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00b0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean A1(com.bytedance.android.livesdk.model.message.BarrageMessage r7) {
        /*
            Method dump skipped, instruction units count: 260
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.slot.SlotBarrageWidget.A1(com.bytedance.android.livesdk.model.message.BarrageMessage):boolean");
    }

    public final void D1(C1082930eHr c1082930eHr) {
        if (c1082930eHr != null && c1082930eHr.LIZ) {
            C1090880eUg c1090880eUg = this.LLIZ;
            if (c1090880eUg != null) {
                c1090880eUg.LJIJJ();
            }
            C1090870eUf c1090870eUf = this.LLJJI;
            if (c1090870eUf != null) {
                c1090870eUf.LJFF();
            }
            this.LLIZ = null;
            return;
        }
        this.LLIZ = new C1090880eUg(this.LLILLJJLI, this, this.dataChannel);
    }

    public final void E1(AbstractC1095150ebZ abstractC1095150ebZ) {
        C1095140ebY c1095140ebY;
        boolean z;
        boolean z2;
        BarrageMessage barrageMessage;
        long j;
        String str;
        long j2;
        ImageModel imageModel;
        List urls;
        if (abstractC1095150ebZ instanceof C1095020ebM) {
            C1095020ebM c1095020ebM = (C1095020ebM) abstractC1095150ebZ;
            BadgeStruct badgeStruct = null;
            if (c1095020ebM != null) {
                c1095140ebY = c1095020ebM.LIZ;
            } else {
                c1095140ebY = null;
            }
            DataChannel dataChannel = this.dataChannel;
            if (dataChannel == null) {
                return;
            }
            Room room = (Room) dataChannel.gg0(RoomChannel.class);
            if (c1095140ebY != null && room != null) {
                long j3 = c1095140ebY.LIZ;
                boolean zIl0 = ((IFansClubService) C1161920gLG.LIZJ(IFansClubService.class)).il0();
                Long lValueOf = Long.valueOf(j3);
                Long lValueOf2 = Long.valueOf(j3);
                C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_user_level_config_exist");
                c474500IjALIZ.LJIL();
                c474500IjALIZ.LJJII(Integer.valueOf(zIl0 ? 1 : 0), "is_exist");
                c474500IjALIZ.LJJII("fans_club_upgrade_barrage_config", Scene.SCENE_SERVICE);
                c474500IjALIZ.LJJII(lValueOf, "from_grade");
                c474500IjALIZ.LJJII(lValueOf2, "to_grade");
                c474500IjALIZ.LIZ();
                int i = (int) j3;
                int iWy2 = ((IFansClubService) C1161920gLG.LIZJ(IFansClubService.class)).Wy2(i);
                if (((IFansClubService) C1161920gLG.LIZJ(IFansClubService.class)).wd2() && ((IFansClubService) C1161920gLG.LIZJ(IFansClubService.class)).Kw0(this.dataChannel)) {
                    z = true;
                } else {
                    z = false;
                }
                if (iWy2 > 0) {
                    Context context = getContext();
                    IMessageManager iMessageManager = this.LL;
                    long id = room.getId();
                    ImageModel imageModelQf1 = ((IFansClubService) C1161920gLG.LIZJ(IFansClubService.class)).qf1(j3);
                    User userLJIJJLI = UserService.getInstance().user().LJIJJLI();
                    BarrageTypeFansLevelParam barrageTypeFansLevelParam = new BarrageTypeFansLevelParam();
                    barrageTypeFansLevelParam.currentGrade = i;
                    barrageTypeFansLevelParam.displayConfig = iWy2;
                    barrageTypeFansLevelParam.user = userLJIJJLI;
                    User.EnigmaInfo enigmaInfo = userLJIJJLI.enigmaInfo;
                    if (enigmaInfo != null && enigmaInfo.isEnigmaMaskOn) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("insertFansUpgradeMessage, enigma = ");
                    sbLIZ.append(z2);
                    C20441214yg.LIZIZ("BarrageMsgProductFactory", C2188811AlT.LIZIZ(sbLIZ));
                    if (z2) {
                        List<BadgeStruct> badgeList = UserService.getInstance().user().LJIJJLI().getBadgeList();
                        if (badgeList != null && (!badgeList.isEmpty())) {
                            CombineBadgeStruct combineBadgeStruct = ((BadgeStruct) ListProtector.get(badgeList, 0)).combineBadgeStruct;
                            if (combineBadgeStruct != null && (imageModel = combineBadgeStruct.icon) != null && (urls = imageModel.getUrls()) != null) {
                                int i2 = 0;
                                for (Object obj : urls) {
                                    int i3 = i2 + 1;
                                    if (i2 >= 0) {
                                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                        sbLIZ2.append("insertFansUpgradeMessage, enigma badge url = ");
                                        sbLIZ2.append((String) obj);
                                        sbLIZ2.append(", index = ");
                                        sbLIZ2.append(i2);
                                        C20441214yg.LIZIZ("BarrageMsgProductFactory", C2188811AlT.LIZIZ(sbLIZ2));
                                        i2 = i3;
                                    } else {
                                        C1697810uHb.LJIJI();
                                        throw null;
                                    }
                                }
                            }
                            badgeStruct = (BadgeStruct) ListProtector.get(badgeList, 0);
                        }
                        barrageMessage = new BarrageMessage();
                        barrageMessage.msgType = 10;
                        barrageMessage.event = C00HN.LIZ(10);
                        barrageMessage.localTimestamp = System.currentTimeMillis();
                        barrageMessage.isLocalInsertMsg = true;
                        BarrageGradeResConfig barrageGradeResConfigLJIIJJI = C1090780eUW.LJIIJJI(barrageTypeFansLevelParam.currentGrade, barrageMessage.msgType);
                        if (barrageGradeResConfigLJIIJJI != null) {
                            j2 = barrageGradeResConfigLJIIJJI.animDuration;
                        } else {
                            j2 = 3000;
                        }
                        barrageMessage.duration = j2;
                        barrageMessage.fansLevelParam = barrageTypeFansLevelParam;
                        barrageMessage.content = C1090780eUW.LIZJ(barrageTypeFansLevelParam.currentGrade);
                        barrageMessage.badge = badgeStruct;
                        ImageModel imageModel2 = new ImageModel();
                        imageModel2.setUrls(Collections.singletonList(C00HN.LIZIZ(context)));
                        barrageMessage.icon = imageModel2;
                        barrageMessage.receiveTime = C158B.LIZ();
                        CommonMessageData commonMessageData = new CommonMessageData();
                        commonMessageData.createTime = C158B.LIZ();
                        commonMessageData.roomId = id;
                        barrageMessage.baseMessage = commonMessageData;
                        barrageMessage.commonBarrageContent = C1090780eUW.LIZIZ(barrageTypeFansLevelParam.currentGrade);
                    } else {
                        barrageMessage = new BarrageMessage();
                        barrageMessage.msgType = 10;
                        barrageMessage.event = C00HN.LIZ(10);
                        barrageMessage.localTimestamp = System.currentTimeMillis();
                        barrageMessage.isLocalInsertMsg = true;
                        BarrageGradeResConfig barrageGradeResConfigLJIIJJI2 = C1090780eUW.LJIIJJI(barrageTypeFansLevelParam.currentGrade, barrageMessage.msgType);
                        if (barrageGradeResConfigLJIIJJI2 != null) {
                            j = barrageGradeResConfigLJIIJJI2.animDuration;
                        } else {
                            j = 3000;
                        }
                        barrageMessage.duration = j;
                        barrageMessage.fansLevelParam = barrageTypeFansLevelParam;
                        barrageMessage.content = C1090780eUW.LIZJ(barrageTypeFansLevelParam.currentGrade);
                        barrageMessage.rightIcon = imageModelQf1;
                        ImageModel imageModel3 = new ImageModel();
                        imageModel3.setUrls(Collections.singletonList(C00HN.LIZIZ(context)));
                        barrageMessage.icon = imageModel3;
                        barrageMessage.receiveTime = C158B.LIZ();
                        CommonMessageData commonMessageData2 = new CommonMessageData();
                        commonMessageData2.createTime = C158B.LIZ();
                        commonMessageData2.roomId = id;
                        barrageMessage.baseMessage = commonMessageData2;
                        barrageMessage.commonBarrageContent = C1090780eUW.LIZIZ(barrageTypeFansLevelParam.currentGrade);
                        if (z) {
                            str = "super_fan_upgrade";
                        } else {
                            str = "fans_upgrade";
                        }
                        barrageMessage.subType = str;
                    }
                    if (iMessageManager != null) {
                        iMessageManager.insertMessage(barrageMessage);
                    }
                }
            }
        }
    }

    public final void F1(AbstractC1090290eTj abstractC1090290eTj) {
        int i;
        IUserLevelBackService iUserLevelBackService;
        int i2;
        ImageModel imageModel;
        int iIntValue;
        boolean z;
        BarrageMessage barrageMessage;
        long j;
        BadgeStruct badgeStruct;
        long j2;
        ImageModel imageModel2;
        List urls;
        Integer num;
        if (abstractC1090290eTj instanceof C1090300eTk) {
            C1090300eTk c1090300eTk = (C1090300eTk) abstractC1090290eTj;
            UserLevelSettings userLevelSettings = UserLevelSettings.INSTANCE;
            UserLevelDynamicConfig userLevelDynamicConfig = userLevelSettings.getUserLevelConfig().userLevelDynamicConfig;
            DataChannel dataChannel = this.dataChannel;
            if (dataChannel == null) {
                return;
            }
            Room room = (Room) dataChannel.gg0(RoomChannel.class);
            int i3 = 10;
            if (userLevelDynamicConfig != null) {
                i = userLevelDynamicConfig.minBarrageGrade;
            } else {
                i = 10;
            }
            C1094360eaI c1094360eaI = c1090300eTk.LIZ;
            if (c1094360eaI != null && c1094360eaI.LIZ >= i && room != null && (iUserLevelBackService = (IUserLevelBackService) C1161920gLG.LIZJ(IUserLevelBackService.class)) != null && iUserLevelBackService.vz(c1090300eTk.LIZ.LIZ, "barrage_privilege")) {
                Context context = getContext();
                IMessageManager iMessageManager = this.LL;
                long id = room.getId();
                UserLevelDynamicConfig userLevelDynamicConfig2 = userLevelSettings.getUserLevelConfig().userLevelDynamicConfig;
                if (userLevelDynamicConfig2 != null) {
                    i3 = userLevelDynamicConfig2.minBarrageGrade;
                }
                C1094360eaI c1094360eaI2 = c1090300eTk.LIZ;
                int i4 = 0;
                if (c1094360eaI2 != null) {
                    i2 = c1094360eaI2.LIZ;
                } else {
                    i2 = 0;
                }
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("insertUpgradeMessage currentLevel:");
                sbLIZ.append(i2);
                sbLIZ.append(", minBarrageLevel:");
                sbLIZ.append(i3);
                sbLIZ.append("  ");
                C20441214yg.LJIIIZ("BarrageMsgProductFactory", C2188811AlT.LIZIZ(sbLIZ));
                if (i2 >= i3) {
                    C1094360eaI c1094360eaI3 = c1090300eTk.LIZ;
                    if (c1094360eaI3 != null) {
                        imageModel = c1094360eaI3.LJ;
                    } else {
                        imageModel = null;
                    }
                    User userLJIJJLI = UserService.getInstance().user().LJIJJLI();
                    BarrageTypeUserGradeParam barrageTypeUserGradeParam = new BarrageTypeUserGradeParam();
                    barrageTypeUserGradeParam.currentGrade = i2;
                    C1094360eaI c1094360eaI4 = c1090300eTk.LIZ;
                    if (c1094360eaI4 != null && (num = c1094360eaI4.LJIIIZ) != null) {
                        iIntValue = num.intValue();
                    } else {
                        iIntValue = 0;
                    }
                    barrageTypeUserGradeParam.displayConfig = iIntValue;
                    barrageTypeUserGradeParam.userId = String.valueOf(UserService.getInstance().user().getCurrentUserId());
                    barrageTypeUserGradeParam.user = userLJIJJLI;
                    User.EnigmaInfo enigmaInfo = userLJIJJLI.enigmaInfo;
                    if (enigmaInfo != null && enigmaInfo.isEnigmaMaskOn) {
                        z = true;
                    } else {
                        z = false;
                    }
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("insertUpgradeMessage, enigma = ");
                    sbLIZ2.append(z);
                    C20441214yg.LIZIZ("BarrageMsgProductFactory", C2188811AlT.LIZIZ(sbLIZ2));
                    if (z) {
                        List<BadgeStruct> badgeList = UserService.getInstance().user().LJIJJLI().getBadgeList();
                        if (badgeList != null && (!badgeList.isEmpty())) {
                            CombineBadgeStruct combineBadgeStruct = ((BadgeStruct) ListProtector.get(badgeList, 0)).combineBadgeStruct;
                            if (combineBadgeStruct != null && (imageModel2 = combineBadgeStruct.icon) != null && (urls = imageModel2.getUrls()) != null) {
                                int i5 = 0;
                                for (Object obj : urls) {
                                    int i6 = i5 + 1;
                                    if (i5 >= 0) {
                                        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                                        sbLIZ3.append("insertUpgradeMessage, enigma badge url = ");
                                        sbLIZ3.append((String) obj);
                                        sbLIZ3.append(", index = ");
                                        sbLIZ3.append(i5);
                                        C20441214yg.LIZIZ("BarrageMsgProductFactory", C2188811AlT.LIZIZ(sbLIZ3));
                                        i5 = i6;
                                        i4 = 0;
                                    } else {
                                        C1697810uHb.LJIJI();
                                        throw null;
                                    }
                                }
                            }
                            badgeStruct = (BadgeStruct) ListProtector.get(badgeList, i4);
                        } else {
                            badgeStruct = null;
                        }
                        barrageMessage = new BarrageMessage();
                        barrageMessage.msgType = 8;
                        barrageMessage.event = C00HN.LIZ(8);
                        barrageMessage.localTimestamp = System.currentTimeMillis();
                        barrageMessage.isLocalInsertMsg = true;
                        BarrageGradeResConfig barrageGradeResConfigLJIIJJI = C1090780eUW.LJIIJJI(barrageTypeUserGradeParam.currentGrade, barrageMessage.msgType);
                        if (barrageGradeResConfigLJIIJJI != null) {
                            j2 = barrageGradeResConfigLJIIJJI.animDuration;
                        } else {
                            j2 = 3000;
                        }
                        barrageMessage.duration = j2;
                        barrageMessage.userGradeParam = barrageTypeUserGradeParam;
                        barrageMessage.content = C1090780eUW.LIZLLL(barrageTypeUserGradeParam.currentGrade);
                        barrageMessage.badge = badgeStruct;
                        ImageModel imageModel3 = new ImageModel();
                        imageModel3.setUrls(Collections.singletonList(C00HN.LIZIZ(context)));
                        barrageMessage.icon = imageModel3;
                        barrageMessage.receiveTime = C158B.LIZ();
                        CommonMessageData commonMessageData = new CommonMessageData();
                        commonMessageData.createTime = C158B.LIZ();
                        commonMessageData.roomId = id;
                        barrageMessage.baseMessage = commonMessageData;
                        barrageMessage.commonBarrageContent = C1090780eUW.LIZIZ(barrageTypeUserGradeParam.currentGrade);
                    } else {
                        barrageMessage = new BarrageMessage();
                        barrageMessage.msgType = 8;
                        barrageMessage.event = C00HN.LIZ(8);
                        barrageMessage.localTimestamp = System.currentTimeMillis();
                        barrageMessage.isLocalInsertMsg = true;
                        BarrageGradeResConfig barrageGradeResConfigLJIIJJI2 = C1090780eUW.LJIIJJI(barrageTypeUserGradeParam.currentGrade, barrageMessage.msgType);
                        if (barrageGradeResConfigLJIIJJI2 != null) {
                            j = barrageGradeResConfigLJIIJJI2.animDuration;
                        } else {
                            j = 3000;
                        }
                        barrageMessage.duration = j;
                        barrageMessage.userGradeParam = barrageTypeUserGradeParam;
                        barrageMessage.content = C1090780eUW.LIZLLL(barrageTypeUserGradeParam.currentGrade);
                        barrageMessage.rightIcon = imageModel;
                        ImageModel imageModel4 = new ImageModel();
                        imageModel4.setUrls(Collections.singletonList(C00HN.LIZIZ(context)));
                        barrageMessage.icon = imageModel4;
                        barrageMessage.receiveTime = C158B.LIZ();
                        CommonMessageData commonMessageData2 = new CommonMessageData();
                        commonMessageData2.createTime = C158B.LIZ();
                        commonMessageData2.roomId = id;
                        barrageMessage.baseMessage = commonMessageData2;
                        barrageMessage.commonBarrageContent = C1090780eUW.LIZIZ(barrageTypeUserGradeParam.currentGrade);
                    }
                    if (iMessageManager != null) {
                        iMessageManager.insertMessage(barrageMessage);
                    }
                }
                iUserLevelBackService.Nn0(c1090300eTk.LIZ.LIZ, "barrage_privilege");
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:139:0x02a3  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0373  */
    /* JADX WARN: Removed duplicated region for block: B:316:0x056a  */
    /* JADX WARN: Removed duplicated region for block: B:322:0x05cd  */
    /* JADX WARN: Removed duplicated region for block: B:336:0x0619  */
    /* JADX WARN: Removed duplicated region for block: B:365:0x0680  */
    /* JADX WARN: Removed duplicated region for block: B:366:0x068a  */
    /* JADX WARN: Removed duplicated region for block: B:367:0x0696  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void I1(com.bytedance.android.livesdk.model.message.BarrageMessage r15) {
        /*
            Method dump skipped, instruction units count: 2500
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.slot.SlotBarrageWidget.I1(com.bytedance.android.livesdk.model.message.BarrageMessage):void");
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onLoad(Object[] objArr) {
        View view;
        View view2;
        long id;
        ProtoMessageFetchResult.BaseProtoMessage baseProtoMessage;
        byte[] bArr;
        Class<? extends AbstractC1136060ffY> messageClass;
        AbstractC1136060ffY abstractC1136060ffY;
        OfficialChannelInfo officialChannelInfo;
        this.LLILLJJLI = getView();
        if (this.LLJJ) {
            this.LLILLJJLI = findViewById(R.id.i60);
        }
        this.LL = (IMessageManager) this.dataChannel.gg0(C776250Uch.class);
        this.LLJILJIL = ((Boolean) this.dataChannel.gg0(UserIsAnchorChannel.class)).booleanValue();
        this.dataChannel.BQ2(this, NormalGiftDisplayStatusEvent.class, new AObjectS360S0100000_17(this, 8));
        this.dataChannel.BQ2(this, GiftDialogStatusChangeEvent.class, new AObjectS360S0100000_17(this, 10));
        C1091250eVH c1091250eVH = (C1091250eVH) findViewById(R.id.i5z);
        this.LLJ = c1091250eVH;
        if (c1091250eVH != null && this.LLJJ) {
            c1091250eVH.setEnableSizeChange(true);
            this.LLJ.setEnableFixedSize(this.LLJILLL);
        }
        this.LLJI = (LinearLayout) findViewById(R.id.eqx);
        ((IPTFService) C1161920gLG.LIZJ(IPTFService.class)).FA2(EnumC1101430elh.BARRAGE_ANIM_DOWNGRADE, new InterfaceC482090IvP() { // from class: X.0eUk
            /* JADX WARN: Multi-variable type inference failed */
            @Override // X.InterfaceC482090IvP
            public final void LIZ(C0IS4 c0is4) {
                boolean z;
                SlotBarrageWidget slotBarrageWidget = this.LIZ;
                if (((Integer) c0is4.LIZ).intValue() != 0) {
                    z = true;
                } else {
                    z = false;
                }
                slotBarrageWidget.LLJJIII = z;
            }
        });
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null && dataChannel.gg0(UserIsAnchorChannel.class) != null && ((Boolean) this.dataChannel.gg0(UserIsAnchorChannel.class)).booleanValue()) {
            C2252331DDr c2252331DDr = C775900Uc8.LIZ;
            C775900Uc8.LIZIZ(EnumC775910Uc9.REVENUE.getModuleName(), EnumC781860Ulk.PRIVILEGE_BARRAGE_BLOCK.getFeatureName(), false, true, true, new AObjectS531S0100000_17(this, 0));
        }
        this.dataChannel.BQ2(this, UserLevelEvent.class, new AObjectS360S0100000_17(this, 11));
        this.dataChannel.BQ2(this, FansClubEvent.class, new AObjectS360S0100000_17(this, 12));
        this.dataChannel.BQ2(this, PublicLevelUpMessageEvent.class, new AObjectS360S0100000_17(this, 13));
        this.dataChannel.BQ2(this, BarrageAdjustmentEvent.class, new AObjectS119S0000000_17(0));
        J1();
        IMessageManager iMessageManager = this.LL;
        if (iMessageManager != null) {
            iMessageManager.addMessageListener(C001A.BARRAGE_MESSAGE.getIntType(), this);
            this.LL.addMessageListener(C001A.COMMON_POPUP_MESSAGE.getIntType(), this);
        }
        this.LLILZLL = new C1090710eUP(this);
        this.LLIZ = new C1090880eUg(this.LLILLJJLI, this, this.dataChannel);
        this.dataChannel.BQ2(this, ECStartClearScreenEvent.class, new AObjectS360S0100000_17(this, 14));
        this.LLIZLLLIL = new C1090980eUq(this.LLILLJJLI, this.dataChannel, this, new AObjectS360S0100000_17(this, 15));
        View view3 = this.LLILLJJLI;
        if (view3 != null) {
            this.LLJJI = new C1090870eUf(this.context, view3, this, this.dataChannel, this.LLJ, new AObjectS360S0100000_17(this, 15));
        }
        LinearLayout linearLayout = this.LLJI;
        DataChannel dataChannel2 = this.dataChannel;
        C1090810eUZ c1090810eUZ = new C1090810eUZ(this, linearLayout, dataChannel2);
        this.LLILLL = c1090810eUZ;
        if (LiveEcomBarrageRevampSetting.INSTANCE.enable() && dataChannel2 != null) {
            dataChannel2.BQ2(this, BarrierWidgetVisibility.class, new AwS596S0100000_17(c1090810eUZ, 593));
        }
        final Room room = (Room) this.dataChannel.gg0(RoomChannel.class);
        if (room != null) {
            if (((IMicRoomService) C1161920gLG.LIZJ(IMicRoomService.class)).On1() && (officialChannelInfo = room.officialChannelInfo) != null) {
                id = officialChannelInfo.backupRoomId;
            } else {
                id = room.getId();
            }
            final String strValueOf = String.valueOf(id);
            List<String> list = InterfaceC1106030et7.E7.LIZIZ().get(String.valueOf(UserService.getInstance().user().getCurrentUserId()));
            if ((list == null || !list.contains(strValueOf)) && (baseProtoMessage = room.commercialWelcomeMessage) != null && !TextUtils.isEmpty(baseProtoMessage.method) && (bArr = baseProtoMessage.payload) != null && bArr.length >= 1 && (messageClass = ((IMessageService) C1161920gLG.LIZJ(IMessageService.class)).getMessageClass(baseProtoMessage.method)) != null) {
                C1516680pZS c1516680pZS = new C1516680pZS();
                try {
                    C1515210pX5.LIZLLL().getClass();
                    C0IMD c0imdLJI = C1515210pX5.LJI(messageClass);
                    if (c0imdLJI != null) {
                        c1516680pZS.LJIIL(new C1506330pIl(baseProtoMessage.payload));
                        abstractC1136060ffY = (AbstractC1136060ffY) c0imdLJI.LIZJ(c1516680pZS);
                    } else {
                        abstractC1136060ffY = null;
                    }
                    final BarrageMessage barrageMessage = (BarrageMessage) abstractC1136060ffY;
                    ImageModel imageModel = barrageMessage.backGround;
                    if (imageModel != null) {
                        C1091220eVE.LIZJ(imageModel);
                    }
                    this.LLJIJIL = true;
                    C786410Ut5.LJLIIL(2000L, this.LLILZ, new Runnable() { // from class: X.010D
                        @Override // java.lang.Runnable
                        public final void run() {
                            SlotBarrageWidget slotBarrageWidget = this.LL;
                            BarrageMessage barrageMessage2 = barrageMessage;
                            String str = strValueOf;
                            Room room2 = room;
                            slotBarrageWidget.getClass();
                            C1C7U.LIZ("SlotBarrageWidget@cfe.insertWelcomeMessage$1L");
                            slotBarrageWidget.LLJIJIL = false;
                            slotBarrageWidget.LL.insertMessage(barrageMessage2, true);
                            C20337914i1<Map<String, List<String>>> c20337914i1 = InterfaceC1106030et7.E7;
                            Map<String, List<String>> mapLIZIZ = c20337914i1.LIZIZ();
                            String strValueOf2 = String.valueOf(UserService.getInstance().user().getCurrentUserId());
                            List<String> arrayList = mapLIZIZ.get(strValueOf2);
                            if (arrayList == null) {
                                arrayList = new ArrayList<>();
                            }
                            if (arrayList.size() >= 10) {
                                ListProtector.remove(arrayList, 0);
                                arrayList.add(str);
                            } else {
                                arrayList.add(str);
                            }
                            mapLIZIZ.put(strValueOf2, arrayList);
                            c20337914i1.LJFF(mapLIZIZ);
                            String strValueOf3 = String.valueOf(room2.getOwnerUserId());
                            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_welcome_message_show");
                            c474500IjALIZ.LJIL();
                            c474500IjALIZ.LJJII(str, "room_id");
                            c474500IjALIZ.LJJII(strValueOf3, "anchor_id");
                            c474500IjALIZ.LIZ();
                            C1C7U.LIZIZ("SlotBarrageWidget@cfe.insertWelcomeMessage$1L");
                        }
                    });
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    this.LLJIJIL = false;
                }
            }
        }
        if (LiveWidgetMinLoadSettingV2.INSTANCE.enableSlotBarrage() && objArr != null) {
            for (Object obj : objArr) {
                if (obj instanceof C1078480eAg) {
                    Object obj2 = ((C1078480eAg) obj).LIZ;
                    if (obj2 instanceof IMessage) {
                        onMessage((IMessage) obj2);
                    } else if (obj2 instanceof NormalGiftDisplayStatusEvent) {
                        boolean z = !((Boolean) ((LiveData) obj2).getValue()).booleanValue();
                        this.LLILZIL = z;
                        if (!z && (view2 = this.LLILLJJLI) != null && view2.getVisibility() != 0) {
                            J1();
                        }
                    } else if (obj2 instanceof GiftDialogStatusChangeEvent) {
                        if (this.LLILZIL && (view = this.LLILLJJLI) != null && view.getVisibility() == 4) {
                            J1();
                        }
                    } else if (obj2 instanceof AbstractC1090290eTj) {
                        F1((AbstractC1090290eTj) obj2);
                    } else if (obj2 instanceof AbstractC1095150ebZ) {
                        E1((AbstractC1095150ebZ) obj2);
                    } else if (obj2 instanceof C1090930eUl) {
                        G1((C1090930eUl) obj2);
                    } else if (obj2 instanceof BarrageAdjustmentEvent) {
                        C1090970eUp c1090970eUp = C1090970eUp.LIZ;
                        int iIntValue = ((Integer) ((LiveData) obj2).getValue()).intValue();
                        c1090970eUp.getClass();
                        C1090970eUp.LIZIZ = iIntValue;
                    } else if (obj2 instanceof C1082930eHr) {
                        D1((C1082930eHr) obj2);
                    }
                }
            }
        }
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.OnMessageListener
    public final synchronized void onMessage(IMessage iMessage) {
        Boolean bool;
        int iLJI;
        AnimationData animationData;
        if (iMessage instanceof CommonPopupMessage) {
            if (!TextUtils.isEmpty(((CommonPopupMessage) iMessage).schemaUrl)) {
                try {
                    C495520Jby c495520Jby = new C495520Jby(((CommonPopupMessage) iMessage).schemaUrl);
                    c495520Jby.LIZJ("enter_from", "gift_send");
                    ((IActionHandlerService) C1161920gLG.LIZJ(IActionHandlerService.class)).handle(this.context, UriProtector.parse(c495520Jby.LIZLLL()));
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    C20441214yg.LJII(e);
                }
            }
            return;
        }
        if (!(iMessage instanceof BarrageMessage)) {
            return;
        }
        BarrageMessage barrageMessage = (BarrageMessage) iMessage;
        if (barrageMessage.msgType == 10 && LiveLevelRenderEffectABControlSetting.INSTANCE.getValue() == 3 && (iLJI = C1090780eUW.LJI(barrageMessage)) >= 30 && iLJI <= 39 && (animationData = barrageMessage.animationData) != null) {
            barrageMessage.renderType = 2;
            animationData.fileName = "levelup30-offset";
            animationData.geckoChannelName = "gbl_privilege_alpha_player_effect";
        }
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel == null) {
            bool = Boolean.FALSE;
        } else {
            bool = (Boolean) dataChannel.gg0(C0TZM.class);
        }
        if (bool != null && bool.booleanValue() && this.context != null) {
            C1090630eUH.LJ(barrageMessage);
            Boolean bool2 = LiveBarrageShowMapSetting.INSTANCE.getValue().get(String.valueOf(barrageMessage.msgType));
            if (bool2 != null && bool2.booleanValue()) {
                if (this.LLJJIII) {
                    return;
                }
                if (A1(barrageMessage)) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("msg interceptLiveEvent, type:");
                    sbLIZ.append(barrageMessage.msgType);
                    C20441214yg.LJIIIZ("BarrageWidget", C2188811AlT.LIZIZ(sbLIZ));
                    C1090630eUH.LIZLLL(barrageMessage, "intercepted");
                    C1091120eV4.LIZ(barrageMessage, "shouldBeIntercept");
                    return;
                }
                if (x1(barrageMessage)) {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("barrageView is showing, cur barrage message id: ");
                    sbLIZ2.append(barrageMessage.getMessageId());
                    sbLIZ2.append(",type:");
                    sbLIZ2.append(barrageMessage.msgType);
                    C20441214yg.LJIIIZ("BarrageWidget", C2188811AlT.LIZIZ(sbLIZ2));
                    this.LLILZLL.LIZ(barrageMessage);
                    return;
                }
                C1090710eUP c1090710eUP = this.LLILZLL;
                if (c1090710eUP != null) {
                    c1090710eUP.LIZLLL(barrageMessage);
                }
                I1(barrageMessage);
                return;
            }
            C1090630eUH.LIZLLL(barrageMessage, "ban by settings");
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("MsgType: ");
            sbLIZ3.append(barrageMessage.msgType);
            sbLIZ3.append(", shouldShow: ");
            sbLIZ3.append(bool2);
            C20441214yg.LJIIIZ("BarrageWidget", C2188811AlT.LIZIZ(sbLIZ3));
            C1091120eV4.LIZ(barrageMessage, "shouldBeIntercept");
            return;
        }
        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
        sbLIZ4.append("barrageView is not portrait do not show, isPortrait: ");
        sbLIZ4.append(bool);
        sbLIZ4.append(", context: ");
        sbLIZ4.append(this.context);
        C20441214yg.LJIIIZ("BarrageWidget", C2188811AlT.LIZIZ(sbLIZ4));
        C1091120eV4.LIZ(barrageMessage, "landscapeMode");
    }

    public final boolean x1(BarrageMessage barrageMessage) {
        int i;
        View view = this.LLILLJJLI;
        if (view != null && view.getVisibility() == 0) {
            return true;
        }
        if (this.LLJILJILJ && barrageMessage != null && (((i = barrageMessage.msgType) == 8 || i == 10) && C1090780eUW.LIZ(barrageMessage) && !C1090780eUW.LIZ(barrageMessage))) {
            return true;
        }
        C1090880eUg c1090880eUg = this.LLIZ;
        if ((c1090880eUg != null && c1090880eUg.LJJIIZ) || y1(barrageMessage) != null || this.LLJIJIL) {
            return true;
        }
        return false;
    }

    public final ImageModel y1(BarrageMessage barrageMessage) {
        Text text;
        List<TextPiece> list;
        TextPieceImage textPieceImage;
        ImageModel imageModel;
        if (barrageMessage != null && barrageMessage.msgType == 100 && (text = barrageMessage.content) != null && (list = text.pieces) != null) {
            for (TextPiece textPiece : list) {
                if (textPiece != null && textPiece.type == EnumC1133850fbz.IMAGE.getPieceType() && (textPieceImage = textPiece.imageValue) != null && (imageModel = textPieceImage.imageModel) != null) {
                    return imageModel;
                }
            }
            return null;
        }
        return null;
    }

    public static InterfaceC1102120emo C1(SlotBarrageWidget slotBarrageWidget, BarrageMessage barrageMessage) {
        C1090710eUP c1090710eUP = slotBarrageWidget.LLILZLL;
        if (c1090710eUP == null || barrageMessage == null) {
            return null;
        }
        return c1090710eUP.LJIIIIZZ.get(barrageMessage);
    }
}
