package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.search.pages.result.nimble.ui.pages.image.model.ImageData;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0QA9, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0QA9 implements InterfaceC636340Oxc<C0QA9, C208100r9> {
    public final C627660Ojc<C208100r9> LL;
    public final boolean LLILLJJLI;
    public final List<ImageData> LLILLL;
    public final List<Map<?, ?>> LLILZ;
    public final LinkedHashMap<String, Aweme> LLILZIL;
    public final boolean LLILZLL;
    public final int LLIZ;
    public final C0QAG LLIZLLLIL;
    public final Map<String, String> LLJ;

    public C0QA9() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0QA9)) {
            return false;
        }
        C0QA9 c0qa9 = (C0QA9) obj;
        return Intrinsics.LJFF(this.LL, c0qa9.LL) && this.LLILLJJLI == c0qa9.LLILLJJLI && Intrinsics.LJFF(this.LLILLL, c0qa9.LLILLL) && Intrinsics.LJFF(this.LLILZ, c0qa9.LLILZ) && Intrinsics.LJFF(this.LLILZIL, c0qa9.LLILZIL) && this.LLILZLL == c0qa9.LLILZLL && this.LLIZ == c0qa9.LLIZ && Intrinsics.LJFF(this.LLIZLLLIL, c0qa9.LLIZLLLIL) && Intrinsics.LJFF(this.LLJ, c0qa9.LLJ);
    }

    public final int hashCode() {
        return (((((((((((((((this.LL.hashCode() * 31) + C786410Ut5.Z2(this.LLILLJJLI)) * 31) + this.LLILLL.hashCode()) * 31) + this.LLILZ.hashCode()) * 31) + this.LLILZIL.hashCode()) * 31) + C786410Ut5.Z2(this.LLILZLL)) * 31) + this.LLIZ) * 31) + this.LLIZLLLIL.hashCode()) * 31) + this.LLJ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SearchVisualInspirationState(listState=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", hasAwemeData=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", imageList=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", imageListRaw=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", awemeMap=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(", hasMore=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(", totalImages=");
        sbLIZ.append(this.LLIZ);
        sbLIZ.append(", requestParams=");
        sbLIZ.append(this.LLIZLLLIL);
        sbLIZ.append(", awemeMobParams=");
        sbLIZ.append(this.LLJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC636270OxV
    public final List<C208100r9> getListItemState() {
        return C627260Oiy.LIZ(this);
    }

    @Override // X.InterfaceC636270OxV
    public final AbstractC1623806Xk<C626160OhC> getLoadLatestState() {
        return C627260Oiy.LIZIZ(this);
    }

    @Override // X.InterfaceC636270OxV
    public final AbstractC1623806Xk<C626160OhC> getLoadMoreState() {
        return C627260Oiy.LIZJ(this);
    }

    @Override // X.InterfaceC636270OxV
    public final AbstractC1623806Xk<C626160OhC> getRefreshState() {
        return C627260Oiy.LIZLLL(this);
    }

    @Override // X.InterfaceC627270Oiz
    public final C627660Ojc<C208100r9> getListState() {
        return this.LL;
    }

    public C0QA9(int i) {
        C627660Ojc c627660Ojc = new C627660Ojc(null, null, null, null, 15);
        C13BV c13bv = C13BV.INSTANCE;
        this(c627660Ojc, false, c13bv, c13bv, new LinkedHashMap(), true, 0, new C0QAG(0, "", "", 8), C2097608Jq.LJ());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C0QA9(C627660Ojc<C208100r9> c627660Ojc, boolean z, List<ImageData> list, List<? extends Map<?, ?>> list2, LinkedHashMap<String, Aweme> linkedHashMap, boolean z2, int i, C0QAG c0qag, Map<String, String> map) {
        this.LL = c627660Ojc;
        this.LLILLJJLI = z;
        this.LLILLL = list;
        this.LLILZ = list2;
        this.LLILZIL = linkedHashMap;
        this.LLILZLL = z2;
        this.LLIZ = i;
        this.LLIZLLLIL = c0qag;
        this.LLJ = map;
    }

    public static C0QA9 LIZ(C0QA9 c0qa9, C627660Ojc c627660Ojc, boolean z, List list, List list2, LinkedHashMap linkedHashMap, boolean z2, int i, C0QAG c0qag, Map map, int i2) {
        Map map2 = map;
        C0QAG c0qag2 = c0qag;
        int i3 = i;
        boolean z3 = z2;
        LinkedHashMap linkedHashMap2 = linkedHashMap;
        List list3 = list2;
        List list4 = list;
        boolean z4 = z;
        C627660Ojc c627660Ojc2 = c627660Ojc;
        if ((i2 & 1) != 0) {
            c627660Ojc2 = c0qa9.LL;
        }
        if ((i2 & 2) != 0) {
            z4 = c0qa9.LLILLJJLI;
        }
        if ((i2 & 4) != 0) {
            list4 = c0qa9.LLILLL;
        }
        if ((i2 & 8) != 0) {
            list3 = c0qa9.LLILZ;
        }
        if ((i2 & 16) != 0) {
            linkedHashMap2 = c0qa9.LLILZIL;
        }
        if ((i2 & 32) != 0) {
            z3 = c0qa9.LLILZLL;
        }
        if ((i2 & 64) != 0) {
            i3 = c0qa9.LLIZ;
        }
        if ((i2 & 128) != 0) {
            c0qag2 = c0qa9.LLIZLLLIL;
        }
        if ((i2 & 256) != 0) {
            map2 = c0qa9.LLJ;
        }
        c0qa9.getClass();
        return new C0QA9(c627660Ojc2, z4, list4, list3, linkedHashMap2, z3, i3, c0qag2, map2);
    }
}
