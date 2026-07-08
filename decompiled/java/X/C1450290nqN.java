package X;

import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLEPlayerPreviewMode;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.ss.android.ugc.aweme.creative.model.edit.EditImageInfo;
import com.ss.android.ugc.aweme.creative.model.edit.ImageTransformParams;
import com.ss.android.ugc.aweme.creative.model.edit.SingleImageData;
import com.ss.android.ugc.aweme.creative.model.edit.SrcLiveVideoInfo;
import com.ss.android.ugc.aweme.creative.model.edit.StoryMultiImageParams;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.util.HashMap;
import kotlin.jvm.internal.AwS266S0300000_22;

/* JADX INFO: renamed from: X.0nqN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1450290nqN extends AbstractC1450210nqF {
    @Override // X.AbstractC1450210nqF
    public final String LIZIZ() {
        return "static_model";
    }

    @Override // X.AbstractC1450210nqF
    public final void LJ(C1450180nqC c1450180nqC) {
    }

    @Override // X.AbstractC1450210nqF
    public final void LIZ(C1450180nqC c1450180nqC) {
        StoryMultiImageParams storyMultiImageParams;
        InterfaceC1452170ntP interfaceC1452170ntP = c1450180nqC.LJ;
        if (interfaceC1452170ntP != null) {
            C0EM4.LIZ();
            NLEModel nLEModelLIZ = C1450170nqB.LIZ(c1450180nqC);
            NLETrack mainTrack = nLEModelLIZ.getMainTrack();
            if (mainTrack != null) {
                mainTrack.clearSlot();
            }
            if (C2489309pD.LIZ()) {
                storyMultiImageParams = c1450180nqC.LIZ.getEditImageInfo().getStoryMultiImageParams();
            } else {
                storyMultiImageParams = null;
            }
            NLETrackSlot nLETrackSlotLIZJ = C1450170nqB.LIZJ(c1450180nqC.LIZ.getSrcImageInfo(), 0L, storyMultiImageParams, 4);
            NLETrack mainTrack2 = nLEModelLIZ.getMainTrack();
            if (mainTrack2 != null) {
                mainTrack2.addSlot(nLETrackSlotLIZJ);
            }
            EditImageInfo editImageInfo = c1450180nqC.LIZ.getEditImageInfo();
            if (editImageInfo.getRatioMode() != -1) {
                ImageTransformParams canvasTransformParams = editImageInfo.getCanvasTransformParams();
                if (canvasTransformParams != null) {
                    nLETrackSlotLIZJ.setScale(canvasTransformParams.getScale());
                    nLETrackSlotLIZJ.setTransformX(canvasTransformParams.getTransformX());
                    nLETrackSlotLIZJ.setTransformY(canvasTransformParams.getTransformY());
                    nLETrackSlotLIZJ.setRotation(canvasTransformParams.getRotation());
                    nLETrackSlotLIZJ.setMirror_X(canvasTransformParams.getMirrorX());
                }
                HashMap<String, String> extraMap = editImageInfo.getExtraMap();
                String str = extraMap.get("ep_crop_mode");
                if (str != null) {
                    nLETrackSlotLIZJ.setExtra("ep_crop_mode", str);
                }
                String str2 = extraMap.get("crop_slider_rotation");
                if (str2 != null) {
                    nLETrackSlotLIZJ.setExtra("crop_slider_rotation", str2);
                }
                String str3 = extraMap.get("crop_button_rotation");
                if (str3 != null) {
                    nLETrackSlotLIZJ.setExtra("crop_button_rotation", str3);
                }
                String str4 = extraMap.get("crop_is_photo_cropped");
                if (str4 != null) {
                    nLETrackSlotLIZJ.setExtra("crop_is_photo_cropped", str4);
                }
                String str5 = extraMap.get("crop_mirror_x");
                if (str5 != null) {
                    nLETrackSlotLIZJ.setExtra("crop_mirror_x", str5);
                }
            }
            interfaceC1452170ntP.Ve(nLEModelLIZ);
            SrcLiveVideoInfo srcLiveInfo = c1450180nqC.LIZ.getSrcLiveInfo();
            if (srcLiveInfo != null) {
                srcLiveInfo.setDuration((int) 500);
            }
            NLETrack mainTrack3 = nLEModelLIZ.getMainTrack();
            if (mainTrack3 != null) {
                mainTrack3.setEndTime(((long) LSPassThroughRecordSizeConfig.DEFAULT) * 500);
            }
        }
    }

    @Override // X.AbstractC1450210nqF
    public final Integer LIZLLL(C1450180nqC c1450180nqC) {
        return 500;
    }

    @Override // X.AbstractC1450210nqF
    public final void LJFF(C1450180nqC c1450180nqC, final InterfaceC1450310nqP interfaceC1450310nqP) {
        InterfaceC1452170ntP interfaceC1452170ntP = c1450180nqC.LJ;
        if (interfaceC1452170ntP != null) {
            interfaceC1452170ntP.jg();
        }
        NLEModel nLEModelLIZ = C1450170nqB.LIZ(c1450180nqC);
        if (interfaceC1450310nqP != null) {
            interfaceC1450310nqP.LIZIZ();
        }
        final InterfaceC1452170ntP interfaceC1452170ntP2 = c1450180nqC.LJ;
        if (interfaceC1452170ntP2 != null) {
            C1449990npt c1449990npt = C1449990npt.LIZ;
            C1463670oBx c1463670oBx = (C1463670oBx) interfaceC1452170ntP2;
            SingleImageData singleImageData = c1450180nqC.LIZ;
            c1449990npt.getClass();
            C1449990npt.LJI(c1463670oBx, nLEModelLIZ, singleImageData);
            c1463670oBx.LIZLLL().LIZIZ.getMediaRuntimeApi().setPreviewFillMode(NLEPlayerPreviewMode.FILL);
            c1463670oBx.LIZLLL().LIZIZ.getPlayerApi().prepare();
            if (!C0BVX.LIZ() || !c1450180nqC.LIZ.isCameraPhotoFirstTimeShowInEditPage()) {
                c1463670oBx.bg(0, new InterfaceC1464140oCi() { // from class: X.0nqO
                    @Override // X.InterfaceC1464140oCi
                    public final int onGetImageData(byte[] bArr, int i, int i2, int i3, float f) {
                        C01TT.LIZLLL(new AwS266S0300000_22(interfaceC1450310nqP, interfaceC1452170ntP2, this, 23));
                        return 0;
                    }
                });
            }
        }
    }
}
