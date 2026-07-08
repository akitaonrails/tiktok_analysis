package X;

import com.bytedance.android.live.gift.GuideBubbleVisibilityChannel;
import com.bytedance.android.livesdk.livesetting.gift.LiveBackpackNoticeBubbleReportEnableSetting;
import com.bytedance.android.livesdk.livesetting.gift.LiveGiftMinuteGameSetting;
import com.bytedance.android.livesdk.model.message.GiftGuideMessage;
import com.bytedance.android.livesdk.model.message.GiftUnlockMessage;
import com.bytedance.android.livesdk.model.message.GuideTarget;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import tikcast.api.epiphron.TooltipDecision;
import webcast.data.BagItem;

/* JADX INFO: renamed from: X.0g51, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public class C1151850g51 implements InterfaceC254600ye {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

    @Override // X.InterfaceC254600ye
    public final void onShow() {
        switch (this.$t) {
            case 0:
                onShow$0(this);
                break;
            case 1:
                onShow$1(this);
                break;
            case 2:
                onShow$2(this);
                break;
            case 3:
                onShow$3(this);
                break;
            case 4:
                onShow$4(this);
                break;
            case 5:
                onShow$5(this);
                break;
            case 6:
                onShow$6(this);
                break;
            case 7:
                onShow$7(this);
                break;
            case 8:
                onShow$8(this);
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                onShow$9(this);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                onShow$10(this);
                break;
        }
    }

    public static final void onShow$0(C1151850g51 c1151850g51) {
        C1123590fLR.LIZ = true;
        C1123590fLR.LIZJ = EnumC1123470fLF.GIFT_GUIDE_INTERACTIVE_GIFT_TAB.getValue();
        InterfaceC1118070fCX interfaceC1118070fCX = (InterfaceC1118070fCX) c1151850g51.l0;
        if (interfaceC1118070fCX != null) {
            interfaceC1118070fCX.LIZ((C1121190fHZ) c1151850g51.l1);
        }
        C1120150fFt.LIZIZ(17, ((EnumC1120860fH2) c1151850g51.l2).getKey());
    }

    public static final void onShow$1(C1151850g51 c1151850g51) {
        C1123590fLR.LIZ = true;
        C1123590fLR.LIZJ = EnumC1123470fLF.GIFT_GUIDE_MAGIC_GIFT.getValue();
        InterfaceC1106030et7.N6.LJFF(Boolean.TRUE);
        InterfaceC1118070fCX interfaceC1118070fCX = (InterfaceC1118070fCX) c1151850g51.l0;
        if (interfaceC1118070fCX != null) {
            interfaceC1118070fCX.LIZ((C1121190fHZ) c1151850g51.l1);
        }
        C1120150fFt.LIZIZ(1, ((EnumC1120860fH2) c1151850g51.l2).getKey());
    }

    public static final void onShow$10(C1151850g51 c1151850g51) {
        int i;
        int iIntValue;
        int iIntValue2;
        int iIntValue3;
        int iIntValue4;
        int iIntValue5;
        int iIntValue6;
        int iIntValue7;
        int iIntValue8;
        C1121270fHh c1121270fHh;
        String string;
        int iIntValue9 = 0;
        if (LiveBackpackNoticeBubbleReportEnableSetting.INSTANCE.isEnable() && (c1121270fHh = (C1121270fHh) c1151850g51.l0) != null) {
            C1120780fGu c1120780fGu = (C1120780fGu) c1151850g51.l1;
            Integer num = c1121270fHh.LIZ;
            if (num != null && (string = num.toString()) != null && string.length() != 0) {
                c1120780fGu.LJII(1, c1121270fHh.LIZLLL, string, String.valueOf(c1121270fHh.LJ));
            }
        }
        C1123590fLR.LIZ = true;
        ((C1120780fGu) c1151850g51.l1).LIZ((C1121190fHZ) c1151850g51.l2);
        C1123450fLD.LIZLLL(0L, EnumC1120830fGz.MATCH_ITEM, null, 12);
        C1121300fHk c1121300fHk = (C1121300fHk) ((C1120780fGu) c1151850g51.l1).LL.gg0(C1121350fHp.class);
        if (c1121300fHk != null) {
            Integer num2 = c1121300fHk.LIZ;
            if (num2 != null) {
                iIntValue5 = num2.intValue();
            } else {
                iIntValue5 = 0;
            }
            Integer num3 = c1121300fHk.LIZIZ;
            if (num3 != null) {
                iIntValue6 = num3.intValue();
            } else {
                iIntValue6 = 0;
            }
            Integer num4 = c1121300fHk.LIZJ;
            if (num4 != null) {
                iIntValue7 = num4.intValue();
            } else {
                iIntValue7 = 0;
            }
            Integer num5 = c1121300fHk.LIZLLL;
            if (num5 != null) {
                iIntValue8 = num5.intValue();
            } else {
                iIntValue8 = 0;
            }
            Integer num6 = c1121300fHk.LJ;
            if (num6 != null) {
                iIntValue9 = num6.intValue();
            }
            C1123450fLD.LJIIJ(iIntValue5, iIntValue6, iIntValue7, iIntValue8, iIntValue9);
        } else {
            List<BagItem> list = (List) DataChannelGlobal.LLILZ.gg0(C1148160fz4.class);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            if (list != null) {
                i = 0;
                for (BagItem bagItem : list) {
                    Integer numValueOf = Integer.valueOf(bagItem.itemType);
                    Integer num7 = (Integer) linkedHashMap.get(Integer.valueOf(bagItem.itemType));
                    if (num7 != null) {
                        iIntValue4 = num7.intValue();
                    } else {
                        iIntValue4 = 0;
                    }
                    linkedHashMap.put(numValueOf, Integer.valueOf(iIntValue4 + ((int) bagItem.count)));
                    i += (int) bagItem.count;
                }
            } else {
                i = 0;
            }
            Integer num8 = (Integer) linkedHashMap.get(1);
            if (num8 != null) {
                iIntValue = num8.intValue();
            } else {
                iIntValue = 0;
            }
            Integer num9 = (Integer) linkedHashMap.get(2);
            if (num9 != null) {
                iIntValue2 = num9.intValue();
            } else {
                iIntValue2 = 0;
            }
            Integer num10 = (Integer) linkedHashMap.get(3);
            if (num10 != null) {
                iIntValue3 = num10.intValue();
            } else {
                iIntValue3 = 0;
            }
            Integer num11 = (Integer) linkedHashMap.get(4);
            if (num11 != null) {
                iIntValue9 = num11.intValue();
            }
            C1123450fLD.LJIIJ(i, iIntValue, iIntValue2, iIntValue3, iIntValue9);
        }
        ((C1120780fGu) c1151850g51.l1).LL.zW(GuideBubbleVisibilityChannel.class, Boolean.TRUE);
    }

    public static final void onShow$2(C1151850g51 c1151850g51) {
        C1123590fLR.LIZ = true;
        C1123590fLR.LIZJ = EnumC1123470fLF.GIFT_GUIDE_OUTFIT_GIFT.getValue();
        InterfaceC1106030et7.O6.LJFF(Boolean.TRUE);
        InterfaceC1118070fCX interfaceC1118070fCX = (InterfaceC1118070fCX) c1151850g51.l0;
        if (interfaceC1118070fCX != null) {
            interfaceC1118070fCX.LIZ((C1121190fHZ) c1151850g51.l1);
        }
        C1120150fFt.LIZIZ(1, ((EnumC1120860fH2) c1151850g51.l2).getKey());
    }

    public static final void onShow$3(C1151850g51 c1151850g51) {
        C1123590fLR.LIZ = true;
        C1123590fLR.LIZJ = EnumC1123470fLF.GIFT_GUIDE_SHINY_CARD_GIFT.getValue();
        InterfaceC1118070fCX interfaceC1118070fCX = (InterfaceC1118070fCX) c1151850g51.l0;
        if (interfaceC1118070fCX != null) {
            interfaceC1118070fCX.LIZ((C1121190fHZ) c1151850g51.l1);
        }
        C1120150fFt.LIZIZ(1, ((EnumC1120860fH2) c1151850g51.l2).getKey());
    }

    public static final void onShow$4(C1151850g51 c1151850g51) {
        C1123590fLR.LIZ = true;
        C1123590fLR.LIZJ = EnumC1123470fLF.GIFT_GUIDE_INTERACTIVE_GAMEPLAY_GIFT.getValue();
        if (LiveGiftMinuteGameSetting.INSTANCE.isEnable()) {
            InterfaceC1106030et7.P6.LJFF(Boolean.TRUE);
        }
        InterfaceC1118070fCX interfaceC1118070fCX = (InterfaceC1118070fCX) c1151850g51.l0;
        if (interfaceC1118070fCX != null) {
            interfaceC1118070fCX.LIZ((C1121190fHZ) c1151850g51.l1);
        }
        C1120150fFt.LIZIZ(1, ((EnumC1120860fH2) c1151850g51.l2).getKey());
    }

    public static final void onShow$5(C1151850g51 c1151850g51) {
        ((AbstractC1103160eoU) c1151850g51.l0).LJI((DataChannel) c1151850g51.l1, (TooltipDecision) c1151850g51.l2);
    }

    public static final void onShow$6(C1151850g51 c1151850g51) {
        C1123590fLR.LIZ = true;
        ((C1120780fGu) c1151850g51.l0).LIZ((C1121190fHZ) c1151850g51.l1);
        C1123450fLD.LIZLLL(Long.valueOf(((C1097090eeh) c1151850g51.l2).LIZ.id), EnumC1120830fGz.POPULARITY_RANKING_BONUS_TIME_GIFT_GUIDE, null, 12);
        ((C1120780fGu) c1151850g51.l0).LL.zW(GuideBubbleVisibilityChannel.class, Boolean.TRUE);
    }

    public static final void onShow$7(C1151850g51 c1151850g51) {
        Function0<Unit> function0LIZ;
        Long lValueOf;
        try {
            AbstractC1136060ffY abstractC1136060ffY = (AbstractC1136060ffY) c1151850g51.l0;
            if (abstractC1136060ffY instanceof GiftGuideMessage) {
                C1120780fGu c1120780fGu = (C1120780fGu) c1151850g51.l1;
                String str = ((GiftGuideMessage) abstractC1136060ffY).guideType;
                String strValueOf = String.valueOf(((GiftGuideMessage) abstractC1136060ffY).giftId);
                GuideTarget guideTarget = ((GiftGuideMessage) ((AbstractC1136060ffY) c1151850g51.l0)).guideTarget;
                if (guideTarget != null) {
                    lValueOf = Long.valueOf(guideTarget.targetId);
                } else {
                    lValueOf = null;
                }
                c1120780fGu.LJII(1, str, strValueOf, String.valueOf(lValueOf));
            } else if (abstractC1136060ffY instanceof GiftUnlockMessage) {
                DataChannel dataChannel = ((C1120780fGu) c1151850g51.l1).LL;
                if (dataChannel != null) {
                    dataChannel.SX0(C1121380fHs.class, new C1121320fHm(true, 0L, 4));
                }
                EnumC1120810fGx enumC1120810fGx = EnumC1120810fGx.UNLOCK;
                EnumC1118040fCU enumC1118040fCU = EnumC1118040fCU.BUBBLE;
                C1120780fGu c1120780fGu2 = (C1120780fGu) c1151850g51.l1;
                c1120780fGu2.LIZ(new C1121190fHZ(enumC1120810fGx, enumC1118040fCU, c1120780fGu2.LLJJIII, (Integer) null, 24));
                C146900hH.LIZ("gift_guide_bubble_show", new Pair("show_reason", "event_unlock"));
            }
            InterfaceC520940Kbs interfaceC520940Kbs = (InterfaceC520940Kbs) c1151850g51.l2;
            if (interfaceC520940Kbs != null && (function0LIZ = interfaceC520940Kbs.LIZ()) != null) {
                function0LIZ.invoke();
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public static final void onShow$8(C1151850g51 c1151850g51) {
        C1123590fLR.LIZ = true;
        ((C1120780fGu) c1151850g51.l0).LIZ((C1121190fHZ) c1151850g51.l1);
        EnumC1120830fGz enumC1120830fGz = EnumC1120830fGz.USER_LEVEL_UP;
        C1123450fLD.LIZJ(0L, enumC1120830fGz.getDesc(), ((C1094360eaI) c1151850g51.l2).LIZ, null);
        DataChannel dataChannel = ((C1120780fGu) c1151850g51.l0).LL;
        if (dataChannel != null) {
            dataChannel.zW(GuideBubbleVisibilityChannel.class, Boolean.TRUE);
        }
    }

    public static final void onShow$9(C1151850g51 c1151850g51) {
        C0JT6<List<Long>> c0jt6;
        C1123590fLR.LIZ = true;
        ((C1120780fGu) c1151850g51.l0).LIZ((C1121190fHZ) c1151850g51.l1);
        C1120940fHA c1120940fHA = (C1120940fHA) c1151850g51.l2;
        if (!Intrinsics.LJFF(c1120940fHA.LIZ, "privilege_level_up_blast_invite_bubble")) {
            if (Intrinsics.LJFF(c1120940fHA.LIZ, "privilege_gameplay_gift_bubble")) {
                c0jt6 = InterfaceC1094160eZy.O1;
            } else {
                c0jt6 = InterfaceC1094160eZy.P1;
            }
            ArrayList arrayList = (ArrayList) c0jt6.LIZ();
            if (arrayList == null) {
                arrayList = new ArrayList();
            }
            arrayList.add(Long.valueOf(c1120940fHA.LIZIZ));
            c0jt6.LIZJ(arrayList);
        }
        C1121590fID c1121590fID = C1121590fID.LIZ;
        EnumC1120860fH2 enumC1120860fH2LIZIZ = ((C1120940fHA) c1151850g51.l2).LIZIZ();
        String strValueOf = String.valueOf(((C1120940fHA) c1151850g51.l2).LIZIZ);
        Room roomLJFF = ((C1120780fGu) c1151850g51.l0).LJFF();
        String strValueOf2 = String.valueOf(((C1120940fHA) c1151850g51.l2).LIZJ);
        c1121590fID.getClass();
        C1121590fID.LIZIZ(enumC1120860fH2LIZIZ, strValueOf, roomLJFF, strValueOf2, "");
    }

    public C1151850g51(Object obj, Object obj2, Object obj3, int i) {
        this.$t = i;
        this.l0 = obj3;
        this.l1 = obj2;
        this.l2 = obj;
    }
}
