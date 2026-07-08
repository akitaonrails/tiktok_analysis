package X;

import com.ss.android.ugc.aweme.search.model.ThemeColor;
import com.ss.android.ugc.aweme.search.model.ThemeImage;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0QLM, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0QLM {
    public final C0QNH LIZ;
    public final ThemeColor LIZIZ;
    public final ThemeImage LIZJ;
    public final ThemeColor LIZLLL;
    public final Function0<Integer> LJ;
    public final C0P8K LJFF;

    public C0QLM() {
        this(null, null, null, null, null, null, 63);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0QLM)) {
            return false;
        }
        C0QLM c0qlm = (C0QLM) obj;
        return this.LIZ == c0qlm.LIZ && Intrinsics.LJFF(this.LIZIZ, c0qlm.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c0qlm.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c0qlm.LIZLLL) && Intrinsics.LJFF(this.LJ, c0qlm.LJ) && Intrinsics.LJFF(this.LJFF, c0qlm.LJFF);
    }

    public C0QLM(C0QNH c0qnh, ThemeColor themeColor, ThemeImage themeImage, ThemeColor themeColor2, Function0 function0, C0P8K c0p8k, int i) {
        c0qnh = (i & 1) != 0 ? C0QNH.ONLINE_AUTO : c0qnh;
        themeColor = (i & 2) != 0 ? null : themeColor;
        themeImage = (i & 4) != 0 ? null : themeImage;
        themeColor2 = (i & 8) != 0 ? null : themeColor2;
        function0 = (i & 16) != 0 ? null : function0;
        c0p8k = (i & 32) != 0 ? null : c0p8k;
        this.LIZ = c0qnh;
        this.LIZIZ = themeColor;
        this.LIZJ = themeImage;
        this.LIZLLL = themeColor2;
        this.LJ = function0;
        this.LJFF = c0p8k;
    }
}
