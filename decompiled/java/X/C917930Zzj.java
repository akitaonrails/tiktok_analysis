package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Zzj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C917930Zzj implements InterfaceC0148002o {
    public int LL;
    public Integer LLILLJJLI;
    public final long LLILLL;
    public int LLILZ;
    public Integer LLILZIL;

    public C917930Zzj() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C917930Zzj)) {
            return false;
        }
        C917930Zzj c917930Zzj = (C917930Zzj) obj;
        return this.LL == c917930Zzj.LL && Intrinsics.LJFF(this.LLILLJJLI, c917930Zzj.LLILLJJLI) && this.LLILLL == c917930Zzj.LLILLL && this.LLILZ == c917930Zzj.LLILZ && Intrinsics.LJFF(this.LLILZIL, c917930Zzj.LLILZIL);
    }

    public final int hashCode() {
        int i = this.LL * 31;
        Integer num = this.LLILLJJLI;
        int iHashCode = (((((i + (num == null ? 0 : num.hashCode())) * 31) + C786410Ut5.Y2(this.LLILLL)) * 31) + this.LLILZ) * 31;
        Integer num2 = this.LLILZIL;
        return iHashCode + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("GuestShareRevenue(revenueShareForApply=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", revenueShareRatioForApply=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", settingVersionForApply=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", revenueShareForInvite=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", revenueShareRatioForInvite=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C917930Zzj(int i) {
        this(0, null, 0L, 0, null);
    }

    public C917930Zzj(int i, Integer num, long j, int i2, Integer num2) {
        this.LL = i;
        this.LLILLJJLI = num;
        this.LLILLL = j;
        this.LLILZ = i2;
        this.LLILZIL = num2;
    }

    public static C917930Zzj LIZ(C917930Zzj c917930Zzj, int i, Integer num, long j, int i2, Integer num2, int i3) {
        int i4 = i2;
        long j2 = j;
        Integer num3 = num;
        Integer num4 = num2;
        int i5 = i;
        if ((i3 & 1) != 0) {
            i5 = c917930Zzj.LL;
        }
        if ((i3 & 2) != 0) {
            num3 = c917930Zzj.LLILLJJLI;
        }
        if ((i3 & 4) != 0) {
            j2 = c917930Zzj.LLILLL;
        }
        if ((i3 & 8) != 0) {
            i4 = c917930Zzj.LLILZ;
        }
        if ((i3 & 16) != 0) {
            num4 = c917930Zzj.LLILZIL;
        }
        c917930Zzj.getClass();
        return new C917930Zzj(i5, num3, j2, i4, num4);
    }
}
