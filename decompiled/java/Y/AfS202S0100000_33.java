package Y;

import X.AbstractC1387200mCc;
import X.C07ZL;
import X.C08MM;
import X.C09JN;
import X.C11JF;
import X.C1338270kvh;
import X.C13LP;
import X.C1567000qsc;
import X.C1697810uHb;
import X.C1699360uK6;
import X.C1AA6;
import X.C1AA7;
import X.C1AA8;
import X.C1ACA;
import X.C1AF3;
import X.C1AGV;
import X.C1AH6;
import X.C1AI9;
import X.C1AIE;
import X.C1AII;
import X.C1AIM;
import X.C1AJC;
import X.C1AKF;
import X.C1AKM;
import X.C1APH;
import X.C1API;
import X.C1AU9;
import X.C1C7U;
import X.C20691015xs;
import X.C21658619pY;
import X.C21658719pZ;
import X.C270660AjA;
import X.C464950ILd;
import X.C465900IOu;
import X.C481090Itn;
import X.C500260Jjc;
import X.C606810Nr5;
import X.C786410Ut5;
import X.C813430VvZ;
import X.C930940aKi;
import X.InterfaceC20673515v3;
import X.InterfaceC21659019pc;
import android.content.Context;
import android.text.TextUtils;
import android.view.GestureDetector;
import android.view.View;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.copyrightreview.helper.CopyrightViolationHelper;
import com.bytedance.android.live.network.response.BaseResponse;
import com.bytedance.android.livesdk.base.widget.StickerContainerWidget;
import com.bytedance.android.livesdk.broadcast.setting.LiveCenterManualRefreshSetting;
import com.bytedance.android.livesdk.chatroom.view.StickerEditFragment;
import com.bytedance.android.livesdk.chatroom.viewmodule.DecorationWrapperWidget;
import com.bytedance.android.livesdk.dataChannel.GlobalInflowMessage;
import com.bytedance.android.livesdk.gift.base.platform.core.manager.GiftManager;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.livesdk.livesetting.subscription.LiveSubscriptionQuestionnaireHourFrequencySetting;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveInstanceOptSetting;
import com.bytedance.android.livesdk.model.Gift;
import com.bytedance.android.livesdk.model.message.NotificationConfirmResponse;
import com.bytedance.android.livesdk.viewer_picks.model.GiftPick;
import com.bytedance.android.livesdk.viewer_picks.model.GiftPickWithStatus;
import com.bytedance.android.livesdk.viewerwishestmp.settings.ViewerWishesSettingsPage;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.feed.adapter.FollowLiveVideoViewHolder;
import com.ss.android.ugc.aweme.feed.adapter.widget.guide.LivePreviewGuideEnterVM;
import com.ss.android.ugc.aweme.feed.flexible.FlexibleSheetAssem;
import com.ss.android.ugc.aweme.feed.flexible.ui.FlexibleBottomSheetBehavior;
import com.ss.android.ugc.aweme.feed.model.live.LiveRoomStruct;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AwS44S0000100_33;
import org.json.JSONException;
import webcast.api.room.FrequencyControlData;

/* JADX INFO: loaded from: classes34.dex */
public class AfS202S0100000_33 implements C09JN {
    public final int $t;
    public Object l0;

    @Override // X.C09JN
    public final void accept(Object obj) throws JSONException {
        switch (this.$t) {
            case 0:
                accept$0(this, obj);
                break;
            case 1:
                accept$1(this, obj);
                break;
            case 2:
                accept$2(this, obj);
                break;
            case 3:
                accept$3(this, obj);
                break;
            case 4:
                accept$4(this, obj);
                break;
            case 5:
                accept$5(this, obj);
                break;
            case 6:
                accept$6(this, obj);
                break;
            case 7:
                accept$7(this, obj);
                break;
            case 8:
                accept$8(this, obj);
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                accept$9(this, obj);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                accept$10(this, obj);
                break;
            case BdTuring.TYPE_EMAIL /* 11 */:
                accept$11(this, obj);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                accept$12(this, obj);
                break;
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                accept$13(this, obj);
                break;
            case 14:
                accept$14(this, obj);
                break;
            case 15:
                accept$15(this, obj);
                break;
            case 16:
                accept$16(this, obj);
                break;
            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                accept$17(this, obj);
                break;
            case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                accept$18(this, obj);
                break;
            case 19:
                accept$19(this, obj);
                break;
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                accept$20(this, obj);
                break;
            case 21:
                accept$21(this, obj);
                break;
            case 22:
                accept$22(this, obj);
                break;
            case 23:
                accept$23(this, obj);
                break;
            case LiveSubscriptionQuestionnaireHourFrequencySetting.DEFAULT /* 24 */:
                accept$24(this, obj);
                break;
            case 25:
                accept$25(this, obj);
                break;
            case 26:
                accept$26(this, obj);
                break;
            case 27:
                accept$27(this, obj);
                break;
            case 28:
                accept$28(this, obj);
                break;
        }
    }

