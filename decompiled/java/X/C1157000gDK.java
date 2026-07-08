package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0gDK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1157000gDK extends AbstractC1156990gDJ {
    public final long LL;
    public final String LLILLJJLI;
    public final String LLILLL;
    public final boolean LLILZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1157000gDK)) {
            return false;
        }
        C1157000gDK c1157000gDK = (C1157000gDK) obj;
        return this.LL == c1157000gDK.LL && Intrinsics.LJFF(this.LLILLJJLI, c1157000gDK.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c1157000gDK.LLILLL) && this.LLILZ == c1157000gDK.LLILZ;
    }

    public final int hashCode() {
        int iY2 = C786410Ut5.Y2(this.LL) * 31;
        String str = this.LLILLJJLI;
        int iHashCode = (iY2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.LLILLL;
        return ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + C786410Ut5.Z2(this.LLILZ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("DayItem(timestamp=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", collectionAwemeId=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", firstRealAwemeId=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", isFirstRealAwemeLoaded=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.AbstractC1156990gDJ, X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (!(interfaceC1891350zJl instanceof C1157000gDK) || this.LL != ((C1157000gDK) interfaceC1891350zJl).LL) {
            return false;
        }
        return true;
    }

    public C1157000gDK(long j, String str, String str2, boolean z) {
        this.LL = j;
        this.LLILLJJLI = str;
        this.LLILLL = str2;
        this.LLILZ = z;
    }

    public static C1157000gDK LIZ(C1157000gDK c1157000gDK, String str, String str2, boolean z) {
        long j = c1157000gDK.LL;
        c1157000gDK.getClass();
        return new C1157000gDK(j, str, str2, z);
    }
}
