package X;

import com.bytedance.ies.ugc.aweme.commercialize.compliance.topics.model.SensitiveTopicStruct;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0TPp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C746390TPp extends AbstractC746450TPv {
    public final SensitiveTopicStruct LIZ;
    public final int LIZIZ = 4;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C746390TPp) && Intrinsics.LJFF(this.LIZ, ((C746390TPp) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SensitiveItem(sensitiveTopicStruct=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.AbstractC746450TPv
    public final int LIZ() {
        return this.LIZIZ;
    }

    public C746390TPp(SensitiveTopicStruct sensitiveTopicStruct) {
        this.LIZ = sensitiveTopicStruct;
    }
}
