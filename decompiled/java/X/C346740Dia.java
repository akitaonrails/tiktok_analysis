package X;

import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.NLETrackType;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSPtr;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0Dia, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C346740Dia {
    public static final List<NLETrackSlot> LIZ(NLEModel nLEModel) {
        VecNLETrackSPtr tracks = nLEModel.getTracks();
        ArrayList arrayList = new ArrayList();
        for (NLETrack nLETrack : tracks) {
            if (nLETrack.getTrackType() == NLETrackType.VIDEO) {
                arrayList.add(nLETrack);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            C19719612Di.LJJI(((NLETrack) it2.next()).getSlots(), arrayList2);
        }
        return arrayList2;
    }

    public static final List<NLETrack> LIZIZ(NLEModel nLEModel) {
        VecNLETrackSPtr tracks = nLEModel.getTracks();
        ArrayList arrayList = new ArrayList();
        for (NLETrack nLETrack : tracks) {
            if (nLETrack.getTrackType() == NLETrackType.VIDEO) {
                arrayList.add(nLETrack);
            }
        }
        return arrayList;
    }
}
