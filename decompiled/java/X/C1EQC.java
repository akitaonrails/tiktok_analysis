package X;

import com.bytedance.ies.nle.editor_jni.INLEStickerRuntime;
import com.bytedance.ies.nle.editor_jni.NLEPosition;
import com.bytedance.ies.nle.editor_jni.NLERectF;
import com.bytedance.ies.nle.editor_jni.NLEStickerController;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;

/* JADX INFO: renamed from: X.1EQC, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
public final class C1EQC extends C0FRA implements INLEStickerRuntime {
    public final NLEStickerController LIZJ() {
        C1464240oCs c1464240oCs = this.LIZ;
        if (c1464240oCs.LIZ == null || c1464240oCs.LIZLLL.get()) {
            return null;
        }
        return (NLEStickerController) c1464240oCs.LJIIJ.getValue();
    }

    @Override // com.bytedance.ies.nle.editor_jni.INLEStickerRuntime
    public final int stopStickerAnimationPreview() {
        NLEStickerController nLEStickerControllerLIZJ = LIZJ();
        if (nLEStickerControllerLIZJ != null) {
            return nLEStickerControllerLIZJ.stopStickerAnimationPreview();
        }
        return -1;
    }

    public C1EQC(C1464240oCs c1464240oCs) {
        super(c1464240oCs);
    }

    @Override // com.bytedance.ies.nle.editor_jni.INLEStickerRuntime
    public final int beginInfoStickerPin(String str) {
        NLEStickerController nLEStickerControllerLIZJ = LIZJ();
        if (nLEStickerControllerLIZJ != null) {
            return nLEStickerControllerLIZJ.beginInfoStickerPin(str);
        }
        return -1;
    }

    @Override // com.bytedance.ies.nle.editor_jni.INLEStickerRuntime
    public final int cancelInfoStickerPin(String str) {
        NLEStickerController nLEStickerControllerLIZJ = LIZJ();
        if (nLEStickerControllerLIZJ != null) {
            return nLEStickerControllerLIZJ.cancelInfoStickerPin(str);
        }
        return -1;
    }

    @Override // com.bytedance.ies.nle.editor_jni.INLEStickerRuntime
    public final String getInfoStickerAssetInfo(String str) {
        String infoStickerAssetInfo;
        NLEStickerController nLEStickerControllerLIZJ = LIZJ();
        if (nLEStickerControllerLIZJ == null || (infoStickerAssetInfo = nLEStickerControllerLIZJ.getInfoStickerAssetInfo(str)) == null) {
            return "";
        }
        return infoStickerAssetInfo;
    }

    @Override // com.bytedance.ies.nle.editor_jni.INLEStickerRuntime
    public final String getInfoStickerNewTemplateParams(String str) {
        String infoStickerNewTemplateParams;
        NLEStickerController nLEStickerControllerLIZJ = LIZJ();
        if (nLEStickerControllerLIZJ == null || (infoStickerNewTemplateParams = nLEStickerControllerLIZJ.getInfoStickerNewTemplateParams(str)) == null) {
            return "";
        }
        return infoStickerNewTemplateParams;
    }

    @Override // com.bytedance.ies.nle.editor_jni.INLEStickerRuntime
    public final byte[] getInfoStickerPinData(String str) {
        byte[] infoStickerPinData;
        NLEStickerController nLEStickerControllerLIZJ = LIZJ();
        if (nLEStickerControllerLIZJ == null || (infoStickerPinData = nLEStickerControllerLIZJ.getInfoStickerPinData(str)) == null) {
            return new byte[0];
        }
        return infoStickerPinData;
    }

    @Override // com.bytedance.ies.nle.editor_jni.INLEStickerRuntime
    public final byte[] getInfoStickerPinMappingData(String str) {
        byte[] infoStickerPinMappingData;
        NLEStickerController nLEStickerControllerLIZJ = LIZJ();
        if (nLEStickerControllerLIZJ == null || (infoStickerPinMappingData = nLEStickerControllerLIZJ.getInfoStickerPinMappingData(str)) == null) {
            return new byte[0];
        }
        return infoStickerPinMappingData;
    }

    @Override // com.bytedance.ies.nle.editor_jni.INLEStickerRuntime
    public final float getInfoStickerRotate(String str) {
        NLEStickerController nLEStickerControllerLIZJ = LIZJ();
        if (nLEStickerControllerLIZJ != null) {
            return nLEStickerControllerLIZJ.getInfoStickerRotate(str);
        }
        return 0.0f;
    }

    @Override // com.bytedance.ies.nle.editor_jni.INLEStickerRuntime
    public final float getInfoStickerScale(String str) {
        NLEStickerController nLEStickerControllerLIZJ = LIZJ();
        if (nLEStickerControllerLIZJ != null) {
            return nLEStickerControllerLIZJ.getInfoStickerScale(str);
        }
        return 0.0f;
    }

    @Override // com.bytedance.ies.nle.editor_jni.INLEStickerRuntime
    public final String getInfoStickerTemplateParams(String str) {
        String infoStickerTemplateParams;
        NLEStickerController nLEStickerControllerLIZJ = LIZJ();
        if (nLEStickerControllerLIZJ == null || (infoStickerTemplateParams = nLEStickerControllerLIZJ.getInfoStickerTemplateParams(str)) == null) {
            return "";
        }
        return infoStickerTemplateParams;
    }

    @Override // com.bytedance.ies.nle.editor_jni.INLEStickerRuntime
    public final boolean getInfoStickerVisible(String str) {
        NLEStickerController nLEStickerControllerLIZJ = LIZJ();
        if (nLEStickerControllerLIZJ != null) {
            return nLEStickerControllerLIZJ.getInfoStickerVisible(str);
        }
        return false;
    }

    @Override // com.bytedance.ies.nle.editor_jni.INLEStickerRuntime
    public final NLERectF getNewTextTemplateBoundingBox(NLETrackSlot nLETrackSlot) {
        NLERectF newTextTemplateBoundingBox;
        NLEStickerController nLEStickerControllerLIZJ = LIZJ();
        if (nLEStickerControllerLIZJ == null || (newTextTemplateBoundingBox = nLEStickerControllerLIZJ.getNewTextTemplateBoundingBox(nLETrackSlot)) == null) {
            return new NLERectF();
        }
        return newTextTemplateBoundingBox;
    }

    @Override // com.bytedance.ies.nle.editor_jni.INLEStickerRuntime
    public final NLEPosition getSrtInfoStickerInitPosition(String str) {
        NLEPosition srtInfoStickerInitPosition;
        NLEStickerController nLEStickerControllerLIZJ = LIZJ();
        if (nLEStickerControllerLIZJ == null || (srtInfoStickerInitPosition = nLEStickerControllerLIZJ.getSrtInfoStickerInitPosition(str)) == null) {
            return new NLEPosition();
        }
        return srtInfoStickerInitPosition;
    }

    @Override // com.bytedance.ies.nle.editor_jni.INLEStickerRuntime
    public final boolean getStickerIsDynamic(String str) {
        NLEStickerController nLEStickerControllerLIZJ = LIZJ();
        if (nLEStickerControllerLIZJ != null) {
            return nLEStickerControllerLIZJ.getStickerIsDynamic(str);
        }
        return false;
    }

    @Override // com.bytedance.ies.nle.editor_jni.INLEStickerRuntime
    public final boolean isInfoStickerAnimatable(String str) {
        NLEStickerController nLEStickerControllerLIZJ = LIZJ();
        if (nLEStickerControllerLIZJ != null) {
            return nLEStickerControllerLIZJ.isInfoStickerAnimatable(str);
        }
        return false;
    }

    @Override // com.bytedance.ies.nle.editor_jni.INLEStickerRuntime
    public final int setInfoStickerRestoreMode(int i) {
        NLEStickerController nLEStickerControllerLIZJ = LIZJ();
        if (nLEStickerControllerLIZJ != null) {
            return nLEStickerControllerLIZJ.setInfoStickerRestoreMode(i);
        }
        return -1;
    }

    @Override // com.bytedance.ies.nle.editor_jni.INLEStickerRuntime
    public final int enableStickerAnimationPreview(String str, boolean z) {
        NLEStickerController nLEStickerControllerLIZJ = LIZJ();
        if (nLEStickerControllerLIZJ != null) {
            return nLEStickerControllerLIZJ.enableStickerAnimationPreview(str, z);
        }
        return -1;
    }

    @Override // com.bytedance.ies.nle.editor_jni.INLEStickerRuntime
    public final NLERectF getInfoStickerBoundingBox(String str, boolean z) {
        NLERectF infoStickerBoundingBox;
        NLEStickerController nLEStickerControllerLIZJ = LIZJ();
        if (nLEStickerControllerLIZJ == null || (infoStickerBoundingBox = nLEStickerControllerLIZJ.getInfoStickerBoundingBox(str, z)) == null) {
            return new NLERectF();
        }
        return infoStickerBoundingBox;
    }

    @Override // com.bytedance.ies.nle.editor_jni.INLEStickerRuntime
    public final NLERectF getNewTextTemplateChildElementBoundingBox(NLETrackSlot nLETrackSlot, NLETrackSlot nLETrackSlot2) {
        NLERectF newTextTemplateChildElementBoundingBox;
        NLEStickerController nLEStickerControllerLIZJ = LIZJ();
        if (nLEStickerControllerLIZJ == null || (newTextTemplateChildElementBoundingBox = nLEStickerControllerLIZJ.getNewTextTemplateChildElementBoundingBox(nLETrackSlot, nLETrackSlot2)) == null) {
            return new NLERectF();
        }
        return newTextTemplateChildElementBoundingBox;
    }

    @Override // com.bytedance.ies.nle.editor_jni.INLEStickerRuntime
    public final int startStickerAnimationPreview(long j, int i) {
        NLEStickerController nLEStickerControllerLIZJ = LIZJ();
        if (nLEStickerControllerLIZJ != null) {
            return nLEStickerControllerLIZJ.startStickerAnimationPreview(j, i);
        }
        return -1;
    }
}
