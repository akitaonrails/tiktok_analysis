package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.07cR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1900507cR extends RuntimeException {
    public final String LL;
    public final Throwable LLILLJJLI;

    public C1900507cR() {
        this(null, null);
    }

    public final C1900507cR copy(String str, Throwable th) {
        return new C1900507cR(str, th);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1900507cR)) {
            return false;
        }
        C1900507cR c1900507cR = (C1900507cR) obj;
        return Intrinsics.LJFF(this.LL, c1900507cR.LL) && Intrinsics.LJFF(this.LLILLJJLI, c1900507cR.LLILLJJLI);
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
        sbLIZ.append("EditPostNoFieldsException(message=");
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

    public C1900507cR(String str) {
        this(str, null);
    }

    public C1900507cR(String str, Throwable th) {
        this.LL = str;
        this.LLILLJJLI = th;
    }
}
