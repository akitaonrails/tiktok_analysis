package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0D1w, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C332540D1w extends AbstractC332520D1u {
    public final String LL;

    public final C332540D1w copy(String str) {
        return new C332540D1w(str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C332540D1w) && Intrinsics.LJFF(this.LL, ((C332540D1w) obj).LL);
    }

    public int hashCode() {
        return this.LL.hashCode();
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Failure(message=");
        sbLIZ.append(this.LL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final String getMessage() {
        return this.LL;
    }

    public C332540D1w(String str) {
        this.LL = str;
    }
}
