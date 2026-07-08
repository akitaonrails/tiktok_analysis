package X;

import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ZES, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0ZES implements InterfaceC0148002o {
    public final C0ZEM LL;
    public final List<C0HIA> LLILLJJLI;
    public final Set<String> LLILLL;
    public final int LLILZ;
    public final C0ZEP LLILZIL;
    public final C0ZEZ LLILZLL;
    public final C291001Au<Unit> LLIZ;
    public final C291001Au<Integer> LLIZLLLIL;
    public final C291001Au<Unit> LLJ;
    public final C291001Au<Unit> LLJI;

    public C0ZES() {
        this(0, 1023);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0ZES)) {
            return false;
        }
        C0ZES c0zes = (C0ZES) obj;
        return Intrinsics.LJFF(this.LL, c0zes.LL) && Intrinsics.LJFF(this.LLILLJJLI, c0zes.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c0zes.LLILLL) && this.LLILZ == c0zes.LLILZ && Intrinsics.LJFF(this.LLILZIL, c0zes.LLILZIL) && Intrinsics.LJFF(this.LLILZLL, c0zes.LLILZLL) && Intrinsics.LJFF(this.LLIZ, c0zes.LLIZ) && Intrinsics.LJFF(this.LLIZLLLIL, c0zes.LLIZLLLIL) && Intrinsics.LJFF(this.LLJ, c0zes.LLJ) && Intrinsics.LJFF(this.LLJI, c0zes.LLJI);
    }

    public final int hashCode() {
        int iHashCode = ((((((((((this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode()) * 31) + this.LLILLL.hashCode()) * 31) + this.LLILZ) * 31) + this.LLILZIL.hashCode()) * 31) + this.LLILZLL.hashCode()) * 31;
        C291001Au<Unit> c291001Au = this.LLIZ;
        int iHashCode2 = (iHashCode + (c291001Au == null ? 0 : c291001Au.hashCode())) * 31;
        C291001Au<Integer> c291001Au2 = this.LLIZLLLIL;
        int iHashCode3 = (iHashCode2 + (c291001Au2 == null ? 0 : c291001Au2.hashCode())) * 31;
        C291001Au<Unit> c291001Au3 = this.LLJ;
        int iHashCode4 = (iHashCode3 + (c291001Au3 == null ? 0 : c291001Au3.hashCode())) * 31;
        C291001Au<Unit> c291001Au4 = this.LLJI;
        return iHashCode4 + (c291001Au4 != null ? c291001Au4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BotSharePostPickerState(listState=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", items=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", selectedAwemeIds=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", maxSelectCount=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", paging=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(", sendState=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(", dismissEvent=");
        sbLIZ.append(this.LLIZ);
        sbLIZ.append(", maxSelectToastEvent=");
        sbLIZ.append(this.LLIZLLLIL);
        sbLIZ.append(", sendFailedToastEvent=");
        sbLIZ.append(this.LLJ);
        sbLIZ.append(", loadMoreFailedToastEvent=");
        sbLIZ.append(this.LLJI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0ZES(int i, int i2) {
        C0ZEN c0zen;
        C13BV c13bv;
        C08CX c08cx;
        C0ZEP c0zep;
        int i3 = i;
        if ((i2 & 1) != 0) {
            c0zen = C0ZEN.LIZ;
        } else {
            c0zen = null;
        }
        if ((i2 & 2) != 0) {
            c13bv = C13BV.INSTANCE;
        } else {
            c13bv = null;
        }
        if ((i2 & 4) != 0) {
            c08cx = C08CX.INSTANCE;
        } else {
            c08cx = null;
        }
        i3 = (i2 & 8) != 0 ? 3 : i3;
        if ((i2 & 16) != 0) {
            c0zep = new C0ZEP(false, false);
        } else {
            c0zep = null;
        }
        this(c0zen, c13bv, c08cx, i3, c0zep, (i2 & 32) != 0 ? C0ZEY.LIZ : null, null, null, null, null);
    }

    public C0ZES(C0ZEM c0zem, List<C0HIA> list, Set<String> set, int i, C0ZEP c0zep, C0ZEZ c0zez, C291001Au<Unit> c291001Au, C291001Au<Integer> c291001Au2, C291001Au<Unit> c291001Au3, C291001Au<Unit> c291001Au4) {
        this.LL = c0zem;
        this.LLILLJJLI = list;
        this.LLILLL = set;
        this.LLILZ = i;
        this.LLILZIL = c0zep;
        this.LLILZLL = c0zez;
        this.LLIZ = c291001Au;
        this.LLIZLLLIL = c291001Au2;
        this.LLJ = c291001Au3;
        this.LLJI = c291001Au4;
    }

    public static C0ZES LIZ(C0ZES c0zes, C0ZEM c0zem, List list, Set set, C0ZEP c0zep, C0ZEZ c0zez, C291001Au c291001Au, C291001Au c291001Au2, C291001Au c291001Au3, C291001Au c291001Au4, int i) {
        int i2;
        C291001Au c291001Au5 = c291001Au4;
        C291001Au c291001Au6 = c291001Au3;
        C291001Au c291001Au7 = c291001Au2;
        C291001Au c291001Au8 = c291001Au;
        C0ZEZ c0zez2 = c0zez;
        C0ZEP c0zep2 = c0zep;
        Set set2 = set;
        List list2 = list;
        C0ZEM c0zem2 = c0zem;
        if ((i & 1) != 0) {
            c0zem2 = c0zes.LL;
        }
        if ((i & 2) != 0) {
            list2 = c0zes.LLILLJJLI;
        }
        if ((i & 4) != 0) {
            set2 = c0zes.LLILLL;
        }
        if ((i & 8) != 0) {
            i2 = c0zes.LLILZ;
        } else {
            i2 = 0;
        }
        if ((i & 16) != 0) {
            c0zep2 = c0zes.LLILZIL;
        }
        if ((i & 32) != 0) {
            c0zez2 = c0zes.LLILZLL;
        }
        if ((i & 64) != 0) {
            c291001Au8 = c0zes.LLIZ;
        }
        if ((i & 128) != 0) {
            c291001Au7 = c0zes.LLIZLLLIL;
        }
        if ((i & 256) != 0) {
            c291001Au6 = c0zes.LLJ;
        }
        if ((i & 512) != 0) {
            c291001Au5 = c0zes.LLJI;
        }
        c0zes.getClass();
        return new C0ZES(c0zem2, list2, set2, i2, c0zep2, c0zez2, c291001Au8, c291001Au7, c291001Au6, c291001Au5);
    }
}
