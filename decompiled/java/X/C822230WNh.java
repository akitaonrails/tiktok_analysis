package X;

import com.bytedance.pumbaa.hybrid.engine.api.model.ValueModel;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0WNh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C822230WNh extends C0WO5 {
    public final String LIZ;
    public final ValueModel LIZIZ;
    public final C0WO7 LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C822230WNh)) {
            return false;
        }
        C822230WNh c822230WNh = (C822230WNh) obj;
        return Intrinsics.LJFF(this.LIZ, c822230WNh.LIZ) && Intrinsics.LJFF(this.LIZIZ, c822230WNh.LIZIZ) && this.LIZJ == c822230WNh.LIZJ;
    }

    public final int hashCode() {
        int iHashCode = this.LIZ.hashCode() * 31;
        ValueModel valueModel = this.LIZIZ;
        return ((iHashCode + (valueModel == null ? 0 : valueModel.hashCode())) * 31) + this.LIZJ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AtomicCondition(field=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", value=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", operator=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C822230WNh(String str, ValueModel valueModel, C0WO7 c0wo7) {
        this.LIZ = str;
        this.LIZIZ = valueModel;
        this.LIZJ = c0wo7;
    }
}
