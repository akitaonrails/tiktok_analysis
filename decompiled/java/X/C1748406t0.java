package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import okio.ByteString;

/* JADX INFO: renamed from: X.06t0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1748406t0 implements InterfaceC0148002o {
    public final List<C1735506qv> LL;
    public final long LLILLJJLI;
    public final String LLILLL;
    public final ByteString LLILZ;

    /* JADX WARN: Multi-variable type inference failed */
    public C1748406t0() {
        this((List) null, (String) (0 == true ? 1 : 0), (ByteString) (0 == true ? 1 : 0), 15);
    }

    public static C1748406t0 LIZ(List list, long j, String str, ByteString byteString) {
        return new C1748406t0((List<C1735506qv>) list, j, str, byteString);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1748406t0)) {
            return false;
        }
        C1748406t0 c1748406t0 = (C1748406t0) obj;
        return Intrinsics.LJFF(this.LL, c1748406t0.LL) && this.LLILLJJLI == c1748406t0.LLILLJJLI && Intrinsics.LJFF(this.LLILLL, c1748406t0.LLILLL) && Intrinsics.LJFF(this.LLILZ, c1748406t0.LLILZ);
    }

    public final int hashCode() {
        List<C1735506qv> list = this.LL;
        int iHashCode = (((((list == null ? 0 : list.hashCode()) * 31) + C786410Ut5.Y2(this.LLILLJJLI)) * 31) + this.LLILLL.hashCode()) * 31;
        ByteString byteString = this.LLILZ;
        return iHashCode + (byteString != null ? byteString.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BusinessLeadInfoState(suggestedLeadInfoList=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", lastUpdateTimeStamp=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", messageSource=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", persistentExtra=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C1748406t0(List list, String str, ByteString byteString, int i) {
        this((List<C1735506qv>) ((i & 1) != 0 ? null : list), 0L, (i & 4) != 0 ? "" : str, (i & 8) == 0 ? byteString : null);
    }

    public C1748406t0(List<C1735506qv> list, long j, String str, ByteString byteString) {
        this.LL = list;
        this.LLILLJJLI = j;
        this.LLILLL = str;
        this.LLILZ = byteString;
    }
}
