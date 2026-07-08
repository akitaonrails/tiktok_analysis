package X;

import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0YgL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C880430YgL implements InterfaceC879750YfF, Serializable {
    public static final int $stable = 8;
    public final EnumC880520YgU LL;
    public final List<List<EnumC880570YgZ>> LLILLJJLI;

    public final C880430YgL copy(EnumC880520YgU enumC880520YgU, List<? extends List<? extends EnumC880570YgZ>> list) {
        return new C880430YgL(enumC880520YgU, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C880430YgL)) {
            return false;
        }
        C880430YgL c880430YgL = (C880430YgL) obj;
        return this.LL == c880430YgL.LL && Intrinsics.LJFF(this.LLILLJJLI, c880430YgL.LLILLJJLI);
    }

    public int hashCode() {
        return (this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode();
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MessageRequestFilterIdentifier(tabType=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", filterOptions=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final List<List<EnumC880570YgZ>> getFilterOptions() {
        return this.LLILLJJLI;
    }

    public final EnumC880520YgU getTabType() {
        return this.LL;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C880430YgL(EnumC880520YgU enumC880520YgU, List<? extends List<? extends EnumC880570YgZ>> list) {
        this.LL = enumC880520YgU;
        this.LLILLJJLI = list;
    }

    public C880430YgL(EnumC880520YgU enumC880520YgU, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(enumC880520YgU, (i & 2) != 0 ? C13BV.INSTANCE : list);
    }
}
