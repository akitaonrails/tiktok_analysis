package X;

import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.livepullstream.api.IPullStreamService;
import com.bytedance.android.live.microom.IMicRoomService;
import com.bytedance.android.livesdk.feed.drawerfeed.viewholder.DrawerSmallLiveViewHolder;
import com.bytedance.android.livesdk.feed.skylight.CommonSkylightDataManager;
import com.bytedance.android.livesdk.feed.viewmodel.TabFeedViewModel;
import com.bytedance.android.livesdk.live.model.LiveFeedDraw;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestOptGuestDistributeStateSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveLineupFixPrePullSetting;
import com.bytedance.android.livesdk.model.FeedItem;
import com.bytedance.android.livesdk.model.ItemTab;
import com.bytedance.android.livesdk.model.LiveEventInfo;
import com.bytedance.android.livesdkapi.depend.model.live.CommerceStruct;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.model.live.RoomLinkInfo;
import com.bytedance.android.livesdkapi.host.IHostAction;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.bytedance.android.livesdkapi.host.IHostCommerce;
import com.bytedance.android.livesdkapi.host.IHostWatch;
import com.bytedance.android.livesdkapi.host.ILiveHostCrossRoomEventHelper;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.android.livesdkapi.session.EnterRoomLinkSession;
import com.bytedance.android.livesdkapi.session.Event;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;
import kotlin.jvm.internal.Intrinsics;
import qo2.w;
import webcast.api.feed.SortStatsTag;
import webcast.api.feed.SortStatsTags;

