package X;

import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.11Bm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19460011Bm {
    public static void LIZ(VideoPublishEditModel videoPublishEditModel) {
        String creationId;
        VideoPublishEditModel videoPublishEditModel2 = C19460311Bp.LIZLLL;
        if (videoPublishEditModel2 != null) {
            creationId = videoPublishEditModel2.getCreationId();
        } else {
            creationId = null;
        }
        if (!Intrinsics.LJFF(creationId, videoPublishEditModel.getCreationId())) {
            return;
        }
        C19460311Bp.LIZIZ = 1;
        C19460311Bp.LIZJ = 0;
        C19460311Bp.LIZLLL = null;
        C19460311Bp.LIZIZ = 3;
        C19460311Bp.LIZJ = 0;
        C19460311Bp.LIZLLL = null;
        C1440005kM.LIZ(new C19460211Bo());
    }
}
