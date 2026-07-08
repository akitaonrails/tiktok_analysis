package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0IAm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C462180IAm implements InterfaceC1891350zJl {
    public final C06XP LL;
    public final InterfaceC1673306gt LLILLJJLI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C462180IAm)) {
            return false;
        }
        C462180IAm c462180IAm = (C462180IAm) obj;
        return Intrinsics.LJFF(this.LL, c462180IAm.LL) && Intrinsics.LJFF(this.LLILLJJLI, c462180IAm.LLILLJJLI);
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
        sbLIZ.append("RecallMessageData(message=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", botPadding=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (!(interfaceC1891350zJl instanceof C462180IAm)) {
            return false;
        }
        return Intrinsics.LJFF(this.LLILLJJLI, ((C462180IAm) interfaceC1891350zJl).LLILLJJLI);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if ((interfaceC1891350zJl instanceof C462180IAm) && Intrinsics.LJFF(((C462180IAm) interfaceC1891350zJl).LL.LIZ.getUuid(), this.LL.LIZ.getUuid())) {
            return true;
        }
        return false;
    }

    public C462180IAm(C06XP c06xp, EnumC912210ZqV enumC912210ZqV) {
        this.LL = c06xp;
        this.LLILLJJLI = enumC912210ZqV;
    }
}
