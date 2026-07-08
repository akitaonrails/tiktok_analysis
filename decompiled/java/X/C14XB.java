package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.14XB, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C14XB implements InterfaceC0148002o {
    public final boolean LL;
    public final boolean LLILLJJLI;
    public final boolean LLILLL;
    public final C291001Au<Integer> LLILZ;
    public final C291001Au<String> LLILZIL;

    public C14XB() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C14XB)) {
            return false;
        }
        C14XB c14xb = (C14XB) obj;
        return this.LL == c14xb.LL && this.LLILLJJLI == c14xb.LLILLJJLI && this.LLILLL == c14xb.LLILLL && Intrinsics.LJFF(this.LLILZ, c14xb.LLILZ) && Intrinsics.LJFF(this.LLILZIL, c14xb.LLILZIL);
    }

    public final int hashCode() {
        int iZ2 = ((((C786410Ut5.Z2(this.LL) * 31) + C786410Ut5.Z2(this.LLILLJJLI)) * 31) + C786410Ut5.Z2(this.LLILLL)) * 31;
        C291001Au<Integer> c291001Au = this.LLILZ;
        int iHashCode = (iZ2 + (c291001Au == null ? 0 : c291001Au.hashCode())) * 31;
        C291001Au<String> c291001Au2 = this.LLILZIL;
        return iHashCode + (c291001Au2 != null ? c291001Au2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PushSettingsUnLoginState(enableNotification=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", videoSuggestSwitch=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", customizedSwitch=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", toastString=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", channelSettings=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C14XB(int i) {
        this(false, false, false, null, null);
    }

    public C14XB(boolean z, boolean z2, boolean z3, C291001Au<Integer> c291001Au, C291001Au<String> c291001Au2) {
        this.LL = z;
        this.LLILLJJLI = z2;
        this.LLILLL = z3;
        this.LLILZ = c291001Au;
        this.LLILZIL = c291001Au2;
    }

    public static C14XB LIZ(C14XB c14xb, boolean z, boolean z2, boolean z3, C291001Au c291001Au, C291001Au c291001Au2, int i) {
        C291001Au c291001Au3 = c291001Au2;
        C291001Au c291001Au4 = c291001Au;
        boolean z4 = z3;
        boolean z5 = z2;
        boolean z6 = z;
        if ((i & 1) != 0) {
            z6 = c14xb.LL;
        }
        if ((i & 2) != 0) {
            z5 = c14xb.LLILLJJLI;
        }
        if ((i & 4) != 0) {
            z4 = c14xb.LLILLL;
        }
        if ((i & 8) != 0) {
            c291001Au4 = c14xb.LLILZ;
        }
        if ((i & 16) != 0) {
            c291001Au3 = c14xb.LLILZIL;
        }
        c14xb.getClass();
        return new C14XB(z6, z5, z4, c291001Au4, c291001Au3);
    }
}
