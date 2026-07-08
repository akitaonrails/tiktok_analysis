package X;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;
import webcast.data.multi_guest_social_data.Avatar;
import webcast.data.multi_guest_social_data.Video;

/* JADX INFO: renamed from: X.0aSx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C936050aSx extends C773070UUf {
    @Override // X.C773070UUf
    public final void LIZJ() {
    }

    @Override // X.C773070UUf
    public final boolean LIZLLL() {
        Avatar avatar = this.LIZ;
        if (avatar == null || avatar.avatarId == 0) {
            return false;
        }
        C204692157q c204692157q = C204692157q.LIZ;
        Context contextLJII = C497740JfY.LJII();
        c204692157q.getClass();
        return C204692157q.LIZIZ(contextLJII, avatar);
    }

    @Override // X.C773070UUf
    public final String LIZ() {
        Video video;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        Avatar avatar = this.LIZ;
        sbLIZ.append((avatar == null || (video = avatar.videoStatic) == null) ? null : video.vid);
        sbLIZ.append(".mp4");
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.C773070UUf
    public final String LIZIZ() {
        Video video;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        Avatar avatar = this.LIZ;
        sbLIZ.append((avatar == null || (video = avatar.videoDynamic) == null) ? null : video.vid);
        sbLIZ.append(".mp4");
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final int hashCode() {
        return super.hashCode();
    }

    public C936050aSx(Avatar avatar) {
        super(avatar, true);
    }

    public final boolean equals(Object obj) {
        Long lValueOf;
        Long lValueOf2;
        Long lValueOf3;
        Long lValueOf4;
        Integer numValueOf;
        if (!(obj instanceof C773070UUf)) {
            return false;
        }
        Avatar avatar = this.LIZ;
        Integer numValueOf2 = null;
        if (avatar != null) {
            lValueOf = Long.valueOf(avatar.avatarId);
        } else {
            lValueOf = null;
        }
        C773070UUf c773070UUf = (C773070UUf) obj;
        Avatar avatar2 = c773070UUf.LIZ;
        if (avatar2 != null) {
            lValueOf2 = Long.valueOf(avatar2.avatarId);
        } else {
            lValueOf2 = null;
        }
        if (!Intrinsics.LJFF(lValueOf, lValueOf2)) {
            return false;
        }
        Avatar avatar3 = this.LIZ;
        if (avatar3 != null) {
            lValueOf3 = Long.valueOf(avatar3.createdAt);
        } else {
            lValueOf3 = null;
        }
        Avatar avatar4 = c773070UUf.LIZ;
        if (avatar4 != null) {
            lValueOf4 = Long.valueOf(avatar4.createdAt);
        } else {
            lValueOf4 = null;
        }
        if (!Intrinsics.LJFF(lValueOf3, lValueOf4)) {
            return false;
        }
        Avatar avatar5 = this.LIZ;
        if (avatar5 != null) {
            numValueOf = Integer.valueOf(avatar5.status);
        } else {
            numValueOf = null;
        }
        Avatar avatar6 = c773070UUf.LIZ;
        if (avatar6 != null) {
            numValueOf2 = Integer.valueOf(avatar6.status);
        }
        if (!Intrinsics.LJFF(numValueOf, numValueOf2)) {
            return false;
        }
        return true;
    }

    public C936050aSx(Avatar avatar, boolean z) {
        super(avatar, z);
    }
}
