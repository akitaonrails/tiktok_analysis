package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.05Wf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1365905Wf extends Throwable {
    public final String LL;
    public final int LLILLJJLI;

    public final C1365905Wf copy(String str, int i) {
        return new C1365905Wf(str, i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1365905Wf)) {
            return false;
        }
        C1365905Wf c1365905Wf = (C1365905Wf) obj;
        return Intrinsics.LJFF(this.LL, c1365905Wf.LL) && this.LLILLJJLI == c1365905Wf.LLILLJJLI;
    }

    public int hashCode() {
        return (this.LL.hashCode() * 31) + this.LLILLJJLI;
    }

    @Override // java.lang.Throwable
    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LyricThrowable(msg=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", errorCode=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final int getErrorCode() {
        return this.LLILLJJLI;
    }

    public final String getMsg() {
        return this.LL;
    }

    public C1365905Wf(String str, int i) {
        super(str, null, false, false);
        this.LL = str;
        this.LLILLJJLI = i;
    }
}