    public AfS202S0100000_33(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void accept$0(AfS202S0100000_33 afS202S0100000_33, Object obj) {
        CopyrightViolationHelper copyrightViolationHelper = (CopyrightViolationHelper) afS202S0100000_33.l0;
        copyrightViolationHelper.getClass();
        C1C7U.LIZ("CopyrightViolationHelper@26e1.sendConfirmRequest$2L");
        copyrightViolationHelper.LLILZLL = false;
        copyrightViolationHelper.LJ(2);
        C1C7U.LIZIZ("CopyrightViolationHelper@26e1.sendConfirmRequest$2L");
    }

    public static final void accept$1(AfS202S0100000_33 afS202S0100000_33, Object obj) {
        int i;
        CopyrightViolationHelper copyrightViolationHelper = (CopyrightViolationHelper) afS202S0100000_33.l0;
        copyrightViolationHelper.getClass();
        C1C7U.LIZ("CopyrightViolationHelper@26e1.<init>$1L$1L");
        C786410Ut5.LIZIZ(copyrightViolationHelper.LLILLL);
        Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
        if (room != null) {
            if (CopyrightViolationHelper.LIZIZ(room)) {
                i = 1;
            } else {
                i = 2;
            }
            copyrightViolationHelper.LIZLLL(room, i, 103);
            if (CopyrightViolationHelper.LIZIZ(room)) {
                C464950ILd.LJI.getClass();
                C464950ILd.LJ(null, 0);
            } else {
                Runnable runnable = copyrightViolationHelper.LLIZ;
                if (runnable != null) {
                    runnable.run();
                }
            }
        }
        C1C7U.LIZIZ("CopyrightViolationHelper@26e1.<init>$1L$1L");
    }

    public static final void accept$10(AfS202S0100000_33 afS202S0100000_33, Object obj) {
        C1C7U.LIZ("DecorationWrapperWidget@250d.onCreate$5");
        ((DecorationWrapperWidget) afS202S0100000_33.l0).onEventPause((C465900IOu) obj);
        C1C7U.LIZIZ("DecorationWrapperWidget@250d.onCreate$5");
    }

    public static final void accept$11(AfS202S0100000_33 afS202S0100000_33, Object obj) {
        LiveRoomStruct liveRoomStruct;
        C1C7U.LIZ("LivePreviewGuideEnterVM@a57e.startEnterRoomFeedbackTimer$1");
        C11JF c11jf = ((LivePreviewGuideEnterVM) afS202S0100000_33.l0).LLJIJIL;
        int i = 1;
        if (c11jf != null && (!c11jf.isDisposed())) {
            c11jf.dispose();
        }
        final LivePreviewGuideEnterVM livePreviewGuideEnterVM = (LivePreviewGuideEnterVM) afS202S0100000_33.l0;
        livePreviewGuideEnterVM.LLJIJIL = null;
        C1ACA c1acaWQ2 = livePreviewGuideEnterVM.wQ2();
        if (c1acaWQ2 != null && livePreviewGuideEnterVM.LLJILJIL == null && (liveRoomStruct = c1acaWQ2.LIZJ) != null) {
            InterfaceC20673515v3 interfaceC20673515v3K4 = ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).k4();
            if (TextUtils.equals(c1acaWQ2.LIZLLL, "homepage_live")) {
                i = 3;
            } else if (TextUtils.equals(c1acaWQ2.LIZLLL, "homepage_follow")) {
                i = 6;
            }
            livePreviewGuideEnterVM.LLJILJIL = interfaceC20673515v3K4.LLFF(i, liveRoomStruct.id, "", new C08MM() { // from class: X.1AAM
                @Override // X.C08MM
                public final void LIZ() {
                }

                @Override // X.C08MM
                public final void onFailed() {
                }

                @Override // X.C08MM
                public final void LIZIZ(FrequencyControlData frequencyControlData) {
                    InterfaceC420801kM interfaceC420801kM = livePreviewGuideEnterVM.LLJILJIL;
                    if (interfaceC420801kM != null) {
                        interfaceC420801kM.dispose();
                    }
                    livePreviewGuideEnterVM.LLJILJIL = null;
                }
            });
        }
        C1C7U.LIZIZ("LivePreviewGuideEnterVM@a57e.startEnterRoomFeedbackTimer$1");
    }

