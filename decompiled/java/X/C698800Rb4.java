package X;

import android.text.TextUtils;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.service.IFeedDebugService;
import com.ss.android.ugc.feed.platform.componentmanager.data.FeedComponentPriorityData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Rb4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C698800Rb4 {
    public static final C698800Rb4 LIZ = new C698800Rb4();
    public static final List<String> LIZIZ = new ArrayList();
    public static String LIZJ;
    public static String LIZLLL;
    public static final Set<String> LJ;

    static {
        Set<String> setLJJIJIIJIL = C2277711EDh.LIZIZ.LJJIJIIJIL();
        if (setLJJIJIIJIL == null) {
            setLJJIJIIJIL = (Set) C700620Re0.LIZ.getValue();
        }
        LJ = setLJJIJIIJIL;
    }

    public static final String LJ(C690870R8b c690870R8b) {
        String str;
        String strLIZ;
        String strLIZLLL;
        String str2;
        String str3;
        String str4;
        C2189821An6 c2189821An6;
        C0RJN c0rjnLIZIZ = c690870R8b.LIZIZ();
        String str5 = null;
        if (c0rjnLIZIZ != null) {
            str = c0rjnLIZIZ.LIZ;
        } else {
            str = null;
        }
        C0RJN c0rjnLIZIZ2 = c690870R8b.LIZIZ();
        if (c0rjnLIZIZ2 != null) {
            strLIZ = C1389300mG0.LIZ(c0rjnLIZIZ2);
        } else {
            strLIZ = null;
        }
        C0RJN c0rjnLIZIZ3 = c690870R8b.LIZIZ();
        if (c0rjnLIZIZ3 != null) {
            strLIZLLL = C1389300mG0.LIZLLL(c0rjnLIZIZ3);
        } else {
            strLIZLLL = null;
        }
        if (!Intrinsics.LJFF(strLIZ, "personal_homepage") && !Intrinsics.LJFF(strLIZ, "others_homepage")) {
            if (!Intrinsics.LJFF(strLIZLLL, "from_profile_other") || !Intrinsics.LJFF(strLIZ, "collection_video")) {
                C0RJN c0rjnLIZIZ4 = c690870R8b.LIZIZ();
                if (c0rjnLIZIZ4 != null && (c2189821An6 = c0rjnLIZIZ4.LIZJ) != null && c2189821An6.isMyProfile()) {
                    return "PROFILE";
                }
                C0RJN c0rjnLIZIZ5 = c690870R8b.LIZIZ();
                if (c0rjnLIZIZ5 != null) {
                    str2 = c0rjnLIZIZ5.LIZ;
                } else {
                    str2 = null;
                }
                if (!Intrinsics.LJFF(str2, "Playmode New")) {
                    if (c0rjnLIZIZ5 != null) {
                        str3 = c0rjnLIZIZ5.LIZ;
                    } else {
                        str3 = null;
                    }
                    if (!Intrinsics.LJFF(str3, "Playmode Top")) {
                        if (c0rjnLIZIZ5 != null) {
                            str4 = c0rjnLIZIZ5.LIZ;
                        } else {
                            str4 = null;
                        }
                        if (!Intrinsics.LJFF(str4, "Playmode Moodboost")) {
                            if (Intrinsics.LJFF("from_footnote_feed", strLIZLLL)) {
                                return "DETAIL_FOOTNOTE";
                            }
                            C0RJN c0rjnLIZIZ6 = c690870R8b.LIZIZ();
                            if (c0rjnLIZIZ6 != null) {
                                str5 = c0rjnLIZIZ6.LIZ;
                            }
                            if (Intrinsics.LJFF(str5, "DETAIL_VIBE_FEED")) {
                                return "DETAIL_VIBE_FEED";
                            }
                            if (!Intrinsics.LJFF(strLIZ, "playlist") && !C1389300mG0.LJII(c690870R8b.LIZIZ())) {
                                return str;
                            }
                            return "DETAIL";
                        }
                        return "For You";
                    }
                    return "For You";
                }
                return "For You";
            }
            return "PROFILE";
        }
        return "PROFILE";
    }

    public static C2344009Gk LIZ(Aweme aweme, String str, C698810Rb5 c698810Rb5) {
        String genreType;
        String genreType2;
        String aid;
        String authorUid;
        Long lValueOf;
        String requestId;
        Music music;
        Integer numValueOf = null;
        if (aweme != null) {
            genreType = AwemeExtKt.getGenreType(aweme);
        } else {
            genreType = null;
        }
        if (!TextUtils.isEmpty(genreType)) {
            if (aweme != null) {
                genreType2 = AwemeExtKt.getGenreType(aweme);
            } else {
                genreType2 = null;
            }
        } else {
            genreType2 = "video";
        }
        C2344009Gk c2344009Gk = new C2344009Gk();
        if (aweme != null) {
            aid = aweme.getAid();
        } else {
            aid = null;
        }
        c2344009Gk.LJIIIIZZ("group_id", aid);
        if (aweme != null) {
            authorUid = AwemeExtKt.getAuthorUid(aweme);
        } else {
            authorUid = null;
        }
        c2344009Gk.LJIIIIZZ("author_id", authorUid);
        if (aweme != null && (music = aweme.getMusic()) != null) {
            lValueOf = Long.valueOf(music.getId());
        } else {
            lValueOf = null;
        }
        c2344009Gk.LJ(lValueOf, "music_id");
        if (aweme != null) {
            requestId = aweme.getRequestId();
        } else {
            requestId = null;
        }
        c2344009Gk.LJIIIIZZ("request_id", requestId);
        c2344009Gk.LJIIIIZZ("enter_from", str);
        c2344009Gk.LJIIIIZZ("enter_from", str);
        c2344009Gk.LJIIIIZZ("container_avoid_component_ids", C13LP.LJJLIIIJ(C13LP.LJJJJI(c698810Rb5.LIZIZ), ",", null, null, 0, null, null, 62));
        c2344009Gk.LJIIIIZZ("global_avoid_component_ids", C13LP.LJJLIIIJ(c698810Rb5.LIZJ, ",", null, null, 0, null, null, 62));
        c2344009Gk.LJIIIIZZ("avoid_component_ids", C13LP.LJJLIIIJ(c698810Rb5.LJ, ",", null, null, 0, null, null, 62));
        c2344009Gk.LJIIIIZZ("display_component_ids", C13LP.LJJLIIIJ(c698810Rb5.LIZLLL, ",", null, null, 0, null, null, 62));
        c2344009Gk.LJIIIIZZ("must_display_component_ids", C13LP.LJJLIIIJ(C13LP.LJJJJI(c698810Rb5.LJFF), ",", null, null, 0, null, null, 62));
        c2344009Gk.LJIIIIZZ("avoid_type", c698810Rb5.LJIILJJIL);
        for (Map.Entry entry : ((LinkedHashMap) c698810Rb5.LJIIL).entrySet()) {
            c2344009Gk.LJFF((String) entry.getKey(), (String) entry.getValue());
        }
        c2344009Gk.LJFF("server_avoid_component_ids", C13LP.LJJLIIIJ(c698810Rb5.LJIIJJI, ",", null, null, 0, null, null, 62));
        c2344009Gk.LJFF("server_avoid_component_ids_detail", c698810Rb5.LJIILIIL);
        c2344009Gk.LJFF("client_avoid_component_ids", C13LP.LJJLIIIJ(C13LP.LJJJJI(C13LP.LJJJJLI(c698810Rb5.LJIIIZ)), ",", null, null, 0, null, null, 62));
        c2344009Gk.LJFF("client_avoid_component_ids_detail", c698810Rb5.LJIIJ);
        c2344009Gk.LJFF("client_final_filter_avoid_component_ids", C13LP.LJJLIIIJ(c698810Rb5.LJI, ",", null, null, 0, null, null, 62));
        c2344009Gk.LJFF("rank_component_ids", C13LP.LJJLIIIJ(c698810Rb5.LJII, ",", null, null, 0, null, null, 62));
        c2344009Gk.LJFF("rerank_component_ids", C13LP.LJJLIIIJ(c698810Rb5.LJIIIIZZ, ",", null, null, 0, null, null, 62));
        if (aweme != null) {
            numValueOf = Integer.valueOf(aweme.getAwemeType());
        }
        c2344009Gk.LJ(numValueOf, "aweme_type");
        c2344009Gk.LJFF("aweme_genres", genreType2);
        return c2344009Gk;
    }

    public static String LIZIZ(C698800Rb4 c698800Rb4, FeedComponentPriorityData feedComponentPriorityData, List list) {
        c698800Rb4.getClass();
        if (feedComponentPriorityData != null && list != null) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                AnchorCommonStruct anchorCommonStruct = (AnchorCommonStruct) it2.next();
                linkedHashMap.put(anchorCommonStruct.getComponentKey(), anchorCommonStruct);
            }
            List<String> list2 = feedComponentPriorityData.priorityList;
            if (list2 != null) {
                for (String str : list2) {
                    if (linkedHashMap.containsKey(str)) {
                        return str;
                    }
                }
                return null;
            }
            return null;
        }
        return null;
    }

    public static String LIZJ(FeedComponentPriorityData feedComponentPriorityData, List list, EnumC697700RYi enumC697700RYi) {
        List<String> list2;
        Object obj;
        if (feedComponentPriorityData != null && (list2 = feedComponentPriorityData.priorityList) != null) {
            for (String str : list2) {
                switch (C697690RYh.LIZ[enumC697700RYi.ordinal()]) {
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                        obj = str;
                        break;
                    default:
                        obj = "";
                        break;
                }
                if (list != null && list.contains(obj)) {
                    return str;
                }
            }
        }
        return null;
    }

    public static void LJFF(Aweme aweme, String str, String str2, C698810Rb5 c698810Rb5) {
        if (!C700120RdC.LIZ(str) || c698810Rb5 == null) {
            return;
        }
        C20684815ws.LJIILLIIL("avoid_component", LIZ(aweme, str2, c698810Rb5).LIZ);
        IFeedDebugService iFeedDebugService = (IFeedDebugService) ServiceManager.get().getService(IFeedDebugService.class, false, false);
        if (iFeedDebugService != null) {
            iFeedDebugService.LIZJ();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x00bb, code lost:
    
        if (r2 != 0) goto L39;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00d4 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.Set] */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.util.LinkedHashSet] */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.util.ArrayList, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r2v7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String LIZLLL(java.lang.String r4, java.lang.String r5, com.ss.android.ugc.feed.platform.componentmanager.data.FeedComponentPriorityData r6, java.util.Map r7, X.EnumC697700RYi r8) {
        /*
            Method dump skipped, instruction units count: 232
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C698800Rb4.LIZLLL(java.lang.String, java.lang.String, com.ss.android.ugc.feed.platform.componentmanager.data.FeedComponentPriorityData, java.util.Map, X.0RYi):java.lang.String");
    }
}
