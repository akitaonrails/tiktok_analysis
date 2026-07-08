package X;

import android.app.Activity;
import android.content.res.Resources;
import android.text.TextUtils;
import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.choosemusic.model.MusicCollectionFeed;
import com.ss.android.ugc.aweme.choosemusic.model.MusicCollectionFeedResponse;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.ss.android.ugc.aweme.services.IAVMobService;
import com.ss.android.ugc.aweme.services.IExternalService;
import com.ss.android.ugc.aweme.services.IShortVideoConfig;
import com.ss.android.ugc.aweme.shortvideo.duet.CheckDuetReactPermissionResponse;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.16He, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public class C20748816He implements InterfaceC2385309Wh {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // X.InterfaceC2385309Wh
    public final Object then(C15O7 c15o7) {
        switch (this.$t) {
            case 0:
                return then$0(this, c15o7);
            case 1:
                return then$1(this, c15o7);
            case 2:
                return then$2(this, c15o7);
            case 3:
                return then$3(this, c15o7);
            case 4:
                return then$4(this, c15o7);
            default:
                return null;
        }
    }

    public static final Object then$0(C20748816He c20748816He, C15O7 c15o7) {
        Resources resources;
        Resources resources2;
        C1C7U.LIZ("StitchWithMovieHelper@c4b6.goStitchWithMovie$4");
        String string = null;
        if (!c15o7.LJIILL() && !c15o7.LJIILIIL()) {
            if (!((CheckDuetReactPermissionResponse) c15o7.LJIIL()).allowCurrent) {
                String errorHintWhenDisableDuetOrStitch = ((CheckDuetReactPermissionResponse) c15o7.LJIIL()).reason;
                if (TextUtils.isEmpty(errorHintWhenDisableDuetOrStitch)) {
                    Activity activity = ((C15OF) c20748816He.l0).LIZ;
                    if (activity != null && (resources2 = activity.getResources()) != null) {
                        string = resources2.getString(2131848928);
                    }
                    errorHintWhenDisableDuetOrStitch = string;
                }
                IShortVideoConfig iShortVideoConfigShortVideoConfig = ((IExternalService) ServiceManager.get().getService(IExternalService.class)).configService().shortVideoConfig();
                if (((Aweme) c20748816He.l1).getVideo().getVideoLength() > iShortVideoConfigShortVideoConfig.maxConsumerDuetOrStitchVideoTime()) {
                    errorHintWhenDisableDuetOrStitch = iShortVideoConfigShortVideoConfig.getErrorHintWhenDisableDuetOrStitch(2);
                }
                C15OF c15of = (C15OF) c20748816He.l0;
                if (c15of.LIZ != null) {
                    c15of.LJIIIIZZ(errorHintWhenDisableDuetOrStitch, C15OK.SERVER_CHECK_DENY);
                    c15of.LIZ();
                }
            } else {
                C178000mI.LIZIZ(2, ((Aweme) c20748816He.l1).getAid());
                ((C15OF) c20748816He.l0).LJFF();
            }
        } else {
            C15OF c15of2 = (C15OF) c20748816He.l0;
            Activity activity2 = c15of2.LIZ;
            if (activity2 != null && (resources = activity2.getResources()) != null) {
                string = resources.getString(2131837963);
            }
            if (c15of2.LIZ != null) {
                c15of2.LJIIIIZZ(string, C15OK.SERVER_CHECK_DENY);
                c15of2.LIZ();
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("StitchWithMovieHelper@c4b6.goStitchWithMovie$4");
        return unit;
    }

    public static final Object then$1(C20748816He c20748816He, C15O7 c15o7) {
        C1C7U.LIZ("InnerPushPuller@6455.pull$2");
        C20643115q9 c20643115q9 = C20643115q9.LIZ;
        EnumC20643215qA enumC20643215qA = (EnumC20643215qA) c20748816He.l0;
        JSONObject jSONObject = (JSONObject) c20748816He.l1;
        c20643115q9.getClass();
        C20643115q9.LIZJ(enumC20643215qA, jSONObject);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("InnerPushPuller@6455.pull$2");
        return unit;
    }

    public static final Object then$2(C20748816He c20748816He, C15O7 c15o7) {
        C1C7U.LIZ("InnerPushPuller@6455.pull$4");
        C20643115q9 c20643115q9 = C20643115q9.LIZ;
        EnumC20643215qA enumC20643215qA = (EnumC20643215qA) c20748816He.l0;
        JSONObject jSONObject = (JSONObject) c20748816He.l1;
        c20643115q9.getClass();
        C20643115q9.LIZJ(enumC20643215qA, jSONObject);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("InnerPushPuller@6455.pull$4");
        return unit;
    }

    public static final Object then$3(C20748816He c20748816He, C15O7 c15o7) {
        C204594153w c204594153w = (C204594153w) c20748816He.l0;
        C138P c138p = (C138P) c20748816He.l1;
        c204594153w.getClass();
        C1C7U.LIZ("ChooseMusicModel@8dbe.fetchCollectionFeed$1L");
        c204594153w.LJI = false;
        if (c15o7.LJIILIIL()) {
            C1C7U.LIZIZ("ChooseMusicModel@8dbe.fetchCollectionFeed$1L");
            return null;
        }
        long jLIZIZ = c138p.LIZIZ(TimeUnit.MILLISECONDS);
        if (c15o7.LJIILL()) {
            c204594153w.LIZIZ.zQ2(1, "collection_feed_status");
            IAVMobService iAVMobService = c204594153w.LIZLLL;
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LJIIIIZZ("api_type", "music_list");
            c2344009Gk.LIZLLL(jLIZIZ, "duration");
            c2344009Gk.LJIIIIZZ(Scene.SCENE_SERVICE, "discover");
            c2344009Gk.LIZJ(1, FollowStatusChangeMethod.PARAM_FOLLOW_STATUS);
            c2344009Gk.LJIIIIZZ("error_domain", C12NI.LIZ);
            c2344009Gk.LJIIIIZZ("error_code", c15o7.LJIIJJI().getMessage());
            c2344009Gk.LIZJ(0, "count");
            iAVMobService.onEventV3("tool_performance_api", c2344009Gk.LIZ);
        } else if (c15o7.LJIILJJIL()) {
            MusicCollectionFeedResponse musicCollectionFeedResponse = (MusicCollectionFeedResponse) c15o7.LJIIL();
            c204594153w.LIZIZ.zQ2(Integer.valueOf(musicCollectionFeedResponse.cursor), "collection_feed_cursor");
            c204594153w.LIZIZ.zQ2(Integer.valueOf(musicCollectionFeedResponse.hasMore), "collection_feed_has_more");
            List list = (List) c204594153w.LIZIZ.get("list");
            if (list == null) {
                c204594153w.LIZIZ.zQ2(1, "collection_feed_status");
            } else {
                List<MusicCollectionFeed> list2 = musicCollectionFeedResponse.musicCollectionFeedList;
                for (MusicCollectionFeed musicCollectionFeed : list2) {
                    list.add(new C20448914zv(C15J0.LIZIZ(musicCollectionFeed.musicList, musicCollectionFeedResponse.extra), musicCollectionFeed.collection, 2));
                }
                c204594153w.LIZIZ.zQ2(list, "list");
                c204594153w.LIZIZ.zQ2(0, "collection_feed_status");
                IAVMobService iAVMobService2 = c204594153w.LIZLLL;
                C2344009Gk c2344009Gk2 = new C2344009Gk();
                c2344009Gk2.LJIIIIZZ("api_type", "music_list");
                c2344009Gk2.LIZLLL(jLIZIZ, "duration");
                c2344009Gk2.LJIIIIZZ(Scene.SCENE_SERVICE, "discover");
                c2344009Gk2.LIZJ(0, FollowStatusChangeMethod.PARAM_FOLLOW_STATUS);
                c2344009Gk2.LIZJ(list2.size(), "count");
                iAVMobService2.onEventV3("tool_performance_api", c2344009Gk2.LIZ);
            }
        }
        C1C7U.LIZIZ("ChooseMusicModel@8dbe.fetchCollectionFeed$1L");
        return null;
    }

    public static final Object then$4(C20748816He c20748816He, C15O7 c15o7) {
        C204594153w c204594153w = (C204594153w) c20748816He.l0;
        C138P c138p = (C138P) c20748816He.l1;
        c204594153w.getClass();
        C1C7U.LIZ("ChooseMusicModel@8dbe.fetchCollectionFeedInMoreTab$1L");
        if (c15o7.LJIILIIL()) {
            C1C7U.LIZIZ("ChooseMusicModel@8dbe.fetchCollectionFeedInMoreTab$1L");
            return null;
        }
        long jLIZIZ = c138p.LIZIZ(TimeUnit.MILLISECONDS);
        if (c15o7.LJIILL()) {
            c204594153w.LIZIZ.zQ2(1, "collection_feed_status");
            c204594153w.LIZIZ.zQ2(1, "more_tab_collection_feed_refresh_status");
            IAVMobService iAVMobService = c204594153w.LIZLLL;
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LJIIIIZZ("api_type", "music_list");
            c2344009Gk.LIZLLL(jLIZIZ, "duration");
            c2344009Gk.LJIIIIZZ(Scene.SCENE_SERVICE, "discover");
            c2344009Gk.LIZJ(1, FollowStatusChangeMethod.PARAM_FOLLOW_STATUS);
            c2344009Gk.LJIIIIZZ("error_domain", C12NI.LIZ);
            c2344009Gk.LJIIIIZZ("error_code", c15o7.LJIIJJI().getMessage());
            c2344009Gk.LIZJ(0, "count");
            iAVMobService.onEventV3("tool_performance_api", c2344009Gk.LIZ);
            int iIntValue = ((Integer) c204594153w.LIZIZ.get("more_tab_music_sheet_refresh_status", 2)).intValue();
            if (iIntValue == 1) {
                c204594153w.LIZIZ.zQ2(1, "more_tab_refresh_status");
            } else if (iIntValue == 0) {
                c204594153w.LIZIZ.zQ2(c204594153w.LIZIZ.get("more_tab_music_sheet"), "list");
                c204594153w.LIZIZ.zQ2(0, "more_tab_refresh_status");
                c204594153w.LIZIZ.zQ2(Boolean.TRUE, "more_tab_has_fetched");
            }
        } else if (c15o7.LJIILJJIL()) {
            c204594153w.LIZIZ.zQ2(0, "more_tab_collection_feed_refresh_status");
            c204594153w.LIZIZ.zQ2(0, "collection_feed_status");
            ArrayList arrayList = new ArrayList();
            MusicCollectionFeedResponse musicCollectionFeedResponse = (MusicCollectionFeedResponse) c15o7.LJIIL();
            List<MusicCollectionFeed> list = musicCollectionFeedResponse.musicCollectionFeedList;
            for (MusicCollectionFeed musicCollectionFeed : list) {
                arrayList.add(new C20448914zv(C15J0.LIZIZ(musicCollectionFeed.musicList, musicCollectionFeedResponse.extra), musicCollectionFeed.collection, 2));
            }
            IAVMobService iAVMobService2 = c204594153w.LIZLLL;
            C2344009Gk c2344009Gk2 = new C2344009Gk();
            c2344009Gk2.LJIIIIZZ("api_type", "music_list");
            c2344009Gk2.LIZLLL(jLIZIZ, "duration");
            c2344009Gk2.LJIIIIZZ(Scene.SCENE_SERVICE, "discover");
            c2344009Gk2.LIZJ(0, FollowStatusChangeMethod.PARAM_FOLLOW_STATUS);
            c2344009Gk2.LIZJ(list.size(), "count");
            iAVMobService2.onEventV3("tool_performance_api", c2344009Gk2.LIZ);
            List list2 = (List) c204594153w.LIZIZ.get("more_tab_music_sheet");
            if (list2 == null) {
                if (((Integer) c204594153w.LIZIZ.get("more_tab_music_sheet_refresh_status", 2)).intValue() == 2) {
                    c204594153w.LIZIZ.zQ2(arrayList, "more_tab_collection_feed");
                } else {
                    c204594153w.LIZIZ.zQ2(1, "more_tab_refresh_status");
                }
            } else {
                list2.addAll(arrayList);
                c204594153w.LIZIZ.zQ2(list2, "list");
                c204594153w.LIZIZ.zQ2(0, "more_tab_refresh_status");
                c204594153w.LIZIZ.zQ2(Boolean.TRUE, "more_tab_has_fetched");
            }
        }
        C1C7U.LIZIZ("ChooseMusicModel@8dbe.fetchCollectionFeedInMoreTab$1L");
        return null;
    }

    public C20748816He(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
