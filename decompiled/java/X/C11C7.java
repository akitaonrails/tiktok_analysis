package X;

import com.ss.android.ugc.aweme.config.FeedbackOptionValue;
import com.ss.android.ugc.aweme.shortvideo.eventtrack.HashTagMobHelper;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.11C7, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C11C7 implements InterfaceC1891350zJl {
    public final FeedbackOptionValue LL;
    public final HashTagMobHelper LLILLJJLI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11C7)) {
            return false;
        }
        C11C7 c11c7 = (C11C7) obj;
        return Intrinsics.LJFF(this.LL, c11c7.LL) && Intrinsics.LJFF(this.LLILLJJLI, c11c7.LLILLJJLI);
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public final int hashCode() {
        FeedbackOptionValue feedbackOptionValue = this.LL;
        int iHashCode = (feedbackOptionValue == null ? 0 : feedbackOptionValue.hashCode()) * 31;
        HashTagMobHelper hashTagMobHelper = this.LLILLJJLI;
        return iHashCode + (hashTagMobHelper != null ? hashTagMobHelper.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("HashtagFeedbackItem(feedbackItemValue=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", mobHelper=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    public C11C7(FeedbackOptionValue feedbackOptionValue, HashTagMobHelper hashTagMobHelper) {
        this.LL = feedbackOptionValue;
        this.LLILLJJLI = hashTagMobHelper;
    }
}
