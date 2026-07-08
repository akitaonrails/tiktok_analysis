package X;

import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0JUV, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0JUV implements InterfaceC0148002o {
    public final List<C0JUN> LL;
    public final List<C0JUN> LLILLJJLI;
    public final Pair<Integer, Integer> LLILLL;
    public final boolean LLILZ;
    public final C291001Au<Pair<C0JUN, C0JUN>> LLILZIL;
    public final C291001Au<Boolean> LLILZLL;
    public final C291001Au<Boolean> LLIZ;

    public C0JUV() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0JUV)) {
            return false;
        }
        C0JUV c0juv = (C0JUV) obj;
        return Intrinsics.LJFF(this.LL, c0juv.LL) && Intrinsics.LJFF(this.LLILLJJLI, c0juv.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c0juv.LLILLL) && this.LLILZ == c0juv.LLILZ && Intrinsics.LJFF(this.LLILZIL, c0juv.LLILZIL) && Intrinsics.LJFF(this.LLILZLL, c0juv.LLILZLL) && Intrinsics.LJFF(this.LLIZ, c0juv.LLIZ);
    }

    public final int hashCode() {
        return (((((((((((this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode()) * 31) + this.LLILLL.hashCode()) * 31) + C786410Ut5.Z2(this.LLILZ)) * 31) + this.LLILZIL.hashCode()) * 31) + this.LLILZLL.hashCode()) * 31) + this.LLIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SubWaveEmotePageState(emotesPageListOriginal=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", emotesPageList=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", emotesCntVsLimitation=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", hasAddBtn=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", updateItem=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(", uploaded=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(", canSubmit=");
        sbLIZ.append(this.LLIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C0JUV(int i) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Pair pair = new Pair(0, 0);
        C291001Au c291001Au = new C291001Au(new Pair(null, null));
        Boolean bool = Boolean.FALSE;
        this(arrayList, arrayList2, pair, false, c291001Au, new C291001Au(bool), new C291001Au(bool));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C0JUV(List<C0JUN> list, List<C0JUN> list2, Pair<Integer, Integer> pair, boolean z, C291001Au<? extends Pair<? extends C0JUN, ? extends C0JUN>> c291001Au, C291001Au<Boolean> c291001Au2, C291001Au<Boolean> c291001Au3) {
        this.LL = list;
        this.LLILLJJLI = list2;
        this.LLILLL = pair;
        this.LLILZ = z;
        this.LLILZIL = c291001Au;
        this.LLILZLL = c291001Au2;
        this.LLIZ = c291001Au3;
    }

    public static C0JUV LIZ(C0JUV c0juv, List list, List list2, Pair pair, boolean z, C291001Au c291001Au, C291001Au c291001Au2, C291001Au c291001Au3, int i) {
        C291001Au c291001Au4 = c291001Au3;
        C291001Au c291001Au5 = c291001Au2;
        C291001Au c291001Au6 = c291001Au;
        boolean z2 = z;
        Pair pair2 = pair;
        List list3 = list2;
        List list4 = list;
        if ((i & 1) != 0) {
            list4 = c0juv.LL;
        }
        if ((i & 2) != 0) {
            list3 = c0juv.LLILLJJLI;
        }
        if ((i & 4) != 0) {
            pair2 = c0juv.LLILLL;
        }
        if ((i & 8) != 0) {
            z2 = c0juv.LLILZ;
        }
        if ((i & 16) != 0) {
            c291001Au6 = c0juv.LLILZIL;
        }
        if ((i & 32) != 0) {
            c291001Au5 = c0juv.LLILZLL;
        }
        if ((i & 64) != 0) {
            c291001Au4 = c0juv.LLIZ;
        }
        c0juv.getClass();
        return new C0JUV(list4, list3, pair2, z2, c291001Au6, c291001Au5, c291001Au4);
    }
}
