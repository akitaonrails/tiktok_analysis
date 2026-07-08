package X;

import Y.ARunnableS102S0100000_2;
import Y.ARunnableS112S0100000_12;
import android.app.Activity;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import androidx.fragment.app.Fragment;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.1BhA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2211621BhA {
    public static String LIZIZ;
    public static C2211641BhC LIZJ;
    public static C2211641BhC LIZLLL;
    public static C2211641BhC LJ;
    public static C2211641BhC LJFF;
    public static C2211641BhC LJI;
    public static final C2211621BhA LIZ = new C2211621BhA();
    public static final ConcurrentHashMap<String, C2211641BhC> LJII = new ConcurrentHashMap<>();
    public static final ConcurrentHashMap<String, C2211641BhC> LJIIIIZZ = new ConcurrentHashMap<>();
    public static final C01GW LJIIIZ = C452501pT.LIZIZ(new C2207171BZz());
    public static final C01GW LJIIJ = C452501pT.LIZIZ(new C686030QvZ());
    public static final ArrayList<InterfaceC2211741BhM> LJIIJJI = new ArrayList<>();

    /* JADX WARN: Removed duplicated region for block: B:121:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0247  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0255  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x02b7  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0126  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZIZ(X.C10VW r9) {
        /*
            Method dump skipped, instruction units count: 701
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2211621BhA.LIZIZ(X.10VW):void");
    }

    public static void LIZJ(C2211641BhC c2211641BhC) {
        Activity activity;
        C2211641BhC c2211641BhC2;
        HashMap<String, HashSet<C2211641BhC>> map;
        if (c2211641BhC.LJJI && c2211641BhC.LJIILLIIL == AnonymousClass1962.SAVEINSTANCESTATE) {
            return;
        }
        int i = C2187451AjH.LIZ;
        Iterator<Map.Entry<String, HashSet<C2211641BhC>>> it2 = c2211641BhC.LJIJJLI.entrySet().iterator();
        while (it2.hasNext()) {
            Iterator<C2211641BhC> it3 = it2.next().getValue().iterator();
            while (it3.hasNext()) {
                ListProtector.get(a0.LJJLIIIJILLIZJL(it3.next().LIZ(), new String[]{e3.d}, 0, 6), 1);
            }
        }
        ListProtector.get(a0.LJJLIIIJILLIZJL(c2211641BhC.LIZ(), new String[]{e3.d}, 0, 6), 1);
        Iterator<Map.Entry<String, HashSet<C2211641BhC>>> it4 = c2211641BhC.LJIJJLI.entrySet().iterator();
        while (it4.hasNext()) {
            for (C2211641BhC c2211641BhC3 : it4.next().getValue()) {
                LJII.remove(c2211641BhC3.LIZ);
                LIZ.getClass();
                LJIIIZ(c2211641BhC3);
            }
        }
        if (c2211641BhC.LJJII && (c2211641BhC2 = c2211641BhC.LJIJI) != null && (map = c2211641BhC2.LJIJJLI) != null) {
            map.remove(c2211641BhC.LIZ);
        }
        LJII.remove(c2211641BhC.LIZ);
        LJIIIZ(c2211641BhC);
        C2211641BhC c2211641BhC4 = c2211641BhC.LJIIZILJ;
        if (c2211641BhC4 != null) {
            WeakReference<Activity> weakReference = c2211641BhC.LJJIFFI;
            if (weakReference != null && (activity = weakReference.get()) != null && activity.getIntent().getBooleanExtra("is_route_activity", false) && c2211641BhC.LJIIIZ != null && 1 != 0) {
                c2211641BhC4.LJIIJ = c2211641BhC.LJIIIZ;
                c2211641BhC.LJIIIZ = null;
            }
            c2211641BhC4.LIZLLL(c2211641BhC.LJIJ);
        }
    }

    public static C2211641BhC LJFF(String str) {
        return LJII.get(str);
    }

    public static String LJI(String str) {
        for (Map.Entry<String, C2211641BhC> entry : LJII.entrySet()) {
            if (Intrinsics.LJFF(entry.getValue().LIZIZ(), str)) {
                return entry.getKey();
            }
        }
        return "";
    }

    public static void LJII(C2211641BhC c2211641BhC) {
        WeakReference<Fragment> weakReference;
        Fragment fragment;
        View view;
        Activity activity;
        Window window;
        View decorView;
        if (c2211641BhC.LJJI) {
            WeakReference<Activity> weakReference2 = c2211641BhC.LJJIFFI;
            if (weakReference2 != null && (activity = weakReference2.get()) != null && (window = activity.getWindow()) != null && (decorView = window.getDecorView()) != null) {
                decorView.setTag(-1843987113, c2211641BhC);
            }
        } else if (c2211641BhC.LJJII && (weakReference = c2211641BhC.LJJIII) != null && (fragment = weakReference.get()) != null && (view = fragment.getView()) != null) {
            view.setTag(-1843987113, c2211641BhC);
        }
        c2211641BhC.LJIIIZ = null;
        c2211641BhC.LJJIZ = null;
        c2211641BhC.LJIILL = 1;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(LIZIZ);
        sbLIZ.append('.');
        sbLIZ.append(c2211641BhC.LIZIZ());
        sbLIZ.append(".c0.d0");
        c2211641BhC.LJII = C2188811AlT.LIZIZ(sbLIZ);
        C2211641BhC c2211641BhC2 = LIZJ;
        if (c2211641BhC2 != null) {
            if (c2211641BhC2.LJJ) {
                c2211641BhC.LJIILJJIL = c2211641BhC2.LJIILJJIL;
            } else {
                c2211641BhC.LJIILJJIL = c2211641BhC2.LIZ();
            }
        }
    }

    public static void LJIIIIZZ(C2211641BhC c2211641BhC) {
        LJII.put(c2211641BhC.LIZ, c2211641BhC);
        Iterator it2 = ((CopyOnWriteArrayList) LJIIIZ.getValue()).iterator();
        while (it2.hasNext()) {
            ((InterfaceC2211721BhK) it2.next()).LIZJ(new C0QFT(c2211641BhC));
        }
    }

    public static void LJIIIZ(C2211641BhC c2211641BhC) {
        Iterator it2 = ((CopyOnWriteArrayList) LJIIIZ.getValue()).iterator();
        while (it2.hasNext()) {
            ((InterfaceC2211721BhK) it2.next()).LIZIZ(new C0QFT(c2211641BhC));
        }
    }

    public static void LJIIJ(C2211641BhC c2211641BhC) {
        c2211641BhC.LJIILLIIL = AnonymousClass1962.INVISIBLE;
        if (c2211641BhC.LJJIJIIJIL != 0) {
            c2211641BhC.LJJIJIL = SystemClock.elapsedRealtime() - c2211641BhC.LJJIJIIJIL;
        }
        if (!c2211641BhC.LJJ && c2211641BhC.LJJIL) {
            int i = C2187451AjH.LIZ;
            C13E8<String> c13e8 = C1391850mK7.LIZ;
            Map<String, String> mapLJ = c2211641BhC.LJ();
            C1391850mK7.LIZ(mapLJ);
            C823050WQl.LIZLLL().submit(new ARunnableS112S0100000_12(mapLJ, 420));
            String str = c2211641BhC.LIZ;
            Iterator it2 = C2211751BhN.LJI(C2211751BhN.LJIIIZ()).entrySet().iterator();
            while (it2.hasNext()) {
                for (C2211821BhU c2211821BhU : (Iterable) ((Map.Entry) it2.next()).getValue()) {
                    if (Intrinsics.LJFF(c2211821BhU.LJIIIIZZ, str) && c2211821BhU.LJFF) {
                        c2211821BhU.LJIIJ = true;
                        c2211821BhU.LJIIIZ = true;
                    }
                }
            }
            C2211751BhN.LJ(C2211751BhN.LJIIIZ(), false);
            Iterator it3 = ((CopyOnWriteArrayList) LJIIIZ.getValue()).iterator();
            while (it3.hasNext()) {
                ((InterfaceC2211721BhK) it3.next()).LIZLLL(new C0QFT(c2211641BhC));
            }
            c2211641BhC.LJJIJIIJIL = 0L;
            HashSet<C2211641BhC> hashSet = c2211641BhC.LJIJJLI.get(c2211641BhC.LIZ);
            if (hashSet != null) {
                for (C2211641BhC c2211641BhC2 : hashSet) {
                    LIZ.getClass();
                    LJIIJ(c2211641BhC2);
                }
                return;
            }
            return;
        }
        c2211641BhC.LJJIJIIJIL = 0L;
    }

    public static void LIZ(C2211641BhC c2211641BhC, C2211641BhC c2211641BhC2) {
        String str;
        LJIIJJI(c2211641BhC, c2211641BhC2);
        C13E8<String> c13e8 = C1391850mK7.LIZ;
        Map<String, String> mapLJ = c2211641BhC.LJ();
        C1391850mK7.LIZ(mapLJ);
        String strLIZIZ = C105700ad.LIZIZ(mapLJ);
        if (strLIZIZ != null && strLIZIZ.length() != 0) {
            ((Keva) C1391850mK7.LJ.getValue()).storeString("btm_current_cache_page", strLIZIZ);
        }
        if (c2211641BhC.LJJII && c2211641BhC2 != null && c2211641BhC2.LJJ && (str = c2211641BhC2.LJII) != null) {
            int iLJIIJ = C1697810uHb.LJIIJ(C1391850mK7.LIZ);
            while (true) {
                if (-1 >= iLJIIJ) {
                    break;
                }
                C13E8<String> c13e82 = C1391850mK7.LIZ;
                if (Intrinsics.LJFF(c13e82.get(iLJIIJ), str)) {
                    c13e82.remove(iLJIIJ);
                    break;
                }
                iLJIIJ--;
            }
        }
        String str2 = c2211641BhC.LJII;
        if (str2 != null) {
            C13E8<String> c13e83 = C1391850mK7.LIZ;
            c13e83.addLast(str2);
            if (c13e83.size() > 30) {
                c13e83.removeFirst();
            }
        }
        if (C10RI.LIZ.contains(c2211641BhC.LIZIZ())) {
            C823050WQl.LIZLLL().submit(new ARunnableS102S0100000_2(C2097608Jq.LJIIJ(new Pair("btm", c2211641BhC.LIZ()), new Pair("is_cold_start_first_launch", String.valueOf(C1391850mK7.LIZLLL))), 87));
        }
    }

    public static C2211641BhC LIZLLL(View view, InterfaceC2211711BhJ interfaceC2211711BhJ) {
        if (interfaceC2211711BhJ != null) {
            return LJIIIIZZ.get(interfaceC2211711BhJ.w3());
        }
        C2211641BhC c2211641BhC = (C2211641BhC) view.getTag(-1843987113);
        if (c2211641BhC == null) {
            Object parent = view.getParent();
            while (true) {
                if (!(parent instanceof View)) {
                    break;
                }
                View view2 = (View) parent;
                c2211641BhC = (C2211641BhC) view2.getTag(-1843987113);
                if (c2211641BhC == null) {
                    parent = view2.getParent();
                } else {
                    view.setTag(-1843987113, c2211641BhC);
                    break;
                }
            }
        }
        return c2211641BhC;
    }

    public static void LJIIJJI(C2211641BhC c2211641BhC, C2211641BhC c2211641BhC2) {
        String str = null;
        if (c2211641BhC2 == null) {
            C2211641BhC c2211641BhC3 = LJI;
            if (c2211641BhC3 != null) {
                str = c2211641BhC3.LJII;
            }
            c2211641BhC.LJIIIIZZ = str;
            return;
        }
        if (c2211641BhC2.LJIIIZ == null) {
            if (c2211641BhC.LJJII && c2211641BhC2.LJJ) {
                LJIIJJI(c2211641BhC, c2211641BhC2.LJIJ);
                return;
            } else {
                c2211641BhC.LJIIIIZZ = c2211641BhC2.LJII;
                return;
            }
        }
        while (true) {
            if (c2211641BhC2.LJIIIZ != null) {
                c2211641BhC2 = c2211641BhC2.LJIIIZ;
                if (c2211641BhC2 == null) {
                    break;
                }
            } else if (c2211641BhC2 != null) {
                str = c2211641BhC2.LJII;
            }
        }
        c2211641BhC.LJIIIIZZ = str;
    }

    public static void LJIIL(C2211641BhC c2211641BhC, C2211641BhC c2211641BhC2) {
        C2211641BhC c2211641BhC3;
        if (c2211641BhC != null && (!c2211641BhC2.LJJIIJ || c2211641BhC2.LJJIIJZLJL)) {
            LIZ.getClass();
            LJIIJ(c2211641BhC);
        }
        c2211641BhC2.LJIILLIIL = AnonymousClass1962.VISIBLE;
        LIZJ = c2211641BhC2;
        c2211641BhC2.LJJIJIIJIL = SystemClock.elapsedRealtime();
        if (c2211641BhC2.LJJII && (c2211641BhC3 = c2211641BhC2.LJIJI) != null && c2211641BhC3.LJJ) {
            c2211641BhC3.LJIJJ = c2211641BhC2;
        }
        HashSet<C2211641BhC> hashSet = c2211641BhC2.LJIJJLI.get(c2211641BhC2.LIZ);
        if (hashSet != null) {
            for (C2211641BhC c2211641BhC4 : hashSet) {
                c2211641BhC4.LJIILLIIL = AnonymousClass1962.VISIBLE;
                c2211641BhC4.LJJIJIIJIL = SystemClock.elapsedRealtime();
            }
        }
        int i = C2187451AjH.LIZ;
        Iterator it2 = ((CopyOnWriteArrayList) LJIIIZ.getValue()).iterator();
        while (it2.hasNext()) {
            ((InterfaceC2211721BhK) it2.next()).LIZ(new C0QFT(c2211641BhC2));
        }
        if (c2211641BhC != null && ((c2211641BhC.LJJI || ((c2211641BhC2.LJJII && !TextUtils.equals(c2211641BhC.LJJIIZI, c2211641BhC2.LJJIIZI)) || c2211641BhC2.LJJI)) && c2211641BhC.LIZIZ > c2211641BhC2.LIZIZ)) {
            LIZ.getClass();
            LIZJ(c2211641BhC);
        }
        if (c2211641BhC2.LJJ && !c2211641BhC2.LJJIJIIJI) {
            LJII(c2211641BhC2.LJIJJ);
            LJIIL(LIZJ, c2211641BhC2.LJIJJ);
        }
    }

    public static void LJIILIIL(C2211641BhC c2211641BhC, C2211641BhC c2211641BhC2, long j) {
        c2211641BhC2.LJIILLIIL = AnonymousClass1962.VISIBLE;
        c2211641BhC2.LJJIJIIJIL = j;
        c2211641BhC2.LIZLLL(c2211641BhC);
        if (c2211641BhC != null) {
            c2211641BhC.LJIL = c2211641BhC2;
        }
        for (Map.Entry<String, HashSet<C2211641BhC>> entry : c2211641BhC2.LJIJJLI.entrySet()) {
            for (C2211641BhC c2211641BhC3 : entry.getValue()) {
                C2211641BhC c2211641BhC4 = LJII.get(entry.getKey());
                LIZ.getClass();
                LJIILIIL(c2211641BhC4, c2211641BhC3, j);
            }
        }
    }
}
