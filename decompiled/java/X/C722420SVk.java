package X;

import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import java.util.Map;
import kotlin.jvm.internal.AFwS308S0000000_23;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0SVk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C722420SVk {
    public static final C722420SVk LIZ = new C722420SVk();

    public static void LIZ(C722420SVk c722420SVk, InterfaceC722440SVm interfaceC722440SVm, View view) {
        View view2;
        c722420SVk.getClass();
        if (view instanceof ViewGroup) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            C07XH c07xhLIZ = interfaceC722440SVm.LJ().LIZ();
            long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
            AFwS308S0000000_23 aFwS308S0000000_23 = C722430SVl.LIZ;
            Map mapLIZ = C722430SVl.LIZ(interfaceC722440SVm);
            mapLIZ.put("duration", String.valueOf(jCurrentTimeMillis2));
            aFwS308S0000000_23.invoke("tuc_loader_finish_load_model", mapLIZ);
            Object objLIZLLL = interfaceC722440SVm.LIZLLL(interfaceC722440SVm, c07xhLIZ);
            if (objLIZLLL instanceof View) {
                view2 = (View) objLIZLLL;
            } else {
                view2 = null;
            }
            ((ViewGroup) view).addView(view2);
            aFwS308S0000000_23.invoke("tuc_view_show", C722430SVl.LIZ(interfaceC722440SVm));
            C0SVZ c0svzLIZJ = interfaceC722440SVm.LIZJ();
            if (c0svzLIZJ != null) {
                c0svzLIZJ.LIZ();
            }
        }
    }

    public static boolean LIZIZ(InterfaceC722440SVm interfaceC722440SVm, View view, ViewGroup.LayoutParams layoutParams) {
        InterfaceC722460SVo interfaceC722460SVo;
        boolean z = false;
        if (!(view instanceof ViewGroup)) {
            return false;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        C07XH c07xhLIZ = interfaceC722440SVm.LJ().LIZ();
        long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
        AFwS308S0000000_23 aFwS308S0000000_23 = C722430SVl.LIZ;
        Map mapLIZ = C722430SVl.LIZ(interfaceC722440SVm);
        mapLIZ.put("duration", String.valueOf(jCurrentTimeMillis2));
        aFwS308S0000000_23.invoke("tuc_loader_finish_load_model", mapLIZ);
        ViewGroup viewGroup = (ViewGroup) view;
        KeyEvent.Callback childAt = viewGroup.getChildAt(0);
        boolean z2 = childAt instanceof InterfaceC722460SVo;
        if (z2 && Intrinsics.LJFF(interfaceC722440SVm.LIZIZ(), childAt.getClass())) {
            z = true;
        }
        View view2 = null;
        if (z) {
            long jCurrentTimeMillis3 = System.currentTimeMillis();
            if (z2 && (interfaceC722460SVo = (InterfaceC722460SVo) childAt) != null) {
                interfaceC722460SVo.LLLLZLLLI(interfaceC722440SVm, c07xhLIZ);
            }
            long jCurrentTimeMillis4 = System.currentTimeMillis() - jCurrentTimeMillis3;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("updateTime: ");
            sbLIZ.append(jCurrentTimeMillis4);
            C2188811AlT.LIZIZ(sbLIZ);
        } else {
            long jCurrentTimeMillis5 = System.currentTimeMillis();
            C786410Ut5.LJJJJI(viewGroup);
            Object objLIZLLL = interfaceC722440SVm.LIZLLL(interfaceC722440SVm, c07xhLIZ);
            if (objLIZLLL instanceof View) {
                view2 = (View) objLIZLLL;
            }
            if (layoutParams != null) {
                viewGroup.addView(view2, layoutParams);
            } else {
                viewGroup.addView(view2);
            }
            long jCurrentTimeMillis6 = System.currentTimeMillis() - jCurrentTimeMillis5;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("createTime: ");
            sbLIZ2.append(jCurrentTimeMillis6);
            C2188811AlT.LIZIZ(sbLIZ2);
        }
        aFwS308S0000000_23.invoke("tuc_view_show", C722430SVl.LIZ(interfaceC722440SVm));
        C0SVZ c0svzLIZJ = interfaceC722440SVm.LIZJ();
        if (c0svzLIZJ != null) {
            c0svzLIZJ.LIZ();
        }
        return true;
    }
}
