package X;

import android.view.View;
import java.util.Iterator;

/* JADX INFO: renamed from: X.0vpy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1757560vpy {
    public static final /* synthetic */ int LIZ = 0;

    public static boolean LIZ(InterfaceC1757550vpx interfaceC1757550vpx, AbstractC1757620vq4 abstractC1757620vq4) {
        C1757580vq0 windowConfig = abstractC1757620vq4.getWindowConfig();
        InterfaceC1757590vq1 interfaceC1757590vq1 = (InterfaceC1757590vq1) C13LP.LJJJLL(interfaceC1757550vpx.LIZJ(windowConfig.LIZIZ));
        if (interfaceC1757590vq1 != null) {
            if (windowConfig.LIZJ <= interfaceC1757590vq1.getWindowConfig().LIZJ) {
                return false;
            }
            interfaceC1757550vpx.LIZIZ(interfaceC1757590vq1.getWindowConfig().LIZ);
        }
        interfaceC1757550vpx.LIZ(abstractC1757620vq4);
        return true;
    }

    public static void LIZIZ(C1757570vpz c1757570vpz, EnumC1757300vpY enumC1757300vpY, boolean z) {
        if (c1757570vpz == null) {
            return;
        }
        Iterator<InterfaceC1757590vq1> it2 = c1757570vpz.LIZJ(enumC1757300vpY).iterator();
        while (it2.hasNext()) {
            View view = it2.next().getView();
            if (z) {
                C12ES.LJIILL(0, view);
            } else {
                C0H1U.LIZIZ(view);
            }
        }
    }
}
