package X;

import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0nHE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1428500nHE {
    public static Boolean LIZ;

    public static final boolean LIZ() {
        return C290890Bah.LIZ() && Intrinsics.LJFF(LIZ, Boolean.TRUE);
    }

    public static final boolean LIZIZ(VideoPublishEditModel videoPublishEditModel, Boolean bool) {
        boolean z;
        if (!videoPublishEditModel.isMvThemeVideoType() && !videoPublishEditModel.isCutSameVideoType() && !C1428470nHB.LJLLI(videoPublishEditModel) && !C1428470nHB.LLIIIJ(videoPublishEditModel) && !Intrinsics.LJFF(videoPublishEditModel.getEnterFrom(), "effect_qr_scan") && C0CHQ.LIZ().getAccountService().isLogin()) {
            z = true;
        } else {
            z = false;
        }
        LIZ = Boolean.valueOf(z);
        if (Intrinsics.LJFF(bool, Boolean.TRUE)) {
            LIZ = Boolean.FALSE;
            return false;
        }
        return z;
    }
}
