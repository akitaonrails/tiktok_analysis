package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0fws, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1146800fws implements InterfaceC1891350zJl {
    public final String LL;
    public final String LLILLJJLI;
    public final EnumC1144180fse LLILLL;
    public final boolean LLILZ;
    public final boolean LLILZIL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1146800fws)) {
            return false;
        }
        C1146800fws c1146800fws = (C1146800fws) obj;
        return Intrinsics.LJFF(this.LL, c1146800fws.LL) && Intrinsics.LJFF(this.LLILLJJLI, c1146800fws.LLILLJJLI) && this.LLILLL == c1146800fws.LLILLL && this.LLILZ == c1146800fws.LLILZ && this.LLILZIL == c1146800fws.LLILZIL;
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public final int hashCode() {
        return (((((((this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode()) * 31) + this.LLILLL.hashCode()) * 31) + C786410Ut5.Z2(this.LLILZ)) * 31) + C786410Ut5.Z2(this.LLILZIL);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TaskProgressModel(title=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", desc=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", state=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", showLine=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", isYellow=");
        sbLIZ.append(this.LLILZIL);
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

    public C1146800fws(String str, String str2, EnumC1144180fse enumC1144180fse, boolean z, boolean z2) {
        this.LL = str;
        this.LLILLJJLI = str2;
        this.LLILLL = enumC1144180fse;
        this.LLILZ = z;
        this.LLILZIL = z2;
    }
}
