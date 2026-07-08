package X;

import com.bytedance.ies.ugc.aweme.commercialize.compliance.topics.model.Gender;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0TOi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C746060TOi extends AbstractC746450TPv {
    public final Gender LIZ;
    public final int LIZIZ;
    public final int LIZJ = 1;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C746060TOi)) {
            return false;
        }
        C746060TOi c746060TOi = (C746060TOi) obj;
        return Intrinsics.LJFF(this.LIZ, c746060TOi.LIZ) && this.LIZIZ == c746060TOi.LIZIZ;
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + this.LIZIZ;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("GenderItem(gender=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", adTrafficType=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.AbstractC746450TPv
    public final int LIZ() {
        return this.LIZJ;
    }

    public C746060TOi(Gender gender, int i) {
        this.LIZ = gender;
        this.LIZIZ = i;
    }
}
