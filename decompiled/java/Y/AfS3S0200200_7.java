package Y;

import X.AbstractC470800IdC;
import X.C01CC;
import X.C09JN;
import X.C0IJT;
import X.C0IKQ;
import X.C0IOL;
import X.C0ITM;
import X.C0IU7;
import X.C0KZG;
import X.C0KZI;
import X.C0KZK;
import X.C1161920gLG;
import X.C118300cf;
import X.C1338270kvh;
import X.C1C7U;
import X.C1CC2;
import X.C20441214yg;
import X.C2093608Ic;
import X.C2188811AlT;
import X.C290301An;
import X.C464330IIt;
import X.C465330IMp;
import X.C465340IMq;
import X.C470600Ics;
import X.C470770Id9;
import X.C474500IjA;
import X.C500260Jjc;
import X.InterfaceC468260IXw;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Pair;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.android.live.base.model.feed.FeedExtra;
import com.bytedance.android.livesdk.list.MultiPlusFeedRoomListProviderV2;
import com.bytedance.android.livesdk.livesetting.LiveLogSampleConfigSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveLoadMoreOptSetting;
import com.bytedance.android.livesdk.model.Extra;
import com.bytedance.android.livesdk.model.FeedItem;
import com.bytedance.android.livesdk.model.FlareInfo;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeoutException;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes8.dex */
public class AfS3S0200200_7 implements C09JN {
    public final int $t;
    public long j2;
    public long j3;
    public Object l0;
    public Object l1;

