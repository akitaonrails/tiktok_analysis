package X;

import com.bytedance.lynx.hybrid.ssp.base.SSPResponse;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0dE2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1042120dE2 {
    public static final /* synthetic */ int LJII = 0;
    public final String LIZ;
    public final List<SSPResponse.Rule> LIZIZ;
    public final List<SSPResponse.Rule> LIZJ;
    public final List<SSPResponse.Rule> LIZLLL;
    public final List<SSPResponse.Rule> LJ;
    public final String LJFF;
    public final String LJI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1042120dE2)) {
            return false;
        }
        C1042120dE2 c1042120dE2 = (C1042120dE2) obj;
        return Intrinsics.LJFF(this.LIZ, c1042120dE2.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1042120dE2.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c1042120dE2.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c1042120dE2.LIZLLL) && Intrinsics.LJFF(this.LJ, c1042120dE2.LJ) && Intrinsics.LJFF(this.LJFF, c1042120dE2.LJFF) && Intrinsics.LJFF(this.LJI, c1042120dE2.LJI);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("RecordingRuleWrapper(domain=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", rules=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", getMethodRules=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", postMethodRules=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", otherMethodRules=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", rawDomain=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", from=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1042120dE2(String str, String str2, String str3, List list, List list2, List list3, List list4) {
        this.LIZ = str;
        this.LIZIZ = list;
        this.LIZJ = list2;
        this.LIZLLL = list3;
        this.LJ = list4;
        this.LJFF = str2;
        this.LJI = str3;
    }
}
