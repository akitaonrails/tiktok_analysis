package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0P8b, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C639910P8b implements C0PWT {
    public final String LL;

    public C639910P8b() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C639910P8b) && Intrinsics.LJFF(this.LL, ((C639910P8b) obj).LL);
    }

    public final int hashCode() {
        return this.LL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SearchIsFromPopularWordsAction(isFromPopularWords=");
        sbLIZ.append(this.LL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    static {
        C0Q3E.LJFF().Ww1().LIZIZ(C13LE.LIZ(C639910P8b.class), new C639920P8c());
    }

    @Override // X.C0PWT
    public final boolean isLog() {
        return C0P9U.LIZ();
    }

    public /* synthetic */ C639910P8b(int i) {
        this("");
    }

    public C639910P8b(String str) {
        this.LL = str;
    }
}
