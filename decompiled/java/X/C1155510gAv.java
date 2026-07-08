package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0gAv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1155510gAv implements InterfaceC0148002o {
    public String LL;
    public boolean LLILLJJLI;

    public C1155510gAv() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1155510gAv)) {
            return false;
        }
        C1155510gAv c1155510gAv = (C1155510gAv) obj;
        return Intrinsics.LJFF(this.LL, c1155510gAv.LL) && this.LLILLJJLI == c1155510gAv.LLILLJJLI;
    }

    public final int hashCode() {
        return (this.LL.hashCode() * 31) + C786410Ut5.Z2(this.LLILLJJLI);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("HashtagFeedbackState(nowSelectCell=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", canSubmit=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C1155510gAv(int i) {
        this("", false);
    }

    public C1155510gAv(String str, boolean z) {
        this.LL = str;
        this.LLILLJJLI = z;
    }
}
