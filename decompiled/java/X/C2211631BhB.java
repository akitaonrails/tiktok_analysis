package X;

import Y.ARunnableS112S0100000_12;
import android.app.Activity;
import android.app.Dialog;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS554S0100000_10;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.1BhB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2211631BhB {
    public static boolean LIZ;
    public static boolean LIZIZ;
    public static boolean LIZJ;
    public static InterfaceC1489070oqv LIZLLL;

    public static C0QFT LJFF() {
        C2211621BhA.LIZ.getClass();
        C2211641BhC c2211641BhC = C2211621BhA.LIZJ;
        if (c2211641BhC != null) {
            return new C0QFT(c2211641BhC);
        }
        return null;
    }

    public static final String LJII() {
        C2211621BhA.LIZ.getClass();
        C2211641BhC c2211641BhC = C2211621BhA.LIZJ;
        if (c2211641BhC != null) {
            return c2211641BhC.LIZ();
        }
        return null;
    }

    public static final C807360Vlm LJIIIIZZ() {
        C2211621BhA.LIZ.getClass();
        C2211641BhC c2211641BhC = C2211621BhA.LIZJ;
        if (c2211641BhC != null) {
            return c2211641BhC.LIZJ();
        }
        return null;
    }

    public static final String LJIIIZ() {
        C2211621BhA.LIZ.getClass();
        C2211641BhC c2211641BhC = C2211621BhA.LIZJ;
        if (c2211641BhC != null) {
            return c2211641BhC.LIZIZ();
        }
        return null;
    }

    public static void LIZIZ(Dialog dialog) throws Exception {
        int iHashCode;
        View decorView;
        Window window = dialog.getWindow();
        if (window != null && (decorView = window.getDecorView()) != null) {
            iHashCode = decorView.hashCode();
        } else {
            iHashCode = 0;
        }
        Integer numValueOf = Integer.valueOf(iHashCode);
        if (Intrinsics.LJFF(Looper.getMainLooper(), Looper.myLooper())) {
            Iterator it2 = C2211751BhN.LJI(C2211751BhN.LJIIIZ()).entrySet().iterator();
            while (it2.hasNext()) {
                Map.Entry entry = (Map.Entry) it2.next();
                Iterator it3 = ((List) entry.getValue()).iterator();
                while (it3.hasNext()) {
                    if (Intrinsics.LJFF(((C2211821BhU) it3.next()).LIZLLL, numValueOf)) {
                        it3.remove();
                    }
                }
                if (((List) entry.getValue()).size() == 0) {
                    it2.remove();
                }
            }
            Iterator it4 = C2211751BhN.LJII(C2211751BhN.LJIIIZ()).iterator();
            while (it4.hasNext()) {
                if (Intrinsics.LJFF(((C2211761BhO) it4.next()).getDialogTag$btm_release(), numValueOf)) {
                    it4.remove();
                }
            }
            return;
        }
        throw new Exception("clearWithGroupTag must run on the main thread");
    }

    public static final Map LJI(View view) {
        C2211621BhA.LIZ.getClass();
        C2211641BhC c2211641BhCLIZLLL = C2211621BhA.LIZLLL(view, null);
        if (c2211641BhCLIZLLL == null) {
            c2211641BhCLIZLLL = C2211621BhA.LIZJ;
        }
        if (c2211641BhCLIZLLL == null) {
            return null;
        }
        return new C1766890w51(c2211641BhCLIZLLL, "c3091", "d33711", null, 24).LIZ();
    }

    public static void LJIIJ(DialogFragment dialogFragment) {
        int iHashCode = dialogFragment.hashCode();
        if (Intrinsics.LJFF(Looper.getMainLooper(), Looper.myLooper())) {
            Integer numValueOf = Integer.valueOf(iHashCode);
            ((HashMap) C482200Iva.LIZ).put(numValueOf, Boolean.TRUE);
            return;
        }
        " Must run on the main thread: set dialogFragment can expose".toString();
        throw new IllegalStateException(" Must run on the main thread: set dialogFragment can expose");
    }

    /* JADX WARN: Removed duplicated region for block: B:67:0x00c7 A[Catch: all -> 0x013b, TryCatch #0 {, blocks: (B:13:0x001e, B:15:0x002b, B:17:0x0034, B:19:0x0038, B:21:0x003c, B:24:0x0045, B:26:0x0049, B:28:0x004d, B:30:0x0055, B:32:0x0059, B:34:0x0063, B:36:0x0069, B:37:0x0070, B:38:0x0077, B:35:0x0066, B:61:0x00b5, B:63:0x00bf, B:65:0x00c3, B:67:0x00c7, B:69:0x00d1, B:71:0x00d5, B:72:0x00d8, B:73:0x00e1, B:74:0x00ed, B:76:0x00f3, B:78:0x00fb, B:83:0x0107, B:84:0x010c, B:86:0x0112, B:88:0x011b, B:89:0x011f, B:90:0x0125, B:92:0x012b, B:94:0x0135, B:39:0x007b, B:41:0x007f, B:46:0x0094, B:48:0x0098, B:49:0x009c, B:53:0x00a4, B:54:0x00a6, B:55:0x00a9, B:60:0x00b2), top: B:100:0x001e }] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00f3 A[Catch: all -> 0x013b, TryCatch #0 {, blocks: (B:13:0x001e, B:15:0x002b, B:17:0x0034, B:19:0x0038, B:21:0x003c, B:24:0x0045, B:26:0x0049, B:28:0x004d, B:30:0x0055, B:32:0x0059, B:34:0x0063, B:36:0x0069, B:37:0x0070, B:38:0x0077, B:35:0x0066, B:61:0x00b5, B:63:0x00bf, B:65:0x00c3, B:67:0x00c7, B:69:0x00d1, B:71:0x00d5, B:72:0x00d8, B:73:0x00e1, B:74:0x00ed, B:76:0x00f3, B:78:0x00fb, B:83:0x0107, B:84:0x010c, B:86:0x0112, B:88:0x011b, B:89:0x011f, B:90:0x0125, B:92:0x012b, B:94:0x0135, B:39:0x007b, B:41:0x007f, B:46:0x0094, B:48:0x0098, B:49:0x009c, B:53:0x00a4, B:54:0x00a6, B:55:0x00a9, B:60:0x00b2), top: B:100:0x001e }] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0112 A[Catch: all -> 0x013b, TryCatch #0 {, blocks: (B:13:0x001e, B:15:0x002b, B:17:0x0034, B:19:0x0038, B:21:0x003c, B:24:0x0045, B:26:0x0049, B:28:0x004d, B:30:0x0055, B:32:0x0059, B:34:0x0063, B:36:0x0069, B:37:0x0070, B:38:0x0077, B:35:0x0066, B:61:0x00b5, B:63:0x00bf, B:65:0x00c3, B:67:0x00c7, B:69:0x00d1, B:71:0x00d5, B:72:0x00d8, B:73:0x00e1, B:74:0x00ed, B:76:0x00f3, B:78:0x00fb, B:83:0x0107, B:84:0x010c, B:86:0x0112, B:88:0x011b, B:89:0x011f, B:90:0x0125, B:92:0x012b, B:94:0x0135, B:39:0x007b, B:41:0x007f, B:46:0x0094, B:48:0x0098, B:49:0x009c, B:53:0x00a4, B:54:0x00a6, B:55:0x00a9, B:60:0x00b2), top: B:100:0x001e }] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x012b A[Catch: all -> 0x013b, TryCatch #0 {, blocks: (B:13:0x001e, B:15:0x002b, B:17:0x0034, B:19:0x0038, B:21:0x003c, B:24:0x0045, B:26:0x0049, B:28:0x004d, B:30:0x0055, B:32:0x0059, B:34:0x0063, B:36:0x0069, B:37:0x0070, B:38:0x0077, B:35:0x0066, B:61:0x00b5, B:63:0x00bf, B:65:0x00c3, B:67:0x00c7, B:69:0x00d1, B:71:0x00d5, B:72:0x00d8, B:73:0x00e1, B:74:0x00ed, B:76:0x00f3, B:78:0x00fb, B:83:0x0107, B:84:0x010c, B:86:0x0112, B:88:0x011b, B:89:0x011f, B:90:0x0125, B:92:0x012b, B:94:0x0135, B:39:0x007b, B:41:0x007f, B:46:0x0094, B:48:0x0098, B:49:0x009c, B:53:0x00a4, B:54:0x00a6, B:55:0x00a9, B:60:0x00b2), top: B:100:0x001e }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LJIIJJI(X.C10VW r8) {
        /*
            Method dump skipped, instruction units count: 318
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2211631BhB.LJIIJJI(X.10VW):void");
    }

    public static final void LJIILIIL(InterfaceC2211711BhJ interfaceC2211711BhJ) {
        String strW3;
        ConcurrentHashMap<String, C2211641BhC> concurrentHashMap;
        C2211641BhC c2211641BhC;
        C2211621BhA.LIZ.getClass();
        if (interfaceC2211711BhJ != null && (strW3 = interfaceC2211711BhJ.w3()) != null && (c2211641BhC = (concurrentHashMap = C2211621BhA.LJIIIIZZ).get(strW3)) != null) {
            C2211641BhC c2211641BhC2 = c2211641BhC.LJIJ;
            if (Intrinsics.LJFF(C2211621BhA.LIZJ, c2211641BhC)) {
                if (interfaceC2211711BhJ.RO()) {
                    if (c2211641BhC2 != null) {
                        C2211621BhA.LJIIL(c2211641BhC, c2211641BhC2);
                    }
                    C2211641BhC c2211641BhC3 = C2211621BhA.LIZJ;
                    if (c2211641BhC3 != null) {
                        C2211621BhA.LIZ(c2211641BhC3, c2211641BhC);
                    }
                } else {
                    C2211621BhA.LIZJ = c2211641BhC2;
                }
            } else {
                C2211641BhC c2211641BhC4 = C2211621BhA.LIZJ;
                while (true) {
                    if (c2211641BhC4 != null) {
                        if (Intrinsics.LJFF(c2211641BhC4.LJIJ, c2211641BhC)) {
                            C2211621BhA.LJIIJ(c2211641BhC);
                            C2211641BhC c2211641BhC5 = C2211621BhA.LIZJ;
                            while (true) {
                                if (c2211641BhC5 == null) {
                                    break;
                                }
                                if (Intrinsics.LJFF(c2211641BhC5.LJIJ, c2211641BhC)) {
                                    c2211641BhC5.LIZLLL(c2211641BhC2);
                                    break;
                                }
                                c2211641BhC5 = c2211641BhC5.LJIJ;
                            }
                        } else {
                            c2211641BhC4 = c2211641BhC4.LJIJ;
                        }
                    } else {
                        C2211621BhA.LJIIJ(c2211641BhC);
                        break;
                    }
                }
            }
            c2211641BhC.LIZLLL(null);
            concurrentHashMap.remove(strW3);
            C2211621BhA.LJII.remove(strW3);
            C2211621BhA.LJIIIZ(c2211641BhC);
        }
    }

    public static final void LJIILJJIL(InterfaceC2211711BhJ interfaceC2211711BhJ) {
        C10RT c10rt = new C10RT();
        c10rt.LIZ = interfaceC2211711BhJ.w3();
        c10rt.LIZJ = interfaceC2211711BhJ.getBtmPageCode();
        c10rt.LJIIJJI = C178700mP.LIZ(interfaceC2211711BhJ.r9(), c10rt.LJIIJJI);
        c10rt.LJIIL = interfaceC2211711BhJ.RO();
        c10rt.LIZLLL = EnumC2211681BhG.DIALOG;
        Object objLLFZ = interfaceC2211711BhJ.LLFZ();
        if (objLLFZ != null) {
            c10rt.LJII = new WeakReference<>(objLLFZ);
        }
        LJIIJJI(new C10VW(c10rt));
    }

    public static void LJIILLIIL(InterfaceC2211731BhL interfaceC2211731BhL) {
        C2211641BhC c2211641BhC;
        C2211621BhA.LIZ.getClass();
        String strLJI = C2211621BhA.LJI(interfaceC2211731BhL.qz());
        ConcurrentHashMap<String, C2211641BhC> concurrentHashMap = C2211621BhA.LJII;
        C2211641BhC c2211641BhC2 = concurrentHashMap.get(strLJI);
        if (c2211641BhC2 != null) {
            c2211641BhC2.LJIL = null;
        }
        String strW3 = interfaceC2211731BhL.w3();
        if (strW3 != null && (c2211641BhC = concurrentHashMap.get(strW3)) != null) {
            C2211621BhA.LJIIJ(c2211641BhC);
        }
    }

    public static boolean LIZ(View view, Map map) {
        Map mapLIZJ;
        InterfaceC1489070oqv interfaceC1489070oqv = LIZLLL;
        if (interfaceC1489070oqv != null) {
            interfaceC1489070oqv.LIZ("page", view, map);
        }
        InterfaceC1489070oqv interfaceC1489070oqv2 = LIZLLL;
        if (interfaceC1489070oqv2 == null || (mapLIZJ = interfaceC1489070oqv2.LIZJ(map)) == null) {
            mapLIZJ = map;
        }
        C2211621BhA.LIZ.getClass();
        C2211641BhC c2211641BhCLIZLLL = C2211621BhA.LIZLLL(view, null);
        if (c2211641BhCLIZLLL != null) {
            C178700mP.LIZ(mapLIZJ, c2211641BhCLIZLLL.LJJJ);
            InterfaceC1489070oqv interfaceC1489070oqv3 = LIZLLL;
            if (interfaceC1489070oqv3 != null) {
                interfaceC1489070oqv3.LIZIZ(view, map, true);
            }
            return true;
        }
        return false;
    }

    public static void LIZJ(View view, AbstractC2211791BhR abstractC2211791BhR) {
        if (TextUtils.isEmpty(abstractC2211791BhR.LIZLLL().invoke())) {
            abstractC2211791BhR.LJIILL(new AwS554S0100000_10(new WeakReference(view), (WeakReference<C688690Qzr>) 1043));
        }
        C2211751BhN.LIZ(view, abstractC2211791BhR);
    }

    public static void LIZLLL(View view, AbstractC2211791BhR abstractC2211791BhR) {
        if (TextUtils.isEmpty(abstractC2211791BhR.LIZLLL().invoke())) {
            abstractC2211791BhR.LJIILL(new C665480Q8k(new WeakReference(view)));
        }
        C2211751BhN.LIZ(view, abstractC2211791BhR);
    }

    public static void LJ(View view, Function1 function1) {
        if (Intrinsics.LJFF(Looper.getMainLooper(), Looper.myLooper())) {
            WeakReference weakReference = new WeakReference(view);
            final C20248814Kw c20248814Kw = new C20248814Kw();
            function1.invoke(c20248814Kw);
            C2211751BhN.LJIIL(new C2211761BhO(weakReference, new AbstractC2211791BhR() { // from class: X.14Kx
                public Function0<String> LJ;
                public final C1208900hZ2 LJFF;
                public final C20248714Kv LJI;
                public final int LJII;
                public final float LJIIIIZZ;
                public final Function0<Float> LJIIIZ;
                public final boolean LJIIJ;
                public final boolean LJIIJJI;
                public final EnumC2211841BhW LJIIL;
                public final Function1<View, Boolean> LJIILIIL;

                @Override // X.AbstractC2211791BhR
                public final Function0<String> LIZIZ() {
                    return null;
                }

                @Override // X.AbstractC2211791BhR
                public final Map<String, String> LJII() {
                    return null;
                }

                @Override // X.AbstractC2211791BhR
                public final InterfaceC2211901Bhc LJI() {
                    return this.LJIILJJIL.LIZJ;
                }

                @Override // X.AbstractC2211791BhR
                public final int LIZJ() {
                    return this.LJII;
                }

                @Override // X.AbstractC2211791BhR
                public final Function0<String> LIZLLL() {
                    return this.LJ;
                }

                @Override // X.AbstractC2211791BhR
                public final InterfaceC2211921Bhe LJ() {
                    return this.LJI;
                }

                @Override // X.AbstractC2211791BhR
                public final InterfaceC2211931Bhf LJFF() {
                    return this.LJFF;
                }

                @Override // X.AbstractC2211791BhR
                public final boolean LJIIIIZZ() {
                    return this.LJIIJ;
                }

                @Override // X.AbstractC2211791BhR
                public final boolean LJIIIZ() {
                    return this.LJIIJJI;
                }

                @Override // X.AbstractC2211791BhR
                public final EnumC2211841BhW LJIIJ() {
                    return this.LJIIL;
                }

                @Override // X.AbstractC2211791BhR
                public final Function1<View, Boolean> LJIIJJI() {
                    return this.LJIILIIL;
                }

                @Override // X.AbstractC2211791BhR
                public final float LJIIL() {
                    return this.LJIIIIZZ;
                }

                @Override // X.AbstractC2211791BhR
                public final Function0<Float> LJIILIIL() {
                    return this.LJIIIZ;
                }

                {
                    this.LJ = this.LJIILJJIL.LIZ;
                    this.LJFF = this.LJIILJJIL.LIZIZ;
                    this.LJI = this.LJIILJJIL.LIZLLL;
                    this.LJII = this.LJIILJJIL.LJIIIIZZ;
                    this.LJIIIIZZ = this.LJIILJJIL.LJI;
                    this.LJIIIZ = this.LJIILJJIL.LJII;
                    this.LJIIJ = this.LJIILJJIL.LJ;
                    this.LJIIJJI = this.LJIILJJIL.LJFF;
                    this.LJIIL = this.LJIILJJIL.LJIIIZ;
                    this.LJIILIIL = this.LJIILJJIL.LJIIJ;
                }

                @Override // X.AbstractC2211791BhR
                public final void LJIILL(Function0<String> function0) {
                    this.LJ = function0;
                }
            }));
            return;
        }
        throw new Exception("Add exposure view must run on the main thread");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void LJIIL(InterfaceC1740760vOs interfaceC1740760vOs, Activity activity) {
        C10RT c10rt = new C10RT();
        c10rt.LIZ = interfaceC1740760vOs.w3();
        c10rt.LIZJ = interfaceC1740760vOs.getBtmPageCode();
        c10rt.LJIIJJI = C178700mP.LIZ(interfaceC1740760vOs.r9(), c10rt.LJIIJJI);
        if (interfaceC1740760vOs instanceof Activity) {
            c10rt.LIZLLL = EnumC2211681BhG.ACTIVITY;
            c10rt.LJI = new WeakReference<>(interfaceC1740760vOs);
        } else if (interfaceC1740760vOs instanceof Fragment) {
            c10rt.LIZLLL = EnumC2211681BhG.FRAGMENT;
            c10rt.LJFF = new WeakReference<>(interfaceC1740760vOs);
            C19EG activity2 = ((Fragment) interfaceC1740760vOs).getActivity();
            if (activity2 != null) {
                c10rt.LJI = new WeakReference<>(activity2);
            } else if (activity != null) {
                c10rt.LJI = new WeakReference<>(activity);
            }
            if (interfaceC1740760vOs instanceof C10S5) {
                c10rt.LJIIIZ = true;
                c10rt.LJIIJ = ((C10S5) interfaceC1740760vOs).pO();
            }
        }
        LJIIJJI(new C10VW(c10rt));
    }

    public static final void LJIILL(String str, Map<String, String> map) {
        C10RT c10rt = new C10RT();
        c10rt.LIZ = String.valueOf(C786410Ut5.Y2(System.currentTimeMillis()));
        c10rt.LIZJ = str;
        EnumC2211681BhG enumC2211681BhG = EnumC2211681BhG.VIRTUAL;
        c10rt.LIZLLL = enumC2211681BhG;
        c10rt.LJIIJJI = C178700mP.LIZ(map, c10rt.LJIIJJI);
        C10VW c10vw = new C10VW(c10rt);
        C2211621BhA.LIZ.getClass();
        if (c10vw.LIZLLL == enumC2211681BhG) {
            C2211641BhC c2211641BhC = new C2211641BhC(c10vw.LIZ, -1);
            c2211641BhC.LIZJ = c10vw.LIZJ;
            c2211641BhC.LJJIJIIJIL = SystemClock.elapsedRealtime();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(C2211621BhA.LIZIZ);
            sbLIZ.append('.');
            sbLIZ.append(c10vw.LIZJ);
            sbLIZ.append(".c0.d0");
            c2211641BhC.LIZLLL = C2188811AlT.LIZIZ(sbLIZ);
            c2211641BhC.LJJIJL = EnumC21266118Kd.VIRTUAL.getValue();
            C2211641BhC c2211641BhC2 = C2211621BhA.LIZJ;
            if (c2211641BhC2 == null) {
                c2211641BhC2 = C2211621BhA.LJI;
            } else {
                while (c2211641BhC2.LJIIIZ != null && (c2211641BhC2 = c2211641BhC2.LJIIIZ) != null) {
                }
            }
            c2211641BhC.LIZLLL(c2211641BhC2);
            String str2 = C2211621BhA.LIZIZ + '.' + c10vw.LIZJ + ".c0.d0";
            c2211641BhC.LJII = str2;
            c2211641BhC.LJIIIIZZ = c2211641BhC.LJ;
            c2211641BhC.LJJJ = c10vw.LJIIJJI;
            C2211641BhC c2211641BhC3 = c2211641BhC.LJIJ;
            if (c2211641BhC3 != null) {
                c2211641BhC3.LJIIIZ = c2211641BhC;
            }
            if (C2211621BhA.LIZJ == null) {
                C2211621BhA.LJI = c2211641BhC;
            }
            if (str2 != null) {
                C13E8<String> c13e8 = C1391850mK7.LIZ;
                c13e8.addLast(str2);
                if (c13e8.size() > 30) {
                    c13e8.removeFirst();
                }
            }
            C13E8<String> c13e82 = C1391850mK7.LIZ;
            Map<String, String> mapLJ = c2211641BhC.LJ();
            C1391850mK7.LIZ(mapLJ);
            C823050WQl.LIZLLL().submit(new ARunnableS112S0100000_12(mapLJ, 420));
        }
    }

    public static void LJIIZILJ(InterfaceC2211731BhL interfaceC2211731BhL, boolean z) {
        C10RT c10rt = new C10RT();
        c10rt.LIZ = interfaceC2211731BhL.w3();
        C2211621BhA c2211621BhA = C2211621BhA.LIZ;
        String strQz = interfaceC2211731BhL.qz();
        c2211621BhA.getClass();
        c10rt.LIZIZ = C2211621BhA.LJI(strQz);
        c10rt.LIZJ = interfaceC2211731BhL.getBtmPageCode();
        c10rt.LJIIJJI = C178700mP.LIZ(interfaceC2211731BhL.r9(), c10rt.LJIIJJI);
        c10rt.LIZLLL = EnumC2211681BhG.SUBPAGE;
        c10rt.LJ = z;
        interfaceC2211731BhL.LLFZ();
        c10rt.LJIIIIZZ = new WeakReference<>(interfaceC2211731BhL);
        LJIIJJI(new C10VW(c10rt));
    }

    @InterfaceC1294060jmO
    public static final Map<String, Object> LJIJ(View view, String str, String str2, Map<String, String> map, InterfaceC2211711BhJ interfaceC2211711BhJ) {
        Map<String, String> mapLIZJ;
        InterfaceC1489070oqv interfaceC1489070oqv = LIZLLL;
        if (interfaceC1489070oqv != null) {
            interfaceC1489070oqv.LIZ("unit", view, map);
        }
        C2211621BhA.LIZ.getClass();
        C2211641BhC c2211641BhCLIZLLL = C2211621BhA.LIZLLL(view, interfaceC2211711BhJ);
        if (c2211641BhCLIZLLL == null && (c2211641BhCLIZLLL = C2211621BhA.LIZJ) == null) {
            return null;
        }
        InterfaceC1489070oqv interfaceC1489070oqv2 = LIZLLL;
        if (interfaceC1489070oqv2 == null || (mapLIZJ = interfaceC1489070oqv2.LIZJ(map)) == null) {
            mapLIZJ = map;
        }
        InterfaceC1489070oqv interfaceC1489070oqv3 = LIZLLL;
        if (interfaceC1489070oqv3 != null) {
            interfaceC1489070oqv3.LIZIZ(view, map, false);
        }
        C1766890w51 c1766890w51 = new C1766890w51(c2211641BhCLIZLLL, str, str2, mapLIZJ, 16);
        c2211641BhCLIZLLL.LJJIZ = c1766890w51;
        c2211641BhCLIZLLL.LJII = c1766890w51.LIZIZ;
        return c1766890w51.LIZ();
    }
}
