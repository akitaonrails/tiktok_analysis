package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.13lY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20105013lY implements Comparable<C20105013lY> {
    public final long LL;
    public final C00GI LLILLJJLI;
    public final String LLILLL;
    public final Runnable LLILZ;
    public volatile boolean LLILZIL = false;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C20105013lY)) {
            return false;
        }
        C20105013lY c20105013lY = (C20105013lY) obj;
        return this.LL == c20105013lY.LL && this.LLILLJJLI == c20105013lY.LLILLJJLI && Intrinsics.LJFF(this.LLILLL, c20105013lY.LLILLL) && Intrinsics.LJFF(this.LLILZ, c20105013lY.LLILZ) && this.LLILZIL == c20105013lY.LLILZIL;
    }

    public final int hashCode() {
        int iY2 = ((C786410Ut5.Y2(this.LL) * 31) + this.LLILLJJLI.hashCode()) * 31;
        String str = this.LLILLL;
        return ((((iY2 + (str == null ? 0 : str.hashCode())) * 31) + this.LLILZ.hashCode()) * 31) + C786410Ut5.Z2(this.LLILZIL);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PrioritizedTask(id=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", priority=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", name=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", task=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", cancelled=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // java.lang.Comparable
    public final int compareTo(C20105013lY c20105013lY) {
        C20105013lY c20105013lY2 = c20105013lY;
        int iLJI = Intrinsics.LJI(this.LLILLJJLI.ordinal(), c20105013lY2.LLILLJJLI.ordinal());
        if (iLJI != 0) {
            return -iLJI;
        }
        return Intrinsics.LJII(this.LL, c20105013lY2.LL);
    }

    public C20105013lY(long j, C00GI c00gi, String str, Runnable runnable) {
        this.LL = j;
        this.LLILLJJLI = c00gi;
        this.LLILLL = str;
        this.LLILZ = runnable;
    }
}
