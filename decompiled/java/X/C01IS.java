package X;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.liveinteract.multiguestv3.main.ability.LinkMicAbilityManager;
import com.bytedance.android.live.liveinteract.multiguestv3.main.ability.record.PlayRecordManager;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.common.PlayMaskEffectUpdateChannel;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.common.PlayMaskScoreUpdateEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.countdownforall.ICountDownForAllApi;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.countdownforallv2.common.event.CountDownForAllAtLeastOneUsersReachTargetEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.countdownforallv2.common.event.CountDownForAllRankSyncEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.countdownforallv2.common.event.CountDownForAllV2ContentChangeEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.countdownforallv2.common.event.CountDownForAllV2PlayBannerChangeEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.countdownforallv2.common.event.CountDownForAllV2SelfReachTargetEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.countdownforallv2.common.event.CountDownForAllV2StatusChangeEvent;
import com.bytedance.android.live.liveinteract.multilive.model.CountdownForAllGetContentParams;
import com.bytedance.android.live.liveinteract.multilive.model.GetFanTicketContentParams;
import com.bytedance.android.live.liveinteract.multilive.model.GetFanTicketContentResponse;
import com.bytedance.android.livesdk.model.message.FanTicketRoomNoticeContent;
import com.bytedance.android.livesdk.model.message.UserFanTicket;
import com.bytedance.android.livesdk.model.message.UserPlayInfo;
import com.bytedance.android.livesdk.sei.SeiAppData;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import webcast.data.multi_guest_play.CountdownForAllConfig;
import webcast.data.multi_guest_play.CountdownForAllContent;
import webcast.data.multi_guest_play.CountdownForAllUser;

