package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.07uB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2010507uB implements InterfaceC0148002o {
    public final String LL;
    public final List<String> LLILLJJLI;
    public final boolean LLILLL;

    public C2010507uB() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2010507uB)) {
            return false;
        }
        C2010507uB c2010507uB = (C2010507uB) obj;
        return Intrinsics.LJFF(this.LL, c2010507uB.LL) && Intrinsics.LJFF(this.LLILLJJLI, c2010507uB.LLILLJJLI) && this.LLILLL == c2010507uB.LLILLL;
    }

    public final int hashCode() {
        return (((this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode()) * 31) + C786410Ut5.Z2(this.LLILLL);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MessageRequestNavBarState(centerTitle=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", rightVisibleTags=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", showSeparator=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C2010507uB(int i) {
        this("", false, C13BV.INSTANCE);
    }

    public C2010507uB(String str, boolean z, List list) {
        this.LL = str;
        this.LLILLJJLI = list;
        this.LLILLL = z;
    }
}
