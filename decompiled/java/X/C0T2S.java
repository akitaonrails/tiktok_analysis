package X;

import Y.ARunnableS23S0101000_12;
import android.content.Intent;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.feed.model.VideoUrlModel;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS556S0100000_12;
import kotlin.jvm.internal.AwS591S0100000_12;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0T2S, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0T2S {
    public final Function0<Intent> LIZ;
    public final Function0<Aweme> LIZIZ;
    public final Function0<Object> LIZJ;
    public final Function0<String> LIZLLL;
    public final Function0<Boolean> LJ;
    public final Function1<Runnable, Boolean> LJFF;
    public C0TU9 LJI;

    public final C0TUB LIZIZ() {
        String str;
        Video video;
        VideoUrlModel playAddr;
        String requestId;
        Video video2;
        Music music;
        UrlModel playUrl;
        List<String> urlList;
        VideoUrlModel playAddr2;
        List<String> urlList2;
        Intent intentInvoke = this.LIZ.invoke();
        String strLIZ = LIZ(intentInvoke, FollowStatusChangeMethod.PARAM_UID);
        String sourceId = null;
        if (strLIZ == null || !(!a0.LJJJIL(strLIZ))) {
            strLIZ = null;
        }
        Aweme awemeInvoke = this.LIZIZ.invoke();
        if (awemeInvoke == null || strLIZ == null || strLIZ.length() == 0 || !Intrinsics.LJFF(awemeInvoke.getAid(), strLIZ)) {
            awemeInvoke = null;
        }
        String str2 = "";
        if (awemeInvoke == null || (((video2 = awemeInvoke.getVideo()) == null || (playAddr2 = video2.getPlayAddr()) == null || (urlList2 = playAddr2.getUrlList()) == null || (str = (String) C13LP.LJJJLL(urlList2)) == null) && ((music = awemeInvoke.getMusic()) == null || (playUrl = music.getPlayUrl()) == null || (urlList = playUrl.getUrlList()) == null || (str = (String) C13LP.LJJJLL(urlList)) == null))) {
            str = "";
        }
        String strLIZ2 = LIZ(intentInvoke, "refer");
        if (strLIZ2 == null || !(true ^ a0.LJJJIL(strLIZ2))) {
            strLIZ2 = null;
        }
        boolean booleanExtra = this.LIZ.invoke().getBooleanExtra("from_explore_video_cell", false);
        if (strLIZ != null) {
            if (awemeInvoke != null && (video = awemeInvoke.getVideo()) != null && (playAddr = video.getPlayAddr()) != null) {
                sourceId = playAddr.getSourceId();
            }
        } else if (awemeInvoke != null) {
            strLIZ = awemeInvoke.getAid();
            if (awemeInvoke != null) {
                sourceId = playAddr.getSourceId();
            }
        } else {
            strLIZ = null;
        }
        if (strLIZ2 == null && (strLIZ2 = this.LIZLLL.invoke()) == null) {
            strLIZ2 = "";
        }
        boolean booleanExtra2 = intentInvoke.getBooleanExtra("from_explore_preview_light", false);
        boolean zBooleanValue = this.LJ.invoke().booleanValue();
        int awemeType = awemeInvoke != null ? awemeInvoke.getAwemeType() : 0;
        if (awemeInvoke != null && (requestId = awemeInvoke.getRequestId()) != null) {
            str2 = requestId;
        }
        return new C0TUB(booleanExtra, strLIZ, sourceId, str, strLIZ2, booleanExtra2, zBooleanValue, awemeType, str2, null, null, LIZ(intentInvoke, "from_explore_page"), Long.valueOf(intentInvoke.getLongExtra("explore_topic_id", 0L)), LIZ(intentInvoke, "explore_topic"), false);
    }

    public final void LIZJ(int i) {
        Object c098200Yq;
        C0TU9 c0tu9 = this.LJI;
        if (c0tu9 == null) {
            return;
        }
        try {
            c098200Yq = this.LIZJ.invoke();
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        C0N0Y c0n0y = null;
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        if (c098200Yq instanceof C0N0Y) {
            c0n0y = (C0N0Y) c098200Yq;
        }
        if (!c0tu9.LIZ(c0n0y) && i > 0) {
            this.LJFF.invoke(new ARunnableS23S0101000_12(i, this, 10));
        }
    }

    public static String LIZ(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    public C0T2S(AwS556S0100000_12 awS556S0100000_12, AwS556S0100000_12 awS556S0100000_122, AwS556S0100000_12 awS556S0100000_123, AwS556S0100000_12 awS556S0100000_124, AwS556S0100000_12 awS556S0100000_125, AwS591S0100000_12 awS591S0100000_12) {
        this.LIZ = awS556S0100000_12;
        this.LIZIZ = awS556S0100000_122;
        this.LIZJ = awS556S0100000_123;
        this.LIZLLL = awS556S0100000_124;
        this.LJ = awS556S0100000_125;
        this.LJFF = awS591S0100000_12;
    }
}
