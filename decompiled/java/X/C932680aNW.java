package X;

import com.bytedance.android.live.liveinteract.multilive.social.model.GuestInvitePanelResp;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0aNW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C932680aNW {
    public final GuestInvitePanelResp.ListUser LIZ;
    public final boolean LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final String LJ = "";

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C932680aNW)) {
            return false;
        }
        C932680aNW c932680aNW = (C932680aNW) obj;
        return Intrinsics.LJFF(this.LIZ, c932680aNW.LIZ) && this.LIZIZ == c932680aNW.LIZIZ && Intrinsics.LJFF(this.LIZJ, c932680aNW.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c932680aNW.LIZLLL) && Intrinsics.LJFF(this.LJ, c932680aNW.LJ);
    }

    public final int hashCode() {
        return (((((((this.LIZ.hashCode() * 31) + C786410Ut5.Z2(this.LIZIZ)) * 31) + this.LIZJ.hashCode()) * 31) + this.LIZLLL.hashCode()) * 31) + this.LJ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("GuestInviteSectionUserItem(listUserItem=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", isLastInSection=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", linkReason=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", multiRequestId=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", linkSubReason=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C932680aNW(GuestInvitePanelResp.ListUser listUser, boolean z, String str, String str2) {
        this.LIZ = listUser;
        this.LIZIZ = z;
        this.LIZJ = str;
        this.LIZLLL = str2;
    }
}
