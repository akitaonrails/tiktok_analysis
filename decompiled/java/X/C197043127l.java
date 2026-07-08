package X;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.hybrid.spark.security.ThirdPartyBizCert;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.music.model.ExternalMusicInfo;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.127l, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C197043127l {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final Map<String, String> LJ;

    public C197043127l(String str, String str2, String str3, String str4, Map map) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = str3;
        this.LIZLLL = str4;
        this.LJ = map;
    }

    public final void LIZ(Context context, final ExternalMusicInfo externalMusicInfo, boolean z, String str, C630790Oof c630790Oof) {
        String str2;
        if (context != null) {
            String jumpUrl = externalMusicInfo.getJumpUrl();
            boolean z2 = true;
            if ((!TextUtils.isEmpty(externalMusicInfo.getJumpUrl())) && jumpUrl != null) {
                new C828330WeV(new ThirdPartyBizCert(402685956)).LIZIZ(context, jumpUrl, new InterfaceC828360WeY() { // from class: X.11We
                    @Override // X.InterfaceC828360WeY
                    public final void LIZ(Context context2, String str3) {
                        SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(context2, "aweme://webview/");
                        smartRouteBuildRoute.withParam("url", externalMusicInfo.getJumpUrl());
                        smartRouteBuildRoute.withParam("hide_nav_bar", false);
                        smartRouteBuildRoute.withParam("use_webview_title", true);
                        smartRouteBuildRoute.withParam("bundle_forbidden_jump", true);
                        smartRouteBuildRoute.open();
                    }
                }, null);
            }
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LJIIIIZZ("enter_from", "single_song");
            c2344009Gk.LJIIIIZZ("music_id", this.LIZIZ);
            C20684815ws.LJIILLIIL("click_listen_complete_entrance", c2344009Gk.LIZ);
            if (z) {
                HashMap map = new HashMap();
                map.put("music_id", externalMusicInfo.getPartnerSongId());
                map.put("music_from", externalMusicInfo.getPartnerName());
                map.put("process_id", this.LIZ);
                if (str == null) {
                    str = this.LIZIZ;
                }
                map.put("song_id", str);
                map.put("button_name", "play_full_song");
                map.put("group_id", this.LIZJ);
                map.put("from_action", this.LIZLLL);
                if (c630790Oof == null || !c630790Oof.isPgc()) {
                    z2 = false;
                }
                if (z2) {
                    str2 = "pgc_clip";
                } else {
                    str2 = "original_song";
                }
                map.put("from_music_type", str2);
                C20684815ws.LJIILLIIL("click_copyright_music", map);
            }
        }
    }
}
