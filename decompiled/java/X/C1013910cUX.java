package X;

import android.view.View;
import android.view.ViewGroup;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.component.playablecomponent.AnolePlayableData;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS30S0001000_16;
import kotlin.jvm.internal.AwS560S0100000_16;
import kotlin.jvm.internal.AwS595S0100000_16;

/* JADX INFO: renamed from: X.0cUX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1013910cUX {
    /* JADX WARN: Removed duplicated region for block: B:51:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01ae  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LIZ(X.C1013880cUU r29) {
        /*
            Method dump skipped, instruction units count: 433
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1013910cUX.LIZ(X.0cUU):void");
    }

    public static final boolean LIZIZ(C1013880cUU c1013880cUU) {
        C1013930cUZ c1013930cUZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("exitClearMode, isInClearMode: ");
        sbLIZ.append(c1013880cUU.LLLFFI);
        C1022620cia.LJ("AnolePlayableComponent", C2188811AlT.LIZIZ(sbLIZ));
        InterfaceC1008670cM5 interfaceC1008670cM5 = c1013880cUU.LLLFZ;
        if (interfaceC1008670cM5 != null) {
            interfaceC1008670cM5.enable(false);
        }
        C1009850cNz c1009850cNz = c1013880cUU.LLJLLL;
        if ((c1009850cNz instanceof C1013930cUZ) && (c1013930cUZ = (C1013930cUZ) c1009850cNz) != null) {
            c1013930cUZ.setInClearMode(false);
        }
        if (!c1013880cUU.LLLFFI) {
            return false;
        }
        LJFF(c1013880cUU, false);
        c1013880cUU.LLLFFI = false;
        C1013920cUY c1013920cUY = (C1013920cUY) c1013880cUU.LLJLILLLLZIIL.getValue();
        c1013920cUY.logAd(c1013920cUY.LIZJ, new AwS30S0001000_16(c1013880cUU.LLLFF, 18));
        return true;
    }

    public static final void LJ(C1013880cUU c1013880cUU) {
        C1749280vcc c1749280vcc;
        if (c1013880cUU.LLJZ == null) {
            View view = c1013880cUU.LLJJIJIL;
            if (view != null) {
                c1749280vcc = (C1749280vcc) view.findViewById(R.id.qo4);
            } else {
                c1749280vcc = null;
            }
            c1013880cUU.LLJZ = c1749280vcc;
            C1749280vcc c1749280vcc2 = c1013880cUU.LLJZ;
            if (c1749280vcc2 != null) {
                C1722300uv6 c1722300uv6 = new C1722300uv6();
                C419910GdJ c419910GdJ = new C419910GdJ();
                c419910GdJ.LJ = Integer.valueOf(R.attr.zi);
                c419910GdJ.LIZ = R.raw.icon_large_refresh;
                c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(48));
                c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(48));
                c1722300uv6.LIZJ = 0;
                c1722300uv6.LIZIZ = c419910GdJ;
                c1722300uv6.LJI = c1013880cUU.LJJIFFI().getString(2131840500);
                c1722300uv6.LJIIIZ = new AwS595S0100000_16(c1013880cUU, 268);
                c1749280vcc2.setStatus(c1722300uv6);
            }
        }
        C197039127h c197039127h = c1013880cUU.LLJZIJLIL;
        if (c197039127h != null) {
            c197039127h.setEnabled(true);
        }
        C1749280vcc c1749280vcc3 = c1013880cUU.LLJZ;
        if (c1749280vcc3 != null) {
            C786410Ut5.LLLZLZ(c1749280vcc3, 0);
        }
    }

    public static final void LJFF(C1013880cUU c1013880cUU, boolean z) {
        int i;
        View c341580DaG;
        ViewGroup viewGroup;
        C341580DaG c341580DaG2;
        C737030Svd c737030Svd = new C737030Svd(103, new C1597406Ng(z, null));
        c737030Svd.LJIILLIIL = System.identityHashCode(c1013880cUU.LJJIFFI());
        c737030Svd.LJ = c1013880cUU.LLILLJJLI.LJI;
        C1440005kM.LIZ(c737030Svd);
        c1013880cUU.LLILLL.LJIJ(new C989560brG(EnumC1008920cMU.NATIVE_PLAYABLE_CONVERT_FORMAT.getType(), new C1003870cEL(z)), c1013880cUU);
        if (z && c1013880cUU.LLLI == null) {
            View view = c1013880cUU.LLJJIJIL;
            if (view == null || (c341580DaG = view.findViewById(R.id.b5o)) == null) {
                c341580DaG = new C341580DaG(c1013880cUU.LJJIFFI());
                c341580DaG.setId(R.id.b5o);
                View view2 = c1013880cUU.LLJJIJIL;
                if ((view2 instanceof ViewGroup) && (viewGroup = (ViewGroup) view2) != null) {
                    C7982039w.LIZ(c341580DaG, viewGroup, new ViewGroup.LayoutParams(-1, -2));
                }
            }
            c1013880cUU.LLLI = c341580DaG;
            if ((c341580DaG instanceof C341580DaG) && (c341580DaG2 = (C341580DaG) c341580DaG) != null) {
                c341580DaG2.setLeftIconClickListener(new AwS560S0100000_16(c1013880cUU, 748));
            }
        }
        View view3 = c1013880cUU.LLLI;
        if (view3 != null) {
            if (z) {
                i = 0;
            } else {
                i = 8;
            }
            C786410Ut5.LJLLLLLL(i, view3);
        }
    }

    public static final void LIZJ(C1013880cUU c1013880cUU, boolean z, boolean z2) {
        AnolePlayableData anolePlayableDataLJJ;
        String str;
        View view;
        View view2;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("loadUrl, hasLoadUrl: ");
        sbLIZ.append(c1013880cUU.LLL);
        sbLIZ.append(", fromPreRender: ");
        sbLIZ.append(z);
        sbLIZ.append(", forceLoad: ");
        sbLIZ.append(z2);
        C1022620cia.LJ("AnolePlayableComponent", C2188811AlT.LIZIZ(sbLIZ));
        if (c1013880cUU.LLJLLL != null && !c1013880cUU.LLL && (anolePlayableDataLJJ = c1013880cUU.LJJ()) != null && (str = anolePlayableDataLJJ.playableUrl) != null) {
            c1013880cUU.LLL = true;
            try {
                C1009850cNz c1009850cNz = c1013880cUU.LLJLLL;
                if (c1009850cNz != null) {
                    c1009850cNz.LIZJ(str, z2);
                }
                if (z && (view = c1013880cUU.LLJJIJIL) != null) {
                    if (view.getWidth() > 0 && (view2 = c1013880cUU.LLJJIJIL) != null && view2.getHeight() > 0) {
                        return;
                    }
                    int iLIZIZ = C497820Jfg.LIZIZ(c1013880cUU.LJJIFFI());
                    int iLIZ = C497820Jfg.LIZ(c1013880cUU.LJJIFFI());
                    int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iLIZIZ, 1073741824);
                    int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(iLIZ, 1073741824);
                    View view3 = c1013880cUU.LLJJIJIL;
                    if (view3 != null) {
                        view3.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                    }
                    View view4 = c1013880cUU.LLJJIJIL;
                    if (view4 != null) {
                        view4.layout(0, 0, iLIZIZ, iLIZ);
                    }
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                c1013880cUU.LLL = false;
                LJ(c1013880cUU);
                ((InterfaceC1013940cUa) c1013880cUU.LLJLIL.getValue()).hv(c1013880cUU.LJJI(), -1, e.getMessage());
                C805380Via.LIZJ(e, "load playable fail");
            }
        }
    }

    public static void LIZLLL(C1013880cUU c1013880cUU, boolean z, boolean z2, int i) {
        if ((i & 1) != 0) {
            z = false;
        }
        if ((i & 2) != 0) {
            z2 = false;
        }
        if (((Boolean) C284090BBn.LIZ.getValue()).booleanValue() && !c1013880cUU.LLL) {
            C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C1007320cJu(c1013880cUU, null, z, z2), 3);
        } else {
            LIZJ(c1013880cUU, z, z2);
        }
    }
}
