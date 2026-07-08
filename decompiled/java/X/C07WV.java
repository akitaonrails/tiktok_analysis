package X;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.07WV, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C07WV implements Serializable {
    public final boolean isFromFeedItem;
    public final String reqId;

    public C07WV() {
        this(null, false);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C07WV)) {
            return false;
        }
        C07WV c07wv = (C07WV) obj;
        return Intrinsics.LJFF(this.reqId, c07wv.reqId) && this.isFromFeedItem == c07wv.isFromFeedItem;
    }

    public int hashCode() {
        String str = this.reqId;
        return ((str == null ? 0 : str.hashCode()) * 31) + C786410Ut5.Z2(this.isFromFeedItem);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FollowRecommendNavData(reqId=");
        sbLIZ.append(this.reqId);
        sbLIZ.append(", isFromFeedItem=");
        sbLIZ.append(this.isFromFeedItem);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final boolean isFromFeedItem() {
        return this.isFromFeedItem;
    }

    public C07WV(String str, boolean z) {
        this.reqId = str;
        this.isFromFeedItem = z;
    }
}
