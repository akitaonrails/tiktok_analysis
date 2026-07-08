package X;

import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSlotSPtr;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.gamora.editorpro.framework.datastore.EditModelProvider;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: renamed from: X.0Dn9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C349570Dn9 {
    public static boolean LIZ(C0E48 c0e48, NLETrackSlot nLETrackSlot, NLETrackSlot nLETrackSlot2, NLEModel nLEModel) {
        boolean z;
        boolean z2;
        VideoPublishEditModel editModel;
        long startTime = nLETrackSlot2.getStartTime();
        C351510DqH c351510DqH = C351510DqH.LIZ;
        NLETrack mainTrack = nLEModel.getMainTrack();
        c351510DqH.getClass();
        long j = 30000;
        long jLJJIJ = (startTime + C351510DqH.LJJIJ(mainTrack, nLETrackSlot2)) - j;
        long startTime2 = nLETrackSlot2.getStartTime() + C351510DqH.LJJIIZI(nLETrackSlot2) + j;
        if (!C349550Dn7.LJI(nLETrackSlot) && !C349550Dn7.LJFF(nLETrackSlot)) {
            z = false;
        } else {
            z = true;
        }
        if (c0e48 == null) {
            return false;
        }
        NLEModel nLEModelLJI = C350870DpF.LJI(c0e48);
        EditModelProvider.Companion.getClass();
        EditModelProvider editModelProviderLIZIZ = C0E1T.LIZIZ();
        if ((editModelProviderLIZIZ != null && (editModel = editModelProviderLIZIZ.getEditModel()) != null && C1416310mxZ.LJIILL(editModel)) || C349550Dn7.LJ(nLEModelLJI).size() > 1) {
            z2 = true;
            break loop0;
        }
        ArrayList<NLETrack> arrayListLJ = C349550Dn7.LJ(nLEModelLJI);
        if (!arrayListLJ.isEmpty()) {
            Iterator<NLETrack> it2 = arrayListLJ.iterator();
            loop0: while (it2.hasNext()) {
                VecNLETrackSlotSPtr slots = it2.next().getSlots();
                if (!(slots instanceof Collection) || !slots.isEmpty()) {
                    Iterator<NLETrackSlot> it3 = slots.iterator();
                    while (it3.hasNext()) {
                        if (C349550Dn7.LJI(it3.next())) {
                            z2 = true;
                            break loop0;
                        }
                    }
                }
            }
        }
        z2 = false;
        if (z && z2) {
            jLJJIJ += j;
            startTime2 -= j;
            long startTime3 = nLETrackSlot.getStartTime();
            if (jLJJIJ <= startTime3 && startTime3 < startTime2 && nLETrackSlot.getEndTime() != -2) {
                return true;
            }
        }
        if (jLJJIJ <= nLETrackSlot.getStartTime() && startTime2 >= nLETrackSlot.getEndTime() && nLETrackSlot.getEndTime() != -2) {
            return true;
        }
        return false;
    }
}
