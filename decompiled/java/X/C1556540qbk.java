package X;

import com.tiktok.myna.render.render.MynaElement;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0qbk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1556540qbk {
    public final int LIZ;
    public final MynaElement LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1556540qbk)) {
            return false;
        }
        C1556540qbk c1556540qbk = (C1556540qbk) obj;
        return this.LIZ == c1556540qbk.LIZ && Intrinsics.LJFF(this.LIZIZ, c1556540qbk.LIZIZ);
    }

    public final int hashCode() {
        return (this.LIZ * 31) + this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ListElementData(viewType=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", element=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1556540qbk(int i, MynaElement mynaElement) {
        this.LIZ = i;
        this.LIZIZ = mynaElement;
    }
}
