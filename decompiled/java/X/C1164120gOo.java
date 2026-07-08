package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.mix.model.MixStruct;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0gOo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1164120gOo implements InterfaceC0148002o {
    public final List<Aweme> LL;
    public final C291001Au<Aweme> LLILLJJLI;
    public final C291001Au<Boolean> LLILLL;
    public final int LLILZ;
    public final boolean LLILZIL;
    public final int LLILZLL;
    public final MixStruct LLIZ;
    public final AbstractC1623806Xk<C1169290gX9> LLIZLLLIL;
    public final C291001Au<Unit> LLJ;
    public final C291001Au<Boolean> LLJI;

    public C1164120gOo() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1164120gOo)) {
            return false;
        }
        C1164120gOo c1164120gOo = (C1164120gOo) obj;
        return Intrinsics.LJFF(this.LL, c1164120gOo.LL) && Intrinsics.LJFF(this.LLILLJJLI, c1164120gOo.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c1164120gOo.LLILLL) && this.LLILZ == c1164120gOo.LLILZ && this.LLILZIL == c1164120gOo.LLILZIL && this.LLILZLL == c1164120gOo.LLILZLL && Intrinsics.LJFF(this.LLIZ, c1164120gOo.LLIZ) && Intrinsics.LJFF(this.LLIZLLLIL, c1164120gOo.LLIZLLLIL) && Intrinsics.LJFF(this.LLJ, c1164120gOo.LLJ) && Intrinsics.LJFF(this.LLJI, c1164120gOo.LLJI);
    }

    public final int hashCode() {
        List<Aweme> list = this.LL;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        C291001Au<Aweme> c291001Au = this.LLILLJJLI;
        int iHashCode2 = (iHashCode + (c291001Au == null ? 0 : c291001Au.hashCode())) * 31;
        C291001Au<Boolean> c291001Au2 = this.LLILLL;
        int iHashCode3 = (((((((iHashCode2 + (c291001Au2 == null ? 0 : c291001Au2.hashCode())) * 31) + this.LLILZ) * 31) + C786410Ut5.Z2(this.LLILZIL)) * 31) + this.LLILZLL) * 31;
        MixStruct mixStruct = this.LLIZ;
        int iHashCode4 = (((iHashCode3 + (mixStruct == null ? 0 : mixStruct.hashCode())) * 31) + this.LLIZLLLIL.hashCode()) * 31;
        C291001Au<Unit> c291001Au3 = this.LLJ;
        int iHashCode5 = (iHashCode4 + (c291001Au3 == null ? 0 : c291001Au3.hashCode())) * 31;
        C291001Au<Boolean> c291001Au4 = this.LLJI;
        return iHashCode5 + (c291001Au4 != null ? c291001Au4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MixVideosState(mixVideos=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", selectVideoChange=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", mixDeleteAction=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", pullType=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", openBottomDialog=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(", requestStatus=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(", mixDetail=");
        sbLIZ.append(this.LLIZ);
        sbLIZ.append(", panelState=");
        sbLIZ.append(this.LLIZLLLIL);
        sbLIZ.append(", clickMixVideosDialog=");
        sbLIZ.append(this.LLJ);
        sbLIZ.append(", isPanelReq=");
        sbLIZ.append(this.LLJI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C1164120gOo(int i) {
        this(null, null, null, 1, false, 0, null, C491101vh.LIZ, null, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1164120gOo(List<? extends Aweme> list, C291001Au<? extends Aweme> c291001Au, C291001Au<Boolean> c291001Au2, int i, boolean z, int i2, MixStruct mixStruct, AbstractC1623806Xk<C1169290gX9> abstractC1623806Xk, C291001Au<Unit> c291001Au3, C291001Au<Boolean> c291001Au4) {
        this.LL = list;
        this.LLILLJJLI = c291001Au;
        this.LLILLL = c291001Au2;
        this.LLILZ = i;
        this.LLILZIL = z;
        this.LLILZLL = i2;
        this.LLIZ = mixStruct;
        this.LLIZLLLIL = abstractC1623806Xk;
        this.LLJ = c291001Au3;
        this.LLJI = c291001Au4;
    }

    public static C1164120gOo LIZ(C1164120gOo c1164120gOo, List list, C291001Au c291001Au, C291001Au c291001Au2, int i, boolean z, int i2, MixStruct mixStruct, C1623606Xi c1623606Xi, C291001Au c291001Au3, int i3) {
        C291001Au<Unit> c291001Au4;
        C291001Au c291001Au5 = c291001Au3;
        AbstractC1623806Xk<C1169290gX9> abstractC1623806Xk = c1623606Xi;
        MixStruct mixStruct2 = mixStruct;
        int i4 = i2;
        boolean z2 = z;
        int i5 = i;
        C291001Au c291001Au6 = c291001Au2;
        C291001Au c291001Au7 = c291001Au;
        List list2 = list;
        if ((i3 & 1) != 0) {
            list2 = c1164120gOo.LL;
        }
        if ((i3 & 2) != 0) {
            c291001Au7 = c1164120gOo.LLILLJJLI;
        }
        if ((i3 & 4) != 0) {
            c291001Au6 = c1164120gOo.LLILLL;
        }
        if ((i3 & 8) != 0) {
            i5 = c1164120gOo.LLILZ;
        }
        if ((i3 & 16) != 0) {
            z2 = c1164120gOo.LLILZIL;
        }
        if ((i3 & 32) != 0) {
            i4 = c1164120gOo.LLILZLL;
        }
        if ((i3 & 64) != 0) {
            mixStruct2 = c1164120gOo.LLIZ;
        }
        if ((i3 & 128) != 0) {
            abstractC1623806Xk = c1164120gOo.LLIZLLLIL;
        }
        if ((i3 & 256) != 0) {
            c291001Au4 = c1164120gOo.LLJ;
        } else {
            c291001Au4 = null;
        }
        if ((i3 & 512) != 0) {
            c291001Au5 = c1164120gOo.LLJI;
        }
        c1164120gOo.getClass();
        return new C1164120gOo(list2, c291001Au7, c291001Au6, i5, z2, i4, mixStruct2, abstractC1623806Xk, c291001Au4, c291001Au5);
    }
}
