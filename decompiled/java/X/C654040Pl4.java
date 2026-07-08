package X;

import android.content.Context;
import android.net.Uri;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components.topbar.hub.viewmodel.SearchHubNativeViewModel;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.EntityCardTitle;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.GameInfo;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Pl4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C654040Pl4 {
    public static SearchHubNativeViewModel LIZ(Fragment fragment) {
        if (fragment == null) {
            return null;
        }
        try {
            return (SearchHubNativeViewModel) new ViewModelProvider(fragment).get(SearchHubNativeViewModel.class);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    public static void LIZIZ(Context context, EnumC654440Pli enumC654440Pli, EntityCardTitle entityCardTitle) {
        String searchResultId = entityCardTitle.getSearchResultId();
        C654080Pl8 c654080Pl8TryGetMobParams = entityCardTitle.tryGetMobParams();
        int i = entityCardTitle.titleStyle;
        String str = "";
        String str2 = null;
        if (i == EnumC654070Pl7.MUSIC.getType()) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("from_card_type", "entity_music_card");
            linkedHashMap.put("search_enter_position", "entity_music_card");
            linkedHashMap.put("enter_position", "entity_music_card");
            if (searchResultId != null) {
                linkedHashMap.put("search_result_id", searchResultId);
            }
            linkedHashMap.put("is_search_scene", "1");
            linkedHashMap.put("search_type", "general");
            C0PRC c0prc = (C0PRC) C0Q3E.LJI().Ph1().LIZJ();
            linkedHashMap.put("search_id", c0prc.LLILLL);
            linkedHashMap.put("search_keyword", c0prc.LLIZLLLIL);
            C651970Phj.LLILLL.getClass();
            C651980Phk.LJFF(linkedHashMap, false);
            String string = UUID.randomUUID().toString();
            Pair[] pairArr = new Pair[2];
            pairArr[0] = new Pair("is_music_chart", Integer.valueOf(entityCardTitle.isViralSong() ? 1 : 0));
            String str3 = entityCardTitle.searchSource;
            if (str3 != null) {
                str = str3;
            }
            pairArr[1] = new Pair("search_source", str);
            HashMap mapLJI = C2097608Jq.LJI(pairArr);
            C654050Pl5 c654050Pl5 = C654050Pl5.LIZ;
            String tokenType = EnumC654060Pl6.MUSIC.getTokenType();
            boolean zIsViralSong = entityCardTitle.isViralSong();
            c654050Pl5.getClass();
            C23250099c.LIZLLL(C817503Hh.LL, C0PEM.LIZJ, null, new C651600Ph8(searchResultId, tokenType, enumC654440Pli, string, zIsViralSong, null), 2);
            SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(context, "//music/detail");
            smartRouteBuildRoute.withParam(FollowStatusChangeMethod.PARAM_UID, searchResultId);
            smartRouteBuildRoute.withParam("extra_music_from", "general_search");
            smartRouteBuildRoute.withParam("process_id", string);
            smartRouteBuildRoute.withParam("previous_page_position", "entity_music_card");
            smartRouteBuildRoute.withParam("music_chart_shoot_params", mapLJI);
            smartRouteBuildRoute.open();
            return;
        }
        if (i == EnumC654070Pl7.GAME.getType()) {
            GameInfo gameInfo = entityCardTitle.gameInfo;
            if (gameInfo != null) {
                str2 = gameInfo.schema;
            }
            Uri uri = UriProtector.parse(str2);
            C645730PUl.LIZJ.LIZIZ.getClass();
            Map<String, String> mapLIZJ = C018G.LIZJ(str2);
            C0PRC c0prc2 = (C0PRC) C0Q3E.LJI().Ph1().LIZJ();
            HashMap map = (HashMap) mapLIZJ;
            ConcurrentHashMap concurrentHashMapLIZ = C178200mK.LIZ((String) map.get("log_extra"));
            C830490Whz c830490Whz = new C830490Whz();
            if (concurrentHashMapLIZ != null) {
                c830490Whz.putAll(concurrentHashMapLIZ);
            }
            c830490Whz.put("search_id", c0prc2.LLILLL);
            c830490Whz.put("search_result_id", searchResultId);
            String strLIZIZ = C178200mK.LIZIZ(c830490Whz);
            Uri.Builder builderClearQuery = uri.buildUpon().clearQuery();
            for (Map.Entry entry : map.entrySet()) {
                String str4 = (String) entry.getKey();
                String str5 = (String) entry.getValue();
                if (Intrinsics.LJFF(str4, "log_extra")) {
                    builderClearQuery.appendQueryParameter("log_extra", strLIZIZ);
                } else {
                    builderClearQuery.appendQueryParameter(str4, str5);
                }
            }
            ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).O5().LIZLLL(context, builderClearQuery.build().toString());
            return;
        }
        if (c654080Pl8TryGetMobParams == null) {
            return;
        }
        if (searchResultId == null) {
            searchResultId = "";
        }
        LIZJ(context, c654080Pl8TryGetMobParams, searchResultId, enumC654440Pli.getMobType(), entityCardTitle);
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0123  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZJ(android.content.Context r11, X.C654080Pl8 r12, java.lang.String r13, java.lang.String r14, com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.EntityCardTitle r15) {
        /*
            Method dump skipped, instruction units count: 389
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C654040Pl4.LIZJ(android.content.Context, X.0Pl8, java.lang.String, java.lang.String, com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.EntityCardTitle):void");
    }
}
