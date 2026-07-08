package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0cEj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1004110cEj implements InterfaceC0148002o {
    public final boolean LL;
    public final int LLILLJJLI;
    public final int LLILLL;
    public final String LLILZ;
    public final boolean LLILZIL;

    public C1004110cEj() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1004110cEj)) {
            return false;
        }
        C1004110cEj c1004110cEj = (C1004110cEj) obj;
        return this.LL == c1004110cEj.LL && this.LLILLJJLI == c1004110cEj.LLILLJJLI && this.LLILLL == c1004110cEj.LLILLL && Intrinsics.LJFF(this.LLILZ, c1004110cEj.LLILZ) && this.LLILZIL == c1004110cEj.LLILZIL;
    }

    public final int hashCode() {
        return (((((((C786410Ut5.Z2(this.LL) * 31) + this.LLILLJJLI) * 31) + this.LLILLL) * 31) + this.LLILZ.hashCode()) * 31) + C786410Ut5.Z2(this.LLILZIL);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("QuickShareState(hasPlayNsInVideo=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", videoCompleteTimes=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", totalPlayDuration=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", triggerSource=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", isRepostGuideShown=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C1004110cEj(int i) {
        this(0, 0, "", false, false);
    }

    public C1004110cEj(int i, int i2, String str, boolean z, boolean z2) {
        this.LL = z;
        this.LLILLJJLI = i;
        this.LLILLL = i2;
        this.LLILZ = str;
        this.LLILZIL = z2;
    }

    public static C1004110cEj LIZ(C1004110cEj c1004110cEj, int i, int i2, String str, boolean z, int i3) {
        boolean z2;
        boolean z3 = z;
        String str2 = str;
        int i4 = i2;
        int i5 = i;
        if ((i3 & 1) != 0) {
            z2 = c1004110cEj.LL;
        } else {
            z2 = false;
        }
        if ((i3 & 2) != 0) {
            i5 = c1004110cEj.LLILLJJLI;
        }
        if ((i3 & 4) != 0) {
            i4 = c1004110cEj.LLILLL;
        }
        if ((i3 & 8) != 0) {
            str2 = c1004110cEj.LLILZ;
        }
        if ((i3 & 16) != 0) {
            z3 = c1004110cEj.LLILZIL;
        }
        c1004110cEj.getClass();
        return new C1004110cEj(i5, i4, str2, z2, z3);
    }
}
