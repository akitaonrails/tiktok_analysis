package X;

import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;

/* JADX INFO: renamed from: X.0mqV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1411930mqV {
    public static C11NZ LIZ(VideoPublishEditModel videoPublishEditModel, boolean z) {
        C11NZ<String> c11nzLJ = C2275708vr.LJ();
        if (c11nzLJ != null) {
            if (!z) {
                return c11nzLJ;
            }
        } else {
            if (z) {
            }
            return C1457430o1t.LIZ.LJ(videoPublishEditModel);
        }
        C1403010mc7.LIZ.getMusicService().dl();
        C1458410o3T.LJIIJJI(true);
        return C1457430o1t.LIZ.LJ(videoPublishEditModel);
    }
}
