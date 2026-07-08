package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Q8N, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0Q8N implements C0PWT {
    public final String LL;
    public final String LLILLJJLI;

    public C0Q8N() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0Q8N)) {
            return false;
        }
        C0Q8N c0q8n = (C0Q8N) obj;
        return Intrinsics.LJFF(this.LL, c0q8n.LL) && Intrinsics.LJFF(this.LLILLJJLI, c0q8n.LLILLJJLI);
    }

    public final int hashCode() {
        return (this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SearchEntranceWithInputAction(hintWord=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", hintWordId=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    static {
        C0Q3E.LJFF().Xf0().LIZIZ(C13LE.LIZ(C0Q8N.class), new C0Q8O());
    }

    @Override // X.C0PWT
    public final boolean isLog() {
        return C0P9U.LIZ();
    }

    public /* synthetic */ C0Q8N(int i) {
        this("", "");
    }

    public C0Q8N(String str, String str2) {
        this.LL = str;
        this.LLILLJJLI = str2;
    }
}
