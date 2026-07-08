package X;

import Y.ACListenerS156S0100000_22;
import android.graphics.BitmapFactory;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.lifecycle.LiveData;
import com.bytedance.ies.nle.editor_jni.INLEPlayer;
import com.bytedance.ies.nle.editor_jni.INLEPurePlayer;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLENode;
import com.bytedance.ies.nle.editor_jni.NLESegmentAudio;
import com.bytedance.ies.nle.editor_jni.NLESegmentVideo;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSPtr;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSlotSPtr;
import com.ss.android.ugc.aweme.creative.model.edit.EditImageInfo;
import com.ss.android.ugc.aweme.creative.model.edit.ImageAlbumData;
import com.ss.android.ugc.aweme.creative.model.edit.ImageSurfaceData;
import com.ss.android.ugc.aweme.creative.model.edit.SingleImageData;
import com.ss.android.ugc.aweme.creative.model.edit.SrcImageInfo;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import kotlin.Pair;
import kotlin.jvm.internal.AwS423S0200000_22;
import kotlin.jvm.internal.AwS566S0100000_22;

/* JADX INFO: renamed from: X.0nrW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1451000nrW extends AbstractC1664490tPr<C1451220nrs, C1451240nru> {
    public int LLJJLIIIJLLLLLLLZ;
    public int LLJL;
    public boolean LLJLL;
    public C1322110kVd LLJLLIL;
    public C371280Eh4 LLJLLL;
    public FrameLayout LLJZ;
    public SurfaceView LLJZIJLIL;
    public boolean LLL;
    public View LLLF;
    public View LLLFF;
    public INLEPlayer LLLFFI;
    public final C01GW LLJJJIL = C452501pT.LIZIZ(new AwS566S0100000_22(this, 63));
    public final C01GW LLJJJJ = C452501pT.LIZIZ(new AwS566S0100000_22(this, 65));
    public final C01GW LLJJJJJIL = C452501pT.LIZIZ(new AwS566S0100000_22(this, 62));
    public final C01GW LLJJJJLIIL = C452501pT.LIZIZ(new AwS566S0100000_22(this, 64));
    public final C01GW LLJJL = C452501pT.LIZIZ(new AwS566S0100000_22(this, 66));
    public final boolean LLJLIL = true;
    public final C1451230nrt LLJLILLLLZIIL = new C1451230nrt();
    public final C1451170nrn LLLFZ = new INLEPurePlayer.INLEPurePlayerInfoListener() { // from class: X.0nrn
        @Override // com.bytedance.ies.nle.editor_jni.INLEPurePlayer.INLEPurePlayerInfoListener
        public final void onPlayEnd() {
            INLEPurePlayer.INLEPurePlayerInfoListener.DefaultImpls.onPlayEnd(this);
            C1451000nrW c1451000nrW = this.LIZ;
            INLEPlayer iNLEPlayer = c1451000nrW.LLLFFI;
            C01TT.LIZLLL(new AwS423S0200000_22(c1451000nrW, iNLEPlayer, 9));
            if (iNLEPlayer != null) {
                iNLEPlayer.removePlayerInfoListener(this);
            }
            this.LIZ.LLLFFI = null;
        }

        @Override // com.bytedance.ies.nle.editor_jni.INLEPurePlayer.INLEPurePlayerInfoListener
        public final void onFirstFrameRender() {
            INLEPurePlayer.INLEPurePlayerInfoListener.DefaultImpls.onFirstFrameRender(this);
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
        }
    };

    public final SingleImageData LLLLLJLJLL() {
        return (SingleImageData) this.LLJJJIL.getValue();
    }

    public final ImageAlbumData LLLLLL() {
        return (ImageAlbumData) this.LLJJJJLIIL.getValue();
    }

    public final C1451190nrp LLLLLLL() {
        return (C1451190nrp) this.LLJJL.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x02bb  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x02cb  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x030e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LLLLLLLLL() {
        /*
            Method dump skipped, instruction units count: 954
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1451000nrW.LLLLLLLLL():void");
    }

    public final void LLLLLLLLLL() {
        View view;
        View viewFindViewById;
        if (this.mViewDestroyed || (view = this.mView) == null || (viewFindViewById = view.findViewById(R.id.n3h)) == null) {
            return;
        }
        this.LLLFF = viewFindViewById;
        SingleImageData singleImageDataLLLLLJLJLL = LLLLLJLJLL();
        if (singleImageDataLLLLLJLJLL == null || singleImageDataLLLLLJLJLL.getSrcLiveInfo() == null) {
            View view2 = this.LLLFF;
            if (view2 != null) {
                C786410Ut5.LJLLLLLL(8, view2);
                return;
            }
            return;
        }
        Rect rectLLLLLLIL = LLLLLLIL(this);
        View view3 = this.LLLFF;
        if (view3 != null) {
            C786410Ut5.Fd(view3, rectLLLLLLIL.left + 0.0f);
        }
        View view4 = this.LLLFF;
        if (view4 != null) {
            C786410Ut5.Ld(view4, rectLLLLLLIL.top + 8.0f);
        }
        LLLLLLZZ(this);
        View view5 = this.LLLFF;
        if (view5 != null) {
            C786410Ut5.I7(new ACListenerS156S0100000_22(this, 1), view5);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x024c  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0289  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x02b0  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x02b2  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x02b9  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0341  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LLLLLLZ() {
        /*
            Method dump skipped, instruction units count: 1033
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1451000nrW.LLLLLLZ():void");
    }

    public final void LLLLLZ() {
        C371280Eh4 c371280Eh4 = this.LLJLLL;
        if (c371280Eh4 != null) {
            c371280Eh4.LL = -1;
        }
        Rect rectLLLLLLIL = LLLLLLIL(this);
        C371280Eh4 c371280Eh42 = this.LLJLLL;
        if (c371280Eh42 != null) {
            c371280Eh42.setEditRect(rectLLLLLLIL);
        }
        LLLLIL().LIZIZ.invoke(rectLLLLLLIL);
        C371280Eh4 c371280Eh43 = this.LLJLLL;
        if (c371280Eh43 == null || c371280Eh43.getVisibility() != 8) {
            C371280Eh4 c371280Eh44 = this.LLJLLL;
            if (c371280Eh44 != null) {
                c371280Eh44.invalidate();
                return;
            }
            return;
        }
        C371280Eh4 c371280Eh45 = this.LLJLLL;
        if (c371280Eh45 != null) {
            int visibility = c371280Eh45.getVisibility();
            c371280Eh45.setVisibility(0);
            C1602160rnK.LIZIZ(visibility, 0, c371280Eh45);
        }
    }

    public final VideoPublishEditModel getEditModel() {
        return (VideoPublishEditModel) this.LLJJJJJIL.getValue();
    }

    public final InterfaceC1452170ntP LLLLLLJ() {
        LiveData<InterfaceC1452170ntP> liveData = LLLLILI().LIZ.LJ;
        if (liveData != null) {
            return liveData.getValue();
        }
        return null;
    }

    public final void LLLLLZL() {
        EditImageInfo editImageInfo;
        SingleImageData singleImageDataLLLLLJLJLL;
        EditImageInfo editImageInfo2;
        SrcImageInfo srcImageInfo;
        EditImageInfo editImageInfo3;
        SrcImageInfo srcImageInfo2;
        SrcImageInfo srcImageInfo3;
        SrcImageInfo srcImageInfo4;
        SrcImageInfo srcImageInfo5;
        SrcImageInfo srcImageInfo6;
        EditImageInfo editImageInfo4;
        EditImageInfo editImageInfo5;
        SingleImageData singleImageDataLLLLLJLJLL2 = LLLLLJLJLL();
        float imageRatio = 0.0f;
        if (singleImageDataLLLLLJLJLL2 == null || (editImageInfo5 = singleImageDataLLLLLJLJLL2.getEditImageInfo()) == null || editImageInfo5.getRatio() <= 0.0f) {
            C2488709p7 c2488709p7 = C2488709p7.LIZ;
            SingleImageData singleImageDataLLLLLJLJLL3 = LLLLLJLJLL();
            int width = (singleImageDataLLLLLJLJLL3 == null || (srcImageInfo6 = singleImageDataLLLLLJLJLL3.getSrcImageInfo()) == null) ? 0 : srcImageInfo6.getWidth();
            SingleImageData singleImageDataLLLLLJLJLL4 = LLLLLJLJLL();
            int height = (singleImageDataLLLLLJLJLL4 == null || (srcImageInfo5 = singleImageDataLLLLLJLJLL4.getSrcImageInfo()) == null) ? 0 : srcImageInfo5.getHeight();
            int iIntValue = ((Number) C473380IhM.LIZ(this.mActivity).getFirst()).intValue();
            int iIntValue2 = ((Number) C473380IhM.LIZ(this.mActivity).getSecond()).intValue();
            c2488709p7.getClass();
            Pair pairLJ = C2488709p7.LJ(width, height, iIntValue, iIntValue2);
            SingleImageData singleImageDataLLLLLJLJLL5 = LLLLLJLJLL();
            if (singleImageDataLLLLLJLJLL5 != null && (srcImageInfo4 = singleImageDataLLLLLJLJLL5.getSrcImageInfo()) != null) {
                srcImageInfo4.setWidth(((Number) pairLJ.getFirst()).intValue());
            }
            SingleImageData singleImageDataLLLLLJLJLL6 = LLLLLJLJLL();
            if (singleImageDataLLLLLJLJLL6 != null && (srcImageInfo3 = singleImageDataLLLLLJLJLL6.getSrcImageInfo()) != null) {
                srcImageInfo3.setHeight(((Number) pairLJ.getSecond()).intValue());
            }
            SingleImageData singleImageDataLLLLLJLJLL7 = LLLLLJLJLL();
            if (singleImageDataLLLLLJLJLL7 != null && (editImageInfo3 = singleImageDataLLLLLJLJLL7.getEditImageInfo()) != null) {
                float f = this.LLJJLIIIJLLLLLLLZ / this.LLJL;
                SingleImageData singleImageDataLLLLLJLJLL8 = LLLLLJLJLL();
                editImageInfo3.setRatio(C2488709p7.LIZLLL(f, (singleImageDataLLLLLJLJLL8 == null || (srcImageInfo2 = singleImageDataLLLLLJLJLL8.getSrcImageInfo()) == null) ? 0.0f : srcImageInfo2.getImageRatio()));
            }
            int i = C1451140nrk.LIZ;
            SingleImageData singleImageDataLLLLLJLJLL9 = LLLLLJLJLL();
            if (singleImageDataLLLLLJLJLL9 != null && (srcImageInfo = singleImageDataLLLLLJLJLL9.getSrcImageInfo()) != null) {
                imageRatio = srcImageInfo.getImageRatio();
            }
            if (C1451140nrk.LIZ(imageRatio) && (singleImageDataLLLLLJLJLL = LLLLLJLJLL()) != null && (editImageInfo2 = singleImageDataLLLLLJLJLL.getEditImageInfo()) != null) {
                editImageInfo2.setFullScreen(true);
            }
            SingleImageData singleImageDataLLLLLJLJLL10 = LLLLLJLJLL();
            if (singleImageDataLLLLLJLJLL10 != null && (editImageInfo = singleImageDataLLLLLJLJLL10.getEditImageInfo()) != null) {
                editImageInfo.setFullScreen(false);
            }
        }
        SingleImageData singleImageDataLLLLLJLJLL11 = LLLLLJLJLL();
        if (singleImageDataLLLLLJLJLL11 == null || (editImageInfo4 = singleImageDataLLLLLJLJLL11.getEditImageInfo()) == null) {
            return;
        }
        editImageInfo4.isFullScreen();
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, com.bytedance.scene.Scene
    public final void onDestroyView() {
        super.onDestroyView();
        INLEPlayer iNLEPlayer = this.LLLFFI;
        if (iNLEPlayer != null) {
            iNLEPlayer.removePlayerInfoListener(this.LLLFZ);
        }
        this.LLLFFI = null;
        InterfaceC1452170ntP interfaceC1452170ntPLLLLLLJ = LLLLLLJ();
        if (interfaceC1452170ntPLLLLLLJ != null) {
            interfaceC1452170ntPLLLLLLJ.updateSurfaceView(null);
        }
    }

    public static Rect LLLLLLIL(C1451000nrW c1451000nrW) {
        String path;
        SrcImageInfo srcImageInfo;
        EditImageInfo editImageInfo;
        SingleImageData singleImageDataLLLLLJLJLL = c1451000nrW.LLLLLJLJLL();
        if (singleImageDataLLLLLJLJLL != null && (editImageInfo = singleImageDataLLLLLJLJLL.getEditImageInfo()) != null) {
            editImageInfo.getRatio();
        }
        C1322110kVd c1322110kVd = c1451000nrW.LLJLLIL;
        if (c1322110kVd != null) {
            SingleImageData singleImageDataLLLLLJLJLL2 = c1451000nrW.LLLLLJLJLL();
            if (singleImageDataLLLLLJLJLL2 == null || (srcImageInfo = singleImageDataLLLLLJLJLL2.getSrcImageInfo()) == null || (path = srcImageInfo.getPath()) == null) {
                path = "";
            }
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeFile(path, options);
            return C0GWQ.LIZ(options.outWidth, options.outHeight, c1322110kVd);
        }
        return new Rect();
    }

    public static void LLLLLLZZ(C1451000nrW c1451000nrW) {
        View view = c1451000nrW.LLLFF;
        if (view != null) {
            C786410Ut5.T4(view, 1.0f);
            C786410Ut5.LJLLLLLL(0, view);
        }
    }

    public final void LLLLLJIL(boolean z) {
        SurfaceView surfaceView = this.LLJZIJLIL;
        if (surfaceView != null) {
            C786410Ut5.LLIIII(surfaceView, 0);
        }
        SurfaceView surfaceView2 = this.LLJZIJLIL;
        if (surfaceView2 != null && surfaceView2.getVisibility() == 4) {
            C1450070nq1.LIZ("change surface surface is invisible");
        }
    }

    public final void LLLLLLLZIL(NLEModel nLEModel) {
        VecNLETrackSPtr tracks;
        SingleImageData singleImageDataLLLLLJLJLL = LLLLLJLJLL();
        if (singleImageDataLLLLLJLJLL != null && singleImageDataLLLLLJLJLL.getSrcLiveInfo() != null && (tracks = nLEModel.getTracks()) != null) {
            Iterator<NLETrack> it2 = tracks.iterator();
            while (it2.hasNext()) {
                VecNLETrackSlotSPtr slots = it2.next().getSlots();
                if (slots != null) {
                    for (NLETrackSlot nLETrackSlot : slots) {
                        NLESegmentAudio nLESegmentAudioDynamicCast = NLESegmentAudio.dynamicCast(nLETrackSlot.getMainSegment());
                        if (nLESegmentAudioDynamicCast != null) {
                            nLESegmentAudioDynamicCast.setVolume(0.0f);
                        }
                        NLESegmentVideo nLESegmentVideoDynamicCast = NLESegmentVideo.dynamicCast((NLENode) nLETrackSlot.getMainSegment());
                        if (nLESegmentVideoDynamicCast != null) {
                            nLESegmentVideoDynamicCast.setEnableAudio(false);
                        }
                    }
                }
            }
        }
    }

    public final void LLLLZ(int i, int i2) {
        ImageAlbumData imageAlbumData;
        ImageSurfaceData surfaceData;
        ImageSurfaceData surfaceData2;
        this.LLJJLIIIJLLLLLLLZ = i;
        this.LLJL = i2;
        C1451140nrk.LIZ = i2;
        C1451140nrk.LIZIZ = i;
        C1451140nrk.LIZJ = i / i2;
        C1451140nrk.LIZ(C1451140nrk.LJFF);
        ImageAlbumData imageAlbumData2 = getEditModel().getImageAlbumData();
        if ((imageAlbumData2 == null || (surfaceData2 = imageAlbumData2.getSurfaceData()) == null || surfaceData2.getSurfaceViewHeight() <= 0) && C1451140nrk.LIZIZ > 0 && C1451140nrk.LIZ > 0 && (imageAlbumData = getEditModel().getImageAlbumData()) != null && (surfaceData = imageAlbumData.getSurfaceData()) != null) {
            C574070MfN.LJIIIZ(surfaceData);
        }
        this.LLJJJJ.getValue();
        LLLLLLLLL();
        if (!this.LLJLL) {
            this.LLJLL = true;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:134:0x0292  */
    @Override // com.bytedance.scene.Scene
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r12, android.os.Bundle r13) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 726
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1451000nrW.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, X.C19A3, com.bytedance.scene.Scene
    public final ViewGroup onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return (ViewGroup) C786410Ut5.Td(layoutInflater, R.layout.en5, viewGroup, false);
    }
}
