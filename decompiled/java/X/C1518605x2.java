package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.05x2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1518605x2 implements InterfaceC1891350zJl {
    public final String LL;
    public final boolean LLILLJJLI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1518605x2)) {
            return false;
        }
        C1518605x2 c1518605x2 = (C1518605x2) obj;
        return Intrinsics.LJFF(this.LL, c1518605x2.LL) && this.LLILLJJLI == c1518605x2.LLILLJJLI;
    }

    public final int hashCode() {
        return (this.LL.hashCode() * 31) + C786410Ut5.Z2(this.LLILLJJLI);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AvatarPowerItem(userId=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", shouldClip=");
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
        C1518605x2 c1518605x2;
        String str = this.LL;
        String str2 = null;
        if ((interfaceC1891350zJl instanceof C1518605x2) && (c1518605x2 = (C1518605x2) interfaceC1891350zJl) != null) {
            str2 = c1518605x2.LL;
        }
        return Intrinsics.LJFF(str, str2);
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        C1518605x2 c1518605x2;
        if (interfaceC1891350zJl instanceof C1518605x2) {
            c1518605x2 = (C1518605x2) interfaceC1891350zJl;
        } else {
            c1518605x2 = null;
        }
        boolean z = false;
        if (c1518605x2 != null && this.LLILLJJLI == c1518605x2.LLILLJJLI) {
            z = true;
        }
        return new C1518805x4(!z);
    }

    public C1518605x2(String str, boolean z) {
        this.LL = str;
        this.LLILLJJLI = z;
    }
}
