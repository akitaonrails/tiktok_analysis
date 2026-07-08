package X;

import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLENode;
import com.bytedance.ies.nle.editor_jni.NLEResType;
import com.bytedance.ies.nle.editor_jni.NLESegmentVideo;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0DiY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C346720DiY {
    public static final /* synthetic */ int LIZ = 0;

    public static List LIZ(NLEModel nLEModel) {
        List<NLETrack> listLJJLIIIJLJLI;
        ArrayList arrayList = new ArrayList();
        if (nLEModel != null && (listLJJLIIIJLJLI = C351220Dpo.LJJLIIIJLJLI(nLEModel)) != null) {
            Iterator<NLETrack> it2 = listLJJLIIIJLJLI.iterator();
            while (it2.hasNext()) {
                for (NLETrackSlot nLETrackSlot : it2.next().getSlots()) {
                    NLESegmentVideo nLESegmentVideoDynamicCast = NLESegmentVideo.dynamicCast((NLENode) nLETrackSlot.getMainSegment());
                    if (nLESegmentVideoDynamicCast != null && nLESegmentVideoDynamicCast.getAVFile().getResourceType() != NLEResType.IMAGE && nLESegmentVideoDynamicCast.getVolume() > 0.0f) {
                        String resourceFile = nLESegmentVideoDynamicCast.getAVFile().getResourceFile();
                        long startTime = nLETrackSlot.getStartTime();
                        long j = LSPassThroughRecordSizeConfig.DEFAULT;
                        arrayList.add(new C347480Djm(resourceFile, startTime / j, nLETrackSlot.getEndTime() / j, nLESegmentVideoDynamicCast.getTimeClipStart() / j, nLESegmentVideoDynamicCast.getTimeClipEnd() / j));
                    }
                }
            }
        }
        return arrayList;
    }
}
