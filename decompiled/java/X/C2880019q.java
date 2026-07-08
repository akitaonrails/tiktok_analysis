package X;

import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.019q, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2880019q implements InterfaceC0148002o {
    public final C291001Au<C229200uY> LL;
    public final C291001Au<C229200uY> LLILLJJLI;
    public final int LLILLL;
    public final Function0<C419910GdJ> LLILZ;
    public final C291001Au<Boolean> LLILZIL;
    public final Pair<Integer, Integer> LLILZLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2880019q)) {
            return false;
        }
        C2880019q c2880019q = (C2880019q) obj;
        return Intrinsics.LJFF(this.LL, c2880019q.LL) && Intrinsics.LJFF(this.LLILLJJLI, c2880019q.LLILLJJLI) && this.LLILLL == c2880019q.LLILLL && Intrinsics.LJFF(this.LLILZ, c2880019q.LLILZ) && Intrinsics.LJFF(this.LLILZIL, c2880019q.LLILZIL) && Intrinsics.LJFF(this.LLILZLL, c2880019q.LLILZLL);
    }

    public final int hashCode() {
        return (((((((((this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode()) * 31) + this.LLILLL) * 31) + this.LLILZ.hashCode()) * 31) + this.LLILZIL.hashCode()) * 31) + this.LLILZLL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("RichTextStyleEditState(initialRichTextStyleEvent=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", setRichTextStyleEvent=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", currentTextStylePreset=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", currentTextStyleIconAction=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", updateTextStylePresetEvent=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(", currentTextAlignment=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C2880019q(C291001Au<C229200uY> c291001Au, C291001Au<C229200uY> c291001Au2, int i, Function0<C419910GdJ> function0, C291001Au<Boolean> c291001Au3, Pair<Integer, Integer> pair) {
        this.LL = c291001Au;
        this.LLILLJJLI = c291001Au2;
        this.LLILLL = i;
        this.LLILZ = function0;
        this.LLILZIL = c291001Au3;
        this.LLILZLL = pair;
    }

    public static C2880019q LIZ(C2880019q c2880019q, C291001Au c291001Au, int i, Function0 function0, C291001Au c291001Au2, Pair pair, int i2) {
        C291001Au<C229200uY> c291001Au3;
        Pair pair2 = pair;
        C291001Au c291001Au4 = c291001Au2;
        Function0 function02 = function0;
        int i3 = i;
        C291001Au c291001Au5 = c291001Au;
        if ((i2 & 1) != 0) {
            c291001Au3 = c2880019q.LL;
        } else {
            c291001Au3 = null;
        }
        if ((i2 & 2) != 0) {
            c291001Au5 = c2880019q.LLILLJJLI;
        }
        if ((i2 & 4) != 0) {
            i3 = c2880019q.LLILLL;
        }
        if ((i2 & 8) != 0) {
            function02 = c2880019q.LLILZ;
        }
        if ((i2 & 16) != 0) {
            c291001Au4 = c2880019q.LLILZIL;
        }
        if ((i2 & 32) != 0) {
            pair2 = c2880019q.LLILZLL;
        }
        c2880019q.getClass();
        return new C2880019q(c291001Au3, c291001Au5, i3, function02, c291001Au4, pair2);
    }
}