/* JADX INFO: renamed from: X.0IVV, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0IVV {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZIZ(C0IVW c0ivw) {
        String strLIZIZ;
        String str;
        String string;
        String str2;
        String str3;
        String str4;
        String strLIZ;
        String strLIZIZ2;
        RoomLinkInfo linkMicInfo;
        List<User> list;
        long id;
        CommerceStruct commerceStruct;
        Room room;
        Room room2;
        Room room3;
        if (c0ivw.LIZ != null && c0ivw.LIZIZ != null) {
            EnterRoomConfig enterRoomConfig = new EnterRoomConfig();
            FeedItem feedItem = c0ivw.LIZIZ;
            String str5 = "";
            long j = 0;
            if (feedItem != null) {
                String str6 = c0ivw.LJFF;
                String str7 = c0ivw.LJIIIIZZ;
                DrawerSmallLiveViewHolder.LogExtraData logExtraData = c0ivw.LJIIJ;
                DrawerSmallLiveViewHolder.LogExtraData logExtraData2 = c0ivw.LJIIJJI;
                if (logExtraData != null) {
                    str2 = logExtraData.labelType;
                } else {
                    str2 = null;
                }
                boolean zLJFF = Intrinsics.LJFF(str2, "new_game");
                if (logExtraData != null) {
                    str3 = logExtraData.labelType;
                } else {
                    str3 = null;
                }
                boolean zLJFF2 = Intrinsics.LJFF(str3, "drops_game");
                if (logExtraData2 != null) {
                    str4 = logExtraData2.gameName;
                } else {
                    str4 = null;
                }
                C0IUA.LJJ = str7;
                C0IUA.LJJI = str7;
                if (str6 != null) {
                    enterRoomConfig.mLogData.enterLiveModule = str6;
                }
                enterRoomConfig.mRoomsData.relationshipTag = Integer.valueOf(feedItem.type);
                EnterRoomConfig.RoomsData roomsData = enterRoomConfig.mRoomsData;
                roomsData.enterLiveSource = "live_small_picture";
                EnterRoomConfig.LogData logData = enterRoomConfig.mLogData;
                logData.logPb = feedItem.logPb;
                logData.requestId = feedItem.resId;
                C466640IRq c466640IRqLIZJ = C466640IRq.LIZJ();
                if (c466640IRqLIZJ == null || (strLIZ = c466640IRqLIZJ.LIZ()) == null) {
                    strLIZ = C0IUA.LJIILLIIL;
                }
                roomsData.enterFromMerge = strLIZ;
                EnterRoomConfig.RoomsData roomsData2 = enterRoomConfig.mRoomsData;
                C466640IRq c466640IRqLIZJ2 = C466640IRq.LIZJ();
                if (c466640IRqLIZJ2 == null || (strLIZIZ2 = c466640IRqLIZJ2.LIZIZ()) == null) {
                    strLIZIZ2 = "drawer_cover";
                }
                roomsData2.enterMethod = strLIZIZ2;
                if (feedItem.isRecommendCard) {
                    enterRoomConfig.mRoomsData.enterFromMerge = "pop_card";
                }
                if (feedItem.item instanceof Room) {
                    if (((IHostCommerce) C1161920gLG.LIZJ(IHostCommerce.class)).s7()) {
                        InterfaceC468260IXw interfaceC468260IXw = feedItem.item;
                        if ((interfaceC468260IXw instanceof Room) && (room3 = (Room) interfaceC468260IXw) != null) {
                            enterRoomConfig.mRoomsData.commerceStruct = room3.getCommerceStruct();
                            enterRoomConfig.mRoomsData.hasCommerceGoods = Boolean.valueOf(room3.hasCommerceGoods);
                        }
                    } else {
                        EnterRoomConfig.RoomsData roomsData3 = enterRoomConfig.mRoomsData;
                        InterfaceC468260IXw interfaceC468260IXw2 = feedItem.item;
                        if ((interfaceC468260IXw2 instanceof Room) && (room = (Room) interfaceC468260IXw2) != null) {
                            commerceStruct = room.getCommerceStruct();
                        } else {
                            commerceStruct = null;
                        }
                        roomsData3.commerceStruct = commerceStruct;
                    }
                    InterfaceC468260IXw interfaceC468260IXw3 = feedItem.item;
                    if (interfaceC468260IXw3 instanceof Room) {
                        room2 = (Room) interfaceC468260IXw3;
                    } else {
                        room2 = null;
                    }
                    C464330IIt.LJIIIZ(room2, enterRoomConfig);
                }
                HashMap map = new HashMap();
                enterRoomConfig.mLogData.logMap = map;
                if (!Intrinsics.LJFF(str4, "") && str4 != null) {
                    map.put("game_label", str4);
                }
                map.put("has_new_game_label", String.valueOf(zLJFF ? 1 : 0));
                map.put("has_drops_label", String.valueOf(zLJFF2 ? 1 : 0));
                if (((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).isOffline() && feedItem.getRoom() != null) {
                    HashMap<Long, String> map2 = new HashMap<>();
                    Long lValueOf = Long.valueOf(feedItem.getRoom().getId());
                    String str8 = feedItem.debugInfo;
                    if (str8 == null) {
                        str8 = "";
                    }
                    map2.put(lValueOf, str8);
                    enterRoomConfig.mRoomsData.debugInfos = map2;
                }
                EnterRoomConfig.RoomsData roomsData4 = enterRoomConfig.mRoomsData;
                roomsData4.tabType = C0IUA.LJJ;
                roomsData4.fromDrawerTab = C0IUA.LJJI;
                roomsData4.drawerLiveType = C0IUA.LJJIIJZLJL;
                roomsData4.roomPosition = C0IUA.LJJII;
                roomsData4.explorePosition = C0IUA.LJJIFFI;
                roomsData4.unreadExtra = C0IUA.LJJIIZ;
                if (C500260Jjc.LJJIIZ(c0ivw.LIZJ)) {
                    enterRoomConfig.mRoomsData.enterFromMerge = c0ivw.LIZJ;
                }
                if (C500260Jjc.LJJIIZ(c0ivw.LIZLLL)) {
                    enterRoomConfig.mRoomsData.enterMethod = c0ivw.LIZLLL;
                }
                if (c0ivw.LJIILLIIL) {
                    enterRoomConfig.drawParams.openLiveFromSkylightDrawer = true;
                    enterRoomConfig.mRoomsData.windowMode = "full_screen";
                }
                long[] jArr = c0ivw.LJIJ;
                if (jArr != null && jArr.length != 0) {
                    EnterRoomConfig.RoomsData roomsData5 = enterRoomConfig.mRoomsData;
                    roomsData5.roomIds = jArr;
                    roomsData5.disableDraw = c0ivw.LJIJI;
                }
                if (feedItem instanceof C00UG) {
                    EnterRoomConfig.RoomsData roomsData6 = enterRoomConfig.mRoomsData;
                    roomsData6.roomProviderType = 1;
                    if (((C00UG) feedItem).LIZ) {
                        roomsData6.dataFlowType = 1001;
                    } else {
                        roomsData6.dataFlowType = 1002;
                    }
                }
                if (c0ivw.LJIIL) {
                    Map map3 = enterRoomConfig.mLogData.singleRoomLogMap;
                    if (map3 == null) {
                        map3 = new HashMap();
                    }
                    EnterRoomConfig.LogData logData2 = enterRoomConfig.mLogData;
                    LinkedHashMap linkedHashMap = new LinkedHashMap(map3);
                    linkedHashMap.put("is_nearby", "1");
                    logData2.singleRoomLogMap = linkedHashMap;
                }
                if (c0ivw.LJIILIIL) {
                    Map map4 = enterRoomConfig.mLogData.singleRoomLogMap;
                    if (map4 == null) {
                        map4 = new HashMap();
                    }
                    EnterRoomConfig.LogData logData3 = enterRoomConfig.mLogData;
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap(map4);
                    linkedHashMap2.put("is_maf", "1");
                    logData3.singleRoomLogMap = linkedHashMap2;
                }
                if (c0ivw.LJIILJJIL) {
                    Map map5 = enterRoomConfig.mLogData.singleRoomLogMap;
                    if (map5 == null) {
                        map5 = new HashMap();
                    }
                    EnterRoomConfig.LogData logData4 = enterRoomConfig.mLogData;
                    LinkedHashMap linkedHashMap3 = new LinkedHashMap(map5);
                    linkedHashMap3.put("is_watch_later", "1");
                    logData4.singleRoomLogMap = linkedHashMap3;
                }
                if (Intrinsics.LJFF("music_spotlight", str7)) {
                    enterRoomConfig.mRoomsData.musicTabRank = String.valueOf(c0ivw.LJI);
                }
                if (feedItem.type == 21) {
                    enterRoomConfig.mLogData.enterMgReason = ((IHostAction) C1161920gLG.LIZJ(IHostAction.class)).getEnterFromMg(feedItem);
                }
                Room room4 = c0ivw.LJ;
                if (room4 != null && (linkMicInfo = room4.getLinkMicInfo()) != null && (list = linkMicInfo.showUserList) != null) {
                    Map map6 = enterRoomConfig.mRoomsData.mgDistributionInfo;
                    if (map6 == null) {
                        map6 = new HashMap();
                    }
                    User owner = room4.getOwner();
                    if (owner != null) {
                        id = owner.getId();
                    } else {
                        id = 0;
                    }
                    EnterRoomConfig.RoomsData roomsData7 = enterRoomConfig.mRoomsData;
                    LinkedHashMap linkedHashMap4 = new LinkedHashMap(map6);
                    linkedHashMap4.putAll(LIZ(id, list));
                    roomsData7.mgDistributionInfo = linkedHashMap4;
                }
            }
            CommonSkylightDataManager commonSkylightDataManager = CommonSkylightDataManager.LIZ;
            FeedItem feedItem2 = c0ivw.LIZIZ;
            if (feedItem2 != null) {
                long j2 = feedItem2.receiveTime;
                if (j2 > 0) {
                    long jUptimeMillis = SystemClock.uptimeMillis() - j2;
                    if (jUptimeMillis >= 0) {
                        j = jUptimeMillis;
                    }
                    enterRoomConfig.mLogData.latencyEnterRoomInterval = j;
                }
            }
            C456601q8.LIZ(c0ivw.LIZIZ, enterRoomConfig);
            Context context = c0ivw.LIZ;
            FeedItem feedItem3 = c0ivw.LIZIZ;
            String str9 = c0ivw.LJFF;
            int i = c0ivw.LJI;
            int i2 = c0ivw.LJII;
            String str10 = c0ivw.LJIIIIZZ;
            C11RK<FeedItem> c11rk = c0ivw.LJIIIZ;
            DrawerSmallLiveViewHolder.LogExtraData logExtraData3 = c0ivw.LJIIJ;
            DrawerSmallLiveViewHolder.LogExtraData logExtraData4 = c0ivw.LJIIJJI;
            boolean z = c0ivw.LJIILL;
            int i3 = DrawerSmallLiveViewHolder.LLJLLL;
            if (feedItem3 != null) {
                InterfaceC468260IXw interfaceC468260IXw4 = feedItem3.item;
                if (interfaceC468260IXw4 instanceof Room) {
                    Room room5 = (Room) interfaceC468260IXw4;
                    if (room5.getId() != C467800IWc.LJIJ.LJII || z) {
                        room5.setLog_pb(feedItem3.logPb);
                        room5.setRequestId(feedItem3.resId);
                        try {
                            if (C036E.LIZ.LIZIZ()) {
                                if (!TextUtils.isEmpty(feedItem3.liveReason)) {
                                    enterRoomConfig.mLogData.liveReason = feedItem3.liveReason;
                                }
                                if (((IPullStreamService) C1161920gLG.LIZJ(IPullStreamService.class)).Xj1() == null) {
                                    C0IJT.LIZ("livesdk_rd_plugin_init_failed").LIZ();
                                    C766270U4b.LJFF(2131852419, context);
                                    EnterRoomLinkSession enterRoomLinkSessionLIZ = C0IL2.LIZ.LIZ();
                                    Event event = new Event("base_live_viewholder_click_small_picture", 34304, C0IIR.SdkCallback);
                                    event.LIZIZ(C497740JfY.LJIJI(2131852419));
                                    enterRoomLinkSessionLIZ.LIZIZ(event);
                                } else {
                                    EnterRoomLinkSession enterRoomLinkSession = new EnterRoomLinkSession(enterRoomConfig);
                                    enterRoomLinkSession.LIZIZ(new Event("base_live_view_holder_click_small_picture", 1536, C0IIR.SdkInterfaceCall));
                                    C0IL2.LIZ.LIZLLL(enterRoomLinkSession);
                                    if (str9 != null) {
                                        enterRoomConfig.mRoomsData.enterLiveSource = str9;
                                    }
                                    Room room6 = (Room) feedItem3.item;
                                    C464330IIt.LIZLLL(room6, enterRoomConfig);
                                    if (C1161920gLG.LIZJ(IHostWatch.class) != null) {
                                        enterRoomConfig.mRoomsData.userId = String.valueOf(room6.getOwnerUserId());
                                        if (room6.getOwner() != null) {
                                            enterRoomConfig.mRoomsData.isSecret = Integer.valueOf(room6.getOwner().getSecret());
                                        }
                                        EnterRoomConfig.RoomsData roomsData8 = enterRoomConfig.mRoomsData;
                                        roomsData8.fromNewStyle = true;
                                        roomsData8.fromDrawerStyle = C466640IRq.LIZJ().LIZLLL();
                                        C467800IWc c467800IWc = C467800IWc.LJIJ;
                                        if (c467800IWc.LJI()) {
                                            EnterRoomConfig.RoomsData roomsData9 = enterRoomConfig.mRoomsData;
                                            roomsData9.windowMode = "small_picture";
                                            enterRoomConfig.drawParams.openLiveFromGameDrawer = true;
                                            roomsData9.needLandInteractFragment = true;
                                            HashMap map7 = new HashMap();
                                            enterRoomConfig.mRoomsData.gameLiveExtra = map7;
                                            map7.put("landscape_enter_from", "drawer");
                                            Long lValueOf2 = Long.valueOf(c467800IWc.LJII);
                                            if (lValueOf2 == null) {
                                                string = CardStruct.IStatusCode.DEFAULT;
                                            } else {
                                                string = lValueOf2.toString();
                                            }
                                            map7.put("from_room_id", string);
                                        } else if (enterRoomConfig.drawParams.openLiveFromSkylightDrawer) {
                                            enterRoomConfig.mRoomsData.windowMode = "full_screen";
                                        } else {
                                            enterRoomConfig.mRoomsData.windowMode = "small_picture";
                                        }
                                        enterRoomConfig.mRoomsData.relationshipTag = Integer.valueOf(feedItem3.type);
                                        EnterRoomConfig.RoomsData roomsData10 = enterRoomConfig.mRoomsData;
                                        roomsData10.backRoomSource = "jump_source_square_drawer";
                                        enterRoomConfig.mLogData.positionOutsideLiveRoom = i2;
                                        roomsData10.isFresh = feedItem3.isFresh;
                                        if (i != -1) {
                                            roomsData10.smallPictureOrder = i + 1;
                                        }
                                        List<ItemTab> listLIZJ = C471000IdW.LJ().LIZJ();
                                        if (!C0IKQ.LIZ(listLIZJ) && ListProtector.get(listLIZJ, 0) != null) {
                                            String url = ((ItemTab) ListProtector.get(listLIZJ, 0)).getUrl();
                                            if (C466640IRq.LIZJ() != null) {
                                                if (C2093608Ic.LIZJ("referral_task", C466640IRq.LIZJ().LIZ())) {
                                                    url = TabFeedViewModel.DQ2(url, LiveFeedDraw.getChannelId("referral_task", "H5"));
                                                }
                                                if (!C2093608Ic.LJ(url)) {
                                                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                                                    sbLIZ.append("&");
                                                    sbLIZ.append("channel_id");
                                                    sbLIZ.append("=[^&]*");
                                                    url = url.replaceAll(C2188811AlT.LIZIZ(sbLIZ), "");
                                                }
                                            }
                                            enterRoomConfig.mRoomsData.feedUrl = url;
                                        }
                                        C464330IIt.LJ(room6, enterRoomConfig);
                                        enterRoomConfig.updateGdLabel(context);
                                        enterRoomConfig.mRoomsData.roomId = room6.getId();
                                        enterRoomConfig.mRoomsData.streamType = room6.getStreamType();
                                        enterRoomConfig.mRoomsData.preIsMicRoom = ((IMicRoomService) C1161920gLG.LIZJ(IMicRoomService.class)).On1();
                                        enterRoomConfig.drawParams.openLiveFromDrawer = true;
                                        if (room6.roomLayout == 2 && LiveLineupFixPrePullSetting.INSTANCE.enable()) {
                                            enterRoomConfig.mRoomsData.curIsMicRoom = true;
                                            enterRoomConfig.mStreamData.disablePrePullStream = true;
                                        }
                                        if (!c467800IWc.LJFF() && !c467800IWc.LJI()) {
                                            enterRoomConfig.mRoomsData.openLiveFromDrawerTab = str10;
                                        } else {
                                            enterRoomConfig.mRoomsData.openLiveFromDrawerTab = "";
                                        }
                                        enterRoomConfig.mLogData.topLeftRoomLabel = DrawerSmallLiveViewHolder.P5(logExtraData3);
                                        EnterRoomConfig.LogData logData5 = enterRoomConfig.mLogData;
                                        if (logExtraData4 == null) {
                                            strLIZIZ = "";
                                        } else {
                                            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                            sbLIZ2.append(logExtraData4.labelType);
                                            sbLIZ2.append("");
                                            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
                                        }
                                        logData5.bottomLeftRoomLabel = strLIZIZ;
                                        ((Stack) c467800IWc.LJIILLIIL.getValue()).push(Long.valueOf(room6.getId()));
                                        int iLIZJ = c467800IWc.LIZJ();
                                        int iLIZJ2 = c467800IWc.LIZ;
                                        if (iLIZJ > iLIZJ2) {
                                            iLIZJ2 = c467800IWc.LIZJ();
                                        }
                                        c467800IWc.LIZ = iLIZJ2;
                                        C0IVX c0ivx = C467820IWe.LJFF;
                                        if (c0ivx.LIZIZ.length() != 0) {
                                            C0IVX c0ivx2 = (C0IVX) C13LP.LJJLIIIJL(C467820IWe.LIZLLL());
                                            if (c0ivx2 != null && (str = c0ivx2.LIZIZ) != null) {
                                                str5 = str;
                                            }
                                            if (!Intrinsics.LJFF(c0ivx.LIZIZ, str5)) {
                                                C467820IWe.LIZLLL().add(new C0IVX(c0ivx.LIZ, c0ivx.LIZIZ));
                                            }
                                        }
                                        ((IHostWatch) C1161920gLG.LIZJ(IHostWatch.class)).watchLive(context, enterRoomConfig);
                                    }
                                    if (c11rk != null) {
                                        c11rk.onNext(feedItem3);
                                    }
                                }
                            }
                        } catch (Exception e) {
                            TryCatchGuardChecker.doCheck(e);
                        }
                        C766270U4b.LJFF(2131852422, context);
                        return;
                    }
                    C784440Upu.LIZ().LIZIZ(new C469280Iak(0));
                    C467800IWc.LJIJ.LIZLLL = "transfer";
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void LIZJ(C0IVW c0ivw) {
        String str;
        String str2;
        String str3;
        long id;
        String str4;
        String str5;
        Object[] objArr;
        String str6;
        String fromRoomId;
        String fromRequestId;
        int size;
        Object[] objArr2;
        List<User> list;
        List<Long> list2;
        Object[] objArr3;
        List<SortStatsTag> list3;
        C19EG c19egLJ;
        Intent intent;
        String stringExtra;
        String str7;
        C466650IRr c466650IRr;
        String str8;
        Context context = c0ivw.LIZ;
        Room room = c0ivw.LJ;
        FeedItem feedItem = c0ivw.LIZIZ;
        int i = c0ivw.LJI;
        int i2 = c0ivw.LJII;
        DrawerSmallLiveViewHolder.LogExtraData logExtraData = c0ivw.LJIIJ;
        DrawerSmallLiveViewHolder.LogExtraData logExtraData2 = c0ivw.LJIIJJI;
        String str9 = c0ivw.LJIIZILJ;
        if (logExtraData != null) {
            str = logExtraData.labelType;
        } else {
            str = null;
        }
        boolean zLJFF = Intrinsics.LJFF(str, "new_game");
        if (logExtraData != null) {
            str2 = logExtraData.labelType;
        } else {
            str2 = null;
        }
        boolean zLJFF2 = Intrinsics.LJFF(str2, "drops_game");
        if (logExtraData2 != null) {
            str3 = logExtraData2.gameName;
        } else {
            str3 = null;
        }
        if (context != null && room != null) {
            String str10 = c0ivw.LJIIIIZZ;
            if (str10 != null) {
                HashSet<String> hashSet = C0IVY.LIZ;
                if (!hashSet.contains(str10)) {
                    hashSet.add(str10);
                    C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_drawer_loaded_succeed");
                    c474500IjALIZ.LJJII(str10, "tab_type");
                    c474500IjALIZ.LIZ();
                }
            }
            long j = 0;
            if (room.getOwner() == null) {
                id = 0;
            } else {
                id = room.getOwner().getId();
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            String strLIZIZ = "live_cover";
            String strLIZ = "live_merge";
            if (C466640IRq.LIZJ() != null) {
                if (C466640IRq.LIZJ().LIZ() != null) {
                    strLIZ = C466640IRq.LIZJ().LIZ();
                }
                if (C466640IRq.LIZJ().LIZIZ() != null) {
                    strLIZIZ = C466640IRq.LIZJ().LIZIZ();
                }
                C466640IRq c466640IRqLIZJ = C466640IRq.LIZJ();
                if (c466640IRqLIZJ.LIZ && (c466650IRr = c466640IRqLIZJ.LIZIZ) != null && (str8 = c466650IRr.LIZJ) != null) {
                    linkedHashMap.put("guest_request_id", str8);
                }
            }
            if (feedItem != null && Integer.valueOf(feedItem.type) != null) {
                linkedHashMap.put("room_source", String.valueOf(feedItem.type));
            }
            String strLIZIZ2 = "";
            if (strLIZ == null) {
                strLIZ = "";
            }
            linkedHashMap.put("enter_from_merge", strLIZ);
            if (strLIZIZ == null) {
                strLIZIZ = "";
            }
            linkedHashMap.put("enter_method", strLIZIZ);
            String log_pb = room.getLog_pb();
            if (log_pb == null) {
                log_pb = "";
            }
            linkedHashMap.put("log_pb", log_pb);
            String strValueOf = String.valueOf(id);
            if (strValueOf == null) {
                strValueOf = "";
            }
            linkedHashMap.put("anchor_id", strValueOf);
            String requestId = room.getRequestId();
            if (requestId == null) {
                requestId = "";
            }
            linkedHashMap.put("request_id", requestId);
            String strValueOf2 = String.valueOf(room.getId());
            if (strValueOf2 == null) {
                strValueOf2 = "";
            }
            linkedHashMap.put("room_id", strValueOf2);
            linkedHashMap.put("show_type", "stay");
            linkedHashMap.put("live_type", C354201Zc.LIZ(room.getStreamType()));
            if (room.isThirdParty) {
                str4 = "thirdparty";
            } else {
                str4 = "general";
            }
            linkedHashMap.put("streaming_type", str4);
            linkedHashMap.put("event_belong", "live_view");
            linkedHashMap.put("event_page", "live");
            if (i != -1) {
                linkedHashMap.put("small_picture_order", String.valueOf(i + 1));
            } else {
                i = -1;
            }
            linkedHashMap.put("event_type", "core");
            linkedHashMap.put("event_module", "live");
            linkedHashMap.put("action_type", "click");
            String strLIZLLL = C466640IRq.LIZJ().LIZLLL();
            if (strLIZLLL == null) {
                strLIZLLL = "";
            }
            linkedHashMap.put("request_page", strLIZLLL);
            if (C500260Jjc.LJJIIZ(c0ivw.LJIJJ)) {
                String str11 = c0ivw.LJIJJ;
                if (str11 == null) {
                    str11 = "";
                }
                linkedHashMap.put("live_window_mode", str11);
            } else {
                linkedHashMap.put("live_window_mode", "small_picture");
            }
            linkedHashMap.put("small_picture_type", C467800IWc.LJIJ.LIZIZ());
            linkedHashMap.putAll(C467820IWe.LIZ(false));
            if (!C2093608Ic.LJ(C466640IRq.LIZJ().LIZLLL())) {
                String strLIZLLL2 = C466640IRq.LIZJ().LIZLLL();
                if (strLIZLLL2 == null) {
                    strLIZLLL2 = "";
                }
                linkedHashMap.put("enter_live_method", strLIZLLL2);
            }
            if (room.getOwner() != null && room.getOwner().getFollowInfo() != null) {
                linkedHashMap.put("follow_status", String.valueOf(room.getOwner().getFollowInfo().getFollowStatus()));
                linkedHashMap.put("initial_follow_status", String.valueOf(room.getOwner().getFollowInfo().getFollowStatus()));
            }
            if (feedItem == null || (str5 = feedItem.liveReason) == null) {
                str5 = "";
            }
            if (!TextUtils.isEmpty(str5)) {
                if (feedItem == null || (str7 = feedItem.liveReason) == null) {
                    str7 = "";
                }
                linkedHashMap.put("live_reason", str7);
            }
            if (C1388190mED.LIZ(context) != null && (c19egLJ = C500260Jjc.LJ(context)) != null && (intent = c19egLJ.getIntent()) != null) {
                try {
                    stringExtra = intent.getStringExtra("gd_label");
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    stringExtra = null;
                }
                if (!TextUtils.isEmpty(stringExtra)) {
                    if (stringExtra == null) {
                        stringExtra = "";
                    }
                    linkedHashMap.put("gd_label", stringExtra);
                }
            }
            w.LIZ.getClass();
            String strLJIILJJIL = w.LJIILJJIL();
            boolean zIsEmpty = TextUtils.isEmpty(strLJIILJJIL);
            String str12 = CardStruct.IStatusCode.DEFAULT;
            if (!zIsEmpty && Intrinsics.LJFF("click_push_live_cd_user", strLJIILJJIL)) {
                linkedHashMap.put("is_subscribe", "1");
            } else {
                linkedHashMap.put("is_subscribe", CardStruct.IStatusCode.DEFAULT);
            }
            linkedHashMap.put("is_return", CardStruct.IStatusCode.DEFAULT);
            if (room.hasCommerceGoods) {
                objArr = "1";
            } else {
                objArr = CardStruct.IStatusCode.DEFAULT;
            }
            linkedHashMap.put("is_ecom", objArr);
            linkedHashMap.put("room_position", String.valueOf(i2));
            if (str9 == null) {
                str9 = "";
            }
            linkedHashMap.put("explore_position", str9);
            linkedHashMap.put("is_from_draw_req", CardStruct.IStatusCode.DEFAULT);
            String strP5 = DrawerSmallLiveViewHolder.P5(logExtraData);
            if (strP5 == null) {
                strP5 = "";
            }
            linkedHashMap.put("top_left_label", strP5);
            C467800IWc c467800IWc = C467800IWc.LJIJ;
            linkedHashMap.put("has_banner", String.valueOf(c467800IWc.LJ()));
            linkedHashMap.put("explore_level", String.valueOf(c467800IWc.LIZJ()));
            if (logExtraData != null) {
                C474500IjA c474500IjALIZ2 = C0IJT.LIZ("livesdk_drawer_toplabel_show");
                c474500IjALIZ2.LJJIIZI(linkedHashMap);
                String str13 = logExtraData.labelType;
                if (str13 == null) {
                    str13 = "";
                }
                c474500IjALIZ2.LJJII(str13, "type");
                c474500IjALIZ2.LJJII(Integer.valueOf(logExtraData.labelRank), "rank");
                String str14 = logExtraData.labelLanguage;
                if (str14 == null) {
                    str14 = "";
                }
                c474500IjALIZ2.LJJII(str14, "language");
                c474500IjALIZ2.LJJII(Integer.valueOf(logExtraData.showType), "room_type");
                c474500IjALIZ2.LIZ();
                String strP52 = DrawerSmallLiveViewHolder.P5(logExtraData);
                if (strP52 == null) {
                    strP52 = "";
                }
                linkedHashMap.put("drawer_label_type", strP52);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("");
                sbLIZ.append(Integer.valueOf(logExtraData.showType));
                linkedHashMap.put("drawer_label_show_type", C2188811AlT.LIZIZ(sbLIZ));
            }
            if (room.getSquareCoverImg() != null && !C0IKQ.LIZ(room.getSquareCoverImg().getUrls())) {
                str6 = "screen_shot";
            } else {
                str6 = "user_upload";
            }
            linkedHashMap.put("cover_type", str6);
            if (feedItem != null) {
                if (feedItem.isFresh) {
                    objArr3 = "1";
                } else {
                    objArr3 = CardStruct.IStatusCode.DEFAULT;
                }
                linkedHashMap.put("is_fresh", objArr3);
                SortStatsTags sortStatsTags = feedItem.sortStatsTags;
                if (sortStatsTags != null && (list3 = sortStatsTags.forAppLog) != null) {
                    for (SortStatsTag sortStatsTag : list3) {
                        linkedHashMap.put(sortStatsTag.key, sortStatsTag.value);
                    }
                }
            }
            ILiveHostCrossRoomEventHelper iLiveHostCrossRoomEventHelper = (ILiveHostCrossRoomEventHelper) C1161920gLG.LIZJ(ILiveHostCrossRoomEventHelper.class);
            if (iLiveHostCrossRoomEventHelper == null || (fromRoomId = iLiveHostCrossRoomEventHelper.getFromRoomId()) == null) {
                fromRoomId = "";
            }
            linkedHashMap.put("cohost_from_room_id", fromRoomId);
            if (iLiveHostCrossRoomEventHelper == null || (fromRequestId = iLiveHostCrossRoomEventHelper.getFromRequestId()) == null) {
                fromRequestId = "";
            }
            linkedHashMap.put("cohost_from_request_id", fromRequestId);
            RoomLinkInfo linkMicInfo = room.getLinkMicInfo();
            if (linkMicInfo != null && (list2 = linkMicInfo.audienceIdList) != null) {
                size = list2.size();
            } else {
                size = 0;
            }
            linkedHashMap.put("guest_cnt", String.valueOf(size));
            if (size > 0) {
                objArr2 = "1";
            } else {
                objArr2 = CardStruct.IStatusCode.DEFAULT;
            }
            linkedHashMap.put("is_guest_connection", objArr2);
            if (C500260Jjc.LJJIIZ(c0ivw.LIZJ)) {
                String str15 = c0ivw.LIZJ;
                if (str15 == null) {
                    str15 = "";
                }
                linkedHashMap.put("enter_from_merge", str15);
            }
            if (C500260Jjc.LJJIIZ(c0ivw.LIZLLL)) {
                String str16 = c0ivw.LIZLLL;
                if (str16 == null) {
                    str16 = "";
                }
                linkedHashMap.put("enter_method", str16);
            }
            linkedHashMap.put("has_new_game_label", String.valueOf(zLJFF ? 1 : 0));
            linkedHashMap.put("has_drops_label", String.valueOf(zLJFF2 ? 1 : 0));
            if (!Intrinsics.LJFF(str3, "") && str3 != null) {
                linkedHashMap.put("game_label", str3);
            }
            LiveEventInfo liveEventInfo = room.liveEventInfo;
            if (liveEventInfo != null) {
                if (liveEventInfo.subscribed.booleanValue()) {
                    str12 = "1";
                }
                linkedHashMap.put("is_registered", str12);
            }
            RoomLinkInfo linkMicInfo2 = room.getLinkMicInfo();
            if (linkMicInfo2 != null && (list = linkMicInfo2.showUserList) != null) {
                linkedHashMap.putAll(LIZ(id, list));
            }
            if (c0ivw.LJIILIIL) {
                linkedHashMap.put("is_maf", "1");
            }
            if (c0ivw.LJIIL) {
                linkedHashMap.put("is_nearby", "1");
            }
            C467800IWc c467800IWc2 = C467800IWc.LJIJ;
            if (Intrinsics.LJFF("auction", c467800IWc2.LJIIIIZZ)) {
                linkedHashMap.put("EVENT_ORIGIN_FEATURE", "TEMAI");
            } else if (Intrinsics.LJFF("music_spotlight", c467800IWc2.LJIIIIZZ)) {
                linkedHashMap.put("music_tab_rank", String.valueOf(i));
            }
            if (feedItem != null && feedItem.type == 21) {
                linkedHashMap.put("enter_mg_reason", ((IHostAction) C1161920gLG.LIZJ(IHostAction.class)).getEnterFromMg(feedItem));
            }
            CommonSkylightDataManager commonSkylightDataManager = CommonSkylightDataManager.LIZ;
            if (feedItem != null) {
                long j2 = feedItem.receiveTime;
                if (j2 > 0) {
                    long jUptimeMillis = SystemClock.uptimeMillis() - j2;
                    if (jUptimeMillis >= 0) {
                        j = jUptimeMillis;
                    }
                    linkedHashMap.put("latency_show_entrance_interval", String.valueOf(j));
                }
            }
            C474500IjA c474500IjALIZ3 = C0IJT.LIZ("livesdk_live_show");
            c474500IjALIZ3.LJJIIZI(linkedHashMap);
            if (logExtraData2 != null) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append(logExtraData2.labelType);
                sbLIZ2.append("");
                strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
            }
            c474500IjALIZ3.LJJII(C0IXQ.LIZ(strLIZIZ2), "connection_type");
            c474500IjALIZ3.LJFF(C0IXW.LIZJ("user_live_duration"));
            c474500IjALIZ3.LJJII(c467800IWc2.LJIIL, "landing_reason");
            c474500IjALIZ3.LJJII(c467800IWc2.LJIIIIZZ, "tab_type");
            if (MultiGuestOptGuestDistributeStateSetting.INSTANCE.isEnable()) {
                c474500IjALIZ3.LJJII(Integer.valueOf(C0IXN.LIZ()), "is_from_guest_distribute");
            }
            c474500IjALIZ3.LIZ();
            C0IU0.LIZJ(2, room.getId());
        }
    }

    public static Map LIZ(long j, List list) {
        String strValueOf;
        String str;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (list.size() > 1) {
            long id = ((User) ListProtector.get(list, 0)).getId();
            long id2 = ((User) ListProtector.get(list, 1)).getId();
            if (id == j) {
                str = "both_anchor_guest";
            } else if (id2 == j) {
                str = "both_guest_anchor";
            } else {
                str = "both_guest_guest";
            }
            linkedHashMap.put("mg_distribution_type", str);
        } else {
            String str2 = "anchor";
            if (!list.isEmpty()) {
                if (((User) ListProtector.get(list, 0)).getId() != j) {
                    str2 = "guest";
                }
                linkedHashMap.put("mg_distribution_type", str2);
            } else {
                linkedHashMap.put("mg_distribution_type", "anchor");
            }
        }
        if (!list.isEmpty()) {
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList.add(Long.valueOf(((User) it2.next()).getId()));
            }
            strValueOf = C13LP.LJJLIIIJ(arrayList, ",", null, null, 0, null, null, 62);
        } else {
            strValueOf = String.valueOf(j);
        }
        linkedHashMap.put("distribution_user_list", strValueOf);
        return linkedHashMap;
    }
}
