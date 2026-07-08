package X;

import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSlotSPtr;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.u4;
import com.ss.android.ugc.gamora.editorpro.framework.datastore.EditModelProvider;

/* JADX INFO: renamed from: X.0EIf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C362270EIf {
    public static boolean LIZ(C0E48 c0e48) {
        NLEModel nLEModelLJI;
        NLETrack nLETrackLIZLLL;
        VideoPublishEditModel editModel;
        if (C363750ENx.LIZIZ("multi_music_guide_has_shown_in_root") || c0e48 == null || (nLETrackLIZLLL = C349930Dnj.LIZLLL((nLEModelLJI = C350870DpF.LJI(c0e48)))) == null) {
            return false;
        }
        EditModelProvider.Companion.getClass();
        EditModelProvider editModelProviderLIZIZ = C0E1T.LIZIZ();
        if (editModelProviderLIZIZ != null) {
            editModel = editModelProviderLIZIZ.getEditModel();
        } else {
            editModel = null;
        }
        if (u4.LJJIZ(editModel)) {
            return false;
        }
        VecNLETrackSlotSPtr sortedSlots = nLETrackLIZLLL.getSortedSlots();
        if (sortedSlots.size() != 1 || (sortedSlots.get(0).getEndTime() >= nLEModelLJI.getMaxTargetEnd() && sortedSlots.get(0).getStartTime() <= 100)) {
            return false;
        }
        return true;
    }
}
