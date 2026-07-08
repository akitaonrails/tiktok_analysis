package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Q3B, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0Q3B implements C0PWT {
    public final String LL;
    public final String LLILLJJLI;

    public C0Q3B() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0Q3B)) {
            return false;
        }
        C0Q3B c0q3b = (C0Q3B) obj;
        return Intrinsics.LJFF(this.LL, c0q3b.LL) && Intrinsics.LJFF(this.LLILLJJLI, c0q3b.LLILLJJLI);
    }

    public final int hashCode() {
        return (this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SearchSupplyMissedIdAction(authorId=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", groupId=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    static {
        C0Q3E.LJFF().P70().LIZIZ(C13LE.LIZ(C0Q3B.class), new C0Q3A());
    }

    @Override // X.C0PWT
    public final boolean isLog() {
        return C0P9U.LIZ();
    }

    public /* synthetic */ C0Q3B(int i) {
        this("", "");
    }

    public C0Q3B(String str, String str2) {
        this.LL = str;
        this.LLILLJJLI = str2;
    }
}
