package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0JI7, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0JI7 implements InterfaceC2753014t {
    public final String LL;
    public final long LLILLJJLI;
    public final long LLILLL;
    public final long LLILZ;
    public final String LLILZIL;
    public final InterfaceC489200JGk LLILZLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0JI7)) {
            return false;
        }
        C0JI7 c0ji7 = (C0JI7) obj;
        return Intrinsics.LJFF(this.LL, c0ji7.LL) && this.LLILLJJLI == c0ji7.LLILLJJLI && this.LLILLL == c0ji7.LLILLL && this.LLILZ == c0ji7.LLILZ && Intrinsics.LJFF(this.LLILZIL, c0ji7.LLILZIL) && Intrinsics.LJFF(this.LLILZLL, c0ji7.LLILZLL);
    }

    public final int hashCode() {
        int iHashCode = ((((((((this.LL.hashCode() * 31) + C786410Ut5.Y2(this.LLILLJJLI)) * 31) + C786410Ut5.Y2(this.LLILLL)) * 31) + C786410Ut5.Y2(this.LLILZ)) * 31) + this.LLILZIL.hashCode()) * 31;
        InterfaceC489200JGk interfaceC489200JGk = this.LLILZLL;
        return iHashCode + (interfaceC489200JGk == null ? 0 : interfaceC489200JGk.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PcsCourseMusicPeelSource(enterFrom=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", courseID=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", videoID=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", anchorID=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", playerIntent=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(", courseVideo=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0JI7(String str, long j, long j2, long j3, String str2, InterfaceC489200JGk interfaceC489200JGk) {
        this.LL = str;
        this.LLILLJJLI = j;
        this.LLILLL = j2;
        this.LLILZ = j3;
        this.LLILZIL = str2;
        this.LLILZLL = interfaceC489200JGk;
    }
}
