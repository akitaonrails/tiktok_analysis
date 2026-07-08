package X;

import com.ss.android.ugc.aweme.aigc.AIGCStyle;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0hsQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1220920hsQ implements InterfaceC1891350zJl {
    public final AIGCStyle LL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1220920hsQ) && Intrinsics.LJFF(this.LL, ((C1220920hsQ) obj).LL);
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public final int hashCode() {
        return this.LL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ChooseStyleItem(data=");
        sbLIZ.append(this.LL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1220920hsQ(AIGCStyle aIGCStyle) {
        this.LL = aIGCStyle;
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (!(interfaceC1891350zJl instanceof C1220920hsQ)) {
            return false;
        }
        return Intrinsics.LJFF(((C1220920hsQ) interfaceC1891350zJl).LL.name, this.LL.name);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }
}
