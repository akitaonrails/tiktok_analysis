package X;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdk.chatroom.api.SMBCourseVideo;
import com.bytedance.android.livesdk.comp.api.performance.IPerformanceService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.feed.model.VideoUrlModel;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.pcs.course.api.network.IPcsCourseApi;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0JMk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C490760JMk extends RecyclerView.ViewHolder implements C0JNP {
    public final C0JO7 LL;
    public C0JMR LLILLJJLI;
    public int LLILLL;
    public boolean LLILZ;
    public long LLILZIL;
    public long LLILZLL;
    public long LLIZ;
    public int LLIZLLLIL;
    public int LLJ;
    public int LLJI;
    public C1481290oeN LLJIJIL;
    public boolean LLJILJIL;

    @Override // X.C0JNP
    public final void JG() {
    }

    @Override // X.C0JNP
    public final void XI() {
    }

    @Override // X.C0JNP
    public final void jJ() {
    }

    @Override // X.C0JNP
    public final void Cq() {
        Video video;
        VideoUrlModel playAddr;
        C0JMR c0jmr = this.LLILLJJLI;
        if (c0jmr != null) {
            IPcsCourseApi.LIZ.getClass();
            IPcsCourseApi value = C490870JMv.LIZIZ.getValue();
            Pair[] pairArr = new Pair[5];
            pairArr[0] = new Pair("action_time", String.valueOf(System.currentTimeMillis()));
            Aweme awemeLIZIZ = c0jmr.LIZIZ();
            String sourceId = null;
            pairArr[1] = new Pair("aweme_type", String.valueOf(awemeLIZIZ != null ? Integer.valueOf(awemeLIZIZ.getAwemeType()) : null));
            pairArr[2] = new Pair("enter_from", "course");
            Aweme awemeLIZIZ2 = c0jmr.LIZIZ();
            if (awemeLIZIZ2 != null && (video = awemeLIZIZ2.getVideo()) != null && (playAddr = video.getPlayAddr()) != null) {
                sourceId = playAddr.getSourceId();
            }
            pairArr[3] = new Pair("item_id", sourceId);
            pairArr[4] = new Pair("play_delta", "1");
            C1808280x9m.LJFF(value.awemeStatsReport(C2097608Jq.LJIIIIZZ(pairArr)), "course", "/aweme/v1/aweme/stats/", AnonymousClass0207.get$arr$(56), 4).LJIILIIL(new C0UO0()).LJJLL(new C09JN() { // from class: X.00Oc
                @Override // X.C09JN
                public final /* bridge */ /* synthetic */ void accept(Object obj) {
                    C1C7U.LIZ("VideoPlayerViewHolder@1733.reportViewCount$1$2");
                    C1C7U.LIZIZ("VideoPlayerViewHolder@1733.reportViewCount$1$2");
                }
            }, new C09JN() { // from class: X.00Od
                @Override // X.C09JN
                public final /* bridge */ /* synthetic */ void accept(Object obj) {
                    C1C7U.LIZ("VideoPlayerViewHolder@1733.reportViewCount$1$3");
                    C1C7U.LIZIZ("VideoPlayerViewHolder@1733.reportViewCount$1$3");
                }
            });
        }
        this.LLJI++;
    }

    public final boolean I5() {
        C0JMR c0jmr = this.LLILLJJLI;
        return c0jmr != null && c0jmr.LIZJ();
    }

    @Override // X.C0JNP
    public final void K3() {
        C0JMR c0jmr = this.LLILLJJLI;
        C490770JMl.LIZLLL(c0jmr != null ? Long.valueOf(c0jmr.LIZ) : null, "click", "pause");
    }

    public final void L5() {
        this.LLILLL++;
        this.LLJILJIL = true;
        ((ArrayList) this.LL.LLIZLLLIL).add(this);
        C0JMR c0jmr = this.LLILLJJLI;
        if (c0jmr != null) {
            long j = c0jmr.LIZ;
            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_service_plus_course_play_start");
            c474500IjALIZ.LJJII(C490770JMl.LIZ("anchor_id"), "anchor_id");
            c474500IjALIZ.LJJII(C490770JMl.LIZ("enter_from"), "enter_from");
            c474500IjALIZ.LJJII(C490770JMl.LIZ("course_id"), "course_id");
            c474500IjALIZ.LJJII(Long.valueOf(j), "video_id");
            c474500IjALIZ.LIZ();
        }
    }

    @Override // X.C0JNP
    public final void LLLLILI() {
        if (this.LLJILJIL) {
            this.LLJILJIL = false;
            if (this.LLILLJJLI != null) {
                this.LLILZIL = System.currentTimeMillis();
            }
        }
    }

    public final void N5() {
        SMBCourseVideo sMBCourseVideo;
        String str;
        Aweme awemeLIZLLL;
        Video video;
        ((ArrayList) this.LL.LLIZLLLIL).remove(this);
        C0JMR c0jmr = this.LLILLJJLI;
        if (c0jmr == null || (sMBCourseVideo = c0jmr.LIZIZ) == null || (str = sMBCourseVideo.awemeStructStr) == null || (awemeLIZLLL = C490750JMj.LIZLLL(str)) == null || (video = awemeLIZLLL.getVideo()) == null) {
            return;
        }
        if (this.LL.LLILZIL.LJ.getValue().LIZ && this.LLILZIL != -1) {
            this.LLILZLL += System.currentTimeMillis() - this.LLILZIL;
        }
        if (this.LLIZ != -1) {
            this.LLJ = (int) (System.currentTimeMillis() - this.LLIZ);
        }
        long j = c0jmr.LIZ;
        long j2 = this.LLILZLL;
        long j3 = c0jmr.LIZIZ.videoDuration;
        long j4 = LSPassThroughRecordSizeConfig.DEFAULT;
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_service_plus_course_play_duration");
        c474500IjALIZ.LJJII(C490770JMl.LIZ("anchor_id"), "anchor_id");
        c474500IjALIZ.LJJII(C490770JMl.LIZ("enter_from"), "enter_from");
        c474500IjALIZ.LJJII(C490770JMl.LIZ("course_id"), "course_id");
        c474500IjALIZ.LJJII(Long.valueOf(j), "video_id");
        c474500IjALIZ.LJJII(Long.valueOf(j2 / j4), "play_duration");
        c474500IjALIZ.LJJII(Long.valueOf(j3 / j4), "video_length");
        c474500IjALIZ.LIZ();
        long j5 = c0jmr.LIZ;
        long j6 = c0jmr.LIZIZ.videoDuration / j4;
        int i = this.LLJI;
        long j7 = this.LLILZLL / j4;
        C0JNK player = this.LL.getPlayer();
        float fLIZIZ = player != null ? player.LIZIZ(video.getAid()) : 0.0f;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(video.getWidth());
        sbLIZ.append('x');
        sbLIZ.append(video.getHeight());
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        int i2 = this.LLJ / LSPassThroughRecordSizeConfig.DEFAULT;
        int i3 = this.LLIZLLLIL;
        boolean z = this.LLJIJIL != null;
        C13DA c13da = new C13DA();
        c13da.put("buffering_duration", Integer.valueOf(i2));
        c13da.put("buffering_count", Integer.valueOf(i3));
        c13da.put("playback_error", z ? "1" : CardStruct.IStatusCode.DEFAULT);
        c13da.put("playback_count", Integer.valueOf(i));
        c13da.put("play_duration", Long.valueOf(j7));
        c13da.put("video_length", Long.valueOf(j6));
        c13da.put("bit_rate", Float.valueOf(fLIZIZ));
        c13da.put("resolution", strLIZIZ);
        c13da.putAll(C490770JMl.LIZJ(j5));
        Map mapBuild = c13da.build();
        C474500IjA c474500IjALIZ2 = C0IJT.LIZ("livesdk_pcs_course_video_player_play_result");
        for (Map.Entry entry : mapBuild.entrySet()) {
            c474500IjALIZ2.LJJII(entry.getValue(), (String) entry.getKey());
        }
        c474500IjALIZ2.LIZ();
        this.LLILZLL = 0L;
        this.LLILZIL = -1L;
        this.LLIZLLLIL = 0;
        this.LLJ = 0;
        this.LLIZ = -1L;
        this.LLJI = 0;
        this.LLJIJIL = null;
    }

    @Override // X.C0JNP
    public final void Pa() {
        C0JMR c0jmr = this.LLILLJJLI;
        C490770JMl.LIZLLL(c0jmr != null ? Long.valueOf(c0jmr.LIZ) : null, "click", "resume");
    }

    public final Aweme getAweme() {
        C0JMR c0jmr = this.LLILLJJLI;
        if (c0jmr != null) {
            return c0jmr.LIZIZ();
        }
        return null;
    }

    @Override // X.C0JNP
    public final void onPlayerPause() {
        if (this.LLILZIL != -1) {
            this.LLILZLL += System.currentTimeMillis() - this.LLILZIL;
        }
    }

    @Override // X.C0JNP
    public final void v8() {
        C0JMR c0jmr = this.LLILLJJLI;
        C490770JMl.LIZLLL(c0jmr != null ? Long.valueOf(c0jmr.LIZ) : null, "click", "slide");
    }

    public C490760JMk(View view) {
        super(view);
        this.LL = (C0JO7) view.findViewById(R.id.video_player);
        this.LLILZIL = -1L;
        this.LLIZ = -1L;
        this.LLJILJIL = true;
    }

    @Override // X.C0JNP
    public final void re(boolean z) {
        boolean z2;
        if (this.LLIZ != -1) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2 == z) {
            return;
        }
        if (z) {
            this.LLIZ = System.currentTimeMillis();
            this.LLIZLLLIL++;
        } else {
            this.LLJ += (int) ((System.currentTimeMillis() - this.LLIZ) / ((long) LSPassThroughRecordSizeConfig.DEFAULT));
            this.LLIZ = -1L;
        }
    }

    @Override // X.C0JNP
    public final void IO(C1481290oeN c1481290oeN, float f) {
        SMBCourseVideo sMBCourseVideo;
        String str;
        Aweme awemeLIZLLL;
        Video video;
        Integer numValueOf;
        String string;
        C1101180elI c1101180elI;
        Map<String, C491530JPj> map;
        C491530JPj c491530JPj;
        this.LLJIJIL = c1481290oeN;
        C0JMR c0jmr = this.LLILLJJLI;
        if (c0jmr != null && (sMBCourseVideo = c0jmr.LIZIZ) != null && (str = sMBCourseVideo.awemeStructStr) != null && (awemeLIZLLL = C490750JMj.LIZLLL(str)) != null && (video = awemeLIZLLL.getVideo()) != null) {
            long j = c0jmr.LIZ;
            int videoLength = video.getVideoLength() / LSPassThroughRecordSizeConfig.DEFAULT;
            if (c1481290oeN != null) {
                numValueOf = Integer.valueOf(c1481290oeN.LJ);
            } else {
                numValueOf = null;
            }
            String strValueOf = String.valueOf(numValueOf);
            String strValueOf2 = String.valueOf(c1481290oeN);
            C13DA c13da = new C13DA();
            c13da.put("error_code", strValueOf);
            c13da.put("error_message", strValueOf2);
            c13da.put("progress", Float.valueOf(f));
            c13da.put("video_length", Integer.valueOf(videoLength));
            c13da.putAll(C490770JMl.LIZJ(j));
            C1100750ekb c1100750ekbJM = ((IPerformanceService) C1161920gLG.LIZJ(IPerformanceService.class)).jM();
            C13DA c13da2 = new C13DA();
            C516900KOy.LIZ(c13da2);
            if (c1100750ekbJM == null || (c1101180elI = c1100750ekbJM.LIZ) == null || (map = c1101180elI.LIZJ) == null || (c491530JPj = map.get("fps")) == null || (string = Float.valueOf(c491530JPj.LIZIZ).toString()) == null) {
                string = "";
            }
            c13da2.put("fps", string);
            c13da.putAll(c13da2.build());
            Map mapBuild = c13da.build();
            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_pcs_course_video_player_playback_error");
            for (Map.Entry entry : mapBuild.entrySet()) {
                c474500IjALIZ.LJJII(entry.getValue(), (String) entry.getKey());
            }
            c474500IjALIZ.LIZ();
        }
    }
}
