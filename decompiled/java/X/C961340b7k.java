package X;

import com.bytedance.android.livesdk.chatroom.interact.model.RivalsListsData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0b7k, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C961340b7k extends C955670ayb {
    public final RivalsListsData.OffliveInvitationBanner LJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C961340b7k) && Intrinsics.LJFF(this.LJ, ((C961340b7k) obj).LJ);
    }

    public final int hashCode() {
        return this.LJ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("OffliveBannerItem(banner=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C961340b7k(RivalsListsData.OffliveInvitationBanner offliveInvitationBanner) {
        this.LJ = offliveInvitationBanner;
    }
}
