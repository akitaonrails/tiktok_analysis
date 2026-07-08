package X;

import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.ChooseMediaViewModel;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoScene;
import java.util.ArrayList;

/* JADX INFO: renamed from: X.0Kdp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C522150Kdp implements InterfaceC524610Khn {
    public final /* synthetic */ MvChoosePhotoScene LL;

    public C522150Kdp(MvChoosePhotoScene mvChoosePhotoScene) {
        this.LL = mvChoosePhotoScene;
    }

    @Override // X.InterfaceC524610Khn
    public final void LJLIIIL(C523930Kgh c523930Kgh, boolean z) {
        ChooseMediaViewModel chooseMediaViewModel;
        if (c523930Kgh != null && (chooseMediaViewModel = this.LL.chooseMediaViewModel) != null) {
            chooseMediaViewModel.BR2(new ArrayList(c523930Kgh.LIZIZ()), true);
        }
        if (this.LL.enableLivePhoto()) {
            if (z) {
                C523290Kff.LIZ.getClass();
                C523290Kff.LIZIZ(true);
                MediaModel mediaModel = (MediaModel) C13LP.LJJJLL(c523930Kgh.LIZIZ());
                if (mediaModel != null) {
                    C523290Kff.LIZ().storeString("first_live_photo_item_uri_str", mediaModel.LJFF());
                }
            } else {
                C523290Kff.LIZ.getClass();
                C523290Kff.LIZIZ(false);
            }
            MvChoosePhotoScene mvChoosePhotoScene = this.LL;
            C534690Ky3.LIZJ(mvChoosePhotoScene.shortVideoContext, mvChoosePhotoScene.getAlbumUploadFinishParams(((ArrayList) c523930Kgh.LIZIZ()).size()));
        }
        C528320Knm c528320Knm = this.LL.chooseAllFragment;
        if (c528320Knm != null) {
            c528320Knm.LLLLLLJ();
        }
        C528310Knl c528310Knl = this.LL.mvChoosePhotoFragment;
        if (c528310Knl != null) {
            c528310Knl.LLLLLLJ();
        }
        C528340Kno c528340Kno = this.LL.chooseLivePhotoFragment;
        if (c528340Kno != null) {
            c528340Kno.LLLLLLJ();
        }
    }
}
