package X;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.media.MediaMetadataRetriever;
import com.bytedance.ies.nle.editor_jni.NLEEditor;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.canvas.CanvasBackground;
import com.ss.android.ugc.aweme.canvas.CanvasExtra;
import com.ss.android.ugc.aweme.canvas.CanvasGestureConfig;
import com.ss.android.ugc.aweme.canvas.CanvasVideoData;
import com.ss.android.ugc.aweme.creative.model.edit.multiedit.MultiEditVideoRecordData;
import com.ss.android.ugc.aweme.creative.model.edit.multiedit.MultiEditVideoStatusRecordData;
import com.ss.android.ugc.aweme.photo.PhotoContext;
import com.ss.android.ugc.aweme.services.external.ability.IAVProcessService;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.model.EditPreviewInfo;
import com.ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment;
import com.ss.android.ugc.aweme.shortvideo.edit.model.VideoFileInfo;
import com.ss.android.vesdk.VEVideoEncodeSettings;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Pair;
import kotlin.jvm.internal.AwS51S2100000_8;
import kotlin.jvm.internal.AwS552S0100000_8;

/* JADX INFO: renamed from: X.0MTt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C569110MTt implements IAVProcessService {
    public C1463670oBx LIZ;

    @Override // com.ss.android.ugc.aweme.services.external.ability.IAVProcessService
    public final Pair<Integer, Integer> calculateGradientBackground(Bitmap bitmap) {
        CanvasBackground canvasBackground = (CanvasBackground) C23250099c.LJ(C23271099x.INSTANCE, new C567080MLy(bitmap, null));
        return new Pair<>(Integer.valueOf(canvasBackground.getStartColor()), Integer.valueOf(canvasBackground.getEndColor()));
    }

    @Override // com.ss.android.ugc.aweme.services.external.ability.IAVProcessService
    public final int[] getVideoFileInfo(String str) {
        return C2486109oh.LJ(str);
    }

    @Override // com.ss.android.ugc.aweme.services.external.ability.IAVProcessService
    public final void muteVideo(String str, String str2, IAVProcessService.IProcessCallback<Integer> iProcessCallback) {
        C569150MTx c569150MTx = new C569150MTx();
        c569150MTx.LIZJ = false;
        c569150MTx.LIZIZ = new AwS51S2100000_8(str, str2, iProcessCallback, 0);
        c569150MTx.LIZ = new AwS552S0100000_8(iProcessCallback, (IAVProcessService.IProcessCallback<Integer>) 986);
        c569150MTx.LIZ();
    }

    @Override // com.ss.android.ugc.aweme.services.external.ability.IAVProcessService
    public final void compressPhoto(String str, Integer num, Integer num2, IAVProcessService.IProcessCallback<String> iProcessCallback) {
        PhotoContext photoContextLIZ;
        String str2;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PhotoServiceMonitor===> enter compressPhoto ");
        sbLIZ.append(System.currentTimeMillis());
        C201955140j.LJ(C2188811AlT.LIZIZ(sbLIZ));
        String str3 = null;
        if (num != null && num2 != null) {
            photoContextLIZ = C2477409nI.LIZ(str, new C0LFI(C0DMI.LIZIZ(null)), num.intValue(), num2.intValue());
        } else {
            photoContextLIZ = C2477409nI.LIZ(str, new C0LFI(C0DMI.LIZIZ(null)), 1080, 1920);
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("PhotoServiceMonitor===> return compressPhoto ");
        sbLIZ2.append(System.currentTimeMillis());
        C201955140j.LJ(C2188811AlT.LIZIZ(sbLIZ2));
        if (iProcessCallback != null) {
            if (photoContextLIZ != null && (str2 = photoContextLIZ.mPhotoLocalPath) != null) {
                str3 = str2;
            }
            iProcessCallback.finish(str3);
        }
    }

    @Override // com.ss.android.ugc.aweme.services.external.ability.IAVProcessService
    public final void convertImageToVideo(String str, String str2, final String str3, long j, int i, final IAVProcessService.IConvertImageToVideoCallback iConvertImageToVideoCallback) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(str, options);
        int iLJI = options.outWidth;
        if (iLJI <= 0) {
            iLJI = C1450870nrJ.LJI();
        }
        int iLJFF = options.outHeight;
        if (iLJFF <= 0) {
            iLJFF = C1450870nrJ.LJFF();
        }
        EditVideoSegment editVideoSegment = new EditVideoSegment("", null, new VideoFileInfo(iLJI, iLJFF, j, 0, 0, 0, 0, 0, 0.0f, 504, null));
        VideoPublishEditModel videoPublishEditModel = new VideoPublishEditModel();
        videoPublishEditModel.refreshOldFieldIfNeeded();
        videoPublishEditModel.setMMusicPath(str2);
        videoPublishEditModel.setMMusicStart(i);
        videoPublishEditModel.setMusicVolume(1.0f);
        videoPublishEditModel.setCanvasVideoData(new CanvasVideoData(C1697810uHb.LJIILJJIL(str), null, null, null, new CanvasExtra(0, iLJI, iLJFF, 0, (int) j, 0.15f, 20.0f, false, new CanvasGestureConfig(true, true, true, true, false, 2, false, false, false), null, 1.0f, 0L, 0), 0, null, 0, null, null, null, null, 4078, null));
        videoPublishEditModel.setPreviewInfo(new C538330L9j(iLJI, iLJFF, 12).LIZ(editVideoSegment));
        videoPublishEditModel.setVideoEditorType(11);
        videoPublishEditModel.setVideoCanvasWidth(iLJI);
        videoPublishEditModel.setVideoCanvasHeight(iLJFF);
        C1463670oBx c1463670oBxLIZLLL = C1449720npS.LIZLLL(videoPublishEditModel, null, 6);
        this.LIZ = c1463670oBxLIZLLL;
        NLEEditor nLEEditor = c1463670oBxLIZLLL.LIZLLL().LIZ;
        nLEEditor.done();
        videoPublishEditModel.setNleData(nLEEditor.store());
        C1780100wQK c1780100wQK = new C1780100wQK(2);
        c1780100wQK.LIZIZ.compileType = VEVideoEncodeSettings.COMPILE_TYPE.COMPILE_TYPE_MP4;
        VEVideoEncodeSettings vEVideoEncodeSettingsLIZ = c1780100wQK.LIZ();
        C1463670oBx c1463670oBx = this.LIZ;
        if (c1463670oBx != null) {
            c1463670oBx.Qe(str3, null, vEVideoEncodeSettingsLIZ, new InterfaceC574560MgA() { // from class: X.0MTu
                @Override // X.InterfaceC574560MgA
                public final void onCompileDone() {
                    iConvertImageToVideoCallback.onSuccess(str3);
                    C569110MTt c569110MTt = this;
                    C1463670oBx c1463670oBx2 = c569110MTt.LIZ;
                    if (c1463670oBx2 != null) {
                        c1463670oBx2.destroy();
                        c569110MTt.LIZ = null;
                    }
                }

                @Override // X.InterfaceC574560MgA
                public final void onCompileProgress(float f) {
                    iConvertImageToVideoCallback.onProgress(f);
                }

                @Override // X.InterfaceC574560MgA
                public final void onCompileError(int i2, int i3, float f, String str4) {
                    iConvertImageToVideoCallback.onFailure();
                    C569110MTt c569110MTt = this;
                    C1463670oBx c1463670oBx2 = c569110MTt.LIZ;
                    if (c1463670oBx2 != null) {
                        c1463670oBx2.destroy();
                        c569110MTt.LIZ = null;
                    }
                }
            });
        } else {
            iConvertImageToVideoCallback.onFailure();
        }
    }

    @Override // com.ss.android.ugc.aweme.services.external.ability.IAVProcessService
    public final void convertLivePhotoToVideo(String str, String str2, final String str3, long j, int i, int i2, final IAVProcessService.IConvertImageToVideoCallback iConvertImageToVideoCallback) throws IOException {
        Pair pair;
        int iLJI;
        int iLJFF;
        MultiEditVideoStatusRecordData multiEditVideoStatusRecordData;
        Integer numValueOf;
        Integer numValueOf2;
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        try {
            try {
                mediaMetadataRetriever.setDataSource(str);
                String strLJII = C20144413ru.LJII(mediaMetadataRetriever);
                if (strLJII != null) {
                    numValueOf = Integer.valueOf(Integer.parseInt(strLJII));
                } else {
                    numValueOf = null;
                }
                String strLJFF = C20144413ru.LJFF(mediaMetadataRetriever);
                if (strLJFF != null) {
                    numValueOf2 = Integer.valueOf(Integer.parseInt(strLJFF));
                } else {
                    numValueOf2 = null;
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
            if (numValueOf != null && numValueOf2 != null) {
                pair = new Pair(numValueOf, numValueOf2);
            } else {
                pair = null;
            }
            mediaMetadataRetriever.release();
            if (pair != null) {
                iLJI = ((Number) pair.getFirst()).intValue();
                iLJFF = ((Number) pair.getSecond()).intValue();
            } else {
                iLJI = C1450870nrJ.LJI();
                iLJFF = C1450870nrJ.LJFF();
            }
            EditVideoSegment editVideoSegment = new EditVideoSegment(str, null, new VideoFileInfo(iLJI, iLJFF, j / ((long) i2), 0, 0, 0, 0, 0, 0.0f, 504, null));
            ArrayList arrayList = new ArrayList();
            boolean z = true;
            if (1 <= i2) {
                int i3 = 1;
                while (true) {
                    arrayList.add(editVideoSegment);
                    if (i3 == i2) {
                        break;
                    } else {
                        i3++;
                    }
                }
            }
            VideoPublishEditModel videoPublishEditModel = new VideoPublishEditModel();
            videoPublishEditModel.refreshOldFieldIfNeeded();
            videoPublishEditModel.setMMusicPath(str2);
            videoPublishEditModel.setMMusicStart(i);
            videoPublishEditModel.setMusicVolume(1.0f);
            videoPublishEditModel.setPreviewInfo(new C538310L9h(iLJI, iLJFF, 28).LIZ(arrayList));
            EditPreviewInfo previewInfo = videoPublishEditModel.getPreviewInfo();
            long jLIZ = C536240L1i.LIZ();
            MultiEditVideoRecordData multiEditVideoRecordDataLIZIZ = C574800MgY.LIZIZ(previewInfo.getVideoList());
            if (multiEditVideoRecordDataLIZIZ == null) {
                multiEditVideoStatusRecordData = null;
            } else {
                multiEditVideoStatusRecordData = new MultiEditVideoStatusRecordData();
                Iterator it2 = arrayList.iterator();
                long duration = 0;
                while (it2.hasNext()) {
                    duration += ((EditVideoSegment) it2.next()).getVideoFileInfo().getDuration();
                }
                multiEditVideoRecordDataLIZIZ.endTime = Math.min(duration, jLIZ);
                if (multiEditVideoStatusRecordData.curMultiEditVideoRecordData == null) {
                    if (multiEditVideoRecordDataLIZIZ.segmentDataList.size() != 1) {
                        z = false;
                    }
                    multiEditVideoRecordDataLIZIZ.isSingleVideo = z;
                    multiEditVideoStatusRecordData.originMultiEditRecordData = multiEditVideoRecordDataLIZIZ.cloneData();
                }
                multiEditVideoStatusRecordData.curMultiEditVideoRecordData = multiEditVideoRecordDataLIZIZ;
            }
            videoPublishEditModel.setMultiEditVideoRecordData(multiEditVideoStatusRecordData);
            videoPublishEditModel.setVideoEditorType(10);
            videoPublishEditModel.setVideoCanvasWidth(iLJI);
            videoPublishEditModel.setVideoCanvasHeight(iLJFF);
            C1463670oBx c1463670oBxLIZLLL = C1449720npS.LIZLLL(videoPublishEditModel, null, 6);
            this.LIZ = c1463670oBxLIZLLL;
            NLEEditor nLEEditor = c1463670oBxLIZLLL.LIZLLL().LIZ;
            nLEEditor.done();
            videoPublishEditModel.setNleData(nLEEditor.store());
            C1780100wQK c1780100wQK = new C1780100wQK(2);
            c1780100wQK.LIZIZ.compileType = VEVideoEncodeSettings.COMPILE_TYPE.COMPILE_TYPE_MP4;
            VEVideoEncodeSettings vEVideoEncodeSettingsLIZ = c1780100wQK.LIZ();
            C1463670oBx c1463670oBx = this.LIZ;
            if (c1463670oBx != null) {
                c1463670oBx.Qe(str3, null, vEVideoEncodeSettingsLIZ, new InterfaceC574560MgA() { // from class: X.0MTv
                    @Override // X.InterfaceC574560MgA
                    public final void onCompileDone() {
                        iConvertImageToVideoCallback.onSuccess(str3);
                        C569110MTt c569110MTt = this;
                        C1463670oBx c1463670oBx2 = c569110MTt.LIZ;
                        if (c1463670oBx2 != null) {
                            c1463670oBx2.destroy();
                            c569110MTt.LIZ = null;
                        }
                    }

                    @Override // X.InterfaceC574560MgA
                    public final void onCompileProgress(float f) {
                        iConvertImageToVideoCallback.onProgress(f);
                    }

                    @Override // X.InterfaceC574560MgA
                    public final void onCompileError(int i4, int i5, float f, String str4) {
                        iConvertImageToVideoCallback.onFailure();
                        C569110MTt c569110MTt = this;
                        C1463670oBx c1463670oBx2 = c569110MTt.LIZ;
                        if (c1463670oBx2 != null) {
                            c1463670oBx2.destroy();
                            c569110MTt.LIZ = null;
                        }
                    }
                });
            } else {
                iConvertImageToVideoCallback.onFailure();
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            mediaMetadataRetriever.release();
            throw th;
        }
    }
}
