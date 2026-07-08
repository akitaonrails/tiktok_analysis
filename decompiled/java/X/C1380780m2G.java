package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0m2G, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1380780m2G implements InterfaceC2753014t {
    public final String LL;
    public final Aweme LLILLJJLI;
    public final String LLILLL;
    public final String LLILZ;
    public final String LLILZIL;
    public final int LLILZLL;
    public final String LLIZ;
    public final String LLIZLLLIL;
    public final String LLJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1380780m2G)) {
            return false;
        }
        C1380780m2G c1380780m2G = (C1380780m2G) obj;
        return Intrinsics.LJFF(this.LL, c1380780m2G.LL) && Intrinsics.LJFF(this.LLILLJJLI, c1380780m2G.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c1380780m2G.LLILLL) && Intrinsics.LJFF(this.LLILZ, c1380780m2G.LLILZ) && Intrinsics.LJFF(this.LLILZIL, c1380780m2G.LLILZIL) && this.LLILZLL == c1380780m2G.LLILZLL && Intrinsics.LJFF(this.LLIZ, c1380780m2G.LLIZ) && Intrinsics.LJFF(this.LLIZLLLIL, c1380780m2G.LLIZLLLIL) && Intrinsics.LJFF(this.LLJ, c1380780m2G.LLJ);
    }

    public final int hashCode() {
        return (((((((((((((((this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode()) * 31) + this.LLILLL.hashCode()) * 31) + this.LLILZ.hashCode()) * 31) + this.LLILZIL.hashCode()) * 31) + this.LLILZLL) * 31) + this.LLIZ.hashCode()) * 31) + this.LLIZLLLIL.hashCode()) * 31) + this.LLJ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("DownloadGlobalConfigProperty(sourceId=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", aweme=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", enterFrom=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", downloadMethod=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", detailTabName=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(", isLandScapeScreen=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(", downloadID=");
        sbLIZ.append(this.LLIZ);
        sbLIZ.append(", externalShareUrlUserId=");
        sbLIZ.append(this.LLIZLLLIL);
        sbLIZ.append(", externalShareOid=");
        sbLIZ.append(this.LLJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1380780m2G(Aweme aweme, String str, String str2, int i, String str3, String str4, String str5, int i2) {
        String string;
        if ((i2 & 1) != 0) {
            string = UUID.randomUUID().toString();
        } else {
            string = null;
        }
        String str6 = (i2 & 16) != 0 ? "" : null;
        str3 = (i2 & 64) != 0 ? string : str3;
        str4 = (i2 & 128) != 0 ? "" : str4;
        str5 = (i2 & 256) != 0 ? "" : str5;
        this.LL = string;
        this.LLILLJJLI = aweme;
        this.LLILLL = str;
        this.LLILZ = str2;
        this.LLILZIL = str6;
        this.LLILZLL = i;
        this.LLIZ = str3;
        this.LLIZLLLIL = str4;
        this.LLJ = str5;
    }
}
