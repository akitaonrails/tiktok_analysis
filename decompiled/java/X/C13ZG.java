package X;

import android.os.Trace;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import e0.s0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.13ZG, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C13ZG {
    public final Set<InterfaceC20035313aJ> LIZ;
    public final C19968013Aw<C20034913aF> LIZIZ;
    public C19968013Aw<C20034913aF> LIZJ;
    public final C19968013Aw<Object> LIZLLL;
    public final C19968013Aw<Function0<Unit>> LJ;
    public C19994113Kx<InterfaceC20035413aK> LJFF;
    public final List<Object> LJI;
    public final C1688450u2V LJII;
    public final C1688450u2V LJIIIIZZ;
    public ArrayList LJIIIZ;

    public static final void LIZLLL(C20030013Ys c20030013Ys) {
    }

    public static final void LJIIIZ(C20030013Ys c20030013Ys) {
    }

    public final void LIZ() {
        if (!this.LIZ.isEmpty()) {
            Trace.beginSection("Compose:abandons");
            try {
                Iterator<InterfaceC20035313aJ> it2 = this.LIZ.iterator();
                while (it2.hasNext()) {
                    InterfaceC20035313aJ next = it2.next();
                    it2.remove();
                    next.LJ();
                }
                Trace.endSection();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                Trace.endSection();
                throw th;
            }
        }
    }

    public final void LIZIZ() {
        LJ(Integer.MIN_VALUE);
        if (this.LIZLLL.LLILLL != 0) {
            Trace.beginSection("Compose:onForgotten");
            try {
                C19994113Kx<InterfaceC20035413aK> c19994113Kx = this.LJFF;
                for (int i = this.LIZLLL.LLILLL - 1; -1 < i; i--) {
                    Object obj = this.LIZLLL.LL[i];
                    if (obj instanceof C20034913aF) {
                        InterfaceC20035313aJ interfaceC20035313aJ = ((C20034913aF) obj).LIZ;
                        this.LIZ.remove(interfaceC20035313aJ);
                        interfaceC20035313aJ.LIZLLL();
                    }
                    if (obj instanceof InterfaceC20035413aK) {
                        if (c19994113Kx == null || !c19994113Kx.LIZ((InterfaceC20035413aK) obj)) {
                            ((InterfaceC20035413aK) obj).LJIIJJI();
                        } else {
                            ((InterfaceC20035413aK) obj).onRelease();
                        }
                    }
                }
                Trace.endSection();
            } finally {
            }
        }
        if (this.LIZIZ.LLILLL != 0) {
            Trace.beginSection("Compose:onRemembered");
            try {
                C19968013Aw<C20034913aF> c19968013Aw = this.LIZIZ;
                C20034913aF[] c20034913aFArr = c19968013Aw.LL;
                int i2 = c19968013Aw.LLILLL;
                for (int i3 = 0; i3 < i2; i3++) {
                    InterfaceC20035313aJ interfaceC20035313aJ2 = c20034913aFArr[i3].LIZ;
                    this.LIZ.remove(interfaceC20035313aJ2);
                    interfaceC20035313aJ2.LJFF();
                }
                Trace.endSection();
            } finally {
            }
        }
    }

    public final void LIZJ() {
        if (this.LJ.LLILLL != 0) {
            Trace.beginSection("Compose:sideeffects");
            try {
                C19968013Aw<Function0<Unit>> c19968013Aw = this.LJ;
                Function0<Unit>[] function0Arr = c19968013Aw.LL;
                int i = c19968013Aw.LLILLL;
                for (int i2 = 0; i2 < i; i2++) {
                    function0Arr[i2].invoke();
                }
                this.LJ.LJIIIZ();
                Trace.endSection();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                Trace.endSection();
                throw th;
            }
        }
    }

    public C13ZG(s0 s0Var) {
        this.LIZ = s0Var;
        C19968013Aw<C20034913aF> c19968013Aw = new C19968013Aw<>(new C20034913aF[16]);
        this.LIZIZ = c19968013Aw;
        this.LIZJ = c19968013Aw;
        this.LIZLLL = new C19968013Aw<>(new Object[16]);
        this.LJ = new C19968013Aw<>(new Function0[16]);
        this.LJI = new ArrayList();
        this.LJII = new C1688450u2V();
        this.LJIIIIZZ = new C1688450u2V();
    }

    public final void LJ(int i) {
        if (!((ArrayList) this.LJI).isEmpty()) {
            List listLJIILJJIL = null;
            int i2 = 0;
            C1688450u2V c1688450u2V = null;
            C1688450u2V c1688450u2V2 = null;
            int i3 = 0;
            while (true) {
                C1688450u2V c1688450u2V3 = this.LJIIIIZZ;
                if (i3 >= c1688450u2V3.LIZIZ) {
                    break;
                }
                if (i <= c1688450u2V3.LIZ(i3)) {
                    Object objRemove = ListProtector.remove(this.LJI, i3);
                    int iLJFF = this.LJIIIIZZ.LJFF(i3);
                    int iLJFF2 = this.LJII.LJFF(i3);
                    if (listLJIILJJIL == null) {
                        listLJIILJJIL = C1697810uHb.LJIILJJIL(objRemove);
                        c1688450u2V = new C1688450u2V();
                        c1688450u2V.LIZJ(iLJFF);
                        c1688450u2V2 = new C1688450u2V();
                        c1688450u2V2.LIZJ(iLJFF2);
                    } else {
                        listLJIILJJIL.add(objRemove);
                        c1688450u2V.LIZJ(iLJFF);
                        c1688450u2V2.LIZJ(iLJFF2);
                    }
                } else {
                    i3++;
                }
            }
            if (listLJIILJJIL != null) {
                int size = listLJIILJJIL.size() - 1;
                while (i2 < size) {
                    int i4 = i2 + 1;
                    int size2 = listLJIILJJIL.size();
                    for (int i5 = i4; i5 < size2; i5++) {
                        int iLIZ = c1688450u2V.LIZ(i2);
                        int iLIZ2 = c1688450u2V.LIZ(i5);
                        if (iLIZ < iLIZ2 || (iLIZ2 == iLIZ && c1688450u2V2.LIZ(i2) < c1688450u2V2.LIZ(i5))) {
                            Object obj = ListProtector.get(listLJIILJJIL, i2);
                            ListProtector.set(listLJIILJJIL, i2, ListProtector.get(listLJIILJJIL, i5));
                            ListProtector.set(listLJIILJJIL, i5, obj);
                            int iLIZ3 = c1688450u2V2.LIZ(i2);
                            c1688450u2V2.LJI(i2, c1688450u2V2.LIZ(i5));
                            c1688450u2V2.LJI(i5, iLIZ3);
                            int iLIZ4 = c1688450u2V.LIZ(i2);
                            c1688450u2V.LJI(i2, c1688450u2V.LIZ(i5));
                            c1688450u2V.LJI(i5, iLIZ4);
                        }
                    }
                    i2 = i4;
                }
                C19968013Aw<Object> c19968013Aw = this.LIZLLL;
                c19968013Aw.LJFF(c19968013Aw.LLILLL, listLJIILJJIL);
            }
        }
    }

    public final void LJII(C20034913aF c20034913aF) {
        this.LIZJ.LIZLLL(c20034913aF);
    }

    public final void LJIIIIZZ(Function0<Unit> function0) {
        this.LJ.LIZLLL(function0);
    }

    public final void LJI(InterfaceC20035413aK interfaceC20035413aK, int i) {
        C19994113Kx<InterfaceC20035413aK> c19994113KxLIZ = this.LJFF;
        if (c19994113KxLIZ == null) {
            c19994113KxLIZ = C13X4.LIZ();
            this.LJFF = c19994113KxLIZ;
        }
        c19994113KxLIZ.LJIIJ(interfaceC20035413aK);
        LJFF(i, -1, -1, interfaceC20035413aK);
    }

    public final void LJFF(int i, int i2, int i3, Object obj) {
        LJ(i);
        if (i3 >= 0 && i3 < i) {
            ((ArrayList) this.LJI).add(obj);
            this.LJII.LIZJ(i2);
            this.LJIIIIZZ.LIZJ(i3);
            return;
        }
        this.LIZLLL.LIZLLL(obj);
    }
}
