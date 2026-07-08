package X;

import com.bytedance.ies.powerlist.PowerCell;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS232S0000000_4;
import kotlin.jvm.internal.AFwS276S0000000_31;

/* JADX INFO: renamed from: X.15tG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20662415tG {
    public final List<InterfaceC1891350zJl> LIZ = new ArrayList();
    public final HashMap<Class<? extends PowerCell<?>>, Object> LIZIZ = new HashMap<>();

    public final void LIZ(InterfaceC1891350zJl interfaceC1891350zJl) {
        ((ArrayList) this.LIZ).add(interfaceC1891350zJl);
    }

    public final void LIZIZ(C1069520dwE c1069520dwE, Function1 function1) {
        if (((Boolean) function1.invoke(c1069520dwE)).booleanValue() && c1069520dwE != null) {
            ((ArrayList) this.LIZ).add(c1069520dwE);
        }
    }

    public static void LIZJ(C20662415tG c20662415tG, InterfaceC1891350zJl interfaceC1891350zJl, Class cls, AFwS232S0000000_4 aFwS232S0000000_4, int i) {
        Function1 function1 = aFwS232S0000000_4;
        if ((i & 4) != 0) {
            function1 = AFwS276S0000000_31.get$arr$(340);
        }
        AFwS276S0000000_31 aFwS276S0000000_31 = null;
        if ((i & 8) != 0) {
            aFwS276S0000000_31 = AFwS276S0000000_31.get$arr$(341);
        }
        c20662415tG.getClass();
        if (((Boolean) function1.invoke(interfaceC1891350zJl)).booleanValue() && interfaceC1891350zJl != null) {
            aFwS276S0000000_31.getClass();
            ((ArrayList) c20662415tG.LIZ).add(interfaceC1891350zJl);
            c20662415tG.LIZIZ.put(cls, interfaceC1891350zJl);
        }
    }
}
