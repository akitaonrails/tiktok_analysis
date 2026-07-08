package X;

import android.graphics.Bitmap;
import android.graphics.drawable.Animatable;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.lighten.loader.SmartImageView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.creative.model.forward.ForwardMedia;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImageInfo;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImageUrlModel;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AwS252S0300000_8;
import kotlin.jvm.internal.AwS409S0200000_8;
import kotlin.jvm.internal.AwS552S0100000_8;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0MR6, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0MR6 extends C0MRL {
    public SmartImageView LLLF;

    @Override // X.C0MRR
    public final Integer LJJJLZIJ() {
        return null;
    }

    @Override // X.C0MRR
    public final String LLIIL() {
        ForwardMedia forwardMedia = this.LLJJJ;
        return (forwardMedia == null || forwardMedia.localMedia == null) ? "image" : "album_photo";
    }

    @Override // X.C0MRR
    public final String getUrl() {
        PhotoModeImageInfo photoModeImageInfo;
        List<PhotoModeImageUrlModel> imageList;
        PhotoModeImageUrlModel photoModeImageUrlModel;
        UrlModel urlModel;
        List<String> urlList;
        String str;
        ForwardMedia forwardMedia = this.LLJJJ;
        return (forwardMedia == null || (photoModeImageInfo = forwardMedia.photoModeImageInfo) == null || (imageList = photoModeImageInfo.getImageList()) == null || (photoModeImageUrlModel = (PhotoModeImageUrlModel) C13LP.LJJJLL(imageList)) == null || (urlModel = photoModeImageUrlModel.displayImageNoWatermark) == null || (urlList = urlModel.getUrlList()) == null || (str = (String) C13LP.LJJJLL(urlList)) == null) ? "" : str;
    }

    @Override // X.C0MRN, X.AbstractC568240MQk, com.bytedance.scene.group.UserVisibleHintGroupScene, com.bytedance.scene.Scene
    public final void onActivityCreated(Bundle bundle) {
        String str;
        C1331670kl3 c1331670kl3LJIIIZ;
        List<PhotoModeImageUrlModel> imageList;
        PhotoModeImageUrlModel photoModeImageUrlModel;
        UrlModel urlModel;
        List<String> urlList;
        String str2;
        super.onActivityCreated(bundle);
        this.LLLF = (SmartImageView) findViewById(R.id.lqq);
        LLLLIILL(true);
        final ForwardMedia forwardMedia = this.LLJJJ;
        if (forwardMedia != null) {
            final C118300cf c118300cf = new C118300cf();
            MediaModel mediaModel = forwardMedia.localMedia;
            int iLIZLLL = 0;
            if (mediaModel != null) {
                String strLJFF = mediaModel.LJFF();
                MediaModel mediaModel2 = forwardMedia.localMedia;
                if (mediaModel2 != null) {
                    str2 = mediaModel2.mimeType;
                } else {
                    str2 = null;
                }
                if (Intrinsics.LJFF(str2, "image/heic")) {
                    iLIZLLL = C2477909nN.LIZLLL(strLJFF);
                }
                c118300cf.element = iLIZLLL;
                c1331670kl3LJIIIZ = C1331660kl2.LJIIIZ(strLJFF);
            } else {
                PhotoModeImageInfo photoModeImageInfo = forwardMedia.photoModeImageInfo;
                if (photoModeImageInfo == null || (imageList = photoModeImageInfo.getImageList()) == null || (photoModeImageUrlModel = (PhotoModeImageUrlModel) C13LP.LJJJLZIJ(0, imageList)) == null || (urlModel = photoModeImageUrlModel.displayImageNoWatermark) == null || (urlList = urlModel.getUrlList()) == null || (str = (String) C13LP.LJJJLZIJ(0, urlList)) == null) {
                    str = "";
                }
                c1331670kl3LJIIIZ = C1331660kl2.LJIIIZ(str);
            }
            int i = c118300cf.element;
            if (i != 0) {
                if (i % 180 == 90) {
                    int i2 = this.LLJJIJIIJIL;
                    int i3 = this.LLJJIJIL;
                    c1331670kl3LJIIIZ.LJIIIIZZ = i2;
                    c1331670kl3LJIIIZ.LJIIIZ = i3;
                } else {
                    int i4 = this.LLJJIJIL;
                    int i5 = this.LLJJIJIIJIL;
                    c1331670kl3LJIIIZ.LJIIIIZZ = i4;
                    c1331670kl3LJIIIZ.LJIIIZ = i5;
                }
                c1331670kl3LJIIIZ.LJJ = EnumC1338240kve.FIT_CENTER;
                c1331670kl3LJIIIZ.LJJII(new InterfaceC1331910klR() { // from class: X.0MR8
                    @Override // X.InterfaceC1331910klR
                    public final void onCanceled() {
                    }

                    @Override // X.InterfaceC1331910klR
                    public final void onProgress(float f) {
                    }

                    @Override // X.InterfaceC1331910klR
                    public final void LIZ(Bitmap bitmap) {
                        C01TT.LIZLLL(new AwS252S0300000_8(bitmap, this.LL, c118300cf, 24));
                    }

                    @Override // X.InterfaceC1331910klR
                    public final void onFailed(Throwable th) {
                        C01TT.LIZLLL(new AwS409S0200000_8(this.LL, th, 93));
                    }
                });
                return;
            }
            int i6 = this.LLJJIJIL;
            int i7 = this.LLJJIJIIJIL;
            c1331670kl3LJIIIZ.LJIIIIZZ = i6;
            c1331670kl3LJIIIZ.LJIIIZ = i7;
            c1331670kl3LJIIIZ.LJJ = EnumC1338240kve.FIT_CENTER;
            c1331670kl3LJIIIZ.LJJ(this.LLLF);
            c1331670kl3LJIIIZ.LJIIJ(new AbstractC1335900krs() { // from class: X.0MR7
                @Override // X.InterfaceC427850Gq7
                public final void cm(Uri uri, View view, Throwable th) {
                    String message;
                    C01TT.LIZLLL(new AwS409S0200000_8(this.LL, th, 94));
                    MediaModel mediaModel3 = forwardMedia.localMedia;
                    if (mediaModel3 != null) {
                        C0ML7 c0ml7 = C0ML7.LIZ;
                        ArrayList arrayListLJ = C1697810uHb.LJ(mediaModel3.mimeType);
                        if (th == null || (message = th.getMessage()) == null) {
                            message = "";
                        }
                        c0ml7.getClass();
                        C0ML7.LJIILIIL("local_image_load_error", message, arrayListLJ);
                    }
                }

                @Override // X.InterfaceC427850Gq7
                public final void Ad(Uri uri, View view, C428600GrK c428600GrK, Animatable animatable) {
                    C01TT.LIZLLL(new AwS552S0100000_8(this.LL, 685));
                }
            });
        }
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, X.C19A3, com.bytedance.scene.Scene
    public final ViewGroup onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return (ViewGroup) C786410Ut5.Td(layoutInflater, R.layout.erm, viewGroup, false);
    }
}
