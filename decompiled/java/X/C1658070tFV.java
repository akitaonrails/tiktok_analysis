package X;

import android.view.ViewGroup;
import android.widget.LinearLayout;
import iyl.i3;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0tFV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1658070tFV {
    public final LinearLayout LIZ;
    public final LinearLayout LIZIZ;
    public final Map<String, InterfaceC1657880tFC> LIZJ;
    public List<i3> LIZLLL = C13BV.INSTANCE;
    public InterfaceC1657840tF8 LJ;
    public boolean LJFF;

    public final boolean LIZIZ() {
        i3 i3Var;
        i3 next;
        Iterator<i3> it2 = this.LIZLLL.iterator();
        while (true) {
            i3Var = null;
            if (!it2.hasNext()) {
                next = null;
                break;
            }
            next = it2.next();
            if (Intrinsics.LJFF(next.LLJLIL, "privacy_setting")) {
                break;
            }
        }
        i3 i3Var2 = next;
        Iterator<i3> it3 = this.LIZLLL.iterator();
        while (true) {
            if (!it3.hasNext()) {
                break;
            }
            i3 next2 = it3.next();
            if (Intrinsics.LJFF(next2.LLJLIL, "send_dm")) {
                i3Var = next2;
                break;
            }
        }
        i3 i3Var3 = i3Var;
        this.LJFF = ((this.LIZ.getVisibility() == 0) ^ (i3Var2 != null)) | ((i3Var3 != null) ^ (this.LIZIZ.getVisibility() == 0));
        if (i3Var2 != null) {
            C786410Ut5.LJLLLLLL(0, this.LIZ);
            LIZ(this.LIZ, i3Var2);
        } else {
            C436180H8m.LIZIZ(this.LIZ);
        }
        if (i3Var3 != null) {
            C786410Ut5.LJLLLLLL(0, this.LIZIZ);
            LIZ(this.LIZIZ, i3Var3);
        } else {
            C436180H8m.LIZIZ(this.LIZIZ);
        }
        return this.LJFF;
    }

    public final void LIZ(ViewGroup viewGroup, i3 i3Var) {
        Map<String, InterfaceC1657880tFC> map = this.LIZJ;
        String str = i3Var.LLJLIL;
        InterfaceC1657880tFC interfaceC1657880tFCLIZIZ = map.get(str);
        if (interfaceC1657880tFCLIZIZ == null) {
            InterfaceC1657840tF8 interfaceC1657840tF8 = this.LJ;
            if (interfaceC1657840tF8 != null) {
                interfaceC1657880tFCLIZIZ = interfaceC1657840tF8.LIZIZ(i3Var);
                map.put(str, interfaceC1657880tFCLIZIZ);
            } else {
                "Required value was null.".toString();
                throw new IllegalArgumentException("Required value was null.");
            }
        }
        InterfaceC1657880tFC interfaceC1657880tFC = interfaceC1657880tFCLIZIZ;
        viewGroup.addView(interfaceC1657880tFC.LIZIZ(0, viewGroup), 0);
        interfaceC1657880tFC.LIZJ(i3Var);
    }

    public C1658070tFV(LinearLayout linearLayout, LinearLayout linearLayout2, Map<String, InterfaceC1657880tFC> map) {
        this.LIZ = linearLayout;
        this.LIZIZ = linearLayout2;
        this.LIZJ = map;
    }
}
