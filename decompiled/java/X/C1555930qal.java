package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0qal, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1555930qal extends AbstractC1556640qbu<EnumC2174511A8j> {
    public final List<EnumC2174511A8j> LLILLJJLI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1555930qal) && Intrinsics.LJFF(this.LLILLJJLI, ((C1555930qal) obj).LLILLJJLI);
    }

    public final int hashCode() {
        return this.LLILLJJLI.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AccountGroupState(items=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1555930qal() {
        this(C13BV.INSTANCE);
    }

    @Override // X.AbstractC1556640qbu, X.InterfaceC1556650qbv
    public final List<EnumC2174511A8j> getItems() {
        return this.LLILLJJLI;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1555930qal(List<? extends EnumC2174511A8j> list) {
        super(list);
        this.LLILLJJLI = list;
    }
}
