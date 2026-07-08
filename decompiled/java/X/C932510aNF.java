package X;

import com.bytedance.android.live.liveinteract.multilive.social.model.GuestInvitePanelResp;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0aNF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C932510aNF {
    public final C932770aNf LIZ;
    public final List<GuestInvitePanelResp.ListUser> LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C932510aNF)) {
            return false;
        }
        C932510aNF c932510aNF = (C932510aNF) obj;
        return Intrinsics.LJFF(this.LIZ, c932510aNF.LIZ) && Intrinsics.LJFF(this.LIZIZ, c932510aNF.LIZIZ);
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("QuickGuestInviteGuideItem(actionItem=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", users=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C932510aNF(C932770aNf c932770aNf, List<GuestInvitePanelResp.ListUser> list) {
        this.LIZ = c932770aNf;
        this.LIZIZ = list;
    }
}
