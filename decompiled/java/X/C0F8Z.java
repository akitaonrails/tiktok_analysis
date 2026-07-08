package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.ies.nle.editor_jni.INLEListenerCommon;
import com.bytedance.ies.nle.editor_jni.INLEListenerFirstFrame;
import com.bytedance.ies.nle.editor_jni.INLEListenerSeek;
import com.bytedance.ies.nle.editor_jni.INLEListenerVideoOutput;
import com.bytedance.ies.nle.editor_jni.INLEPlayer;
import com.bytedance.ies.nle.editor_jni.INLEStickerRuntime;
import com.bytedance.ies.nle.editor_jni.NLEEditor;
import com.bytedance.ies.nle.editor_jni.NLEMediaConfig;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLEResType;
import com.bytedance.ies.nle.editor_jni.NLEResourceAV;
import com.bytedance.ies.nle.editor_jni.NLESeekFlag;
import com.bytedance.ies.nle.editor_jni.NLESegmentTextSticker;
import com.bytedance.ies.nle.editor_jni.NLESegmentVideo;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.NLETrackType;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSPtr;
import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextFontModel;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextTemplateModel;
import com.ss.android.ugc.aweme.tools.sticker.core.text.render.TextTemplateParams;
import com.ss.android.vesdk.VESize;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS194S0000000_8;
import kotlin.jvm.internal.AwS134S0400000_5;
import kotlin.jvm.internal.AwS249S0300000_5;
import kotlin.jvm.internal.AwS371S0200000_5;
import kotlin.jvm.internal.AwS406S0200000_5;
import kotlin.jvm.internal.AwS549S0100000_5;
import kotlin.jvm.internal.AwS584S0100000_5;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0F8Z, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0F8Z implements C0FGA {
    public final Context LIZ;
    public final NLEEditor LIZIZ;
    public final VideoPublishEditModel LIZJ;
    public final InterfaceC1455860nzM LIZLLL;
    public final VESize LJ;
    public final LifecycleOwner LJFF;
    public int LJI;
    public boolean LJIIIIZZ;
    public volatile C1463860oCG LJIIL;
    public volatile long LJIILIIL;
    public TextureView LJIILJJIL;
    public Function0<Boolean> LJIILL;
    public TextureView.SurfaceTextureListener LJIILLIIL;
    public volatile boolean LJIIZILJ;
    public volatile boolean LJIJ;
    public volatile boolean LJIJI;
    public volatile boolean LJIJJ;
    public volatile boolean LJIJJLI;
    public FrameLayout LJJ;
    public volatile float LJJI;
    public Function1<? super TextTemplateParams, Unit> LJJIFFI;
    public int LJJII;
    public int LJJIII;
    public Function1<? super ViewGroup.LayoutParams, Unit> LJJIIJ;
    public final C01GW LJII = C452501pT.LIZIZ(new AwS549S0100000_5(this, 1153));
    public final C01GW LJIIIZ = C452501pT.LIZIZ(AFwS194S0000000_8.get$arr$(395));
    public final String LJIIJ = C0CHQ.LIZ().LJJIIJZLJL().getFileProvider().LIZIZ("ve_sticker_edit");
    public final NLEEditor LJIIJJI = C346630DiP.LIZ();
    public final AtomicBoolean LJIL = new AtomicBoolean(false);

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.C0FGA
    public final TextTemplateParams LIZ() {
        C259800zU c259800zU = new C259800zU();
        LJIILL(new AwS406S0200000_5(this, (C0F8Z) c259800zU, (C259800zU<TextTemplateParams>) 115));
        return (TextTemplateParams) c259800zU.element;
    }

    @Override // X.C0FGA
    public final void LIZJ() {
        TextureView textureView = this.LJIILJJIL;
        if (textureView == null || textureView.getVisibility() != 8) {
            TextureView textureView2 = this.LJIILJJIL;
            if (textureView2 != null) {
                C786410Ut5.LLIIIILZ(textureView2, 8);
            }
            new AwS549S0100000_5(this, 1156).invoke();
        }
    }

    @Override // X.C0FGA
    public final int LJFF() {
        View view;
        TextureView textureView = this.LJIILJJIL;
        Object parent = textureView != null ? textureView.getParent() : null;
        if (!(parent instanceof View) || (view = (View) parent) == null) {
            return 0;
        }
        return (view.getTop() + view.getBottom()) / 2;
    }

    @Override // X.C0FGA
    public final boolean LJII() {
        return (!this.LJIIZILJ || this.LJI == 0 || this.LJIJJ) ? false : true;
    }

    @Override // X.C0FGA
    public final Rect LJIIIIZZ() {
        Rect rect = new Rect();
        TextureView textureView = this.LJIILJJIL;
        if (textureView != null) {
            textureView.getGlobalVisibleRect(rect);
        }
        return rect;
    }

    public final NLEModel LJIILIIL() {
        String absolutePath;
        C1463670oBx c1463670oBx;
        C348100Dkm c348100DkmLIZLLL;
        NLEModel nLEModel = new NLEModel();
        nLEModel.setCanvasRatio(this.LJJII / this.LJJIII);
        C348350DlB.LJIIJJI(nLEModel, C1450870nrJ.LIZIZ);
        NLETrackSlot nLETrackSlot = new NLETrackSlot();
        NLESegmentVideo nLESegmentVideo = new NLESegmentVideo();
        NLEResourceAV nLEResourceAV = new NLEResourceAV();
        nLEResourceAV.setResourceType(NLEResType.IMAGE);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        nLEResourceAV.setDuration(timeUnit.toMicros(2000L));
        nLEResourceAV.setWidth(C1450870nrJ.LIZIZ);
        nLEResourceAV.setHeight(C1450870nrJ.LIZ);
        InterfaceC570310MYj pathService = C0CHQ.LIZ().LJJIIJZLJL().getPathService();
        CreativeInfo creativeInfo = this.LIZJ.getCreativeInfo();
        EnumC20228214Cy enumC20228214Cy = EnumC20228214Cy.PHOTO;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this.LJJI);
        sbLIZ.append("sticker_player_track_res.png");
        C0VSJ c0vsjLIZJ = pathService.LIZJ(creativeInfo, enumC20228214Cy, C2188811AlT.LIZIZ(sbLIZ), false);
        if (c0vsjLIZJ.exists()) {
            absolutePath = c0vsjLIZJ.getAbsolutePath();
        } else {
            Integer numValueOf = Integer.valueOf(C1450870nrJ.LIZIZ);
            int iIntValue = numValueOf.intValue() > 0 ? numValueOf.intValue() : 720;
            Integer numValueOf2 = Integer.valueOf(C1450870nrJ.LIZ);
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iIntValue, numValueOf2.intValue() > 0 ? numValueOf2.intValue() : 1280, Bitmap.Config.ARGB_8888);
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

    public final NLETrackSlot LJIILLIIL() {
        VecNLETrackSPtr tracks;
        NLETrack next;
        NLEModel model = this.LJIIJJI.getModel();
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

    @Override // X.C0FGA
    public final void LLZLLLL() {
        new AwS549S0100000_5(this, 1155).invoke();
    }

    @Override // X.C0FGA
    public final void destroy() {
        if (this.LJIIZILJ) {
            this.LJIIZILJ = false;
            this.LJIJ = false;
            this.LJIJJ = true;
            this.LJIL.set(true);
            TextureView textureView = this.LJIILJJIL;
            if (textureView != null) {
                textureView.setSurfaceTextureListener(null);
            }
            new AwS549S0100000_5(this, 1154).invoke();
        }
    }

    @Override // X.C0FGA
    public final INLEStickerRuntime getStickerApi() {
        C1463860oCG c1463860oCG = this.LJIIL;
        if (c1463860oCG != null) {
            return c1463860oCG.getStickerApi();
        }
        return null;
    }

    @Override // X.C0FGA
    public final void recycleEngine() {
        if (this.LJIIZILJ && !this.LJIL.get()) {
            LIZJ();
            this.LJIJJLI = false;
            TextureView textureView = this.LJIILJJIL;
            this.LJIILLIIL = textureView != null ? textureView.getSurfaceTextureListener() : null;
            TextureView textureView2 = this.LJIILJJIL;
            if (textureView2 != null) {
                textureView2.setSurfaceTextureListener(null);
            }
            TextureView textureView3 = this.LJIILJJIL;
            if (textureView3 != null) {
                C786410Ut5.Q4(0.0f, textureView3);
            }
            TextureView textureView4 = this.LJIILJJIL;
            if (textureView4 != null) {
                C786410Ut5.LLIIIILZ(textureView4, 8);
            }
            this.LJIL.set(true);
            new AwS549S0100000_5(this, 1158).invoke();
        }
    }

    @Override // X.C0FGA
    public final void resume() {
        this.LJIL.set(false);
    }

    @Override // X.C0FGA
    public final NLETrackSlot LIZLLL() {
        return LJIILLIIL();
    }

    @Override // X.C0FGA
    public final void LIZIZ(Function1<? super TextTemplateParams, Unit> function1) {
        this.LJJIFFI = function1;
    }

    @Override // X.C0FGA
    public final void LJ(AwS549S0100000_5 awS549S0100000_5) {
        this.LJIILL = awS549S0100000_5;
    }

    @Override // X.C0FGA
    public final void LJIIIZ(TextStickerModel textStickerModel) {
        TextureView.SurfaceTextureListener surfaceTextureListener;
        TextureView textureView;
        float f;
        if ((!a0.LJJJIL(textStickerModel.getTextStr())) && a0.LJJJIL(textStickerModel.getTextStrWithLineBreak())) {
            return;
        }
        TextureView textureView2 = this.LJIILJJIL;
        if ((textureView2 == null || textureView2.getSurfaceTextureListener() == null) && (surfaceTextureListener = this.LJIILLIIL) != null && (textureView = this.LJIILJJIL) != null) {
            textureView.setSurfaceTextureListener(surfaceTextureListener);
        }
        TextureView textureView3 = this.LJIILJJIL;
        if (textureView3 != null) {
            C786410Ut5.LLIIIILZ(textureView3, 0);
            if (a0.LJJJIL(textStickerModel.getTextStr())) {
                f = 0.0f;
            } else {
                f = 1.0f;
            }
            C786410Ut5.Q4(f, textureView3);
        }
        C201955140j.LIZJ(C1421590n65.LIZIZ, "updateSticker, textStr: " + textStickerModel.getTextStr());
        new AwS406S0200000_5(this, textStickerModel, 116).invoke();
    }

    @Override // X.C0FGA
    public final void LJIIJJI(FrameLayout frameLayout) {
        if (this.LJIIZILJ) {
            return;
        }
        this.LJIIZILJ = true;
        this.LJJ = frameLayout;
        FrameLayout frameLayout2 = new FrameLayout(this.LIZ);
        TextureView textureView = new TextureView(this.LIZ);
        textureView.setOpaque(false);
        this.LJIILJJIL = textureView;
        C786410Ut5.a6(frameLayout2, this.LIZLLL.ej());
        LJIJJLI(frameLayout, textureView, true);
        C786410Ut5.Q4(0.0f, textureView);
        frameLayout.addView(frameLayout2);
        frameLayout2.addView(textureView);
        NLEMediaConfig nLEMediaConfig = new NLEMediaConfig();
        nLEMediaConfig.setEnableVEOperationEvent(true);
        nLEMediaConfig.setWorkSpace(this.LJIIJ);
        nLEMediaConfig.setEnableStickerMode(true);
        NLEEditor nLEEditor = this.LJIIJJI;
        C1419820n3E.LIZ.LIZ();
        final C1463860oCG c1463860oCG = new C1463860oCG(nLEMediaConfig, textureView, nLEEditor, false);
        ((C1463880oCI) c1463860oCG.getMediaSettingApi()).setPreviewFps(30, true);
        ((C1463880oCI) c1463860oCG.getMediaSettingApi()).setLoopPlay(true);
        ((C1463950oCP) c1463860oCG.getMediaRuntimeApi()).setBackgroundColor(0);
        INLEPlayer.DefaultImpls.addOnInfoListener$default(c1463860oCG.getPlayerApi(), new INLEListenerCommon() { // from class: X.0F8c
            @Override // com.bytedance.ies.nle.editor_jni.INLEListenerCommon
            public final void onCallback(int i, int i2, float f, String str) {
                if (4359 == i) {
                    ((C1463950oCP) c1463860oCG.getMediaRuntimeApi()).setBackgroundColor(0);
                } else {
                    if (4098 != i) {
                        return;
                    }
                    ((C389960FQs) c1463860oCG.getPlayerApi()).seekTime(0L);
                    ((C389960FQs) c1463860oCG.getPlayerApi()).play();
                }
            }
        }, false, 2, null);
        ((C389960FQs) c1463860oCG.getPlayerApi()).setFirstFrameListener(new INLEListenerFirstFrame() { // from class: X.0F8j
            @Override // com.bytedance.ies.nle.editor_jni.INLEListenerFirstFrame
            public final void onRendered() {
                ((C1463950oCP) c1463860oCG.getMediaRuntimeApi()).setBackgroundColor(0);
                C354270Duj.LIZ(0L, new AwS549S0100000_5(this, 1151));
            }
        });
        ((C389960FQs) c1463860oCG.getPlayerApi()).setVideoOutputListener(new INLEListenerVideoOutput() { // from class: X.0F8f
            @Override // com.bytedance.ies.nle.editor_jni.INLEListenerVideoOutput
            public final void onRefresh(int i, long j) {
                if (j + ((long) 99000) >= this.LJIILIIL) {
                    ((C389960FQs) c1463860oCG.getPlayerApi()).stop();
                    ((C389960FQs) c1463860oCG.getPlayerApi()).prepare();
                    ((C389960FQs) c1463860oCG.getPlayerApi()).play();
                }
            }
        });
        this.LJIIL = c1463860oCG;
        new AwS549S0100000_5(this, 1157).invoke();
    }

    @Override // X.C0FGA
    public final void LJIIL(AwS584S0100000_5 awS584S0100000_5) {
        this.LJJIIJ = awS584S0100000_5;
    }

    public final Float LJIILJJIL(TextStickerModel textStickerModel) {
        TextureView textureView;
        FrameLayout frameLayout = this.LJJ;
        if (frameLayout != null && (textureView = this.LJIILJJIL) != null) {
            LJIJJLI(frameLayout, textureView, C0F8Y.LJIIL(textStickerModel));
        }
        if (C0F8Y.LJIIL(textStickerModel)) {
            return Float.valueOf(this.LJJII / this.LJJIII);
        }
        NLEModel model = this.LIZIZ.getModel();
        if (model != null) {
            return Float.valueOf(model.getCanvasRatio());
        }
        return null;
    }

    public final void LJIILL(Function0<Unit> function0) {
        if (!this.LJIIZILJ || !this.LJIJI || this.LJIJJ || this.LJIL.get()) {
            return;
        }
        function0.invoke();
    }

    public final void LJIJ(C1664680tQA<TextStickerModel> c1664680tQA) {
        TextureView.SurfaceTextureListener surfaceTextureListener;
        TextureView textureView;
        if (!this.LJIIZILJ || this.LJIL.get()) {
            return;
        }
        Function0<Boolean> function0 = this.LJIILL;
        if (function0 != null && function0.invoke().booleanValue()) {
            return;
        }
        TextureView textureView2 = this.LJIILJJIL;
        if ((textureView2 == null || textureView2.getSurfaceTextureListener() == null) && (surfaceTextureListener = this.LJIILLIIL) != null && (textureView = this.LJIILJJIL) != null) {
            textureView.setSurfaceTextureListener(surfaceTextureListener);
        }
        Float fLJIILJJIL = LJIILJJIL(c1664680tQA.LIZ);
        TextureView textureView3 = this.LJIILJJIL;
        if (textureView3 != null) {
            C786410Ut5.LLIIIILZ(textureView3, 0);
        }
        TextureView textureView4 = this.LJIILJJIL;
        if (textureView4 != null) {
            C786410Ut5.Q4(0.0f, textureView4);
        }
        new AwS249S0300000_5(this, (C0F8Z) c1664680tQA, (C1664680tQA<TextStickerModel>) fLJIILJJIL, (Float) 22).invoke();
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x02b3  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0345  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.bytedance.ies.nle.editor_jni.NLETrackSlot LJIJJ(com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextStickerModel r59) {
        /*
            Method dump skipped, instruction units count: 1520
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0F8Z.LJIJJ(com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextStickerModel):com.bytedance.ies.nle.editor_jni.NLETrackSlot");
    }

    public static void LJIJI(C0F8Z c0f8z, INLEListenerSeek iNLEListenerSeek) {
        INLEPlayer playerApi;
        c0f8z.getClass();
        C013C c013c = new C013C();
        C1463860oCG c1463860oCG = c0f8z.LJIIL;
        if (c1463860oCG != null && (playerApi = c1463860oCG.getPlayerApi()) != null) {
            ((C389960FQs) playerApi).seekTime(0L, NLESeekFlag.EDITOR_SEEK_FLAG_LastSeek, new C0FX2(c013c, iNLEListenerSeek, 11));
        }
        C354270Duj.LIZ(2000L, new AwS406S0200000_5(c013c, iNLEListenerSeek, 122));
    }

    @Override // X.C0FGA
    public final void LJI(TextStickerModel textStickerModel, AwS549S0100000_5 awS549S0100000_5) {
        TextureView.SurfaceTextureListener surfaceTextureListener;
        TextureView textureView;
        TextureView textureView2 = this.LJIILJJIL;
        if ((textureView2 == null || textureView2.getSurfaceTextureListener() == null) && (surfaceTextureListener = this.LJIILLIIL) != null && (textureView = this.LJIILJJIL) != null) {
            textureView.setSurfaceTextureListener(surfaceTextureListener);
        }
        Float fLJIILJJIL = LJIILJJIL(textStickerModel);
        TextureView textureView3 = this.LJIILJJIL;
        if (textureView3 != null) {
            C786410Ut5.LLIIIILZ(textureView3, 0);
        }
        TextureView textureView4 = this.LJIILJJIL;
        if (textureView4 != null) {
            C786410Ut5.Q4(0.0f, textureView4);
        }
        new AwS134S0400000_5(this, textStickerModel, fLJIILJJIL, awS549S0100000_5, 4).invoke();
    }

    public final void LJIIZILJ(LifecycleOwner lifecycleOwner, C1664680tQA<TextStickerModel> c1664680tQA) {
        if (this.LJIJ) {
            return;
        }
        this.LJIJ = true;
        c1664680tQA.LIZ(new C2217381BqS() { // from class: X.0F8i
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((TextStickerModel) obj).getTextStr();
            }
        }).LJIIIZ(lifecycleOwner, Lifecycle.State.STARTED, new AwS371S0200000_5(this, (C0F8Z) c1664680tQA, (C1664680tQA<TextStickerModel>) 229));
        c1664680tQA.LIZ(new C2217381BqS() { // from class: X.0F8e
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Integer.valueOf(((TextStickerModel) obj).getAlign());
            }
        }).LJIIIZ(lifecycleOwner, Lifecycle.State.STARTED, new AwS371S0200000_5(this, (C0F8Z) c1664680tQA, (C1664680tQA<TextStickerModel>) 230));
        c1664680tQA.LIZ(new C2217381BqS() { // from class: X.0F8d
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Integer.valueOf(((TextStickerModel) obj).getColor());
            }
        }).LJIIIZ(lifecycleOwner, Lifecycle.State.STARTED, new AwS371S0200000_5(this, (C0F8Z) c1664680tQA, (C1664680tQA<TextStickerModel>) 231));
        c1664680tQA.LIZ(new C2217371BqR() { // from class: X.0F8g
            @Override // X.C2217371BqR, X.AbstractC2217331BqN, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((TextStickerModel) obj).getFontModel();
            }

            @Override // X.C2217371BqR, X.AbstractC2217331BqN
            public final void set(Object obj, Object obj2) {
                ((TextStickerModel) obj).setFontModel((TextFontModel) obj2);
            }
        }).LJIIIZ(lifecycleOwner, Lifecycle.State.STARTED, new AwS371S0200000_5(this, (C0F8Z) c1664680tQA, (C1664680tQA<TextStickerModel>) 232));
        c1664680tQA.LIZ(new C2217371BqR() { // from class: X.0F8h
            @Override // X.C2217371BqR, X.AbstractC2217331BqN, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((TextStickerModel) obj).getTextTemplateModel();
            }

            @Override // X.C2217371BqR, X.AbstractC2217331BqN
            public final void set(Object obj, Object obj2) {
                ((TextStickerModel) obj).setTextTemplateModel((TextTemplateModel) obj2);
            }
        }).LJIIIZ(lifecycleOwner, Lifecycle.State.STARTED, new AwS371S0200000_5(this, (C0F8Z) c1664680tQA, (C1664680tQA<TextStickerModel>) 228));
    }

    public final void LJIJJLI(FrameLayout frameLayout, TextureView textureView, boolean z) {
        if (z) {
            int iIntValue = this.LJI;
            if (iIntValue == 0) {
                iIntValue = ((Number) this.LJII.getValue()).intValue();
            }
            int iLJIIJJI = C12ES.LJIIJJI(this.LIZ) + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(32)) + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(44));
            int iLIZIZ = iIntValue + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(72)) + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(56));
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
            layoutParams.topMargin = iLJIIJJI;
            layoutParams.bottomMargin = iLIZIZ;
            C786410Ut5.V5(textureView, layoutParams);
            this.LJJII = C1450870nrJ.LIZIZ;
            this.LJJIII = (frameLayout.getHeight() - iLJIIJJI) - iLIZIZ;
        } else {
            C786410Ut5.V5(textureView, new FrameLayout.LayoutParams(-1, -1));
        }
        Function1<? super ViewGroup.LayoutParams, Unit> function1 = this.LJJIIJ;
        if (function1 != null) {
            function1.invoke(textureView.getLayoutParams());
        }
    }

    @Override // X.C0FGA
    public final void LJIIJ(FrameLayout frameLayout, LifecycleOwner lifecycleOwner, C1664680tQA c1664680tQA, int i, AwS134S0400000_5 awS134S0400000_5) {
        if (this.LJIIZILJ) {
            if (this.LJI == 0) {
                this.LJI = i;
                C354270Duj.LIZ(0L, new AwS134S0400000_5(this, lifecycleOwner, c1664680tQA, awS134S0400000_5, 5));
                return;
            }
            return;
        }
        this.LJI = i;
        LJIIJJI(frameLayout);
        new AwS134S0400000_5(this, lifecycleOwner, c1664680tQA, awS134S0400000_5, 7).invoke();
    }

    public C0F8Z(Context context, NLEEditor nLEEditor, VideoPublishEditModel videoPublishEditModel, InterfaceC1455860nzM interfaceC1455860nzM, VESize vESize, LifecycleOwner lifecycleOwner) {
        float canvasRatio;
        this.LIZ = context;
        this.LIZIZ = nLEEditor;
        this.LIZJ = videoPublishEditModel;
        this.LIZLLL = interfaceC1455860nzM;
        this.LJ = vESize;
        this.LJFF = lifecycleOwner;
        NLEModel model = nLEEditor.getModel();
        if (model != null) {
            canvasRatio = model.getCanvasRatio();
        } else {
            canvasRatio = 0.5625f;
        }
        this.LJJI = canvasRatio;
        this.LJJII = 720;
        this.LJJIII = 1280;
    }
}
