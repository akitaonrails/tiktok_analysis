package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Sep, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C726610Sep implements InterfaceC0148002o {
    public final C291001Au<List<Aweme>> LL;
    public final String LLILLJJLI;
    public final Integer LLILLL;
    public final String LLILZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C726610Sep)) {
            return false;
        }
        C726610Sep c726610Sep = (C726610Sep) obj;
        return Intrinsics.LJFF(this.LL, c726610Sep.LL) && Intrinsics.LJFF(this.LLILLJJLI, c726610Sep.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c726610Sep.LLILLL) && Intrinsics.LJFF(this.LLILZ, c726610Sep.LLILZ);
    }

    public final int hashCode() {
        int iHashCode = this.LL.hashCode() * 31;
        String str = this.LLILLJJLI;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.LLILLL;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.LLILZ;
        return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LandscapeCacheState(cacheAwemeList=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", failReason=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", errorCode=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", errorMsg=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C726610Sep(C291001Au<? extends List<? extends Aweme>> c291001Au, String str, Integer num, String str2) {
        this.LL = c291001Au;
        this.LLILLJJLI = str;
        this.LLILLL = num;
        this.LLILZ = str2;
    }

    public static C726610Sep LIZ(C726610Sep c726610Sep, C291001Au c291001Au, String str, String str2, int i) {
        Integer num;
        if ((i & 1) != 0) {
            c291001Au = c726610Sep.LL;
        }
        if ((i & 2) != 0) {
            str = c726610Sep.LLILLJJLI;
        }
        if ((i & 4) != 0) {
            num = c726610Sep.LLILLL;
        } else {
            num = null;
        }
        if ((i & 8) != 0) {
            str2 = c726610Sep.LLILZ;
        }
        c726610Sep.getClass();
        return new C726610Sep(c291001Au, str, num, str2);
    }
}
