package X;

import Y.ARunnableS101S0200000_32;
import android.animation.Animator;
import android.util.SparseArray;
import android.view.ViewGroup;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.settings.PinCardRefactorSettings;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.184D, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C184D extends AbstractC212220183e<ViewGroup, List<? extends C184F>> implements C181P {
    public C184F LJ;
    public int LJFF;
    public InterfaceC19340710lZ LJI;
    public final C19967513Ar<C187I> LJII;
    public final SparseArray<C187I> LJIIIIZZ;
    public boolean LJIIIZ;
    public float LJIIJ;
    public C212222183g LJIIJJI;

    @Override // X.C181P
    public final Map<String, String> LIZ() {
        return null;
    }

    @Override // X.C181P
    public final Map<String, String> LIZIZ() {
        return LJIIJJI(true);
    }

    public C184D(ViewGroup viewGroup) {
        super(viewGroup, "atmosphere_layout");
        this.LJI = new C19340610lY();
        this.LJII = new C19967513Ar<>(Collections.synchronizedList(new LinkedList()));
        this.LJIIIIZZ = new SparseArray<>();
        this.LJIIJ = C418440Gaw.LIZIZ(82);
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x012a A[Catch: s -> 0x0164, TryCatch #0 {s -> 0x0164, blocks: (B:88:0x0112, B:90:0x0121, B:97:0x0134, B:98:0x0157, B:101:0x0160, B:96:0x012a), top: B:107:0x0112 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.Map<java.lang.String, java.lang.String> LJIIJJI(boolean r13) {
        /*
            Method dump skipped, instruction units count: 366
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C184D.LJIIJJI(boolean):java.util.Map");
    }

    public final C187I LJIIL(int i) {
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        if (i != 5) {
                            if (i >= 100) {
                                C187M c187m = new C187M(i, (ViewGroup) this.LIZ);
                                c187m.LJI = this.LJIIJ;
                                this.LJIIIIZZ.put(i, c187m);
                                this.LJII.add(c187m);
                                return c187m;
                            }
                            return null;
                        }
                        C187S c187s = new C187S(i, (ViewGroup) this.LIZ);
                        this.LJIIIIZZ.put(5, c187s);
                        this.LJII.add(c187s);
                        return c187s;
                    }
                    C187R c187r = new C187R(i, (ViewGroup) this.LIZ);
                    c187r.LJI = this.LJIIJ;
                    this.LJIIIIZZ.put(4, c187r);
                    this.LJII.add(c187r);
                    return c187r;
                }
                C187Q c187q = new C187Q(i, (ViewGroup) this.LIZ);
                c187q.LJI = this.LJIIJ;
                this.LJIIIIZZ.put(3, c187q);
                this.LJII.add(c187q);
                return c187q;
            }
            C187P c187p = new C187P(i, (ViewGroup) this.LIZ);
            c187p.LJI = this.LJIIJ;
            this.LJIIIIZZ.put(2, c187p);
            this.LJII.add(c187p);
            return c187p;
        }
        C187O c187o = new C187O(i, (ViewGroup) this.LIZ);
        c187o.LJI = this.LJIIJ;
        this.LJIIIIZZ.put(1, c187o);
        this.LJII.add(c187o);
        return c187o;
    }

    public final void LJIILIIL(Function1<? super Integer, Boolean> function1) {
        SparseArray<C187I> sparseArray = this.LJIIIIZZ;
        int size = sparseArray.size();
        for (int i = 0; i < size; i++) {
            int iKeyAt = sparseArray.keyAt(i);
            C187I c187iValueAt = sparseArray.valueAt(i);
            if (function1 == null || !function1.invoke(Integer.valueOf(iKeyAt)).booleanValue()) {
                c187iValueAt.LJIJI(false, null);
                C184F c184f = this.LJ;
                if (c184f != null && c184f.LIZLLL() == iKeyAt) {
                    C212222183g c212222183g = this.LJIIJJI;
                    if (c212222183g != null) {
                        c212222183g.LIZ();
                    }
                    this.LJ = null;
                }
            }
        }
    }

    public final void LJIILL(List<? extends C184F> list) {
        if (!PinCardRefactorSettings.LIZ().atmosphereEnable) {
            return;
        }
        LJIILIIL(null);
        this.LJII.clear();
        this.LJIIIIZZ.clear();
        for (C184F c184f : list) {
            C187I c187iLJIIL = this.LJIIIIZZ.get(c184f.LIZLLL());
            if (c187iLJIIL != null || (c187iLJIIL = LJIIL(c184f.LIZLLL())) != null) {
                c187iLJIIL.LJFF = c184f;
            }
        }
        this.LJFF = 0;
        this.LJ = null;
        this.LJIIIZ = false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final C212236183u LJIILLIIL(List<Animator> list, Function1<? super Integer, Boolean> function1) {
        int i;
        C212222183g c212222183g;
        C212222183g c212222183g2;
        this.LJIIIZ = true;
        C212236183u c212236183u = new C212236183u(0);
        if (!PinCardRefactorSettings.LIZ().atmosphereEnable) {
            return c212236183u;
        }
        Iterator<C187I> it2 = this.LJII.iterator();
        while (true) {
            if (it2.hasNext()) {
                C187I next = it2.next();
                if (next.LJFF == null || (function1 != null && function1.invoke(Integer.valueOf(next.LJ)).booleanValue())) {
                    C2341109Fh c2341109Fh = C2341109Fh.LIZ;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("showAtmosphereTagAsPriority getData is null, type = ");
                    sbLIZ.append(next.LJ);
                    String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                    c2341109Fh.getClass();
                    C2341109Fh.LJII(strLIZIZ);
                    next.LJIJI(false, null);
                    C212222183g c212222183g3 = this.LJIIJJI;
                    if (c212222183g3 != null) {
                        c212222183g3.LIZ();
                    }
                    this.LJ = null;
                } else {
                    C187N c187nLJIL = next.LJIL(0L, list);
                    C2341109Fh c2341109Fh2 = C2341109Fh.LIZ;
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("showAtmosphereTagAsPriority type = ");
                    sbLIZ2.append(next.LJ);
                    sbLIZ2.append(",needShow = ");
                    sbLIZ2.append(c187nLJIL.LIZ);
                    sbLIZ2.append(" ,showChanged = ");
                    sbLIZ2.append(c187nLJIL.LIZIZ);
                    String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
                    c2341109Fh2.getClass();
                    C2341109Fh.LJ(strLIZIZ2);
                    if (c187nLJIL.LIZ) {
                        if (this.LJ != null && (c212222183g2 = this.LJIIJJI) != null) {
                            c212222183g2.LIZ();
                        }
                        this.LJ = next.LJFF;
                        if (c187nLJIL.LIZIZ) {
                            this.LJFF++;
                            c212236183u.LIZIZ = true;
                            c212236183u.LIZJ = LJIIJJI(true);
                        }
                        i = next.LJ;
                        c212236183u.LIZ = true;
                        if (this.LJ != null && (c212222183g = this.LJIIJJI) != null) {
                            c212222183g.LIZIZ(c212236183u);
                        }
                        if (next instanceof C184I) {
                            long jLIZJ = ((C184I) next).LIZJ();
                            if (jLIZJ > 0) {
                                HandlerHook.viewPostDelay(this.LIZ, new ARunnableS101S0200000_32(this, next, 48), jLIZJ);
                            }
                        }
                    }
                }
            } else {
                i = 0;
                break;
            }
        }
        SparseArray<C187I> sparseArray = this.LJIIIIZZ;
        int size = sparseArray.size();
        for (int i2 = 0; i2 < size; i2++) {
            int iKeyAt = sparseArray.keyAt(i2);
            C187I c187iValueAt = sparseArray.valueAt(i2);
            if (iKeyAt != i) {
                c187iValueAt.LJIJI(false, null);
            }
        }
        return c212236183u;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0107 A[PHI: r4
      0x0107: PHI (r4v8 X.187I) = (r4v14 X.187I), (r4v15 X.187I) binds: [B:14:0x002f, B:16:0x0035] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.C212236183u LJIILJJIL(X.C184D r11, int r12, com.ss.android.ugc.aweme.ecommercelive.common.infra.data.AtmosphereTag r13, boolean r14, long r15, boolean r17, java.util.List r18, int r19) {
        /*
            Method dump skipped, instruction units count: 303
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C184D.LJIILJJIL(X.184D, int, com.ss.android.ugc.aweme.ecommercelive.common.infra.data.AtmosphereTag, boolean, long, boolean, java.util.List, int):X.183u");
    }
}
