package X;

import android.widget.TextView;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0smM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1640000smM {
    public final int LIZ;
    public final boolean LIZIZ;
    public final Function1<? super C1641170soF, Unit> LIZJ;
    public final Function1<? super TextView, Unit> LIZLLL;
    public final int LJ;
    public final int LJFF;
    public final boolean LJI;

    public C1640000smM(Function1 function1, int i) {
        int i2;
        boolean z;
        if ((i & 1) != 0) {
            i2 = 16;
        } else {
            i2 = 0;
        }
        if ((i & 2) != 0) {
            z = true;
        } else {
            z = false;
        }
        function1 = (i & 4) != 0 ? null : function1;
        this.LIZ = i2;
        this.LIZIZ = z;
        this.LIZJ = function1;
        this.LIZLLL = null;
        this.LJ = 0;
        this.LJFF = 0;
        this.LJI = false;
    }
}
