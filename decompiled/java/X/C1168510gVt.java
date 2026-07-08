package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0gVt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1168510gVt implements InterfaceC0148002o {
    public final String LL;
    public final String LLILLJJLI;
    public final C291001Au<Boolean> LLILLL;
    public final C291001Au<String> LLILZ;
    public final boolean LLILZIL;
    public final C291001Au<String> LLILZLL;
    public final String LLIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1168510gVt)) {
            return false;
        }
        C1168510gVt c1168510gVt = (C1168510gVt) obj;
        return Intrinsics.LJFF(this.LL, c1168510gVt.LL) && Intrinsics.LJFF(this.LLILLJJLI, c1168510gVt.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c1168510gVt.LLILLL) && Intrinsics.LJFF(this.LLILZ, c1168510gVt.LLILZ) && this.LLILZIL == c1168510gVt.LLILZIL && Intrinsics.LJFF(this.LLILZLL, c1168510gVt.LLILZLL) && Intrinsics.LJFF(this.LLIZ, c1168510gVt.LLIZ);
    }

    public final int hashCode() {
        return (((((((((((this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode()) * 31) + this.LLILLL.hashCode()) * 31) + this.LLILZ.hashCode()) * 31) + C786410Ut5.Z2(this.LLILZIL)) * 31) + this.LLILZLL.hashCode()) * 31) + this.LLIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PlaylistChoosePanelState(selectedPlaylistId=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", selectedPlaylistName=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", selectPlaylistEvent=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", statusViewStatus=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", showDivideLine=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(", addToPlaylistResult=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(", addToPlayListResultMsg=");
        sbLIZ.append(this.LLIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1168510gVt(String str, String str2, C291001Au<Boolean> c291001Au, C291001Au<String> c291001Au2, boolean z, C291001Au<String> c291001Au3, String str3) {
        this.LL = str;
        this.LLILLJJLI = str2;
        this.LLILLL = c291001Au;
        this.LLILZ = c291001Au2;
        this.LLILZIL = z;
        this.LLILZLL = c291001Au3;
        this.LLIZ = str3;
    }

    public static C1168510gVt LIZ(C1168510gVt c1168510gVt, String str, String str2, C291001Au c291001Au, C291001Au c291001Au2, boolean z, C291001Au c291001Au3, String str3, int i) {
        String str4 = str3;
        C291001Au c291001Au4 = c291001Au3;
        boolean z2 = z;
        C291001Au c291001Au5 = c291001Au2;
        C291001Au c291001Au6 = c291001Au;
        String str5 = str2;
        String str6 = str;
        if ((i & 1) != 0) {
            str6 = c1168510gVt.LL;
        }
        if ((i & 2) != 0) {
            str5 = c1168510gVt.LLILLJJLI;
        }
        if ((i & 4) != 0) {
            c291001Au6 = c1168510gVt.LLILLL;
        }
        if ((i & 8) != 0) {
            c291001Au5 = c1168510gVt.LLILZ;
        }
        if ((i & 16) != 0) {
            z2 = c1168510gVt.LLILZIL;
        }
        if ((i & 32) != 0) {
            c291001Au4 = c1168510gVt.LLILZLL;
        }
        if ((i & 64) != 0) {
            str4 = c1168510gVt.LLIZ;
        }
        c1168510gVt.getClass();
        return new C1168510gVt(str6, str5, c291001Au6, c291001Au5, z2, c291001Au4, str4);
    }
}
