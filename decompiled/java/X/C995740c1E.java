package X;

import com.bytedance.android.livesdk.model.SMBBoardFontStyle;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0c1E, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C995740c1E implements InterfaceC0148002o {
    public final C291001Au<C1817980xPQ> LL;
    public final C291001Au<Boolean> LLILLJJLI;
    public final C291001Au<List<String>> LLILLL;
    public final C291001Au<SMBBoardFontStyle> LLILZ;
    public C291001Au<Boolean> LLILZIL;

    public C995740c1E() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C995740c1E)) {
            return false;
        }
        C995740c1E c995740c1E = (C995740c1E) obj;
        return Intrinsics.LJFF(this.LL, c995740c1E.LL) && Intrinsics.LJFF(this.LLILLJJLI, c995740c1E.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c995740c1E.LLILLL) && Intrinsics.LJFF(this.LLILZ, c995740c1E.LLILZ) && Intrinsics.LJFF(this.LLILZIL, c995740c1E.LLILZIL);
    }

    public final int hashCode() {
        return (((((((this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode()) * 31) + this.LLILLL.hashCode()) * 31) + this.LLILZ.hashCode()) * 31) + this.LLILZIL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BoardTextSelectFontStyleState(clickAction=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", updateSelectStatus=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", currentFont=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", onFontSelected=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", updateTextStylePresetEvent=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C995740c1E(int i) {
        C291001Au c291001Au = new C291001Au(null);
        Boolean bool = Boolean.FALSE;
        this(c291001Au, new C291001Au(bool), new C291001Au(new ArrayList()), new C291001Au(null), new C291001Au(bool));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C995740c1E(C291001Au<C1817980xPQ> c291001Au, C291001Au<Boolean> c291001Au2, C291001Au<? extends List<String>> c291001Au3, C291001Au<SMBBoardFontStyle> c291001Au4, C291001Au<Boolean> c291001Au5) {
        this.LL = c291001Au;
        this.LLILLJJLI = c291001Au2;
        this.LLILLL = c291001Au3;
        this.LLILZ = c291001Au4;
        this.LLILZIL = c291001Au5;
    }

    public static C995740c1E LIZ(C995740c1E c995740c1E, C291001Au c291001Au, C291001Au c291001Au2, C291001Au c291001Au3, C291001Au c291001Au4, int i) {
        C291001Au<List<String>> c291001Au5;
        C291001Au c291001Au6 = c291001Au4;
        C291001Au c291001Au7 = c291001Au3;
        C291001Au c291001Au8 = c291001Au2;
        C291001Au c291001Au9 = c291001Au;
        if ((i & 1) != 0) {
            c291001Au9 = c995740c1E.LL;
        }
        if ((i & 2) != 0) {
            c291001Au8 = c995740c1E.LLILLJJLI;
        }
        if ((i & 4) != 0) {
            c291001Au5 = c995740c1E.LLILLL;
        } else {
            c291001Au5 = null;
        }
        if ((i & 8) != 0) {
            c291001Au7 = c995740c1E.LLILZ;
        }
        if ((i & 16) != 0) {
            c291001Au6 = c995740c1E.LLILZIL;
        }
        c995740c1E.getClass();
        return new C995740c1E(c291001Au9, c291001Au8, c291001Au5, c291001Au7, c291001Au6);
    }
}
