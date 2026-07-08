package X;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Pe2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C649680Pe2 implements Serializable {
    public static final int $stable = 0;
    public final String darkUrl;
    public final int heightDp;
    public final String lightUrl;
    public final int widthDp;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C649680Pe2)) {
            return false;
        }
        C649680Pe2 c649680Pe2 = (C649680Pe2) obj;
        return Intrinsics.LJFF(this.darkUrl, c649680Pe2.darkUrl) && Intrinsics.LJFF(this.lightUrl, c649680Pe2.lightUrl) && this.widthDp == c649680Pe2.widthDp && this.heightDp == c649680Pe2.heightDp;
    }

    public int hashCode() {
        String str = this.darkUrl;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.lightUrl;
        return ((((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + this.widthDp) * 31) + this.heightDp;
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SubTabIcon(darkUrl=");
        sbLIZ.append(this.darkUrl);
        sbLIZ.append(", lightUrl=");
        sbLIZ.append(this.lightUrl);
        sbLIZ.append(", widthDp=");
        sbLIZ.append(this.widthDp);
        sbLIZ.append(", heightDp=");
        sbLIZ.append(this.heightDp);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C649680Pe2(String str, String str2, int i, int i2) {
        this.darkUrl = str;
        this.lightUrl = str2;
        this.widthDp = i;
        this.heightDp = i2;
    }
}
