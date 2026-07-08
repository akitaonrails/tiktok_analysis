package X;

import Y.ACallableS427S0100000_22;
import Y.AObserverS225S0100000_22;
import android.content.Context;
import android.view.SurfaceView;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import com.ss.android.ugc.aweme.creative.model.stickers.StickerNewEngineModel;
import com.ss.android.ugc.aweme.editSticker.model.InfoStickerModel;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.music.service.IMusicExternalService;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoEditContainerScene;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import dmt.av.video.VEEditorAutoStartStopArbiter;
import java.util.Objects;

/* JADX INFO: renamed from: X.0nck, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public class C1441840nck {
    public Context LIZ;
    public LifecycleOwner LIZIZ;
    public SurfaceView LIZJ;
    public MutableLiveData LIZLLL;
    public MutableLiveData LJ;
    public MutableLiveData<InfoStickerModel> LJFF;
    public MutableLiveData<InfoStickerModel> LJI;
    public MutableLiveData<StickerNewEngineModel> LJII;
    public VEEditorAutoStartStopArbiter LJIIIIZZ;
    public InterfaceC1452170ntP LJIIIZ;
    public final boolean LJIILIIL;
    public final AbstractC1452680nuE LJIILJJIL;
    public int LJIILL;
    public int LJIILLIIL;
    public final boolean LJIIZILJ;
    public final MutableLiveData<Integer> LJIIJ = new MutableLiveData<>();
    public boolean LJIIJJI = false;
    public final MutableLiveData<Void> LJIIL = new MutableLiveData<>();
    public boolean LJIJ = false;

    public final void LIZJ() {
        if (this.LJIIIZ != null) {
            C11NZ.LJJJJI(new ACallableS427S0100000_22(this, 0)).LJL(C11S5.LIZIZ).LJJLJ();
        }
    }

    public final void LIZLLL() {
        InterfaceC1452170ntP interfaceC1452170ntP = this.LJIIIZ;
        if (interfaceC1452170ntP != null) {
            interfaceC1452170ntP.pause();
        }
    }

    public final void LJ() {
        if (this.LJIIZILJ && this.LJIILJJIL.LJJIIJ.get()) {
            this.LJIJ = true;
            return;
        }
        InterfaceC1452170ntP interfaceC1452170ntP = this.LJIIIZ;
        if (interfaceC1452170ntP != null) {
            interfaceC1452170ntP.play();
        }
    }

    public final void LJFF() {
        if (this.LJIILL == 1) {
            this.LJIIIZ.setInfoStickerRestoreMode(this.LJIILLIIL);
        } else {
            this.LJIIIZ.setInfoStickerRestoreMode(1);
        }
    }

    public void LIZ(Context context, LifecycleOwner lifecycleOwner, SurfaceView surfaceView, VideoPublishEditModel videoPublishEditModel) {
        if (this.LJIIZILJ) {
            this.LJIIL.observe(this.LIZIZ, new AObserverS225S0100000_22(this, 2));
        }
    }

    public final void LIZIZ(Context context, LifecycleOwner lifecycleOwner, SurfaceView surfaceView, VideoPublishEditModel videoPublishEditModel) {
        String strLIZIZ;
        InterfaceC1662290tMJ interfaceC1662290tMJLIZJ;
        if (C289370BVv.LIZ()) {
            C141Q c141q = C141Q.LIZ;
            String mMusicPath = videoPublishEditModel.getMMusicPath();
            c141q.getClass();
            if (C141Q.LJII(mMusicPath)) {
                C20187213yo c20187213yo = C20187213yo.LIZ;
                String mMusicPath2 = videoPublishEditModel.getMMusicPath();
                c20187213yo.getClass();
                if (!C20187213yo.LIZIZ.containsKey(mMusicPath2)) {
                    IMusicExternalService iMusicExternalService = (IMusicExternalService) PluggableExtentionKt.pluggableSpi$default(IMusicExternalService.class, false, false, false, 14, null);
                    if (iMusicExternalService != null && (interfaceC1662290tMJLIZJ = iMusicExternalService.LIZJ()) != null) {
                        strLIZIZ = interfaceC1662290tMJLIZJ.LIZIZ(videoPublishEditModel.getMMusicPath(), -1, "ve_video_publish_edit", videoPublishEditModel.mShootWay, Integer.valueOf(videoPublishEditModel.getMMusicType()), C1428470nHB.LJIILL(videoPublishEditModel), "", videoPublishEditModel.getMMusicUrlKey(videoPublishEditModel.getMMusicPath()));
                    } else {
                        strLIZIZ = null;
                    }
                    if (C123100dR.LIZ(strLIZIZ)) {
                        videoPublishEditModel.setMMusicPath(strLIZIZ);
                    }
                }
            }
        }
        LIZ(context, lifecycleOwner, surfaceView, videoPublishEditModel);
    }

    public C1441840nck(String str, int i, int i2, boolean z, boolean z2, int i3) {
        this.LJIILIIL = false;
        this.LJIIZILJ = false;
        this.LJIIZILJ = z2;
        C1441900ncq c1441900ncq = new C1441900ncq();
        if (i == 13) {
            c1441900ncq.LIZLLL = C574590MgD.LIZ();
            c1441900ncq.LJ = true;
        } else if (i != 2 && i != 3) {
            c1441900ncq.LIZLLL = C574590MgD.LIZ();
            c1441900ncq.LJ = C350510Dof.LIZ();
        } else {
            c1441900ncq.LIZLLL = false;
            c1441900ncq.LJ = false;
        }
        c1441900ncq.LJII = z;
        c1441900ncq.LJIIJ = EnumC1441790ncf.fromInt(i2);
        c1441900ncq.LJIIJJI = EnumC1441860ncm.fromInt(i3);
        if (Objects.equals(str, "MvSaveLocalCompile")) {
            c1441900ncq.LIZIZ = "MvSaveLocalCompile";
        } else {
            c1441900ncq.LIZIZ = "VEVideoPublishEditPresenter";
        }
        c1441900ncq.LJFF = C350500Doe.LIZ();
        c1441900ncq.LJI = true;
        c1441900ncq.LIZJ = z2;
        if (i == 6) {
            this.LJIILIIL = true;
        }
        AbstractC1452680nuE abstractC1452680nuELIZ = C574110MfR.LIZ(i, c1441900ncq);
        this.LJIILJJIL = abstractC1452680nuELIZ;
        abstractC1452680nuELIZ.LJIILJJIL = C1456550o0T.LIZ(VideoEditContainerScene.LLLLLILLIL);
    }
}
