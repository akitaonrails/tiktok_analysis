package X;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.06El, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1574506El extends AbstractC1573806Ee {
    public final String LIZJ;
    public final String LIZLLL;
    public final String LJ;
    public final Map<String, Object> LJFF;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1574506El)) {
            return false;
        }
        C1574506El c1574506El = (C1574506El) obj;
        return Intrinsics.LJFF(this.LIZJ, c1574506El.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c1574506El.LIZLLL) && Intrinsics.LJFF(this.LJ, c1574506El.LJ) && Intrinsics.LJFF(this.LJFF, c1574506El.LJFF);
    }

    public final int hashCode() {
        return (((((this.LIZJ.hashCode() * 31) + this.LIZLLL.hashCode()) * 31) + this.LJ.hashCode()) * 31) + this.LJFF.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CampaignBubbleShow(uuid=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", convId=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", campaignId=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", params=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1574506El(String str, String str2, String str3, Map<String, ? extends Object> map) {
        super("streak_floating_widget_campaign_bubble_show", map);
        this.LIZJ = str;
        this.LIZLLL = str2;
        this.LJ = str3;
        this.LJFF = map;
    }
}
