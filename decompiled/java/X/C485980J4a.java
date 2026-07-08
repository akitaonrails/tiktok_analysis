package X;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.fragment.app.DialogFragment;
import com.bytedance.android.live.livepullstream.api.IPullStreamService;
import com.bytedance.android.livesdk.internal.Live;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveGameMultiStreamWatch;
import com.bytedance.android.livesdk.log.monitor.IPerformanceManager;
import com.bytedance.android.livesdk.watch.IWatchLiveService;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.android.livesdkapi.depend.model.live.SlimRoom;
import com.bytedance.android.livesdkapi.depend.model.live.StreamUrlExtra;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.android.livesdkapi.session.EnterRoomLinkSession;
import com.bytedance.android.livesdkapi.session.Event;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.deeplink.IDeepLinkService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.model.live.LiveRoomStruct;
import com.ss.android.ugc.aweme.feed.model.live.LiveStreamUrl;
import com.ss.android.ugc.aweme.feed.model.live.LiveStreamUrlExtra;
import com.ss.android.ugc.aweme.feed.model.live.NewLiveRoomStruct;
import com.ss.android.ugc.aweme.feed.model.live.StreamUrlStruct;
import com.ss.android.ugc.aweme.follow.presenter.RoomStruct;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Pair;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0J4a, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C485980J4a implements C0J5O {
    public static final C485990J4b LIZLLL = new C485990J4b();
    public WeakReference<InterfaceC486150J4r> LIZIZ;
    public final HashMap<String, Pair<List<EnterRoomConfig>, InterfaceC486070J4j>> LIZ = new HashMap<>();
    public final C475380Ika LIZJ = new C475380Ika();

    public static boolean LJIILIIL() {
        try {
            return C036E.LIZ.LIZIZ();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return false;
        }
    }

    @Override // X.C0J5O
    public final DialogFragment xd() {
        return ((IWatchLiveService) C1161920gLG.LIZJ(IWatchLiveService.class)).xd();
    }

    public static boolean LJIILLIIL() {
        Integer num;
        return Live.getService() == null || ((num = (Integer) Live.getService().LIZJ(0, "live_mt_remove_traffic_dialog")) != null && num.intValue() == 0);
    }

    public static boolean LJIIZILJ() {
        Integer num;
        return (Live.getService() == null || (num = (Integer) Live.getService().LIZJ(0, "live_opt_enter_room_success")) == null || num.intValue() != 1) ? false : true;
    }

    public static boolean LJIILJJIL(Context context) {
        return ((IDeepLinkService) ServiceManager.get().getService(IDeepLinkService.class)).LJJII(context);
    }

    @Override // X.C0J5O
    public final C0IOU getSearchComponent(String str) {
        InterfaceC486070J4j second;
        C486050J4h c486050J4h = C486130J4p.LIZ;
        HashMap<String, Pair<List<EnterRoomConfig>, InterfaceC486070J4j>> map = this.LIZ;
        c486050J4h.getClass();
        Pair<List<EnterRoomConfig>, InterfaceC486070J4j> pair = map.get(str);
        List<EnterRoomConfig> first = null;
        if (pair != null) {
            second = pair.getSecond();
        } else {
            second = null;
        }
        c486050J4h.LIZIZ = second;
        Pair<List<EnterRoomConfig>, InterfaceC486070J4j> pair2 = map.get(str);
        if (pair2 != null) {
            first = pair2.getFirst();
        }
        c486050J4h.LIZ = first;
        c486050J4h.LIZJ = str;
        return c486050J4h;
    }

    public static void LJIILL(String str, String str2) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("enter_from_merge", str);
            jSONObject.put("enter_method", str2);
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
        }
        CopyOnWriteArrayList<Runnable> copyOnWriteArrayList = C794240VDq.LIZ;
        C793770VBv.LJIIJJI("ttlive_enter_room_live_entrance", 0, jSONObject);
    }

    @Override // X.C0J5O
    public final void LJII(EnterRoomConfig enterRoomConfig, String str) {
        if (Live.getService() == null) {
            return;
        }
        C486790J7d.LIZJ(new Runnable() { // from class: X.0IMu
            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("LiveWatcherUtils@1ee2.enterLiveConverge$1");
                try {
                    IPerformanceManager iPerformanceManager = C465520INi.LIZ;
                    iPerformanceManager.setIsAnchor(false);
                    iPerformanceManager.gV();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("LiveWatcherUtils@1ee2.enterLiveConverge$1");
            }
        });
        HashMap map = new HashMap();
        map.put("intercept", "new_style");
        map.put("live.intent.extra.FROM_NEW_STYLE_SOURCE", str);
        map.put("toplive_position", enterRoomConfig.mLogData.toplivePosition);
        map.put("from_toplive_guide", enterRoomConfig.mLogData.fromTopliveGuide);
        map.put("guidance_type", enterRoomConfig.mLogData.topliveGuidanceType);
        map.put("from_follow_relationship_toplive_guide", enterRoomConfig.mLogData.fromFollowRelationShipTopliveGuide);
        map.put("toplive_homepage_type", enterRoomConfig.mLogData.topliveHomepageType);
        map.put("toplive_enter_time", enterRoomConfig.mLogData.topliveEnterTimestamp);
        map.put("source_btm_token", enterRoomConfig.mLogData.sourceBtmToken);
        C0IVR.LJIIJ(enterRoomConfig, map);
        enterRoomConfig.mRoomsData.fromDrawerStyle = str;
        enterRoomConfig.mLogData.positionOutsideLiveRoom = 0;
        EnterRoomLinkSession enterRoomLinkSession = new EnterRoomLinkSession(enterRoomConfig);
        C0IL2.LIZ.LIZLLL(enterRoomLinkSession);
        enterRoomLinkSession.LIZIZ(new Event("ttlive_enter_live_converge_start", 3329, C0IIR.BussinessApiCall));
        if (enterRoomConfig.mRoomsData.fromNewStyle && Live.getService() != null && Live.getService().LLIIIZ() != null) {
            ((C468110IXh) Live.getService().LLIIIZ()).LIZ(map);
        }
    }

    @Override // X.C0J5O
    public final void watchLive(Context context, EnterRoomConfig enterRoomConfig) {
        LJIJ(context, enterRoomConfig, "", null, null);
    }

    @Override // X.C0J5O
    public final void LIZIZ(Context context, NewLiveRoomStruct newLiveRoomStruct, EnterRoomConfig enterRoomConfig) {
        LiveStreamUrlExtra.SrConfig srConfig;
        Long lValueOf;
        Integer numValueOf;
        String str;
        if (newLiveRoomStruct != null) {
            EnterRoomConfig.RoomsData roomsData = enterRoomConfig.mRoomsData;
            long j = newLiveRoomStruct.id;
            roomsData.roomId = j;
            enterRoomConfig.mStreamData.streamRoomId = j;
            EnterRoomConfig.LogData logData = enterRoomConfig.mLogData;
            logData.logId = newLiveRoomStruct.logId;
            logData.forcedLowLatency = newLiveRoomStruct.forcedLowLatency();
            String multiStreamData = newLiveRoomStruct.getMultiStreamData();
            String multiStreamDefaultQualitySdkKey = newLiveRoomStruct.getMultiStreamDefaultQualitySdkKey();
            int iOrdinal = RoomStruct.getStreamType(newLiveRoomStruct).ordinal();
            LiveStreamUrlExtra streamUrlExtra = newLiveRoomStruct.getStreamUrlExtra();
            LiveStreamUrlExtra.SrConfig srConfig2 = null;
            if (streamUrlExtra != null) {
                srConfig = streamUrlExtra.getSrConfig();
            } else {
                srConfig = null;
            }
            String options = newLiveRoomStruct.getOptions();
            LiveStreamUrl liveStreamUrl = newLiveRoomStruct.stream_url;
            if (liveStreamUrl != null) {
                lValueOf = Long.valueOf(liveStreamUrl.aliveTimestamp);
            } else {
                lValueOf = null;
            }
            LiveStreamUrl liveStreamUrl2 = newLiveRoomStruct.stream_url;
            if (liveStreamUrl2 != null) {
                numValueOf = Integer.valueOf(liveStreamUrl2.drmType);
            } else {
                numValueOf = null;
            }
            LiveStreamUrl liveStreamUrl3 = newLiveRoomStruct.stream_url;
            if (liveStreamUrl3 != null) {
                str = liveStreamUrl3.streamLanguage;
            } else {
                str = null;
            }
            C0J4Y.LIZLLL(enterRoomConfig, multiStreamData, multiStreamDefaultQualitySdkKey, iOrdinal, srConfig, options, lValueOf, numValueOf, str);
            enterRoomConfig.mRoomsData.enlargeView = C0J4Y.LIZIZ(newLiveRoomStruct.previewEnlargeViewInfo);
            if (newLiveRoomStruct.multiStreamScene == 1 && LiveGameMultiStreamWatch.INSTANCE.isExperimentGroup() && newLiveRoomStruct.getLiveStudioExtraStreamData() != null && newLiveRoomStruct.getLiveStudioExtraStreamDefaultQualitySdkKey() != null) {
                enterRoomConfig.mSubStreamData.streamRoomId = newLiveRoomStruct.id;
                String liveStudioExtraStreamData = newLiveRoomStruct.getLiveStudioExtraStreamData();
                String liveStudioExtraStreamDefaultQualitySdkKey = newLiveRoomStruct.getLiveStudioExtraStreamDefaultQualitySdkKey();
                int iOrdinal2 = RoomStruct.getStreamType(newLiveRoomStruct).ordinal();
                LiveStreamUrlExtra liveStudioStreamUrlExtra = newLiveRoomStruct.getLiveStudioStreamUrlExtra();
                if (liveStudioStreamUrlExtra != null) {
                    srConfig2 = liveStudioStreamUrlExtra.getSrConfig();
                }
                C0J4Y.LJ(enterRoomConfig, liveStudioExtraStreamData, liveStudioExtraStreamDefaultQualitySdkKey, iOrdinal2, srConfig2, newLiveRoomStruct.getOptions(), Boolean.valueOf(newLiveRoomStruct.isMainStreamHorizontal()));
            }
        }
        LJIJ(context, enterRoomConfig, "", null, null);
    }

    @Override // X.C0J5O
    public final void LIZLLL(Context context, LiveRoomStruct liveRoomStruct, EnterRoomConfig enterRoomConfig) {
        LiveStreamUrlExtra.SrConfig srConfig;
        Long lValueOf;
        Integer numValueOf;
        String str;
        if (liveRoomStruct != null) {
            EnterRoomConfig.RoomsData roomsData = enterRoomConfig.mRoomsData;
            long j = liveRoomStruct.id;
            roomsData.roomId = j;
            enterRoomConfig.mStreamData.streamRoomId = j;
            roomsData.enlargeView = C0J4Y.LIZIZ(liveRoomStruct.previewEnlargeViewInfo);
            EnterRoomConfig.LogData logData = enterRoomConfig.mLogData;
            logData.logId = liveRoomStruct.logId;
            logData.forcedLowLatency = liveRoomStruct.getForceLowLatency();
            String multiStreamData = liveRoomStruct.getMultiStreamData();
            String multiStreamDefaultQualitySdkKey = liveRoomStruct.getMultiStreamDefaultQualitySdkKey();
            int iOrdinal = RoomStruct.getStreamType(liveRoomStruct).ordinal();
            LiveStreamUrlExtra streamUrlExtra = liveRoomStruct.getStreamUrlExtra();
            LiveStreamUrlExtra.SrConfig srConfig2 = null;
            if (streamUrlExtra != null) {
                srConfig = streamUrlExtra.getSrConfig();
            } else {
                srConfig = null;
            }
            String options = liveRoomStruct.getOptions();
            StreamUrlStruct streamUrlStruct = liveRoomStruct.stream_url;
            if (streamUrlStruct != null) {
                lValueOf = Long.valueOf(streamUrlStruct.aliveTimestamp);
            } else {
                lValueOf = null;
            }
            StreamUrlStruct streamUrlStruct2 = liveRoomStruct.stream_url;
            if (streamUrlStruct2 != null) {
                numValueOf = Integer.valueOf(streamUrlStruct2.drmType);
            } else {
                numValueOf = null;
            }
            StreamUrlStruct streamUrlStruct3 = liveRoomStruct.stream_url;
            if (streamUrlStruct3 != null) {
                str = streamUrlStruct3.streamLanguage;
            } else {
                str = null;
            }
            C0J4Y.LIZLLL(enterRoomConfig, multiStreamData, multiStreamDefaultQualitySdkKey, iOrdinal, srConfig, options, lValueOf, numValueOf, str);
            if (liveRoomStruct.multiStreamScene == 1 && LiveGameMultiStreamWatch.INSTANCE.isExperimentGroup() && liveRoomStruct.getLiveStudioExtraStreamData() != null && liveRoomStruct.getLiveStudioExtraStreamDefaultQualitySdkKey() != null) {
                enterRoomConfig.mSubStreamData.streamRoomId = liveRoomStruct.id;
                String liveStudioExtraStreamData = liveRoomStruct.getLiveStudioExtraStreamData();
                String liveStudioExtraStreamDefaultQualitySdkKey = liveRoomStruct.getLiveStudioExtraStreamDefaultQualitySdkKey();
                int iOrdinal2 = RoomStruct.getStreamType(liveRoomStruct).ordinal();
                LiveStreamUrlExtra liveStudioStreamUrlExtra = liveRoomStruct.getLiveStudioStreamUrlExtra();
                if (liveStudioStreamUrlExtra != null) {
                    srConfig2 = liveStudioStreamUrlExtra.getSrConfig();
                }
                C0J4Y.LJ(enterRoomConfig, liveStudioExtraStreamData, liveStudioExtraStreamDefaultQualitySdkKey, iOrdinal2, srConfig2, liveRoomStruct.getOptions(), Boolean.valueOf(liveRoomStruct.isMainStreamHorizontal()));
            }
        }
        LJIJ(context, enterRoomConfig, "", null, null);
    }

    @Override // X.C0J5O
    public final void LJ(Context context, SlimRoom slimRoom, String str) {
        boolean z;
        StreamUrlExtra.SrConfig srConfig;
        if (context != null && slimRoom.getMultiStreamData() != null) {
            try {
                C0IM2 c0im2 = new C0IM2(context);
                c0im2.LJIIIZ = slimRoom.getId();
                String str2 = this.LIZJ.LIZ;
                if (str2 == null) {
                    str2 = "";
                }
                c0im2.LJIIIIZZ = str2;
                if (str == null) {
                    str = "";
                }
                c0im2.LIZJ = str;
                c0im2.LIZ = "click";
                c0im2.LIZIZ = "live_cell";
                LiveMode streamType = slimRoom.getStreamType();
                if (streamType != null) {
                    c0im2.LIZLLL = streamType;
                }
                String multiStreamDefaultQualitySdkKey = slimRoom.getMultiStreamDefaultQualitySdkKey();
                if (multiStreamDefaultQualitySdkKey != null) {
                    c0im2.LJFF = multiStreamDefaultQualitySdkKey;
                }
                c0im2.LJI = slimRoom.getMultiStreamData();
                StreamUrlExtra streamUrlExtra = slimRoom.getStreamUrlExtra();
                if (streamUrlExtra == null || (srConfig = streamUrlExtra.srConfig) == null) {
                    srConfig = new StreamUrlExtra.SrConfig();
                }
                c0im2.LJ = srConfig;
                this.LIZJ.LIZ = ((IPullStreamService) C1161920gLG.LIZJ(IPullStreamService.class)).fG2(c0im2);
                this.LIZJ.LIZIZ = slimRoom.getId();
                return;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C20441214yg.LJFF("LiveWatcherUtils", "preCreatePlayer error", th);
                return;
            }
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("bad case, context:");
        if (context == null) {
            z = true;
        } else {
            z = false;
        }
        sbLIZ.append(z);
        sbLIZ.append(", slimRoom:");
        sbLIZ.append(false);
        C20441214yg.LJIIIZ("LiveWatcherUtils", C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // X.C0J5O
    public final boolean LJIIIIZZ(Context context, User user, EnterRoomConfig enterRoomConfig) {
        int i;
        long j;
        if (context == null || user == null || enterRoomConfig == null) {
            return false;
        }
        String str = enterRoomConfig.mLogData.requestId;
        if (str == null || str.length() == 0) {
            enterRoomConfig.mLogData.requestId = user.getRequestId();
        }
        EnterRoomConfig.RoomsData roomsData = enterRoomConfig.mRoomsData;
        C487710JAr.LIZ.getClass();
        roomsData.followStatus = String.valueOf(C487710JAr.LIZIZ(user));
        String str2 = user.roomData;
        long j2 = user.roomId;
        if (TextUtils.isEmpty(enterRoomConfig.mRoomsData.userId)) {
            enterRoomConfig.mRoomsData.userId = user.getUid();
        }
        EnterRoomConfig.RoomsData roomsData2 = enterRoomConfig.mRoomsData;
        if (user.isAccuratePrivateAccount()) {
            i = 1;
        } else {
            i = 0;
        }
        roomsData2.isSecret = i;
        if (!TextUtils.isEmpty(enterRoomConfig.mRoomsData.secUid)) {
            enterRoomConfig.mRoomsData.secUid = user.getSecUid();
        }
        EnterRoomConfig.RoomsData roomsData3 = enterRoomConfig.mRoomsData;
        roomsData3.roomId = j2;
        EnterRoomConfig.GuestUser guestUser = roomsData3.guestUser;
        if (guestUser != null && guestUser.uid == 0) {
            try {
                String uid = user.getUid();
                if (uid != null) {
                    j = CastLongProtector.parseLong(uid);
                } else {
                    j = -1;
                }
                guestUser.uid = j;
            } catch (NumberFormatException e) {
                TryCatchGuardChecker.doCheck(e);
                EnterRoomConfig.GuestUser guestUser2 = enterRoomConfig.mRoomsData.guestUser;
                if (guestUser2 != null) {
                    guestUser2.uid = -1L;
                }
            }
            EnterRoomConfig.GuestUser guestUser3 = enterRoomConfig.mRoomsData.guestUser;
            if (guestUser3 != null) {
                guestUser3.nickName = user.getUniqueId();
            }
        }
        return watchLive(context, enterRoomConfig, str2);
    }

    @Override // X.C0J5O
    public final boolean watchLive(Context context, EnterRoomConfig enterRoomConfig, String str) {
        return LJIJ(context, enterRoomConfig, str, null, null);
    }

    @Override // X.C0J5O
    public final void LIZJ(Context context, User user, NewLiveRoomStruct newLiveRoomStruct, Bundle bundle) {
        boolean z;
        boolean z2;
        boolean z3;
        int i;
        List<String> urlList;
        Map map;
        EnterRoomConfig enterRoomConfig = new EnterRoomConfig();
        EnterRoomConfig.RoomsData roomsData = enterRoomConfig.mRoomsData;
        ArrayList<String> arrayList = null;
        String string = bundle.getString("enter_from_merge", null);
        if (string == null) {
            string = "chat";
        }
        roomsData.enterFromMerge = string;
        EnterRoomConfig.RoomsData roomsData2 = enterRoomConfig.mRoomsData;
        String string2 = bundle.getString("enter_from_merge", null);
        if (string2 == null) {
            string2 = "live_cover";
        }
        roomsData2.enterMethod = string2;
        String string3 = bundle.getString("gd_label", null);
        if (string3 != null) {
            enterRoomConfig.mLogData.gdLabel = string3;
        }
        enterRoomConfig.mLogData.share_from = bundle.getString("share_user_id", null);
        enterRoomConfig.mLogData.interactType = bundle.getInt("accept_multi_guest_invite", 0);
        enterRoomConfig.mLogData.chatId = bundle.getString("chat_id", "");
        enterRoomConfig.mLogData.chatType = bundle.getString("chat_type", "");
        enterRoomConfig.mLogData.chatMessageFromUid = bundle.getString("chat_message_from_uid");
        enterRoomConfig.mLogData.chatMessageGuestInviteType = bundle.getString("chat_message_guest_invite_type");
        enterRoomConfig.mLogData.chatGroupOwnerUid = bundle.getString("chat_group_owner_uid");
        enterRoomConfig.mLogData.chatGroupUserNum = bundle.getString("chat_group_user_num");
        int followStatus = user.getFollowStatus();
        if (followStatus != 0 && followStatus != 1 && followStatus != 2) {
            enterRoomConfig.mRoomsData.followStatus = "3";
        } else {
            enterRoomConfig.mRoomsData.followStatus = String.valueOf(followStatus);
        }
        enterRoomConfig.mRoomsData.shareFromUserId = bundle.getString("share_user_id", null);
        enterRoomConfig.mLogData.sharedPlatform = "chat_merge";
        enterRoomConfig.mRoomsData.shareIntent = bundle.getString("share_live_intent", null);
        enterRoomConfig.mRoomsData.sharedEnterFrom = bundle.getString("shared_enter_from", null);
        enterRoomConfig.mRoomsData.mgEnterType = bundle.getInt("mg_enter_type", 0);
        enterRoomConfig.mRoomsData.mgFromSourceUserId = bundle.getLong("mg_from_source_user_id", 0L);
        enterRoomConfig.mRoomsData.liveReferralSchema = bundle.getString("live_referral_key", null);
        EnterRoomConfig.RoomsData roomsData3 = enterRoomConfig.mRoomsData;
        String str = roomsData3.liveReferralSchema;
        if (str != null && str.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        roomsData3.liveReferralFromDmJump = !z;
        enterRoomConfig.mRoomsData.shareLiveTraceId = bundle.getString("share_live_trace_id", null);
        EnterRoomConfig.RoomsData roomsData4 = enterRoomConfig.mRoomsData;
        roomsData4.shareSource = "private_message_share_source";
        roomsData4.sharedInviteeEnterSource = Integer.valueOf(bundle.getInt("shared_invitee_enter_source", 0));
        enterRoomConfig.mLogData.sourceBtmToken = bundle.getString("source_btm_token", "");
        enterRoomConfig.mLogData.sharedInnerPushRecentRoomId = bundle.getString("inner_push_recent_room_id", "");
        if (bundle.containsKey("has_more_extra")) {
            enterRoomConfig.mRoomsData.hasMoreExtra = Boolean.valueOf(bundle.getBoolean("has_more_extra", true));
        }
        if (bundle.containsKey("max_time_extra")) {
            enterRoomConfig.mRoomsData.maxTimeExtra = bundle.getLong("max_time_extra", -1L);
        }
        if (bundle.containsKey("mg_distribution_type")) {
            String string4 = bundle.getString("mg_distribution_type", null);
            String string5 = bundle.getString("share_user_id", null);
            EnterRoomConfig.RoomsData roomsData5 = enterRoomConfig.mRoomsData;
            if (roomsData5 == null || (map = roomsData5.mgDistributionInfo) == null) {
                map = new HashMap();
            }
            EnterRoomConfig.RoomsData roomsData6 = enterRoomConfig.mRoomsData;
            if (roomsData6 != null) {
                LinkedHashMap linkedHashMap = new LinkedHashMap(map);
                if (string4 == null) {
                    string4 = "anchor";
                }
                linkedHashMap.put("mg_distribution_type", string4);
                if (string5 == null) {
                    string5 = CardStruct.IStatusCode.DEFAULT;
                }
                linkedHashMap.put("distribution_user_list", string5);
                roomsData6.mgDistributionInfo = linkedHashMap;
            }
        }
        if (bundle.containsKey("current_player_tag")) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (bundle.containsKey("multi_stream_data")) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z2 && z3) {
            String string6 = bundle.getString("current_player_tag", null);
            String string7 = bundle.getString("multi_stream_data", null);
            if (string6 != null && string6.length() != 0 && string7 != null && string7.length() != 0) {
                enterRoomConfig.mRoomsData.warmUpPlayerTag = string6;
                enterRoomConfig.mStreamData.sharePullStreamData = string7;
            }
        }
        if (newLiveRoomStruct != null) {
            enterRoomConfig.mRoomsData.userId = user.getUid();
            EnterRoomConfig.RoomsData roomsData7 = enterRoomConfig.mRoomsData;
            if (user.isAccuratePrivateAccount()) {
                i = 1;
            } else {
                i = 0;
            }
            roomsData7.isSecret = i;
            enterRoomConfig.mRoomsData.secUid = user.getSecUid();
            enterRoomConfig.mStreamData.isWithPush = true;
            UrlModel urlModel = newLiveRoomStruct.roomCover;
            if (urlModel != null && (urlList = urlModel.getUrlList()) != null) {
                EnterRoomConfig.RoomsData roomsData8 = enterRoomConfig.mRoomsData;
                if (urlList instanceof ArrayList) {
                    arrayList = (ArrayList) urlList;
                }
                roomsData8.bgUrls = arrayList;
            }
            LIZIZ(context, newLiveRoomStruct, enterRoomConfig);
            return;
        }
        LJIIIIZZ(context, user, enterRoomConfig);
    }

    @Override // X.C0J5O
    public final void LJIIIZ(Boolean bool, Integer num, String str, List list) {
        InterfaceC486150J4r interfaceC486150J4r;
        bool.booleanValue();
        int iIntValue = num.intValue();
        WeakReference<InterfaceC486150J4r> weakReference = this.LIZIZ;
        if (weakReference != null && (interfaceC486150J4r = weakReference.get()) != null) {
            interfaceC486150J4r.LIZ(iIntValue, str, list);
        }
    }

    @Override // X.C0J5O
    public final void LJI(Context context, final EnterRoomConfig enterRoomConfig, final LiveRoomStruct liveRoomStruct, final List<Long> list, final Map<String, String> map) {
        final Activity activityLIZ = C1388190mED.LIZ(context);
        if (activityLIZ == null) {
            return;
        }
        if (LJIIZILJ() && !LJIILIIL()) {
            C766270U4b.LIZLLL(2131851929);
            return;
        }
        if (Live.getService() == null) {
            return;
        }
        if (!((AbstractC848400XPy) C0XQ7.LJFF()).isLogin()) {
            C0XPD.LIZIZ(activityLIZ, "personal_homepage", "click", new Bundle(), null);
            return;
        }
        if (C10EU.LJIIIIZZ() || C10EU.LJIIIZ()) {
            C476240Ily.LIZ.LIZ(0, "ttlive_minor_mode_live", new HashMap());
        }
        if (!C804420Vh2.LJI(activityLIZ) && !C0J54.LIZ(activityLIZ) && !LJIILJJIL(activityLIZ) && LJIILLIIL()) {
            C21566919al c21566919al = new C21566919al(activityLIZ);
            c21566919al.LIZ(2131858143);
            c21566919al.LJIIJ(R.string.fte, new DialogInterface.OnClickListener() { // from class: X.0J4c
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    C0J54.LIZIZ(activityLIZ);
                    this.LJI(activityLIZ, enterRoomConfig, liveRoomStruct, list, map);
                    dialogInterface.dismiss();
                }
            }, false);
            c21566919al.LJII(R.string.f1_, new DialogInterface.OnClickListener() { // from class: X.0J4m
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    dialogInterface.dismiss();
                }
            }, false);
            new C21566519ah(c21566919al).LIZLLL();
            return;
        }
        if (list.isEmpty()) {
            return;
        }
        C485990J4b.LIZJ(liveRoomStruct, enterRoomConfig);
        enterRoomConfig.mRoomsData.roomIds = new long[list.size()];
        int size = list.size();
        for (int i = 0; i < size; i++) {
            long[] jArr = enterRoomConfig.mRoomsData.roomIds;
            if (jArr != null) {
                jArr[i] = ((Number) ListProtector.get(list, i)).longValue();
            }
        }
        EnterRoomConfig.RoomsData roomsData = enterRoomConfig.mRoomsData;
        roomsData.enterRoomScene = "outside_normal_click";
        roomsData.gamePartnershipExtra = map;
        EnterRoomLinkSession.LJ(enterRoomConfig);
        Event event = new Event("ttlive_live_watch_live", 3328, C0IIR.SdkInterfaceCall);
        event.LIZIZ("live $ watchLive ");
        C0IL2.LIZ.LIZ().LIZIZ(event);
        C475360IkY.LIZ.getClass();
        C475360IkY.LIZ(activityLIZ, enterRoomConfig);
        LJIILL("game_live_card", enterRoomConfig.mRoomsData.enterMethod);
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x0112  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LJIJ(android.content.Context r13, final com.bytedance.android.livesdkapi.session.EnterRoomConfig r14, final java.lang.String r15, final java.lang.String r16, final java.util.List r17) {
        /*
            Method dump skipped, instruction units count: 403
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C485980J4a.LJIJ(android.content.Context, com.bytedance.android.livesdkapi.session.EnterRoomConfig, java.lang.String, java.lang.String, java.util.List):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0170  */
    /* JADX WARN: Type inference failed for: r0v54, types: [T, java.lang.Object] */
    @Override // X.C0J5O
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ(final android.content.Context r19, final java.util.Map r20, final java.lang.String r21, java.util.List r22, int r23, X.C1A58 r24) {
        /*
            Method dump skipped, instruction units count: 452
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C485980J4a.LIZ(android.content.Context, java.util.Map, java.lang.String, java.util.List, int, X.1A58):void");
    }

    @Override // X.C0J5O
    public final void LJIIJ(Context context, final EnterRoomConfig enterRoomConfig, final Aweme aweme, final List<Aweme> list, final InterfaceC486070J4j interfaceC486070J4j, final InterfaceC486120J4o interfaceC486120J4o) {
        String str;
        if (context != null) {
            final Context contextLIZ = C1388190mED.LIZ(context);
            if (contextLIZ == null) {
                contextLIZ = context;
            }
            this.LIZ.put(String.valueOf(interfaceC486070J4j.hashCode()), new Pair<>(C485990J4b.LIZIZ(list, interfaceC486120J4o, interfaceC486070J4j), interfaceC486070J4j));
            if (LJIIZILJ() && !LJIILIIL()) {
                C766270U4b.LIZLLL(2131851929);
                return;
            }
            if (Live.getService() == null) {
                return;
            }
            if (!((AbstractC848400XPy) C0XQ7.LJFF()).isLogin()) {
                if (contextLIZ instanceof Activity) {
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("is_skippable_dialog", false);
                    C0XQS c0xqs = new C0XQS();
                    EnterRoomConfig.RoomsData roomsData = enterRoomConfig.mRoomsData;
                    c0xqs.LIZIZ = roomsData.enterFromMerge;
                    c0xqs.LIZJ = roomsData.enterMethod;
                    c0xqs.LIZ = (Activity) contextLIZ;
                    c0xqs.LIZLLL = bundle;
                    c0xqs.LJ = new C0XTR() { // from class: X.0J4f
                        @Override // X.C0XTR
                        public final void onResult(int i, int i2, Object obj) {
                            if (i2 == 1) {
                                this.LIZ.LJIIJ(contextLIZ, enterRoomConfig, aweme, list, interfaceC486070J4j, interfaceC486120J4o);
                            }
                        }
                    };
                    ((IAccountService) ServiceManager.get().getService(IAccountService.class)).LIZJ().showLoginAndRegisterView(new C0XQT(c0xqs));
                    return;
                }
                return;
            }
            if (C10EU.LJIIIIZZ() || C10EU.LJIIIZ()) {
                C476240Ily.LIZ.LIZ(0, "ttlive_minor_mode_live", new HashMap());
            }
            if (!C804420Vh2.LJI(contextLIZ) && !C0J54.LIZ(contextLIZ) && (contextLIZ instanceof Activity) && !LJIILJJIL(contextLIZ) && LJIILLIIL()) {
                C21566919al c21566919al = new C21566919al(contextLIZ);
                c21566919al.LIZ(2131858143);
                final Context context2 = contextLIZ;
                c21566919al.LJIIJ(R.string.fte, new DialogInterface.OnClickListener() { // from class: X.0J4e
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i) {
                        C0J54.LIZIZ(context2);
                        this.LJIIJ(context2, enterRoomConfig, aweme, list, interfaceC486070J4j, null);
                        dialogInterface.dismiss();
                    }
                }, false);
                c21566919al.LJII(R.string.f1_, new DialogInterface.OnClickListener() { // from class: X.0J4k
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.dismiss();
                    }
                }, false);
                new C21566519ah(c21566919al).LIZLLL();
                return;
            }
            if (list.isEmpty()) {
                return;
            }
            Aweme aweme2 = (Aweme) ListProtector.get(list, 0);
            if (aweme != null) {
                aweme2 = aweme;
            }
            C485990J4b.LIZLLL(aweme2, enterRoomConfig);
            if (enterRoomConfig != null) {
                EnterRoomConfig.SearchWrapData searchWrapData = enterRoomConfig.mSearchData;
                if (searchWrapData != null) {
                    searchWrapData.listProviderTag = String.valueOf(interfaceC486070J4j.hashCode());
                }
                EnterRoomConfig.RoomsData roomsData2 = enterRoomConfig.mRoomsData;
                if (roomsData2 != null) {
                    roomsData2.enterRoomScene = "outside_normal_click";
                }
            }
            EnterRoomLinkSession.LJ(enterRoomConfig);
            Event event = new Event("ttlive_live_watch_live", 3328, C0IIR.SdkInterfaceCall);
            event.LIZIZ("live $ watchLive ");
            C0IL2.LIZ.LIZ().LIZIZ(event);
            C475360IkY.LIZ.getClass();
            C475360IkY.LIZ(contextLIZ, enterRoomConfig);
            EnterRoomConfig.RoomsData roomsData3 = enterRoomConfig.mRoomsData;
            if (roomsData3 != null) {
                str = roomsData3.enterMethod;
            } else {
                str = null;
            }
            LJIILL("search", str);
        }
    }

    @Override // X.C0J5O
    public final void LJIIJJI(Context context, final EnterRoomConfig enterRoomConfig, final LiveRoomStruct liveRoomStruct, final List<LiveRoomStruct> list, final InterfaceC486070J4j interfaceC486070J4j, final InterfaceC486120J4o interfaceC486120J4o) {
        if (context != null) {
            final Context contextLIZ = C1388190mED.LIZ(context);
            if (contextLIZ == null) {
                contextLIZ = context;
            }
            this.LIZ.clear();
            ArrayList arrayList = new ArrayList();
            if (list != null) {
                for (LiveRoomStruct liveRoomStruct2 : list) {
                    EnterRoomConfig enterRoomConfig2 = new EnterRoomConfig();
                    C485990J4b.LIZJ(liveRoomStruct2, enterRoomConfig2);
                    if (interfaceC486120J4o != null) {
                        interfaceC486120J4o.LIZIZ(liveRoomStruct2, enterRoomConfig2);
                    }
                    if (interfaceC486070J4j != null) {
                        enterRoomConfig2.mSearchData.listProviderTag = String.valueOf(interfaceC486070J4j.hashCode());
                    }
                    arrayList.add(enterRoomConfig2);
                }
            }
            this.LIZ.put(String.valueOf(interfaceC486070J4j.hashCode()), new Pair<>(arrayList, interfaceC486070J4j));
            if (LJIIZILJ() && !LJIILIIL()) {
                C766270U4b.LIZLLL(2131851929);
                return;
            }
            if (Live.getService() == null) {
                return;
            }
            String str = null;
            if (!((AbstractC848400XPy) C0XQ7.LJFF()).isLogin()) {
                if (contextLIZ instanceof Activity) {
                    C0XPD.LIZIZ((Activity) contextLIZ, "personal_homepage", "click", new Bundle(), null);
                    return;
                }
                return;
            }
            if (C10EU.LJIIIIZZ() || C10EU.LJIIIZ()) {
                C476240Ily.LIZ.LIZ(0, "ttlive_minor_mode_live", new HashMap());
            }
            if (!C804420Vh2.LJI(contextLIZ) && !C0J54.LIZ(contextLIZ) && (contextLIZ instanceof Activity) && !LJIILJJIL(contextLIZ) && LJIILLIIL()) {
                C21566919al c21566919al = new C21566919al(contextLIZ);
                c21566919al.LIZ(2131858143);
                c21566919al.LJIIJ(R.string.fte, new DialogInterface.OnClickListener() { // from class: X.0J4d
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i) {
                        C0J54.LIZIZ(contextLIZ);
                        this.LJIIJJI(contextLIZ, enterRoomConfig, liveRoomStruct, list, interfaceC486070J4j, interfaceC486120J4o);
                        dialogInterface.dismiss();
                    }
                }, false);
                c21566919al.LJII(R.string.f1_, new DialogInterface.OnClickListener() { // from class: X.0J4l
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.dismiss();
                    }
                }, false);
                new C21566519ah(c21566919al).LIZLLL();
                return;
            }
            if (list.isEmpty()) {
                return;
            }
            ListProtector.get(list, 0);
            C485990J4b.LIZJ(liveRoomStruct, enterRoomConfig);
            if (enterRoomConfig != null) {
                EnterRoomConfig.SearchWrapData searchWrapData = enterRoomConfig.mSearchData;
                if (searchWrapData != null) {
                    searchWrapData.listProviderTag = String.valueOf(interfaceC486070J4j.hashCode());
                }
                EnterRoomConfig.RoomsData roomsData = enterRoomConfig.mRoomsData;
                if (roomsData != null) {
                    roomsData.enterRoomScene = "outside_normal_click";
                }
            }
            EnterRoomLinkSession.LJ(enterRoomConfig);
            Event event = new Event("ttlive_live_watch_live", 3328, C0IIR.SdkInterfaceCall);
            event.LIZIZ("live $ watchLive ");
            C0IL2.LIZ.LIZ().LIZIZ(event);
            C475360IkY.LIZ.getClass();
            C475360IkY.LIZ(contextLIZ, enterRoomConfig);
            EnterRoomConfig.RoomsData roomsData2 = enterRoomConfig.mRoomsData;
            if (roomsData2 != null) {
                str = roomsData2.enterMethod;
            }
            LJIILL("search", str);
        }
    }

    @Override // X.C0J5O
    public final void LJIIL(Context context, long j, EnterRoomConfig enterRoomConfig, String str, ArrayList<Long> arrayList, String str2) {
        EnterRoomConfig.RoomsData roomsData = enterRoomConfig.mRoomsData;
        roomsData.roomId = j;
        roomsData.enterFromMerge = str;
        LJIJ(context, enterRoomConfig, "", str2, arrayList);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0034, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.LJFF(X.C0XQ7.LIZ.LJIIJ().getCurUserId(), r11.getUid()) == false) goto L15;
     */
    @Override // X.C0J5O
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJFF(android.content.Context r10, com.ss.android.ugc.aweme.profile.model.User r11, boolean r12, java.lang.String r13, com.bytedance.android.livesdkapi.depend.model.live.SlimRoom r14, java.lang.String r15, java.lang.String r16) {
        /*
            Method dump skipped, instruction units count: 245
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C485980J4a.LJFF(android.content.Context, com.ss.android.ugc.aweme.profile.model.User, boolean, java.lang.String, com.bytedance.android.livesdkapi.depend.model.live.SlimRoom, java.lang.String, java.lang.String):void");
    }
}
