package X;

import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSlotSPtr;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.zhiliaoapp.musically.R;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0EWB, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0EWB {
    public static final C0EWB LIZ = new C0EWB();
    public static final List<String> LIZIZ = C1697810uHb.LJIIJJI("foundation_all", "clear_all");

    public static int LIZ() {
        if (C289280BVm.LIZ()) {
            C1657820tF6.LIZ.getClass();
            return C1657820tF6.LIZIZ() ? R.raw.icon_color_person_star : R.raw.icon_camera_person_double_star_fill;
        }
        C1657820tF6.LIZ.getClass();
        return C1657820tF6.LIZIZ() ? R.raw.icon_color_beauty : R.raw.icon_camera_beauty_magic;
    }

    public static int LIZIZ() {
        int iLIZ;
        if (C0EWC.LIZ()) {
            return -1;
        }
        if (C1651050t4B.LIZ()) {
            C0CHO.LIZ.getClass();
            if (!C0CHO.LIZ()) {
                return -1;
            }
            iLIZ = C19317910ht.LIZJ();
        } else {
            iLIZ = C19317910ht.LIZ();
        }
        if (iLIZ == 2131849206) {
            return 2131849207;
        }
        return iLIZ;
    }

    public static int LIZJ() {
        if (C289280BVm.LIZ()) {
            C1657820tF6.LIZ.getClass();
            return C1657820tF6.LIZIZ() ? R.raw.icon_person_two_sparkle : R.raw.icon_camera_person_double_star_fill;
        }
        C1657820tF6.LIZ.getClass();
        return C1657820tF6.LIZIZ() ? R.raw.icon_color_beauty : R.raw.icon_camera_beauty_magic;
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0122  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean LIZLLL(com.ss.ugc.android.editor.base.resource.ResourceItem r12) {
        /*
            Method dump skipped, instruction units count: 416
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0EWB.LIZLLL(com.ss.ugc.android.editor.base.resource.ResourceItem):boolean");
    }

    public static boolean LJ(VideoPublishEditModel videoPublishEditModel, NLEModel nLEModel) {
        NLETrack mainTrack;
        if (!C0C64.LJIILLIIL().LJIIIZ(31744, "studio_editor_pro_retouch_in_editor_pro", true, false) || (videoPublishEditModel != null && videoPublishEditModel.creativeModel.pugcTemplateData.isFromCreateTemplate)) {
            return false;
        }
        if (nLEModel != null && (mainTrack = nLEModel.getMainTrack()) != null && (!mainTrack.getSlots().isEmpty())) {
            VecNLETrackSlotSPtr slots = mainTrack.getSlots();
            if (!(slots instanceof Collection) || !slots.isEmpty()) {
                Iterator<NLETrackSlot> it2 = slots.iterator();
                while (it2.hasNext() && !C351220Dpo.LLFZ(it2.next())) {
                }
                return true;
            }
        }
        return true;
    }
}
