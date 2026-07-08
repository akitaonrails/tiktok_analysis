package X;

import com.ss.android.ugc.aweme.search.filter.SubFilterOptionStruct;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Q98, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0Q98 implements InterfaceC1891350zJl {
    public final SubFilterOptionStruct LL;
    public final String LLILLJJLI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0Q98)) {
            return false;
        }
        C0Q98 c0q98 = (C0Q98) obj;
        return Intrinsics.LJFF(this.LL, c0q98.LL) && Intrinsics.LJFF(this.LLILLJJLI, c0q98.LLILLJJLI);
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public final int hashCode() {
        return (this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FlowLayoutItem(struct=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", title=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    public C0Q98(SubFilterOptionStruct subFilterOptionStruct, String str) {
        this.LL = subFilterOptionStruct;
        this.LLILLJJLI = str;
    }
}
