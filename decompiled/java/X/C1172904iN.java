package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.04iN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1172904iN extends AbstractC1173004iO {
    public final String LL;
    public final String LLILLJJLI = "";

    public final C1172904iN copy(String str) {
        return new C1172904iN(str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1172904iN) && Intrinsics.LJFF(this.LL, ((C1172904iN) obj).LL);
    }

    public int hashCode() {
        return this.LL.hashCode();
    }

    @Override // java.lang.Throwable
    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MissingConfiguration(field=");
        sbLIZ.append(this.LL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Missing required configuration field: ");
        sbLIZ.append(this.LLILLJJLI);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final String getField() {
        return this.LL;
    }

    public C1172904iN(String str) {
        this.LL = str;
    }
}
