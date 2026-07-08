package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0dwW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1069700dwW extends AbstractC1069740dwa {
    public final EnumC1070410dxf LL;
    public final boolean LLILLJJLI;
    public final int LLILLL;
    public final C1073970e3P LLILZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1069700dwW)) {
            return false;
        }
        C1069700dwW c1069700dwW = (C1069700dwW) obj;
        return this.LL == c1069700dwW.LL && this.LLILLJJLI == c1069700dwW.LLILLJJLI && this.LLILLL == c1069700dwW.LLILLL && Intrinsics.LJFF(this.LLILZ, c1069700dwW.LLILZ);
    }

    public final int hashCode() {
        return (((((this.LL.hashCode() * 31) + C786410Ut5.Z2(this.LLILLJJLI)) * 31) + this.LLILLL) * 31) + this.LLILZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("RecFriendsAuthItem(platform=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", isGrant=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", matchCount=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", trackInfo=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.AbstractC1069740dwa, X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        C1069700dwW c1069700dwW;
        C1069700dwW c1069700dwW2;
        boolean z = interfaceC1891350zJl instanceof C1069700dwW;
        if (z && (c1069700dwW = (C1069700dwW) interfaceC1891350zJl) != null && this.LLILLL == c1069700dwW.LLILLL && z && (c1069700dwW2 = (C1069700dwW) interfaceC1891350zJl) != null && this.LLILLJJLI == c1069700dwW2.LLILLJJLI) {
            return true;
        }
        return false;
    }

    @Override // X.AbstractC1069740dwa, X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        C1069700dwW c1069700dwW;
        EnumC1070410dxf enumC1070410dxf = this.LL;
        EnumC1070410dxf enumC1070410dxf2 = null;
        if ((interfaceC1891350zJl instanceof C1069700dwW) && (c1069700dwW = (C1069700dwW) interfaceC1891350zJl) != null) {
            enumC1070410dxf2 = c1069700dwW.LL;
        }
        if (enumC1070410dxf == enumC1070410dxf2) {
            return true;
        }
        return false;
    }

    public C1069700dwW(EnumC1070410dxf enumC1070410dxf, boolean z, int i, C1073970e3P c1073970e3P) {
        this.LL = enumC1070410dxf;
        this.LLILLJJLI = z;
        this.LLILLL = i;
        this.LLILZ = c1073970e3P;
    }
}
