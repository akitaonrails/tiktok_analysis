package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS154S0400000_26;
import kotlin.jvm.internal.AwS570S0100000_26;

/* JADX INFO: renamed from: X.0ual, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1709690ual {
    public final Function2<Integer, String, Unit> LIZ;
    public final Function0<Unit> LIZIZ;
    public final Function1<String, Unit> LIZJ;
    public final Function1<String, Unit> LIZLLL;
    public final Function0<Unit> LJ;
    public final Function1<String, Unit> LJFF;

    public C1709690ual(Function2 function2, AwS570S0100000_26 awS570S0100000_26, Function1 function1, Function1 function12, AwS154S0400000_26 awS154S0400000_26, int i) {
        function2 = (i & 1) != 0 ? null : function2;
        awS570S0100000_26 = (i & 2) != 0 ? null : awS570S0100000_26;
        function1 = (i & 4) != 0 ? null : function1;
        function12 = (i & 8) != 0 ? null : function12;
        awS154S0400000_26 = (i & 16) != 0 ? null : awS154S0400000_26;
        this.LIZ = function2;
        this.LIZIZ = awS570S0100000_26;
        this.LIZJ = function1;
        this.LIZLLL = function12;
        this.LJ = awS154S0400000_26;
        this.LJFF = null;
    }
}
