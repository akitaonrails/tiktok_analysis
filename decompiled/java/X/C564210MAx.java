package X;

import android.app.Activity;
import android.os.Bundle;
import com.ss.android.ugc.aweme.creative.model.music.AVMusic;
import com.ss.android.ugc.aweme.services.external.ui.PhotoMvAnchorConfig;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoActivity;
import lth.o;

/* JADX INFO: renamed from: X.0MAx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C564210MAx implements InterfaceC564220MAy {
    public final /* synthetic */ Activity LIZ;
    public final /* synthetic */ PhotoMvAnchorConfig LIZIZ;
    public final /* synthetic */ ShortVideoContext LIZJ;

    public final void LIZ() {
        if (this.LIZ != null) {
            Bundle bundle = new Bundle();
            C530750Krh.LIZIZ(this.LIZ);
            bundle.putInt("key_support_flag", 2);
            bundle.putInt("key_photo_select_min_count", 1);
            bundle.putInt("key_photo_select_max_count", 35);
            C786410Ut5.LJJIZ(bundle, "key_music_model", this.LIZIZ.getMusicModel());
            bundle.putInt("key_choose_scene", 9);
            C786410Ut5.LJJIJL(bundle, "key_short_video_context", this.LIZJ);
            bundle.putLong("invoke_uploadpage_time", System.currentTimeMillis());
            AVMusic aVMusicTransformMusicModel = o.LJI.transformMusicModel(this.LIZIZ.getMusicModel());
            C1452640nuA.LJI(aVMusicTransformMusicModel);
            C786410Ut5.LJJIZ(bundle, "aweme_music", aVMusicTransformMusicModel);
            Activity activity = this.LIZ;
            String str = MvChoosePhotoActivity._pnsPageId;
            C0L0F.LIZLLL(activity, bundle, 1);
        }
    }

    public C564210MAx(Activity activity, PhotoMvAnchorConfig photoMvAnchorConfig, ShortVideoContext shortVideoContext) {
        this.LIZ = activity;
        this.LIZIZ = photoMvAnchorConfig;
        this.LIZJ = shortVideoContext;
    }
}
