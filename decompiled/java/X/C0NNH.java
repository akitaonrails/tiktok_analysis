package X;

import com.ss.android.ugc.aweme.addyours.model.AddYoursRecommendation;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0NNH, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0NNH extends C0NNI {
    public final AddYoursRecommendation LLILZLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0NNH) && Intrinsics.LJFF(this.LLILZLL, ((C0NNH) obj).LLILZLL);
    }

    public final int hashCode() {
        AddYoursRecommendation addYoursRecommendation = this.LLILZLL;
        if (addYoursRecommendation == null) {
            return 0;
        }
        return addYoursRecommendation.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AddYoursEntranceWithRcmdTopic(rcmdTopic=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C0NNH(AddYoursRecommendation addYoursRecommendation) {
        Long topicId;
        String topicText;
        Integer topicType;
        if (addYoursRecommendation != null) {
            topicId = addYoursRecommendation.getTopicId();
            topicText = addYoursRecommendation.getTopicText();
            topicType = addYoursRecommendation.getTopicType();
        } else {
            topicId = null;
            topicText = null;
            topicType = null;
        }
        super(topicId, topicText, topicType, false, C08A4.LIZIZ(addYoursRecommendation != null ? addYoursRecommendation.getTopicId() : null));
        this.LLILZLL = addYoursRecommendation;
    }
}
