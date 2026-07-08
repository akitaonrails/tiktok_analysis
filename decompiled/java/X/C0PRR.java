package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0PRR, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0PRR implements C0PWT {
    public final String LL;
    public final String LLILLJJLI;
    public final String LLILLL;

    public C0PRR() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0PRR)) {
            return false;
        }
        C0PRR c0prr = (C0PRR) obj;
        return Intrinsics.LJFF(this.LL, c0prr.LL) && Intrinsics.LJFF(this.LLILLJJLI, c0prr.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c0prr.LLILLL);
    }

    public final int hashCode() {
        return (((this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode()) * 31) + this.LLILLL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SearchEntranceWithGlobalAction(launchSchemaString=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", blankPageEnterMethod=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", blankPageEnterFrom=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    static {
        C0Q3E.LJFF().Wg1().LIZIZ(C13LE.LIZ(C0PRR.class), new C0PRS());
    }

    @Override // X.C0PWT
    public final boolean isLog() {
        return C0P9U.LIZ();
    }

    public /* synthetic */ C0PRR(int i) {
        this("", "", "");
    }

    public C0PRR(String str, String str2, String str3) {
        this.LL = str;
        this.LLILLJJLI = str2;
        this.LLILLL = str3;
    }
}
