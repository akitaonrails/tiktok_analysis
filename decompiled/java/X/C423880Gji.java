package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Gji, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C423880Gji implements InterfaceC423930Gjn {
    public final List<InterfaceC423860Gjg> LIZ;
    public final List<InterfaceC423860Gjg> LIZIZ;
    public final List<InterfaceC423860Gjg> LIZJ;

    /* JADX WARN: Illegal instructions before constructor call */
    public C423880Gji() {
        List list = null;
        this(list, list, 7);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C423880Gji)) {
            return false;
        }
        C423880Gji c423880Gji = (C423880Gji) obj;
        return Intrinsics.LJFF(this.LIZ, c423880Gji.LIZ) && Intrinsics.LJFF(this.LIZIZ, c423880Gji.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c423880Gji.LIZJ);
    }

    public final int hashCode() {
        List<InterfaceC423860Gjg> list = this.LIZ;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        List<InterfaceC423860Gjg> list2 = this.LIZIZ;
        int iHashCode2 = (iHashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<InterfaceC423860Gjg> list3 = this.LIZJ;
        return iHashCode2 + (list3 != null ? list3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MultipleStyleText(titleMeta=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", subtitleMeta=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", descriptionMeta=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C423880Gji(List list, List list2, int i) {
        this((List<? extends InterfaceC423860Gjg>) ((i & 1) != 0 ? null : list), (List<? extends InterfaceC423860Gjg>) ((i & 2) != 0 ? null : list2), (List<? extends InterfaceC423860Gjg>) null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C423880Gji(List<? extends InterfaceC423860Gjg> list, List<? extends InterfaceC423860Gjg> list2, List<? extends InterfaceC423860Gjg> list3) {
        this.LIZ = list;
        this.LIZIZ = list2;
        this.LIZJ = list3;
    }
}
