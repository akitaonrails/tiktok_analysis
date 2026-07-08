package X;

import android.app.ActivityManager;
import android.content.Context;
import android.graphics.Bitmap;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: X.0kgQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1328800kgQ {
    public static C1328800kgQ LIZIZ = null;
    public final C1332300km4 LIZ;

    public static C1328800kgQ LJII() {
        if (LIZIZ == null) {
            LIZIZ = new C1328800kgQ();
        }
        return LIZIZ;
    }

    public final InterfaceC1330230kij LIZ() {
        C1332310km5 c1332310km5 = this.LIZ.LIZLLL;
        InterfaceC2217461Bqa[] interfaceC2217461BqaArr = C1332300km4.LJJIJL;
        return (InterfaceC1330230kij) c1332310km5.LIZ();
    }

    public final InterfaceC1325590kbF LIZIZ() {
        C1332310km5 c1332310km5 = this.LIZ.LJ;
        InterfaceC2217461Bqa[] interfaceC2217461BqaArr = C1332300km4.LJJIJL;
        return (InterfaceC1325590kbF) c1332310km5.LIZ();
    }

    public final InterfaceC1328030kfB LIZJ() {
        C1332310km5 c1332310km5 = this.LIZ.LJIIIZ;
        InterfaceC2217461Bqa[] interfaceC2217461BqaArr = C1332300km4.LJJIJL;
        return (InterfaceC1328030kfB) c1332310km5.LIZ();
    }

    public final C1328150kfN LIZLLL() {
        return this.LIZ.LIZ();
    }

    public final InterfaceC1328230kfV LJ() {
        C1332310km5 c1332310km5 = this.LIZ.LJII;
        InterfaceC2217461Bqa[] interfaceC2217461BqaArr = C1332300km4.LJJIJL;
        return (InterfaceC1328230kfV) c1332310km5.LIZ();
    }

    public final InterfaceC1327000kdW LJFF() {
        C1332310km5 c1332310km5 = this.LIZ.LJIIJ;
        InterfaceC2217461Bqa[] interfaceC2217461BqaArr = C1332300km4.LJJIJL;
        return (InterfaceC1327000kdW) c1332310km5.LIZ();
    }

    public final C1329060kgq LJI() {
        C1332310km5 c1332310km5 = this.LIZ.LJJII;
        InterfaceC2217461Bqa[] interfaceC2217461BqaArr = C1332300km4.LJJIJL;
        return (C1329060kgq) c1332310km5.LIZ();
    }

    public final int LJIIIIZZ() {
        C1332310km5 c1332310km5 = this.LIZ.LJIIZILJ;
        InterfaceC2217461Bqa[] interfaceC2217461BqaArr = C1332300km4.LJJIJL;
        return ((Integer) c1332310km5.LIZ()).intValue();
    }

    public final InterfaceC1328250kfX LJIIIZ() {
        C1332310km5 c1332310km5 = this.LIZ.LJIILLIIL;
        InterfaceC2217461Bqa[] interfaceC2217461BqaArr = C1332300km4.LJJIJL;
        return (InterfaceC1328250kfX) c1332310km5.LIZ();
    }

    public final C1328770kgN LJIIJ() {
        C1332310km5 c1332310km5 = this.LIZ.LJIJJLI;
        InterfaceC2217461Bqa[] interfaceC2217461BqaArr = C1332300km4.LJJIJL;
        return (C1328770kgN) c1332310km5.LIZ();
    }

    public final boolean LJIIJJI() {
        try {
            C1332310km5 c1332310km5 = this.LIZ.LJJIIJ;
            InterfaceC2217461Bqa[] interfaceC2217461BqaArr = C1332300km4.LJJIJL;
            return ((Boolean) c1332310km5.LIZ()).booleanValue();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("isSplitMemCache: t = ");
            sbLIZ.append(th);
            C1328570kg3.LJFF("debug_tt", C2188811AlT.LIZIZ(sbLIZ));
            return false;
        }
    }

    public C1328800kgQ() {
        C1332300km4 c1332300km4 = new C1332300km4();
        this.LIZ = c1332300km4;
        if (c1332300km4.LIZ() != null) {
            c1332300km4.LIZ().getClass();
        }
        if (c1332300km4.LIZ() != null) {
            c1332300km4.LIZ().getClass();
        }
    }

    public C1328800kgQ(C1328810kgR c1328810kgR) {
        C1332300km4 c1332300km4 = new C1332300km4();
        this.LIZ = c1332300km4;
        C1336010ks3.LIZIZ();
        C1328160kfO c1328160kfO = c1328810kgR.LJIILLIIL;
        c1328160kfO.getClass();
        C1328150kfN c1328150kfN = new C1328150kfN(c1328160kfO);
        C1332310km5 c1332310km5 = c1332300km4.LJJIII;
        InterfaceC2217461Bqa[] interfaceC2217461BqaArr = C1332300km4.LJJIJL;
        c1332310km5.LIZIZ(c1328150kfN);
        Object obj = c1328810kgR.LIZIZ;
        c1332300km4.LIZIZ.LIZIZ(obj == null ? new C1329100kgu((ActivityManager) C786410Ut5.H2(c1328810kgR.LIZLLL, "activity")) : obj);
        c1332300km4.LJJIJIIJIL.LIZIZ(new C1329100kgu((ActivityManager) C786410Ut5.H2(c1328810kgR.LIZLLL, "activity")));
        Object obj2 = c1328810kgR.LIZJ;
        c1332300km4.LIZJ.LIZIZ(obj2 == null ? new C1329100kgu((ActivityManager) C786410Ut5.H2(c1328810kgR.LIZLLL, "activity")) : obj2);
        c1332300km4.LIZLLL.LIZIZ(new C1329540khc());
        Bitmap.Config config = c1328810kgR.LIZ;
        c1332300km4.LIZ.LIZIZ(config == null ? Bitmap.Config.ARGB_8888 : config);
        c1332300km4.LJ.LIZIZ(C1324810kZz.LJI());
        Context context = c1328810kgR.LIZLLL;
        context.getClass();
        c1332300km4.LJFF.LIZIZ(context);
        c1332300km4.LJII.LIZIZ(new C1329040kgo(new C1330850kjj()));
        c1332300km4.LJI.LIZIZ(Boolean.valueOf(c1328810kgR.LJ));
        InterfaceC1320070kSL<C1329770khz> interfaceC1320070kSL = c1328810kgR.LJFF;
        c1332300km4.LJIIIIZZ.LIZIZ(interfaceC1320070kSL == null ? new InterfaceC1320070kSL<C1329770khz>() { // from class: X.0kgt
            @Override // X.InterfaceC1320070kSL
            public final C1329770khz get() {
                int iMin = (int) Math.min(Runtime.getRuntime().maxMemory(), 2147483647L);
                int i = iMin < 16777216 ? 1048576 : iMin < 33554432 ? 2097152 : 4194304;
                return new C1329770khz(i, Integer.MAX_VALUE, i, i / 8);
            }
        } : interfaceC1320070kSL);
        Object obj3 = c1328810kgR.LJII;
        if (obj3 == null) {
            synchronized (C1330780kjc.class) {
                if (C1330780kjc.LIZ == null) {
                    C1330780kjc.LIZ = new C1330780kjc();
                }
                obj3 = C1330780kjc.LIZ;
            }
        }
        c1332300km4.LJIIJ.LIZIZ(obj3);
        c1332300km4.LJIIJJI.LIZIZ(null);
        c1332300km4.LJIIL.LIZIZ(null);
        c1332300km4.LJIILIIL.LIZIZ(null);
        c1332300km4.LJIILJJIL.LIZIZ(new InterfaceC1320070kSL<Boolean>() { // from class: X.0kh3
            @Override // X.InterfaceC1320070kSL
            public final Boolean get() {
                return Boolean.TRUE;
            }
        });
        C1329030kgn c1329030kgnLIZ = c1328810kgR.LJIIIIZZ;
        if (c1329030kgnLIZ == null) {
            Context context2 = c1328810kgR.LIZLLL;
            try {
                C1336010ks3.LIZIZ();
                c1329030kgnLIZ = new C1329020kgm(context2).LIZ();
                C1336010ks3.LIZIZ();
            } finally {
            }
        }
        c1332300km4.LJIILL.LIZIZ(c1329030kgnLIZ);
        Object obj4 = c1328810kgR.LJIIIZ;
        c1332300km4.LJIILLIIL.LIZIZ(obj4 == null ? C1328220kfU.LIZIZ() : obj4);
        c1332300km4.LIZ().getClass();
        c1332300km4.LJIIZILJ.LIZIZ(0);
        c1332300km4.LJIJI.LIZIZ(30000);
        C1336010ks3.LIZIZ();
        Object obj5 = c1328810kgR.LJIIJ;
        c1332300km4.LJIJ.LIZIZ(obj5 == null ? new C1328820kgS(((Integer) c1332300km4.LJIJI.LIZ()).intValue()) : obj5);
        C1336010ks3.LIZIZ();
        c1332300km4.LJIJJ.LIZIZ(null);
        C1328770kgN c1328770kgN = c1328810kgR.LJIIJJI;
        c1332300km4.LJIJJLI.LIZIZ(c1328770kgN == null ? new C1328770kgN(new C1328790kgP(new C1330060kiS())) : c1328770kgN);
        c1332300km4.LJIL.LIZIZ(new C1329150kgz());
        Collection collection = c1328810kgR.LJIIL;
        c1332300km4.LJJ.LIZIZ(collection == null ? new HashSet() : collection);
        Boolean bool = Boolean.TRUE;
        c1332300km4.LJJI.LIZIZ(bool);
        Object obj6 = c1328810kgR.LJIILIIL;
        c1332300km4.LJJIFFI.LIZIZ(obj6 == null ? c1332300km4.LJIILL.LIZ() : obj6);
        HashMap<String, C1329030kgn> map = c1328810kgR.LJIILJJIL;
        if (map == null) {
            try {
                C1336010ks3.LIZIZ();
                map = new HashMap<>();
                C1336010ks3.LIZIZ();
            } finally {
            }
        }
        c1332300km4.LJJIJIIJI.LIZIZ(map);
        c1332300km4.LJJII.LIZIZ(c1328810kgR.LJIILL);
        final int i = ((C1328770kgN) c1332300km4.LJIJJLI.LIZ()).LIZ.LIZJ.LIZLLL;
        InterfaceC1328030kfB interfaceC1328030kfB = c1328810kgR.LJI;
        c1332300km4.LJIIIZ.LIZIZ(interfaceC1328030kfB == null ? new InterfaceC1328030kfB(i) { // from class: X.0kPI
            public final Executor LIZIZ;
            public final Executor LIZJ;
            public final Executor LIZ = C786410Ut5.e4(2, new ThreadFactoryC1318170kPH("FrescoIoBoundExecutor"));
            public final Executor LIZLLL = C786410Ut5.e4(1, new ThreadFactoryC1318170kPH("FrescoLightWeightBackgroundExecutor"));

            @Override // X.InterfaceC1328030kfB
            public final Executor LIZ() {
                return this.LIZJ;
            }

            @Override // X.InterfaceC1328030kfB
            public final Executor LIZIZ() {
                return this.LIZ;
            }

            @Override // X.InterfaceC1328030kfB
            public final Executor LIZJ() {
                return this.LIZLLL;
            }

            @Override // X.InterfaceC1328030kfB
            public final Executor LIZLLL() {
                return this.LIZIZ;
            }

            @Override // X.InterfaceC1328030kfB
            public final Executor LJ() {
                return this.LIZ;
            }

            {
                this.LIZIZ = C786410Ut5.e4(i, new ThreadFactoryC1318170kPH("FrescoDecodeExecutor"));
                this.LIZJ = C786410Ut5.e4(i, new ThreadFactoryC1318170kPH("FrescoBackgroundExecutor"));
            }
        } : interfaceC1328030kfB);
        C1328730kgJ.LIZ = c1328810kgR.LJIIZILJ;
        C1328730kgJ.LIZIZ = false;
        C1328730kgJ.LIZJ = 2097152L;
        C1328730kgJ.LIZLLL = true;
        C1328730kgJ.LJ = false;
        C1328730kgJ.LJFF = false;
        C1328730kgJ.LJI = null;
        C1328730kgJ.LJIIIIZZ = true;
        C1328730kgJ.LJIIIZ = false;
        Boolean bool2 = Boolean.FALSE;
        c1332300km4.LJJIIJZLJL.LIZIZ(bool2);
        c1332300km4.LJJIIZ.LIZIZ(bool2);
        c1332300km4.LJJIIZI.LIZIZ(bool2);
        c1332300km4.LJJIJ.LIZIZ(bool);
        c1332300km4.LIZ().getClass();
        c1332300km4.LIZ().getClass();
        C1336010ks3.LIZIZ();
    }

    public static C1328810kgR LJIIL(Context context) {
        C1328810kgR c1328810kgR = new C1328810kgR(context);
        c1328810kgR.LJI = new C1EOZ(Runtime.getRuntime().availableProcessors());
        return c1328810kgR;
    }
}
