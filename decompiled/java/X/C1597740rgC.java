package X;

import Y.AfS7S0000100_24;
import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import com.bytedance.android.btm.api.BtmSDK;
import com.bytedance.android.btm.api.model.PageFinder;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveSkylightRefreshOptSetting;
import com.bytedance.android.livesdkapi.depend.model.live.EcommerceRoomHeadTag;
import com.bytedance.android.livesdkapi.depend.model.live.SlimRoom;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.google.gson.reflect.TypeToken;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import com.ss.android.ugc.aweme.feed.module.FollowingInterestUser;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.story.inbox.InsertStory;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0rgC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1597740rgC {
    public static long LIZIZ;
    public static long LIZJ;
    public static long LIZLLL;
    public static long LJ;
    public static boolean LJFF;
    public static boolean LJI;
    public static boolean LJIIIIZZ;
    public static boolean LJIIIZ;
    public static boolean LJIIJ;
    public static boolean LJIIL;
    public static C11JF LJIILIIL;
    public static final C1597740rgC LIZ = new C1597740rgC();
    public static String LJII = "";
    public static String LJIIJJI = "";
    public static final SecureRandom LJIILJJIL = new SecureRandom();
    public static List<FollowingInterestUser> LJIILL = new ArrayList();

    public static void LJIIIZ() {
        if (LJIIIIZZ && ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).B4().LJIILIIL("livesdk_enter_message_window")) {
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LJIIIIZZ("enter_from_merge", "homepage_follow");
            c2344009Gk.LJIIIIZZ("enter_method", "live_cover");
            c2344009Gk.LJIIIIZZ("request_id", LJIIJJI);
            c2344009Gk.LJIIIIZZ("is_draw", LJIIJ ? "1" : CardStruct.IStatusCode.DEFAULT);
            Map<String, String> map = c2344009Gk.LIZ;
            boolean z = C486660J6q.LIZ;
            C20684815ws.LJIILLIIL("livesdk_enter_message_window", map);
        }
    }

    public static void LIZIZ() {
        LIZIZ = System.currentTimeMillis();
    }

    public static void LIZJ() {
        ((Boolean) ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).q4().B4().LIZJ(Boolean.FALSE, "live_following_window_inner_outer_same_flow")).booleanValue();
    }

    public static boolean LIZLLL() {
        return ((Boolean) ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).q4().B4().LIZJ(Boolean.FALSE, "live_following_window_long_username")).booleanValue();
    }

    public static boolean LJ() {
        return ((Boolean) ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).q4().B4().LIZJ(Boolean.FALSE, "live_following_window_regular_username")).booleanValue();
    }

    public static void LJIIIIZZ() {
        if (((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).B4().LJIILIIL("livesdk_draw_message_window")) {
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LJIIIIZZ("enter_from_merge", "homepage_follow");
            c2344009Gk.LJIIIIZZ("enter_method", "live_cover");
            c2344009Gk.LJIIIIZZ("request_id", LJIIJJI);
            Map<String, String> map = c2344009Gk.LIZ;
            boolean z = C486660J6q.LIZ;
            C20684815ws.LJIILLIIL("livesdk_draw_message_window", map);
        }
    }

    public static boolean LJFF(TuxTextView tuxTextView) {
        int right = ((tuxTextView.getRight() - tuxTextView.getLeft()) - tuxTextView.getCompoundPaddingLeft()) - tuxTextView.getCompoundPaddingRight();
        float fMeasureText = tuxTextView.getPaint().measureText(tuxTextView.getText().toString());
        if (right > 0 && fMeasureText >= right) {
            return true;
        }
        return false;
    }

    public static boolean LJI(Boolean bool) {
        InterfaceC20318714ev interfaceC20318714evB4 = ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).q4().B4();
        Boolean bool2 = Boolean.TRUE;
        if (!((Boolean) interfaceC20318714evB4.LIZJ(bool2, "live_following_window_auto_open_enabled")).booleanValue() || LIZLLL <= 0) {
            return false;
        }
        if (LIZIZ > 0 && System.currentTimeMillis() - LIZIZ >= 6000) {
            LJII = "back_auto";
            LIZIZ = 0L;
            return !Intrinsics.LJFF(bool, bool2);
        }
        if (Intrinsics.LJFF(bool, bool2)) {
            return false;
        }
        if (((Integer) ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).q4().B4().LIZJ(-1, "live_following_window_exit_expand_duration")).intValue() > 0 && LIZJ > 0 && System.currentTimeMillis() - LIZJ >= r5.intValue() * LSPassThroughRecordSizeConfig.DEFAULT) {
            LJII = "time_auto";
            return true;
        }
        if (!LJI) {
            return false;
        }
        LJII = "unread";
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.bytedance.android.livesdkapi.depend.model.live.SlimRoom LJII(com.ss.android.ugc.aweme.feed.module.FollowingInterestUser r4) {
        /*
            r3 = 0
            if (r4 == 0) goto L19
            com.bytedance.android.livesdkapi.depend.model.live.SlimRoom r0 = r4.getSlimRoom()
            if (r0 == 0) goto Le
            com.bytedance.android.livesdkapi.depend.model.live.SlimRoom r0 = r4.getSlimRoom()
            return r0
        Le:
            if (r4 == 0) goto L19
            com.ss.android.ugc.aweme.profile.model.User r0 = r4.getUser()
            if (r0 == 0) goto L19
            java.lang.String r1 = r0.roomData
            goto L1a
        L19:
            r1 = r3
        L1a:
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L4a
            if (r4 == 0) goto L3d
            java.lang.Class<com.bytedance.android.livesdkapi.depend.model.live.SlimRoom> r0 = com.bytedance.android.livesdkapi.depend.model.live.SlimRoom.class
            java.lang.Object r0 = X.C08JS.LIZ(r1, r0)     // Catch: java.lang.Throwable -> L3e
            com.bytedance.android.livesdkapi.depend.model.live.SlimRoom r0 = (com.bytedance.android.livesdkapi.depend.model.live.SlimRoom) r0     // Catch: java.lang.Throwable -> L3e
            r4.setSlimRoom(r0)     // Catch: java.lang.Throwable -> L3e
            com.bytedance.android.livesdkapi.depend.model.live.SlimRoom r2 = r4.getSlimRoom()     // Catch: java.lang.Throwable -> L3e
            if (r2 == 0) goto L39
            long r0 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L3e
            r2.clientAcceptanceTime = r0     // Catch: java.lang.Throwable -> L3e
        L39:
            com.bytedance.android.livesdkapi.depend.model.live.SlimRoom r3 = r4.getSlimRoom()     // Catch: java.lang.Throwable -> L3e
        L3d:
            return r3
        L3e:
            r1 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)
            X.00Yq r0 = new X.00Yq
            r0.<init>(r1)
            X.C189200o6.m2constructorimpl(r0)
        L4a:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1597740rgC.LJII(com.ss.android.ugc.aweme.feed.module.FollowingInterestUser):com.bytedance.android.livesdkapi.depend.model.live.SlimRoom");
    }

    public static void LIZ(C1597740rgC c1597740rgC, InsertStory insertStory, Boolean bool, int i) {
        Boolean bool2 = null;
        if ((i & 1) != 0) {
            insertStory = null;
        }
        if ((i & 2) == 0) {
            bool2 = bool;
        }
        c1597740rgC.getClass();
        LJFF = true;
        boolean zLJI = LJI(bool2);
        if (insertStory != null || (((Boolean) ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).q4().B4().LIZJ(Boolean.TRUE, "live_following_window_auto_refresh_enabled")).booleanValue() && LIZLLL > 0 && System.currentTimeMillis() - LJ >= 30000 && LJI(bool2))) {
            C1440005kM.LIZ(new C1595010rbn(false, true, false, insertStory, 4));
        } else if (zLJI) {
            C1440005kM.LIZ(new C1595010rbn(true, false, false, null, 12));
        }
        if (LJIIIZ) {
            LJIIIZ();
        }
        LIZIZ = 0L;
        LIZJ = 0L;
        if (C0IVH.LIZIZ() && !LJIIL) {
            LJIIL = true;
            long j = LiveSkylightRefreshOptSetting.INSTANCE.config().intervalFollowSecond;
            C11JF c11jf = LJIILIIL;
            if (c11jf != null) {
                c11jf.dispose();
            }
            LJIILIIL = (C11JF) C11NZ.LJJJJLI(j, TimeUnit.SECONDS).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new AfS7S0000100_24(j, 2), new C09JN() { // from class: X.00NV
                @Override // X.C09JN
                public final /* bridge */ /* synthetic */ void accept(Object obj) {
                    C1C7U.LIZ("FollowFeedLoadUtil@6877.startAutoRefreshTimer$2");
                    C1C7U.LIZIZ("FollowFeedLoadUtil@6877.startAutoRefreshTimer$2");
                }
            });
        }
        ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).v3().LIZIZ("homepage_follow");
    }

    public static void LJIIJ(Context context, FollowingInterestUser followingInterestUser, List list, int i, View view, String str, String str2, long j) {
        User user;
        int i2;
        String imprId;
        int i3;
        EcommerceRoomHeadTag ecommerceRoomHeadTag;
        String str3;
        Unit unit;
        if (followingInterestUser != null && (user = followingInterestUser.getUser()) != null) {
            long j2 = user.roomId;
            String str4 = followingInterestUser.getUser().roomData;
            if (str4 == null) {
                return;
            }
            ArrayList arrayList = new ArrayList();
            if (list != null) {
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    arrayList.add(Long.valueOf(((FollowingInterestUser) it2.next()).getUser().roomId));
                }
            }
            EnterRoomConfig enterRoomConfig = new EnterRoomConfig();
            if (view != null) {
                EnterRoomConfig.RoomsData roomsData = enterRoomConfig.mRoomsData;
                Rect rect = new Rect();
                int[] iArrLJJLIIIJLLLLLLLZ = C13LQ.LJJLIIIJLLLLLLLZ(new Integer[]{0, 0});
                view.getLocationOnScreen(iArrLJJLIIIJLLLLLLLZ);
                int i4 = iArrLJJLIIIJLLLLLLLZ[0];
                rect.left = i4;
                int i5 = iArrLJJLIIIJLLLLLLLZ[1];
                rect.top = i5;
                rect.right = i4 + i4;
                rect.bottom = i5 + i5;
                roomsData.enterSourcePosition = rect;
            }
            enterRoomConfig.mRoomsData.roomIds = C13LP.LLIIIILZ(arrayList);
            EnterRoomConfig.RoomsData roomsData2 = enterRoomConfig.mRoomsData;
            roomsData2.enterMethod = str2;
            roomsData2.anchorRelationType = followingInterestUser.getInterestUserType();
            enterRoomConfig.mLogData.isFromList = 0;
            EnterRoomConfig.RoomsData roomsData3 = enterRoomConfig.mRoomsData;
            String uid = followingInterestUser.getUser().getUid();
            if (uid == null) {
                uid = CardStruct.IStatusCode.DEFAULT;
            }
            roomsData3.userId = uid;
            EnterRoomConfig.RoomsData roomsData4 = enterRoomConfig.mRoomsData;
            if (followingInterestUser.getUser().isAccuratePrivateAccount()) {
                i2 = 1;
            } else {
                i2 = 0;
            }
            roomsData4.isSecret = i2;
            enterRoomConfig.mRoomsData.enterType = "click";
            EnterRoomConfig.LogData logData = enterRoomConfig.mLogData;
            LogPbBean logPbBean = followingInterestUser.getLogPbBean();
            if (logPbBean != null) {
                imprId = logPbBean.getImprId();
            } else {
                imprId = null;
            }
            logData.requestId = String.valueOf(imprId);
            EnterRoomConfig.LogData logData2 = enterRoomConfig.mLogData;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            SlimRoom slimRoom = followingInterestUser.getSlimRoom();
            if (slimRoom != null && (ecommerceRoomHeadTag = slimRoom.ecommerceRoomHeadTag) != null && (str3 = ecommerceRoomHeadTag.daInfo) != null) {
                try {
                    HashMap map = (HashMap) C08JS.LIZIZ().LJIIIIZZ(str3, new TypeToken<HashMap<String, String>>() { // from class: X.04Yx
                    }.getType());
                    if (map != null) {
                        linkedHashMap.putAll(map);
                        unit = Unit.LIZ;
                    } else {
                        unit = null;
                    }
                    C189200o6.m2constructorimpl(unit);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    C189200o6.m2constructorimpl(new C098200Yq(th));
                }
            }
            logData2.singleRoomLogMap = linkedHashMap;
            EnterRoomConfig.LogData logData3 = enterRoomConfig.mLogData;
            if (followingInterestUser.getRelationType() == 4 && !C10EU.LJIIL(followingInterestUser.getUser())) {
                i3 = 1;
            } else {
                i3 = 0;
            }
            logData3.isMaf = i3;
            User user2 = followingInterestUser.getUser();
            UrlModel urlModel = user2.roomCover;
            if (urlModel != null && !C0IKQ.LIZ(urlModel.getUrlList())) {
                enterRoomConfig.mRoomsData.bgUrls = (ArrayList) followingInterestUser.getUser().roomCover.getUrlList();
            } else if (user2.getAvatarThumb() != null && !C0IKQ.LIZ(user2.getAvatarThumb().getUrlList())) {
                enterRoomConfig.mRoomsData.bgUrls = (ArrayList) followingInterestUser.getUser().getAvatarThumb().getUrlList();
            }
            enterRoomConfig.mRoomsData.clickedUserId = user2.getUid();
            EnterRoomConfig.RoomsData roomsData5 = enterRoomConfig.mRoomsData;
            roomsData5.roomId = j2;
            roomsData5.enterFromMerge = str;
            roomsData5.roomIds = C13LP.LLIIIILZ(arrayList);
            enterRoomConfig.mLogData.positionOutsideLiveRoom = i;
            int followStatus = followingInterestUser.getUser().getFollowStatus();
            int followerStatus = followingInterestUser.getUser().getFollowerStatus();
            if (followStatus != 2 && followStatus != 3) {
                if (followStatus == 1) {
                    if (followerStatus == 1) {
                        enterRoomConfig.mRoomsData.followStatus = "2";
                    } else {
                        enterRoomConfig.mRoomsData.followStatus = "1";
                    }
                } else if (followerStatus == 1) {
                    enterRoomConfig.mRoomsData.followStatus = "3";
                } else {
                    enterRoomConfig.mRoomsData.followStatus = CardStruct.IStatusCode.DEFAULT;
                }
            } else {
                enterRoomConfig.mRoomsData.followStatus = String.valueOf(followStatus);
            }
            if (Intrinsics.LJFF("follow_widget", str)) {
                C0J9A c0j9aV3 = ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).v3();
                enterRoomConfig.mRoomsData.widgetType = c0j9aV3.LIZJ();
                enterRoomConfig.mRoomsData.widgetAnchorNum = c0j9aV3.getWidgetAnchorNum();
                enterRoomConfig.mRoomsData.anchorPosition = c0j9aV3.getAnchorPosition();
            }
            C0IVT.LIZJ(followingInterestUser.getSlimRoom(), enterRoomConfig);
            BtmSDK btmSDK = BtmSDK.INSTANCE;
            C21244318Bt c21244318Bt = new C21244318Bt();
            c21244318Bt.LIZ = "c0736.d1618_i" + i;
            c21244318Bt.LIZIZ = PageFinder.via(view);
            String strCreateJumpSourceBtmToken = btmSDK.createJumpSourceBtmToken(c21244318Bt);
            if (strCreateJumpSourceBtmToken != null && strCreateJumpSourceBtmToken.length() != 0) {
                enterRoomConfig.mLogData.sourceBtmToken = strCreateJumpSourceBtmToken;
            }
            long j3 = 0;
            if (j > 0) {
                EnterRoomConfig.LogData logData4 = enterRoomConfig.mLogData;
                long jCurrentTimeMillis = System.currentTimeMillis() - j;
                if (jCurrentTimeMillis >= 0) {
                    j3 = jCurrentTimeMillis;
                }
                logData4.latencyEnterRoomInterval = j3;
            }
            ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).z5().watchLive(context, enterRoomConfig, str4);
        }
    }
}
