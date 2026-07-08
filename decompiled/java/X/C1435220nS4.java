package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0nS4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1435220nS4 extends RuntimeException {
    public final Object LL;
    public final Throwable LLILLJJLI;
    public final int LLILLL;
    public final String LLILZ;

    public final C1435220nS4 copy(Object obj, Throwable th, int i, String str) {
        return new C1435220nS4(obj, th, i, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1435220nS4)) {
            return false;
        }
        C1435220nS4 c1435220nS4 = (C1435220nS4) obj;
        return Intrinsics.LJFF(this.LL, c1435220nS4.LL) && Intrinsics.LJFF(this.LLILLJJLI, c1435220nS4.LLILLJJLI) && this.LLILLL == c1435220nS4.LLILLL && Intrinsics.LJFF(this.LLILZ, c1435220nS4.LLILZ);
    }

    public int hashCode() {
        Object obj = this.LL;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * 31;
        Throwable th = this.LLILLJJLI;
        int iHashCode2 = (((iHashCode + (th != null ? th.hashCode() : 0)) * 31) + this.LLILLL) * 31;
        String str = this.LLILZ;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    @Override // java.lang.Throwable
    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("WaveException(nodeTag=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", t=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", code=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", extraMsg=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(")");
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final int getCode() {
        return this.LLILLL;
    }

    public final String getExtraMsg() {
        return this.LLILZ;
    }

    public final Object getNodeTag() {
        return this.LL;
    }

    public final Throwable getT() {
        return this.LLILLJJLI;
    }

    public C1435220nS4(Object obj, Throwable th, int i, String str) {
        super(th);
        this.LL = obj;
        this.LLILLJJLI = th;
        this.LLILLL = i;
        this.LLILZ = str;
    }
}
