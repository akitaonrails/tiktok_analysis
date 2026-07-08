package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0P8e, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C639940P8e implements C0PWT {
    public final String LL;

    public C639940P8e() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C639940P8e) && Intrinsics.LJFF(this.LL, ((C639940P8e) obj).LL);
    }

    public final int hashCode() {
        return this.LL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SearchSupplyEnterFromAction(searchEntrance=");
        sbLIZ.append(this.LL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    static {
        C0Q3E.LJFF().Ww1().LIZIZ(C13LE.LIZ(C639940P8e.class), new C639950P8f());
    }

    @Override // X.C0PWT
    public final boolean isLog() {
        return C0P9U.LIZ();
    }

    public /* synthetic */ C639940P8e(int i) {
        this("");
    }

    public C639940P8e(String str) {
        this.LL = str;
    }
}
