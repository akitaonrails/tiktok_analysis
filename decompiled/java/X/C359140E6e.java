package X;

import android.app.Activity;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLEResourceNode;
import com.bytedance.ies.nle.editor_jni.NLESegment;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.ss.android.ugc.aweme.creative.model.editorpro.aigc.AIGCBusinessType;
import com.ss.android.ugc.aweme.creative.model.editorpro.aigc.AIGCGenerationParam;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.services.uikit.CreativeToastBuilder;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;

/* JADX INFO: renamed from: X.0E6e, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C359140E6e {
    public static void LIZIZ(C19A3 c19a3, Activity activity, C0E48 c0e48, VideoPublishEditModel videoPublishEditModel, NLETrackSlot nLETrackSlot, boolean z, long j) {
        String resourceFile;
        NLEResourceNode resource;
        long endTime;
        C359200E6k c359200E6k = C359200E6k.LIZIZ;
        if (z) {
            if (!((Boolean) C0E5G.LIZIZ(EnumC357850E1f.ENABLE_SUBTRACK_OVER_MAIN, Boolean.TRUE)).booleanValue()) {
                long jLJII = C351220Dpo.LJII(C350870DpF.LJI(c0e48));
                NLETrackSlot nLETrackSlotLLLLLLIL = c0e48.LLLLLLIL();
                if (nLETrackSlotLLLLLLIL != null) {
                    endTime = nLETrackSlotLLLLLLIL.getEndTime();
                } else {
                    endTime = 0;
                }
                if ((jLJII - endTime) / ((long) LSPassThroughRecordSizeConfig.DEFAULT) < ((Number) C0E5G.LIZIZ(EnumC357850E1f.VIDEO_CLIP_MIN_DURATION, 100L)).longValue()) {
                    CreativeToastBuilder creativeToastBuilder = new CreativeToastBuilder();
                    creativeToastBuilder.messageRes(2131827574);
                    C1390380mHk.LIZ(activity, 1060, creativeToastBuilder);
                    return;
                }
            }
            NLEModel nLEModelLJI = C350870DpF.LJI(c0e48);
            C359310E6v.LIZ.getClass();
            Long lLIZJ = C359310E6v.LIZJ(nLEModelLJI, nLETrackSlot);
            if (lLIZJ != null && lLIZJ.longValue() < 100000) {
                CreativeToastBuilder creativeToastBuilder2 = new CreativeToastBuilder();
                creativeToastBuilder2.messageRes(2131827574);
                C1390380mHk.LIZ(activity, 1060, creativeToastBuilder2);
                return;
            }
        }
        NLESegment mainSegment = nLETrackSlot.getMainSegment();
        if (mainSegment == null || (resource = mainSegment.getResource()) == null || (resourceFile = resource.getResourceFile()) == null) {
            resourceFile = "";
        }
        if (C351220Dpo.LLJJIJIL(nLETrackSlot)) {
            LIZ(c19a3, c0e48, videoPublishEditModel, resourceFile, null, nLETrackSlot, z, c359200E6k, j);
        } else {
            if (videoPublishEditModel == null) {
                return;
            }
            C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(c19a3), null, null, new C353330DtD(nLETrackSlot, videoPublishEditModel, c19a3, c0e48, resourceFile, z, c359200E6k, j, null), 3);
        }
    }

    public static void LIZ(C19A3 c19a3, C0E48 c0e48, VideoPublishEditModel videoPublishEditModel, String str, String str2, NLETrackSlot nLETrackSlot, boolean z, AbstractC359300E6u abstractC359300E6u, long j) {
        int iLongValue;
        int i = 0;
        if (z) {
            NLEModel nLEModelLJI = C350870DpF.LJI(c0e48);
            C359310E6v.LIZ.getClass();
            Long lLIZJ = C359310E6v.LIZJ(nLEModelLJI, nLETrackSlot);
            if (lLIZJ != null && (iLongValue = (int) (lLIZJ.longValue() / 1000)) >= 0) {
                i = iLongValue;
            }
        }
        C375820EoO.LIZ(c19a3, c0e48, C376260Ep6.class, new C379120Eti(c0e48, videoPublishEditModel, null, new AIGCGenerationParam(null, null, str, null, false, false, null, null, null, null, 0, 0, null, null, nLETrackSlot.getUUID(), false, false, i, false, null, null, null, null, null, null, false, false, false, null, null, 0, 0, AIGCBusinessType.AI_EXTEND, null, null, -147461, 6, null), null, abstractC359300E6u, false, false, false, z, C0E9W.AI_EXTEND, str2, j, EnumC378910EtN.SLOT, 468), 16);
    }
}
