package X;

import Y.ARunnableS105S0100000_5;
import Y.ARunnableS14S0400000_5;
import Y.ARunnableS74S0200000_5;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.TextureView;
import android.widget.FrameLayout;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.ies.nle.editor_jni.INLEListenerCommon;
import com.bytedance.ies.nle.editor_jni.INLEListenerFirstFrame;
import com.bytedance.ies.nle.editor_jni.INLEListenerVideoOutput;
import com.bytedance.ies.nle.editor_jni.INLEPlayer;
import com.bytedance.ies.nle.editor_jni.INLEStickerRuntime;
import com.bytedance.ies.nle.editor_jni.NLEEditor;
import com.bytedance.ies.nle.editor_jni.NLEMediaConfig;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLENode;
import com.bytedance.ies.nle.editor_jni.NLEResType;
import com.bytedance.ies.nle.editor_jni.NLEResourceAV;
import com.bytedance.ies.nle.editor_jni.NLESegmentTextSticker;
import com.bytedance.ies.nle.editor_jni.NLESegmentVideo;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.NLETrackType;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSPtr;
import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.tools.sticker.core.BaseStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextMotionModel;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.text.render.TextTemplateParams;
import com.ss.android.vesdk.VESize;
import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS189S0000000_3;
import kotlin.jvm.internal.AwS134S0400000_5;
import kotlin.jvm.internal.AwS549S0100000_5;
import kotlin.jvm.internal.AwS584S0100000_5;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0F8n, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C385230F8n implements C0FGA {
    public final Context LIZ;
    public final NLEEditor LIZIZ;
    public final VideoPublishEditModel LIZJ;
    public final InterfaceC1455860nzM LIZLLL;
    public final VESize LJ;
    public final LifecycleOwner LJFF;
    public final C01GW LJI = C452501pT.LIZIZ(AFwS189S0000000_3.get$arr$(999));
    public final String LJII = C0CHQ.LIZ().LJJIIJZLJL().getFileProvider().LIZIZ("ve_sticker_edit");
    public final NLEEditor LJIIIIZZ = C346630DiP.LIZ();
    public volatile C1463860oCG LJIIIZ;
    public boolean LJIIJ;
    public volatile long LJIIJJI;
    public TextureView LJIIL;
    public FrameLayout LJIILIIL;
    public TextureView.SurfaceTextureListener LJIILJJIL;
    public boolean LJIILL;
    public volatile float LJIILLIIL;

    @Override // X.C0FGA
    public final TextTemplateParams LIZ() {
        return null;
    }

    @Override // X.C0FGA
    public final void LIZIZ(Function1<? super TextTemplateParams, Unit> function1) {
    }

    @Override // X.C0FGA
    public final NLETrackSlot LIZLLL() {
        return null;
    }

    @Override // X.C0FGA
    public final void LJ(AwS549S0100000_5 awS549S0100000_5) {
    }

    @Override // X.C0FGA
    public final boolean LJII() {
        return false;
    }

    @Override // X.C0FGA
    public final Rect LJIIIIZZ() {
        return null;
    }

    @Override // X.C0FGA
    public final void LJIIJ(FrameLayout frameLayout, LifecycleOwner lifecycleOwner, C1664680tQA c1664680tQA, int i, AwS134S0400000_5 awS134S0400000_5) {
    }

    @Override // X.C0FGA
    public final void LJIIL(AwS584S0100000_5 awS584S0100000_5) {
    }

    @Override // X.C0FGA
    public final void LLZLLLL() {
    }

    @Override // X.C0FGA
    public final INLEStickerRuntime getStickerApi() {
        return null;
    }

    @Override // X.C0FGA
    public final void resume() {
    }

    @Override // X.C0FGA
    public final void LIZJ() {
        TextureView textureView = this.LJIIL;
        if (textureView == null || textureView.getVisibility() == 8) {
            return;
        }
        TextureView textureView2 = this.LJIIL;
        if (textureView2 != null) {
            C786410Ut5.LLIIIILZ(textureView2, 8);
        }
        LJIILJJIL().submit(new ARunnableS105S0100000_5(this, 97));
    }

    @Override // X.C0FGA
    public final int LJFF() {
        FrameLayout frameLayout = this.LJIILIIL;
        if (frameLayout != null) {
            return (frameLayout.getTop() + frameLayout.getBottom()) / 2;
        }
        return 0;
    }

    public final NLEModel LJIILIIL() {
        String absolutePath;
        C1463670oBx c1463670oBx;
        C348100Dkm c348100DkmLIZLLL;
        NLEModel nLEModel = new NLEModel();
        nLEModel.setCanvasRatio(this.LIZIZ.getModel().getCanvasRatio());
        float fK52 = this.LIZLLL.k52();
        if (fK52 == 0.0f) {
            fK52 = C1415610mwR.LIZIZ();
        }
        float fVF0 = this.LIZLLL.VF0();
        if (fVF0 == 0.0f) {
            fVF0 = C1415610mwR.LIZ();
        }
        if (fK52 / fVF0 > this.LJIILLIIL) {
            fK52 = this.LJIILLIIL * fVF0;
        } else {
            fVF0 = fK52 / this.LJIILLIIL;
        }
        Pair pair = new Pair(Integer.valueOf((int) fK52), Integer.valueOf((int) fVF0));
        C348350DlB.LJIIJJI(nLEModel, ((Number) pair.getFirst()).intValue());
        NLETrackSlot nLETrackSlot = new NLETrackSlot();
        NLESegmentVideo nLESegmentVideo = new NLESegmentVideo();
        NLEResourceAV nLEResourceAV = new NLEResourceAV();
        nLEResourceAV.setResourceType(NLEResType.IMAGE);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        nLEResourceAV.setDuration(timeUnit.toMicros(2000L));
        nLEResourceAV.setWidth(((Number) pair.getFirst()).intValue());
        nLEResourceAV.setHeight(((Number) pair.getSecond()).intValue());
        int iIntValue = ((Number) pair.getFirst()).intValue();
        int iIntValue2 = ((Number) pair.getSecond()).intValue();
        InterfaceC570310MYj pathService = C0CHQ.LIZ().LJJIIJZLJL().getPathService();
        CreativeInfo creativeInfo = this.LIZJ.getCreativeInfo();
        EnumC20228214Cy enumC20228214Cy = EnumC20228214Cy.PHOTO;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this.LJIILLIIL);
        sbLIZ.append("sticker_player_track_res.png");
        C0VSJ c0vsjLIZJ = pathService.LIZJ(creativeInfo, enumC20228214Cy, C2188811AlT.LIZIZ(sbLIZ), false);
        if (c0vsjLIZJ.exists()) {
            absolutePath = c0vsjLIZJ.getAbsolutePath();
        } else {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iIntValue, iIntValue2, Bitmap.Config.ARGB_8888);
            bitmapCreateBitmap.setDensity(C2219091BtD.LIZ().getResources().getDisplayMetrics().densityDpi);
            new Canvas(bitmapCreateBitmap).drawColor(0);
            C570490MZb.LJI(c0vsjLIZJ);
            C2475009mu.LJFF(100, Bitmap.CompressFormat.PNG, bitmapCreateBitmap, c0vsjLIZJ);
            absolutePath = c0vsjLIZJ.getAbsolutePath();
        }
        nLEResourceAV.setResourceFile(absolutePath);
        nLEResourceAV.setHasAudio(false);
        nLESegmentVideo.setAVFile(nLEResourceAV);
        if (C0BU1.LIZ()) {
            InterfaceC1452170ntP value = this.LIZLLL.g().getValue();
            if ((value instanceof C1463670oBx) && (c1463670oBx = (C1463670oBx) value) != null && (c348100DkmLIZLLL = c1463670oBx.LIZLLL()) != null && c348100DkmLIZLLL.LIZIZ != null) {
                nLESegmentVideo.setExtra("DefaultCanvas", "false");
            }
        }
        nLESegmentVideo.setTimeClipStart(0L);
        nLESegmentVideo.setTimeClipEnd(timeUnit.toMicros(2000L));
        nLETrackSlot.setEndTime(timeUnit.toMicros(2000L));
        nLESegmentVideo.setKeepTone(true);
        nLESegmentVideo.setVolume(0.0f);
        nLETrackSlot.setMainSegment(nLESegmentVideo);
        NLETrack nLETrack = new NLETrack();
        nLETrack.setMainTrack(true);
        nLETrack.addSlot(nLETrackSlot);
        nLETrack.setDuration(nLETrackSlot.getDuration());
        nLEModel.addTrack(nLETrack);
        NLETrackSlot nLETrackSlot2 = new NLETrackSlot();
        nLETrackSlot2.setStartTime(0L);
        nLETrackSlot2.setEndTime(timeUnit.toMicros(2000L));
        nLETrackSlot2.setMainSegment(new NLESegmentTextSticker());
        nLETrackSlot2.setTransformX(0.0f);
        nLETrackSlot2.setTransformY(0.0f);
        nLETrackSlot2.setRotation(0.0f);
        NLETrack nLETrack2 = new NLETrack();
        nLETrack2.setExtra("StickerTrackType", "TEXT");
        nLETrack2.setExtra("track_type", "sticker");
        nLETrack2.setExtraTrackType(NLETrackType.STICKER);
        nLETrack2.addSlot(nLETrackSlot2);
        nLEModel.addTrack(nLETrack2);
        return nLEModel;
    }

    public final ExecutorService LJIILJJIL() {
        return (ExecutorService) this.LJI.getValue();
    }

    public final NLETrackSlot LJIILL() {
        VecNLETrackSPtr tracks;
        NLETrack next;
        NLEModel model = this.LJIIIIZZ.getModel();
        if (model != null && (tracks = model.getTracks()) != null) {
            Iterator<NLETrack> it2 = tracks.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    next = null;
                    break;
                }
                next = it2.next();
                if (next.getExtraTrackType() == NLETrackType.STICKER) {
                    break;
                }
            }
            NLETrack nLETrack = next;
            if (nLETrack != null) {
                return (NLETrackSlot) C13LP.LJJJLZIJ(0, nLETrack.getSlots());
            }
        }
        return null;
    }

    public final void LJIILLIIL() {
        if (this.LJIIIZ != null) {
            return;
        }
        TextureView textureView = new TextureView(this.LIZ);
        textureView.setOpaque(false);
        C786410Ut5.V5(textureView, new FrameLayout.LayoutParams(-1, -1));
        C786410Ut5.LLIIIILZ(textureView, 8);
        this.LJIIL = textureView;
        NLEMediaConfig nLEMediaConfig = new NLEMediaConfig();
        nLEMediaConfig.setEnableVEOperationEvent(true);
        nLEMediaConfig.setWorkSpace(this.LJII);
        nLEMediaConfig.setEnableStickerMode(true);
        NLEEditor nLEEditor = this.LJIIIIZZ;
        C1419820n3E.LIZ.LIZ();
        final C1463860oCG c1463860oCG = new C1463860oCG(nLEMediaConfig, textureView, nLEEditor, false);
        ((C1463880oCI) c1463860oCG.getMediaSettingApi()).setPreviewFps(30, true);
        ((C1463880oCI) c1463860oCG.getMediaSettingApi()).setLoopPlay(true);
        ((C1463950oCP) c1463860oCG.getMediaRuntimeApi()).setBackgroundColor(0);
        INLEPlayer.DefaultImpls.addOnInfoListener$default(c1463860oCG.getPlayerApi(), new INLEListenerCommon() { // from class: X.0F8p
            @Override // com.bytedance.ies.nle.editor_jni.INLEListenerCommon
            public final void onCallback(int i, int i2, float f, String str) {
                if (4359 == i) {
                    ((C1463950oCP) c1463860oCG.getMediaRuntimeApi()).setBackgroundColor(0);
                    C354270Duj.LIZ(0L, new AwS549S0100000_5(this, 1152));
                } else {
                    if (4098 != i) {
                        return;
                    }
                    ((C389960FQs) c1463860oCG.getPlayerApi()).seekTime(0L);
                    ((C389960FQs) c1463860oCG.getPlayerApi()).play();
                }
            }
        }, false, 2, null);
        ((C389960FQs) c1463860oCG.getPlayerApi()).setFirstFrameListener(new INLEListenerFirstFrame() { // from class: X.0F8r
            @Override // com.bytedance.ies.nle.editor_jni.INLEListenerFirstFrame
            public final void onRendered() {
                ((C1463950oCP) c1463860oCG.getMediaRuntimeApi()).setBackgroundColor(0);
                C354270Duj.LIZ(0L, new AwS549S0100000_5(this, 1159));
            }
        });
        ((C389960FQs) c1463860oCG.getPlayerApi()).setVideoOutputListener(new INLEListenerVideoOutput() { // from class: X.0F8q
            @Override // com.bytedance.ies.nle.editor_jni.INLEListenerVideoOutput
            public final void onRefresh(int i, long j) {
                if (j + ((long) 99000) >= this.LJIIJJI) {
                    ((C389960FQs) c1463860oCG.getPlayerApi()).stop();
                    ((C389960FQs) c1463860oCG.getPlayerApi()).prepare();
                    ((C389960FQs) c1463860oCG.getPlayerApi()).play();
                }
            }
        });
        this.LJIIIZ = c1463860oCG;
        FrameLayout frameLayout = this.LJIILIIL;
        if (frameLayout != null) {
            frameLayout.addView(textureView);
        }
    }

    @Override // X.C0FGA
    public final void destroy() {
        if (this.LJIILL) {
            this.LJIILJJIL = null;
            TextureView textureView = this.LJIIL;
            if (textureView != null) {
                textureView.setSurfaceTextureListener(null);
            }
            LJIILJJIL().submit(new ARunnableS105S0100000_5(this, 96));
        }
    }

    @Override // X.C0FGA
    public final void recycleEngine() {
        TextureView.SurfaceTextureListener surfaceTextureListener;
        if (this.LJIILL) {
            TextureView textureView = this.LJIIL;
            if (textureView != null && (surfaceTextureListener = textureView.getSurfaceTextureListener()) != null) {
                this.LJIILJJIL = surfaceTextureListener;
            }
            TextureView textureView2 = this.LJIIL;
            if (textureView2 != null) {
                textureView2.setSurfaceTextureListener(null);
            }
            TextureView textureView3 = this.LJIIL;
            if (textureView3 != null) {
                C786410Ut5.LLIIIILZ(textureView3, 8);
            }
            LJIILJJIL().submit(new ARunnableS105S0100000_5(this, 100));
        }
    }

    @Override // X.C0FGA
    public final void LJIIIZ(TextStickerModel textStickerModel) {
        TextureView.SurfaceTextureListener surfaceTextureListener;
        TextureView textureView;
        float f;
        if (!this.LJIILL) {
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("textStickerPlayer str: ");
        sbLIZ.append(textStickerModel.getTextStr());
        C2188811AlT.LIZIZ(sbLIZ);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("textStickerPlayer textStrWithBreak: ");
        sbLIZ2.append(textStickerModel.getTextStrWithLineBreak());
        C2188811AlT.LIZIZ(sbLIZ2);
        if ((!a0.LJJJIL(textStickerModel.getTextStr())) && a0.LJJJIL(textStickerModel.getTextStrWithLineBreak())) {
            return;
        }
        LJIILLIIL();
        TextureView textureView2 = this.LJIIL;
        if ((textureView2 == null || textureView2.getSurfaceTextureListener() == null) && (surfaceTextureListener = this.LJIILJJIL) != null && (textureView = this.LJIIL) != null) {
            textureView.setSurfaceTextureListener(surfaceTextureListener);
        }
        TextureView textureView3 = this.LJIIL;
        if (textureView3 != null) {
            C786410Ut5.LLIIIILZ(textureView3, 0);
            if (a0.LJJJIL(textStickerModel.getTextStr())) {
                f = 0.0f;
            } else {
                f = 1.0f;
            }
            C786410Ut5.Q4(f, textureView3);
        }
        LJIILJJIL().submit(new ARunnableS74S0200000_5(this, textStickerModel, 46));
    }

    @Override // X.C0FGA
    public final void LJIIJJI(FrameLayout frameLayout) {
        Float fValueOf;
        if (this.LJIILL) {
            float f = this.LJIILLIIL;
            NLEModel model = this.LIZIZ.getModel();
            if (model != null) {
                fValueOf = Float.valueOf(model.getCanvasRatio());
            } else {
                fValueOf = null;
            }
            if (!Intrinsics.LIZ(f, fValueOf)) {
                FrameLayout frameLayout2 = this.LJIILIIL;
                if (frameLayout2 != null) {
                    C786410Ut5.a6(frameLayout2, this.LIZLLL.ej());
                }
                LJIILJJIL().submit(new ARunnableS105S0100000_5(this, 98));
                return;
            }
            return;
        }
        this.LJIILL = true;
        FrameLayout frameLayout3 = new FrameLayout(this.LIZ);
        this.LJIILIIL = frameLayout3;
        C786410Ut5.a6(frameLayout3, this.LIZLLL.ej());
        frameLayout.addView(frameLayout3);
        LJIILJJIL().submit(new ARunnableS105S0100000_5(this, 99));
    }

    public final NLETrackSlot LJIIZILJ(TextStickerModel textStickerModel) {
        TextStickerModel textStickerModelCopy$default = TextStickerModel.copy$default(textStickerModel, null, null, null, textStickerModel.getTextStr(), textStickerModel.getTextStrWithLineBreak(), 0, 0, 0, 0.0f, null, false, false, false, false, false, null, null, null, null, null, null, null, null, false, null, 0L, 0L, null, null, null, false, null, null, false, false, null, null, null, null, null, null, false, false, null, false, false, false, null, -25, 65535, null);
        BaseStickerModel baseStickerModel = textStickerModelCopy$default.getBaseStickerModel();
        NLETrackSlot nLETrackSlotLJIILL = LJIILL();
        if (nLETrackSlotLJIILL != null) {
            nLETrackSlotLJIILL.setStartTime(0L);
            nLETrackSlotLJIILL.setEndTime(((long) (baseStickerModel.getEndTime() - baseStickerModel.getStartTime())) * 1000);
            NLESegmentTextSticker nLESegmentTextStickerDynamicCast = NLESegmentTextSticker.dynamicCast((NLENode) nLETrackSlotLJIILL.getMainSegment());
            if (nLESegmentTextStickerDynamicCast != null) {
                nLESegmentTextStickerDynamicCast.setIsRichtext(true);
                nLESegmentTextStickerDynamicCast.setRichContent(C385050F7v.LIZIZ(textStickerModelCopy$default, C0CHQ.LIZ().getAppLanguage()));
                String strLIZ = C385050F7v.LIZ(textStickerModelCopy$default);
                boolean zLJFF = true ^ Intrinsics.LJFF(nLESegmentTextStickerDynamicCast.getContent(), strLIZ);
                nLESegmentTextStickerDynamicCast.setContent(strLIZ);
                TextMotionModel textMotionModel = textStickerModel.getTextMotionModel();
                C0ERP c0erp = new C0ERP(textStickerModel);
                if (zLJFF) {
                    c0erp.LJI(C13BV.INSTANCE);
                }
                nLESegmentTextStickerDynamicCast.setAnimation(C385050F7v.LJFF(textMotionModel, c0erp));
            }
            nLETrackSlotLJIILL.setTransformX((2 * baseStickerModel.getTranslateX()) / this.LJ.width);
            nLETrackSlotLJIILL.setTransformY(((-2) * baseStickerModel.getTranslateY()) / this.LJ.height);
            nLETrackSlotLJIILL.setRotation(0.0f);
            return nLETrackSlotLJIILL;
        }
        return null;
    }

    @Override // X.C0FGA
    public final void LJI(TextStickerModel textStickerModel, AwS549S0100000_5 awS549S0100000_5) {
        TextureView.SurfaceTextureListener surfaceTextureListener;
        TextureView textureView;
        if (!this.LJIILL) {
            return;
        }
        LJIILLIIL();
        TextureView textureView2 = this.LJIIL;
        Float fValueOf = null;
        if ((textureView2 == null || textureView2.getSurfaceTextureListener() == null) && (surfaceTextureListener = this.LJIILJJIL) != null && (textureView = this.LJIIL) != null) {
            textureView.setSurfaceTextureListener(surfaceTextureListener);
        }
        NLEModel model = this.LIZIZ.getModel();
        if (model != null) {
            fValueOf = Float.valueOf(model.getCanvasRatio());
        }
        TextureView textureView3 = this.LJIIL;
        if (textureView3 != null) {
            C786410Ut5.LLIIIILZ(textureView3, 0);
        }
        TextureView textureView4 = this.LJIIL;
        if (textureView4 != null) {
            C786410Ut5.Q4(0.0f, textureView4);
        }
        LJIILJJIL().submit(new ARunnableS14S0400000_5(this, textStickerModel, fValueOf, awS549S0100000_5, 5));
    }

    public C385230F8n(Context context, NLEEditor nLEEditor, VideoPublishEditModel videoPublishEditModel, InterfaceC1455860nzM interfaceC1455860nzM, VESize vESize, AbstractC381020Ewm abstractC381020Ewm) {
        float canvasRatio;
        this.LIZ = context;
        this.LIZIZ = nLEEditor;
        this.LIZJ = videoPublishEditModel;
        this.LIZLLL = interfaceC1455860nzM;
        this.LJ = vESize;
        this.LJFF = abstractC381020Ewm;
        NLEModel model = nLEEditor.getModel();
        if (model != null) {
            canvasRatio = model.getCanvasRatio();
        } else {
            canvasRatio = 0.5625f;
        }
        this.LJIILLIIL = canvasRatio;
    }
}
