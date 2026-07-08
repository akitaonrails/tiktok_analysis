package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0V0S, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0V0S extends C0V0U {
    public final String LL;

    public final C0V0S copy(String str) {
        return new C0V0S(str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0V0S) && Intrinsics.LJFF(this.LL, ((C0V0S) obj).LL);
    }

    public int hashCode() {
        return this.LL.hashCode();
    }

    @Override // java.lang.Throwable
    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("InvalidType(type=");
        sbLIZ.append(this.LL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final String getType() {
        return this.LL;
    }

    public C0V0S(String str) {
        this.LL = str;
    }
}
