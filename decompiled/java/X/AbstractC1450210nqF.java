package X;

import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSlotSPtr;
import com.bytedance.ies.nle.editor_jni.VecString;
import com.ss.android.ugc.aweme.creative.model.album.LivePhotoPreviewMode;
import com.ss.android.ugc.aweme.creative.model.edit.SrcLiveVideoInfo;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0nqF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public abstract class AbstractC1450210nqF {
    public abstract void LIZ(C1450180nqC c1450180nqC);

    public abstract String LIZIZ();

    public void LIZJ(C1450180nqC c1450180nqC) {
    }

    public abstract Integer LIZLLL(C1450180nqC c1450180nqC);

    public abstract void LJ(C1450180nqC c1450180nqC);

    public abstract void LJFF(C1450180nqC c1450180nqC, InterfaceC1450310nqP interfaceC1450310nqP);

    public static void LJII(C1450180nqC c1450180nqC) {
        float scale;
        float rotation;
        boolean mirror_X;
        float transformX;
        NLETrackSlot slotByIndex;
        VecString extraKeys;
        String extra;
        NLETrackSlot slotByIndex2;
        NLETrackSlot slotByIndex3;
        NLETrackSlot slotByIndex4;
        NLETrackSlot slotByIndex5;
        NLETrackSlot slotByIndex6;
        NLETrackSlot slotByIndex7;
        NLEModel nLEModelLIZ = C1450170nqB.LIZ(c1450180nqC);
        C1450230nqH c1450230nqH = c1450180nqC.LJI;
        NLETrack mainTrack = nLEModelLIZ.getMainTrack();
        if (mainTrack != null && (slotByIndex7 = mainTrack.getSlotByIndex(0)) != null) {
            scale = slotByIndex7.getScale();
        } else {
            scale = 1.0f;
        }
        c1450230nqH.LIZ = scale;
        C1450230nqH c1450230nqH2 = c1450180nqC.LJI;
        NLETrack mainTrack2 = nLEModelLIZ.getMainTrack();
        float transformY = 0.0f;
        if (mainTrack2 != null && (slotByIndex6 = mainTrack2.getSlotByIndex(0)) != null) {
            rotation = slotByIndex6.getRotation();
        } else {
            rotation = 0.0f;
        }
        c1450230nqH2.LIZIZ = rotation;
        C1450230nqH c1450230nqH3 = c1450180nqC.LJI;
        NLETrack mainTrack3 = nLEModelLIZ.getMainTrack();
        if (mainTrack3 != null && (slotByIndex5 = mainTrack3.getSlotByIndex(0)) != null) {
            mirror_X = slotByIndex5.getMirror_X();
        } else {
            mirror_X = false;
        }
        c1450230nqH3.LIZJ = mirror_X;
        C1450230nqH c1450230nqH4 = c1450180nqC.LJI;
        NLETrack mainTrack4 = nLEModelLIZ.getMainTrack();
        if (mainTrack4 != null && (slotByIndex4 = mainTrack4.getSlotByIndex(0)) != null) {
            transformX = slotByIndex4.getTransformX();
        } else {
            transformX = 0.0f;
        }
        c1450230nqH4.LIZLLL = transformX;
        C1450230nqH c1450230nqH5 = c1450180nqC.LJI;
        NLETrack mainTrack5 = nLEModelLIZ.getMainTrack();
        if (mainTrack5 != null && (slotByIndex3 = mainTrack5.getSlotByIndex(0)) != null) {
            transformY = slotByIndex3.getTransformY();
        }
        c1450230nqH5.LJ = transformY;
        NLETrack mainTrack6 = nLEModelLIZ.getMainTrack();
        if (mainTrack6 != null && (slotByIndex = mainTrack6.getSlotByIndex(0)) != null && (extraKeys = slotByIndex.getExtraKeys()) != null) {
            for (String str : extraKeys) {
                if (!Intrinsics.LJFF(str, "ep_curve_speed_resource_id") && !Intrinsics.LJFF(str, "clip_live_photo_type")) {
                    Map<String, String> map = c1450180nqC.LJI.LJFF;
                    NLETrack mainTrack7 = nLEModelLIZ.getMainTrack();
                    if (mainTrack7 == null || (slotByIndex2 = mainTrack7.getSlotByIndex(0)) == null || (extra = slotByIndex2.getExtra(str)) == null) {
                        extra = "";
                    }
                    map.put(str, extra);
                }
            }
        }
    }

    public static void LJI(C1450180nqC c1450180nqC, boolean z) {
        VecNLETrackSlotSPtr slots;
        LivePhotoPreviewMode livePhotoPreviewMode;
        String str;
        NLETrack mainTrack = C1450170nqB.LIZ(c1450180nqC).getMainTrack();
        if (mainTrack != null && (slots = mainTrack.getSlots()) != null) {
            for (NLETrackSlot nLETrackSlot : slots) {
                nLETrackSlot.setScale(c1450180nqC.LJI.LIZ);
                nLETrackSlot.setRotation(c1450180nqC.LJI.LIZIZ);
                nLETrackSlot.setMirror_X(c1450180nqC.LJI.LIZJ);
                nLETrackSlot.setTransformX(c1450180nqC.LJI.LIZLLL);
                nLETrackSlot.setTransformY(c1450180nqC.LJI.LJ);
                for (Map.Entry<String, String> entry : c1450180nqC.LJI.LJFF.entrySet()) {
                    nLETrackSlot.setExtra(entry.getKey(), entry.getValue());
                }
                if (z) {
                    List listLJIIJJI = C1697810uHb.LJIIJJI(LivePhotoPreviewMode.LIVE_PHOTO, LivePhotoPreviewMode.LOOP);
                    SrcLiveVideoInfo srcLiveInfo = c1450180nqC.LIZ.getSrcLiveInfo();
                    if (srcLiveInfo != null) {
                        livePhotoPreviewMode = srcLiveInfo.getLivePhotoPreviewMode();
                    } else {
                        livePhotoPreviewMode = null;
                    }
                    if (C13LP.LJJJJ(livePhotoPreviewMode, listLJIIJJI)) {
                        str = "live_video";
                    } else {
                        str = "image";
                    }
                    nLETrackSlot.setExtra("clip_live_photo_type", str);
                } else {
                    nLETrackSlot.setExtra("clip_live_photo_type", "unknown");
                }
            }
        }
    }
}
