package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0gPr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1164770gPr implements InterfaceC111300bX {
    public final String LL;
    public final String LLILLJJLI;
    public final String LLILLL;
    public final String LLILZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1164770gPr)) {
            return false;
        }
        C1164770gPr c1164770gPr = (C1164770gPr) obj;
        return Intrinsics.LJFF(this.LL, c1164770gPr.LL) && Intrinsics.LJFF(this.LLILLJJLI, c1164770gPr.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c1164770gPr.LLILLL) && Intrinsics.LJFF(this.LLILZ, c1164770gPr.LLILZ);
    }

    public final int hashCode() {
        return (((((this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode()) * 31) + this.LLILLL.hashCode()) * 31) + this.LLILZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ArtistMusicAwemeListInitData(musicId=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", musicName=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", selectedAwemeId=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", enterMethod=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1164770gPr() {
        this("", "", "", "single_song");
    }

    public C1164770gPr(String str, String str2, String str3, String str4) {
        this.LL = str;
        this.LLILLJJLI = str2;
        this.LLILLL = str3;
        this.LLILZ = str4;
    }
}
