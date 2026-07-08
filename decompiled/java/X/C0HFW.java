package X;

import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0HFW, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0HFW implements InterfaceC1891350zJl {
    public final String LL;
    public final String LLILLJJLI;
    public final UUID LLILLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0HFW)) {
            return false;
        }
        C0HFW c0hfw = (C0HFW) obj;
        return Intrinsics.LJFF(this.LL, c0hfw.LL) && Intrinsics.LJFF(this.LLILLJJLI, c0hfw.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c0hfw.LLILLL);
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public final int hashCode() {
        int iHashCode = this.LL.hashCode() * 31;
        String str = this.LLILLJJLI;
        return ((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.LLILLL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AmberAlertImageData(url=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", description=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", uuid=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0HFW(String str) {
        UUID uuidRandomUUID = UUID.randomUUID();
        this.LL = str;
        this.LLILLJJLI = null;
        this.LLILLL = uuidRandomUUID;
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (interfaceC1891350zJl instanceof C0HFW) {
            C0HFW c0hfw = (C0HFW) interfaceC1891350zJl;
            if (Intrinsics.LJFF(this.LL, c0hfw.LL) && Intrinsics.LJFF(this.LLILLJJLI, c0hfw.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c0hfw.LLILLL)) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if ((interfaceC1891350zJl instanceof C0HFW) && Intrinsics.LJFF(this.LLILLL, ((C0HFW) interfaceC1891350zJl).LLILLL)) {
            return true;
        }
        return false;
    }
}
