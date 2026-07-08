package X;

import com.bytedance.ies.ugc.aweme.commercialize.compliance.topics.model.AdTopicStruct;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0TPt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C746430TPt extends AbstractC746450TPv {
    public final AdTopicStruct LIZ;
    public final int LIZIZ = 2;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C746430TPt) && Intrinsics.LJFF(this.LIZ, ((C746430TPt) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TopicItem(topicStruct=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.AbstractC746450TPv
    public final int LIZ() {
        return this.LIZIZ;
    }

    public C746430TPt(AdTopicStruct adTopicStruct) {
        this.LIZ = adTopicStruct;
    }
}
