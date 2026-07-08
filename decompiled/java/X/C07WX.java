package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.07WX, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C07WX {
    public final List<C954460awe> LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C07WX) && Intrinsics.LJFF(this.LIZ, ((C07WX) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TakeStageCustomSettingsPanelPerformanceInfo(userSortedPerformerList=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C07WX(List<C954460awe> list) {
        this.LIZ = list;
    }
}
