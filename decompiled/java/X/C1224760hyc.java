package X;

import android.graphics.drawable.Drawable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0hyc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1224760hyc implements InterfaceC1891350zJl {
    public final String LL;
    public final Drawable LLILLJJLI;
    public final String LLILLL;
    public final String LLILZ;
    public final Drawable LLILZIL;
    public final boolean LLILZLL;
    public final boolean LLIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1224760hyc)) {
            return false;
        }
        C1224760hyc c1224760hyc = (C1224760hyc) obj;
        return Intrinsics.LJFF(this.LL, c1224760hyc.LL) && Intrinsics.LJFF(this.LLILLJJLI, c1224760hyc.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c1224760hyc.LLILLL) && Intrinsics.LJFF(this.LLILZ, c1224760hyc.LLILZ) && Intrinsics.LJFF(this.LLILZIL, c1224760hyc.LLILZIL) && this.LLILZLL == c1224760hyc.LLILZLL && this.LLIZ == c1224760hyc.LLIZ;
    }

    public final int hashCode() {
        int iHashCode = this.LL.hashCode() * 31;
        Drawable drawable = this.LLILLJJLI;
        int iHashCode2 = (iHashCode + (drawable == null ? 0 : drawable.hashCode())) * 31;
        String str = this.LLILLL;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.LLILZ;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Drawable drawable2 = this.LLILZIL;
        return ((((iHashCode4 + (drawable2 != null ? drawable2.hashCode() : 0)) * 31) + C786410Ut5.Z2(this.LLILZLL)) * 31) + C786410Ut5.Z2(this.LLIZ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SelectorListHeaderItem(headerId=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", headerIcon=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", headerTitle=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", headerHint=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", headerEndIcon=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(", enable=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(", visible=");
        sbLIZ.append(this.LLIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        InterfaceC1891350zJl interfaceC1891350zJl2;
        if (interfaceC1891350zJl instanceof C1224760hyc) {
            interfaceC1891350zJl2 = interfaceC1891350zJl;
        } else {
            interfaceC1891350zJl2 = null;
        }
        if (interfaceC1891350zJl2 == null) {
            return false;
        }
        C1224760hyc c1224760hyc = (C1224760hyc) interfaceC1891350zJl;
        if (!Intrinsics.LJFF(this.LLILLL, c1224760hyc.LLILLL) || !Intrinsics.LJFF(this.LLILZ, c1224760hyc.LLILZ) || !Intrinsics.LJFF(this.LLILLJJLI, c1224760hyc.LLILLJJLI) || !Intrinsics.LJFF(this.LLILZIL, c1224760hyc.LLILZIL) || this.LLILZLL != c1224760hyc.LLILZLL || this.LLIZ != c1224760hyc.LLIZ) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if ((interfaceC1891350zJl instanceof C1224760hyc) && interfaceC1891350zJl != null) {
            return Intrinsics.LJFF(this.LL, ((C1224760hyc) interfaceC1891350zJl).LL);
        }
        return false;
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        boolean z;
        if (!(interfaceC1891350zJl instanceof C1224760hyc)) {
            return null;
        }
        C1224760hyc c1224760hyc = (C1224760hyc) interfaceC1891350zJl;
        boolean z2 = !Intrinsics.LJFF(this.LLILLL, c1224760hyc.LLILLL);
        boolean z3 = !Intrinsics.LJFF(this.LLILZ, c1224760hyc.LLILZ);
        boolean z4 = !Intrinsics.LJFF(this.LLILLJJLI, c1224760hyc.LLILLJJLI);
        boolean z5 = !Intrinsics.LJFF(this.LLILZIL, c1224760hyc.LLILZIL);
        boolean z6 = false;
        if (this.LLILZLL != c1224760hyc.LLILZLL) {
            z = true;
        } else {
            z = false;
        }
        if (this.LLIZ != c1224760hyc.LLIZ) {
            z6 = true;
        }
        return new C1224770hyd(z2, z3, z4, z5, z, z6);
    }

    public static C1224760hyc LIZ(C1224760hyc c1224760hyc, String str, boolean z, boolean z2, int i) {
        String str2;
        Drawable drawable;
        String str3;
        boolean z3 = z2;
        boolean z4 = z;
        String str4 = str;
        Drawable drawable2 = null;
        if ((i & 1) != 0) {
            str2 = c1224760hyc.LL;
        } else {
            str2 = null;
        }
        if ((i & 2) != 0) {
            drawable = c1224760hyc.LLILLJJLI;
        } else {
            drawable = null;
        }
        if ((i & 4) != 0) {
            str3 = c1224760hyc.LLILLL;
        } else {
            str3 = null;
        }
        if ((i & 8) != 0) {
            str4 = c1224760hyc.LLILZ;
        }
        if ((i & 16) != 0) {
            drawable2 = c1224760hyc.LLILZIL;
        }
        if ((i & 32) != 0) {
            z4 = c1224760hyc.LLILZLL;
        }
        if ((i & 64) != 0) {
            z3 = c1224760hyc.LLIZ;
        }
        return new C1224760hyc(str2, drawable, str3, str4, drawable2, z4, z3);
    }

    public C1224760hyc(String str, Drawable drawable, String str2, String str3, Drawable drawable2, boolean z, boolean z2) {
        this.LL = str;
        this.LLILLJJLI = drawable;
        this.LLILLL = str2;
        this.LLILZ = str3;
        this.LLILZIL = drawable2;
        this.LLILZLL = z;
        this.LLIZ = z2;
    }
}
