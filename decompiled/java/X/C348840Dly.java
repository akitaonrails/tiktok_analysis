package X;

import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSPtr;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0Dly, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C348840Dly {
    public static final /* synthetic */ int LIZ = 0;

    public static boolean LIZ(VideoPublishEditModel videoPublishEditModel, NLEModel nLEModel) {
        if (C349930Dnj.LIZ(videoPublishEditModel, nLEModel, true)) {
            Pair<Integer, Integer> pairLIZJ = C349940Dnk.LIZJ(nLEModel);
            int iIntValue = pairLIZJ.getFirst().intValue();
            int iIntValue2 = pairLIZJ.getSecond().intValue();
            if ((iIntValue2 > 0 || iIntValue <= 1) && iIntValue + iIntValue2 > 1) {
                return true;
            }
            return false;
        }
        VecNLETrackSPtr tracks = nLEModel.getTracks();
        ArrayList arrayList = new ArrayList();
        for (NLETrack nLETrack : tracks) {
            NLETrack nLETrack2 = nLETrack;
            if (C351220Dpo.LLILLL(nLETrack2) || C351220Dpo.LLJILLL(nLETrack2) || C351220Dpo.LLLILZLLLI(nLETrack2) || C351220Dpo.LLILL(nLETrack2)) {
                arrayList.add(nLETrack);
            }
        }
        Iterator it2 = arrayList.iterator();
        int size = 0;
        while (it2.hasNext()) {
            size += ((NLETrack) it2.next()).getSortedSlots().size();
        }
        if (size > 1) {
            return true;
        }
        return false;
    }
}
