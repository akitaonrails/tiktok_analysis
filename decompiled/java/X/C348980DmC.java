package X;

import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLESegmentAudio;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.0DmC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C348980DmC {
    public static final ConcurrentHashMap<String, String> LIZ = new ConcurrentHashMap<>();

    public static String LIZ(NLEModel nLEModel) {
        Iterator it2 = ((ArrayList) C348970DmB.LIZJ(nLEModel)).iterator();
        String strLIZIZ = "";
        while (it2.hasNext()) {
            for (NLETrackSlot nLETrackSlot : ((NLETrack) it2.next()).getSortedSlots()) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(strLIZIZ);
                NLESegmentAudio nLESegmentAudioDynamicCast = NLESegmentAudio.dynamicCast(nLETrackSlot.getMainSegment());
                String resourceFile = nLETrackSlot.getMainSegment().getResource().getResourceFile();
                long startTime = nLETrackSlot.getStartTime();
                long endTime = nLETrackSlot.getEndTime();
                long timeClipStart = nLESegmentAudioDynamicCast.getTimeClipStart();
                long timeClipEnd = nLESegmentAudioDynamicCast.getTimeClipEnd();
                nLETrackSlot.getUUID();
                float volume = nLESegmentAudioDynamicCast.getVolume();
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append(resourceFile);
                sbLIZ2.append(startTime);
                sbLIZ2.append(endTime);
                sbLIZ2.append(timeClipStart);
                sbLIZ2.append(timeClipEnd);
                sbLIZ2.append(volume);
                sbLIZ.append(C2188811AlT.LIZIZ(sbLIZ2));
                strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            }
        }
        return C08F1.LIZIZ(strLIZIZ);
    }
}
