package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Ydy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C878960Ydy implements InterfaceC879010Ye3 {
    public final C0YM2 LL;
    public final C880430YgL LLILLJJLI;
    public final EnumC880520YgU LLILLL;
    public final EnumC877640Ybq LLILZ;
    public final long LLILZIL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C878960Ydy)) {
            return false;
        }
        C878960Ydy c878960Ydy = (C878960Ydy) obj;
        return this.LL == c878960Ydy.LL && Intrinsics.LJFF(this.LLILLJJLI, c878960Ydy.LLILLJJLI) && this.LLILLL == c878960Ydy.LLILLL && this.LLILZ == c878960Ydy.LLILZ && this.LLILZIL == c878960Ydy.LLILZIL;
    }

    public final int hashCode() {
        return (((((((this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode()) * 31) + this.LLILLL.hashCode()) * 31) + this.LLILZ.hashCode()) * 31) + C786410Ut5.Y2(this.LLILZIL);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MessageRequestPageKey(bizId=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", filterIdentifier=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", tabType=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", sortOption=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC879010Ye3
    public final C0YM2 getBizId() {
        return this.LL;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C878960Ydy(C880430YgL c880430YgL, EnumC880520YgU enumC880520YgU, EnumC877640Ybq enumC877640Ybq, long j, int i) {
        C0YM2 c0ym2;
        EnumC877640Ybq enumC877640Ybq2 = enumC877640Ybq;
        if ((i & 1) != 0) {
            c0ym2 = C0YM2.TIKTOK_SOCIAL_IM;
        } else {
            c0ym2 = null;
        }
        this(c0ym2, c880430YgL, enumC880520YgU, (i & 8) != 0 ? EnumC877640Ybq.SORT_BY_TIME_RECENT : enumC877640Ybq2, j);
    }

    public static C878960Ydy LIZ(C878960Ydy c878960Ydy, C880430YgL c880430YgL, EnumC880520YgU enumC880520YgU, EnumC877640Ybq enumC877640Ybq, int i) {
        C0YM2 c0ym2;
        long j;
        EnumC877640Ybq enumC877640Ybq2 = enumC877640Ybq;
        EnumC880520YgU enumC880520YgU2 = enumC880520YgU;
        C880430YgL c880430YgL2 = c880430YgL;
        if ((i & 1) != 0) {
            c0ym2 = c878960Ydy.LL;
        } else {
            c0ym2 = null;
        }
        if ((i & 2) != 0) {
            c880430YgL2 = c878960Ydy.LLILLJJLI;
        }
        if ((i & 4) != 0) {
            enumC880520YgU2 = c878960Ydy.LLILLL;
        }
        if ((i & 8) != 0) {
            enumC877640Ybq2 = c878960Ydy.LLILZ;
        }
        if ((i & 16) != 0) {
            j = c878960Ydy.LLILZIL;
        } else {
            j = 0;
        }
        return new C878960Ydy(c0ym2, c880430YgL2, enumC880520YgU2, enumC877640Ybq2, j);
    }

    public C878960Ydy(C0YM2 c0ym2, C880430YgL c880430YgL, EnumC880520YgU enumC880520YgU, EnumC877640Ybq enumC877640Ybq, long j) {
        this.LL = c0ym2;
        this.LLILLJJLI = c880430YgL;
        this.LLILLL = enumC880520YgU;
        this.LLILZ = enumC877640Ybq;
        this.LLILZIL = j;
    }
}
