package X;

import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0m2H, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1380790m2H implements InterfaceC2753014t {
    public final String LL;
    public final String LLILLJJLI;
    public final String LLILLL;
    public final String LLILZ;

    public C1380790m2H() {
        this(null, null, null, 15);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1380790m2H)) {
            return false;
        }
        C1380790m2H c1380790m2H = (C1380790m2H) obj;
        return Intrinsics.LJFF(this.LL, c1380790m2H.LL) && Intrinsics.LJFF(this.LLILLJJLI, c1380790m2H.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c1380790m2H.LLILLL) && Intrinsics.LJFF(this.LLILZ, c1380790m2H.LLILZ);
    }

    public final int hashCode() {
        int iHashCode = this.LL.hashCode() * 31;
        String str = this.LLILLJJLI;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.LLILLL;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.LLILZ;
        return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TakoAIVideoDownloadConfigProperty(sourceId=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", processId=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", takoSessionId=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", videoSessionId=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1380790m2H(String str, String str2, String str3, int i) {
        String string;
        if ((i & 1) != 0) {
            string = UUID.randomUUID().toString();
        } else {
            string = null;
        }
        str = (i & 2) != 0 ? null : str;
        str2 = (i & 4) != 0 ? null : str2;
        str3 = (i & 8) != 0 ? null : str3;
        this.LL = string;
        this.LLILLJJLI = str;
        this.LLILLL = str2;
        this.LLILZ = str3;
    }
}
