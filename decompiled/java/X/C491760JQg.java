package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0JQg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C491760JQg implements InterfaceC0148002o {
    public final String LL;
    public final C291001Au<Boolean> LLILLJJLI;
    public final C291001Au<Boolean> LLILLL;

    public C491760JQg() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C491760JQg)) {
            return false;
        }
        C491760JQg c491760JQg = (C491760JQg) obj;
        return Intrinsics.LJFF(this.LL, c491760JQg.LL) && Intrinsics.LJFF(this.LLILLJJLI, c491760JQg.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c491760JQg.LLILLL);
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
        sbLIZ.append("EmotePollEditVMState(enterFrom=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", eventFetchEmoteSuc=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", eventEmoteSelectChange=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C491760JQg(int i) {
        this(null, null, "");
    }

    public C491760JQg(C291001Au c291001Au, C291001Au c291001Au2, String str) {
        this.LL = str;
        this.LLILLJJLI = c291001Au;
        this.LLILLL = c291001Au2;
    }
}
