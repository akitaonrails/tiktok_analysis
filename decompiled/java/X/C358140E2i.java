package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.creative.model.music.AVMusic;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.0E2i, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editor.lightening.music.MusicDownLoadMonitor$monitorAIRecommendMusicDownloadSuccess$1", f = "MusicDownLoadMonitor.kt", l = {}, m = "invokeSuspend")
public final class C358140E2i extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ long LLILLJJLI;
    public final /* synthetic */ Long LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ AVMusic LLILZIL;
    public final /* synthetic */ Long LLILZLL;
    public final /* synthetic */ String LLIZ;
    public final /* synthetic */ VideoPublishEditModel LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C358140E2i(String str, long j, Long l, String str2, AVMusic aVMusic, Long l2, String str3, VideoPublishEditModel videoPublishEditModel, InterfaceC1364105Vn<? super C358140E2i> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = str;
        this.LLILLJJLI = j;
        this.LLILLL = l;
        this.LLILZ = str2;
        this.LLILZIL = aVMusic;
        this.LLILZLL = l2;
        this.LLIZ = str3;
        this.LLIZLLLIL = videoPublishEditModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C358140E2i(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String str;
        String enterFrom;
        long length;
        UrlModel urlModel;
        String uri;
        String musicId;
        C1C7U.LIZ("MusicDownLoadMonitor@b97d.monitorAIRecommendMusicDownloadSuccess$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C0LAB c0lab = new C0LAB();
        VideoPublishEditModel videoPublishEditModel = this.LLIZLLLIL;
        String str2 = this.LL;
        String creationId = null;
        if (videoPublishEditModel != null) {
            str = videoPublishEditModel.mShootWay;
        } else {
            str = null;
        }
        c0lab.LJ("shoot_way", str);
        c0lab.LJ("content_source", C1428470nHB.LJIILIIL(videoPublishEditModel));
        c0lab.LJ("content_type", C1428470nHB.LJIILL(videoPublishEditModel));
        if (videoPublishEditModel != null) {
            enterFrom = videoPublishEditModel.getEnterFrom();
        } else {
            enterFrom = null;
        }
        c0lab.LJ("enter_from", enterFrom);
        if (videoPublishEditModel != null) {
            creationId = videoPublishEditModel.getCreationId();
        }
        c0lab.LJ("creation_id", creationId);
        c0lab.LJ("type", str2);
        c0lab.LIZ(0, FollowStatusChangeMethod.PARAM_FOLLOW_STATUS);
        if (Intrinsics.LJFF(this.LL, "normal")) {
            c0lab.LIZIZ(this.LLILLJJLI, "download_duration");
        } else if (Intrinsics.LJFF(this.LL, "stream") || Intrinsics.LJFF(this.LL, "player_stream")) {
            c0lab.LIZIZ(this.LLILLJJLI, "download_duration");
            Long l = this.LLILLL;
            if (l != null) {
                c0lab.LIZIZ(l.longValue(), "first_frame_duration");
            }
        }
        String str3 = this.LLILZ;
        if (str3 != null) {
            c0lab.LJ("scenario", str3);
        }
        AVMusic aVMusic = this.LLILZIL;
        if (aVMusic != null && (musicId = aVMusic.getMusicId()) != null) {
            c0lab.LJ("music_id", musicId);
        }
        AVMusic aVMusic2 = this.LLILZIL;
        if (aVMusic2 != null) {
            c0lab.LIZ(aVMusic2.getDuration(), "music_duration");
        }
        Long l2 = this.LLILZLL;
        if (l2 != null) {
            c0lab.LIZIZ(l2.longValue(), "video_duration");
        }
        String str4 = this.LLIZ;
        if (str4 != null) {
            try {
                length = new C0VSJ(str4).length();
            } catch (C564610MCl e) {
                TryCatchGuardChecker.doCheck(e);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("monitorAIRecommendMusicDownloadSuccess, getFileSize fail ");
                sbLIZ.append(e.getMessage());
                C2344809Gs.LIZLLL(6, "Music", C2188811AlT.LIZIZ(sbLIZ));
                length = -1;
            }
            c0lab.LIZIZ(length, "download_size");
        }
        AVMusic aVMusic3 = this.LLILZIL;
        if (aVMusic3 != null && (urlModel = aVMusic3.playUrl) != null && (uri = urlModel.getUri()) != null) {
            c0lab.LJ("music_url", uri);
        }
        C20684815ws.LJIILLIIL("ai_recommend_music_download", c0lab.LIZ);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("MusicDownLoadMonitor@b97d.monitorAIRecommendMusicDownloadSuccess$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
