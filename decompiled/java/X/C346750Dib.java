package X;

import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackType;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSPtr;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0Dib, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C346750Dib {
    public static final List<NLETrack> LIZ(NLEModel nLEModel) {
        VecNLETrackSPtr tracks = nLEModel.getTracks();
        ArrayList arrayList = new ArrayList();
        for (NLETrack nLETrack : tracks) {
            NLETrack nLETrack2 = nLETrack;
            if (nLETrack2.getEnable() && C350870DpF.LJIIIIZZ(nLETrack2) == NLETrackType.VIDEO && nLETrack2.hasExtra("collage_index")) {
                arrayList.add(nLETrack);
            }
        }
        return arrayList;
    }
}
