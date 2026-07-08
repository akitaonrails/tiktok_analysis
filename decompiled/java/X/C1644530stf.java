package X;

import android.view.View;
import android.widget.SeekBar;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS266S0000000_25;

/* JADX INFO: renamed from: X.0stf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1644530stf {
    public final Function1<? super C1643380sro, Unit> LIZ;
    public final boolean LIZIZ;
    public final AbstractC21673719rz LIZJ;
    public final Function1<? super SeekBar, Unit> LIZLLL;
    public final Function1<? super C19YA, Unit> LJ;
    public final Function1<? super View, Unit> LJFF;
    public final C1640030smP LJI;
    public final Function1<? super View, Unit> LJII;

    public C1644530stf(C1640030smP c1640030smP, AFwS266S0000000_25 aFwS266S0000000_25, int i) {
        boolean z;
        C423520Gj8 c423520Gj8;
        if ((i & 2) != 0) {
            z = true;
        } else {
            z = false;
        }
        if ((i & 4) != 0) {
            c423520Gj8 = new C423520Gj8();
        } else {
            c423520Gj8 = null;
        }
        c1640030smP = (i & 64) != 0 ? new C1640030smP(null, false, 127) : c1640030smP;
        aFwS266S0000000_25 = (i & 128) != 0 ? null : aFwS266S0000000_25;
        this.LIZ = null;
        this.LIZIZ = z;
        this.LIZJ = c423520Gj8;
        this.LIZLLL = null;
        this.LJ = null;
        this.LJFF = null;
        this.LJI = c1640030smP;
        this.LJII = aFwS266S0000000_25;
    }
}
