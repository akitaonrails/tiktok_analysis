package X;

import com.ss.android.ugc.aweme.aigc.graph.spec.data.runtime.global.AIGCWorkflowConfig;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0LmO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C552940LmO {
    public final String LIZ;
    public final AIGCWorkflowConfig LIZIZ;
    public final Map<String, InterfaceC1406105et> LIZJ;
    public final Map<String, C552890LmJ<?, ?, ?, ?>> LIZLLL;
    public final List<C551510Lk5> LJ;
    public final String LJFF;
    public final long LJI;
    public final Set<String> LJII;

    public C552940LmO() {
        this((String) null, (AIGCWorkflowConfig) null, (Map) null, (Map) null, (List) null, 0L, (Set) null, 255);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C552940LmO)) {
            return false;
        }
        C552940LmO c552940LmO = (C552940LmO) obj;
        return Intrinsics.LJFF(this.LIZ, c552940LmO.LIZ) && Intrinsics.LJFF(this.LIZIZ, c552940LmO.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c552940LmO.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c552940LmO.LIZLLL) && Intrinsics.LJFF(this.LJ, c552940LmO.LJ) && Intrinsics.LJFF(this.LJFF, c552940LmO.LJFF) && this.LJI == c552940LmO.LJI && Intrinsics.LJFF(this.LJII, c552940LmO.LJII);
    }

    public final int hashCode() {
        int iHashCode = this.LIZ.hashCode() * 31;
        AIGCWorkflowConfig aIGCWorkflowConfig = this.LIZIZ;
        int iHashCode2 = (((((((iHashCode + (aIGCWorkflowConfig == null ? 0 : aIGCWorkflowConfig.hashCode())) * 31) + this.LIZJ.hashCode()) * 31) + this.LIZLLL.hashCode()) * 31) + this.LJ.hashCode()) * 31;
        String str = this.LJFF;
        return ((((iHashCode2 + (str != null ? str.hashCode() : 0)) * 31) + C786410Ut5.Y2(this.LJI)) * 31) + this.LJII.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AIGCWorkflow(id=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", config=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", initArtifacts=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", nodes=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", links=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", extra=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", createTime=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(", nodeNames=");
        sbLIZ.append(this.LJII);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C552940LmO(String str, AIGCWorkflowConfig aIGCWorkflowConfig, Map map, Map map2, List list, long j, Set set, int i) {
        this((i & 1) != 0 ? UUID.randomUUID().toString() : str, (i & 2) != 0 ? null : aIGCWorkflowConfig, (Map<String, ? extends InterfaceC1406105et>) ((i & 4) != 0 ? C2097608Jq.LJ() : map), (Map<String, ? extends C552890LmJ<?, ?, ?, ?>>) ((i & 8) != 0 ? C2097608Jq.LJ() : map2), (List<C551510Lk5>) ((i & 16) != 0 ? C13BV.INSTANCE : list), (String) null, (i & 64) != 0 ? System.currentTimeMillis() : j, (Set<String>) ((i & 128) != 0 ? C08CX.INSTANCE : set));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C552940LmO(String str, AIGCWorkflowConfig aIGCWorkflowConfig, Map<String, ? extends InterfaceC1406105et> map, Map<String, ? extends C552890LmJ<?, ?, ?, ?>> map2, List<C551510Lk5> list, String str2, long j, Set<String> set) {
        this.LIZ = str;
        this.LIZIZ = aIGCWorkflowConfig;
        this.LIZJ = map;
        this.LIZLLL = map2;
        this.LJ = list;
        this.LJFF = str2;
        this.LJI = j;
        this.LJII = set;
    }
}
