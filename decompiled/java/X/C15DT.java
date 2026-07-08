package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS217S0000000_28;
import kotlin.jvm.internal.AFwS221S0000000_31;

/* JADX INFO: renamed from: X.15DT, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public abstract class C15DT {
    public static final /* synthetic */ int LJI = 0;
    public final int LIZ;
    public final Function0<Boolean> LIZIZ;
    public final Function0<Unit> LIZJ;
    public final Function0<Unit> LIZLLL;
    public final Function0<Unit> LJ;
    public final Function0<Unit> LJFF;

    public C15DT() {
        throw null;
    }

    public C15DT(int i, Function0 function0, Function0 function02, Function0 function03, Function0 function04, int i2) {
        AFwS221S0000000_31 aFwS221S0000000_31;
        i = (i2 & 1) != 0 ? 0 : i;
        function0 = (i2 & 4) != 0 ? AFwS217S0000000_28.get$arr$(637) : function0;
        if ((i2 & 8) != 0) {
            aFwS221S0000000_31 = AFwS221S0000000_31.get$arr$(443);
        } else {
            aFwS221S0000000_31 = null;
        }
        function02 = (i2 & 16) != 0 ? AFwS221S0000000_31.get$arr$(444) : function02;
        function03 = (i2 & 32) != 0 ? AFwS221S0000000_31.get$arr$(445) : function03;
        function04 = (i2 & 64) != 0 ? AFwS221S0000000_31.get$arr$(446) : function04;
        this.LIZ = i;
        this.LIZIZ = function0;
        this.LIZJ = aFwS221S0000000_31;
        this.LIZLLL = function02;
        this.LJ = function03;
        this.LJFF = function04;
    }
}
