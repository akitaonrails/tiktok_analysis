package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.n;
import com.google.gson.p;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeStatistics;
import com.ss.android.ugc.aweme.feed.model.Preload;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.ml.ab.SmartPreloadProfileV2Experiment$PreloadProfileMLModel;
import com.ss.android.ugc.aweme.ml.api.ISmartPreloadCommentV2Service;
import com.ss.android.ugc.aweme.ml.api.MLDataCenterService;
import com.ss.android.ugc.aweme.ml.api.SmartPreloadCommentV2Service;
import com.ss.android.ugc.aweme.ml.api.SmartPreloadProfileV2Service;
import java.util.HashMap;

/* JADX INFO: renamed from: X.0T2x, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C740490T2x {
    public static final C01GW<C740490T2x> LIZLLL = C452501pT.LIZ(EnumC452301pR.SYNCHRONIZED, new C740500T2y());
    public int LIZ;
    public boolean LIZIZ;
    public boolean LIZJ;

    public final boolean LIZ(String str, Aweme aweme, boolean z, boolean z2, InterfaceC739770T0d interfaceC739770T0d) {
        int i;
        float fLJIIJ;
        float fLJIIJ2;
        String str2;
        if (aweme == null || str == null) {
            return false;
        }
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        MLDataCenterService.Companion.getClass();
        C740510T2z feedTrackRangeInfo = C1349505Px.LIZ.getFeedTrackRangeInfo(aweme.getAid(), 5, true);
        if (feedTrackRangeInfo != null) {
            int i2 = 0;
            int i3 = 0;
            do {
                if (i3 >= 0 && i3 < feedTrackRangeInfo.LJ.size()) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("play_time_");
                    sbLIZ.append(i2);
                    map.put(C2188811AlT.LIZIZ(sbLIZ), ListProtector.get(feedTrackRangeInfo.LJ, i3));
                    i3++;
                } else {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("play_time_");
                    sbLIZ2.append(i2);
                    map.put(C2188811AlT.LIZIZ(sbLIZ2), 0);
                }
                i2++;
            } while (i2 < 5);
            map.put("finish_cnt", Integer.valueOf(feedTrackRangeInfo.LIZJ));
            map.put("like_cnt", Integer.valueOf(feedTrackRangeInfo.LIZ));
            map.put("head_cnt", Integer.valueOf(feedTrackRangeInfo.LIZLLL));
            map.put("follow_cnt", Integer.valueOf(this.LIZ));
            map.put("comment_cnt", Integer.valueOf(feedTrackRangeInfo.LIZIZ));
        }
        Video video = aweme.getVideo();
        if (video != null) {
            map.put("v_duration", Integer.valueOf(video.getVideoLength()));
        }
        map.put("is_ad", Integer.valueOf(aweme.isAd() ? 1 : 0));
        AwemeStatistics statistics = aweme.getStatistics();
        if (statistics != null) {
            map.put("v_comments", Long.valueOf(statistics.getCommentCount()));
            map.put("v_likes", Long.valueOf(statistics.getDiggCount()));
            map.put("v_vvs", Long.valueOf(statistics.getPlayCount()));
            map.put("v_shares", Long.valueOf(statistics.getShareCount()));
            map.put("v_downloads", Long.valueOf(statistics.getDownloadCount()));
        }
        map.put("follow_status", Integer.valueOf(AwemeExtKt.getFollowStatus(aweme)));
        map.put("cur_finish", Integer.valueOf(z ? 1 : 0));
        map.put("cur_like", Integer.valueOf(aweme.isLike() ? 1 : 0));
        if (AwemeExtKt.getFollowStatus(aweme) > 0) {
            i = 1;
        } else {
            i = 0;
        }
        map.put("cur_follow", Integer.valueOf(i));
        map.put("cur_favorite", Integer.valueOf(AwemeExtKt.isCollected(aweme) ? 1 : 0));
        if (z2) {
            map.put("cur_comment", Integer.valueOf(this.LIZIZ ? 1 : 0));
        }
        map.put("country", C1913880zu6.LIZ());
        try {
            Preload preload = aweme.getPreload();
            if (preload != null && (str2 = preload.predictConfig) != null) {
                new p();
                n nVarLJIILIIL = p.LIZJ(str2).LJIILIIL();
                fLJIIJ = nVarLJIILIIL.LJJIIZ("click_comment").LJIIJ();
                fLJIIJ2 = nVarLJIILIIL.LJJIIZ("head").LJIIJ();
            } else {
                fLJIIJ = 0.0f;
                fLJIIJ2 = 0.0f;
            }
            if (!z2) {
                fLJIIJ2 = fLJIIJ;
            }
            map.put("server_prob", Float.valueOf(fLJIIJ2));
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        if (interfaceC739770T0d != null) {
            map.put("cur_playtime", Long.valueOf(interfaceC739770T0d.getCurrentPosition()));
            map.put("cur_playtime_total", Long.valueOf(interfaceC739770T0d.getCurrentPosition() + (interfaceC739770T0d.te() * ((long) interfaceC739770T0d.s2()))));
        }
        if (z2) {
            SmartPreloadProfileV2Service.Companion.getClass();
            float fSmartJudge = C740110T1l.LIZ.smartJudge(aweme, map, map2);
            SmartPreloadProfileV2Experiment$PreloadProfileMLModel smartPreloadProfileV2Experiment$PreloadProfileMLModelLIZ = C740150T1p.LIZ();
            if (smartPreloadProfileV2Experiment$PreloadProfileMLModelLIZ == null || fSmartJudge < smartPreloadProfileV2Experiment$PreloadProfileMLModelLIZ.clientAIThreshold) {
                return false;
            }
            return true;
        }
        SmartPreloadCommentV2Service.Companion.getClass();
        ISmartPreloadCommentV2Service iSmartPreloadCommentV2Service = C0T1T.LIZ;
        if (iSmartPreloadCommentV2Service.smartJudge(str, aweme, map, map2) < iSmartPreloadCommentV2Service.getClientAIThreshold(str)) {
            return false;
        }
        return true;
    }
}
