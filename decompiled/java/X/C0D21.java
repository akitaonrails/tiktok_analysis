package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0D21, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0D21 extends AbstractC332980D3o {
    public final C0D3K LL;

    public final C0D21 copy(C0D3K c0d3k) {
        return new C0D21(c0d3k);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0D21) && Intrinsics.LJFF(this.LL, ((C0D21) obj).LL);
    }

    public int hashCode() {
        return this.LL.hashCode();
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Success(pageData=");
        sbLIZ.append(this.LL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final C0D3K getPageData() {
        return this.LL;
    }

    public C0D21(C0D3K c0d3k) {
        this.LL = c0d3k;
    }
}
