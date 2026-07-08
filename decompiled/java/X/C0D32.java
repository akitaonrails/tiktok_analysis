package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0D32, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0D32 extends C0D31 {
    public final List<C0D39> LL;

    public final C0D32 copy(List<C0D39> list) {
        return new C0D32(list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0D32) && Intrinsics.LJFF(this.LL, ((C0D32) obj).LL);
    }

    public int hashCode() {
        return this.LL.hashCode();
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Visible(drawers=");
        sbLIZ.append(this.LL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final List<C0D39> getDrawers() {
        return this.LL;
    }

    public C0D32(List<C0D39> list) {
        this.LL = list;
    }
}
