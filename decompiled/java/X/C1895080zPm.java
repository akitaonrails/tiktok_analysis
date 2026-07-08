package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0zPm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1895080zPm implements InterfaceC0148002o {
    public final long LL;
    public final C1895120zPq LLILLJJLI;

    public C1895080zPm() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1895080zPm)) {
            return false;
        }
        C1895080zPm c1895080zPm = (C1895080zPm) obj;
        return this.LL == c1895080zPm.LL && Intrinsics.LJFF(this.LLILLJJLI, c1895080zPm.LLILLJJLI);
    }

    public final int hashCode() {
        int iY2 = C786410Ut5.Y2(this.LL) * 31;
        C1895120zPq c1895120zPq = this.LLILLJJLI;
        return iY2 + (c1895120zPq == null ? 0 : c1895120zPq.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TouchPointDataState(dataModel=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", loginModel=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C1895080zPm(int i) {
        this(0L, new C1895120zPq(System.currentTimeMillis(), EnumC1895270zQ5.TYPE_INIT));
    }

    public C1895080zPm(long j, C1895120zPq c1895120zPq) {
        this.LL = j;
        this.LLILLJJLI = c1895120zPq;
    }
}
