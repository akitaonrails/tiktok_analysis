package X;

import com.ss.android.ugc.aweme.explore.data.ExploreCustomTopicStruct;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.15Tl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20525915Tl extends C150D {
    public final long LL;
    public final String LLILLJJLI;
    public final boolean LLILLL;
    public final List<ExploreCustomTopicStruct> LLILZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C20525915Tl)) {
            return false;
        }
        C20525915Tl c20525915Tl = (C20525915Tl) obj;
        return this.LL == c20525915Tl.LL && Intrinsics.LJFF(this.LLILLJJLI, c20525915Tl.LLILLJJLI) && this.LLILLL == c20525915Tl.LLILLL && Intrinsics.LJFF(this.LLILZ, c20525915Tl.LLILZ);
    }

    public final int hashCode() {
        return (((((C786410Ut5.Y2(this.LL) * 31) + this.LLILLJJLI.hashCode()) * 31) + C786410Ut5.Z2(this.LLILLL)) * 31) + this.LLILZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ExploreRecommendTopicItem(id=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", requestId=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", isFirstScreen=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", interestsList=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.C150D, X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        C20525915Tl c20525915Tl;
        if ((interfaceC1891350zJl instanceof C20525915Tl) && (c20525915Tl = (C20525915Tl) interfaceC1891350zJl) != null && this.LL == c20525915Tl.LL && Intrinsics.LJFF(this.LLILZ, c20525915Tl.LLILZ) && Intrinsics.LJFF(this.LLILLJJLI, c20525915Tl.LLILLJJLI)) {
            return true;
        }
        return false;
    }

    @Override // X.C150D, X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        C20525915Tl c20525915Tl;
        if ((interfaceC1891350zJl instanceof C20525915Tl) && (c20525915Tl = (C20525915Tl) interfaceC1891350zJl) != null && this.LL == c20525915Tl.LL && Intrinsics.LJFF(this.LLILLJJLI, c20525915Tl.LLILLJJLI)) {
            return true;
        }
        return false;
    }

    @Override // X.C150D, X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (interfaceC1891350zJl instanceof C20525915Tl) {
            C20525915Tl c20525915Tl = (C20525915Tl) interfaceC1891350zJl;
            if (!Intrinsics.LJFF(c20525915Tl.LLILZ, this.LLILZ)) {
                return new C20527215Ty(c20525915Tl.LLILZ);
            }
            return null;
        }
        return null;
    }

    public static C20525915Tl LIZ(C20525915Tl c20525915Tl, List list) {
        long j = c20525915Tl.LL;
        String str = c20525915Tl.LLILLJJLI;
        boolean z = c20525915Tl.LLILLL;
        c20525915Tl.getClass();
        return new C20525915Tl(list, j, z, str);
    }

    public C20525915Tl(List list, long j, boolean z, String str) {
        this.LL = j;
        this.LLILLJJLI = str;
        this.LLILLL = z;
        this.LLILZ = list;
    }
}
