package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0g8P, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1153950g8P implements InterfaceC111300bX {
    public final boolean LL;
    public final String LLILLJJLI;

    public C1153950g8P() {
        this(true, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1153950g8P)) {
            return false;
        }
        C1153950g8P c1153950g8P = (C1153950g8P) obj;
        return this.LL == c1153950g8P.LL && Intrinsics.LJFF(this.LLILLJJLI, c1153950g8P.LLILLJJLI);
    }

    public final int hashCode() {
        int iZ2 = C786410Ut5.Z2(this.LL) * 31;
        String str = this.LLILLJJLI;
        return iZ2 + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PoiWriteReviewButtonHierarchyData(shouldShowIcon=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", reviewExtraInfo=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1153950g8P(boolean z, String str) {
        this.LL = z;
        this.LLILLJJLI = str;
    }
}
