package X;

import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0EjF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C372630EjF {
    public static final boolean LIZ(C0ELJ c0elj, VideoPublishEditModel videoPublishEditModel) {
        if (c0elj.getEffectMultiTrackMode() || ((videoPublishEditModel != null && videoPublishEditModel.isEnterFromDM()) || ((Intrinsics.LJFF(c0elj.getEnterFrom(), "enter_from_now_edit") && !C288180BRg.LIZ()) || c0elj.getFromRetouch()))) {
            return false;
        }
        return true;
    }
}
