package X;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ykB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1869290ykB {
    public final String LIZ;
    public final Map<String, Object> LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1869290ykB)) {
            return false;
        }
        C1869290ykB c1869290ykB = (C1869290ykB) obj;
        return Intrinsics.LJFF(this.LIZ, c1869290ykB.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1869290ykB.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c1869290ykB.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c1869290ykB.LIZLLL);
    }

    public final int hashCode() {
        return (((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode()) * 31) + this.LIZLLL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CampaignGameplay(gameplayId=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", payload=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", pspStrategyKey=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", campaignId=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1869290ykB(String str, Map<String, ? extends Object> map, String str2, String str3) {
        this.LIZ = str;
        this.LIZIZ = map;
        this.LIZJ = str2;
        this.LIZLLL = str3;
    }
}
