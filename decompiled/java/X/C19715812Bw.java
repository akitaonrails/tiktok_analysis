package X;

import Y.AfS198S0100000_29;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.nle.editor_jni.INLEPurePlayer;
import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import com.ss.android.ugc.aweme.creative.model.album.LivePhotoPreviewMode;
import com.ss.android.ugc.aweme.creative.model.edit.ImageAlbumData;
import com.ss.android.ugc.aweme.creative.model.edit.SingleImageData;
import com.ss.android.ugc.aweme.creative.model.edit.SrcLiveVideoInfo;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import ge.i;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS218S0000000_29;
import kotlin.jvm.internal.AwS573S0100000_29;
import kotlin.jvm.internal.AwS608S0100000_29;
import kotlin.jvm.internal.AwS75S0100100_29;

/* JADX INFO: renamed from: X.12Bw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19715812Bw extends i<InterfaceC19715712Bv, C19715912Bx, C759640Tr0, C19716112Bz> implements InterfaceC19715712Bv, InterfaceC379610EuV {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJJJJIL;
    public static final int LLJJJJLIIL;
    public final C19A3 LLJILJILJ;
    public final CreativeInfo LLJILLL;
    public final C19647111tt LLJJ;
    public final C1DRG LLJJI;
    public final C1452870nuX LLJJIII;
    public final InterfaceC1731706qJ LLJJIJI;
    public int LLJJIJIIJIL;
    public Runnable LLJJIJIL;
    public boolean LLJJJ;
    public final Function0<C759640Tr0> LLJJJIL;
    public final Function0<C19716112Bz> LLJJJJ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C19715812Bw.class, "model", "getModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0);
        C13LE.LIZ.getClass();
        LLJJJJJIL = new InterfaceC2217461Bqa[]{c2217381BqS};
        LLJJJJLIIL = 8;
    }

    private final void d5() {
        Runnable runnable = this.LLJJIJIL;
        if (runnable != null) {
            HandlerHook.viewRemoveCallbacks(this.LLJILJILJ.mView, runnable);
        }
        this.LLJJIJIL = null;
        this.LLJJJ = false;
        this.LLJJIII.LIZLLL(new INLEPurePlayer.INLEPurePlayerInfoListener() { // from class: X.12By
            @Override // com.bytedance.ies.nle.editor_jni.INLEPurePlayer.INLEPurePlayerInfoListener
            public final void onFirstFrameRender() {
                INLEPurePlayer.INLEPurePlayerInfoListener.DefaultImpls.onFirstFrameRender(this);
            }

            @Override // com.bytedance.ies.nle.editor_jni.INLEPurePlayer.INLEPurePlayerInfoListener
            public final void onPlayEnd() {
                INLEPurePlayer.INLEPurePlayerInfoListener.DefaultImpls.onPlayEnd(this);
            }

            @Override // com.bytedance.ies.nle.editor_jni.INLEPurePlayer.INLEPurePlayerInfoListener
            public final void onPlayerPause() {
                INLEPurePlayer.INLEPurePlayerInfoListener.DefaultImpls.onPlayerPause(this);
            }

            @Override // com.bytedance.ies.nle.editor_jni.INLEPurePlayer.INLEPurePlayerInfoListener
            public final void onPrepared() {
                INLEPurePlayer.INLEPurePlayerInfoListener.DefaultImpls.onPrepared(this);
            }

            @Override // com.bytedance.ies.nle.editor_jni.INLEPurePlayer.INLEPurePlayerInfoListener
            public final void onPlayTime(int i, long j) {
                INLEPurePlayer.INLEPurePlayerInfoListener.DefaultImpls.onPlayTime(this, i, j);
                C0CNO.LIZLLL(0L, new AwS75S0100100_29(this.LIZ, j, 1));
            }
        }).LJJ(C1701940uOG.LIZIZ()).LJJIIZ(new AfS198S0100000_29(this, 9), new C09JN() { // from class: X.0hhH
            @Override // X.C09JN
            public final void accept(Object obj) {
                C1C7U.LIZ("FullPagePreviewLivePhotoComponent@1f86.setPlayCallback$4");
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(" setPlayCallback error mssage = ");
                sbLIZ.append(((Throwable) obj).getMessage());
                C1450070nq1.LIZLLL(C2188811AlT.LIZIZ(sbLIZ));
                C1C7U.LIZIZ("FullPagePreviewLivePhotoComponent@1f86.setPlayCallback$4");
            }
        });
    }

    public final VideoPublishEditModel K4() {
        return (VideoPublishEditModel) this.LLJJIJI.getValue(this, LLJJJJJIL[0]);
    }

    @Override // X.InterfaceC19715712Bv
    public void Li() {
        this.LLJJ.LJJIZ(false);
    }

    @Override // X.InterfaceC19715712Bv
    public void rl() {
        if (this.LLJJ.LJJIZ(true)) {
            if (H4(K4(), this.LLJJIJIIJIL) == LivePhotoPreviewMode.LIVE_PHOTO) {
                show();
            } else {
                hide();
            }
            d5();
        }
    }

    @Override // X.InterfaceC19715712Bv
    public C1452870nuX Av() {
        return this.LLJJIII;
    }

    public final CreativeInfo F4() {
        return this.LLJILLL;
    }

    public final C1452870nuX O4() {
        return this.LLJJIII;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LLJJI;
    }

    public final C19A3 getParentScene() {
        return this.LLJILJILJ;
    }

    @Override // X.AbstractC1664470tPp
    public Function0<C759640Tr0> o2() {
        return this.LLJJJIL;
    }

    @Override // X.AbstractC1664470tPp
    public Function0<C19716112Bz> w2() {
        return this.LLJJJJ;
    }

    private final void k5(LivePhotoPreviewMode livePhotoPreviewMode) {
        i3(new AwS608S0100000_29(livePhotoPreviewMode, 247));
    }

    @Override // X.InterfaceC19715712Bv
    public void LJLJJI(int i) {
        this.LLJJIJIIJIL = i;
        k5(H4(K4(), i));
        if (P4(K4(), i)) {
            T4(false);
        } else {
            hide();
        }
    }

    public final void T4(boolean z) {
        d5();
        if (H4(K4(), this.LLJJIJIIJIL) == LivePhotoPreviewMode.LIVE_PHOTO) {
            show();
        } else {
            hide();
        }
        this.LLJJ.LJJJ(this.LLJJIJIIJIL, z);
    }

    private final boolean P4(VideoPublishEditModel videoPublishEditModel, int i) {
        LivePhotoPreviewMode livePhotoPreviewMode;
        List<SingleImageData> imageList;
        SingleImageData singleImageData;
        SrcLiveVideoInfo srcLiveInfo;
        List listLJIIJJI = C1697810uHb.LJIIJJI(LivePhotoPreviewMode.LIVE_PHOTO, LivePhotoPreviewMode.LOOP);
        ImageAlbumData imageAlbumData = videoPublishEditModel.getImageAlbumData();
        if (imageAlbumData != null && (imageList = imageAlbumData.getImageList()) != null && (singleImageData = (SingleImageData) C13LP.LJJJLZIJ(i, imageList)) != null && (srcLiveInfo = singleImageData.getSrcLiveInfo()) != null) {
            livePhotoPreviewMode = srcLiveInfo.getLivePhotoPreviewMode();
        } else {
            livePhotoPreviewMode = null;
        }
        return C13LP.LJJJJ(livePhotoPreviewMode, listLJIIJJI);
    }

    public final LivePhotoPreviewMode H4(VideoPublishEditModel videoPublishEditModel, int i) {
        List<SingleImageData> imageList;
        SingleImageData singleImageData;
        SrcLiveVideoInfo srcLiveInfo;
        LivePhotoPreviewMode livePhotoPreviewMode;
        ImageAlbumData imageAlbumData = videoPublishEditModel.getImageAlbumData();
        if (imageAlbumData == null || (imageList = imageAlbumData.getImageList()) == null || (singleImageData = (SingleImageData) C13LP.LJJJLZIJ(i, imageList)) == null || (srcLiveInfo = singleImageData.getSrcLiveInfo()) == null || (livePhotoPreviewMode = srcLiveInfo.getLivePhotoPreviewMode()) == null) {
            return LivePhotoPreviewMode.STATIC;
        }
        return livePhotoPreviewMode;
    }

    public C19715812Bw(C19A3 c19a3, CreativeInfo creativeInfo, C19647111tt c19647111tt, C1DRG c1drg) {
        super(c19a3);
        this.LLJILJILJ = c19a3;
        this.LLJILLL = creativeInfo;
        this.LLJJ = c19647111tt;
        this.LLJJI = c1drg;
        this.LLJJIII = new C1452870nuX(c19a3.mView.getContext(), creativeInfo);
        this.LLJJIJI = C1664770tQJ.LIZ(getDiContainer(), VideoPublishEditModel.class, null);
        this.LLJJJIL = AFwS218S0000000_29.get$arr$(187);
        this.LLJJJJ = new AwS573S0100000_29(this, 289);
    }
}
