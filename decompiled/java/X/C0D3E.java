package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0D3E, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0D3E extends C0D3D {
    public final String LL;
    public final List<String> LLILLJJLI;

    public final C0D3E copy(String str, List<String> list) {
        return new C0D3E(str, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0D3E)) {
            return false;
        }
        C0D3E c0d3e = (C0D3E) obj;
        return Intrinsics.LJFF(this.LL, c0d3e.LL) && Intrinsics.LJFF(this.LLILLJJLI, c0d3e.LLILLJJLI);
    }

    public int hashCode() {
        return (this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode();
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BulletList(subtitle=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", items=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final List<String> getItems() {
        return this.LLILLJJLI;
    }

    public final String getSubtitle() {
        return this.LL;
    }

    public C0D3E(String str, List<String> list) {
        this.LL = str;
        this.LLILLJJLI = list;
    }
}
