package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0wUj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1782830wUj implements InterfaceC1891350zJl {
    public final int LL;
    public final boolean LLILLJJLI;
    public final String LLILLL;
    public final String LLILZ;
    public final String LLILZIL;
    public final int LLILZLL;
    public final int LLIZ;
    public final int LLIZLLLIL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1782830wUj)) {
            return false;
        }
        C1782830wUj c1782830wUj = (C1782830wUj) obj;
        return this.LL == c1782830wUj.LL && this.LLILLJJLI == c1782830wUj.LLILLJJLI && Intrinsics.LJFF(this.LLILLL, c1782830wUj.LLILLL) && Intrinsics.LJFF(this.LLILZ, c1782830wUj.LLILZ) && Intrinsics.LJFF(this.LLILZIL, c1782830wUj.LLILZIL) && this.LLILZLL == c1782830wUj.LLILZLL && this.LLIZ == c1782830wUj.LLIZ && this.LLIZLLLIL == c1782830wUj.LLIZLLLIL;
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public final int hashCode() {
        return (((((((((((((this.LL * 31) + C786410Ut5.Z2(this.LLILLJJLI)) * 31) + this.LLILLL.hashCode()) * 31) + this.LLILZ.hashCode()) * 31) + this.LLILZIL.hashCode()) * 31) + this.LLILZLL) * 31) + this.LLIZ) * 31) + this.LLIZLLLIL;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("RelationStatusItem(type=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", isMySelf=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", des=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", profileUserUid=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", profileUsername=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(", profileUserFollowerCount=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(", profileUserFollowingCount=");
        sbLIZ.append(this.LLIZ);
        sbLIZ.append(", actualDisplayFollowingCount=");
        sbLIZ.append(this.LLIZLLLIL);
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

    public C1782830wUj(boolean z, int i, int i2, int i3, String str, String str2, int i4, int i5) {
        String str3;
        if ((i5 & 4) != 0) {
            str3 = "";
        } else {
            str3 = null;
        }
        str = (i5 & 8) != 0 ? "" : str;
        str2 = (i5 & 16) != 0 ? "" : str2;
        i2 = (i5 & 32) != 0 ? 0 : i2;
        i3 = (i5 & 64) != 0 ? 0 : i3;
        i4 = (i5 & 128) != 0 ? 0 : i4;
        this.LL = i;
        this.LLILLJJLI = z;
        this.LLILLL = str3;
        this.LLILZ = str;
        this.LLILZIL = str2;
        this.LLILZLL = i2;
        this.LLIZ = i3;
        this.LLIZLLLIL = i4;
    }
}
