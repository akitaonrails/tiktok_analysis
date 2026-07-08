package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0JMJ, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0JMJ implements InterfaceC2753014t {
    public final String LL;
    public final long LLILLJJLI;
    public final long LLILLL;
    public final long LLILZ;
    public final int LLILZIL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0JMJ)) {
            return false;
        }
        C0JMJ c0jmj = (C0JMJ) obj;
        return Intrinsics.LJFF(this.LL, c0jmj.LL) && this.LLILLJJLI == c0jmj.LLILLJJLI && this.LLILLL == c0jmj.LLILLL && this.LLILZ == c0jmj.LLILZ && this.LLILZIL == c0jmj.LLILZIL;
    }

    public final int hashCode() {
        return (((((((this.LL.hashCode() * 31) + C786410Ut5.Y2(this.LLILLJJLI)) * 31) + C786410Ut5.Y2(this.LLILLL)) * 31) + C786410Ut5.Y2(this.LLILZ)) * 31) + this.LLILZIL;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("VideoPlayerSource(enterFrom=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", anchorId=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", userId=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", courseId=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", originalSelectedPosition=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0JMJ(int i, long j, long j2, long j3, String str) {
        this.LL = str;
        this.LLILLJJLI = j;
        this.LLILLL = j2;
        this.LLILZ = j3;
        this.LLILZIL = i;
    }
}
