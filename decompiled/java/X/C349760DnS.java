package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLETimeSpaceNode;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSPtr;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.util.Iterator;
import kotlin.jvm.internal.AFwS191S0000000_5;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0DnS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C349760DnS {
    public static int LIZ;
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS191S0000000_5.get$arr$(321));

    public static boolean LIZIZ(NLEModel nLEModel) {
        int layer;
        NLETimeSpaceNode nLETimeSpaceNode = (NLETimeSpaceNode) C13LP.LJJLIIIJL(C351220Dpo.LJJIIZ(nLEModel));
        if (nLETimeSpaceNode != null) {
            layer = nLETimeSpaceNode.getLayer();
        } else {
            layer = -1;
        }
        if (layer + 1 >= Math.max(((Number) LIZIZ.getValue()).intValue(), LIZ)) {
            return true;
        }
        return false;
    }

    public static boolean LIZ(VideoPublishEditModel videoPublishEditModel, NLEModel nLEModel) {
        VecNLETrackSPtr tracks;
        if (videoPublishEditModel != null && videoPublishEditModel.creativeModel.pugcTemplateData.isFromCreateTemplate) {
            SettingsManager.LIZLLL().getClass();
            return SettingsManager.LIZ("studio_editor_pro_enable_filter_in_pugc", true);
        }
        if (C0C64.LJIILLIIL().LJIIIZ(31744, "studio_editor_pro_enable_filter", true, false)) {
            return true;
        }
        if (nLEModel == null || (tracks = nLEModel.getTracks()) == null || tracks.isEmpty()) {
            return false;
        }
        Iterator<NLETrack> it2 = tracks.iterator();
        while (it2.hasNext()) {
            if (Intrinsics.LJFF(C351220Dpo.LJLLJ(it2.next()), "type_filter_filter")) {
                return true;
            }
        }
        return false;
    }
}
