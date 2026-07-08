package X;

import com.ss.android.ugc.aweme.im.message.content.BaseHeader;
import com.ss.android.ugc.aweme.im.message.content.FeatureAttachmentContent;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ZFT, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0ZFT {
    public final FeatureAttachmentContent LIZ;
    public final BaseHeader LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0ZFT)) {
            return false;
        }
        C0ZFT c0zft = (C0ZFT) obj;
        return Intrinsics.LJFF(this.LIZ, c0zft.LIZ) && Intrinsics.LJFF(this.LIZIZ, c0zft.LIZIZ);
    }

    public final int hashCode() {
        int iHashCode = this.LIZ.hashCode() * 31;
        BaseHeader baseHeader = this.LIZIZ;
        return iHashCode + (baseHeader == null ? 0 : baseHeader.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SharedFeedReplyConfig(featureAttachmentContent=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", baseHeader=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0ZFT(FeatureAttachmentContent featureAttachmentContent, BaseHeader baseHeader) {
        this.LIZ = featureAttachmentContent;
        this.LIZIZ = baseHeader;
    }
}
