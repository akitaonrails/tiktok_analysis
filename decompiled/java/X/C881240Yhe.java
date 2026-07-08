package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Yhe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C881240Yhe extends AbstractC885540Yoa<C886410Ypz> {
    public final C886410Ypz LL;
    public final Boolean LLILLJJLI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C881240Yhe)) {
            return false;
        }
        C881240Yhe c881240Yhe = (C881240Yhe) obj;
        return Intrinsics.LJFF(this.LL, c881240Yhe.LL) && Intrinsics.LJFF(this.LLILLJJLI, c881240Yhe.LLILLJJLI);
    }

    public final int hashCode() {
        int iHashCode = this.LL.hashCode() * 31;
        Boolean bool = this.LLILLJJLI;
        return iHashCode + (bool == null ? 0 : bool.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MessageRequestChatListAggregationItem(vo=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", isSelected=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.AbstractC885540Yoa
    public final /* bridge */ /* synthetic */ AbstractC885530YoZ LIZIZ() {
        return this.LL;
    }

    @Override // X.AbstractC885540Yoa
    public final Boolean LIZLLL() {
        return this.LLILLJJLI;
    }

    @Override // X.AbstractC885540Yoa
    public final AbstractC885540Yoa<C886410Ypz> LIZ(Boolean bool) {
        return new C881240Yhe(this.LL, bool);
    }

    @Override // X.AbstractC885540Yoa, X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (interfaceC1891350zJl instanceof C881240Yhe) {
            return Intrinsics.LJFF(this.LL.getKey(), ((C881240Yhe) interfaceC1891350zJl).LL.getKey());
        }
        return false;
    }

    public C881240Yhe(C886410Ypz c886410Ypz, Boolean bool) {
        this.LL = c886410Ypz;
        this.LLILLJJLI = bool;
    }
}
