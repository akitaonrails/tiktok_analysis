package X;

import android.view.View;
import java.util.Collections;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0PH3, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0PH3 {
    public static final C0PH3 LIZ = new C0PH3();
    public static final float LIZIZ = C418440Gaw.LIZIZ(100);
    public static final C0HU6 LIZJ = new C0HU6(new C1342130l1v(322.27f), new C1342130l1v(35.9f));

    public static C21647019ng LIZ(C0PH3 c0ph3, final String str, C19EG c19eg, View view, float f, float f2, final Function0 function0, int i) {
        final Function0 function02 = null;
        if ((i & 64) != 0) {
            function0 = null;
        }
        c0ph3.getClass();
        C21647019ng c21647019ng = new C21647019ng(c19eg, view, new C19746312Np(EnumC19746112Nn.SPRING, LIZJ, Collections.singletonList(new C19746412Nq(str, new C0HV5(f, f2)))), false);
        c21647019ng.LIZJ(str, new InterfaceC21641019mi() { // from class: X.0y6p
            @Override // X.InterfaceC21641019mi
            public final void LIZ(InterfaceC1844880y6o interfaceC1844880y6o) {
                String str2 = str;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(" endListener canceled:");
                sbLIZ.append(interfaceC1844880y6o.W5());
                sbLIZ.append(" value:");
                sbLIZ.append(interfaceC1844880y6o.getValue());
                sbLIZ.append(" velocity:");
                sbLIZ.append(interfaceC1844880y6o.LIZ());
                C19290510dT.LIZ(str2, C2188811AlT.LIZIZ(sbLIZ));
                Function0<Unit> function03 = function0;
                if (function03 != null) {
                    function03.invoke();
                }
            }

            @Override // X.InterfaceC21641019mi
            public final void LIZIZ(InterfaceC1844880y6o interfaceC1844880y6o) {
                Function0<Unit> function03 = function02;
                if (function03 != null) {
                    function03.invoke();
                }
            }
        });
        return c21647019ng;
    }
}
