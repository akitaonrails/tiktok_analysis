package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0qai, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1555900qai extends AbstractC1556640qbu<EnumC2174471A8f> {
    public final List<EnumC2174471A8f> LLILLJJLI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1555900qai) && Intrinsics.LJFF(this.LLILLJJLI, ((C1555900qai) obj).LLILLJJLI);
    }

    public final int hashCode() {
        return this.LLILLJJLI.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ContentGroupState(items=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1555900qai() {
        this(C13BV.INSTANCE);
    }

    @Override // X.AbstractC1556640qbu, X.InterfaceC1556650qbv
    public final List<EnumC2174471A8f> getItems() {
        return this.LLILLJJLI;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1555900qai(List<? extends EnumC2174471A8f> list) {
        super(list);
        this.LLILLJJLI = list;
    }
}
