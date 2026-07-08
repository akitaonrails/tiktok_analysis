package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.07ct, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1903307ct extends RuntimeException {
    public final Throwable LL;
    public final String LLILLJJLI;
    public final Integer LLILLL;

    public final C1903307ct copy(Throwable th, String str, Integer num) {
        return new C1903307ct(th, str, num);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1903307ct)) {
            return false;
        }
        C1903307ct c1903307ct = (C1903307ct) obj;
        return Intrinsics.LJFF(this.LL, c1903307ct.LL) && Intrinsics.LJFF(this.LLILLJJLI, c1903307ct.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c1903307ct.LLILLL);
    }

    public int hashCode() {
        Throwable th = this.LL;
        int iHashCode = (th == null ? 0 : th.hashCode()) * 31;
        String str = this.LLILLJJLI;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.LLILLL;
        return iHashCode2 + (num != null ? num.hashCode() : 0);
    }

    @Override // java.lang.Throwable
    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SaveCampusException(cause=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", errorMessage=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", errorCode=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.LL;
    }

    public final Integer getErrorCode() {
        return this.LLILLL;
    }

    public final String getErrorMessage() {
        return this.LLILLJJLI;
    }

    public C1903307ct(Throwable th, String str, Integer num) {
        super(th);
        this.LL = th;
        this.LLILLJJLI = str;
        this.LLILLL = num;
    }
}
