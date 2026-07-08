package X;

import android.widget.TextView;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS266S0000000_25;

/* JADX INFO: renamed from: X.0smP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1640030smP {
    public final int LIZ;
    public final boolean LIZIZ;
    public final Function1<? super C1641170soF, Unit> LIZJ;
    public final Function1<? super TextView, Unit> LIZLLL;
    public final int LJ;
    public final int LJFF;
    public final boolean LJI;

    public C1640030smP(AFwS266S0000000_25 aFwS266S0000000_25, boolean z, int i) {
        int i2;
        boolean z2;
        if ((i & 1) != 0) {
            i2 = 16;
        } else {
            i2 = 0;
        }
        if ((i & 2) != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        aFwS266S0000000_25 = (i & 4) != 0 ? null : aFwS266S0000000_25;
        z = (i & 64) != 0 ? false : z;
        this.LIZ = i2;
        this.LIZIZ = z2;
        this.LIZJ = aFwS266S0000000_25;
        this.LIZLLL = null;
        this.LJ = 0;
        this.LJFF = 0;
        this.LJI = z;
    }
}
