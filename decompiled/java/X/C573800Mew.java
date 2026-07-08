package X;

import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;

/* JADX INFO: renamed from: X.0Mew, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C573800Mew {
    public static final /* synthetic */ int LIZ = 0;

    public static boolean LIZ(VideoPublishEditModel videoPublishEditModel) {
        boolean zLIZ = C0BVY.LIZ(videoPublishEditModel);
        boolean z = false;
        if (zLIZ) {
            C201955140j.LJIILIIL("EditMusicPanelOptHelper", "there is panel music, can not insert more capsule music");
            return false;
        }
        if (C0C64.LJIILLIIL().LJIIIZ(31744, "studio_request_more_capsule_music_and_insert_panel", true, false) && C2296708zF.LIZ() > 1) {
            z = true;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("canInsertMoreCapsuleMusic:");
        sbLIZ.append(z);
        C201955140j.LJIILIIL("EditMusicPanelOptHelper", C2188811AlT.LIZIZ(sbLIZ));
        return z;
    }
}
