package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.07cS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1900607cS extends RuntimeException {
    public final String LL;
    public final Throwable LLILLJJLI;

    public C1900607cS() {
        this(null, null);
    }

    public final C1900607cS copy(String str, Throwable th) {
        return new C1900607cS(str, th);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1900607cS)) {
            return false;
        }
        C1900607cS c1900607cS = (C1900607cS) obj;
        return Intrinsics.LJFF(this.LL, c1900607cS.LL) && Intrinsics.LJFF(this.LLILLJJLI, c1900607cS.LLILLJJLI);
    }

    public int hashCode() {
        String str = this.LL;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Throwable th = this.LLILLJJLI;
        return iHashCode + (th != null ? th.hashCode() : 0);
    }

    @Override // java.lang.Throwable
    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("EditSaveLocalTnsException(message=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", cause=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.LLILLJJLI;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return this.LL;
    }

    public C1900607cS(String str) {
        this(str, null);
    }

    public C1900607cS(String str, Throwable th) {
        this.LL = str;
        this.LLILLJJLI = th;
    }
}
