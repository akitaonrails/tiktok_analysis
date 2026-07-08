package X;

import Y.ARunnableS15S0200100_17;
import Y.ARunnableS20S0100100_17;
import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.util.DisplayMetrics;
import android.util.LongSparseArray;
import androidx.fragment.app.FragmentManager;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.function.IRoomFunctionService;
import com.bytedance.android.live.gift.GiftDialogHeightChannel;
import com.bytedance.android.live.poll.PollApi;
import com.bytedance.android.live.shorttouch.service.IShortTouchService;
import com.bytedance.android.livesdk.comp.api.subscription.ISubscribeService;
import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.emote.poll.detail.view.fragment.EmotePollDetailDialog;
import com.bytedance.android.livesdk.dataChannel.LiveBanCapabilityChannel;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.dataChannel.RoomUserChannel;
import com.bytedance.android.livesdk.dataChannel.ShowInteractionFeatureDialogEvent;
import com.bytedance.android.livesdk.dataChannel.StartPollMessageSEIEvent;
import com.bytedance.android.livesdk.interaction.custompoll.shorttouch.PollShortTouchHelper;
import com.bytedance.android.livesdk.interaction.pollandgiftvote.PollAndGiftVoteDialog;
import com.bytedance.android.livesdk.model.RoomAuthStatus;
import com.bytedance.android.livesdk.model.UserAttr;
import com.bytedance.android.livesdk.model.message.PollMessage;
import com.bytedance.android.livesdk.model.message.PollOptionInfo;
import com.bytedance.android.livesdk.model.message.PollStartContent;
import com.bytedance.android.livesdkapi.depend.model.live.AnchorLevelPermission;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.message.CommonMessageData;
import com.bytedance.android.livesdkapi.message.LiveMessageSEI;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.ugc.live.sdk.message.interfaces.OnMessageListener;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0eOM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1086960eOM implements InterfaceC464450IJf, InterfaceC1141530foN {
    public static PollMessage LLILZLL;
    public static long LLIZ;
    public static boolean LLIZLLLIL;
    public static PollMessage LLJ;
    public static Context LLJI;
    public static boolean LLJIJIL;
    public static C01C1 LLJJI;
    public static C294101Bz LLJJIJIL;
    public static long LLJJJ;
    public static boolean LLJJJJ;
    public static final C1086960eOM LL = new C1086960eOM();
    public static final LongSparseArray<DataChannel> LLILLJJLI = new LongSparseArray<>();
    public static final LongSparseArray<OnMessageListener> LLILLL = new LongSparseArray<>();
    public static final LongSparseArray<Integer> LLILZ = new LongSparseArray<>();
    public static final LongSparseArray<Boolean> LLILZIL = new LongSparseArray<>();
    public static final LongSparseArray<CopyOnWriteArrayList<InterfaceC1086970eON>> LLJILJIL = new LongSparseArray<>();
    public static final LongSparseArray<C01C1> LLJILJILJ = new LongSparseArray<>();
    public static final LongSparseArray<C01C1> LLJILLL = new LongSparseArray<>();
    public static final Set<Long> LLJJ = new LinkedHashSet();
    public static final BPEAHandler LLJJIII = new BPEAHandler(Looper.getMainLooper());
    public static final BPEAHandler LLJJIJI = new BPEAHandler(Looper.getMainLooper());
    public static final BPEAHandler LLJJIJIIJIL = new BPEAHandler(Looper.getMainLooper());
    public static final LongSparseArray<C01C1> LLJJJIL = new LongSparseArray<>();
    public static EnumC773040UUc LLJJJJJIL = EnumC773040UUc.POLL_CUSTOMIZABLE;

    public static final C01C1 LIZJ(long j) {
        return LLJILJILJ.get(j);
    }

    public static long LJ(Room room) {
        if (C500260Jjc.LJJJIL(LLILLJJLI.get(LLJJJ))) {
            return LLJJJ;
        }
        return room.getId();
    }

    public static boolean LJI(DataChannel dataChannel) {
        Boolean boolValueOf;
        UserAttr userAttr;
        User user;
        UserAttr userAttr2;
        if (dataChannel != null && (user = (User) dataChannel.gg0(RoomUserChannel.class)) != null && (userAttr2 = user.getUserAttr()) != null) {
            return userAttr2.isAdmin;
        }
        User userLIZIZ = C0KXJ.LIZIZ();
        if (userLIZIZ != null && (userAttr = userLIZIZ.getUserAttr()) != null) {
            boolValueOf = Boolean.valueOf(userAttr.isAdmin);
        } else {
            boolValueOf = null;
        }
        return C500260Jjc.LJJJI(boolValueOf);
    }

    public static boolean LJII(Integer num) {
        if (num != null) {
            num.intValue();
            if (C0UIM.LIZJ()) {
                if (num.intValue() == 3 || num.intValue() == 4) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public static boolean LJIIIIZZ(long j) {
        Integer num = LLILZ.get(j);
        if (num != null && num.intValue() == 0) {
            return true;
        }
        return false;
    }

    public static boolean LJIILLIIL(long j) {
        FragmentManager fragmentManager;
        try {
            DataChannel dataChannel = LLILLJJLI.get(j);
            if (dataChannel != null && (fragmentManager = (FragmentManager) dataChannel.gg0(C748880TZe.class)) != null) {
                C492400JSs.LIZ(new PollAndGiftVoteDialog(), fragmentManager, "CustomPollManager");
                return true;
            }
            return true;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("exception when back to PollAndGiftVoteDialog , msg=");
            sbLIZ.append(e.getMessage());
            C20441214yg.LJ("CustomPollManager", C2188811AlT.LIZIZ(sbLIZ));
            return false;
        }
    }

    public static void LJIIZILJ(PollMessage pollMessage) {
        if (LJII(pollMessage.pollKind)) {
            return;
        }
        C786410Ut5.LJLIIL(1000L, LLJJIJI, new RunnableC514801zW(pollMessage, 169));
    }

    @Override // X.InterfaceC464450IJf
    public final void LIZ(Room room) {
        long jLJ = LJ(room);
        LLJJJJ = true;
        if (LJIIIZ(jLJ)) {
            C01C1 c01c1LIZJ = LIZJ(jLJ);
            if (c01c1LIZJ != null) {
                C786410Ut5.LJLIIL(200L, LLJJIII, new ARunnableS15S0200100_17(c01c1LIZJ, room, jLJ, 2));
                return;
            }
            return;
        }
        C01C1 c01c1 = LLJJI;
        if (c01c1 == null) {
            return;
        }
        C786410Ut5.LJLIIL(200L, LLJJIII, new ARunnableS20S0100100_17(jLJ, c01c1, 14));
    }

    @Override // X.InterfaceC464450IJf
    public final boolean LIZIZ(long j) {
        Long l;
        Long l2;
        Room room;
        RoomAuthStatus roomAuthStatus;
        AnchorLevelPermission anchorLevelPermission;
        C0KX8 c0kx8;
        Room room2;
        LongSparseArray<DataChannel> longSparseArray = LLILLJJLI;
        DataChannel dataChannel = longSparseArray.get(j);
        RoomAuthStatus roomAuthStatus2 = null;
        if (dataChannel != null && (room2 = (Room) dataChannel.gg0(RoomChannel.class)) != null) {
            roomAuthStatus2 = room2.getRoomAuthStatus();
        }
        if (C0UIM.LIZJ()) {
            if (C500260Jjc.LJIIZILJ(longSparseArray.get(j))) {
                return C0UIM.LJI();
            }
            if (LJI(longSparseArray.get(j))) {
                DataChannel dataChannel2 = longSparseArray.get(j);
                if (dataChannel2 != null && (c0kx8 = (C0KX8) dataChannel2.gg0(LiveBanCapabilityChannel.class)) != null && c0kx8.LIZLLL) {
                    return false;
                }
                if ((roomAuthStatus2 != null && (anchorLevelPermission = roomAuthStatus2.anchorLevelPermission) != null && anchorLevelPermission.poll == 0) || (room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class)) == null || (roomAuthStatus = room.getRoomAuthStatus()) == null) {
                    return false;
                }
                Long l3 = roomAuthStatus.customizablepoll;
                if ((l3 != null && l3.longValue() == 1) || roomAuthStatus.enableGiftPoll == 1 || roomAuthStatus.customizablegiftpoll == 1 || roomAuthStatus.emotepoll == 1) {
                    return true;
                }
                return false;
            }
            return false;
        }
        if (C500260Jjc.LJIIZILJ(longSparseArray.get(j))) {
            if (roomAuthStatus2 == null || (l2 = roomAuthStatus2.customizablepoll) == null || l2.longValue() != 1) {
                return false;
            }
        } else if (LJI(longSparseArray.get(j)) && roomAuthStatus2 != null && (l = roomAuthStatus2.customizablepoll) != null && l.longValue() == 1) {
            AnchorLevelPermission anchorLevelPermission2 = roomAuthStatus2.anchorLevelPermission;
            if (anchorLevelPermission2 != null && anchorLevelPermission2.customizablePoll == 0) {
                return false;
            }
        } else {
            return false;
        }
        return true;
    }

    public final Integer LIZLLL(long j) {
        C01C1 c01c1LIZJ = LIZJ(j);
        if (c01c1LIZJ != null) {
            long j2 = c01c1LIZJ.LIZIZ;
            if (j2 > 0 || j2 == -1) {
                PollMessage pollMessage = c01c1LIZJ.LJFF;
                if (pollMessage == null) {
                    return null;
                }
                return pollMessage.pollKind;
            }
        }
        if (!C1086830eO9.LIZLLL()) {
            return null;
        }
        return 0;
    }

    public final boolean LJIIIZ(long j) {
        C01C1 c01c1LIZJ = LIZJ(j);
        if (c01c1LIZJ == null) {
            return false;
        }
        long j2 = c01c1LIZJ.LIZIZ;
        if (j2 <= 0 && j2 != -1) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC1141530foN
    public final void mh2(C262100zr c262100zr) {
        int iLIZLLL;
        C19EG c19egLJ;
        String strLJFF;
        C01C1 c01c1;
        PollMessage pollMessage;
        FragmentManager fragmentManager;
        String secUid;
        User owner;
        String strLJFF2;
        String strLJFF3;
        C19EG c19egLJ2;
        String strLJFF4;
        String strLJFF5;
        boolean zLIZIZ;
        DataChannel dataChannel;
        List<Object> list;
        String str = "";
        Map<String, Object> mapLIZ = null;
        if (C500260Jjc.LJJJIL(LLILLJJLI.get(LLJJJ)) && Intrinsics.LJFF(c262100zr.LIZ, "try_mode_custom_poll_message_event")) {
            try {
                InterfaceC1107590evd interfaceC1107590evd = c262100zr.LIZIZ;
                if (interfaceC1107590evd == null) {
                    return;
                }
                String strLJFF6 = C1871910yoP.LJFF(interfaceC1107590evd, "message_type", "");
                long j = CastLongProtector.parseLong(C1871910yoP.LJFF(interfaceC1107590evd, "poll_id", ""));
                if (Intrinsics.LJFF(strLJFF6, CardStruct.IStatusCode.DEFAULT)) {
                    String strLJFF7 = C1871910yoP.LJFF(interfaceC1107590evd, "title", "");
                    InterfaceC1871920yoQ interfaceC1871920yoQLIZ = C1871910yoP.LIZ(interfaceC1107590evd, "option_list", null);
                    if (interfaceC1871920yoQLIZ == null || (list = interfaceC1871920yoQLIZ.toList()) == null) {
                        list = C13BV.INSTANCE;
                    }
                    long j2 = CastLongProtector.parseLong(C1871910yoP.LJFF(interfaceC1107590evd, "start_time", String.valueOf(System.currentTimeMillis())));
                    long j3 = CastLongProtector.parseLong(C1871910yoP.LJFF(interfaceC1107590evd, "end_time", String.valueOf(System.currentTimeMillis())));
                    PollMessage pollMessage2 = new PollMessage();
                    pollMessage2.messageType = 0L;
                    pollMessage2.pollKind = 2;
                    pollMessage2.pollId = j;
                    PollStartContent pollStartContent = new PollStartContent();
                    pollStartContent.title = strLJFF7;
                    int i = 0;
                    for (Object obj : list) {
                        int i2 = i + 1;
                        if (i >= 0) {
                            List<PollOptionInfo> list2 = pollStartContent.optionList;
                            PollOptionInfo pollOptionInfo = new PollOptionInfo();
                            pollOptionInfo.displayContent = String.valueOf(obj);
                            pollOptionInfo.optionIndex = i;
                            list2.add(pollOptionInfo);
                            i = i2;
                        } else {
                            C1697810uHb.LJIJI();
                            throw null;
                        }
                    }
                    pollStartContent.startTime = j2;
                    pollStartContent.endTime = j3;
                    pollMessage2.startContent = pollStartContent;
                    CommonMessageData commonMessageData = new CommonMessageData();
                    pollMessage2.baseMessage = commonMessageData;
                    commonMessageData.createTime = System.currentTimeMillis();
                    C482260Ivg.LIZIZ(C001A.LIVE_POLL_MESSAGE.getIntType(), pollMessage2);
                } else {
                    ((PollApi) C482260Ivg.LIZJ(PollApi.class)).LIZ(j);
                }
                C189200o6.m2constructorimpl(Unit.LIZ);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
            }
        }
        if (Intrinsics.LJFF(c262100zr.LIZ, "custom_poll_start")) {
            long j4 = LLJJJ;
            if (j4 != 0) {
                LLILZIL.put(j4, Boolean.TRUE);
                InterfaceC1107590evd interfaceC1107590evd2 = c262100zr.LIZIZ;
                if (interfaceC1107590evd2 != null) {
                    try {
                        Gson gson = C19748512Ol.LIZJ;
                        InterfaceC1107590evd map = interfaceC1107590evd2.getMap("sei");
                        if (map != null) {
                            mapLIZ = map.LIZ();
                        }
                        LiveMessageSEI liveMessageSEI = (LiveMessageSEI) gson.LJII(gson.LJIILL(mapLIZ), LiveMessageSEI.class);
                        if (liveMessageSEI != null && (dataChannel = LLILLJJLI.get(LLJJJ)) != null) {
                            dataChannel.LC0(StartPollMessageSEIEvent.class, liveMessageSEI);
                            return;
                        }
                        return;
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                        return;
                    }
                }
                return;
            }
            return;
        }
        if (Intrinsics.LJFF(c262100zr.LIZ, "custom_poll_template_page_status")) {
            InterfaceC1107590evd interfaceC1107590evd3 = c262100zr.LIZIZ;
            if (interfaceC1107590evd3 != null) {
                zLIZIZ = C1871910yoP.LIZIZ(interfaceC1107590evd3, "show", false);
            } else {
                zLIZIZ = false;
            }
            LLJIJIL = zLIZIZ;
            return;
        }
        if (Intrinsics.LJFF(c262100zr.LIZ, "custom_poll_open_interact")) {
            DataChannel dataChannel2 = LLILLJJLI.get(LLJJJ);
            if (dataChannel2 != null) {
                dataChannel2.FQ2(ShowInteractionFeatureDialogEvent.class);
                return;
            }
            return;
        }
        String str2 = "short_touch";
        if (Intrinsics.LJFF(c262100zr.LIZ, "custom_poll_open_detailed_panel")) {
            InterfaceC1107590evd interfaceC1107590evd4 = c262100zr.LIZIZ;
            if (interfaceC1107590evd4 != null && (strLJFF5 = C1871910yoP.LJFF(interfaceC1107590evd4, "enter_from", "short_touch")) != null) {
                str2 = strLJFF5;
            }
            InterfaceC1107590evd interfaceC1107590evd5 = c262100zr.LIZIZ;
            if (interfaceC1107590evd5 != null && (strLJFF4 = C1871910yoP.LJFF(interfaceC1107590evd5, "poll_id", "")) != null) {
                str = strLJFF4;
            }
            Context context = LLJI;
            if (context != null && (c19egLJ2 = C500260Jjc.LJ(context)) != null) {
                ((IRoomFunctionService) C1161920gLG.LIZJ(IRoomFunctionService.class)).Sc2(str2, c19egLJ2, LLILLJJLI.get(LLJJJ), true, str);
                return;
            }
            return;
        }
        if (Intrinsics.LJFF(c262100zr.LIZ, "sub_emote_poll_open_detailed_panel")) {
            InterfaceC1107590evd interfaceC1107590evd6 = c262100zr.LIZIZ;
            if (interfaceC1107590evd6 != null && (strLJFF3 = C1871910yoP.LJFF(interfaceC1107590evd6, "enter_from", "short_touch")) != null) {
                str2 = strLJFF3;
            }
            try {
                InterfaceC1107590evd interfaceC1107590evd7 = c262100zr.LIZIZ;
                if (interfaceC1107590evd7 != null && (strLJFF2 = C1871910yoP.LJFF(interfaceC1107590evd7, "poll_id", "")) != null) {
                    str = strLJFF2;
                }
                Long lValueOf = Long.valueOf(CastLongProtector.parseLong(str));
                if (lValueOf != null) {
                    lValueOf.longValue();
                    LongSparseArray<DataChannel> longSparseArray = LLILLJJLI;
                    DataChannel dataChannel3 = longSparseArray.get(LLJJJ);
                    if (dataChannel3 != null) {
                        fragmentManager = (FragmentManager) dataChannel3.gg0(C748880TZe.class);
                    } else {
                        fragmentManager = null;
                    }
                    ((ISubscribeService) C1161920gLG.LIZJ(ISubscribeService.class)).xf().getClass();
                    Bundle bundle = new Bundle();
                    C786410Ut5.LJJJI("enter_from", str2, bundle);
                    C786410Ut5.LJJJI("poll_id", lValueOf.toString(), bundle);
                    Room roomLJJLIIIIJ = C500260Jjc.LJJLIIIIJ(longSparseArray.get(LLJJJ));
                    if (roomLJJLIIIIJ != null && (owner = roomLJJLIIIIJ.getOwner()) != null) {
                        secUid = owner.getSecUid();
                    } else {
                        secUid = null;
                    }
                    C786410Ut5.LJJJI("sec_anchor_id", secUid, bundle);
                    bundle.putBoolean("is_anchor", C500260Jjc.LJIIZILJ(longSparseArray.get(LLJJJ)));
                    C19322110iZ.LIZLLL(fragmentManager, EmotePollDetailDialog.class, "sub_emote_poll_detail", null, bundle);
                    return;
                }
                return;
            } catch (Exception e2) {
                TryCatchGuardChecker.doCheck(e2);
                C20441214yg.LJII(e2);
                return;
            }
        }
        if (Intrinsics.LJFF(c262100zr.LIZ, "close_poll_short_touch")) {
            InterfaceC1107590evd interfaceC1107590evd8 = c262100zr.LIZIZ;
            if (interfaceC1107590evd8 != null) {
                strLJFF = C1871910yoP.LJFF(interfaceC1107590evd8, "poll_id", "-1");
            } else {
                strLJFF = null;
            }
            long jLIZIZ = C0IZJ.LIZIZ(strLJFF);
            if (LIZLLL(LLJJJ) == null && (c01c1 = LLJJI) != null && (pollMessage = c01c1.LJFF) != null && jLIZIZ == pollMessage.pollId) {
                LLJJI = null;
                InterfaceC1087010eOR interfaceC1087010eOR = (InterfaceC1087010eOR) C1161920gLG.LIZJ(IShortTouchService.class);
                if (interfaceC1087010eOR != null && jLIZIZ == PollShortTouchHelper.LIZIZ) {
                    interfaceC1087010eOR.Ud(EnumC1101860emO.NAME, PollShortTouchHelper.LIZ);
                    return;
                }
                return;
            }
            return;
        }
        if (Intrinsics.LJFF(c262100zr.LIZ, "gift_vote_dialog_status_changed") && C497740JfY.LJIL()) {
            InterfaceC1107590evd interfaceC1107590evd9 = c262100zr.LIZIZ;
            if (interfaceC1107590evd9 != null && C1871910yoP.LIZIZ(interfaceC1107590evd9, "isOpen", false)) {
                InterfaceC1107590evd interfaceC1107590evd10 = c262100zr.LIZIZ;
                if (interfaceC1107590evd10 != null) {
                    iLIZLLL = C1871910yoP.LIZLLL(interfaceC1107590evd10, "giftDialogHeight", 0);
                } else {
                    iLIZLLL = 0;
                }
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("height from FE is ");
                sbLIZ.append(iLIZLLL);
                C20441214yg.LJIIIZ("PollAndGiftVote", C2188811AlT.LIZIZ(sbLIZ));
                Context context2 = LLJI;
                if (context2 != null && (c19egLJ = C500260Jjc.LJ(context2)) != null) {
                    DisplayMetrics displayMetrics = new DisplayMetrics();
                    C2204961BRm.LLILZIL(c19egLJ.getWindowManager(), new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+K86yefFGJAl/j5U8mU9xUG0I/xwf+EP1TY=", null)).getRealMetrics(displayMetrics);
                    double d = (((double) displayMetrics.heightPixels) * ((double) iLIZLLL)) / ((double) 100);
                    LongSparseArray<DataChannel> longSparseArray2 = LLILLJJLI;
                    DataChannel dataChannel4 = longSparseArray2.get(LLJJJ);
                    if (dataChannel4 != null) {
                        C937450aVD c937450aVDLIZ = C937440aVC.LIZ(longSparseArray2.get(LLJJJ));
                        C0N5J c0n5j = C0N5J.TYPE_VOTE_DIALOG;
                        c937450aVDLIZ.LIZ = EnumC1998407sE.NORMAL;
                        ((EnumMap) c937450aVDLIZ.LIZIZ).put(c0n5j, Integer.valueOf((int) d));
                        dataChannel4.zW(GiftDialogHeightChannel.class, c937450aVDLIZ);
                        return;
                    }
                    return;
                }
                return;
            }
            LongSparseArray<DataChannel> longSparseArray3 = LLILLJJLI;
            DataChannel dataChannel5 = longSparseArray3.get(LLJJJ);
            if (dataChannel5 != null) {
                C937450aVD c937450aVDLIZ2 = C937440aVC.LIZ(longSparseArray3.get(LLJJJ));
                C0N5J c0n5j2 = C0N5J.TYPE_VOTE_DIALOG;
                c937450aVDLIZ2.LIZ = EnumC1998407sE.NORMAL;
                ((EnumMap) c937450aVDLIZ2.LIZIZ).put(c0n5j2, 0);
                dataChannel5.zW(GiftDialogHeightChannel.class, c937450aVDLIZ2);
            }
        }
    }

    public static void LJIIJJI(long j, C01C1 c01c1) {
        CopyOnWriteArrayList<InterfaceC1086970eON> copyOnWriteArrayList;
        if (!C924810aAp.LJ().LJIILIIL && (copyOnWriteArrayList = LLJILJIL.get(j)) != null) {
            Iterator<InterfaceC1086970eON> it2 = copyOnWriteArrayList.iterator();
            while (it2.hasNext()) {
                it2.next().LIZJ(c01c1);
            }
        }
    }

    public static final void LJIILL(long j, InterfaceC1086970eON interfaceC1086970eON) {
        LongSparseArray<CopyOnWriteArrayList<InterfaceC1086970eON>> longSparseArray = LLJILJIL;
        CopyOnWriteArrayList<InterfaceC1086970eON> copyOnWriteArrayList = longSparseArray.get(j);
        if (copyOnWriteArrayList == null) {
            copyOnWriteArrayList = new CopyOnWriteArrayList<>();
            longSparseArray.put(j, copyOnWriteArrayList);
        }
        if (!copyOnWriteArrayList.contains(interfaceC1086970eON)) {
            copyOnWriteArrayList.add(interfaceC1086970eON);
            C1086960eOM c1086960eOM = LL;
            C01C1 c01c1LIZJ = LIZJ(j);
            if (c01c1LIZJ != null) {
                c01c1LIZJ.LJ = c1086960eOM.LIZIZ(j);
                interfaceC1086970eON.LIZJ(c01c1LIZJ);
            }
        }
    }

    public static final void LJIJ(long j, InterfaceC1086970eON interfaceC1086970eON) {
        CopyOnWriteArrayList<InterfaceC1086970eON> copyOnWriteArrayList = LLJILJIL.get(j);
        if (copyOnWriteArrayList != null) {
            copyOnWriteArrayList.remove(interfaceC1086970eON);
        }
    }

    public final void LJIIJ(long j, C01C1 c01c1) {
        C01C1 c01c1LIZJ;
        PollMessage pollMessage;
        if (C500260Jjc.LJIIZILJ(LLILLJJLI.get(j)) && (c01c1LIZJ = LIZJ(j)) != null && (pollMessage = c01c1LIZJ.LJFF) != null) {
            ((PollApi) C482260Ivg.LIZJ(PollApi.class)).endCustomPoll(j, pollMessage.pollId, 0).LJIILIIL(new C0UO0()).LJJLL(new C09JN() { // from class: X.00Mk
                @Override // X.C09JN
                public final /* bridge */ /* synthetic */ void accept(Object obj) {
                    C1C7U.LIZ("CustomPollManager@2501.endPoll$1$1");
                    C1C7U.LIZIZ("CustomPollManager@2501.endPoll$1$1");
                }
            }, new C09JN() { // from class: X.00Ml
                @Override // X.C09JN
                public final /* bridge */ /* synthetic */ void accept(Object obj) {
                    C1C7U.LIZ("CustomPollManager@2501.endPoll$1$2");
                    C1C7U.LIZIZ("CustomPollManager@2501.endPoll$1$2");
                }
            });
        }
        CopyOnWriteArrayList<InterfaceC1086970eON> copyOnWriteArrayList = LLJILJIL.get(j);
        if (copyOnWriteArrayList != null) {
            Iterator<InterfaceC1086970eON> it2 = copyOnWriteArrayList.iterator();
            while (it2.hasNext()) {
                it2.next().LIZLLL();
            }
        }
    }

    public final void LJIIL(Room room, final C01C1 c01c1) throws JSONException {
        Integer num;
        CopyOnWriteArrayList<InterfaceC1086970eON> copyOnWriteArrayList;
        String string;
        final long jLJ = LJ(room);
        LongSparseArray<DataChannel> longSparseArray = LLILLJJLI;
        if (!C500260Jjc.LJIIZILJ(longSparseArray.get(jLJ)) && !LJI(longSparseArray.get(jLJ))) {
            JSONObject jSONObject = new JSONObject();
            PollMessage pollMessage = c01c1.LJFF;
            if (pollMessage == null || (string = Long.valueOf(pollMessage.pollId).toString()) == null) {
                string = "";
            }
            jSONObject.put("poll_id", string);
            C389001fE.LIZ("custom_poll_start_new_poll", jSONObject, C158B.LIZ(), false);
        }
        PollMessage pollMessage2 = c01c1.LJFF;
        if (pollMessage2 != null) {
            num = pollMessage2.pollKind;
        } else {
            num = null;
        }
        if (LJII(num)) {
            LLIZLLLIL = false;
            PollShortTouchHelper.LIZJ(jLJ, c01c1, longSparseArray.get(jLJ), LLIZLLLIL, new Runnable() { // from class: X.0eLq
                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("CustomPollManager@2501.notifyCustomPollStart$2");
                    try {
                        C1086960eOM.LLIZLLLIL = true;
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("CustomPollManager@2501.notifyCustomPollStart$2");
                }
            });
        } else {
            PollShortTouchHelper.LIZIZ(room, jLJ, c01c1, longSparseArray.get(jLJ));
        }
        if (!c01c1.LIZLLL && (copyOnWriteArrayList = LLJILJIL.get(jLJ)) != null) {
            Iterator<InterfaceC1086970eON> it2 = copyOnWriteArrayList.iterator();
            while (it2.hasNext()) {
                it2.next().LIZ(c01c1);
            }
        }
        final long j = c01c1.LIZIZ;
        if (j != -1) {
            if (j > 0) {
                C786410Ut5.LJLIIL(j % 1000, LLJJIII, new Runnable() { // from class: X.01By
                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean zLIZ;
                        C1C7U.LIZ("CustomPollManager@2501.countDown$1");
                        try {
                            C1086960eOM c1086960eOM = C1086960eOM.LL;
                            long j2 = jLJ;
                            long j3 = j;
                            c1086960eOM.LJIILJJIL(j2, j3 - (j3 % 1000), c01c1);
                        } finally {
                            if (!zLIZ) {
                            }
                        }
                        C1C7U.LIZIZ("CustomPollManager@2501.countDown$1");
                    }
                });
                return;
            }
            c01c1.LIZIZ = 0L;
            c01c1.LJI = EnumC1085350eLl.TIME_OUT;
            LJIIJ(jLJ, c01c1);
        }
    }

    public final void LJIILIIL(long j, C01C1 c01c1) {
        Long lValueOf;
        Long lValueOf2;
        PollMessage pollMessage = c01c1.LJFF;
        if (pollMessage != null) {
            lValueOf = Long.valueOf(pollMessage.pollId);
        } else {
            lValueOf = null;
        }
        PollMessage pollMessage2 = LLILZLL;
        if (pollMessage2 != null) {
            lValueOf2 = Long.valueOf(pollMessage2.pollId);
        } else {
            lValueOf2 = null;
        }
        if (Intrinsics.LJFF(lValueOf, lValueOf2)) {
            LLILZLL = null;
            LLJ = null;
        }
        if (Intrinsics.LJFF(LIZJ(j), c01c1)) {
            LLJJIII.removeCallbacksAndMessages(null);
            LLJJIJI.removeCallbacksAndMessages(null);
            LJIIIIZZ(j);
            LLJILJILJ.remove(j);
            CopyOnWriteArrayList<InterfaceC1086970eON> copyOnWriteArrayList = LLJILJIL.get(j);
            if (copyOnWriteArrayList != null) {
                Iterator<InterfaceC1086970eON> it2 = copyOnWriteArrayList.iterator();
                while (it2.hasNext()) {
                    it2.next().LJ(c01c1);
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:232:0x0366  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x03c9  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x03cd  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0129  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJFF(boolean r16, com.bytedance.android.livesdkapi.depend.model.live.Room r17, X.C01C1 r18) {
        /*
            Method dump skipped, instruction units count: 1025
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1086960eOM.LJFF(boolean, com.bytedance.android.livesdkapi.depend.model.live.Room, X.01C1):void");
    }

    public final void LJIILJJIL(long j, long j2, C01C1 c01c1) {
        if (j2 > 0) {
            c01c1.LIZIZ = j2;
            CopyOnWriteArrayList<InterfaceC1086970eON> copyOnWriteArrayList = LLJILJIL.get(j);
            if (copyOnWriteArrayList != null) {
                Iterator<InterfaceC1086970eON> it2 = copyOnWriteArrayList.iterator();
                while (it2.hasNext()) {
                    it2.next().LIZIZ(c01c1);
                }
            }
            C786410Ut5.LJLIIL(1000L, LLJJIII, new RunnableC513801zM(j, c01c1, 2));
            return;
        }
        c01c1.LIZIZ = 0L;
        LJIIJ(j, c01c1);
    }
}
