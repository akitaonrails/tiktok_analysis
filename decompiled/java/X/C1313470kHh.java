package X;

import Y.ARunnableS120S0100000_20;
import android.graphics.Point;
import com.bytedance.sdui.render.tasm.behavior.ui.SDUIBaseUI;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.0kHh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1313470kHh {
    public int LIZ;
    public final C1313660kI0 LIZIZ;
    public final AbstractC1317090kNX LIZJ;
    public final HashSet<String> LIZLLL = new HashSet<>();
    public final HashSet<SDUIBaseUI> LJ = new HashSet<>();
    public final HashMap<Integer, SDUIBaseUI> LJFF = new HashMap<>();
    public final C1317120kNa LJI;
    public final HashMap<Integer, Integer> LJII;
    public final C1313980kIW LJIIIIZZ;
    public boolean LJIIIZ;
    public final boolean LJIIJ;

    public final void LJIILIIL() {
        this.LJIIIZ = true;
        this.LIZ = -1;
        HashMap<Integer, SDUIBaseUI> map = this.LJFF;
        if (map != null) {
            Iterator<SDUIBaseUI> it2 = map.values().iterator();
            while (it2.hasNext()) {
                it2.next().LJIIJ();
            }
            this.LJFF.clear();
            this.LJ.clear();
        }
        C1313660kI0 c1313660kI0 = this.LIZIZ;
        if (c1313660kI0 != null) {
            c1313660kI0.LJZ();
        }
        HashMap<Integer, Integer> map2 = this.LJII;
        if (map2 != null) {
            map2.clear();
        }
        C1317120kNa c1317120kNa = this.LJI;
        c1317120kNa.getClass();
        C1290750jh3.LJ(new ARunnableS120S0100000_20(c1317120kNa, 223));
    }

    public static boolean LJII(C1291290jhv c1291290jhv) {
        if (!c1291290jhv.LJII("box-shadow") && !c1291290jhv.LJII("outline-color") && !c1291290jhv.LJII("outline-style") && !c1291290jhv.LJII("outline-width")) {
            return false;
        }
        return true;
    }

    public static void LJIIIZ(SDUIBaseUI sDUIBaseUI) {
        int i = 0;
        for (SDUIBaseUI sDUIBaseUI2 : sDUIBaseUI.LJIILL()) {
            int i2 = i + 1;
            LJIIJ(sDUIBaseUI, sDUIBaseUI2, i);
            if (sDUIBaseUI2.LJJJLIIL()) {
                LJIIIZ(sDUIBaseUI2);
            }
            i = i2;
        }
    }

    public static void LJIIL(SDUIBaseUI sDUIBaseUI) {
        AbstractC1313500kHk abstractC1313500kHk = (AbstractC1313500kHk) sDUIBaseUI.LLIZ;
        SDUIBaseUI sDUIBaseUILJJIIJZLJL = sDUIBaseUI.LJJIIJZLJL();
        if (abstractC1313500kHk != null && sDUIBaseUILJJIIJZLJL != null) {
            if (!sDUIBaseUI.LJJJLIIL()) {
                SDUIBaseUI sDUIBaseUI2 = sDUIBaseUI.LL;
                SDUIBaseUI sDUIBaseUI3 = sDUIBaseUI.LLILLJJLI;
                if (sDUIBaseUI2 != null) {
                    sDUIBaseUI2.LLILLJJLI = sDUIBaseUI3;
                    if (sDUIBaseUI3 != null) {
                        sDUIBaseUI3.LL = sDUIBaseUI2;
                    }
                } else {
                    abstractC1313500kHk.LLLLLLLLL = sDUIBaseUI3;
                    if (sDUIBaseUI3 != null) {
                        sDUIBaseUI3.LL = null;
                    }
                }
                if (sDUIBaseUILJJIIJZLJL.LJJJLIIL()) {
                    abstractC1313500kHk.LJLZ(sDUIBaseUI);
                }
                sDUIBaseUI.LLILLJJLI = null;
                sDUIBaseUI.LL = null;
                sDUIBaseUI.LLIZ = null;
                return;
            }
            SDUIBaseUI sDUIBaseUILJIILJJIL = sDUIBaseUI;
            while (sDUIBaseUILJIILJJIL.LJJJLIIL() && !sDUIBaseUILJIILJJIL.LJIILL().isEmpty()) {
                sDUIBaseUILJIILJJIL = sDUIBaseUILJIILJJIL.LJIILJJIL(sDUIBaseUILJIILJJIL.LJIILL().size() - 1);
            }
            SDUIBaseUI sDUIBaseUI4 = sDUIBaseUI.LL;
            if (sDUIBaseUI4 != null) {
                sDUIBaseUI4.LLILLJJLI = sDUIBaseUILJIILJJIL.LLILLJJLI;
                SDUIBaseUI sDUIBaseUI5 = sDUIBaseUILJIILJJIL.LLILLJJLI;
                if (sDUIBaseUI5 != null) {
                    sDUIBaseUI5.LL = sDUIBaseUI4;
                }
            } else {
                SDUIBaseUI sDUIBaseUI6 = sDUIBaseUILJIILJJIL.LLILLJJLI;
                abstractC1313500kHk.LLLLLLLLL = sDUIBaseUI6;
                if (sDUIBaseUI6 != null) {
                    sDUIBaseUI6.LL = null;
                }
            }
            sDUIBaseUI.LL = null;
            for (SDUIBaseUI sDUIBaseUI7 = sDUIBaseUI.LLILLJJLI; sDUIBaseUI7 != sDUIBaseUILJIILJJIL.LLILLJJLI; sDUIBaseUI7 = sDUIBaseUI7.LLILLJJLI) {
                sDUIBaseUI7.LL.LLILLJJLI = null;
                sDUIBaseUI7.LL = null;
                abstractC1313500kHk.LJLZ(sDUIBaseUI7);
                sDUIBaseUI7.LLIZ = null;
            }
            sDUIBaseUILJIILJJIL.LLILLJJLI = null;
            sDUIBaseUI.LLIZ = null;
            sDUIBaseUILJJIIJZLJL.LJJJJZ();
        }
    }

    public final void LIZLLL(SDUIBaseUI sDUIBaseUI) {
        for (int i = 0; i < sDUIBaseUI.LJIILL().size(); i++) {
            SDUIBaseUI sDUIBaseUILJIILJJIL = sDUIBaseUI.LJIILJJIL(i);
            sDUIBaseUILJIILJJIL.LJIIJ();
            this.LJFF.remove(Integer.valueOf(sDUIBaseUILJIILJJIL.LLJJ));
            this.LJ.remove(sDUIBaseUILJIILJJIL);
            this.LIZJ.LJ(sDUIBaseUILJIILJJIL);
            LIZLLL(sDUIBaseUILJIILJJIL);
        }
    }

    public static SDUIBaseUI LJ(String str, SDUIBaseUI sDUIBaseUI) {
        if (sDUIBaseUI != null && sDUIBaseUI.LJIJ() != null && sDUIBaseUI.LJIJ().equals(str)) {
            return sDUIBaseUI;
        }
        return LJ(str, sDUIBaseUI.LJJIIJZLJL());
    }

    public static SDUIBaseUI LJFF(String str, SDUIBaseUI sDUIBaseUI) {
        SDUIBaseUI sDUIBaseUILJFF;
        String str2 = sDUIBaseUI.LLJILJILJ;
        if (str2 != null && str2.equals(str)) {
            return sDUIBaseUI;
        }
        for (SDUIBaseUI sDUIBaseUI2 : sDUIBaseUI.LJIILL()) {
            String str3 = sDUIBaseUI2.LLJILJILJ;
            if (str3 != null && str3.equals(str)) {
                return sDUIBaseUI2;
            }
            if (!sDUIBaseUI2.LJJIJIL().equals("component") && (sDUIBaseUILJFF = LJFF(str, sDUIBaseUI2)) != null) {
                return sDUIBaseUILJFF;
            }
        }
        return null;
    }

    public static SDUIBaseUI LJI(String str, SDUIBaseUI sDUIBaseUI) {
        SDUIBaseUI sDUIBaseUILJI;
        if (sDUIBaseUI.LJIJ() != null && sDUIBaseUI.LJIJ().equals(str)) {
            return sDUIBaseUI;
        }
        for (SDUIBaseUI sDUIBaseUI2 : sDUIBaseUI.LJIILL()) {
            if (sDUIBaseUI2.LJIJ() != null && sDUIBaseUI2.LJIJ().equals(str)) {
                return sDUIBaseUI2;
            }
            if (!sDUIBaseUI2.LJJIJIL().equals("component") && (sDUIBaseUILJI = LJI(str, sDUIBaseUI2)) != null) {
                return sDUIBaseUILJI;
            }
        }
        return null;
    }

    public final SDUIBaseUI LIZIZ(String str, boolean z) {
        SDUIBaseUI sDUIBaseUILIZIZ;
        C1313970kIV c1313970kIV = (C1313970kIV) ((HashMap) this.LJIIIIZZ.LIZ).get(str);
        if (c1313970kIV != null) {
            if (z) {
                sDUIBaseUILIZIZ = c1313970kIV.LIZ(this.LIZJ);
            } else {
                sDUIBaseUILIZIZ = c1313970kIV.LIZIZ(this.LIZJ);
            }
            if (sDUIBaseUILIZIZ == null) {
                return c1313970kIV.LIZIZ(this.LIZJ);
            }
            return sDUIBaseUILIZIZ;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("No BehaviorController defined for class ");
        sbLIZ.append(str);
        throw new RuntimeException(C2188811AlT.LIZIZ(sbLIZ));
    }

    public final void LJIIJJI(int i, int i2) {
        SDUIBaseUI sDUIBaseUILJJIIJZLJL;
        if (this.LJFF.size() > 0) {
            SDUIBaseUI sDUIBaseUI = this.LJFF.get(Integer.valueOf(i2));
            if (sDUIBaseUI != null) {
                if (i == -1) {
                    sDUIBaseUILJJIIJZLJL = sDUIBaseUI.LJJIIJZLJL();
                } else {
                    sDUIBaseUILJJIIJZLJL = this.LJFF.get(Integer.valueOf(i));
                }
                if (sDUIBaseUILJJIIJZLJL != null) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("UIOwner.remove.");
                    sbLIZ.append(sDUIBaseUILJJIIJZLJL.LJJIJIL());
                    sbLIZ.append(e3.d);
                    sbLIZ.append(sDUIBaseUI.LJJIJIL());
                    C2188811AlT.LIZIZ(sbLIZ);
                    LJIIL(sDUIBaseUI);
                    sDUIBaseUILJJIIJZLJL.LJJLIIJ(sDUIBaseUI);
                    sDUIBaseUI.LJJLJLI(null);
                    sDUIBaseUI.LJJZ(sDUIBaseUI.LJJIII());
                    sDUIBaseUI.LJL(sDUIBaseUI.LJJIIJ());
                    sDUIBaseUI.LJJJLIIL();
                    return;
                }
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("Trying to remove unknown ui signature: ");
                sbLIZ2.append(i2);
                throw new RuntimeException(C2188811AlT.LIZIZ(sbLIZ2));
            }
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("Trying to remove unknown ui signature: ");
            sbLIZ3.append(i2);
            throw new RuntimeException(C2188811AlT.LIZIZ(sbLIZ3));
        }
    }

    public C1313470kHh(AbstractC1317090kNX abstractC1317090kNX, C1313980kIW c1313980kIW, C1317080kNW c1317080kNW) {
        this.LIZJ = abstractC1317090kNX;
        this.LJIIIIZZ = c1313980kIW;
        new HashMap();
        this.LJII = new HashMap<>();
        this.LIZ = -1;
        C1313660kI0 c1313660kI0 = new C1313660kI0(abstractC1317090kNX, c1317080kNW);
        this.LIZIZ = c1313660kI0;
        abstractC1317090kNX.LLILZIL = c1313660kI0;
        this.LJIIIZ = true;
        this.LJIIJ = true;
        this.LJI = new C1317120kNa(abstractC1317090kNX);
        c1317080kNW.setTimingHandler(this.LJI);
    }

    public static void LJIIJ(SDUIBaseUI sDUIBaseUI, SDUIBaseUI sDUIBaseUI2, int i) {
        SDUIBaseUI sDUIBaseUI3;
        if (sDUIBaseUI.LJJJLIIL()) {
            sDUIBaseUI3 = sDUIBaseUI.LLIZ;
            if (sDUIBaseUI3 == null) {
                return;
            }
        } else {
            sDUIBaseUI3 = sDUIBaseUI;
        }
        if (i == 0) {
            AbstractC1313520kHm abstractC1313520kHm = (AbstractC1313520kHm) sDUIBaseUI3;
            if (!sDUIBaseUI.LJJJLIIL()) {
                sDUIBaseUI = null;
            }
            abstractC1313520kHm.LJLJL(sDUIBaseUI, sDUIBaseUI2);
        } else {
            SDUIBaseUI sDUIBaseUILJIILJJIL = sDUIBaseUI.LJIILJJIL(i - 1);
            while (sDUIBaseUILJIILJJIL.LJJJLIIL() && !sDUIBaseUILJIILJJIL.LJIILL().isEmpty()) {
                sDUIBaseUILJIILJJIL = sDUIBaseUILJIILJJIL.LJIILJJIL(sDUIBaseUILJIILJJIL.LJIILL().size() - 1);
            }
            ((AbstractC1313520kHm) sDUIBaseUI3).LJLJL(sDUIBaseUILJIILJJIL, sDUIBaseUI2);
        }
        if (!sDUIBaseUI2.LJJJLIIL()) {
            AbstractC1313500kHk abstractC1313500kHk = (AbstractC1313500kHk) sDUIBaseUI3;
            if (abstractC1313500kHk.LLLLLLZZ) {
                abstractC1313500kHk.LJLLL((AbstractC1313520kHm) sDUIBaseUI2);
            }
        }
    }

    public final SDUIBaseUI LIZ(SDUIBaseUI sDUIBaseUI, C1313490kHj c1313490kHj, C1291290jhv c1291290jhv) {
        if (sDUIBaseUI instanceof InterfaceC1314970kK7) {
            AbstractC1317090kNX abstractC1317090kNX = this.LIZJ;
            if (abstractC1317090kNX.LLJI == null) {
                abstractC1317090kNX.LLJI = new ArrayList();
            }
            ((ArrayList) abstractC1317090kNX.LLJI).add(sDUIBaseUI);
        }
        if (c1291290jhv != null) {
            sDUIBaseUI.LJI(c1291290jhv);
            if (c1291290jhv.LJII("transition")) {
                sDUIBaseUI.LJJJJL(c1291290jhv.LIZ);
            }
            if (c1291290jhv.LJII("animation")) {
                sDUIBaseUI.LJJLJ(c1291290jhv.LIZ("animation"));
            }
        }
        if (c1313490kHj != null) {
            return c1313490kHj;
        }
        return sDUIBaseUI;
    }

    public final void LJIIIIZZ(int i, int i2, int i3) {
        if (this.LJFF.size() > 0) {
            if (this.LJFF.get(Integer.valueOf(i)) != null) {
                SDUIBaseUI sDUIBaseUI = this.LJFF.get(Integer.valueOf(i2));
                if (sDUIBaseUI != null) {
                    this.LIZJ.getClass();
                    SDUIBaseUI sDUIBaseUI2 = this.LJFF.get(Integer.valueOf(i));
                    sDUIBaseUI2.getClass();
                    if (i3 == -1) {
                        i3 = sDUIBaseUI2.LJIILL().size();
                    }
                    sDUIBaseUI2.LJJJJLL(sDUIBaseUI, i3);
                    LJIIJ(sDUIBaseUI2, sDUIBaseUI, i3);
                    sDUIBaseUI.LJJJLIIL();
                    if (sDUIBaseUI.LJJJLIIL()) {
                        LJIIIZ(sDUIBaseUI);
                        sDUIBaseUI.LJJLIL();
                        sDUIBaseUI.LJJJJZ();
                        return;
                    }
                    return;
                }
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Insertion (new) failed due to unknown child signature: ");
                sbLIZ.append(i2);
                throw new RuntimeException(C2188811AlT.LIZIZ(sbLIZ));
            }
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("Insertion (new) failed due to unknown parent signature: ");
            sbLIZ2.append(i);
            throw new RuntimeException(C2188811AlT.LIZIZ(sbLIZ2));
        }
    }

    public final void LJIILJJIL(int i, String str, C1291290jhv c1291290jhv) {
        if (str.equals("component") && c1291290jhv.LJII("ComponentID")) {
            this.LJII.put(Integer.valueOf(c1291290jhv.LJFF("ComponentID", -1)), Integer.valueOf(i));
        }
    }

    public final void LJIILL(int i, C1291290jhv c1291290jhv, Map map) {
        boolean z;
        InterfaceC1298200jt4 interfaceC1298200jt4;
        int iLJIJJ;
        C1313490kHj c1313490kHj;
        if (C1290750jh3.LIZ()) {
            SDUIBaseUI sDUIBaseUI = this.LJFF.get(Integer.valueOf(i));
            if (sDUIBaseUI != null) {
                LJIILJJIL(i, sDUIBaseUI.LJJIJIL(), c1291290jhv);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("UIOwner.updateProps.");
                sbLIZ.append(sDUIBaseUI.LJJIJIL());
                C2188811AlT.LIZIZ(sbLIZ);
                if (map != null) {
                    sDUIBaseUI.LJJLL(map);
                }
                if (c1291290jhv != null) {
                    int i2 = 0;
                    if (sDUIBaseUI.LJJJLIIL()) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        SDUIBaseUI sDUIBaseUI2 = this.LJFF.get(Integer.valueOf(i));
                        if (sDUIBaseUI2 != null) {
                            SDUIBaseUI sDUIBaseUILJJIIJZLJL = sDUIBaseUI2.LJJIIJZLJL();
                            C1291290jhv c1291290jhv2 = new C1291290jhv(sDUIBaseUI2.LJJIIZI());
                            ArrayList<SDUIBaseUI> arrayList = new ArrayList(sDUIBaseUI2.LJIILL());
                            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                            sbLIZ2.append("UIOwner.updateFlatten.");
                            sbLIZ2.append(sDUIBaseUI2.LJJIJIL());
                            C2188811AlT.LIZIZ(sbLIZ2);
                            if (sDUIBaseUILJJIIJZLJL != null) {
                                iLJIJJ = sDUIBaseUILJJIIJZLJL.LJIJJ(sDUIBaseUI2);
                                LJIIL(sDUIBaseUI2);
                                sDUIBaseUILJJIIJZLJL.LJJLIIJ(sDUIBaseUI2);
                            } else {
                                iLJIJJ = 0;
                            }
                            if (!sDUIBaseUI2.LJJJLIIL()) {
                                Iterator it2 = arrayList.iterator();
                                while (it2.hasNext()) {
                                    LJIIL((SDUIBaseUI) it2.next());
                                }
                            }
                            int size = sDUIBaseUI2.LJIILL().size();
                            while (true) {
                                size--;
                                if (size < 0) {
                                    break;
                                } else {
                                    sDUIBaseUI2.LJJLIIJ(sDUIBaseUI2.LJIILJJIL(size));
                                }
                            }
                            SDUIBaseUI sDUIBaseUILIZIZ = LIZIZ(sDUIBaseUI2.LJJIJIL(), false);
                            sDUIBaseUILIZIZ.LJJZZIII(sDUIBaseUI2.LLJJ, sDUIBaseUI2.LJJIJIL());
                            if (LJII(c1291290jhv2)) {
                                c1313490kHj = new C1313490kHj(this.LIZJ, sDUIBaseUILIZIZ);
                            } else {
                                c1313490kHj = null;
                            }
                            sDUIBaseUILIZIZ.LJLJI(c1291290jhv2);
                            LIZ(sDUIBaseUILIZIZ, c1313490kHj, c1291290jhv2);
                            this.LJFF.put(Integer.valueOf(sDUIBaseUI2.LLJJ), sDUIBaseUILIZIZ);
                            if (this.LJ.contains(sDUIBaseUI2)) {
                                this.LJ.remove(sDUIBaseUI2);
                                this.LJ.add(sDUIBaseUILIZIZ);
                            }
                            if (sDUIBaseUILJJIIJZLJL != null) {
                                sDUIBaseUILJJIIJZLJL.LJJJJLL(sDUIBaseUILIZIZ, iLJIJJ);
                                LJIIJ(sDUIBaseUILJJIIJZLJL, sDUIBaseUILIZIZ, iLJIJJ);
                            }
                            for (SDUIBaseUI sDUIBaseUI3 : arrayList) {
                                sDUIBaseUI3.LJJLJLI(null);
                                sDUIBaseUI3.LJJZ(sDUIBaseUI3.LJJIII());
                                sDUIBaseUI3.LJL(sDUIBaseUI3.LJJIIJ());
                                sDUIBaseUILIZIZ.LJJJJLL(sDUIBaseUI3, i2);
                                i2++;
                            }
                            LJIIIZ(sDUIBaseUILIZIZ);
                            sDUIBaseUILIZIZ.LJLILLLLZI(sDUIBaseUI2);
                            sDUIBaseUILIZIZ.LLLLILI = sDUIBaseUI2.LLLLILI;
                            Point point = sDUIBaseUILIZIZ.LLLFF;
                            Point point2 = sDUIBaseUI2.LLLFF;
                            point.set(point2.x, point2.y);
                            Point point3 = sDUIBaseUILIZIZ.LLLF;
                            Point point4 = sDUIBaseUI2.LLLF;
                            point3.set(point4.x, point4.y);
                            sDUIBaseUILIZIZ.LJJLL(sDUIBaseUI2.LLJIJIL);
                            sDUIBaseUILIZIZ.LJJJLZIJ();
                            ((AbstractC1313520kHm) sDUIBaseUILIZIZ).LJLJJLL();
                            if (sDUIBaseUILIZIZ instanceof AbstractC1313500kHk) {
                                ((AbstractC1313500kHk) sDUIBaseUILIZIZ).LJLLLL();
                            }
                            sDUIBaseUILIZIZ.LJJJJZ();
                            sDUIBaseUI2.LJIIJ();
                        }
                        sDUIBaseUI = this.LJFF.get(Integer.valueOf(i));
                    }
                    if (c1291290jhv.LJII("transition")) {
                        if (sDUIBaseUI instanceof C1313490kHj) {
                            ((C1313490kHj) sDUIBaseUI).LLLLZI.LJJJJL(c1291290jhv.LIZ);
                        } else {
                            sDUIBaseUI.LJJJJL(c1291290jhv.LIZ);
                        }
                    }
                    if (c1291290jhv.LJII("animation")) {
                        if (sDUIBaseUI instanceof C1313490kHj) {
                            ((C1313490kHj) sDUIBaseUI).LLLLZI.LJJLJ(c1291290jhv.LIZ("animation"));
                        } else {
                            sDUIBaseUI.LJJLJ(c1291290jhv.LIZ("animation"));
                        }
                    }
                    if (LJII(c1291290jhv) && ((c1291290jhv.LIZ("box-shadow") != null || c1291290jhv.LJFF("outline-style", -1) != -1) && !(sDUIBaseUI instanceof C1313490kHj) && (interfaceC1298200jt4 = sDUIBaseUI.LLILZLL) != null && !(interfaceC1298200jt4 instanceof C1313490kHj))) {
                        SDUIBaseUI sDUIBaseUILJJIIJZLJL2 = sDUIBaseUI.LJJIIJZLJL();
                        int iLJIJJ2 = sDUIBaseUILJJIIJZLJL2.LJIJJ(sDUIBaseUI);
                        LJIIJJI(sDUIBaseUILJJIIJZLJL2.LLJJ, sDUIBaseUI.LLJJ);
                        this.LIZJ.LJ(sDUIBaseUI);
                        C1313490kHj c1313490kHj2 = new C1313490kHj(this.LIZJ, sDUIBaseUI);
                        this.LJFF.put(Integer.valueOf(sDUIBaseUI.LLJJ), c1313490kHj2);
                        LJIIIIZZ(sDUIBaseUILJJIIJZLJL2.LLJJ, c1313490kHj2.LLJJ, iLJIJJ2);
                    }
                    sDUIBaseUI.LJLJI(c1291290jhv);
                    sDUIBaseUI.LJI(c1291290jhv);
                    if (sDUIBaseUI.LJJIIJZLJL() != null) {
                        sDUIBaseUI.LJJIIJZLJL();
                        this.LIZJ.getClass();
                        return;
                    }
                    return;
                }
                return;
            }
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("update ");
            sbLIZ3.append(i);
            sbLIZ3.append("failed, can not find it");
            throw new RuntimeException(C2188811AlT.LIZIZ(sbLIZ3));
        }
        throw new AssertionError("Expected to run on UI thread!");
    }

    public final SDUIBaseUI LIZJ(int i, String str, Map<String, C1297940jse> map, boolean z) {
        SDUIBaseUI sDUIBaseUILIZIZ;
        if (this.LIZ < 0 && str.equals("page")) {
            sDUIBaseUILIZIZ = this.LIZIZ;
            this.LIZ = i;
        } else {
            sDUIBaseUILIZIZ = LIZIZ(str, z);
            sDUIBaseUILIZIZ.LJJLL(map);
        }
        sDUIBaseUILIZIZ.LJJZZIII(i, str);
        return sDUIBaseUILIZIZ;
    }
}
