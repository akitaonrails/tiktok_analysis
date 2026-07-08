package X;

import android.view.View;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.0yUH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1859430yUH {
    public static final InterfaceC342000Daw LIZIZ(C1859750yUn c1859750yUn, C21419418s4 c21419418s4, String str) {
        String strLIZIZ;
        String str2 = str;
        C21419418s4 c21419418s4LIZ = c21419418s4;
        if (c21419418s4LIZ.LJJIJIL && (strLIZIZ = C1859900yV2.LIZIZ.LIZIZ(str2)) != null) {
            str2 = strLIZIZ;
        }
        if (((Boolean) C1820307Az.LIZ.getValue()).booleanValue() && !c21419418s4LIZ.LJJJLL) {
            c21419418s4LIZ = C21419418s4.LIZ(c21419418s4LIZ, null, 0, false, 0.0f, 0, 0, 0, null, null, null, null, null, null, false, null, 0, false, false, 0, false, null, null, false, null, null, null, false, false, false, null, null, null, null, null, false, false, null, null, false, false, false, true, null, -1, 12582911);
        }
        InterfaceC328690CuZ.LIZ.getClass();
        InterfaceC328690CuZ interfaceC328690CuZLIZ = C330610Cxf.LIZ();
        if (interfaceC328690CuZLIZ == null) {
            return null;
        }
        return interfaceC328690CuZLIZ.LIZIZ(c1859750yUn, str2, c21419418s4LIZ, null);
    }

    public static final void LIZ(final C1859370yUB c1859370yUB, InterfaceC342000Daw interfaceC342000Daw, final C0HXO c0hxo, C689230R1t c689230R1t, C1859280yU2 c1859280yU2, final C1859260yU0 c1859260yU0, C1859290yU3 c1859290yU3, C1859300yU4 c1859300yU4) {
        interfaceC342000Daw.LIZIZ(c1859370yUB, new InterfaceC328600CuQ() { // from class: X.0DM3
            @Override // X.InterfaceC328600CuQ
            public final void LIZ(View view, InterfaceC431020GvE interfaceC431020GvE, CharSequence charSequence, CharSequence charSequence2) {
                c1859370yUB.LLJJIJIIJIL = true;
                InterfaceC328600CuQ interfaceC328600CuQ = c0hxo;
                if (interfaceC328600CuQ != null) {
                    interfaceC328600CuQ.LIZ(view, interfaceC431020GvE, charSequence, null);
                }
            }

            @Override // X.InterfaceC328600CuQ
            public final void LIZIZ(View view, InterfaceC431020GvE interfaceC431020GvE, List<? extends CharSequence> list, Map<String, ? extends Object> map) {
                c1859370yUB.LLJJIJIIJIL = true;
                InterfaceC328600CuQ interfaceC328600CuQ = c0hxo;
                if (interfaceC328600CuQ != null) {
                    interfaceC328600CuQ.LIZIZ(view, interfaceC431020GvE, list, map);
                }
            }
        });
        interfaceC342000Daw.LJ(c689230R1t, c1859280yU2);
        interfaceC342000Daw.LJII(c1859370yUB, new InterfaceC328580CuO() { // from class: X.0DO4
            @Override // X.InterfaceC328580CuO
            public final void LIZ(InterfaceC342000Daw interfaceC342000Daw2, View view, C1860910yWf c1860910yWf) {
                c1859370yUB.LLJJIJIIJIL = true;
                InterfaceC328580CuO interfaceC328580CuO = c1859260yU0;
                if (interfaceC328580CuO != null) {
                    interfaceC328580CuO.LIZ(interfaceC342000Daw2, view, c1860910yWf);
                }
            }
        });
        interfaceC342000Daw.LIZ(c1859290yU3);
        interfaceC342000Daw.LIZJ(c1859300yU4);
        c1859370yUB.LJJJJJ(interfaceC342000Daw, null);
    }
}
