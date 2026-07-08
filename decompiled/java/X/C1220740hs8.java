package X;

import com.ss.android.ugc.aweme.api.VideoInfoFromURLResponse;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0hs8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1220740hs8 implements InterfaceC0148002o {
    public final C0ZIK LL;
    public final Pair<VideoInfoFromURLResponse, String> LLILLJJLI;
    public final Integer LLILLL;
    public final C291001Au<Boolean> LLILZ;
    public final C291001Au<C1220690hs3> LLILZIL;

    public C1220740hs8() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1220740hs8)) {
            return false;
        }
        C1220740hs8 c1220740hs8 = (C1220740hs8) obj;
        return Intrinsics.LJFF(this.LL, c1220740hs8.LL) && Intrinsics.LJFF(this.LLILLJJLI, c1220740hs8.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c1220740hs8.LLILLL) && Intrinsics.LJFF(this.LLILZ, c1220740hs8.LLILZ) && Intrinsics.LJFF(this.LLILZIL, c1220740hs8.LLILZIL);
    }

    public final int hashCode() {
        C0ZIK c0zik = this.LL;
        int iHashCode = (c0zik == null ? 0 : c0zik.hashCode()) * 31;
        Pair<VideoInfoFromURLResponse, String> pair = this.LLILLJJLI;
        int iHashCode2 = (iHashCode + (pair == null ? 0 : pair.hashCode())) * 31;
        Integer num = this.LLILLL;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        C291001Au<Boolean> c291001Au = this.LLILZ;
        int iHashCode4 = (iHashCode3 + (c291001Au == null ? 0 : c291001Au.hashCode())) * 31;
        C291001Au<C1220690hs3> c291001Au2 = this.LLILZIL;
        return iHashCode4 + (c291001Au2 != null ? c291001Au2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MentionVideoShareState(chainInfo=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", response=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", subtype=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", loading=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", toPreview=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C1220740hs8(int i) {
        this(null, null, null, null, null);
    }

    public C1220740hs8(C0ZIK c0zik, Pair<VideoInfoFromURLResponse, String> pair, Integer num, C291001Au<Boolean> c291001Au, C291001Au<C1220690hs3> c291001Au2) {
        this.LL = c0zik;
        this.LLILLJJLI = pair;
        this.LLILLL = num;
        this.LLILZ = c291001Au;
        this.LLILZIL = c291001Au2;
    }

    public static C1220740hs8 LIZ(C1220740hs8 c1220740hs8, C0ZIK c0zik, Pair pair, Integer num, C291001Au c291001Au, C291001Au c291001Au2, int i) {
        C291001Au c291001Au3 = c291001Au2;
        C291001Au c291001Au4 = c291001Au;
        Integer num2 = num;
        Pair pair2 = pair;
        C0ZIK c0zik2 = c0zik;
        if ((i & 1) != 0) {
            c0zik2 = c1220740hs8.LL;
        }
        if ((i & 2) != 0) {
            pair2 = c1220740hs8.LLILLJJLI;
        }
        if ((i & 4) != 0) {
            num2 = c1220740hs8.LLILLL;
        }
        if ((i & 8) != 0) {
            c291001Au4 = c1220740hs8.LLILZ;
        }
        if ((i & 16) != 0) {
            c291001Au3 = c1220740hs8.LLILZIL;
        }
        c1220740hs8.getClass();
        return new C1220740hs8(c0zik2, pair2, num2, c291001Au4, c291001Au3);
    }
}
