package X;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0hoq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1218700hoq implements InterfaceC111300bX {
    public final String LL;
    public final String LLILLJJLI;
    public final Context LLILLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1218700hoq)) {
            return false;
        }
        C1218700hoq c1218700hoq = (C1218700hoq) obj;
        return Intrinsics.LJFF(this.LL, c1218700hoq.LL) && Intrinsics.LJFF(this.LLILLJJLI, c1218700hoq.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c1218700hoq.LLILLL);
    }

    public final int hashCode() {
        String str = this.LL;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.LLILLJJLI;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Context context = this.LLILLL;
        return iHashCode2 + (context != null ? context.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TrustDevicesHierarchyData(enterFrom=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", enterMethod=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", fragmentContext=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1218700hoq(Context context, String str, String str2) {
        this.LL = str;
        this.LLILLJJLI = str2;
        this.LLILLL = context;
    }
}
