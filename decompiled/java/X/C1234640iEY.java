package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0iEY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1234640iEY implements InterfaceC2753014t {
    public final AnonymousClass0957<C189200o6<Aweme>> LL;
    public final String LLILLJJLI;
    public final String LLILLL;
    public final String LLILZ;

    public C1234640iEY() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1234640iEY)) {
            return false;
        }
        C1234640iEY c1234640iEY = (C1234640iEY) obj;
        return Intrinsics.LJFF(this.LL, c1234640iEY.LL) && Intrinsics.LJFF(this.LLILLJJLI, c1234640iEY.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c1234640iEY.LLILLL) && Intrinsics.LJFF(this.LLILZ, c1234640iEY.LLILZ);
    }

    public final int hashCode() {
        return (((((this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode()) * 31) + this.LLILLL.hashCode()) * 31) + this.LLILZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("UgAsyncInsertAwemeProperty(shareAweme=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", awemeId=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", ugdpId=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", sourceId=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1234640iEY(C099G c099g, String str, String str2) {
        this.LL = c099g;
        this.LLILLJJLI = str;
        this.LLILLL = str2;
        this.LLILZ = str2;
    }
}
