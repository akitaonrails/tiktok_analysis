package X;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS191S0000000_5;

/* JADX INFO: renamed from: X.0EZ4, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0EZ4 {
    public final Function0<Boolean> LIZ;
    public final Function0<Boolean> LIZIZ;
    public final Function0<Boolean> LIZJ;
    public final Function0<Boolean> LIZLLL;

    public C0EZ4(Function0 function0, AFwS191S0000000_5 aFwS191S0000000_5, Function0 function02, Function0 function03, int i) {
        function0 = (i & 1) != 0 ? AFwS191S0000000_5.get$arr$(14) : function0;
        aFwS191S0000000_5 = (i & 2) != 0 ? AFwS191S0000000_5.get$arr$(15) : aFwS191S0000000_5;
        function02 = (i & 4) != 0 ? AFwS191S0000000_5.get$arr$(16) : function02;
        function03 = (i & 8) != 0 ? AFwS191S0000000_5.get$arr$(17) : function03;
        this.LIZ = function0;
        this.LIZIZ = aFwS191S0000000_5;
        this.LIZJ = function02;
        this.LIZLLL = function03;
    }
}
