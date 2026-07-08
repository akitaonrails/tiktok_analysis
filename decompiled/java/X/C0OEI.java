package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0OEI, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0OEI implements InterfaceC1891350zJl {
    public final int LL;
    public final int LLILLJJLI;
    public final boolean LLILLL;
    public final C615560OCk LLILZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0OEI)) {
            return false;
        }
        C0OEI c0oei = (C0OEI) obj;
        return this.LL == c0oei.LL && this.LLILLJJLI == c0oei.LLILLJJLI && this.LLILLL == c0oei.LLILLL && Intrinsics.LJFF(this.LLILZ, c0oei.LLILZ);
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public final int hashCode() {
        return (((((this.LL * 31) + this.LLILLJJLI) * 31) + C786410Ut5.Z2(this.LLILLL)) * 31) + this.LLILZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AddYoursHubTabItem(hubSubType=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", resId=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", isInitSelected=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", tabTopicCountInfo=");
        sbLIZ.append(this.LLILZ);
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

    public C0OEI(int i, int i2, boolean z, C615560OCk c615560OCk) {
        this.LL = i;
        this.LLILLJJLI = i2;
        this.LLILLL = z;
        this.LLILZ = c615560OCk;
    }
}
