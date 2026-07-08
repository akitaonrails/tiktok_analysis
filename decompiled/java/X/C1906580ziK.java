package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.SAFExtensionKt;
import java.util.LinkedList;
import java.util.ListIterator;

/* JADX INFO: renamed from: X.0ziK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1906580ziK {
    public static boolean LIZ;
    public static long LIZIZ;
    public static final C01GW LIZJ = C452501pT.LIZIZ(new C2180261AUm());

    public static AbstractC1906590ziL LIZJ() {
        return (AbstractC1906590ziL) LIZJ.getValue();
    }

    public static boolean LIZ() {
        AbstractC1387200mCc abstractC1387200mCcLIZIZ = LIZIZ();
        return (abstractC1387200mCcLIZIZ != null ? abstractC1387200mCcLIZIZ.LIZ : null) instanceof InterfaceC1711206n0;
    }

    public static AbstractC1387200mCc LIZIZ() {
        return LIZJ().LJIILL();
    }

    public static AbstractC1387200mCc LIZLLL() {
        AbstractC1387200mCc abstractC1387200mCc;
        LinkedList<AbstractC1387200mCc> linkedListLJIIZILJ = LIZJ().LJIIZILJ();
        synchronized (linkedListLJIIZILJ) {
            try {
                abstractC1387200mCc = (AbstractC1387200mCc) C13LP.LJJJLZIJ(linkedListLJIIZILJ.size() - 2, linkedListLJIIZILJ);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return abstractC1387200mCc;
    }

    public static AbstractC1387200mCc LJ() {
        AbstractC1387200mCc abstractC1387200mCc;
        LinkedList<AbstractC1387200mCc> linkedListLJIIZILJ = LIZJ().LJIIZILJ();
        synchronized (linkedListLJIIZILJ) {
            try {
                abstractC1387200mCc = (AbstractC1387200mCc) C13LP.LJJLIIIJL(linkedListLJIIZILJ);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return abstractC1387200mCc;
    }

    public static AbstractC1387200mCc LJFF() {
        AbstractC1387200mCc abstractC1387200mCcPrevious;
        AbstractC1387200mCc abstractC1387200mCc;
        LinkedList<AbstractC1387200mCc> linkedListLJIIZILJ = LIZJ().LJIIZILJ();
        synchronized (linkedListLJIIZILJ) {
            try {
                ListIterator<AbstractC1387200mCc> listIterator = linkedListLJIIZILJ.listIterator(linkedListLJIIZILJ.size());
                while (true) {
                    if (!listIterator.hasPrevious()) {
                        abstractC1387200mCcPrevious = null;
                        break;
                    }
                    abstractC1387200mCcPrevious = listIterator.previous();
                    AbstractC1387200mCc abstractC1387200mCc2 = abstractC1387200mCcPrevious;
                    if (abstractC1387200mCc2 instanceof C1397950mTx) {
                        if (!((C1397950mTx) abstractC1387200mCc2).LIZLLL.isFinishing() && !((C1397950mTx) abstractC1387200mCc2).LIZLLL.isDestroyed()) {
                            break;
                        }
                    } else if (abstractC1387200mCc2 instanceof C1844400y62) {
                        InterfaceC214902198i interfaceC214902198i = ((C1844400y62) abstractC1387200mCc2).LIZLLL;
                        if (!SAFExtensionKt.LJIIZILJ(interfaceC214902198i) && !interfaceC214902198i.SL()) {
                            break;
                        }
                    } else {
                        if (!(abstractC1387200mCc2 instanceof C198S)) {
                            throw new C1954807lC();
                        }
                        if (!((C198S) abstractC1387200mCc2).LIZLLL.mViewDestroyed) {
                            break;
                        }
                    }
                }
                abstractC1387200mCc = abstractC1387200mCcPrevious;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return abstractC1387200mCc;
    }

    public static boolean LJI() {
        return LIZJ().LJIILLIIL();
    }

    public static AbstractC1387200mCc[] LJII() {
        AbstractC1387200mCc[] abstractC1387200mCcArr;
        LinkedList<AbstractC1387200mCc> linkedListLJIIZILJ = LIZJ().LJIIZILJ();
        synchronized (linkedListLJIIZILJ) {
            try {
                abstractC1387200mCcArr = (AbstractC1387200mCc[]) linkedListLJIIZILJ.toArray(new AbstractC1387200mCc[0]);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return abstractC1387200mCcArr;
    }
}
