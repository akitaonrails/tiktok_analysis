package X;

import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLENode;
import com.bytedance.ies.nle.editor_jni.NLERenderProxySegment;
import com.bytedance.ies.nle.editor_jni.NLEResType;
import com.bytedance.ies.nle.editor_jni.NLEResourceAV;
import com.bytedance.ies.nle.editor_jni.NLEResourceNode;
import com.bytedance.ies.nle.editor_jni.NLESegment;
import com.bytedance.ies.nle.editor_jni.NLESegmentVideo;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSPtr;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSlotSPtr;
import java.util.Iterator;

/* JADX INFO: renamed from: X.0DoI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C350280DoI {
    public static final C350280DoI LIZ = new C350280DoI();

    public static void LIZ(NLETrackSlot nLETrackSlot) {
        NLENode nLENodeDeepClone;
        NLEResourceAV aVFile;
        NLETrackSlot nLETrackSlot2 = new NLETrackSlot();
        NLESegmentVideo nLESegmentVideoDynamicCast = NLESegmentVideo.dynamicCast((NLENode) nLETrackSlot.getMainSegment());
        NLERenderProxySegment nLERenderProxySegment = new NLERenderProxySegment();
        if (nLESegmentVideoDynamicCast != null && (aVFile = nLESegmentVideoDynamicCast.getAVFile()) != null) {
            nLENodeDeepClone = aVFile.deepClone();
        } else {
            nLENodeDeepClone = null;
        }
        NLEResourceAV nLEResourceAVDynamicCast = NLEResourceAV.dynamicCast(nLENodeDeepClone);
        if (nLEResourceAVDynamicCast != null) {
            nLERenderProxySegment.setAVFile(nLEResourceAVDynamicCast);
        }
        nLETrackSlot2.setMainSegment(nLERenderProxySegment);
        nLETrackSlot.setRenderProxy(nLETrackSlot2);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:188:0x03d0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.List LIZIZ(com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r41) {
        /*
            Method dump skipped, instruction units count: 1144
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C350280DoI.LIZIZ(com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel):java.util.List");
    }

    public static boolean LIZJ(NLEModel nLEModel) {
        VecNLETrackSPtr tracks;
        if (nLEModel == null || (tracks = nLEModel.getTracks()) == null || tracks.isEmpty()) {
            return false;
        }
        Iterator<NLETrack> it2 = tracks.iterator();
        while (it2.hasNext()) {
            VecNLETrackSlotSPtr slots = it2.next().getSlots();
            if (slots != null && !slots.isEmpty()) {
                Iterator<NLETrackSlot> it3 = slots.iterator();
                while (it3.hasNext()) {
                    if (C377740ErU.LIZ(it3.next()) != null) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static void LIZLLL(NLETrack nLETrack, NLETrackSlot nLETrackSlot, String str) {
        NLETrackSlot nLETrackSlotDynamicCast = NLETrackSlot.dynamicCast(nLETrackSlot.deepClone(true));
        NLESegment mainSegment = null;
        if (nLETrackSlotDynamicCast != null) {
            nLETrackSlotDynamicCast.setStartTime(nLETrackSlot.getEndTime());
            nLETrackSlotDynamicCast.setEndTime(nLETrackSlotDynamicCast.getStartTime() + nLETrackSlot.getDuration());
            nLETrackSlotDynamicCast.clearExtra();
            mainSegment = nLETrackSlotDynamicCast.getMainSegment();
        } else {
            nLETrackSlotDynamicCast = null;
        }
        NLESegmentVideo nLESegmentVideoDynamicCast = NLESegmentVideo.dynamicCast((NLENode) mainSegment);
        if (nLESegmentVideoDynamicCast != null) {
            NLEResourceNode resource = nLESegmentVideoDynamicCast.getResource();
            if (resource != null) {
                resource.setResourceType(NLEResType.IMAGE);
            }
            NLEResourceNode resource2 = nLESegmentVideoDynamicCast.getResource();
            if (resource2 != null) {
                resource2.setResourceFile(str);
            }
        }
        if (nLETrackSlotDynamicCast != null) {
            nLETrackSlotDynamicCast.setExtra("biz_limit_material_type", "1");
            nLETrackSlotDynamicCast.setExtra("biz_fl2v_holder_slot", "1");
            nLETrackSlotDynamicCast.setExtra("biz_fl2v_slot_tag", "2");
        }
        nLETrack.addSlotAfterSlot(nLETrackSlotDynamicCast, nLETrackSlot);
    }
}
