package X;

import com.bytedance.scene.Scene;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.poi.PoiAnchorInfo;
import com.ss.android.ugc.aweme.poi.PoiDataStruct;
import com.ss.android.ugc.aweme.poi.PoiSubTag;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.tiktok.location_api.service.ILocationService;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0hTA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1205260hTA {
    public static String LIZIZ;
    public static Long LJFF;
    public static final C1205260hTA LIZ = new C1205260hTA();
    public static final HashSet<String> LIZJ = new HashSet<>();
    public static final Set<String> LIZLLL = C13LQ.LJLIIL(new String[]{"L3toL1", "L3toL2", "L2toL1"});
    public static int LJ = -1;

    public static int LIZIZ(boolean z, boolean z2) {
        if (z2) {
            return z ? 1 : 2;
        }
        return 0;
    }

    public static Map LIZ(String str) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("device_tabcity_location_relationship", C1204880hSY.LIZJ());
        String strLIZIZ = C1204880hSY.LIZIZ();
        if (strLIZIZ == null) {
            strLIZIZ = "";
        }
        linkedHashMap.put("nearby_tab_city_id", strLIZIZ);
        linkedHashMap.put("nearby_rank", String.valueOf(C1205250hT9.LIZIZ.LJIIIZ()));
        C1189060h32.LJIJI(linkedHashMap, "rank_inner", str);
        linkedHashMap.put("is_inner", "1");
        C1189060h32.LJIJI(linkedHashMap, "nearby_inner_session_id", LJFF);
        return linkedHashMap;
    }

    public static boolean LIZJ(Aweme aweme) {
        if (!LJ(aweme) && !LIZLLL(aweme)) {
            return false;
        }
        return true;
    }

    public static boolean LIZLLL(Aweme aweme) {
        PoiDataStruct poiDataStruct;
        PoiAnchorInfo poiAnchorInfo;
        List<PoiSubTag> list;
        PoiSubTag next;
        String str = null;
        if (aweme != null && (poiDataStruct = aweme.getPoiDataStruct()) != null && (poiAnchorInfo = poiDataStruct.commentAnchor) != null && (list = poiAnchorInfo.subTags) != null) {
            Iterator<PoiSubTag> it2 = list.iterator();
            while (true) {
                if (it2.hasNext()) {
                    next = it2.next();
                    Integer num = next.type;
                    if (num != null && num.intValue() == 10) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            PoiSubTag poiSubTag = next;
            if (poiSubTag != null) {
                str = poiSubTag.name;
            }
        }
        if (C123100dR.LIZ(str)) {
            if ((((Boolean) C0B95.LIZ.getValue()).booleanValue() || ((Boolean) C0B96.LIZ.getValue()).booleanValue()) && ((Boolean) C0B92.LIZ.getValue()).booleanValue()) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static boolean LJ(Aweme aweme) {
        String str;
        PoiDataStruct poiDataStruct;
        if (aweme != null && (poiDataStruct = aweme.getPoiDataStruct()) != null) {
            str = poiDataStruct.poiName;
        } else {
            str = null;
        }
        if (!C123100dR.LIZ(str)) {
            return false;
        }
        if ((!((Boolean) C0B93.LIZ.getValue()).booleanValue() && ((InterfaceC1207490hWl) ServiceManager.get().getService(ILocationService.class)).LJII(0, C1BWL.LIZ())) || !((Boolean) C0B92.LIZ.getValue()).booleanValue()) {
            return false;
        }
        return true;
    }

    public static void LJFF(String str) {
        if (!Intrinsics.LJFF(LIZIZ, C1204880hSY.LIZIZ())) {
            LIZJ.clear();
            LIZIZ = C1204880hSY.LIZIZ();
        }
        LIZJ.add(str);
    }

    public static void LJIIJJI(String str) {
        int size;
        if (Intrinsics.LJFF(str, "empty_page")) {
            size = 0;
        } else {
            size = LIZJ.size();
        }
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LIZJ(size, "num_video_shown");
        c2344009Gk.LJIIIIZZ("enter_from", "homepage_nearby");
        c2344009Gk.LJIIIIZZ("enable_location", C1204880hSY.LIZ());
        c2344009Gk.LJIIIIZZ("nearby_tab_city_id", C1204880hSY.LIZIZ());
        c2344009Gk.LJIIIIZZ("type", str);
        C1185040gwY c1185040gwY = C1185040gwY.LIZ;
        Map<String, String> map = c2344009Gk.LIZ;
        c1185040gwY.getClass();
        C1185040gwY.LIZIZ("finish_play_guide_show", map, null);
    }

    public static void LJI(Aweme aweme, String str) {
        int i;
        User author;
        String str2;
        String strLJII;
        int i2;
        String aid;
        boolean zLIZLLL = LIZLLL(aweme);
        boolean zLJ = LJ(aweme);
        try {
            C1370890lmJ c1370890lmJ = C1370890lmJ.LIZ;
            C735840Sti c735840Sti = C735840Sti.LIZ;
            C19651011uW c19651011uW = C19651011uW.LIZIZ;
            C735360Ssw c735360Ssw = new C735360Ssw();
            int i3 = 1;
            if (((AbstractC848400XPy) C0XQ7.LJFF()).isLogin()) {
                i = 1;
            } else {
                i = 0;
            }
            c735360Ssw.LJLJJI = i;
            c735360Ssw.LJL = "click_card_like";
            c735360Ssw.LIZLLL = "homepage_nearby";
            c735360Ssw.LLIIIL = CardStruct.IStatusCode.DEFAULT;
            c735360Ssw.LLIIIZ = str;
            c735360Ssw.LJJLIIIJJIZ = 7;
            c735360Ssw.LJIJI(aweme);
            C729980SkG.LJII(aweme);
            if (aweme == null) {
                author = null;
            } else {
                author = aweme.getAuthor();
            }
            c735840Sti.getClass();
            c735360Ssw.LJJJLL = C735840Sti.LJIIIIZZ(author);
            if (C729510SjV.LJJIJIL(aweme)) {
                str2 = "story";
            } else {
                str2 = "post";
            }
            c735360Ssw.LJJJLZIJ = str2;
            if (aweme == null) {
                strLJII = null;
            } else {
                strLJII = C729510SjV.LJII(aweme);
            }
            c735360Ssw.LJJJZ = strLJII;
            if (aweme != null && aweme.getIsStoryToNormal()) {
                i2 = 1;
            } else {
                i2 = 0;
            }
            c735360Ssw.LJJLI = i2;
            c735360Ssw.LJZ = "homepage_nearby";
            C1359610lU7.LIZIZ(aweme, c735360Ssw);
            C735370Ssx.LIZJ(aweme);
            if (aweme == null) {
                aid = null;
            } else {
                aid = aweme.getAid();
            }
            C1380890m2R.LIZIZ(c735360Ssw, aid);
            Object objLJIIIZ = c19651011uW.LJIIIZ(aweme, c735360Ssw);
            C735840Sti.LIZIZ(aweme, objLJIIIZ);
            C735360Ssw c735360Ssw2 = (C735360Ssw) c1370890lmJ.appendCreationParams(objLJIIIZ, aweme);
            c735360Ssw2.LIZIZ(C666580QCq.LIZIZ(aweme, "like", "homepage_nearby", null));
            c735360Ssw2.LIZLLL(LIZIZ(zLJ, zLIZLLL), "is_distance_shown");
            if (!LIZJ(aweme)) {
                i3 = 0;
            }
            c735360Ssw2.LIZLLL(i3, "is_poi_anchor_shown");
            C1D0F c1d0f = C1D0F.LIZ;
            c735360Ssw2.LJI(c1d0f.LIZ(), c1d0f.isConnected());
            c735360Ssw2.LJFF(c1d0f.LIZIZ(), c1d0f.LIZJ(), InterfaceC1210900hcG.LIZ);
            c735360Ssw2.LJIILJJIL();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("something wrong with mobClickLikeOfNearbyCard, exception=");
            sbLIZ.append(e);
            C2188811AlT.LIZIZ(sbLIZ);
        }
    }

    public static void LJII(Aweme aweme, String str) {
        boolean zLIZLLL = LIZLLL(aweme);
        boolean zLJ = LJ(aweme);
        C735360Ssw c735360Ssw = new C735360Ssw("like_cancel");
        c735360Ssw.LIZLLL = "homepage_nearby";
        c735360Ssw.LJL = "click_card_like";
        c735360Ssw.LJJLIIIJJIZ = 7;
        c735360Ssw.LLIIIL = CardStruct.IStatusCode.DEFAULT;
        c735360Ssw.LLIIIZ = str;
        c735360Ssw.LJIJI(aweme);
        c735360Ssw.LIZIZ(C666580QCq.LIZIZ(aweme, "like_cancel", "homepage_nearby", null));
        c735360Ssw.LIZLLL(LIZIZ(zLJ, zLIZLLL), "is_distance_shown");
        c735360Ssw.LIZLLL(LIZJ(aweme) ? 1 : 0, "is_poi_anchor_shown");
        c735360Ssw.LJIILJJIL();
    }

    public static void LJIIIIZZ(Aweme aweme, String str, String str2) {
        boolean zLIZLLL = LIZLLL(aweme);
        boolean zLJ = LJ(aweme);
        C735840Sti c735840Sti = C735840Sti.LIZ;
        C19651011uW c19651011uW = C19651011uW.LIZIZ;
        C735410St1 c735410St1 = new C735410St1();
        c735410St1.LIZLLL = "homepage_nearby";
        c735410St1.LJJZZIII = "homepage_nearby";
        c735410St1.LJJLIIIJILLIZJL = str;
        c735410St1.LJIJI(aweme);
        c735410St1.LLIIJI = str2;
        Object objLJIIIZ = c19651011uW.LJIIIZ(aweme, c735410St1);
        c735840Sti.getClass();
        C735840Sti.LIZIZ(aweme, objLJIIIZ);
        AbstractC1386130mAt abstractC1386130mAt = (AbstractC1386130mAt) objLJIIIZ;
        abstractC1386130mAt.LIZLLL(LIZIZ(zLJ, zLIZLLL), "is_distance_shown");
        abstractC1386130mAt.LIZLLL(LIZJ(aweme) ? 1 : 0, "is_poi_anchor_shown");
        abstractC1386130mAt.LJIILJJIL();
    }

    public static void LJIIIZ(Integer num, Long l, String str) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("page_name", "nearby");
        c2344009Gk.LJIIIIZZ(Scene.SCENE_SERVICE, str);
        c2344009Gk.LJ(l, "page");
        c2344009Gk.LJ(num, "count");
        C20684815ws.LJIILLIIL("local_service_show_dual_ball", c2344009Gk.LIZ);
    }

    public static void LJIIJ(Integer num, Long l, String str) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("page_name", "nearby");
        c2344009Gk.LJIIIIZZ(Scene.SCENE_SERVICE, str);
        c2344009Gk.LJIIIIZZ("request_method", "load_more");
        c2344009Gk.LJ(l, "page");
        c2344009Gk.LJ(num, "count");
        C20684815ws.LJIILLIIL("local_service_try_to_request", c2344009Gk.LIZ);
    }
}
