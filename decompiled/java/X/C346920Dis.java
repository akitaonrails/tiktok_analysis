package X;

import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackType;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSPtr;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Dis, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C346920Dis {
    public static final List<NLETrack> LIZ(NLEModel nLEModel) {
        VecNLETrackSPtr tracks = nLEModel.getTracks();
        ArrayList arrayList = new ArrayList();
        for (NLETrack nLETrack : tracks) {
            NLETrack nLETrack2 = nLETrack;
            if (nLETrack2.getEnable() && C347830DkL.LIZ(nLETrack2) == NLETrackType.AUDIO && !Intrinsics.LJFF(C348350DlB.LIZ(nLETrack2), "ORIGIN") && !Intrinsics.LJFF(C348350DlB.LIZ(nLETrack2), "TEXT_SPEAK") && !Intrinsics.LJFF(C348350DlB.LIZ(nLETrack2), "REVERSE_AUDIO")) {
                arrayList.add(nLETrack);
            }
        }
        return arrayList;
    }
}
