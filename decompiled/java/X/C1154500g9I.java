package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0g9I, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1154500g9I extends AbstractC1154520g9K {
    public final String LL;
    public final String LLILLJJLI;

    public final C1154500g9I copy(String str) {
        return new C1154500g9I(str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1154500g9I) && Intrinsics.LJFF(this.LL, ((C1154500g9I) obj).LL);
    }

    public int hashCode() {
        return this.LL.hashCode();
    }

    @Override // java.lang.Throwable
    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("UnknownType(type=");
        sbLIZ.append(this.LL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return this.LLILLJJLI;
    }

    public final String getType() {
        return this.LL;
    }

    public C1154500g9I(String str) {
        this.LL = str;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Unknown orchestrator type: ");
        sbLIZ.append(str);
        this.LLILLJJLI = C2188811AlT.LIZIZ(sbLIZ);
    }
}
