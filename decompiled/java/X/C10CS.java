package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.10CS, reason: invalid class name */
/* JADX INFO: loaded from: classes29.dex */
public final class C10CS implements InterfaceC1891350zJl {
    public final C1917290zzb LL;
    public final String LLILLJJLI;
    public final String LLILLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10CS)) {
            return false;
        }
        C10CS c10cs = (C10CS) obj;
        return Intrinsics.LJFF(this.LL, c10cs.LL) && Intrinsics.LJFF(this.LLILLJJLI, c10cs.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c10cs.LLILLL);
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public final int hashCode() {
        int iHashCode = this.LL.hashCode() * 31;
        String str = this.LLILLJJLI;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.LLILLL;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("GuidePushSettingsItem(param=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", settingName=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", field=");
        sbLIZ.append(this.LLILLL);
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

    public C10CS(C1917290zzb c1917290zzb, String str, String str2) {
        this.LL = c1917290zzb;
        this.LLILLJJLI = str;
        this.LLILLL = str2;
    }
}
