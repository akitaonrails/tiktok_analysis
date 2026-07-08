package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Ry6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C713080Ry6 implements InterfaceC0148002o {
    public final String LL;
    public final C291001Au<Boolean> LLILLJJLI;

    public C713080Ry6() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C713080Ry6)) {
            return false;
        }
        C713080Ry6 c713080Ry6 = (C713080Ry6) obj;
        return Intrinsics.LJFF(this.LL, c713080Ry6.LL) && Intrinsics.LJFF(this.LLILLJJLI, c713080Ry6.LLILLJJLI);
    }

    public final int hashCode() {
        int iHashCode = this.LL.hashCode() * 31;
        C291001Au<Boolean> c291001Au = this.LLILLJJLI;
        return iHashCode + (c291001Au == null ? 0 : c291001Au.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("StoryNoteConsumptionState(quickDMString=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", hasPendingToast=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C713080Ry6(int i) {
        this(null, "");
    }

    public C713080Ry6(C291001Au c291001Au, String str) {
        this.LL = str;
        this.LLILLJJLI = c291001Au;
    }

    public static C713080Ry6 LIZ(C713080Ry6 c713080Ry6, String str, C291001Au c291001Au, int i) {
        if ((i & 1) != 0) {
            str = c713080Ry6.LL;
        }
        if ((i & 2) != 0) {
            c291001Au = c713080Ry6.LLILLJJLI;
        }
        c713080Ry6.getClass();
        return new C713080Ry6(c291001Au, str);
    }
}
