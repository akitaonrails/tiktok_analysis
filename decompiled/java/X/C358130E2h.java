package X;

import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.creative.model.music.AVMusic;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0E2h, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editor.lightening.music.MusicDownLoadMonitor$monitorAIRecommendMusicDownloadFailed$1", f = "MusicDownLoadMonitor.kt", l = {}, m = "invokeSuspend")
public final class C358130E2h extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ Integer LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ AVMusic LLILZ;
    public final /* synthetic */ VideoPublishEditModel LLILZIL;
    public final /* synthetic */ String LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C358130E2h(Integer num, String str, String str2, AVMusic aVMusic, VideoPublishEditModel videoPublishEditModel, String str3, InterfaceC1364105Vn<? super C358130E2h> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = num;
        this.LLILLJJLI = str;
        this.LLILLL = str2;
        this.LLILZ = aVMusic;
        this.LLILZIL = videoPublishEditModel;
        this.LLILZLL = str3;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C358130E2h(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String str;
        String enterFrom;
        UrlModel urlModel;
        String uri;
        String musicId;
        C1C7U.LIZ("MusicDownLoadMonitor@b97d.monitorAIRecommendMusicDownloadFailed$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C0LAB c0lab = new C0LAB();
        VideoPublishEditModel videoPublishEditModel = this.LLILZIL;
        String str2 = this.LLILZLL;
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
        c0lab.LIZ(1, FollowStatusChangeMethod.PARAM_FOLLOW_STATUS);
        Integer num = this.LL;
        if (num != null) {
            c0lab.LIZ(num.intValue(), "error_code");
        }
        String str3 = this.LLILLJJLI;
        if (str3 != null) {
            c0lab.LJ("error_domain", str3);
        }
        String str4 = this.LLILLL;
        if (str4 != null) {
            c0lab.LJ("scenario", str4);
        }
        AVMusic aVMusic = this.LLILZ;
        if (aVMusic != null && (musicId = aVMusic.getMusicId()) != null) {
            c0lab.LJ("music_id", musicId);
        }
        AVMusic aVMusic2 = this.LLILZ;
        if (aVMusic2 != null) {
            c0lab.LIZ(aVMusic2.getDuration(), "music_duration");
        }
        AVMusic aVMusic3 = this.LLILZ;
        if (aVMusic3 != null && (urlModel = aVMusic3.playUrl) != null && (uri = urlModel.getUri()) != null) {
            c0lab.LJ("music_url", uri);
        }
        C20684815ws.LJIILLIIL("ai_recommend_music_download", c0lab.LIZ);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("MusicDownLoadMonitor@b97d.monitorAIRecommendMusicDownloadFailed$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
