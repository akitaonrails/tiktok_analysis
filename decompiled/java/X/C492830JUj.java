package X;

import com.bytedance.android.live.base.model.user.User;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0JUj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C492830JUj implements InterfaceC0148002o {
    public final List<AbstractC492880JUo> LL;
    public final Pair<Integer, Integer> LLILLJJLI;
    public final boolean LLILLL;
    public final C291001Au<Pair<AbstractC492880JUo, AbstractC492880JUo>> LLILZ;
    public final C291001Au<Boolean> LLILZIL;
    public final C291001Au<Boolean> LLILZLL;
    public final C291001Au<User> LLIZ;

    public C492830JUj() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C492830JUj)) {
            return false;
        }
        C492830JUj c492830JUj = (C492830JUj) obj;
        return Intrinsics.LJFF(this.LL, c492830JUj.LL) && Intrinsics.LJFF(this.LLILLJJLI, c492830JUj.LLILLJJLI) && this.LLILLL == c492830JUj.LLILLL && Intrinsics.LJFF(this.LLILZ, c492830JUj.LLILZ) && Intrinsics.LJFF(this.LLILZIL, c492830JUj.LLILZIL) && Intrinsics.LJFF(this.LLILZLL, c492830JUj.LLILZLL) && Intrinsics.LJFF(this.LLIZ, c492830JUj.LLIZ);
    }

    public final int hashCode() {
        return (((((((((((this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode()) * 31) + C786410Ut5.Z2(this.LLILLL)) * 31) + this.LLILZ.hashCode()) * 31) + this.LLILZIL.hashCode()) * 31) + this.LLILZLL.hashCode()) * 31) + this.LLIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SuggestEmotePageState(emotesPageList=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", emotesCntVsLimitation=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", hasAddBtn=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", updateItem=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", uploaded=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(", canSubmit=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(", bottomInfo=");
        sbLIZ.append(this.LLIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C492830JUj(int i) {
        ArrayList arrayList = new ArrayList();
        Pair pair = new Pair(0, 0);
        C291001Au c291001Au = new C291001Au(new Pair(null, null));
        Boolean bool = Boolean.FALSE;
        this(arrayList, pair, false, c291001Au, new C291001Au(bool), new C291001Au(bool), new C291001Au(null));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C492830JUj(List<AbstractC492880JUo> list, Pair<Integer, Integer> pair, boolean z, C291001Au<? extends Pair<? extends AbstractC492880JUo, ? extends AbstractC492880JUo>> c291001Au, C291001Au<Boolean> c291001Au2, C291001Au<Boolean> c291001Au3, C291001Au<? extends User> c291001Au4) {
        this.LL = list;
        this.LLILLJJLI = pair;
        this.LLILLL = z;
        this.LLILZ = c291001Au;
        this.LLILZIL = c291001Au2;
        this.LLILZLL = c291001Au3;
        this.LLIZ = c291001Au4;
    }

    public static C492830JUj LIZ(C492830JUj c492830JUj, List list, Pair pair, boolean z, C291001Au c291001Au, C291001Au c291001Au2, C291001Au c291001Au3, C291001Au c291001Au4, int i) {
        C291001Au c291001Au5 = c291001Au4;
        C291001Au c291001Au6 = c291001Au3;
        C291001Au c291001Au7 = c291001Au2;
        C291001Au c291001Au8 = c291001Au;
        boolean z2 = z;
        Pair pair2 = pair;
        List list2 = list;
        if ((i & 1) != 0) {
            list2 = c492830JUj.LL;
        }
        if ((i & 2) != 0) {
            pair2 = c492830JUj.LLILLJJLI;
        }
        if ((i & 4) != 0) {
            z2 = c492830JUj.LLILLL;
        }
        if ((i & 8) != 0) {
            c291001Au8 = c492830JUj.LLILZ;
        }
        if ((i & 16) != 0) {
            c291001Au7 = c492830JUj.LLILZIL;
        }
        if ((i & 32) != 0) {
            c291001Au6 = c492830JUj.LLILZLL;
        }
        if ((i & 64) != 0) {
            c291001Au5 = c492830JUj.LLIZ;
        }
        c492830JUj.getClass();
        return new C492830JUj(list2, pair2, z2, c291001Au8, c291001Au7, c291001Au6, c291001Au5);
    }
}
