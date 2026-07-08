package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.util.Size;
import android.view.Surface;
import android.view.SurfaceView;
import android.view.TextureView;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.ies.nle.editor_jni.INLEPurePlayer;
import com.bytedance.ies.nle.editor_jni.NLEVEEditorMode;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.canvas.CanvasVideoData;
import com.ss.android.ugc.aweme.creative.model.edit.multiedit.MultiEditVideoRecordData;
import com.ss.android.ugc.aweme.creative.model.edit.multiedit.MultiEditVideoStatusRecordData;
import com.ss.android.ugc.aweme.im.creative.common.api.model.data.IMCreativeEditModel;
import com.ss.android.ugc.aweme.services.dm.DMPublishService;
import com.ss.android.ugc.aweme.services.dm.IDMPublishService;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModelKt;
import com.ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment;
import com.ss.android.ugc.aweme.shortvideo.edit.model.VideoCutInfo;
import com.ss.android.ugc.aweme.shortvideo.edit.model.VideoFileInfo;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.cover.MvChooseCoverBitmapCreator;
import com.ss.android.ugc.aweme.wavepublish.dm.service.DMPhotoExportJob;
import com.ss.android.ugc.aweme.wavepublish.dm.service.IDMPhotoExportService;
import com.ss.android.vesdk.VEEditor;
import com.ss.android.vesdk.VEEditorModel;
import dmt.av.video.SingleImageCoverBitmapData;
import dmt.av.video.VEPreviewParams;
import java.io.InputStream;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS210S0000000_22;
import kotlin.jvm.internal.AwS388S0200000_22;
import kotlin.jvm.internal.AwS566S0100000_22;

