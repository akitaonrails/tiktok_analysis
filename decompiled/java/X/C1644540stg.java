package X;

import android.view.View;
import android.widget.SeekBar;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS604S0100000_25;

/* JADX INFO: renamed from: X.0stg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1644540stg {
    public final Function1<? super C1643380sro, Unit> LIZ;
    public final boolean LIZIZ;
    public final AbstractC21673719rz LIZJ;
    public final Function1<? super SeekBar, Unit> LIZLLL;
    public final Function1<? super C19YA, Unit> LJ;
    public final Function1<? super View, Unit> LJFF;
    public final C1640000smM LJI;
    public final Function1<? super View, Unit> LJII;

    public C1644540stg(AwS604S0100000_25 awS604S0100000_25, Function1 function1, Function1 function12, C1640000smM c1640000smM, Function1 function13, int i) {
        boolean z;
        C423520Gj8 c423520Gj8;
        awS604S0100000_25 = (i & 1) != 0 ? null : awS604S0100000_25;
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
        function1 = (i & 16) != 0 ? null : function1;
        function12 = (i & 32) != 0 ? null : function12;
        c1640000smM = (i & 64) != 0 ? new C1640000smM(null, 127) : c1640000smM;
        function13 = (i & 128) != 0 ? null : function13;
        this.LIZ = awS604S0100000_25;
        this.LIZIZ = z;
        this.LIZJ = c423520Gj8;
        this.LIZLLL = null;
        this.LJ = function1;
        this.LJFF = function12;
        this.LJI = c1640000smM;
        this.LJII = function13;
    }
}
