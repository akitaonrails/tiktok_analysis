package X;

import java.io.Serializable;

/* JADX INFO: renamed from: X.07bY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1895007bY implements Serializable {
    public final String feedEnterFrom;
    public final String feedFrom;
    public final int feedPageType;

    public int hashCode() {
        return (((this.feedEnterFrom.hashCode() * 31) + this.feedFrom.hashCode()) * 31) + this.feedPageType;
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("EventLogParams(feedEnterFrom=");
        sbLIZ.append(this.feedEnterFrom);
        sbLIZ.append(", feedFrom=");
        sbLIZ.append(this.feedFrom);
        sbLIZ.append(", feedPageType=");
        sbLIZ.append(this.feedPageType);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1895007bY(String str, String str2, int i) {
        this.feedEnterFrom = str;
        this.feedFrom = str2;
        this.feedPageType = i;
    }
}
