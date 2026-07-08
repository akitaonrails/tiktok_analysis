package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0D0e, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C332100D0e implements InterfaceC332200D0o {
    public final String LL;

    public final C332100D0e copy(String str) {
        return new C332100D0e(str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C332100D0e) && Intrinsics.LJFF(this.LL, ((C332100D0e) obj).LL);
    }

    public int hashCode() {
        return this.LL.hashCode();
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Error(message=");
        sbLIZ.append(this.LL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final String getMessage() {
        return this.LL;
    }

    public C332100D0e(String str) {
        this.LL = str;
    }
}
