package X;

import android.view.View;
import com.ss.android.ugc.aweme.commercialize.media.api.service.ICommerceMediaService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.music.model.MusicThemeTag;
import com.ss.android.ugc.aweme.services.uikit.CreativeToastBuilder;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.aweme.shortvideo.model.VideoMusicModel;
import com.ss.android.ugc.aweme.tools.music.music.vertical.player.VideoPlayerComponent;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.155O, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class C155O extends C155N {
    public final C155H LJII;
    public final EnumC1654750tA9 LJIIIIZZ;
    public final AbstractC204621154x LJIIIZ;
    public final C155W LJIIJ;
    public final VideoPlayerComponent LJIIJJI;
    public final MusicThemeTag LJIIL;

    @Override // X.C155N, X.AnonymousClass1297
    public final void LJIILJJIL(VideoMusicModel videoMusicModel) {
        String aid;
        Aweme aweme;
        if (videoMusicModel == null) {
            return;
        }
        VideoMusicModel videoMusicModel2 = this.LJIIJJI.LLILZLL;
        if (videoMusicModel2 != null && (aweme = videoMusicModel2.getAweme()) != null) {
            aid = aweme.getAid();
        } else {
            aid = null;
        }
        if (Intrinsics.LJFF(aid, videoMusicModel.getAweme().getAid())) {
            VideoPlayerComponent.LJFF(this.LJIIJJI, null);
        }
    }

    @Override // X.C155N, X.AnonymousClass1297
    public final void LJI(VideoMusicModel videoMusicModel, int i) {
        String str;
        AbstractC204621154x abstractC204621154x = this.LJIIIZ;
        EnumC1654750tA9 enumC1654750tA9 = this.LJIIIIZZ;
        MusicThemeTag musicThemeTag = this.LJIIL;
        if (musicThemeTag != null) {
            str = musicThemeTag.key;
        } else {
            str = null;
        }
        abstractC204621154x.LJJIIZ(videoMusicModel, enumC1654750tA9, i, null, str);
    }

    @Override // X.C155N, X.AnonymousClass1297
    public final void LJIIIZ(int i, Aweme aweme) {
        String stringValue;
        if (((Number) C264900AZs.LIZ.getValue()).intValue() != 0) {
            C155Z c155z = this.LJII.LJIIL;
            MusicThemeTag musicThemeTag = this.LJIIL;
            if (musicThemeTag == null || (stringValue = musicThemeTag.key) == null) {
                stringValue = this.LJIIIIZZ.getStringValue();
            }
            c155z.LJIJJ(aweme, i, stringValue);
            return;
        }
        this.LJII.LJIIL.LJJIFFI();
    }

    @Override // X.C155N, X.AnonymousClass1297
    public final void LJIIJJI(VideoMusicModel videoMusicModel, int i) {
        this.LJIIJJI.LLILZIL = videoMusicModel;
        if (videoMusicModel != null) {
            this.LJIIIZ.LJJIJL(videoMusicModel);
            this.LJII.LJIIL.LJIILLIIL(i, videoMusicModel.getAweme());
        }
    }

    @Override // X.C155N, X.AnonymousClass1297
    public final void LJIILIIL(int i, View view) {
        MusicModel musicModel;
        VideoMusicModel videoMusicModel;
        Music music;
        List<MusicModel> data;
        C129L c129l = this.LJI;
        String str = null;
        if (c129l != null && (data = c129l.getData()) != null) {
            musicModel = (MusicModel) C13LP.LJJJLZIJ(i, data);
        } else {
            musicModel = null;
        }
        if (!(musicModel instanceof VideoMusicModel) || (videoMusicModel = (VideoMusicModel) musicModel) == null || (music = videoMusicModel.getMusicModel().getMusic()) == null) {
            return;
        }
        if (music.isCanNotReuse()) {
            CreativeToastBuilder creativeToastBuilder = new CreativeToastBuilder();
            creativeToastBuilder.messageRes(2131830669);
            C1390380mHk.LIZLLL(view, 3068, creativeToastBuilder);
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LJIIIIZZ("enter_from", "change_music_page");
            C20684815ws.LJIILLIIL("add_private_music", c2344009Gk.LIZ);
            return;
        }
        if (this.LJIIJJI.LIZLLL(videoMusicModel)) {
            if (!this.LJII.LJIL.invoke().booleanValue()) {
                return;
            }
            this.LJII.LJIILIIL.LIZJ(videoMusicModel.getMusicModel(), this.LJIIIIZZ.getStringValue(), i, null);
            VideoPlayerComponent.LJI(this.LJIIJJI);
            this.LJIIIZ.LJIIL(this.LJI, false, true, videoMusicModel.getMusicModel(), true);
            return;
        }
        ICommerceMediaService iCommerceMediaService = (ICommerceMediaService) PluggableExtentionKt.pluggableSpi$default(ICommerceMediaService.class, false, false, false, 14, null);
        if (iCommerceMediaService != null && iCommerceMediaService.LIZJ(music)) {
            CreativeToastBuilder creativeToastBuilder2 = new CreativeToastBuilder();
            creativeToastBuilder2.messageRes(2131837781);
            creativeToastBuilder2.isTuxToast(true);
            C1390380mHk.LIZLLL(view, 3008, creativeToastBuilder2);
            VideoPlayerComponent.LJI(this.LJIIJJI);
            this.LJIIIZ.LJIIL(this.LJI, false, true, videoMusicModel.getMusicModel(), true);
            return;
        }
        VideoPlayerComponent.LJII(this.LJIIJJI);
        VideoPlayerComponent.LJI(this.LJIIJJI);
        VideoPlayerComponent.LJFF(this.LJIIJJI, videoMusicModel);
        C129L c129l2 = this.LJI;
        if (c129l2 != null) {
            c129l2.LLLIILIL(i);
        }
        AbstractC204621154x abstractC204621154x = this.LJIIIZ;
        MusicModel musicModel2 = videoMusicModel.getMusicModel();
        EnumC1654750tA9 enumC1654750tA9 = this.LJIIIIZZ;
        MusicThemeTag musicThemeTag = this.LJIIL;
        if (musicThemeTag != null) {
            str = musicThemeTag.key;
        }
        abstractC204621154x.LJJIJIIJIL(i, musicModel2, enumC1654750tA9, true, null, true, str, videoMusicModel.getAweme());
    }

    public C155O(C155H c155h, EnumC1654750tA9 enumC1654750tA9, AbstractC204621154x abstractC204621154x, C155W c155w, VideoPlayerComponent videoPlayerComponent, InterfaceC1867560yhO interfaceC1867560yhO, MusicThemeTag musicThemeTag) {
        super(c155h, enumC1654750tA9, abstractC204621154x, c155w, interfaceC1867560yhO, musicThemeTag);
        this.LJII = c155h;
        this.LJIIIIZZ = enumC1654750tA9;
        this.LJIIIZ = abstractC204621154x;
        this.LJIIJ = c155w;
        this.LJIIJJI = videoPlayerComponent;
        this.LJIIL = musicThemeTag;
    }
}
