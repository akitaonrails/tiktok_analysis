package X;

import android.graphics.SurfaceTexture;
import android.os.Bundle;
import android.util.Size;
import android.view.LayoutInflater;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.lighten.loader.SmartImageView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.creative.model.forward.ForwardMedia;
import com.ss.android.ugc.aweme.creative.model.forward.ForwardVideo;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.ttvideoengine.TTVideoEngine;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AwS286S0300000_8;

/* JADX INFO: renamed from: X.0MRJ, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0MRJ extends C0MRN {
    public TextureView LLLF;
    public Surface LLLFF;
    public SmartImageView LLLFFI;
    public View LLLFZ;
    public int LLLI;
    public int LLLII;
    public int LLLIIII;
    public int LLLIIIIL;

    @Override // X.C0MRR
    public final Integer LJJJLZIJ() {
        ForwardVideo forwardVideo;
        ForwardMedia forwardMedia = this.LLJJJ;
        if (forwardMedia == null || (forwardVideo = forwardMedia.video) == null) {
            return null;
        }
        return Integer.valueOf(forwardVideo.getSourceDuration());
    }

    @Override // X.C0MRR
    public final String LLIIL() {
        ForwardMedia forwardMedia = this.LLJJJ;
        return (forwardMedia == null || forwardMedia.localMedia == null) ? "video" : "album_video";
    }

    @Override // X.C0MRN
    public final void LLLLL() {
        SmartImageView smartImageView = this.LLLFFI;
        if (smartImageView != null) {
            C786410Ut5.LLFF(8, smartImageView);
        }
    }

    @Override // X.C0MRR
    public final String getUrl() {
        ForwardVideo forwardVideo;
        List<String> playAddressList;
        String str;
        ForwardMedia forwardMedia = this.LLJJJ;
        return (forwardMedia == null || (forwardVideo = forwardMedia.video) == null || (playAddressList = forwardVideo.getPlayAddressList()) == null || (str = (String) C13LP.LJJJLL(playAddressList)) == null) ? "" : str;
    }

    @Override // X.C0MRN
    public final boolean LLLLJ() {
        MediaModel mediaModel;
        LLLLJI();
        ForwardMedia forwardMedia = this.LLJJJ;
        if (forwardMedia == null || forwardMedia.localMedia == null) {
            return super.LLLLJ();
        }
        C0MRQ c0mrq = this.LLJL;
        if (forwardMedia == null || (mediaModel = forwardMedia.localMedia) == null) {
            "Required value was null.".toString();
            throw new IllegalArgumentException("Required value was null.");
        }
        c0mrq.LIZ.LJIJ(mediaModel.LJFF());
        return true;
    }

    @Override // X.C0MRN
    public final void LLLLILI() {
        super.LLLLILI();
    }

    @Override // X.C0MRN
    public final void LLLLLILLIL(TTVideoEngine tTVideoEngine) {
        int iLJJLJ;
        int iLJJLIIIJLLLLLLLZ;
        View view = this.LLLFZ;
        if (view != null) {
            view.setBackgroundColor(-16777216);
        }
        if (this.LLLF != null) {
            if (tTVideoEngine != null) {
                iLJJLJ = tTVideoEngine.LJJLJ();
            } else {
                iLJJLJ = 0;
            }
            this.LLLI = iLJJLJ;
            if (tTVideoEngine != null) {
                iLJJLIIIJLLLLLLLZ = tTVideoEngine.LJJLIIIJLLLLLLLZ();
            } else {
                iLJJLIIIJLLLLLLLZ = 0;
            }
            this.LLLII = iLJJLIIIJLLLLLLLZ;
            LLLLLJLJLL(this.LLLIIII, this.LLLIIIIL, this.LLLI, iLJJLIIIJLLLLLLLZ);
        }
        LLLLIILL(false);
        LLLLLIL(0, "");
    }

    @Override // X.C0MRN, X.AbstractC568240MQk, com.bytedance.scene.group.UserVisibleHintGroupScene, com.bytedance.scene.Scene
    public final void onActivityCreated(Bundle bundle) {
        String str;
        List<String> urlList;
        SmartImageView smartImageView;
        super.onActivityCreated(bundle);
        TextureView textureView = (TextureView) findViewById(R.id.video_view);
        this.LLLF = textureView;
        if (textureView != null) {
            textureView.setSurfaceTextureListener(new TextureView.SurfaceTextureListener() { // from class: X.0MRK
                @Override // android.view.TextureView.SurfaceTextureListener
                public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
                    return true;
                }

                @Override // android.view.TextureView.SurfaceTextureListener
                public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
                }

                @Override // android.view.TextureView.SurfaceTextureListener
                public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
                }

                @Override // android.view.TextureView.SurfaceTextureListener
                public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
                    C0MRJ c0mrj = this.LL;
                    c0mrj.LLLIIII = i;
                    c0mrj.LLLIIIIL = i2;
                    c0mrj.LLLLLJLJLL(i, i2, c0mrj.LLLI, c0mrj.LLLII);
                    C0MRJ c0mrj2 = this.LL;
                    if (c0mrj2.LLLFF == null) {
                        Surface surface = new Surface(surfaceTexture);
                        C0MRJ c0mrj3 = this.LL;
                        C0MRQ c0mrq = c0mrj3.LLJL;
                        c0mrq.getClass();
                        C0MRS c0mrs = C0MRS.LIZIZ;
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append(c0mrq.LIZ);
                        sbLIZ.append(" setSurface");
                        C201955140j.LJIILJJIL(c0mrs, C2188811AlT.LIZIZ(sbLIZ));
                        c0mrq.LIZ.setSurface(surface);
                        if (c0mrj3.isVisible()) {
                            c0mrj3.LLJL.LIZJ();
                        }
                        c0mrj2.LLLFF = surface;
                    }
                }
            });
        }
        this.LLLFZ = findViewById(R.id.deb);
        LLLLIILL(true);
        SmartImageView smartImageView2 = (SmartImageView) findViewById(R.id.lqq);
        this.LLLFFI = smartImageView2;
        if (smartImageView2 != null) {
            C786410Ut5.LLFF(0, smartImageView2);
        }
        SmartImageView smartImageView3 = this.LLLFFI;
        if (smartImageView3 != null) {
            smartImageView3.setBackgroundColor(-16777216);
        }
        ForwardMedia forwardMedia = this.LLJJJ;
        if (forwardMedia != null) {
            if (forwardMedia.localMedia != null) {
                if (forwardMedia != null && (smartImageView = this.LLLFFI) != null) {
                    MediaModel mediaModel = forwardMedia.localMedia;
                    if (mediaModel != null) {
                        Size size = new Size(this.LLJJIJIL, this.LLJJIJIIJIL);
                        C23216097u c23216097u = C23215097t.LIZ;
                        C23215097t.LIZLLL(smartImageView, mediaModel, size, new AwS286S0300000_8(forwardMedia, this, smartImageView, 4));
                        return;
                    }
                    "Required value was null.".toString();
                    throw new IllegalArgumentException("Required value was null.");
                }
                return;
            }
            if (forwardMedia == null) {
                return;
            }
            UrlModel originCoverModel = forwardMedia.video.getOriginCoverModel();
            if (originCoverModel == null || (urlList = originCoverModel.getUrlList()) == null || (str = (String) C13LP.LJJJLL(urlList)) == null) {
                str = "";
            }
            C1331670kl3 c1331670kl3LJIIIZ = C1331660kl2.LJIIIZ(str);
            int i = this.LLJJIJIL;
            int i2 = this.LLJJIJIIJIL;
            c1331670kl3LJIIIZ.LJIIIIZZ = i;
            c1331670kl3LJIIIZ.LJIIIZ = i2;
            c1331670kl3LJIIIZ.LJJ = EnumC1338240kve.FIT_CENTER;
            c1331670kl3LJIIIZ.LJJ(this.LLLFFI);
            c1331670kl3LJIIIZ.LJIIJ(new C580720Mq6(this, 1));
        }
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, X.C19A3, com.bytedance.scene.Scene
    public final ViewGroup onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return (ViewGroup) C786410Ut5.Td(layoutInflater, R.layout.eqz, viewGroup, false);
    }

    public final void LLLLLJLJLL(int i, int i2, int i3, int i4) {
        TextureView textureView;
        if (i <= 0 || i2 <= 0 || i3 <= 0 || i4 <= 0 || (textureView = this.LLLF) == null) {
            return;
        }
        if (i3 * 16 > i4 * 9) {
            textureView.getLayoutParams().width = i;
            textureView.getLayoutParams().height = (i * i4) / i3;
        } else {
            textureView.getLayoutParams().width = (i3 * i2) / i4;
            textureView.getLayoutParams().height = i2;
        }
        C786410Ut5.V5(textureView, textureView.getLayoutParams());
    }
}
