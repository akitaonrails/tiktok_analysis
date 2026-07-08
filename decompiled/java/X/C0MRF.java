package X;

import Y.ARunnableS108S0100000_8;
import android.graphics.drawable.Animatable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.lighten.loader.SmartImageView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.creative.model.forward.ForwardMedia;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImageInfo;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImageUrlModel;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AwS126S0110000_8;
import kotlin.jvm.internal.AwS409S0200000_8;
import kotlin.jvm.internal.AwS552S0100000_8;

/* JADX INFO: renamed from: X.0MRF, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0MRF extends C0MRL {
    public int LLLF;
    public SmartImageView LLLFF;
    public SmartImageView LLLFFI;
    public int LLLFZ = 1;
    public final C01GW LLLI = C452501pT.LIZIZ(new AwS552S0100000_8(this, 683));
    public final BPEAHandler LLLII = new BPEAHandler(Looper.getMainLooper());
    public final ARunnableS108S0100000_8 LLLIIII = new ARunnableS108S0100000_8(this, 88);
    public final ARunnableS108S0100000_8 LLLIIIIL = new ARunnableS108S0100000_8(this, 89);

    @Override // X.C0MRR
    public final Integer LJJJLZIJ() {
        return null;
    }

    @Override // X.C0MRR
    public final String LLIIL() {
        return "image";
    }

    public final void LLLLLL() {
        this.LLLII.removeCallbacks(this.LLLIIIIL);
        C786410Ut5.LJLIIL(2000L, this.LLLII, this.LLLIIIIL);
    }

    public final float LLLLLLIL() {
        return ((Boolean) this.LLLI.getValue()).booleanValue() ? -this.LLJJIJIL : this.LLJJIJIL;
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
        return (forwardMedia == null || (photoModeImageInfo = forwardMedia.photoModeImageInfo) == null || (imageList = photoModeImageInfo.getImageList()) == null || (photoModeImageUrlModel = (PhotoModeImageUrlModel) C13LP.LJJJLZIJ(0, imageList)) == null || (urlModel = photoModeImageUrlModel.displayImageNoWatermark) == null || (urlList = urlModel.getUrlList()) == null || (str = (String) C13LP.LJJJLL(urlList)) == null) ? "" : str;
    }

    @Override // X.C0MRN, com.bytedance.scene.group.UserVisibleHintGroupScene, com.bytedance.scene.Scene
    public final void onDestroyView() {
        super.onDestroyView();
        this.LLLII.removeCallbacksAndMessages(null);
    }

    @Override // X.C0MRN, com.bytedance.scene.Scene
    public final void LLJJL(boolean z) throws Throwable {
        super.LLJJL(z);
        if (z) {
            LLLLLL();
            return;
        }
        this.LLLII.removeCallbacksAndMessages(null);
        this.LLLF = 0;
        LLLLLLJ(false);
        this.LLLIIII.run();
        SmartImageView smartImageView = this.LLLFF;
        if (smartImageView != null) {
            C786410Ut5.Tc(smartImageView, 0.0f);
        }
        SmartImageView smartImageView2 = this.LLLFFI;
        if (smartImageView2 == null) {
            return;
        }
        C786410Ut5.Tc(smartImageView2, LLLLLLIL());
    }

    public final void LLLLLLJ(final boolean z) {
        PhotoModeImageInfo photoModeImageInfo;
        List<PhotoModeImageUrlModel> imageList;
        PhotoModeImageUrlModel photoModeImageUrlModel;
        UrlModel urlModel;
        List<String> urlList;
        String str;
        ForwardMedia forwardMedia = this.LLJJJ;
        if (forwardMedia != null && (photoModeImageInfo = forwardMedia.photoModeImageInfo) != null && (imageList = photoModeImageInfo.getImageList()) != null && (photoModeImageUrlModel = (PhotoModeImageUrlModel) C13LP.LJJJLZIJ(0, imageList)) != null && (urlModel = photoModeImageUrlModel.displayImageNoWatermark) != null && (urlList = urlModel.getUrlList()) != null && (str = (String) C13LP.LJJJLZIJ(0, urlList)) != null) {
            C1331670kl3 c1331670kl3LJIIIZ = C1331660kl2.LJIIIZ(str);
            int i = this.LLJJIJIL;
            int i2 = this.LLJJIJIIJIL;
            c1331670kl3LJIIIZ.LJIIIIZZ = i;
            c1331670kl3LJIIIZ.LJIIIZ = i2;
            c1331670kl3LJIIIZ.LJJ(this.LLLFF);
            c1331670kl3LJIIIZ.LJJ = EnumC1338240kve.FIT_CENTER;
            c1331670kl3LJIIIZ.LJIIJ(new AbstractC1335900krs() { // from class: X.0MRG
                @Override // X.InterfaceC427850Gq7
                public final void cm(Uri uri, View view, Throwable th) {
                    if (z) {
                        C01TT.LIZLLL(new AwS409S0200000_8(this.LL, th, 91));
                    }
                }

                @Override // X.InterfaceC427850Gq7
                public final void Ad(Uri uri, View view, C428600GrK c428600GrK, Animatable animatable) {
                    C01TT.LIZLLL(new AwS126S0110000_8(this.LL, z, 5));
                }
            });
        }
    }

    @Override // X.C0MRN, X.AbstractC568240MQk, com.bytedance.scene.group.UserVisibleHintGroupScene, com.bytedance.scene.Scene
    public final void onActivityCreated(Bundle bundle) {
        int size;
        PhotoModeImageInfo photoModeImageInfo;
        List<PhotoModeImageUrlModel> imageList;
        ForwardMedia forwardMedia = this.LLJJJ;
        if (forwardMedia != null && (photoModeImageInfo = forwardMedia.photoModeImageInfo) != null && (imageList = photoModeImageInfo.getImageList()) != null) {
            size = imageList.size();
        } else {
            size = 0;
        }
        this.LLLFZ = Math.max(size, 1);
        this.LLLFF = (SmartImageView) findViewById(R.id.lqq);
        SmartImageView smartImageView = (SmartImageView) findViewById(R.id.lqr);
        this.LLLFFI = smartImageView;
        if (smartImageView != null) {
            smartImageView.setBackgroundColor(-16777216);
        }
        super.onActivityCreated(bundle);
        SmartImageView smartImageView2 = this.LLLFFI;
        if (smartImageView2 != null) {
            C786410Ut5.Tc(smartImageView2, LLLLLLIL());
        }
        LLLLIILL(true);
        LLLLLLJ(true);
        C786410Ut5.LJLIIL(1000L, this.LLLII, this.LLLIIII);
    }

    @Override // X.C0MRN, X.InterfaceC568350MQv
    public final void onStateChanged(boolean z) throws Throwable {
        super.onStateChanged(z);
        if (z) {
            this.LLLII.removeCallbacksAndMessages(null);
        } else {
            this.LLLIIII.run();
            LLLLLL();
        }
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, X.C19A3, com.bytedance.scene.Scene
    public final ViewGroup onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return (ViewGroup) C786410Ut5.Td(layoutInflater, R.layout.eqt, viewGroup, false);
    }
}
