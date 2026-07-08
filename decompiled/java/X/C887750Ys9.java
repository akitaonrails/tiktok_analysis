package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Ys9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C887750Ys9 implements InterfaceC111300bX {
    public final String LL;
    public final EnumC871430YGn LLILLJJLI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C887750Ys9)) {
            return false;
        }
        C887750Ys9 c887750Ys9 = (C887750Ys9) obj;
        return Intrinsics.LJFF(this.LL, c887750Ys9.LL) && this.LLILLJJLI == c887750Ys9.LLILLJJLI;
    }

    public final int hashCode() {
        return (this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MessageRequestConfig(enterFromForMob=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", requestType=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C887750Ys9() {
        this("notification_page", EnumC871430YGn.ALL_STRANGER);
    }

    public C887750Ys9(String str, EnumC871430YGn enumC871430YGn) {
        this.LL = str;
        this.LLILLJJLI = enumC871430YGn;
    }
}
