package X;

import com.bytedance.ies.nle.editor_jni.NLEResourceNode;
import com.bytedance.ies.nle.editor_jni.NLESegment;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSlotSPtr;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0Dks, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C348160Dks {
    public static final String LIZ(NLETrack nLETrack) {
        String resourceFile;
        NLEResourceNode resource;
        if (nLETrack == null) {
            return "";
        }
        VecNLETrackSlotSPtr sortedSlots = nLETrack.getSortedSlots();
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(sortedSlots, 10));
        Iterator<NLETrackSlot> it2 = sortedSlots.iterator();
        while (it2.hasNext()) {
            NLESegment mainSegment = it2.next().getMainSegment();
            if (mainSegment == null || (resource = mainSegment.getResource()) == null || (resourceFile = resource.getResourceFile()) == null) {
                resourceFile = "";
            }
            arrayList.add(String.valueOf(resourceFile.hashCode()));
        }
        List listLJLLJ = C13LP.LJLLJ(arrayList);
        StringBuilder sb = new StringBuilder();
        Iterator it3 = listLJLLJ.iterator();
        while (it3.hasNext()) {
            sb.append((String) it3.next());
            sb.append("|");
        }
        return String.valueOf(sb.toString().hashCode());
    }
}
