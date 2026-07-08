package X;

import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Dj0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C347000Dj0 {
    public static final /* synthetic */ int LIZIZ = 0;
    public final Map<String, NLETrackSlot> LIZ = new LinkedHashMap();

    public static NLETrackSlot LIZ(NLETrack nLETrack, NLETrackSlot nLETrackSlot) {
        NLETrackSlot nLETrackSlot2 = null;
        if (!nLETrackSlot.hasExtra("extra_associated_vc_slot_id")) {
            return null;
        }
        String extra = nLETrackSlot.getExtra("extra_associated_vc_slot_id");
        Iterator<NLETrackSlot> it2 = nLETrack.getSlots().iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            NLETrackSlot next = it2.next();
            if (Intrinsics.LJFF(next.getUUID(), extra)) {
                nLETrackSlot2 = next;
                break;
            }
        }
        return nLETrackSlot2;
    }

    public static NLETrackSlot LIZIZ(NLEModel nLEModel, NLETrackSlot nLETrackSlot) {
        NLETrack nLETrackLIZ = C346960Diw.LIZ(nLEModel);
        if (nLETrackLIZ == null || nLETrackSlot == null) {
            return null;
        }
        return LIZ(nLETrackLIZ, nLETrackSlot);
    }
}
