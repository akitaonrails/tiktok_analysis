package X;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS214S0000000_25;

/* JADX INFO: renamed from: X.0u2f, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1688550u2f {
    public static final C13DQ LIZ = C13ZT.LIZJ(AFwS214S0000000_25.get$arr$(484));

    public static InterfaceC1671500tbA LIZ(InterfaceC1680500tpg interfaceC1680500tpg) {
        InterfaceC1671500tbA interfaceC1671500tbA = (InterfaceC1671500tbA) interfaceC1680500tpg.LJJIL(LIZ);
        Context context = null;
        if (interfaceC1671500tbA == null) {
            interfaceC1680500tpg.LJJIIJZLJL(544166745);
            View view = (View) interfaceC1680500tpg.LJJIL(AndroidCompositionLocals_androidKt.LJFF);
            while (view != null) {
                Object tag = view.getTag(R.id.view_tree_on_back_pressed_dispatcher_owner);
                if ((tag instanceof InterfaceC1671500tbA) && (interfaceC1671500tbA = (InterfaceC1671500tbA) tag) != null) {
                    break;
                }
                Object objLIZ = C1688570u2h.LIZ(view);
                if (!(objLIZ instanceof View)) {
                    break;
                }
                view = (View) objLIZ;
            }
            interfaceC1671500tbA = null;
            interfaceC1680500tpg.LJ();
            if (interfaceC1671500tbA == null) {
                interfaceC1680500tpg.LJJIIJZLJL(544168748);
                Context baseContext = (Context) interfaceC1680500tpg.LJJIL(AndroidCompositionLocals_androidKt.LIZIZ);
                while (true) {
                    if (!(baseContext instanceof ContextWrapper)) {
                        break;
                    }
                    if (baseContext instanceof InterfaceC1671500tbA) {
                        context = baseContext;
                        break;
                    }
                    baseContext = ((ContextWrapper) baseContext).getBaseContext();
                }
                InterfaceC1671500tbA interfaceC1671500tbA2 = (InterfaceC1671500tbA) context;
                interfaceC1680500tpg.LJ();
                return interfaceC1671500tbA2;
            }
        } else {
            interfaceC1680500tpg.LJJIIJZLJL(544164296);
            interfaceC1680500tpg.LJ();
        }
        interfaceC1680500tpg.LJJIIJZLJL(544164377);
        interfaceC1680500tpg.LJ();
        return interfaceC1671500tbA;
    }
}
