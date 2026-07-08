package X;

import com.bytedance.aigc.proto.FlowDomain;
import com.bytedance.aigc.proto.SceneDomain;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Ld6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C547180Ld6 {
    public final FlowDomain LIZ;
    public final SceneDomain LIZIZ;
    public final String LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C547180Ld6)) {
            return false;
        }
        C547180Ld6 c547180Ld6 = (C547180Ld6) obj;
        return this.LIZ == c547180Ld6.LIZ && this.LIZIZ == c547180Ld6.LIZIZ && Intrinsics.LJFF(this.LIZJ, c547180Ld6.LIZJ);
    }

    public final int hashCode() {
        int iHashCode = ((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31;
        String str = this.LIZJ;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AIKitTraceEvent(flowDomain=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", sceneDomain=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", eventName=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static C547180Ld6 LIZ(C547180Ld6 c547180Ld6, String str) {
        FlowDomain flowDomain = c547180Ld6.LIZ;
        SceneDomain sceneDomain = c547180Ld6.LIZIZ;
        c547180Ld6.getClass();
        return new C547180Ld6(flowDomain, sceneDomain, str);
    }

    public C547180Ld6(FlowDomain flowDomain, SceneDomain sceneDomain, String str) {
        this.LIZ = flowDomain;
        this.LIZIZ = sceneDomain;
        this.LIZJ = str;
    }
}
