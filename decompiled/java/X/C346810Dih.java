package X;

import com.bytedance.ies.nle.editor_jni.NLEEditor;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.NLETrackType;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSPtr;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSlotSPtr;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Dih, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C346810Dih {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(long j, NLEEditor nLEEditor) {
        NLEModel model = nLEEditor.getModel();
        NLETrack mainTrack = model.getMainTrack();
        if (mainTrack != null) {
            long measuredEndTime = mainTrack.getMeasuredEndTime();
            VecNLETrackSPtr tracks = model.getTracks();
            ArrayList<NLETrack> arrayList = new ArrayList();
            for (NLETrack nLETrack : tracks) {
                NLETrack nLETrack2 = nLETrack;
                if (!nLETrack2.getMainTrack() && !Intrinsics.LJFF(nLETrack2.getExtra("AudioTrackType"), "TEXT_SPEAK") && !C351220Dpo.LLILLL(nLETrack2)) {
                    arrayList.add(nLETrack);
                }
            }
            for (NLETrack nLETrack3 : arrayList) {
                VecNLETrackSlotSPtr sortedSlots = nLETrack3.getSortedSlots();
                if (sortedSlots != null) {
                    Iterator<NLETrackSlot> it2 = sortedSlots.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            NLETrackSlot next = it2.next();
                            if (nLETrack3.getTrackType() == NLETrackType.FILTER) {
                                next.setEndTime(measuredEndTime);
                                break;
                            }
                            if (next.getStartTime() == 0 && next.getEndTime() == j) {
                                next.setEndTime(measuredEndTime);
                            } else if (((int) next.getEndTime()) != -2 && next.getEndTime() >= measuredEndTime) {
                                if (!next.hasExtra("has_aigc_cut")) {
                                    next.setExtra("starttime_before_aigc_cut", String.valueOf(next.getStartTime()));
                                    next.setExtra("endtime_before_aigc_cut", String.valueOf(next.getEndTime()));
                                    next.setExtra("has_aigc_cut", "true");
                                }
                                if (next.getStartTime() < measuredEndTime) {
                                    if (((int) next.getEndTime()) != -2) {
                                        next.setEndTime(measuredEndTime);
                                    }
                                } else {
                                    next.setEndTime(Math.min(measuredEndTime, next.getEndTime() - next.getStartTime()));
                                    next.setStartTime(0L);
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}
