package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0D3A, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0D3A extends C0D3D {
    public final List<List<String>> LL;

    public final C0D3A copy(List<? extends List<String>> list) {
        return new C0D3A(list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0D3A) && Intrinsics.LJFF(this.LL, ((C0D3A) obj).LL);
    }

    public int hashCode() {
        return this.LL.hashCode();
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Table(rows=");
        sbLIZ.append(this.LL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final List<List<String>> getRows() {
        return this.LL;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C0D3A(List<? extends List<String>> list) {
        this.LL = list;
    }
}
