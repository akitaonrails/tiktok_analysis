package X;

import com.ss.android.ugc.aweme.homepage.ui.view.tab.top.MainTabStrip;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0Cno, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C324500Cno {
    public static final /* synthetic */ int LIZ = 0;

    public static List LIZ(C1592450rXf c1592450rXf, List list, Function1 function1) {
        C13DV c13dvLIZIZ = C1697820uHc.LIZIZ();
        for (int tabCount = c1592450rXf.getTabCount() - 1; -1 < tabCount; tabCount--) {
            C1591980rWu c1591980rWuLJIILIIL = c1592450rXf.LJIILIIL(tabCount);
            if (c1591980rWuLJIILIIL != null) {
                C1591440rW2 c1591440rW2 = MainTabStrip.LLJLLIL;
                String strLIZIZ = c1591980rWuLJIILIIL.LIZIZ();
                c1591440rW2.getClass();
                if (list.contains(C1591440rW2.LIZLLL(strLIZIZ))) {
                    c13dvLIZIZ.add(function1.invoke(c1591980rWuLJIILIIL));
                }
            }
        }
        return C1697820uHc.LIZ(c13dvLIZIZ);
    }
}
