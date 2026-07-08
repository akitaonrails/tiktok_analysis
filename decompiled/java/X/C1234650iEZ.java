package X;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0iEZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1234650iEZ implements InterfaceC2753014t {
    public final String LL;
    public final String LLILLJJLI;
    public final int LLILLL;
    public final int LLILZ;
    public final long LLILZIL;
    public long LLILZLL;
    public final List<String> LLIZ;
    public final boolean LLIZLLLIL;
    public final boolean LLJ;
    public final String LLJI;

    public C1234650iEZ() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1234650iEZ)) {
            return false;
        }
        C1234650iEZ c1234650iEZ = (C1234650iEZ) obj;
        return Intrinsics.LJFF(this.LL, c1234650iEZ.LL) && Intrinsics.LJFF(this.LLILLJJLI, c1234650iEZ.LLILLJJLI) && this.LLILLL == c1234650iEZ.LLILLL && this.LLILZ == c1234650iEZ.LLILZ && this.LLILZIL == c1234650iEZ.LLILZIL && this.LLILZLL == c1234650iEZ.LLILZLL && Intrinsics.LJFF(this.LLIZ, c1234650iEZ.LLIZ) && this.LLIZLLLIL == c1234650iEZ.LLIZLLLIL && this.LLJ == c1234650iEZ.LLJ && Intrinsics.LJFF(this.LLJI, c1234650iEZ.LLJI);
    }

    public final int hashCode() {
        int iHashCode = ((((((((((this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode()) * 31) + this.LLILLL) * 31) + this.LLILZ) * 31) + C786410Ut5.Y2(this.LLILZIL)) * 31) + C786410Ut5.Y2(this.LLILZLL)) * 31;
        List<String> list = this.LLIZ;
        return ((((((iHashCode + (list == null ? 0 : list.hashCode())) * 31) + C786410Ut5.Z2(this.LLIZLLLIL)) * 31) + C786410Ut5.Z2(this.LLJ)) * 31) + this.LLJI.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("UGDeeplinkParamProperty(awemeId=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", ugdpId=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", linkType=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", launchType=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", ugdpStartTime=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(", ugdpTotalDuration=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(", awemeIdList=");
        sbLIZ.append(this.LLIZ);
        sbLIZ.append(", isAwemeList=");
        sbLIZ.append(this.LLIZLLLIL);
        sbLIZ.append(", isFromMainColdLaunch=");
        sbLIZ.append(this.LLJ);
        sbLIZ.append(", sourceId=");
        sbLIZ.append(this.LLJI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1234650iEZ(String str, String str2, int i, int i2, long j, List list, boolean z, boolean z2, int i3) {
        String str3;
        i2 = (i3 & 8) != 0 ? 0 : i2;
        j = (i3 & 16) != 0 ? 0L : j;
        list = (i3 & 64) != 0 ? new ArrayList() : list;
        z = (i3 & 128) != 0 ? false : z;
        z2 = (i3 & 256) != 0 ? false : z2;
        if ((i3 & 512) != 0) {
            str3 = str2;
        } else {
            str3 = null;
        }
        this.LL = str;
        this.LLILLJJLI = str2;
        this.LLILLL = i;
        this.LLILZ = i2;
        this.LLILZIL = j;
        this.LLILZLL = 0L;
        this.LLIZ = list;
        this.LLIZLLLIL = z;
        this.LLJ = z2;
        this.LLJI = str3;
    }
}
