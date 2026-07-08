package X;

import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLEResourceNode;
import com.bytedance.ies.nle.editor_jni.NLESegment;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSPtr;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0DiZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C346730DiZ {
    public static final /* synthetic */ int LIZ = 0;

    public static List LIZ(NLEModel nLEModel) {
        String extra;
        NLEResourceNode resource;
        ArrayList arrayList = new ArrayList();
        VecNLETrackSPtr tracks = nLEModel.getTracks();
        ArrayList arrayList2 = new ArrayList();
        for (NLETrack nLETrack : tracks) {
            if (C351220Dpo.LLILL(nLETrack)) {
                arrayList2.add(nLETrack);
            }
        }
        ArrayList<NLETrackSlot> arrayList3 = new ArrayList();
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            C19719612Di.LJJI(((NLETrack) it2.next()).getSlots(), arrayList3);
        }
        for (NLETrackSlot nLETrackSlot : arrayList3) {
            if (nLETrackSlot.hasExtra("extra_origin_voice_file_path")) {
                extra = nLETrackSlot.getExtra("extra_origin_voice_file_path");
            } else {
                NLESegment mainSegment = nLETrackSlot.getMainSegment();
                if (mainSegment != null && (resource = mainSegment.getResource()) != null) {
                    extra = resource.getResourceFile();
                }
            }
            if (extra != null) {
                arrayList.add(extra);
            }
        }
        return arrayList;
    }
}
