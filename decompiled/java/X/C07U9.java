package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.07U9, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C07U9 extends Throwable {
    public final String LL;

    public C07U9() {
        this(null);
    }

    public final C07U9 copy(String str) {
        return new C07U9(str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C07U9) && Intrinsics.LJFF(this.LL, ((C07U9) obj).LL);
    }

    public int hashCode() {
        String str = this.LL;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    @Override // java.lang.Throwable
    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FutureException(msg=");
        sbLIZ.append(this.LL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final String getMsg() {
        return this.LL;
    }

    public C07U9(String str) {
        this.LL = str;
    }
}
