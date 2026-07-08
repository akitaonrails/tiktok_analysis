package X;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.06Em, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1574606Em extends AbstractC1573806Ee {
    public final String LIZJ;
    public final String LIZLLL;
    public final String LJ;
    public final Map<String, Object> LJFF;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1574606Em)) {
            return false;
        }
        C1574606Em c1574606Em = (C1574606Em) obj;
        return Intrinsics.LJFF(this.LIZJ, c1574606Em.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c1574606Em.LIZLLL) && Intrinsics.LJFF(this.LJ, c1574606Em.LJ) && Intrinsics.LJFF(this.LJFF, c1574606Em.LJFF);
    }

    public final int hashCode() {
        return (((((this.LIZJ.hashCode() * 31) + this.LIZLLL.hashCode()) * 31) + this.LJ.hashCode()) * 31) + this.LJFF.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CampaignGuideFinished(uuid=");
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

    public C1574606Em(String str, String str2, String str3, Map<String, ? extends Object> map) {
        super("streak_widget_campaign_guide_finished", map);
        this.LIZJ = str;
        this.LIZLLL = str2;
        this.LJ = str3;
        this.LJFF = map;
    }
}
