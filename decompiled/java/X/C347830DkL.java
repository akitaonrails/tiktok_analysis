package X;

import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLETimeSpaceNode;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackType;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSPtr;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0DkL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C347830DkL {
    public static final NLETrackType LIZ(NLETrack nLETrack) {
        NLETrackType trackType = nLETrack.getTrackType();
        NLETrackType extraTrackType = nLETrack.getExtraTrackType();
        NLETrackType nLETrackType = NLETrackType.NONE;
        if (trackType != nLETrackType && trackType != NLETrackType.FILTER) {
            return trackType;
        }
        if (extraTrackType != nLETrackType) {
            return extraTrackType;
        }
        return nLETrackType;
    }

    public static final void LIZIZ(NLEModel nLEModel, NLETrack nLETrack) {
        int i;
        VecNLETrackSPtr tracks = nLEModel.getTracks();
        ArrayList arrayList = new ArrayList();
        Iterator<NLETrack> it2 = tracks.iterator();
        while (true) {
            i = 0;
            if (!it2.hasNext()) {
                break;
            }
            NLETrack next = it2.next();
            NLETrack nLETrack2 = next;
            if (Intrinsics.LJFF(C348350DlB.LJI(nLETrack2), "NORMAL") || Intrinsics.LJFF(C348350DlB.LJI(nLETrack2), "VIDEO_ANIM")) {
                arrayList.add(next);
            }
        }
        if (!arrayList.isEmpty()) {
            Iterator it3 = arrayList.iterator();
            if (it3.hasNext()) {
                int layer = ((NLETimeSpaceNode) it3.next()).getLayer();
                while (it3.hasNext()) {
                    int layer2 = ((NLETimeSpaceNode) it3.next()).getLayer();
                    if (layer < layer2) {
                        layer = layer2;
                    }
                }
                i = layer + 1;
            } else {
                throw new NoSuchElementException();
            }
        }
        nLETrack.setLayer(i);
    }
}
