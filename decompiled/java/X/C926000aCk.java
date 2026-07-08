package X;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.chatroom.model.multilive.MultiLiveAnchorPanelSettings;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0aCk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C926000aCk extends AbstractC926030aCn {
    public final User LIZLLL;
    public final boolean LJ;
    public final long LJFF;
    public final int LJI;
    public final MultiLiveAnchorPanelSettings LJII = null;
    public final Integer LJIIIIZZ = null;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C926000aCk)) {
            return false;
        }
        C926000aCk c926000aCk = (C926000aCk) obj;
        return Intrinsics.LJFF(this.LIZLLL, c926000aCk.LIZLLL) && this.LJ == c926000aCk.LJ && this.LJFF == c926000aCk.LJFF && this.LJI == c926000aCk.LJI && Intrinsics.LJFF(this.LJII, c926000aCk.LJII) && Intrinsics.LJFF(this.LJIIIIZZ, c926000aCk.LJIIIIZZ);
    }

    public final int hashCode() {
        User user = this.LIZLLL;
        int iHashCode = (((((((user == null ? 0 : user.hashCode()) * 31) + C786410Ut5.Z2(this.LJ)) * 31) + C786410Ut5.Y2(this.LJFF)) * 31) + this.LJI) * 31;
        MultiLiveAnchorPanelSettings multiLiveAnchorPanelSettings = this.LJII;
        int iHashCode2 = (iHashCode + (multiLiveAnchorPanelSettings == null ? 0 : multiLiveAnchorPanelSettings.hashCode())) * 31;
        Integer num = this.LJIIIIZZ;
        return iHashCode2 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ShowInvitationPanel(operatorUser=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", operatorIsModerator=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", invitationTimestamp=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", interactType=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(", panelSetting=");
        sbLIZ.append(this.LJII);
        sbLIZ.append(", shareRevenueSetting=");
        sbLIZ.append(this.LJIIIIZZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C926000aCk(User user, boolean z, long j, int i) {
        this.LIZLLL = user;
        this.LJ = z;
        this.LJFF = j;
        this.LJI = i;
    }
}
