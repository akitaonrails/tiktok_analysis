package X;

import android.graphics.drawable.Drawable;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0rCh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1579450rCh implements InterfaceC0148002o {
    public final Pair<Integer, Integer> LL;
    public final Boolean LLILLJJLI;
    public final C1579990rDZ LLILLL;
    public final C1579620rCy LLILZ;
    public final List<InterfaceC1579720rD8> LLILZIL;
    public final Drawable LLILZLL;

    public C1579450rCh() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1579450rCh)) {
            return false;
        }
        C1579450rCh c1579450rCh = (C1579450rCh) obj;
        return Intrinsics.LJFF(this.LL, c1579450rCh.LL) && Intrinsics.LJFF(this.LLILLJJLI, c1579450rCh.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c1579450rCh.LLILLL) && Intrinsics.LJFF(this.LLILZ, c1579450rCh.LLILZ) && Intrinsics.LJFF(this.LLILZIL, c1579450rCh.LLILZIL) && Intrinsics.LJFF(this.LLILZLL, c1579450rCh.LLILZLL);
    }

    public final int hashCode() {
        Pair<Integer, Integer> pair = this.LL;
        int iHashCode = (pair == null ? 0 : pair.hashCode()) * 31;
        Boolean bool = this.LLILLJJLI;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        C1579990rDZ c1579990rDZ = this.LLILLL;
        int iHashCode3 = (iHashCode2 + (c1579990rDZ == null ? 0 : c1579990rDZ.hashCode())) * 31;
        C1579620rCy c1579620rCy = this.LLILZ;
        int iHashCode4 = (iHashCode3 + (c1579620rCy == null ? 0 : c1579620rCy.hashCode())) * 31;
        List<InterfaceC1579720rD8> list = this.LLILZIL;
        int iHashCode5 = (iHashCode4 + (list == null ? 0 : list.hashCode())) * 31;
        Drawable drawable = this.LLILZLL;
        return iHashCode5 + (drawable != null ? drawable.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SeriesSkyLightState(bgColorPair=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", isSkylightOnScreen=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", bubbleViewState=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", skylightPanelState=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", blocks=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(", bgDrawable=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C1579450rCh(int i) {
        this(null, null, null, null, null, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1579450rCh(Pair<Integer, Integer> pair, Boolean bool, C1579990rDZ c1579990rDZ, C1579620rCy c1579620rCy, List<? extends InterfaceC1579720rD8> list, Drawable drawable) {
        this.LL = pair;
        this.LLILLJJLI = bool;
        this.LLILLL = c1579990rDZ;
        this.LLILZ = c1579620rCy;
        this.LLILZIL = list;
        this.LLILZLL = drawable;
    }

    public static C1579450rCh LIZ(C1579450rCh c1579450rCh, Pair pair, Boolean bool, C1579990rDZ c1579990rDZ, C1579620rCy c1579620rCy, List list, Drawable drawable, int i) {
        Drawable drawable2 = drawable;
        List list2 = list;
        C1579620rCy c1579620rCy2 = c1579620rCy;
        C1579990rDZ c1579990rDZ2 = c1579990rDZ;
        Boolean bool2 = bool;
        Pair pair2 = pair;
        if ((i & 1) != 0) {
            pair2 = c1579450rCh.LL;
        }
        if ((i & 2) != 0) {
            bool2 = c1579450rCh.LLILLJJLI;
        }
        if ((i & 4) != 0) {
            c1579990rDZ2 = c1579450rCh.LLILLL;
        }
        if ((i & 8) != 0) {
            c1579620rCy2 = c1579450rCh.LLILZ;
        }
        if ((i & 16) != 0) {
            list2 = c1579450rCh.LLILZIL;
        }
        if ((i & 32) != 0) {
            drawable2 = c1579450rCh.LLILZLL;
        }
        c1579450rCh.getClass();
        return new C1579450rCh(pair2, bool2, c1579990rDZ2, c1579620rCy2, list2, drawable2);
    }
}
