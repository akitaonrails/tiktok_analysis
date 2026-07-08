package X;

import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0D9o, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C334540D9o implements Serializable {
    public final String summaryText;
    public final List<String> tags;
    public final String title;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C334540D9o)) {
            return false;
        }
        C334540D9o c334540D9o = (C334540D9o) obj;
        return Intrinsics.LJFF(this.title, c334540D9o.title) && Intrinsics.LJFF(this.summaryText, c334540D9o.summaryText) && Intrinsics.LJFF(this.tags, c334540D9o.tags);
    }

    public int hashCode() {
        return (((this.title.hashCode() * 31) + this.summaryText.hashCode()) * 31) + this.tags.hashCode();
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CheckoutDealsViewState(title=");
        sbLIZ.append(this.title);
        sbLIZ.append(", summaryText=");
        sbLIZ.append(this.summaryText);
        sbLIZ.append(", tags=");
        sbLIZ.append(this.tags);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C334540D9o(String str, String str2, List<String> list) {
        this.title = str;
        this.summaryText = str2;
        this.tags = list;
    }
}
