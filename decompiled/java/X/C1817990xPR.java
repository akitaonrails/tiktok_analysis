package X;

import android.graphics.Typeface;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0xPR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1817990xPR implements InterfaceC0148002o {
    public final C291001Au<String> LL;
    public final C291001Au<Spannable> LLILLJJLI;
    public final C291001Au<Boolean> LLILLL;
    public final C291001Au<Typeface> LLILZ;
    public final C291001Au<Boolean> LLILZIL;

    public C1817990xPR() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1817990xPR)) {
            return false;
        }
        C1817990xPR c1817990xPR = (C1817990xPR) obj;
        return Intrinsics.LJFF(this.LL, c1817990xPR.LL) && Intrinsics.LJFF(this.LLILLJJLI, c1817990xPR.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c1817990xPR.LLILLL) && Intrinsics.LJFF(this.LLILZ, c1817990xPR.LLILZ) && Intrinsics.LJFF(this.LLILZIL, c1817990xPR.LLILZIL);
    }

    public final int hashCode() {
        return (((((((this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode()) * 31) + this.LLILLL.hashCode()) * 31) + this.LLILZ.hashCode()) * 31) + this.LLILZIL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CustomizedBoardEditPageState(onInitFullyCustomizedContentSet=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", onInitRichTextSpannableSet=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", backClicked=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", onFontSelected=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", enableDone=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C1817990xPR(int i) {
        C291001Au c291001Au = new C291001Au("");
        C291001Au c291001Au2 = new C291001Au(new SpannableStringBuilder());
        Boolean bool = Boolean.FALSE;
        this(c291001Au, c291001Au2, new C291001Au(bool), new C291001Au(null), new C291001Au(bool));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1817990xPR(C291001Au<String> c291001Au, C291001Au<? extends Spannable> c291001Au2, C291001Au<Boolean> c291001Au3, C291001Au<? extends Typeface> c291001Au4, C291001Au<Boolean> c291001Au5) {
        this.LL = c291001Au;
        this.LLILLJJLI = c291001Au2;
        this.LLILLL = c291001Au3;
        this.LLILZ = c291001Au4;
        this.LLILZIL = c291001Au5;
    }

    public static C1817990xPR LIZ(C1817990xPR c1817990xPR, C291001Au c291001Au, C291001Au c291001Au2, C291001Au c291001Au3, C291001Au c291001Au4, int i) {
        C291001Au<Typeface> c291001Au5;
        C291001Au c291001Au6 = c291001Au4;
        C291001Au c291001Au7 = c291001Au3;
        C291001Au c291001Au8 = c291001Au2;
        C291001Au c291001Au9 = c291001Au;
        if ((i & 1) != 0) {
            c291001Au9 = c1817990xPR.LL;
        }
        if ((i & 2) != 0) {
            c291001Au8 = c1817990xPR.LLILLJJLI;
        }
        if ((i & 4) != 0) {
            c291001Au7 = c1817990xPR.LLILLL;
        }
        if ((i & 8) != 0) {
            c291001Au5 = c1817990xPR.LLILZ;
        } else {
            c291001Au5 = null;
        }
        if ((i & 16) != 0) {
            c291001Au6 = c1817990xPR.LLILZIL;
        }
        c1817990xPR.getClass();
        return new C1817990xPR(c291001Au9, c291001Au8, c291001Au7, c291001Au5, c291001Au6);
    }
}
