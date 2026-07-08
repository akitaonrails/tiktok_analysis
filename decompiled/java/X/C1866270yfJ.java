package X;

import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS189S0000000_3;
import kotlin.jvm.internal.AFwS217S0000000_28;

/* JADX INFO: renamed from: X.0yfJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1866270yfJ {
    public final InterfaceC19578611iq LIZ;
    public final Function0<Map<Integer, InterfaceC19578611iq>> LIZIZ;
    public final Function0<Boolean> LIZJ;
    public final Function0<Boolean> LIZLLL;
    public final Function0<Integer> LJ;
    public final boolean LJFF;

    public C1866270yfJ(InterfaceC19578611iq interfaceC19578611iq, Function0 function0, Function0 function02, Function0 function03, Function0 function04, boolean z, int i) {
        interfaceC19578611iq = (i & 1) != 0 ? null : interfaceC19578611iq;
        function0 = (i & 2) != 0 ? AFwS189S0000000_3.get$arr$(1529) : function0;
        function02 = (i & 4) != 0 ? AFwS217S0000000_28.get$arr$(706) : function02;
        function03 = (i & 8) != 0 ? new C1865870yef() : function03;
        function04 = (i & 16) != 0 ? AFwS189S0000000_3.get$arr$(1530) : function04;
        z = (i & 32) != 0 ? false : z;
        this.LIZ = interfaceC19578611iq;
        this.LIZIZ = function0;
        this.LIZJ = function02;
        this.LIZLLL = function03;
        this.LJ = function04;
        this.LJFF = z;
    }
}