/* JADX INFO: renamed from: X.01IS, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public abstract class C01IS implements InterfaceC213600s2 {
    public final DataChannel LIZ;
    public volatile CountdownForAllContent LIZIZ;
    public final C2252321DDq LIZJ;
    public final AnonymousClass0951 LIZLLL;
    public long LJ;
    public User LJFF;
    public String LJI;
    public volatile int LJII;
    public final C213500s1 LJIIIIZZ;
    public final ConcurrentHashMap<Long, Long> LJIIIZ;
    public final ConcurrentHashMap<Long, Integer> LJIIJ;
    public int LJIIJJI;
    public C19487111Lx LJIIL;
    public C19487111Lx LJIILIIL;
    public boolean LJIILJJIL;
    public final C01GW LJIILL;
    public final C356801a2<SeiAppData> LJIILLIIL;
    public long LJIIZILJ;

    public abstract String LJIIIIZZ();

    public final int LJI() {
        return ((Number) this.LIZLLL.getValue()).intValue();
    }

    public final long LJII() {
        long jLJIIIIZZ;
        CountdownForAllContent countdownForAllContent = this.LIZIZ;
        if (countdownForAllContent != null) {
            long j = countdownForAllContent.startTime;
            if (C01JX.LJIIJ()) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("audienceDelay=");
                sbLIZ.append(C01HA.LJIIIIZZ());
                C20441214yg.LIZIZ("BaseCountDownForAllV2Model", C2188811AlT.LIZIZ(sbLIZ));
                jLJIIIIZZ = C01HA.LJIIIIZZ();
            } else {
                C20441214yg.LIZIZ("BaseCountDownForAllV2Model", "notAudienceDelay=0");
                jLJIIIIZZ = 0;
            }
            if (C158B.LIZ() + jLJIIIIZZ > j) {
                long jLIZ = ((-jLJIIIIZZ) + C158B.LIZ()) - j;
                if (jLIZ < 0) {
                    return 0L;
                }
                return jLIZ;
            }
        }
        return 0L;
    }

    public C01IS(DataChannel dataChannel) {
        this.LIZ = dataChannel;
        C2252321DDq c2252321DDqLIZ = C1BNE.LIZ(0);
        this.LIZJ = c2252321DDqLIZ;
        this.LIZLLL = C09IC.LIZIZ(c2252321DDqLIZ);
        this.LJI = "";
        this.LJIIIIZZ = new C213500s1(dataChannel, this);
        this.LJIIIZ = new ConcurrentHashMap<>();
        this.LJIIJ = new ConcurrentHashMap<>();
        this.LJIIJJI = C924240a9u.LIZ().startIMLostProtectRetryCount;
        this.LJIILL = C452501pT.LIZIZ(AnonymousClass0206.get$arr$(2));
        this.LJIILLIIL = new C356801a2<>();
    }

    @Override // X.InterfaceC213600s2
    public final void LIZ(FanTicketRoomNoticeContent fanTicketRoomNoticeContent) {
        List<UserFanTicket> list;
        DataChannel dataChannel;
        long j;
        long j2;
        long j3;
        User userLJIIIIZZ;
        long j4;
        CountdownForAllContent countdownForAllContent;
        CountdownForAllContent countdownForAllContent2;
        CountdownForAllConfig countdownForAllConfig;
        long j5;
        if (fanTicketRoomNoticeContent.version < this.LJIIZILJ || (list = fanTicketRoomNoticeContent.userFanTicket) == null) {
            return;
        }
        ArrayList<UserFanTicket> arrayList = new ArrayList();
        for (UserFanTicket userFanTicket : list) {
            C930480aJy c930480aJy = C930480aJy.LIZ;
            Long lValueOf = Long.valueOf(userFanTicket.userId);
            c930480aJy.getClass();
            if (true ^ C930480aJy.LJIJJ(lValueOf)) {
                arrayList.add(userFanTicket);
            }
        }
        this.LJIIZILJ = fanTicketRoomNoticeContent.version;
        if (LJI() == 0 && this.LJIIJJI > 0 && !C01JX.LJIIJ()) {
            this.LJIIJJI--;
            try {
                if (!arrayList.isEmpty()) {
                    UserPlayInfo userPlayInfo = ((UserFanTicket) arrayList.get(0)).playInfo;
                    if (userPlayInfo != null) {
                        j5 = userPlayInfo.playId;
                    } else {
                        j5 = 0;
                    }
                    LJIIL(j5, "start_im_backup", null);
                }
                C20441214yg.LJ(LJIIIIZZ(), "backup when receive FanTicketMsg and current status is idle");
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C20441214yg.LJI(LJIIIIZZ(), th);
            }
        }
        this.LJIIJ.clear();
        boolean z = false;
        for (UserFanTicket userFanTicket2 : arrayList) {
            long j6 = userFanTicket2.userId;
            UserPlayInfo userPlayInfo2 = userFanTicket2.playInfo;
            if (userPlayInfo2 != null) {
                j = userPlayInfo2.score;
            } else {
                j = 0;
            }
            LJIILJJIL(j6, j, "onFanTicketMessageReceived");
            UserPlayInfo userPlayInfo3 = userFanTicket2.playInfo;
            if (userPlayInfo3 != null) {
                this.LJIIJ.put(Long.valueOf(userFanTicket2.userId), Integer.valueOf(userPlayInfo3.rank));
            }
            UserPlayInfo userPlayInfo4 = userFanTicket2.playInfo;
            if (userPlayInfo4 != null) {
                j2 = userPlayInfo4.score;
            } else {
                j2 = 0;
            }
            CountdownForAllContent countdownForAllContent3 = this.LIZIZ;
            if (countdownForAllContent3 != null && (countdownForAllConfig = countdownForAllContent3.playConfig) != null) {
                j3 = countdownForAllConfig.targetScore;
                if (1 <= j3 && j3 <= j2) {
                    z = true;
                }
            } else {
                j3 = 0;
            }
            if (userFanTicket2.userId == UserService.getInstance().user().getCurrentUserId() && (((countdownForAllContent = this.LIZIZ) != null && countdownForAllContent.playStatus == 1) || ((countdownForAllContent2 = this.LIZIZ) != null && countdownForAllContent2.playStatus == 2))) {
                if (j2 >= j3) {
                    DataChannel dataChannel2 = this.LIZ;
                    if (dataChannel2 != null) {
                        dataChannel2.LC0(CountDownForAllV2SelfReachTargetEvent.class, 1);
                    }
                } else {
                    DataChannel dataChannel3 = this.LIZ;
                    if (dataChannel3 != null) {
                        dataChannel3.LC0(CountDownForAllV2SelfReachTargetEvent.class, 0);
                    }
                }
            }
            UserPlayInfo userPlayInfo5 = userFanTicket2.playInfo;
            if (userPlayInfo5 != null && userPlayInfo5.rank == 1 && (userLJIIIIZZ = C01JX.LJIIIIZZ(userFanTicket2.userId)) != null) {
                boolean zLIZ = C01JX.LIZ(this.LJFF, userLJIIIIZZ, new C01F8(userFanTicket2, this, userLJIIIIZZ));
                UserPlayInfo userPlayInfo6 = userFanTicket2.playInfo;
                if (userPlayInfo6 != null) {
                    j4 = userPlayInfo6.score;
                } else {
                    j4 = 0;
                }
                String strLJIIIZ = LJIIIZ(j4);
                boolean zLIZIZ = C01JX.LIZIZ(this.LJI, strLJIIIZ, new C020R(this, strLJIIIZ, 0));
                if (zLIZ || zLIZIZ) {
                    DataChannel dataChannel4 = this.LIZ;
                    if (dataChannel4 != null) {
                        dataChannel4.LC0(CountDownForAllV2PlayBannerChangeEvent.class, 0L);
                    }
                }
            }
        }
        if (z && (dataChannel = this.LIZ) != null) {
            dataChannel.FQ2(CountDownForAllAtLeastOneUsersReachTargetEvent.class);
        }
        DataChannel dataChannel5 = this.LIZ;
        if (dataChannel5 != null) {
            dataChannel5.zW(PlayMaskEffectUpdateChannel.class, new C01IZ(1));
        }
    }

    @Override // X.InterfaceC213600s2
    public void LIZIZ(CountdownForAllContent countdownForAllContent) {
        LJFF(countdownForAllContent, "onRankSyncMessageReceived");
        C19487111Lx c19487111Lx = this.LJIILIIL;
        if (c19487111Lx != null) {
            c19487111Lx.dispose();
        }
        this.LJIILIIL = null;
        DataChannel dataChannel = this.LIZ;
        if (dataChannel != null) {
            dataChannel.LC0(CountDownForAllRankSyncEvent.class, countdownForAllContent);
        }
    }

    @Override // X.InterfaceC213600s2
    public final void LIZJ(CountdownForAllContent countdownForAllContent) {
        LJFF(countdownForAllContent, "onStartMessageReceived");
    }

    @Override // X.InterfaceC213600s2
    public final void LJ(CountdownForAllContent countdownForAllContent) {
        LJFF(countdownForAllContent, "onContentSyncMessageReceived");
    }

    public final String LJIIIZ(long j) {
        long j2;
        String str;
        boolean z;
        CountdownForAllConfig countdownForAllConfig;
        CountdownForAllConfig countdownForAllConfig2;
        CountdownForAllContent countdownForAllContent = this.LIZIZ;
        if (countdownForAllContent != null && (countdownForAllConfig2 = countdownForAllContent.playConfig) != null) {
            j2 = countdownForAllConfig2.targetScore;
        } else {
            j2 = 0;
        }
        CountdownForAllContent countdownForAllContent2 = this.LIZIZ;
        if (countdownForAllContent2 == null || (countdownForAllConfig = countdownForAllContent2.playConfig) == null || (str = countdownForAllConfig.resourceId) == null) {
            str = "";
        }
        boolean z2 = true;
        if (j2 <= 0) {
            z = true;
        } else {
            z = false;
        }
        if (j < j2) {
            z2 = false;
        }
        if (z || z2 || j == 0) {
            return "";
        }
        return str;
    }

    @Override // X.InterfaceC213600s2
    public final void LIZLLL(int i, CountdownForAllContent countdownForAllContent) {
        this.LJII = i;
        LJFF(countdownForAllContent, "onEndMessageReceived");
        C19487111Lx c19487111Lx = this.LJIIL;
        if (c19487111Lx != null) {
            c19487111Lx.dispose();
        }
        this.LJIIL = null;
    }

    public final void LJFF(CountdownForAllContent countdownForAllContent, String str) {
        long j;
        if (countdownForAllContent != null && Long.valueOf(countdownForAllContent.version) != null) {
            CountdownForAllContent countdownForAllContent2 = this.LIZIZ;
            if (countdownForAllContent2 != null) {
                j = countdownForAllContent2.version;
            } else {
                j = 0;
            }
            if (countdownForAllContent.version >= j) {
                LJIILIIL(countdownForAllContent, str);
                return;
            }
        }
        String strLJIIIIZZ = LJIIIIZZ();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ignore update source=");
        sbLIZ.append(str);
        C20441214yg.LJIIIZ(strLJIIIIZZ, C2188811AlT.LIZIZ(sbLIZ));
    }

    public final void LJIIJ(String str, boolean z) {
        C480460Ism.LIZ().getClass();
        ICountDownForAllApi iCountDownForAllApi = (ICountDownForAllApi) C480460Ism.LIZLLL(ICountDownForAllApi.class);
        GetFanTicketContentParams getFanTicketContentParams = new GetFanTicketContentParams();
        getFanTicketContentParams.roomId = C01JX.LJII();
        getFanTicketContentParams.channelId = C01JX.LJI();
        getFanTicketContentParams.audienceRole = z;
        AbstractC19484711Kz<C470590Icr<GetFanTicketContentResponse.ResponseData>> fanTicketContent = iCountDownForAllApi.getFanTicketContent(getFanTicketContentParams);
        String strLJIIIIZZ = LJIIIIZZ();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("requestFanTicketContentInternal, source=");
        sbLIZ.append(str);
        ((C11NJ) this.LJIILL.getValue()).LIZ(C01NB.LIZIZ(fanTicketContent, strLJIIIIZZ, C2188811AlT.LIZIZ(sbLIZ)).LJFF(new C0UO0()).LJIILL(new C516201zk(this, 3)).LJJIIZ(new C516201zk(this, 4), new C516201zk(this, 5)));
    }

    public final C11L6 LJIIJJI(CountdownForAllGetContentParams countdownForAllGetContentParams, String str) {
        C480460Ism.LIZ().getClass();
        return C01NB.LIZIZ(((ICountDownForAllApi) C480460Ism.LIZLLL(ICountDownForAllApi.class)).getCountDownForAllContent(countdownForAllGetContentParams), LJIIIIZZ(), "requestGetCountDownForAllContent").LJFF(new C0UO0()).LJIILL(new C516801zq(this, str, 0));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v129, types: [T, com.bytedance.android.live.base.model.user.User] */
    public void LJIILIIL(CountdownForAllContent countdownForAllContent, String str) {
        List<CountdownForAllUser> list;
        Long lValueOf;
        Long lValueOf2;
        Integer numValueOf;
        Integer numValueOf2;
        Long lValueOf3;
        Long lValueOf4;
        Long lValueOf5;
        Long lValueOf6;
        Long lValueOf7;
        Long lValueOf8;
        Long lValueOf9;
        Long lValueOf10;
        String str2;
        String str3;
        CountdownForAllConfig countdownForAllConfig;
        CountdownForAllConfig countdownForAllConfig2;
        CountdownForAllConfig countdownForAllConfig3;
        CountdownForAllConfig countdownForAllConfig4;
        CountdownForAllConfig countdownForAllConfig5;
        CountdownForAllConfig countdownForAllConfig6;
        boolean z;
        int i;
        boolean z2;
        long j;
        DataChannel dataChannel;
        Long lValueOf11;
        CountdownForAllConfig countdownForAllConfig7;
        int i2;
        List<CountdownForAllUser> list2;
        CountdownForAllConfig countdownForAllConfig8;
        List<CountdownForAllUser> list3;
        long j2;
        CountdownForAllContent countdownForAllContent2 = this.LIZIZ;
        C020W c020w = new C020W(this, countdownForAllContent, 0);
        if (countdownForAllContent == null) {
            if (countdownForAllContent2 == null) {
                z = true;
            } else {
                z = false;
            }
        } else {
            if (countdownForAllContent2 != null) {
                List<CountdownForAllUser> list4 = countdownForAllContent.playUsers;
                if (countdownForAllContent2 != null) {
                    list = countdownForAllContent2.playUsers;
                } else {
                    list = null;
                }
                if (list4 != null && list != null && list4.size() == list.size()) {
                    int size = list4.size();
                    int i3 = 0;
                    while (true) {
                        if (i3 < size) {
                            CountdownForAllUser countdownForAllUser = (CountdownForAllUser) ListProtector.get(list4, i3);
                            CountdownForAllUser countdownForAllUser2 = (CountdownForAllUser) ListProtector.get(list, i3);
                            if (countdownForAllUser.userId != countdownForAllUser2.userId || !Intrinsics.LJFF(countdownForAllUser.linkmicId, countdownForAllUser2.linkmicId) || countdownForAllUser.score != countdownForAllUser2.score || countdownForAllUser.rank != countdownForAllUser2.rank) {
                                break;
                            } else {
                                i3++;
                            }
                        } else {
                            if (countdownForAllContent != null) {
                                lValueOf = Long.valueOf(countdownForAllContent.playId);
                            } else {
                                lValueOf = null;
                            }
                            if (countdownForAllContent2 != null) {
                                lValueOf2 = Long.valueOf(countdownForAllContent2.playId);
                            } else {
                                lValueOf2 = null;
                            }
                            if (Intrinsics.LJFF(lValueOf, lValueOf2)) {
                                if (countdownForAllContent != null) {
                                    numValueOf = Integer.valueOf(countdownForAllContent.playStatus);
                                } else {
                                    numValueOf = null;
                                }
                                if (countdownForAllContent2 != null) {
                                    numValueOf2 = Integer.valueOf(countdownForAllContent2.playStatus);
                                } else {
                                    numValueOf2 = null;
                                }
                                if (Intrinsics.LJFF(numValueOf, numValueOf2)) {
                                    if (countdownForAllContent != null) {
                                        lValueOf3 = Long.valueOf(countdownForAllContent.startTime);
                                    } else {
                                        lValueOf3 = null;
                                    }
                                    if (countdownForAllContent2 != null) {
                                        lValueOf4 = Long.valueOf(countdownForAllContent2.startTime);
                                    } else {
                                        lValueOf4 = null;
                                    }
                                    if (Intrinsics.LJFF(lValueOf3, lValueOf4)) {
                                        if (countdownForAllContent != null) {
                                            lValueOf5 = Long.valueOf(countdownForAllContent.endTime);
                                        } else {
                                            lValueOf5 = null;
                                        }
                                        if (countdownForAllContent2 != null) {
                                            lValueOf6 = Long.valueOf(countdownForAllContent2.endTime);
                                        } else {
                                            lValueOf6 = null;
                                        }
                                        if (Intrinsics.LJFF(lValueOf5, lValueOf6)) {
                                            if (countdownForAllContent != null && (countdownForAllConfig6 = countdownForAllContent.playConfig) != null) {
                                                lValueOf7 = Long.valueOf(countdownForAllConfig6.duration);
                                            } else {
                                                lValueOf7 = null;
                                            }
                                            if (countdownForAllContent2 != null && (countdownForAllConfig5 = countdownForAllContent2.playConfig) != null) {
                                                lValueOf8 = Long.valueOf(countdownForAllConfig5.duration);
                                            } else {
                                                lValueOf8 = null;
                                            }
                                            if (Intrinsics.LJFF(lValueOf7, lValueOf8)) {
                                                if (countdownForAllContent != null && (countdownForAllConfig4 = countdownForAllContent.playConfig) != null) {
                                                    lValueOf9 = Long.valueOf(countdownForAllConfig4.targetScore);
                                                } else {
                                                    lValueOf9 = null;
                                                }
                                                if (countdownForAllContent2 != null && (countdownForAllConfig3 = countdownForAllContent2.playConfig) != null) {
                                                    lValueOf10 = Long.valueOf(countdownForAllConfig3.targetScore);
                                                } else {
                                                    lValueOf10 = null;
                                                }
                                                if (Intrinsics.LJFF(lValueOf9, lValueOf10)) {
                                                    if (countdownForAllContent != null && (countdownForAllConfig2 = countdownForAllContent.playConfig) != null) {
                                                        str2 = countdownForAllConfig2.resourceId;
                                                    } else {
                                                        str2 = null;
                                                    }
                                                    if (countdownForAllContent2 != null && (countdownForAllConfig = countdownForAllContent2.playConfig) != null) {
                                                        str3 = countdownForAllConfig.resourceId;
                                                    } else {
                                                        str3 = null;
                                                    }
                                                    if (!Intrinsics.LJFF(str2, str3)) {
                                                        break;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            z = false;
        }
        if (!z) {
            c020w.invoke(countdownForAllContent);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("set contentLiveData: ");
            sbLIZ.append(countdownForAllContent);
            C20441214yg.LIZIZ("cfaUtil", C2188811AlT.LIZIZ(sbLIZ));
            if (countdownForAllContent != null) {
                i = countdownForAllContent.playStatus;
            } else {
                i = 0;
            }
            int iLJI = LJI();
            Integer numValueOf3 = Integer.valueOf(iLJI);
            C01IV c01iv = new C01IV(this, i);
            if (numValueOf3 != null && i == numValueOf3.intValue()) {
                z2 = false;
            } else {
                c01iv.invoke(Integer.valueOf(i));
                if (i != 1) {
                    if (i == 3) {
                        PlayRecordManager.LIZLLL.getClass();
                        InterfaceC924740aAi interfaceC924740aAiLIZ = C920350a3d.LIZ();
                        if (interfaceC924740aAiLIZ != null) {
                            interfaceC924740aAiLIZ.LIZIZ("count_down_for_all");
                        }
                        LinkMicAbilityManager.LJIIIZ.getClass();
                        InterfaceC941720ac6 interfaceC941720ac6LIZIZ = C941700ac4.LIZIZ();
                        if (interfaceC941720ac6LIZIZ != null) {
                            interfaceC941720ac6LIZIZ.LJIL(C01EL.END, "count_down_for_all");
                        }
                    }
                } else {
                    PlayRecordManager.LIZLLL.getClass();
                    InterfaceC924740aAi interfaceC924740aAiLIZ2 = C920350a3d.LIZ();
                    if (interfaceC924740aAiLIZ2 != null) {
                        interfaceC924740aAiLIZ2.LIZ("count_down_for_all");
                    }
                    LinkMicAbilityManager.LJIIIZ.getClass();
                    InterfaceC941720ac6 interfaceC941720ac6LIZIZ2 = C941700ac4.LIZIZ();
                    if (interfaceC941720ac6LIZIZ2 != null) {
                        interfaceC941720ac6LIZIZ2.LJIL(C01EL.START, "count_down_for_all");
                    }
                }
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("set statusLiveData: ");
                sbLIZ2.append(i);
                C20441214yg.LIZIZ("cfaUtil", C2188811AlT.LIZIZ(sbLIZ2));
                z2 = true;
            }
            C259800zU c259800zU = new C259800zU();
            C238400w2 c238400w2 = new C238400w2();
            if (countdownForAllContent != null && (list3 = countdownForAllContent.playUsers) != null) {
                for (CountdownForAllUser countdownForAllUser3 : list3) {
                    if (countdownForAllUser3.rank == 1) {
                        c259800zU.element = countdownForAllUser3.user;
                        c238400w2.element = countdownForAllUser3.score;
                    }
                    if (countdownForAllUser3.userId == UserService.getInstance().user().getCurrentUserId()) {
                        long j3 = countdownForAllUser3.score;
                        CountdownForAllConfig countdownForAllConfig9 = countdownForAllContent.playConfig;
                        if (countdownForAllConfig9 != null) {
                            j2 = countdownForAllConfig9.targetScore;
                        } else {
                            j2 = 0;
                        }
                        int i4 = countdownForAllContent.playStatus;
                        if (i4 == 1 || i4 == 2) {
                            if (j3 >= j2) {
                                DataChannel dataChannel2 = this.LIZ;
                                if (dataChannel2 != null) {
                                    dataChannel2.LC0(CountDownForAllV2SelfReachTargetEvent.class, 1);
                                }
                            } else {
                                DataChannel dataChannel3 = this.LIZ;
                                if (dataChannel3 != null) {
                                    dataChannel3.LC0(CountDownForAllV2SelfReachTargetEvent.class, 0);
                                }
                            }
                        }
                    }
                }
            }
            boolean z3 = false;
            boolean zLIZ = C01JX.LIZ(this.LJFF, (User) c259800zU.element, new C01F7(c238400w2, this, c259800zU));
            String strLJIIIZ = LJIIIZ(c238400w2.element);
            boolean zLIZIZ = C01JX.LIZIZ(this.LJI, strLJIIIZ, new C020R(this, strLJIIIZ, 1));
            if (countdownForAllContent != null && (countdownForAllConfig8 = countdownForAllContent.playConfig) != null) {
                j = countdownForAllConfig8.duration;
            } else {
                j = 0;
            }
            C238400w2 c238400w22 = new C238400w2();
            long j4 = this.LJ;
            C020V c020v = new C020V(this, c238400w22, j, 0);
            if (j4 != j) {
                c020v.invoke(Long.valueOf(j));
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("set duration: ");
                sbLIZ3.append(j);
                C20441214yg.LIZIZ("cfaUtil", C2188811AlT.LIZIZ(sbLIZ3));
                z3 = true;
            }
            DataChannel dataChannel4 = this.LIZ;
            if (dataChannel4 != null) {
                dataChannel4.LC0(CountDownForAllV2ContentChangeEvent.class, this.LIZIZ);
            }
            this.LJIIJ.clear();
            CountdownForAllContent countdownForAllContent3 = this.LIZIZ;
            if (countdownForAllContent3 != null && (list2 = countdownForAllContent3.playUsers) != null) {
                for (CountdownForAllUser countdownForAllUser4 : list2) {
                    LJIILJJIL(countdownForAllUser4.userId, countdownForAllUser4.score, str);
                    this.LJIIJ.put(Long.valueOf(countdownForAllUser4.userId), Integer.valueOf(countdownForAllUser4.rank));
                }
            }
            if ((zLIZ || zLIZIZ || z3) && (dataChannel = this.LIZ) != null) {
                dataChannel.LC0(CountDownForAllV2PlayBannerChangeEvent.class, Long.valueOf(c238400w22.element));
            }
            if (z2) {
                DataChannel dataChannel5 = this.LIZ;
                if (dataChannel5 != null) {
                    dataChannel5.LC0(CountDownForAllV2StatusChangeEvent.class, new Pair(Integer.valueOf(iLJI), Integer.valueOf(LJI())));
                }
                int iLJI2 = LJI();
                if (iLJI2 != 1) {
                    if (iLJI2 == 2) {
                        if (this.LJIILJJIL) {
                            i2 = C924240a9u.LIZ().rankSyncIMLostProtectStateChangeByClientBackupDelayTime;
                        } else {
                            i2 = C924240a9u.LIZ().rankSyncIMLostProtectStateChangeByIMBackupDelayTime;
                        }
                        if (i2 > 0 && !C01JX.LJIIJ()) {
                            C19487111Lx c19487111Lx = this.LJIILIIL;
                            if (c19487111Lx != null) {
                                c19487111Lx.dispose();
                            }
                            this.LJIILIIL = null;
                            this.LJIILIIL = (C19487111Lx) new C11QI(AbstractC19484711Kz.LJIJJLI(1).LJIIIIZZ(i2, TimeUnit.SECONDS).LJIIIZ(new C516201zk(this, 7))).LJIILL().LJIIZILJ();
                            return;
                        }
                        return;
                    }
                    return;
                }
                int i5 = C924240a9u.LIZ().endIMLostProtectBackupDelayTime;
                CountdownForAllContent countdownForAllContent4 = this.LIZIZ;
                if (countdownForAllContent4 != null && (countdownForAllConfig7 = countdownForAllContent4.playConfig) != null) {
                    lValueOf11 = Long.valueOf(countdownForAllConfig7.duration);
                } else {
                    lValueOf11 = null;
                }
                if (i5 <= 0 || lValueOf11 == null || C01JX.LJIIJ()) {
                    return;
                }
                C19487111Lx c19487111Lx2 = this.LJIIL;
                if (c19487111Lx2 != null) {
                    c19487111Lx2.dispose();
                }
                this.LJIIL = null;
                this.LJIIL = (C19487111Lx) new C11QI(AbstractC19484711Kz.LJIJJLI(1).LJIIIIZZ(((long) i5) + lValueOf11.longValue(), TimeUnit.SECONDS).LJIIIZ(new C516201zk(this, 6))).LJIILL().LJIIZILJ();
            }
        }
    }

    public final void LJIIL(long j, String str, Function1<? super Boolean, Unit> function1) {
        String strLJIIIIZZ = LJIIIIZZ();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("requestGetCountDownForAllContentInternal, source: ");
        sbLIZ.append(str);
        C20441214yg.LIZIZ(strLJIIIIZZ, C2188811AlT.LIZIZ(sbLIZ));
        CountdownForAllGetContentParams countdownForAllGetContentParams = new CountdownForAllGetContentParams();
        countdownForAllGetContentParams.roomId = C01JX.LJII();
        countdownForAllGetContentParams.channelId = C01JX.LJI();
        countdownForAllGetContentParams.playId = j;
        countdownForAllGetContentParams.getType = 1;
        ((C11NJ) this.LJIILL.getValue()).LIZ(LJIIJJI(countdownForAllGetContentParams, str).LJJIIZ(new C516601zo(this, str, function1, 0), new C516601zo(this, str, function1, 1)));
    }

    public final void LJIILJJIL(long j, long j2, String str) {
        long jLongValue;
        Long l = this.LJIIIZ.get(Long.valueOf(j));
        if (l != null) {
            jLongValue = l.longValue();
        } else {
            jLongValue = 0;
        }
        String strLJIIIIZZ = LJIIIIZZ();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("updateScore userId=");
        sbLIZ.append(j);
        sbLIZ.append(" matchTotalScore=");
        sbLIZ.append(j2);
        sbLIZ.append(" previousScore=");
        sbLIZ.append(jLongValue);
        sbLIZ.append(" source=");
        sbLIZ.append(str);
        C20441214yg.LJIIIZ(strLJIIIIZZ, C2188811AlT.LIZIZ(sbLIZ));
        if (j2 >= jLongValue) {
            this.LJIIIZ.put(Long.valueOf(j), Long.valueOf(j2));
            DataChannel dataChannel = this.LIZ;
            if (dataChannel != null) {
                dataChannel.LC0(PlayMaskScoreUpdateEvent.class, new C938130aWJ(j, j2, 1));
            }
        }
    }
}
