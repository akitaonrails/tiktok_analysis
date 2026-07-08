package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0CbS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C316840CbS implements InterfaceC0148002o {
    public final String LL;
    public final C291001Au<Boolean> LLILLJJLI;
    public final C291001Au<Boolean> LLILLL;
    public final C291001Au<Boolean> LLILZ;

    public C316840CbS() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C316840CbS)) {
            return false;
        }
        C316840CbS c316840CbS = (C316840CbS) obj;
        return Intrinsics.LJFF(this.LL, c316840CbS.LL) && Intrinsics.LJFF(this.LLILLJJLI, c316840CbS.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c316840CbS.LLILLL) && Intrinsics.LJFF(this.LLILZ, c316840CbS.LLILZ);
    }

    public final int hashCode() {
        int iHashCode = this.LL.hashCode() * 31;
        C291001Au<Boolean> c291001Au = this.LLILLJJLI;
        int iHashCode2 = (iHashCode + (c291001Au == null ? 0 : c291001Au.hashCode())) * 31;
        C291001Au<Boolean> c291001Au2 = this.LLILLL;
        int iHashCode3 = (iHashCode2 + (c291001Au2 == null ? 0 : c291001Au2.hashCode())) * 31;
        C291001Au<Boolean> c291001Au3 = this.LLILZ;
        return iHashCode3 + (c291001Au3 != null ? c291001Au3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("EmotePollDetailVMState(enterFrom=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", eventFetchPollDetailSuc=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", eventDetailStyleConfigUpdate=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", evenCountDown=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C316840CbS(int i) {
        this("", null, null, null);
    }

    public C316840CbS(String str, C291001Au<Boolean> c291001Au, C291001Au<Boolean> c291001Au2, C291001Au<Boolean> c291001Au3) {
        this.LL = str;
        this.LLILLJJLI = c291001Au;
        this.LLILLL = c291001Au2;
        this.LLILZ = c291001Au3;
    }

    public static C316840CbS LIZ(C316840CbS c316840CbS, C291001Au c291001Au, C291001Au c291001Au2, C291001Au c291001Au3, int i) {
        String str;
        if ((i & 1) != 0) {
            str = c316840CbS.LL;
        } else {
            str = null;
        }
        if ((i & 2) != 0) {
            c291001Au = c316840CbS.LLILLJJLI;
        }
        if ((i & 4) != 0) {
            c291001Au2 = c316840CbS.LLILLL;
        }
        if ((i & 8) != 0) {
            c291001Au3 = c316840CbS.LLILZ;
        }
        c316840CbS.getClass();
        return new C316840CbS(str, c291001Au, c291001Au2, c291001Au3);
    }
}