/* JADX INFO: renamed from: X.0ntQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1452180ntQ implements InterfaceC1660990tKD {
    public final IMCreativeEditModel LIZ;
    public final Context LIZIZ;
    public final InterfaceC1445220niC LIZJ;
    public final C1440750naz LIZLLL;
    public C1452190ntR LJFF;
    public C1452400ntm LJI;
    public volatile boolean LJIIIIZZ;
    public volatile boolean LJIIIZ;
    public final C01GW LJ = C452501pT.LIZIZ(AFwS210S0000000_22.get$arr$(290));
    public final AtomicInteger LJII = new AtomicInteger(0);
    public final C01GW LJIIJ = C452501pT.LIZIZ(new AwS566S0100000_22(this, 810));

    @Override // X.InterfaceC1660990tKD
    public final void LIZJ() {
        C1463670oBx c1463670oBx;
        C1452190ntR c1452190ntR = this.LJFF;
        if (c1452190ntR != null) {
            c1452190ntR.release();
        }
        Unit unit = null;
        this.LJFF = null;
        if (this.LJIIIIZZ) {
            LJIILL();
        }
        if (!C296250BjL.LIZIZ() || this.LJI == null || this.LIZ.LIZIZ()) {
            return;
        }
        try {
            InterfaceC1452170ntP interfaceC1452170ntPLJJ = LJIIJJI().LJJ();
            if ((interfaceC1452170ntPLJJ instanceof C1463670oBx) && (c1463670oBx = (C1463670oBx) interfaceC1452170ntPLJJ) != null) {
                c1463670oBx.destroy();
                unit = Unit.LIZ;
            }
            C189200o6.m2constructorimpl(unit);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }

    @Override // X.InterfaceC1660990tKD
    public final void LJ() {
        C1452190ntR c1452190ntR = this.LJFF;
        if (c1452190ntR != null) {
            c1452190ntR.resume();
        }
    }

    @Override // X.InterfaceC1660990tKD
    public final void LJIIIIZZ() {
        C1452190ntR c1452190ntR = this.LJFF;
        if (c1452190ntR != null) {
            c1452190ntR.pause();
        }
    }

    public final AbstractC1452680nuE LJIIJJI() {
        return (AbstractC1452680nuE) this.LJ.getValue();
    }

    public final C1463670oBx LJIILIIL() {
        return (C1463670oBx) this.LJIIJ.getValue();
    }

    public final void LJIILL() {
        if (this.LJII.decrementAndGet() <= 0) {
            synchronized (this) {
                if (!this.LJIIIIZZ || this.LJIIIZ) {
                    return;
                }
                this.LJIIIZ = true;
                try {
                    LJIIJJI().LJJ().destroy();
                    C189200o6.m2constructorimpl(Unit.LIZ);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    C189200o6.m2constructorimpl(new C098200Yq(th));
                }
            }
        }
    }

    @Override // X.InterfaceC1660990tKD
    public final void surfaceDestroyed() {
        C1452190ntR c1452190ntR = this.LJFF;
        if (c1452190ntR != null) {
            c1452190ntR.pause();
        }
        C1463860oCG c1463860oCG = LJIILIIL().LJI;
        if (c1463860oCG == null) {
            c1463860oCG = null;
        }
        ((C389960FQs) c1463860oCG.getPlayerApi()).surfaceDestroyed();
    }

    @Override // X.InterfaceC1660990tKD
    public final C348240Dl0 LJI() {
        return LJIILIIL().LIZLLL().LJ().LIZIZ();
    }

    @Override // X.InterfaceC1660990tKD
    public final void LIZ(final String str) {
        if (this.LJIIIIZZ && !this.LJIIIZ) {
            String str2 = this.LIZ.creationId;
            final DMPhotoExportJob dMPhotoExportJob = new DMPhotoExportJob(str);
            IDMPhotoExportService.LIZ.getClass();
            IDMPhotoExportService value = C1435940nTE.LIZIZ.getValue();
            if (value != null) {
                value.LIZIZ(str2, dMPhotoExportJob);
            }
            this.LJII.incrementAndGet();
            final C013C c013c = new C013C();
            new MvChooseCoverBitmapCreator(LJIIJJI().LJJ(), str, 0, null, new InterfaceC1457180o1U() { // from class: X.0nta
                @Override // X.InterfaceC1457180o1U
                public final void onError(int i, String str3) {
                    C013C c013c2 = c013c;
                    DMPhotoExportJob dMPhotoExportJob2 = dMPhotoExportJob;
                    C1452180ntQ c1452180ntQ = this;
                    if (!c013c2.element) {
                        c013c2.element = true;
                        dMPhotoExportJob2.markDone(null);
                        c1452180ntQ.LJIILL();
                    }
                }
            }, new C0MBV(this) { // from class: X.0ntb
                public final /* synthetic */ C1452180ntQ LIZLLL;

                {
                    this.LIZLLL = this;
                }

                @Override // X.C0MBV
                public final void LIZLLL() {
                    C013C c013c2 = c013c;
                    DMPhotoExportJob dMPhotoExportJob2 = dMPhotoExportJob;
                    C1452180ntQ c1452180ntQ = this.LIZLLL;
                    String str3 = str;
                    if (c013c2.element) {
                        return;
                    }
                    c013c2.element = true;
                    dMPhotoExportJob2.markDone(str3);
                    c1452180ntQ.LJIILL();
                }
            }, true, false, false);
        }
    }

    @Override // X.InterfaceC1660990tKD
    public final void LIZIZ(Surface surface) {
        C1463860oCG c1463860oCG = LJIILIIL().LJI;
        if (c1463860oCG == null) {
            c1463860oCG = null;
        }
        INLEPurePlayer.DefaultImpls.surfaceCreated$default(c1463860oCG.getPlayerApi(), surface, false, 2, null);
    }

    @Override // X.InterfaceC1660990tKD
    public final void LIZLLL(Surface surface) {
        C1463860oCG c1463860oCG = LJIILIIL().LJI;
        if (c1463860oCG == null) {
            c1463860oCG = null;
        }
        INLEPurePlayer.DefaultImpls.setAndroidSurface$default(c1463860oCG.getPlayerApi(), surface, false, 2, null);
    }

    @Override // X.InterfaceC1660990tKD
    public final void LJII(C348240Dl0 c348240Dl0) {
        LJIILIIL().LIZLLL().LJ().LJIJ(c348240Dl0, true, false);
    }

    @Override // X.InterfaceC1660990tKD
    public final void LJIIJ(AwS388S0200000_22 awS388S0200000_22) {
        VideoPublishEditModelKt videoPublishEditModelKt;
        C1452400ntm c1452400ntm = this.LJI;
        if (c1452400ntm == null) {
            return;
        }
        String strZf = LJIILIIL().Zf();
        VEEditorModel vEEditorModelFf = LJIILIIL().ff();
        C1452210ntT c1452210ntTLJIIL = LJIIL(false, c1452400ntm.LIZIZ);
        Pair pairCreateVideoPublishEditModel$default = IDMPublishService.DefaultImpls.createVideoPublishEditModel$default(DMPublishService.INSTANCE, c1452400ntm.LIZJ, "", vEEditorModelFf.videoPaths, vEEditorModelFf.audioPaths, c1452210ntTLJIIL.LIZ, c1452210ntTLJIIL.LIZIZ, c1452210ntTLJIIL.LIZLLL, c1452210ntTLJIIL.LJFF, c1452210ntTLJIIL.LJ, c1452210ntTLJIIL.LJI, 0, false, false, false, null, true, 28672, null);
        Object second = pairCreateVideoPublishEditModel$default.getSecond();
        if ((second instanceof VideoPublishEditModel) && (videoPublishEditModelKt = (VideoPublishEditModelKt) second) != null) {
            videoPublishEditModelKt.setNleData(strZf);
        }
        awS388S0200000_22.invoke(pairCreateVideoPublishEditModel$default.getSecond());
    }

    public final VEPreviewParams LJIILJJIL(C1452400ntm c1452400ntm) {
        long j;
        long j2;
        Uri uri = c1452400ntm.LIZIZ;
        C1452210ntT c1452210ntTLJIIL = LJIIL(c1452400ntm.LIZLLL, uri);
        C1440750naz c1440750naz = this.LIZLLL;
        int i = c1452210ntTLJIIL.LIZ;
        int i2 = c1452210ntTLJIIL.LIZIZ;
        c1440750naz.getClass();
        Size sizeLIZ = C1440750naz.LIZ();
        if (i > 0 && i2 > 0) {
            Size size = new Size(i, i2);
            sizeLIZ = size.getHeight() * C1440750naz.LIZ().getWidth() > C1440750naz.LIZ().getHeight() * size.getWidth() ? size.getHeight() > C1440750naz.LIZ().getHeight() ? C1440750naz.LIZ() : new Size((size.getHeight() * C1440750naz.LIZ().getWidth()) / C1440750naz.LIZ().getHeight(), size.getHeight()) : size.getWidth() > C1440750naz.LIZ().getWidth() ? C1440750naz.LIZ() : new Size(size.getWidth(), (size.getWidth() * C1440750naz.LIZ().getHeight()) / C1440750naz.LIZ().getWidth());
        }
        VEPreviewParams vEPreviewParams = new VEPreviewParams();
        String[] strArr = {uri.toString()};
        int i3 = c1452210ntTLJIIL.LIZ;
        int i4 = c1452210ntTLJIIL.LIZIZ;
        if (c1452400ntm.LIZLLL) {
            j = 1;
        } else {
            j = c1452210ntTLJIIL.LIZLLL;
        }
        VideoFileInfo videoFileInfo = new VideoFileInfo(i3, i4, j, c1452210ntTLJIIL.LJFF, c1452210ntTLJIIL.LJ, c1452210ntTLJIIL.LJI, 0, 0, 0.0f, 448, null);
        if (c1452400ntm.LIZLLL) {
            j2 = 1;
        } else {
            j2 = c1452210ntTLJIIL.LIZLLL;
        }
        VideoCutInfo videoCutInfo = new VideoCutInfo(0L, j2, 1.0f, c1452210ntTLJIIL.LIZJ);
        vEPreviewParams.mVideoPaths = strArr;
        vEPreviewParams.mWorkspace = c1452400ntm.LIZ;
        vEPreviewParams.mPageType = 1;
        vEPreviewParams.mPageMode = 100;
        vEPreviewParams.videoEditorType = 11;
        vEPreviewParams.isFormRecord = true;
        vEPreviewParams.setReuseSurfaceView(false);
        vEPreviewParams.mVolume = 1.0f;
        vEPreviewParams.mRotateArray = new int[]{videoCutInfo.getRotate()};
        vEPreviewParams.mSpeedArray = new float[]{videoCutInfo.getSpeed()};
        vEPreviewParams.mVTrimIn = new int[]{(int) videoCutInfo.getStart()};
        vEPreviewParams.mVTrimOut = new int[]{(int) videoCutInfo.getEnd()};
        vEPreviewParams.mCanvasWidth = sizeLIZ.getWidth();
        vEPreviewParams.mCanvasHeight = sizeLIZ.getHeight();
        vEPreviewParams.mPreviewWidth = sizeLIZ.getWidth();
        int height = sizeLIZ.getHeight();
        vEPreviewParams.mPreviewHeight = height;
        if (vEPreviewParams.mPreviewWidth > 0 && height > 0) {
            EditVideoSegment editVideoSegment = new EditVideoSegment(uri.toString(), null, videoFileInfo, 2, null);
            editVideoSegment.setVideoCutInfo(videoCutInfo);
            editVideoSegment.setImage(c1452400ntm.LIZLLL);
            if (c1452400ntm.LIZLLL) {
                vEPreviewParams.singleImageCoverBitmapData = new SingleImageCoverBitmapData(uri.toString(), vEPreviewParams.mPreviewWidth, System.currentTimeMillis(), 1, vEPreviewParams.mPreviewWidth, vEPreviewParams.mPreviewHeight, c1452400ntm.LIZJ, false);
                vEPreviewParams.canvasVideoPreviewData = new CanvasVideoData(C13LQ.LJLI(strArr), C13LQ.LJLI(strArr), null, null, null, 0, null, 0, null, null, null, null, 4092, null);
                return vEPreviewParams;
            }
            MultiEditVideoStatusRecordData multiEditVideoStatusRecordData = new MultiEditVideoStatusRecordData();
            MultiEditVideoRecordData multiEditVideoRecordDataLIZIZ = C574800MgY.LIZIZ(Collections.singletonList(editVideoSegment));
            MultiEditVideoRecordData multiEditVideoRecordDataCloneData = null;
            if (multiEditVideoRecordDataLIZIZ != null) {
                multiEditVideoRecordDataLIZIZ.isSingleVideo = true;
                multiEditVideoRecordDataLIZIZ.endTime = videoFileInfo.getDuration();
            } else {
                multiEditVideoRecordDataLIZIZ = null;
            }
            multiEditVideoStatusRecordData.curMultiEditVideoRecordData = multiEditVideoRecordDataLIZIZ;
            if (multiEditVideoRecordDataLIZIZ != null) {
                multiEditVideoRecordDataCloneData = multiEditVideoRecordDataLIZIZ.cloneData();
            }
            multiEditVideoStatusRecordData.originMultiEditRecordData = multiEditVideoRecordDataCloneData;
            vEPreviewParams.recordData = multiEditVideoStatusRecordData;
            vEPreviewParams.canvasVideoPreviewData = new CanvasVideoData(C13LQ.LJLI(strArr), C13LQ.LJLI(strArr), null, null, null, 0, null, 0, null, null, null, null, 4092, null);
            return vEPreviewParams;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("preview width or height can not be 0, width=");
        sbLIZ.append(vEPreviewParams.mPreviewWidth);
        sbLIZ.append(", height=");
        sbLIZ.append(vEPreviewParams.mPreviewHeight);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        strLIZIZ.toString();
        throw new IllegalStateException(strLIZIZ);
    }

    @Override // X.InterfaceC1660990tKD
    public final float LJLILLLLZI(String str) {
        return LJIILIIL().LIZLLL().LJ().LIZ().getColorFilterIntensity(str);
    }

    @Override // X.InterfaceC1660990tKD
    public final void LJIIIZ(C1452400ntm c1452400ntm, TextureView textureView) {
        this.LJI = c1452400ntm;
        C1452190ntR c1452190ntR = new C1452190ntR(c1452400ntm.LIZ, textureView);
        this.LJFF = c1452190ntR;
        c1452190ntR.LIZJ(c1452400ntm.LIZIZ.getPath());
        C1452190ntR c1452190ntR2 = this.LJFF;
        if (c1452190ntR2 != null) {
            c1452190ntR2.setLoop(true);
        }
        C1452190ntR c1452190ntR3 = this.LJFF;
        if (c1452190ntR3 != null) {
            c1452190ntR3.LIZIZ(0L);
        }
        C1452190ntR c1452190ntR4 = this.LJFF;
        if (c1452190ntR4 != null) {
            c1452190ntR4.LIZ(1.0d);
        }
        C1452190ntR c1452190ntR5 = this.LJFF;
        if (c1452190ntR5 != null) {
            new Surface(textureView.getSurfaceTexture());
            c1452190ntR5.start();
        }
        LJIILIIL().We(new InterfaceC1464190oCn() { // from class: X.0ntd
            @Override // X.InterfaceC1464190oCn
            public final void onRendered() {
                this.LIZ.LIZJ.onEvent(C1445180ni8.LIZIZ);
            }
        });
        if (!c1452400ntm.LIZLLL) {
            LJIILIIL().prepare();
            LJIILIIL().nf(0, VEEditor.SEEK_MODE.EDITOR_SEEK_FLAG_LastSeek);
            LJIILIIL().play();
        }
        C1463670oBx c1463670oBxLJIILIIL = LJIILIIL();
        NLEVEEditorMode nLEVEEditorMode = NLEVEEditorMode.PREVIEW_ONLY;
        C1463860oCG c1463860oCG = c1463670oBxLJIILIIL.LJI;
        if (c1463860oCG == null) {
            c1463860oCG = null;
        }
        ((C389960FQs) c1463860oCG.getPlayerApi()).setEditorMode(nLEVEEditorMode);
        if (!c1452400ntm.LIZLLL) {
            LJIILIIL().LJ.commit();
            LJIILIIL().LJ.done();
        }
    }

    public final C1452210ntT LJIIL(boolean z, Uri uri) {
        int i;
        if (z) {
            InputStream inputStreamLJ = C09NT.LJ(this.LIZIZ.getContentResolver(), uri);
            if (inputStreamLJ != null) {
                int iLJFF = new C2259271Dbp(inputStreamLJ).LJFF(1);
                if (iLJFF != 3) {
                    if (iLJFF != 6) {
                        if (iLJFF != 8) {
                            i = 0;
                        } else {
                            i = 270;
                        }
                    } else {
                        i = 90;
                    }
                } else {
                    i = 180;
                }
                InputStream inputStreamLJ2 = C09NT.LJ(this.LIZIZ.getContentResolver(), uri);
                if (inputStreamLJ2 != null) {
                    BitmapFactory.Options options = new BitmapFactory.Options();
                    options.inJustDecodeBounds = true;
                    BitmapFactory.decodeStream(inputStreamLJ2, null, options);
                    Size size = new Size(options.outWidth, options.outHeight);
                    return new C1452210ntT(size.getWidth(), size.getHeight(), i, 4000, 0, 0, 480, uri.toString(), "image");
                }
                throw new IllegalArgumentException("null input stream");
            }
            throw new IllegalArgumentException("null input stream");
        }
        return C20137513qn.LIZ.LIZ(uri.toString());
    }

    @Override // X.InterfaceC1660990tKD
    public final void surfaceChanged(int i, int i2) {
        C1463860oCG c1463860oCG = LJIILIIL().LJI;
        if (c1463860oCG == null) {
            c1463860oCG = null;
        }
        ((C389960FQs) c1463860oCG.getPlayerApi()).surfaceChanged(i, i2);
    }

    @Override // X.InterfaceC1660990tKD
    public final void LJFF(C1452400ntm c1452400ntm, SurfaceView surfaceView, LifecycleOwner lifecycleOwner) {
        Bitmap bitmapLIZ;
        synchronized (this) {
            this.LJI = c1452400ntm;
            VEPreviewParams vEPreviewParamsLJIILJJIL = LJIILJJIL(c1452400ntm);
            LJIIJJI().LJIL = new InterfaceC1464190oCn() { // from class: X.0ntc
                @Override // X.InterfaceC1464190oCn
                public final void onRendered() {
                    this.LIZ.LIZJ.onEvent(C1445180ni8.LIZIZ);
                }
            };
            LJIIJJI().LJJII(surfaceView.getContext(), vEPreviewParamsLJIILJJIL, surfaceView, lifecycleOwner);
            LJIIJJI().LJJI(LJIIJJI().LJII(vEPreviewParamsLJIILJJIL).getModel(), false);
            AbstractC1452680nuE abstractC1452680nuELJIIJJI = LJIIJJI();
            abstractC1452680nuELJIIJJI.getClass();
            abstractC1452680nuELJIIJJI.LJIJ().df(new C1452220ntU(abstractC1452680nuELJIIJJI));
            LJIIJJI().LJJIIJ(true);
            if (!c1452400ntm.LIZLLL) {
                LJIILIIL().prepare();
                LJIILIIL().nf(0, VEEditor.SEEK_MODE.EDITOR_SEEK_FLAG_LastSeek);
                LJIILIIL().play();
            }
            C1463670oBx c1463670oBxLJIILIIL = LJIILIIL();
            NLEVEEditorMode nLEVEEditorMode = NLEVEEditorMode.PREVIEW_ONLY;
            C1463860oCG c1463860oCG = c1463670oBxLJIILIIL.LJI;
            if (c1463860oCG == null) {
                c1463860oCG = null;
            }
            ((C389960FQs) c1463860oCG.getPlayerApi()).setEditorMode(nLEVEEditorMode);
            C1463670oBx c1463670oBxLJIILIIL2 = LJIILIIL();
            SingleImageCoverBitmapData singleImageCoverBitmapData = vEPreviewParamsLJIILJJIL.singleImageCoverBitmapData;
            if (singleImageCoverBitmapData != null && singleImageCoverBitmapData.getItemCoverWidth() > 0 && (bitmapLIZ = C0L06.LIZ(singleImageCoverBitmapData, false)) != null) {
                c1463670oBxLJIILIIL2.mg(bitmapLIZ);
            }
            if (!c1452400ntm.LIZLLL) {
                LJIILIIL().LJ.commit();
                LJIILIIL().LJ.done();
            }
            this.LJIIIIZZ = true;
            this.LJII.set(1);
        }
    }

    public C1452180ntQ(IMCreativeEditModel iMCreativeEditModel, Context context, InterfaceC1445220niC interfaceC1445220niC, C1440750naz c1440750naz) {
        this.LIZ = iMCreativeEditModel;
        this.LIZIZ = context;
        this.LIZJ = interfaceC1445220niC;
        this.LIZLLL = c1440750naz;
    }
}
