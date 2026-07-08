package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0HKR, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0HKR extends RuntimeException {
    public static final int $stable = 8;
    public final EnumC439400HKw LL;
    public final String LLILLJJLI;

    public final C0HKR copy(EnumC439400HKw enumC439400HKw, String str) {
        return new C0HKR(enumC439400HKw, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0HKR)) {
            return false;
        }
        C0HKR c0hkr = (C0HKR) obj;
        return this.LL == c0hkr.LL && Intrinsics.LJFF(this.LLILLJJLI, c0hkr.LLILLJJLI);
    }

    public int hashCode() {
        return (this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode();
    }

    @Override // java.lang.Throwable
    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("DetectFaceException(imageCheckFailure=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", message=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final EnumC439400HKw getImageCheckFailure() {
        return this.LL;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return this.LLILLJJLI;
    }

    public C0HKR(EnumC439400HKw enumC439400HKw, String str) {
        super(str);
        this.LL = enumC439400HKw;
        this.LLILLJJLI = str;
    }
}
