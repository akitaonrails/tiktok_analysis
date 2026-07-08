package X;

import Y.ARunnableS112S0100000_12;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.feed.model.VideoUrlModel;
import com.ss.android.ugc.aweme.model.PostModeDetailParams;
import com.ss.android.ugc.aweme.model.PostModeEntranceMechanism;
import com.ss.android.ugc.aweme.music.model.Music;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0TUA, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0TUA {
    public String LIZIZ;
    public boolean LIZJ;
    public Aweme LIZLLL;
    public String LJFF;
    public boolean LJI;
    public ARunnableS112S0100000_12 LJII;
    public final boolean LIZ = C295500Bi8.LIZ();
    public String LJ = "";

    public final void LIZ() {
        String str;
        Object c098200Yq;
        Object c098200Yq2;
        Object c098200Yq3;
        Video video;
        String str2;
        VideoUrlModel playAddr;
        List<String> urlList;
        Object c098200Yq4;
        UrlModel playUrl;
        List<String> urlList2;
        if (!this.LIZ || this.LIZJ || this.LJI) {
            return;
        }
        LIZIZ();
        Aweme aweme = this.LIZLLL;
        if (aweme == null || (str = this.LIZIZ) == null || str.length() == 0) {
            return;
        }
        String aid = aweme.getAid();
        Object obj = "";
        if (aid == null) {
            aid = "";
        }
        if (Intrinsics.LJFF(aid, str)) {
            this.LJI = true;
            ARunnableS112S0100000_12 aRunnableS112S0100000_12 = this.LJII;
            if (aRunnableS112S0100000_12 != null) {
                C799570VYd.LIZJ().removeCallbacks(aRunnableS112S0100000_12);
            }
            this.LJII = null;
            try {
                c098200Yq = C0XF5.LIZ().name();
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            if (C189200o6.m7isFailureimpl(c098200Yq)) {
                c098200Yq = "NONE";
            }
            try {
                c098200Yq2 = C912260Zqa.LIZIZ.getNqeNetworkLevel().LIZ.name();
                C189200o6.m2constructorimpl(c098200Yq2);
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                c098200Yq2 = new C098200Yq(th2);
                C189200o6.m2constructorimpl(c098200Yq2);
            }
            if (C189200o6.m7isFailureimpl(c098200Yq2)) {
                c098200Yq2 = "UNDEFINED";
            }
            try {
                c098200Yq3 = Boolean.valueOf(C036E.LIZ.LIZJ == C0O0L.AVAILABLE);
                C189200o6.m2constructorimpl(c098200Yq3);
            } catch (Throwable th3) {
                TryCatchGuardChecker.doCheck(th3);
                c098200Yq3 = new C098200Yq(th3);
                C189200o6.m2constructorimpl(c098200Yq3);
            }
            Boolean bool = Boolean.FALSE;
            if (C189200o6.m7isFailureimpl(c098200Yq3)) {
                c098200Yq3 = bool;
            }
            boolean zBooleanValue = ((Boolean) c098200Yq3).booleanValue();
            Music music = aweme.getMusic();
            if ((music == null || (playUrl = music.getPlayUrl()) == null || (urlList2 = playUrl.getUrlList()) == null || (str2 = (String) C13LP.LJJJLL(urlList2)) == null) && ((video = aweme.getVideo()) == null || (playAddr = video.getPlayAddr()) == null || (urlList = playAddr.getUrlList()) == null || (str2 = (String) C13LP.LJJJLL(urlList)) == null)) {
                str2 = "";
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.putOpt("group_id", aweme.getAid());
            jSONObject.put("enter_from", this.LJ);
            jSONObject.putOpt("enter_method", this.LJFF);
            jSONObject.put("aweme_type", aweme.getAwemeType());
            String requestId = aweme.getRequestId();
            if (requestId == null) {
                requestId = "";
            }
            jSONObject.put("request_id", requestId);
            jSONObject.put("play_error_code", "");
            jSONObject.put("play_error_reason", "");
            jSONObject.put("network_type", c098200Yq);
            jSONObject.put("net_speed_level", c098200Yq2);
            jSONObject.put("is_network_available", zBooleanValue ? 1 : 0);
            jSONObject.put("play_status", "not_played");
            jSONObject.put("stay_duration", 0L);
            jSONObject.put("not_played_reason", "render_pending");
            jSONObject.put("is_no_network", !zBooleanValue ? 1 : 0);
            jSONObject.put("is_quick_leave", 1);
            jSONObject.put("is_player_error", 0);
            jSONObject.put("is_render_pending", 1);
            jSONObject.put("is_others", 0);
            jSONObject.put("play_url", str2);
            if (str2.length() != 0) {
                try {
                    c098200Yq4 = UriProtector.parse(str2).getHost();
                    if (c098200Yq4 == null) {
                        c098200Yq4 = "";
                    }
                    C189200o6.m2constructorimpl(c098200Yq4);
                } catch (Throwable th4) {
                    TryCatchGuardChecker.doCheck(th4);
                    c098200Yq4 = new C098200Yq(th4);
                    C189200o6.m2constructorimpl(c098200Yq4);
                }
                if (!C189200o6.m7isFailureimpl(c098200Yq4)) {
                    obj = c098200Yq4;
                }
            }
            jSONObject.put("play_url_host", obj);
            jSONObject.put("is_preview_light", 1);
            jSONObject.put("is_single_activity", 0);
            C20684815ws.LJIJ("explore_card_play_attribution", jSONObject);
        }
    }

    public final void LIZIZ() {
        VideoItemParams videoItemParams;
        String str;
        PostModeEntranceMechanism postModeEntranceMechanism;
        if (this.LIZLLL != null || (videoItemParams = C0TUE.LIZ) == null || (str = this.LIZIZ) == null || str.length() == 0) {
            return;
        }
        String aid = videoItemParams.getAweme().getAid();
        if (aid == null) {
            aid = "";
        }
        if (Intrinsics.LJFF(aid, str)) {
            this.LIZLLL = videoItemParams.getAweme();
            String str2 = videoItemParams.mEventType;
            this.LJ = str2 != null ? str2 : "";
            PostModeDetailParams postModeDetailParams = C0TUE.LIZIZ;
            this.LJFF = (postModeDetailParams == null || (postModeEntranceMechanism = postModeDetailParams.postModeEntranceMechanism) == null) ? null : postModeEntranceMechanism.getValue();
        }
    }
}
