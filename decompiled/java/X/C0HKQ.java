package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0HKQ, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0HKQ extends RuntimeException {
    public static final int $stable = 8;
    public final EnumC439270HKj LL;
    public final EnumC439250HKh LLILLJJLI;
    public final String LLILLL;

    public final C0HKQ copy(EnumC439270HKj enumC439270HKj, EnumC439250HKh enumC439250HKh, String str) {
        return new C0HKQ(enumC439270HKj, enumC439250HKh, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0HKQ)) {
            return false;
        }
        C0HKQ c0hkq = (C0HKQ) obj;
        return this.LL == c0hkq.LL && this.LLILLJJLI == c0hkq.LLILLJJLI && Intrinsics.LJFF(this.LLILLL, c0hkq.LLILLL);
    }

    public int hashCode() {
        int iHashCode = ((this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode()) * 31;
        String str = this.LLILLL;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    @Override // java.lang.Throwable
    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TnsCheckFailException(failureState=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", creationProcess=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", message=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final EnumC439250HKh getCreationProcess() {
        return this.LLILLJJLI;
    }

    public final EnumC439270HKj getFailureState() {
        return this.LL;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return this.LLILLL;
    }

    public C0HKQ(EnumC439270HKj enumC439270HKj, EnumC439250HKh enumC439250HKh, String str) {
        super(str);
        this.LL = enumC439270HKj;
        this.LLILLJJLI = enumC439250HKh;
        this.LLILLL = str;
    }
}