    public static final void accept$12(AfS202S0100000_33 afS202S0100000_33, Object obj) {
        Context context;
        C1C7U.LIZ("FlexibleSheetAssem@563c.initUIState$2");
        C07ZL c07zl = (C07ZL) obj;
        FlexibleSheetAssem flexibleSheetAssem = (FlexibleSheetAssem) afS202S0100000_33.l0;
        flexibleSheetAssem.LLJJJJLIIL = c07zl.LLILZ;
        flexibleSheetAssem.LLJJL = c07zl.LLILZIL;
        View viewFindViewById = flexibleSheetAssem.LJJIJL().findViewById(R.id.elh);
        if (!((FlexibleSheetAssem) afS202S0100000_33.l0).LLJJJJLIIL && viewFindViewById != null && ((Boolean) C270660AjA.LIZ.getValue()).booleanValue() && (context = ((FlexibleSheetAssem) afS202S0100000_33.l0).getContext()) != null) {
            final FlexibleSheetAssem flexibleSheetAssem2 = (FlexibleSheetAssem) afS202S0100000_33.l0;
            C21658719pZ c21658719pZ = new C21658719pZ();
            c21658719pZ.LIZ = new InterfaceC21659019pc() { // from class: X.19pa
                @Override // X.InterfaceC21659019pc
                public final void LIZ(boolean z) {
                    C21658219pU c21658219pU;
                    if (z && (c21658219pU = flexibleSheetAssem2.LLJJJJJIL) != null) {
                        c21658219pU.LIZ(false, false);
                    }
                }
            };
            C21658619pY c21658619pY = C21658619pY.LL;
            c21658619pY.getClass();
            C21658619pY.LLILLJJLI = c21658719pZ;
            GestureDetector gestureDetector = new GestureDetector(context, c21658619pY);
            FlexibleBottomSheetBehavior flexibleBottomSheetBehavior = flexibleSheetAssem2.LLJJI;
            if (flexibleBottomSheetBehavior != null) {
                flexibleBottomSheetBehavior.bind$common_feed_release(gestureDetector);
            }
        }
        C1C7U.LIZIZ("FlexibleSheetAssem@563c.initUIState$2");
    }

    public static final void accept$13(AfS202S0100000_33 afS202S0100000_33, Object obj) {
        C1AKM c1akm = (C1AKM) afS202S0100000_33.l0;
        C1C7U.LIZ("RoomManager@6c79.triggerFeedPush$1L");
        if (c1akm != null) {
            c1akm.onSuccess();
        }
        C1C7U.LIZIZ("RoomManager@6c79.triggerFeedPush$1L");
    }

