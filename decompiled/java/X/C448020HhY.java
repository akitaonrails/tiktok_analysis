package X;

import com.ss.android.ugc.aweme.im.common.model.StickerItem;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0HhY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C448020HhY implements InterfaceC0148002o {
    public final List<StickerItem> LL;
    public final String LLILLJJLI;
    public final String LLILLL;
    public final String LLILZ;
    public final long LLILZIL;
    public final String LLILZLL;
    public final long LLIZ;
    public final String LLIZLLLIL;

    public C448020HhY() {
        this(null, null, null, 0L, null, 0L, null, 255);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C448020HhY)) {
            return false;
        }
        C448020HhY c448020HhY = (C448020HhY) obj;
        return Intrinsics.LJFF(this.LL, c448020HhY.LL) && Intrinsics.LJFF(this.LLILLJJLI, c448020HhY.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c448020HhY.LLILLL) && Intrinsics.LJFF(this.LLILZ, c448020HhY.LLILZ) && this.LLILZIL == c448020HhY.LLILZIL && Intrinsics.LJFF(this.LLILZLL, c448020HhY.LLILZLL) && this.LLIZ == c448020HhY.LLIZ && Intrinsics.LJFF(this.LLIZLLLIL, c448020HhY.LLIZLLLIL);
    }

    public final int hashCode() {
        return (((((((((((((this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode()) * 31) + this.LLILLL.hashCode()) * 31) + this.LLILZ.hashCode()) * 31) + C786410Ut5.Y2(this.LLILZIL)) * 31) + this.LLILZLL.hashCode()) * 31) + C786410Ut5.Y2(this.LLIZ)) * 31) + this.LLIZLLLIL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("RecommendStickerVMState(stickerDataList=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", scoreText=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", originalText=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", queryInputText=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", startOfNetworkFetchTimestampMs=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(", querySessionId=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(", triggerTimeMs=");
        sbLIZ.append(this.LLIZ);
        sbLIZ.append(", inputLanguage=");
        sbLIZ.append(this.LLIZLLLIL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C448020HhY(List list, String str, String str2, long j, String str3, long j2, String str4, int i) {
        String str5;
        list = (i & 1) != 0 ? C13BV.INSTANCE : list;
        if ((i & 2) != 0) {
            str5 = "";
        } else {
            str5 = null;
        }
        str = (i & 4) != 0 ? "" : str;
        str2 = (i & 8) != 0 ? "" : str2;
        j = (i & 16) != 0 ? 0L : j;
        str3 = (i & 32) != 0 ? "" : str3;
        j2 = (i & 64) != 0 ? 0L : j2;
        str4 = (i & 128) != 0 ? "" : str4;
        this.LL = list;
        this.LLILLJJLI = str5;
        this.LLILLL = str;
        this.LLILZ = str2;
        this.LLILZIL = j;
        this.LLILZLL = str3;
        this.LLIZ = j2;
        this.LLIZLLLIL = str4;
    }
}
