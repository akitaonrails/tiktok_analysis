package X;

import com.ss.android.ugc.aweme.feed.model.PhotoModeImageUrlModel;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.19ux, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C21692119ux {
    public final int LIZ;
    public final PhotoModeImageUrlModel LIZIZ;
    public final VideoItemParams LIZJ;
    public final boolean LIZLLL = false;
    public final Boolean LJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C21692119ux)) {
            return false;
        }
        C21692119ux c21692119ux = (C21692119ux) obj;
        return this.LIZ == c21692119ux.LIZ && Intrinsics.LJFF(this.LIZIZ, c21692119ux.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c21692119ux.LIZJ) && Intrinsics.LJFF(null, null) && this.LIZLLL == c21692119ux.LIZLLL && Intrinsics.LJFF(this.LJ, c21692119ux.LJ);
    }

    public C21692119ux(int i, PhotoModeImageUrlModel photoModeImageUrlModel, VideoItemParams videoItemParams, Boolean bool) {
        this.LIZ = i;
        this.LIZIZ = photoModeImageUrlModel;
        this.LIZJ = videoItemParams;
        this.LJ = bool;
    }
}
