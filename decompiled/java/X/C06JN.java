package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.06JN, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class C06JN implements InterfaceC0148002o {
    public final String LL;
    public final C291001Au<Boolean> LLILLJJLI;
    public final C291001Au<Boolean> LLILLL;

    public C06JN() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C06JN)) {
            return false;
        }
        C06JN c06jn = (C06JN) obj;
        return Intrinsics.LJFF(this.LL, c06jn.LL) && Intrinsics.LJFF(this.LLILLJJLI, c06jn.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c06jn.LLILLL);
    }

    public final int hashCode() {
        int iHashCode = this.LL.hashCode() * 31;
        C291001Au<Boolean> c291001Au = this.LLILLJJLI;
        int iHashCode2 = (iHashCode + (c291001Au == null ? 0 : c291001Au.hashCode())) * 31;
        C291001Au<Boolean> c291001Au2 = this.LLILLL;
        return iHashCode2 + (c291001Au2 != null ? c291001Au2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("EmotePollStartVMState(enterFrom=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", eventFetchEmoteSuc=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", eventEmoteInsufficient=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C06JN(int i) {
        this(null, null, "");
    }

    public C06JN(C291001Au c291001Au, C291001Au c291001Au2, String str) {
        this.LL = str;
        this.LLILLJJLI = c291001Au;
        this.LLILLL = c291001Au2;
    }
}
