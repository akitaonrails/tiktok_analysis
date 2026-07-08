package X;

import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;

/* JADX INFO: renamed from: X.0o2U, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1457800o2U {
    public static final void LIZ(long j, VideoPublishEditModel videoPublishEditModel, boolean z) {
        C1458390o3R.LIZ.getClass();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("auto_music_capsule_loading_time duration:");
        sbLIZ.append(System.currentTimeMillis() - j);
        C201955140j.LJIILIIL("MusicCapsuleProcessTracker", C2188811AlT.LIZIZ(sbLIZ));
        C1458390o3R.LJIJJ(j, videoPublishEditModel, z);
    }
}
