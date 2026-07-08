package X;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0gtc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1183220gtc implements Serializable {
    public static final C1183230gtd Companion = new Object() { // from class: X.0gtd
    };
    public final String enterFrom;
    public final String sourceBtmToken;

    public C1183220gtc() {
        this(null, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1183220gtc)) {
            return false;
        }
        C1183220gtc c1183220gtc = (C1183220gtc) obj;
        return Intrinsics.LJFF(this.enterFrom, c1183220gtc.enterFrom) && Intrinsics.LJFF(this.sourceBtmToken, c1183220gtc.sourceBtmToken);
    }

    public int hashCode() {
        String str = this.enterFrom;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.sourceBtmToken;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PoiOpenPageMobParams(enterFrom=");
        sbLIZ.append(this.enterFrom);
        sbLIZ.append(", sourceBtmToken=");
        sbLIZ.append(this.sourceBtmToken);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1183220gtc(String str, String str2) {
        this.enterFrom = str;
        this.sourceBtmToken = str2;
    }
}