    @Override // X.C09JN
    public final void accept(Object obj) {
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
        }
    }

    public static final void accept$0(AfS3S0200200_7 afS3S0200200_7, Object obj) {
        String str;
        String str2;
        C1C7U.LIZ("EnigmaService@185c.switchEnigma$disposableChain$9");
        ((Function1) afS3S0200200_7.l0).invoke(obj);
        if (obj instanceof C0KZK) {
            str = "toggle_api";
        } else if (obj instanceof C0KZI) {
            str = "leave_room_api";
        } else if (obj instanceof C0KZG) {
            str = "enter_room_api";
        } else if (obj instanceof TimeoutException) {
            str = "timeout";
        } else if (obj instanceof C290301An) {
            str = "wrong_user_enigma_info";
        } else {
            str = "unknown";
        }
        if (afS3S0200200_7.j2 == 2) {
            str2 = "wear";
        } else {
            str2 = "remove";
        }
        C01CC.LJFF((int) (System.currentTimeMillis() - afS3S0200200_7.j3), str2, "failure", str, Integer.valueOf(((C118300cf) afS3S0200200_7.l1).element));
        C1C7U.LIZIZ("EnigmaService@185c.switchEnigma$disposableChain$9");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void accept$1(AfS3S0200200_7 afS3S0200200_7, Object obj) {
        String str;
        String str2;
        String str3;
        Boolean boolValueOf;
        Boolean boolValueOf2;
        String str4;
        String str5;
        String str6;
        EnterRoomConfig.RoomsData roomsData;
        EnterRoomConfig.RoomsData roomsData2;
        String str7;
        EnterRoomConfig.RoomsData roomsData3;
        String str8;
        EnterRoomConfig.RoomsData roomsData4;
        EnterRoomConfig.RoomsData roomsData5;
        EnterRoomConfig.RoomsData roomsData6;
        C1C7U.LIZ("MultiPlusFeedRoomListProviderV2@2def.loadMore$disposable$1");
        C0ITM c0itm = (C0ITM) obj;
        Pair pair = (Pair) c0itm.LIZ;
        MultiPlusFeedRoomListProviderV2 multiPlusFeedRoomListProviderV2 = (MultiPlusFeedRoomListProviderV2) afS3S0200200_7.l0;
        long j = afS3S0200200_7.j2;
        long j2 = afS3S0200200_7.j3;
        Map map = (Map) afS3S0200200_7.l1;
        multiPlusFeedRoomListProviderV2.getClass();
        Pair pair2 = (Pair) c0itm.LIZ;
        long jCurrentTimeMillis = System.currentTimeMillis();
        long jUptimeMillis = SystemClock.uptimeMillis();
        String str9 = c0itm.LIZLLL;
        C465340IMq c465340IMq = new C465340IMq();
        c465340IMq.LIZ = "draw";
        c465340IMq.LIZLLL = str9;
        c465340IMq.LJ = "/webcast/feed/";
        c465340IMq.LJFF = c0itm.LJFF;
        C465330IMp.LIZ(j, jCurrentTimeMillis, jUptimeMillis, c465340IMq.LIZ(), c0itm.LIZIZ, c0itm.LIZJ);
        int i = 1;
        if (!((Collection) pair2.first).isEmpty()) {
            str = CardStruct.IStatusCode.DEFAULT;
        } else {
            str = "-123";
        }
        multiPlusFeedRoomListProviderV2.LLJJLIIIJLLLLLLLZ = str;
        map.put("request_time", Long.valueOf(SystemClock.elapsedRealtime() - j2));
        map.put("error_code", multiPlusFeedRoomListProviderV2.LLJJLIIIJLLLLLLLZ);
        EnterRoomConfig enterRoomConfig = multiPlusFeedRoomListProviderV2.LLILZIL.LIZIZ;
        if (enterRoomConfig != null && (roomsData6 = enterRoomConfig.mRoomsData) != null) {
            str2 = roomsData6.enterFromMerge;
        } else {
            str2 = null;
        }
        map.put("enter_from_merge", str2);
        EnterRoomConfig enterRoomConfig2 = multiPlusFeedRoomListProviderV2.LLILZIL.LIZIZ;
        if (enterRoomConfig2 != null && (roomsData5 = enterRoomConfig2.mRoomsData) != null) {
            str3 = roomsData5.enterMethod;
        } else {
            str3 = null;
        }
        map.put("enter_method", str3);
        Extra extra = (Extra) pair2.second;
        if (extra != null) {
            boolValueOf = Boolean.valueOf(extra.hasMore);
        } else {
            boolValueOf = null;
        }
        map.put("has_more", boolValueOf);
        C0IOL.LJJIZ(map);
        MultiPlusFeedRoomListProviderV2 multiPlusFeedRoomListProviderV22 = (MultiPlusFeedRoomListProviderV2) afS3S0200200_7.l0;
        String str10 = c0itm.LIZLLL;
        multiPlusFeedRoomListProviderV22.LLJJJJLIIL = str10;
        multiPlusFeedRoomListProviderV22.LLJJL++;
        Object obj2 = pair.second;
        if (obj2 == null) {
            multiPlusFeedRoomListProviderV22.LLJILJIL.set(false);
        } else {
            FeedExtra feedExtra = (FeedExtra) obj2;
            multiPlusFeedRoomListProviderV22.LLJILLL = feedExtra;
            List<FeedItem> list = (List) pair.first;
            if (list != null && !list.isEmpty()) {
                long jCurrentTimeMillis2 = System.currentTimeMillis();
                boolean z = false;
                for (FeedItem feedItem : list) {
                    if (!feedItem.isVariantCard()) {
                        if (feedItem.item == null) {
                            try {
                                Room room = feedItem.getRoom();
                                feedItem.item = room;
                                int i2 = feedItem.type;
                                if ((i2 == i || i2 == 2) && (room instanceof Room)) {
                                    room.setLog_pb(feedItem.logPb);
                                    room.getOwner().setLogPb(feedItem.logPb);
                                    room.setRequestId(feedItem.resId);
                                    room.isFromRecommendCard = feedItem.isRecommendCard;
                                    feedItem.item = room;
                                }
                            } catch (Exception e) {
                                TryCatchGuardChecker.doCheck(e);
                                Map<String, Object> map2 = C1338270kvh.LIZ;
                                C20441214yg.LJI("MultiPlusFeedRoomListProvider", e);
                            }
                        }
                        InterfaceC468260IXw interfaceC468260IXw = feedItem.item;
                        if (interfaceC468260IXw instanceof Room) {
                            Room room2 = (Room) interfaceC468260IXw;
                            if (multiPlusFeedRoomListProviderV22.LLJJIJIIJIL == room2.getOwner().getLiveRoomId()) {
                                StringBuilder sbLIZ = C2188811AlT.LIZ();
                                sbLIZ.append("Remove duplicate room ");
                                sbLIZ.append(multiPlusFeedRoomListProviderV22.LLJJIJIIJIL);
                                C20441214yg.LIZIZ("MultiPlusFeedRoomListProvider", C2188811AlT.LIZIZ(sbLIZ));
                            } else if (!multiPlusFeedRoomListProviderV22.LLJJJ.contains(Long.valueOf(room2.getId()))) {
                                EnterRoomConfig enterRoomConfigLIZJ = C464330IIt.LIZJ(false, room2);
                                if (C2093608Ic.LJ(enterRoomConfigLIZJ.mStreamData.pullStreamData) && C2093608Ic.LJ(enterRoomConfigLIZJ.mStreamData.pullStreamUrl)) {
                                    z = true;
                                }
                                FlareInfo flareInfo = feedItem.flareInfo;
                                if (flareInfo != null) {
                                    EnterRoomConfig.RoomsData roomsData7 = enterRoomConfigLIZJ.mRoomsData;
                                    roomsData7.isShowFlare = flareInfo.isFlare;
                                    roomsData7.flareTaskId = flareInfo.taskId;
                                }
                                EnterRoomConfig.RoomsData roomsData8 = enterRoomConfigLIZJ.mRoomsData;
                                roomsData8.isFresh = feedItem.isFresh;
                                if (str10 == null) {
                                    str4 = "";
                                } else {
                                    str4 = str10;
                                }
                                roomsData8.serverLogId = str4;
                                roomsData8.recommendApiEndTimestamp = jCurrentTimeMillis2;
                                boolean z2 = multiPlusFeedRoomListProviderV22.LLJJJIL;
                                if (z2) {
                                    EnterRoomConfig enterRoomConfig3 = multiPlusFeedRoomListProviderV22.LLILZIL.LIZIZ;
                                    if (enterRoomConfig3 != null && (roomsData4 = enterRoomConfig3.mRoomsData) != null) {
                                        str8 = roomsData4.enterMethod;
                                    } else {
                                        str8 = null;
                                    }
                                    roomsData8.enterFromMerge = str8;
                                    roomsData8.enterMethod = "draw_loadmore";
                                } else {
                                    EnterRoomConfig enterRoomConfig4 = multiPlusFeedRoomListProviderV22.LLILZIL.LIZIZ;
                                    if (enterRoomConfig4 != null && (roomsData2 = enterRoomConfig4.mRoomsData) != null) {
                                        str5 = roomsData2.enterFromMerge;
                                    } else {
                                        str5 = null;
                                    }
                                    roomsData8.enterFromMerge = str5;
                                    if (enterRoomConfig4 != null && (roomsData = enterRoomConfig4.mRoomsData) != null) {
                                        str6 = roomsData.enterMethod;
                                    } else {
                                        str6 = null;
                                    }
                                    roomsData8.enterMethod = str6;
                                }
                                roomsData8.isSubOnlyLive = room2.liveSubOnly;
                                EnterRoomConfig enterRoomConfig5 = multiPlusFeedRoomListProviderV22.LLILZIL.LIZIZ;
                                if (enterRoomConfig5 == null || (roomsData3 = enterRoomConfig5.mRoomsData) == null || (str7 = roomsData3.windowMode) == null) {
                                    str7 = "full_screen";
                                }
                                roomsData8.windowMode = str7;
                                multiPlusFeedRoomListProviderV22.LLILZLL.LJ(enterRoomConfigLIZJ, z2);
                                multiPlusFeedRoomListProviderV22.LLJJJ.add(Long.valueOf(room2.getId()));
                                boolean z3 = multiPlusFeedRoomListProviderV22.LLJJI;
                                if (z3) {
                                    EnterRoomConfig.RoomsData roomsData9 = enterRoomConfigLIZJ.mRoomsData;
                                    roomsData9.fromNewStyle = z3;
                                    roomsData9.fromDrawerStyle = multiPlusFeedRoomListProviderV22.LLJJIII;
                                    roomsData9.enterFromLiveSource = multiPlusFeedRoomListProviderV22.LLJJIJI;
                                    roomsData9.feedUrl = multiPlusFeedRoomListProviderV22.LLILZIL.LIZ;
                                    roomsData9.windowMode = "full_screen";
                                }
                                ((ArrayList) multiPlusFeedRoomListProviderV22.LLJI).add(room2);
                                ((ArrayList) multiPlusFeedRoomListProviderV22.LLJIJIL).add(enterRoomConfigLIZJ);
                                if (!TextUtils.isEmpty(feedExtra.unreadExtra)) {
                                    enterRoomConfigLIZJ.mRoomsData.unreadExtra = feedExtra.unreadExtra;
                                }
                            }
                        }
                    }
                    i = 1;
                }
                if (z) {
                    HashMap map3 = new HashMap();
                    map3.put("logid", C0IU7.LIZIZ.LIZ.get("/webcast/feed/"));
                    C1CC2.LJII(0, "ttlive_webcast_feed_empty_stream", map3);
                }
                if (((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).isOffline() || ((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).isLiveInhouse()) {
                    for (FeedItem feedItem2 : list) {
                        if (feedItem2.getRoom() != null) {
                            multiPlusFeedRoomListProviderV22.LLJJJJ.put(Long.valueOf(feedItem2.getRoom().getId()), feedItem2.debugInfo);
                            multiPlusFeedRoomListProviderV22.LLJJJJJIL.put(Long.valueOf(feedItem2.getRoom().getId()), feedExtra.oceanReqInfo);
                        }
                    }
                }
            }
            MultiPlusFeedRoomListProviderV2 multiPlusFeedRoomListProviderV23 = (MultiPlusFeedRoomListProviderV2) afS3S0200200_7.l0;
            if (!multiPlusFeedRoomListProviderV23.LLJJJIL) {
                FeedExtra feedExtra2 = multiPlusFeedRoomListProviderV23.LLJILLL;
                if (feedExtra2 != null) {
                    boolValueOf2 = Boolean.valueOf(feedExtra2.hasMore);
                } else {
                    boolValueOf2 = null;
                }
                if (C500260Jjc.LJJIFFI(boolValueOf2)) {
                    MultiPlusFeedRoomListProviderV2 multiPlusFeedRoomListProviderV24 = (MultiPlusFeedRoomListProviderV2) afS3S0200200_7.l0;
                    multiPlusFeedRoomListProviderV24.LLJJJIL = true;
                    multiPlusFeedRoomListProviderV24.LLJJ = (((CopyOnWriteArrayList) multiPlusFeedRoomListProviderV24.LLIZLLLIL).size() + ((ArrayList) ((MultiPlusFeedRoomListProviderV2) afS3S0200200_7.l0).LLJI).size()) - 1;
                }
            }
            ((MultiPlusFeedRoomListProviderV2) afS3S0200200_7.l0).LJIILJJIL();
            ((MultiPlusFeedRoomListProviderV2) afS3S0200200_7.l0).LLJILJIL.set(false);
            LiveLoadMoreOptSetting.INSTANCE.resetHasTry();
        }
        C1C7U.LIZIZ("MultiPlusFeedRoomListProviderV2@2def.loadMore$disposable$1");
    }

    /* JADX WARN: Multi-variable type inference failed */
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
    public static final void accept$2(AfS3S0200200_7 afS3S0200200_7, Object obj) {
        boolean z;
        C470600Ics c470600Ics = (C470600Ics) afS3S0200200_7.l0;
        long j = afS3S0200200_7.j2;
        long j2 = afS3S0200200_7.j3;
        AbstractC470800IdC abstractC470800IdC = (AbstractC470800IdC) afS3S0200200_7.l1;
        C0ITM c0itm = (C0ITM) obj;
        c470600Ics.getClass();
        C1C7U.LIZ("RxCacheDataSource@388c.handleObservable$1L");
        long jCurrentTimeMillis = System.currentTimeMillis();
        long jUptimeMillis = SystemClock.uptimeMillis();
        if (c0itm != null) {
            C465340IMq c465340IMq = new C465340IMq();
            c465340IMq.LIZ = c0itm.LJ;
            c465340IMq.LIZLLL = c0itm.LIZLLL;
            c465340IMq.LJ = "/webcast/feed/";
            c465340IMq.LJFF = c0itm.LJFF;
            C465330IMp.LIZ(j, jCurrentTimeMillis, jUptimeMillis, c465340IMq.LIZ(), c0itm.LIZIZ, c0itm.LIZJ);
        }
        Pair pair = (Pair) c0itm.LIZ;
        C474500IjA c474500IjALIZIZ = C0IJT.LIZIZ("livesdk_live_request_response", Double.valueOf(LiveLogSampleConfigSetting.getSAMPLE_100()));
        c474500IjALIZIZ.LJ("click");
        c474500IjALIZIZ.LJJII("live_merge", "enter_from_merge");
        c474500IjALIZIZ.LJJII("live_cover", "enter_method");
        c474500IjALIZIZ.LJJII(Long.valueOf(SystemClock.elapsedRealtime() - j2), "duration");
        c474500IjALIZIZ.LJJII("webcast/feed", "request_api");
        c474500IjALIZIZ.LJJII(Integer.valueOf(((List) pair.first).size()), "room_num");
        c474500IjALIZIZ.LIZ();
        MutableLiveData<C470770Id9> mutableLiveData = c470600Ics.LJIIIZ;
        C470770Id9 c470770Id9 = C470770Id9.LIZJ;
        mutableLiveData.postValue(c470770Id9);
        c470600Ics.LJIIIIZZ.postValue(c470770Id9);
        if (!c470600Ics.LJIILL()) {
            C20441214yg.LIZIZ("RxCacheDataSource", "on data not my generation ");
            if (c470600Ics.LJIIL.LJII) {
                c470600Ics.LJIIL.LJII = false;
            }
            C1C7U.LIZIZ("RxCacheDataSource@388c.handleObservable$1L");
            return;
        }
        Long lLJIILLIIL = C470600Ics.LJIILLIIL((FeedExtra) pair.second);
        MutableLiveData<Boolean> mutableLiveData2 = c470600Ics.LJIIJ;
        boolean z2 = true;
        if (lLJIILLIIL != null) {
            z = true;
        } else {
            z = false;
        }
        mutableLiveData2.postValue(Boolean.valueOf(z));
        if (!C0IKQ.LIZ(c470600Ics.LJI.get(c470600Ics.LJFF)) || !C0IKQ.LIZ((List) pair.first)) {
            z2 = false;
        }
        if (c470600Ics.LJIIL.LJII && !z2) {
            if (c470600Ics.LJIIL.LJII) {
                c470600Ics.LJI.LIZIZ(c470600Ics.LJFF);
                c470600Ics.LJII.LIZ(c470600Ics.LJFF);
                c470600Ics.LJIIL.LJII = false;
            }
            c470600Ics.LJIIZILJ((List) pair.first, (FeedExtra) pair.second);
            c470600Ics.LIZJ();
            c470600Ics.LJIIJJI.postValue(Boolean.FALSE);
        } else {
            if (!C0IKQ.LIZ((List) pair.first)) {
                c470600Ics.LJI.LIZIZ(c470600Ics.LJFF);
                c470600Ics.LJII.LIZ(c470600Ics.LJFF);
            }
            List listLJIIZILJ = c470600Ics.LJIIZILJ((List) pair.first, (FeedExtra) pair.second);
            c470600Ics.LJIIJJI.postValue(Boolean.valueOf(C0IKQ.LIZ(listLJIIZILJ)));
            abstractC470800IdC.LIZ(lLJIILLIIL, listLJIIZILJ);
            c470600Ics.LJIIL.LJII = false;
        }
        C1C7U.LIZIZ("RxCacheDataSource@388c.handleObservable$1L");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 5, insn: 0x0007: IPUT (r5 I:long), (r0 I:Y.AfS3S0200200_7) (LINE:83886087) Y.AfS3S0200200_7.j3 long, block:B:2:0x0000 */
    /* JADX WARN: Not initialized variable reg: 7, insn: 0x0009: IPUT (r7 I:java.lang.Object), (r0 I:Y.AfS3S0200200_7) (LINE:83886089) Y.AfS3S0200200_7.l1 java.lang.Object, block:B:2:0x0000 */
    public AfS3S0200200_7(Object obj, MultiPlusFeedRoomListProviderV2 multiPlusFeedRoomListProviderV2, long j, long j2, Map<String, Object> map) {
        long j3;
        Object obj2;
        this.$t = map;
        this.l0 = obj;
        this.j2 = multiPlusFeedRoomListProviderV2;
        this.j3 = j3;
        this.l1 = obj2;
    }
}
