package X;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Map;
import kotlin.jvm.internal.AwS576S0100000_32;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.18d5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21326518d5 {
    public static final C21326618d6 LJIILIIL = new C21326618d6();
    public C21325918cz LIZ;
    public View LIZIZ;
    public Map<String, ? extends Object> LIZJ;
    public volatile Map<String, ? extends Object> LIZLLL;
    public volatile boolean LJ;
    public volatile EnumC21327118dB LJFF;
    public InterfaceC21327318dD LJI;
    public Map<String, ? extends Object> LJII;
    public String LJIIIIZZ;
    public Map<String, ? extends Object> LJIIIZ;
    public Map<String, ? extends Object> LJIIJ;
    public InterfaceC21326118d1 LJIIJJI;
    public final C01GW LJIIL;

    public final void LIZIZ() {
        Map<String, ? extends Object> map = this.LJII;
        if (map == null || !(!map.isEmpty())) {
            return;
        }
        LIZ(map, this.LJIIJJI, this.LJIIIIZZ, this.LJI);
    }

    public final void LIZJ() {
        View view = this.LIZIZ;
        ViewParent parent = view.getParent();
        if (parent != null && (parent instanceof ViewGroup)) {
            try {
                C786410Ut5.LJJJLZIJ(view, (ViewGroup) parent);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        this.LJFF = EnumC21327118dB.LL;
        InterfaceC21326118d1 interfaceC21326118d1 = this.LJIIJJI;
        if (interfaceC21326118d1 != null) {
            interfaceC21326118d1.release();
        }
        this.LJI = null;
        this.LJII = null;
        this.LJIIIIZZ = null;
        this.LJIIIZ = null;
        this.LJIIJ = null;
        this.LJIIJJI = null;
        C1549280qQ2.LIZ.LIZ.remove(C1942607jE.LIZ(this.LIZ.LJIIL()));
    }

    public C21326518d5(C21325918cz c21325918cz, C21327718dH c21327718dH) {
        this.LIZ = c21325918cz;
        this.LIZIZ = c21327718dH;
        c21325918cz.LJIIIIZZ = this;
        c21325918cz.LJIIJ.LJII = this;
        this.LJFF = EnumC21327118dB.LL;
        this.LJIIL = C452501pT.LIZIZ(new AwS576S0100000_32(this, 655));
    }

    public final void LIZLLL(C21325918cz c21325918cz, View view) {
        if (!Intrinsics.LJFF(this.LIZ, c21325918cz)) {
            this.LIZ = c21325918cz;
            c21325918cz.LJIIIIZZ = this;
            c21325918cz.LJIIJ.LJII = this;
            Map<String, ? extends Object> map = this.LJIIIZ;
            Map<String, ? extends Object> map2 = this.LJIIJ;
            c21325918cz.LIZLLL = map;
            c21325918cz.LJ = map2;
        }
        if (!Intrinsics.LJFF(this.LIZIZ, view)) {
            this.LIZIZ = view;
        }
    }

    public final void LIZ(Map<String, ? extends Object> map, InterfaceC21326118d1 interfaceC21326118d1, String str, InterfaceC21327318dD interfaceC21327318dD) {
        boolean z;
        String message;
        C21327718dH c21327718dH;
        C21327718dH c21327718dH2;
        EnumC21327118dB enumC21327118dB = this.LJFF;
        EnumC21327118dB enumC21327118dB2 = EnumC21327118dB.LLILZIL;
        String str2 = null;
        if (enumC21327118dB == enumC21327118dB2) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("bindData, myna container status error=");
            sbLIZ.append(this.LJFF);
            sbLIZ.append(", url=");
            C1774720wHe c1774720wHe = this.LIZ.LIZIZ;
            if (c1774720wHe != null) {
                str2 = c1774720wHe.LIZ;
            }
            sbLIZ.append(str2);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            if (interfaceC21327318dD != null) {
                interfaceC21327318dD.LJLIIIL(1010, strLIZIZ);
            }
            new C1338670kwL(EnumC1325870kbh.RENDER_ERROR, 1010, strLIZIZ, null, 24).LIZJ(C21323718cd.LIZ(this));
            return;
        }
        EnumC21327118dB enumC21327118dB3 = this.LJFF;
        EnumC21327118dB enumC21327118dB4 = EnumC21327118dB.LLILLL;
        if (enumC21327118dB3 != enumC21327118dB4 && this.LJFF != EnumC21327118dB.LLILZ) {
            InterfaceC21327318dD interfaceC21327318dD2 = this.LJI;
            if (interfaceC21327318dD2 != null) {
                interfaceC21327318dD2.LJIJJLI();
            }
            this.LJI = interfaceC21327318dD;
            this.LJII = map;
            this.LJIIIIZZ = str;
            return;
        }
        if (interfaceC21326118d1 == null && (interfaceC21326118d1 = this.LJIIJJI) == null) {
            View view = this.LIZIZ;
            interfaceC21326118d1 = new C1545060qJE(view, view.getContext(), this);
        }
        this.LJIIJJI = interfaceC21326118d1;
        C21325918cz c21325918cz = this.LIZ;
        c21325918cz.LIZJ = interfaceC21326118d1;
        c21325918cz.LJIJJ = true;
        c21325918cz.LJIJJLI = false;
        if (this.LJFF == enumC21327118dB4) {
            z = true;
        } else {
            z = false;
        }
        C21325918cz c21325918cz2 = this.LIZ;
        Map<String, ? extends Object> map2 = this.LJIIIZ;
        Map<String, ? extends Object> map3 = this.LJIIJ;
        c21325918cz2.LIZLLL = map2;
        c21325918cz2.LJ = map3;
        if (C1325860kbg.LJII()) {
            C21319718bz c21319718bzLIZJ = this.LIZ.LIZJ();
            if (c21319718bzLIZJ != null) {
                c21319718bzLIZJ.LIZ.clear();
            }
            C1545310qJd c1545310qJdLIZLLL = this.LIZ.LIZLLL();
            if (c1545310qJdLIZLLL != null) {
                c1545310qJdLIZLLL.LIZ.clear();
            }
            C1545310qJd c1545310qJdLIZLLL2 = this.LIZ.LIZLLL();
            if (c1545310qJdLIZLLL2 != null) {
                c1545310qJdLIZLLL2.LIZIZ.clear();
            }
        }
        View view2 = this.LIZIZ;
        if ((view2 instanceof C21327718dH) && (c21327718dH2 = (C21327718dH) view2) != null) {
            c21327718dH2.setCreateLayoutListener$myna_render_release(this.LIZ.LJIIJ.LJIIJ);
        }
        View view3 = this.LIZIZ;
        if ((view3 instanceof C21327718dH) && (c21327718dH = (C21327718dH) view3) != null) {
            c21327718dH.setDispatchDrawListener$myna_render_release(this.LIZ.LJIIJ.LJIIJJI);
        }
        C21326018d0 c21326018d0LIZ = this.LIZ.LIZ(str, map, z);
        if (c21326018d0LIZ.LIZ == 0) {
            if (z) {
                this.LJFF = EnumC21327118dB.LLILZ;
                InterfaceC21327318dD interfaceC21327318dD3 = this.LJI;
                if (interfaceC21327318dD3 != null) {
                    interfaceC21327318dD3.LIZJ(c21326018d0LIZ.LIZJ);
                }
                this.LIZIZ.addOnLayoutChangeListener((View.OnLayoutChangeListener) this.LJIIL.getValue());
                return;
            }
            if (interfaceC21327318dD == null) {
                return;
            }
            interfaceC21327318dD.LIZIZ(c21326018d0LIZ.LIZJ);
            return;
        }
        this.LJFF = enumC21327118dB2;
        if (interfaceC21327318dD == null) {
            return;
        }
        int i = c21326018d0LIZ.LIZ;
        Throwable th = c21326018d0LIZ.LIZIZ;
        if (th == null || (message = th.getMessage()) == null) {
            message = "";
        }
        interfaceC21327318dD.LJLIIIL(i, message);
    }
}
