package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0P8h, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C639970P8h implements C0PWT {
    public final String LL;

    public C639970P8h() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C639970P8h) && Intrinsics.LJFF(this.LL, ((C639970P8h) obj).LL);
    }

    public final int hashCode() {
        return this.LL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SearchEntranceFromSubAction(searchEntranceSub=");
        sbLIZ.append(this.LL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    static {
        C0Q3E.LJFF().Ww1().LIZIZ(C13LE.LIZ(C639970P8h.class), new C639980P8i());
    }

    @Override // X.C0PWT
    public final boolean isLog() {
        return C0P9U.LIZ();
    }

    public /* synthetic */ C639970P8h(int i) {
        this("");
    }

    public C639970P8h(String str) {
        this.LL = str;
    }
}
