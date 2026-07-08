package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0gOK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1163820gOK implements InterfaceC0148002o {
    public final List<Aweme> LL;
    public final List<String> LLILLJJLI;
    public final List<String> LLILLL;
    public final C291001Au<Boolean> LLILZ;
    public final C291001Au<Boolean> LLILZIL;
    public final List<Aweme> LLILZLL;
    public final List<String> LLIZ;

    public C1163820gOK() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1163820gOK)) {
            return false;
        }
        C1163820gOK c1163820gOK = (C1163820gOK) obj;
        return Intrinsics.LJFF(this.LL, c1163820gOK.LL) && Intrinsics.LJFF(this.LLILLJJLI, c1163820gOK.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c1163820gOK.LLILLL) && Intrinsics.LJFF(this.LLILZ, c1163820gOK.LLILZ) && Intrinsics.LJFF(this.LLILZIL, c1163820gOK.LLILZIL) && Intrinsics.LJFF(this.LLILZLL, c1163820gOK.LLILZLL) && Intrinsics.LJFF(this.LLIZ, c1163820gOK.LLIZ);
    }

    public final int hashCode() {
        List<Aweme> list = this.LL;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        List<String> list2 = this.LLILLJJLI;
        int iHashCode2 = (iHashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<String> list3 = this.LLILLL;
        int iHashCode3 = (((((iHashCode2 + (list3 == null ? 0 : list3.hashCode())) * 31) + this.LLILZ.hashCode()) * 31) + this.LLILZIL.hashCode()) * 31;
        List<Aweme> list4 = this.LLILZLL;
        int iHashCode4 = (iHashCode3 + (list4 == null ? 0 : list4.hashCode())) * 31;
        List<String> list5 = this.LLIZ;
        return iHashCode4 + (list5 != null ? list5.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MixVideosManageState(mixVideos=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", removeFeedsID=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", addFeedsID=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", onEditType=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", onPlayListChanged=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(", addFeedsAweme=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(", removeFeedsIdForAddPage=");
        sbLIZ.append(this.LLIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C1163820gOK(int i) {
        this(new ArrayList(), new ArrayList(), new ArrayList(), new C291001Au(Boolean.TRUE), new C291001Au(Boolean.FALSE), new ArrayList(), new ArrayList());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1163820gOK(List<? extends Aweme> list, List<String> list2, List<String> list3, C291001Au<Boolean> c291001Au, C291001Au<Boolean> c291001Au2, List<? extends Aweme> list4, List<String> list5) {
        this.LL = list;
        this.LLILLJJLI = list2;
        this.LLILLL = list3;
        this.LLILZ = c291001Au;
        this.LLILZIL = c291001Au2;
        this.LLILZLL = list4;
        this.LLIZ = list5;
    }

    public static C1163820gOK LIZ(C1163820gOK c1163820gOK, List list, List list2, List list3, C291001Au c291001Au, C291001Au c291001Au2, List list4, List list5, int i) {
        List list6 = list5;
        List list7 = list4;
        C291001Au c291001Au3 = c291001Au2;
        C291001Au c291001Au4 = c291001Au;
        List list8 = list3;
        List list9 = list2;
        List list10 = list;
        if ((i & 1) != 0) {
            list10 = c1163820gOK.LL;
        }
        if ((i & 2) != 0) {
            list9 = c1163820gOK.LLILLJJLI;
        }
        if ((i & 4) != 0) {
            list8 = c1163820gOK.LLILLL;
        }
        if ((i & 8) != 0) {
            c291001Au4 = c1163820gOK.LLILZ;
        }
        if ((i & 16) != 0) {
            c291001Au3 = c1163820gOK.LLILZIL;
        }
        if ((i & 32) != 0) {
            list7 = c1163820gOK.LLILZLL;
        }
        if ((i & 64) != 0) {
            list6 = c1163820gOK.LLIZ;
        }
        c1163820gOK.getClass();
        return new C1163820gOK(list10, list9, list8, c291001Au4, c291001Au3, list7, list6);
    }
}
