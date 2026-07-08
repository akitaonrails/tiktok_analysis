package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.031F, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C031F extends AbstractC723102s1 {
    public final boolean LL;
    public final String LLILLJJLI;
    public final String LLILLL = "shop_orders_new";

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C031F)) {
            return false;
        }
        C031F c031f = (C031F) obj;
        return this.LL == c031f.LL && Intrinsics.LJFF(this.LLILLJJLI, c031f.LLILLJJLI);
    }

    public final int hashCode() {
        return (C786410Ut5.Z2(this.LL) * 31) + this.LLILLJJLI.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("USUnreachableExpandVO(expand=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", positionTag=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.AbstractC723102s1
    public final String getItemId() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("us_unreachable_expand_item_");
        sbLIZ.append(this.LLILLJJLI);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.AbstractC723102s1
    public final String getGroupId() {
        return this.LLILLL;
    }

    @Override // X.AbstractC723102s1, X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return Intrinsics.LJFF(C031F.class, interfaceC1891350zJl.getClass());
    }

    public C031F(boolean z, String str) {
        this.LL = z;
        this.LLILLJJLI = str;
    }
}
