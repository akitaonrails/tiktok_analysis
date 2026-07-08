package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0xs0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1835700xs0 implements InterfaceC0148002o {
    public final Long LL;
    public final int LLILLJJLI;
    public final EnumC1782910wUr LLILLL;
    public final long LLILZ;
    public final long LLILZIL;
    public final int LLILZLL;
    public final int LLIZ;

    public C1835700xs0() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1835700xs0)) {
            return false;
        }
        C1835700xs0 c1835700xs0 = (C1835700xs0) obj;
        return Intrinsics.LJFF(this.LL, c1835700xs0.LL) && this.LLILLJJLI == c1835700xs0.LLILLJJLI && this.LLILLL == c1835700xs0.LLILLL && this.LLILZ == c1835700xs0.LLILZ && this.LLILZIL == c1835700xs0.LLILZIL && this.LLILZLL == c1835700xs0.LLILZLL && this.LLIZ == c1835700xs0.LLIZ;
    }

    public final int hashCode() {
        Long l = this.LL;
        return ((((((((((((l == null ? 0 : l.hashCode()) * 31) + this.LLILLJJLI) * 31) + this.LLILLL.hashCode()) * 31) + C786410Ut5.Y2(this.LLILZ)) * 31) + C786410Ut5.Y2(this.LLILZIL)) * 31) + this.LLILZLL) * 31) + this.LLIZ;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SharedPlayerState(ownerFragmentId=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", ownerIndex=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", event=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", positionMs=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", durationMs=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(", videoWidth=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(", videoHeight=");
        sbLIZ.append(this.LLIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C1835700xs0(int i) {
        this(null, -1, EnumC1782910wUr.IDLE, 0L, 0L, 0, 0);
    }

    public C1835700xs0(Long l, int i, EnumC1782910wUr enumC1782910wUr, long j, long j2, int i2, int i3) {
        this.LL = l;
        this.LLILLJJLI = i;
        this.LLILLL = enumC1782910wUr;
        this.LLILZ = j;
        this.LLILZIL = j2;
        this.LLILZLL = i2;
        this.LLIZ = i3;
    }

    public static C1835700xs0 LIZ(C1835700xs0 c1835700xs0, Long l, int i, EnumC1782910wUr enumC1782910wUr, long j, long j2, int i2, int i3, int i4) {
        int i5 = i3;
        int i6 = i2;
        long j3 = j;
        EnumC1782910wUr enumC1782910wUr2 = enumC1782910wUr;
        int i7 = i;
        long j4 = j2;
        Long l2 = l;
        if ((i4 & 1) != 0) {
            l2 = c1835700xs0.LL;
        }
        if ((i4 & 2) != 0) {
            i7 = c1835700xs0.LLILLJJLI;
        }
        if ((i4 & 4) != 0) {
            enumC1782910wUr2 = c1835700xs0.LLILLL;
        }
        if ((i4 & 8) != 0) {
            j3 = c1835700xs0.LLILZ;
        }
        if ((i4 & 16) != 0) {
            j4 = c1835700xs0.LLILZIL;
        }
        if ((i4 & 32) != 0) {
            i6 = c1835700xs0.LLILZLL;
        }
        if ((i4 & 64) != 0) {
            i5 = c1835700xs0.LLIZ;
        }
        c1835700xs0.getClass();
        return new C1835700xs0(l2, i7, enumC1782910wUr2, j3, j4, i6, i5);
    }
}