    public static final void accept$14(AfS202S0100000_33 afS202S0100000_33, Object obj) {
        C1AKM c1akm = (C1AKM) afS202S0100000_33.l0;
        C1C7U.LIZ("RoomManager@6c79.triggerFeedPush$2L");
        if (c1akm != null) {
            c1akm.onFailed();
        }
        C1C7U.LIZIZ("RoomManager@6c79.triggerFeedPush$2L");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void accept$15(AfS202S0100000_33 afS202S0100000_33, Object obj) {
        C1AA7 c1aa7 = (C1AA7) afS202S0100000_33.l0;
        C1C7U.LIZ("RoomManager@6c79.fetchRoom$1L");
        T t = ((BaseResponse) obj).data;
        if (t != 0) {
            Room room = (Room) t;
            C1AA6 c1aa6 = (C1AA6) c1aa7;
            FollowLiveVideoViewHolder followLiveVideoViewHolder = c1aa6.LIZ;
            followLiveVideoViewHolder.g1 = room;
            followLiveVideoViewHolder.V0 = C1AA8.LIZ(room);
            FollowLiveVideoViewHolder followLiveVideoViewHolder2 = c1aa6.LIZ;
            if (followLiveVideoViewHolder2.X0) {
                followLiveVideoViewHolder2.x1();
            }
        } else {
            c1aa7.getClass();
        }
        C1C7U.LIZIZ("RoomManager@6c79.fetchRoom$1L");
    }

    public static final void accept$16(AfS202S0100000_33 afS202S0100000_33, Object obj) {
        C1AA7 c1aa7 = (C1AA7) afS202S0100000_33.l0;
        C1C7U.LIZ("RoomManager@6c79.fetchRoom$2L");
        c1aa7.getClass();
        C1C7U.LIZIZ("RoomManager@6c79.fetchRoom$2L");
    }

    public static final void accept$17(AfS202S0100000_33 afS202S0100000_33, Object obj) {
        C1C7U.LIZ("LinkMicFeedCoverViewManager@d149.startCheckLinkmicRoom$1$1");
        ((C1AF3) afS202S0100000_33.l0).LJJIJIIJIL(null, true, false);
        C1C7U.LIZIZ("LinkMicFeedCoverViewManager@d149.startCheckLinkmicRoom$1$1");
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final void accept$18(AfS202S0100000_33 afS202S0100000_33, Object obj) {
        C1AI9 c1ai9;
        List<C1AIM> list;
        C1AIM c1aim;
        int i;
        C1AI9 c1ai92;
        C1AI9 c1ai93;
        List<C1AIM> list2;
        C1AIM c1aim2;
        String str;
        ImageModel imageModel;
        int i2;
        long j;
        long j2;
        long j3;
        String str2;
        C1AI9 c1ai94;
        List<C1AIM> list3;
        C1C7U.LIZ("ViewerWishesSettingsPage@5f7d.registerEvent$1");
        C1AII c1aii = (C1AII) obj;
        String str3 = c1aii.LIZ;
        switch (str3.hashCode()) {
            case -1411068134:
                if (str3.equals("append") && (c1ai94 = ((ViewerWishesSettingsPage) afS202S0100000_33.l0).LLLF) != null && ((list3 = c1aii.LIZJ) == null || !((ArrayList) list3).isEmpty())) {
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    List<C1AIM> list4 = c1aii.LIZJ;
                    if (list4 != null) {
                        for (C1AIM c1aim3 : (ArrayList) list4) {
                            C1AIE c1aieLJIILJJIL = C1AI9.LJIILJJIL(c1aim3);
                            GiftPickWithStatus giftPickWithStatusLJIILIIL = C1AI9.LJIILIIL(c1aim3);
                            arrayList.add(c1aieLJIILJJIL);
                            arrayList2.add(giftPickWithStatusLJIILIIL);
                        }
                    }
                    List<C1AIE> list5 = c1ai94.LJIL;
                    if (list5 != null) {
                        list5.addAll(0, arrayList);
                    }
                    List<GiftPickWithStatus> list6 = c1ai94.LJJ;
                    if (list6 != null) {
                        list6.addAll(0, arrayList2);
                    }
                    c1ai94.LJIJ(1, -2L, 0L, "", arrayList);
                }
                break;
            case -838846263:
                if (str3.equals("update") && (c1ai93 = ((ViewerWishesSettingsPage) afS202S0100000_33.l0).LLLF) != null && (list2 = c1aii.LIZJ) != null && (c1aim2 = (C1AIM) C13LP.LJJJLL(list2)) != null) {
                    long j4 = c1aim2.LIZ;
                    List<C1AIE> list7 = c1ai93.LJIL;
                    if (list7 != null) {
                        Pair pairLJI = C500260Jjc.LJI(list7, new AwS44S0000100_33(j4, 5));
                        C1AIE c1aie = (C1AIE) pairLJI.getFirst();
                        int iIntValue = ((Number) pairLJI.getSecond()).intValue();
                        List<GiftPickWithStatus> list8 = c1ai93.LJJ;
                        if (list8 != null) {
                            Pair pairLJI2 = C500260Jjc.LJI(list8, new AwS44S0000100_33(j4, 6));
                            GiftPickWithStatus giftPickWithStatus = (GiftPickWithStatus) pairLJI2.getFirst();
                            int iIntValue2 = ((Number) pairLJI2.getSecond()).intValue();
                            if (c1aie != null && giftPickWithStatus != null && iIntValue2 >= 0 && iIntValue >= 0) {
                                Gift giftFindGiftById = GiftManager.inst().findGiftById(c1aim2.LIZJ);
                                String str4 = "";
                                if (giftFindGiftById == null || (str = giftFindGiftById.name) == null) {
                                    str = "";
                                }
                                c1aie.LIZLLL = str;
                                ImageModel imageModel2 = null;
                                if (giftFindGiftById != null) {
                                    imageModel = giftFindGiftById.image;
                                } else {
                                    imageModel = null;
                                }
                                c1aie.LJ = imageModel;
                                if (giftFindGiftById != null) {
                                    i2 = giftFindGiftById.diamondCount;
                                } else {
                                    i2 = 0;
                                }
                                c1aie.LIZJ = i2;
                                if (giftFindGiftById != null) {
                                    j = giftFindGiftById.id;
                                } else {
                                    j = 0;
                                }
                                c1aie.LIZIZ = j;
                                c1aie.LJIILL = false;
                                c1aie.LJIIJJI = C1AI9.LJFF(c1aie.LJIIJJI);
                                Gift giftFindGiftById2 = GiftManager.inst().findGiftById(c1aim2.LIZJ);
                                if (giftFindGiftById2 != null && (str2 = giftFindGiftById2.name) != null) {
                                    str4 = str2;
                                }
                                giftPickWithStatus.giftName = str4;
                                GiftPick giftPick = giftPickWithStatus.giftPick;
                                if (giftPick != null) {
                                    if (giftFindGiftById2 != null) {
                                        imageModel2 = giftFindGiftById2.image;
                                    }
                                    giftPick.giftIcon = imageModel2;
                                    if (giftFindGiftById2 != null) {
                                        j2 = giftFindGiftById2.diamondCount;
                                    } else {
                                        j2 = 0;
                                    }
                                    giftPick.giftPrice = j2;
                                    if (giftFindGiftById2 != null) {
                                        j3 = giftFindGiftById2.id;
                                    } else {
                                        j3 = 0;
                                    }
                                    giftPick.giftId = j3;
                                }
                                giftPickWithStatus.contentSource = C1AI9.LJFF(giftPickWithStatus.contentSource);
                                c1ai93.LJIJ(2, 0L, 0L, "", C1697810uHb.LJIILJJIL(c1aie));
                            }
                        }
                    }
                }
                break;
            case -745078901:
                if (str3.equals("overwrite") && (c1ai92 = ((ViewerWishesSettingsPage) afS202S0100000_33.l0).LLLF) != null) {
                    c1ai92.LJIIIZ(c1aii);
                }
                break;
            case 3108362:
                if (str3.equals("edit") && (c1ai9 = ((ViewerWishesSettingsPage) afS202S0100000_33.l0).LLLF) != null && (list = c1aii.LIZJ) != null && (c1aim = (C1AIM) C13LP.LJJJLL(list)) != null) {
                    long j5 = c1aim.LIZ;
                    List<C1AIE> list9 = c1ai9.LJIL;
                    if (list9 != null) {
                        Pair pairLJI3 = C500260Jjc.LJI(list9, new AwS44S0000100_33(j5, 3));
                        C1AIE c1aie2 = (C1AIE) pairLJI3.getFirst();
                        int iIntValue3 = ((Number) pairLJI3.getSecond()).intValue();
                        List<GiftPickWithStatus> list10 = c1ai9.LJJ;
                        if (list10 != null) {
                            Pair pairLJI4 = C500260Jjc.LJI(list10, new AwS44S0000100_33(j5, 4));
                            Object first = pairLJI4.getFirst();
                            int iIntValue4 = ((Number) pairLJI4.getSecond()).intValue();
                            if (c1aie2 != null && first != null && iIntValue4 >= 0 && iIntValue3 >= 0) {
                                C1AIE c1aieLJIILJJIL2 = C1AI9.LJIILJJIL(c1aim);
                                c1aieLJIILJJIL2.LJIIJJI = C1AI9.LJFF(c1aie2.LJIIJJI);
                                List<C1AIE> list11 = c1ai9.LJIL;
                                if (list11 != null && iIntValue3 < list11.size()) {
                                    ListProtector.set(list11, iIntValue3, c1aieLJIILJJIL2);
                                }
                                GiftPickWithStatus giftPickWithStatusLJIILIIL2 = C1AI9.LJIILIIL(c1aim);
                                giftPickWithStatusLJIILIIL2.contentSource = C1AI9.LJFF(giftPickWithStatusLJIILIIL2.contentSource);
                                GiftPick giftPick2 = giftPickWithStatusLJIILIIL2.giftPick;
                                if (giftPick2 != null) {
                                    if (c1aim.LJI) {
                                        i = 2;
                                    } else {
                                        i = 1;
                                    }
                                    giftPick2.descSource = i;
                                }
                                List<GiftPickWithStatus> list12 = c1ai9.LJJ;
                                if (list12 != null && iIntValue4 < list12.size()) {
                                    ListProtector.set(list12, iIntValue4, giftPickWithStatusLJIILIIL2);
                                }
                                c1ai9.LJIJ(2, 0L, 0L, "", C1697810uHb.LJIILJJIL(c1aieLJIILJJIL2));
                            }
                        }
                    }
                }
                break;
        }
        C1C7U.LIZIZ("ViewerWishesSettingsPage@5f7d.registerEvent$1");
    }

    public static final void accept$19(AfS202S0100000_33 afS202S0100000_33, Object obj) {
        C1AKF c1akf = (C1AKF) afS202S0100000_33.l0;
        C1C7U.LIZ("LiveServiceApiImpl@eb22.postSurveyAnswer$1L");
        c1akf.LIZIZ(((BaseResponse) obj).statusCode);
        C1C7U.LIZIZ("LiveServiceApiImpl@eb22.postSurveyAnswer$1L");
    }

    public static final void accept$2(AfS202S0100000_33 afS202S0100000_33, Object obj) {
        CopyrightViolationHelper copyrightViolationHelper = (CopyrightViolationHelper) afS202S0100000_33.l0;
        copyrightViolationHelper.getClass();
        C1C7U.LIZ("CopyrightViolationHelper@26e1.lambda$getWarningDialogBuilder$5$1L");
        copyrightViolationHelper.LLILZIL = false;
        C1C7U.LIZIZ("CopyrightViolationHelper@26e1.lambda$getWarningDialogBuilder$5$1L");
    }

    public static final void accept$20(AfS202S0100000_33 afS202S0100000_33, Object obj) {
        C1AKF c1akf = (C1AKF) afS202S0100000_33.l0;
        C1C7U.LIZ("LiveServiceApiImpl@eb22.postSurveyAnswer$2L");
        if (obj != null) {
            c1akf.onFailed();
        }
        C1C7U.LIZIZ("LiveServiceApiImpl@eb22.postSurveyAnswer$2L");
    }

    public static final void accept$21(AfS202S0100000_33 afS202S0100000_33, Object obj) {
        C1AGV c1agv = (C1AGV) afS202S0100000_33.l0;
        C1567000qsc c1567000qsc = (C1567000qsc) obj;
        C1C7U.LIZ("LiveHostAppContext@2bce.registerLifeCycleCallback$7L");
        if (c1567000qsc != null) {
            c1agv.LJIJ(c1567000qsc.LIZIZ);
        }
        C1C7U.LIZIZ("LiveHostAppContext@2bce.registerLifeCycleCallback$7L");
    }

    public static final void accept$22(AfS202S0100000_33 afS202S0100000_33, Object obj) {
        C1AU9 c1au9 = (C1AU9) afS202S0100000_33.l0;
        C813430VvZ c813430VvZ = (C813430VvZ) obj;
        C1C7U.LIZ("LiveHostAppContext@2bce.registerPageEventCallback$1L");
        if (c813430VvZ != null) {
            c1au9.LJFF(c813430VvZ.LIZ);
        }
        C1C7U.LIZIZ("LiveHostAppContext@2bce.registerPageEventCallback$1L");
    }

    public static final void accept$23(AfS202S0100000_33 afS202S0100000_33, Object obj) {
        C1AU9 c1au9 = (C1AU9) afS202S0100000_33.l0;
        C1C7U.LIZ("LiveHostAppContext@2bce.registerPageEventCallback$2L");
        c1au9.LIZ();
        C1C7U.LIZIZ("LiveHostAppContext@2bce.registerPageEventCallback$2L");
    }

    public static final void accept$24(AfS202S0100000_33 afS202S0100000_33, Object obj) {
        C1C7U.LIZ("LiveHostAppContext@2bce.registerPageEventCallback$3L");
        ((C1AU9) afS202S0100000_33.l0).LIZJ((AbstractC1387200mCc) obj);
        C1C7U.LIZIZ("LiveHostAppContext@2bce.registerPageEventCallback$3L");
    }

    public static final void accept$25(AfS202S0100000_33 afS202S0100000_33, Object obj) {
        C1C7U.LIZ("LiveHostAppContext@2bce.registerPageEventCallback$4L");
        ((C1AU9) afS202S0100000_33.l0).LIZIZ((AbstractC1387200mCc) obj);
        C1C7U.LIZIZ("LiveHostAppContext@2bce.registerPageEventCallback$4L");
    }

    public static final void accept$26(AfS202S0100000_33 afS202S0100000_33, Object obj) {
        C1C7U.LIZ("LiveHostAppContext@2bce.registerPageEventCallback$5L");
        ((C1AU9) afS202S0100000_33.l0).LIZLLL((AbstractC1387200mCc) obj);
        C1C7U.LIZIZ("LiveHostAppContext@2bce.registerPageEventCallback$5L");
    }

    public static final void accept$27(AfS202S0100000_33 afS202S0100000_33, Object obj) {
        C1C7U.LIZ("LiveHostAppContext@2bce.registerPageEventCallback$6L");
        ((C1AU9) afS202S0100000_33.l0).LJ((AbstractC1387200mCc) obj);
        C1C7U.LIZIZ("LiveHostAppContext@2bce.registerPageEventCallback$6L");
    }

    public static final void accept$28(AfS202S0100000_33 afS202S0100000_33, Object obj) {
        C1AU9 c1au9 = (C1AU9) afS202S0100000_33.l0;
        C606810Nr5 c606810Nr5 = (C606810Nr5) obj;
        C1C7U.LIZ("LiveHostAppContext@2bce.registerPageEventCallback$7L");
        if (c606810Nr5 != null) {
            c1au9.LJIJ(c606810Nr5.LIZIZ);
        }
        C1C7U.LIZIZ("LiveHostAppContext@2bce.registerPageEventCallback$7L");
    }

    public static final void accept$3(AfS202S0100000_33 afS202S0100000_33, Object obj) {
        CopyrightViolationHelper copyrightViolationHelper = (CopyrightViolationHelper) afS202S0100000_33.l0;
        copyrightViolationHelper.getClass();
        C1C7U.LIZ("CopyrightViolationHelper@26e1.lambda$getWarningDialogBuilder$5$2L");
        copyrightViolationHelper.LLILZIL = false;
        copyrightViolationHelper.LJ(1);
        C1C7U.LIZIZ("CopyrightViolationHelper@26e1.lambda$getWarningDialogBuilder$5$2L");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void accept$4(AfS202S0100000_33 afS202S0100000_33, Object obj) {
        T t;
        CopyrightViolationHelper copyrightViolationHelper = (CopyrightViolationHelper) afS202S0100000_33.l0;
        BaseResponse baseResponse = (BaseResponse) obj;
        copyrightViolationHelper.getClass();
        C1C7U.LIZ("CopyrightViolationHelper@26e1.sendConfirmRequest$1L");
        copyrightViolationHelper.LLILZLL = false;
        if (baseResponse != null && (t = baseResponse.data) != 0 && ((NotificationConfirmResponse) t).statusCode != 0) {
            copyrightViolationHelper.LJ(2);
        }
        C1C7U.LIZIZ("CopyrightViolationHelper@26e1.sendConfirmRequest$1L");
    }

    public static final void accept$5(AfS202S0100000_33 afS202S0100000_33, Object obj) {
        String str;
        C1APH c1aph = (C1APH) afS202S0100000_33.l0;
        c1aph.getClass();
        C1C7U.LIZ("LivePlayController@1c0e.startPlayerInstancePollTimer$1L");
        C1API c1api = c1aph.LL;
        if (c1api != null) {
            int iLIZJ = c1api.LIZJ();
            C1699360uK6 c1699360uK6 = C1APH.LLLLLILLIL.get(c1aph.LL);
            if (c1699360uK6 != null) {
                str = c1699360uK6.LIZ;
            } else {
                str = null;
            }
            if (TextUtils.equals("unknown", C1APH.LLLLLIL)) {
                C1APH.LLLLLIL = C20691015xs.LIZJ;
            }
            if (str == null) {
                C1C7U.LIZIZ("LivePlayController@1c0e.startPlayerInstancePollTimer$1L");
                return;
            }
            Integer num = C1APH.LLLLLJIL.get(C1APH.LLLLLIL);
            if (num == null) {
                num = -1;
            }
            Map<String, Object> map = C1338270kvh.LIZ;
            LiveInstanceOptSetting liveInstanceOptSetting = LiveInstanceOptSetting.INSTANCE;
            if (liveInstanceOptSetting.enableScrollStrategy() && num.intValue() >= 0 && Math.abs(((Integer) ((LinkedHashMap) C20691015xs.LIZIZ).get(str)).intValue() - num.intValue()) > liveInstanceOptSetting.getDistance() && iLIZJ == c1aph.LLLIL) {
                if (c1aph.LL.LIZJ() == c1aph.LLLIL) {
                    c1aph.LLLILZLLLI = 1;
                    c1aph.LJJLIIIJLLLLLLLZ();
                }
            } else {
                DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LLILZ;
                if (dataChannelGlobal.gg0(GlobalInflowMessage.class) != null && ((Boolean) dataChannelGlobal.gg0(GlobalInflowMessage.class)).booleanValue() && liveInstanceOptSetting.enableNonTabSwitchStrategy()) {
                    if (c1aph.LL.LIZJ() == c1aph.LLLIL) {
                        c1aph.LLLILZLLLI = 2;
                        c1aph.LJJLIIIJLLLLLLLZ();
                    }
                    C11JF c11jf = c1aph.LLLILZJ;
                    if (c11jf != null && !c11jf.isDisposed()) {
                        c1aph.LLLILZJ.dispose();
                    }
                }
            }
            C1C7U.LIZIZ("LivePlayController@1c0e.startPlayerInstancePollTimer$1L");
            return;
        }
        C1C7U.LIZIZ("LivePlayController@1c0e.startPlayerInstancePollTimer$1L");
    }

    public static final void accept$6(AfS202S0100000_33 afS202S0100000_33, Object obj) {
        C1C7U.LIZ("StickerContainerWidget@ef83.onLoad$2$5");
        ((StickerContainerWidget) afS202S0100000_33.l0).onEventPause((C465900IOu) obj);
        C1C7U.LIZIZ("StickerContainerWidget@ef83.onLoad$2$5");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:107:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0241 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0265  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0279  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x02a9  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x02d4  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x02d6  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x02dd  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x02ea  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0310  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0316  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0327  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0337  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x033e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void accept$7(Y.AfS202S0100000_33 r19, java.lang.Object r20) throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 832
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AfS202S0100000_33.accept$7(Y.AfS202S0100000_33, java.lang.Object):void");
    }

    public static final void accept$8(AfS202S0100000_33 afS202S0100000_33, Object obj) {
        C481090Itn c481090Itn;
        C1C7U.LIZ("LiveCenterMainView@9a36.getExtendFunctions$2");
        if (LiveCenterManualRefreshSetting.INSTANCE.isEnable() && (c481090Itn = ((C1AH6) afS202S0100000_33.l0).LLLIIIIL) != null) {
            c481090Itn.setRefreshing(false);
        }
        ((C1AH6) afS202S0100000_33.l0).LLIZ = false;
        C1C7U.LIZIZ("LiveCenterMainView@9a36.getExtendFunctions$2");
    }

    public static final void accept$9(AfS202S0100000_33 afS202S0100000_33, Object obj) {
        C1C7U.LIZ("StickerEditFragment@674.onCreate$2");
        if (((C1AJC) obj).LIZ == 0) {
            ((StickerEditFragment) afS202S0100000_33.l0).MR();
        }
        C1C7U.LIZIZ("StickerEditFragment@674.onCreate$2");
    }
}
