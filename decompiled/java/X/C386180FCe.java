package X;

import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLEResourceNode;
import com.bytedance.ies.nle.editor_jni.NLESegment;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSlotSPtr;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.util.Iterator;
import kotlin.jvm.internal.AFwS190S0000000_4;

/* JADX INFO: renamed from: X.0FCe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C386180FCe {
    public static long LIZ;
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS190S0000000_4.get$arr$(3462));

    public static boolean LIZIZ() {
        return ((Boolean) LIZIZ.getValue()).booleanValue() && !C0CHQ.LIZ().getAccountService().LIZ() && ((Number) C0BVW.LIZ.getValue()).intValue() == 2 && LIZ <= ((long) (((Number) C272330Alr.LIZ.getValue()).intValue() * LSPassThroughRecordSizeConfig.DEFAULT));
    }

    public static void LIZ(NLEModel nLEModel) {
        long duration;
        VecNLETrackSlotSPtr slots;
        long duration2;
        NLEResourceNode resource;
        long j = 0;
        LIZ = 0L;
        if (nLEModel != null) {
            duration = nLEModel.getDuration() / 1000;
            NLETrack mainTrack = nLEModel.getMainTrack();
            if (mainTrack != null && (slots = mainTrack.getSlots()) != null) {
                Iterator<NLETrackSlot> it2 = slots.iterator();
                j = 0;
                while (it2.hasNext()) {
                    NLESegment mainSegment = it2.next().getMainSegment();
                    if (mainSegment != null && (resource = mainSegment.getResource()) != null) {
                        duration2 = resource.getDuration() / 1000;
                    } else {
                        duration2 = 0;
                    }
                    if (j < duration2) {
                        j = duration2;
                    }
                }
            }
            if (duration < j) {
                duration = j;
            }
        } else {
            duration = 0;
        }
        LIZ = duration;
    }
}
