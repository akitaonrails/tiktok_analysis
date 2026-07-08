package X;

import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: X.0PVt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C646070PVt {
    public static final CopyOnWriteArrayList<CopyOnWriteArrayList<C646080PVu>> LIZ = new CopyOnWriteArrayList<>();
    public static final ConcurrentHashMap<Integer, C646080PVu> LIZIZ = new ConcurrentHashMap<>();
    public static C11JF LIZJ;

    /* JADX WARN: Removed duplicated region for block: B:24:0x0053  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.C646080PVu LIZLLL() {
        /*
            r5 = 0
            java.util.concurrent.CopyOnWriteArrayList<java.util.concurrent.CopyOnWriteArrayList<X.0PVu>> r1 = X.C646070PVt.LIZ     // Catch: java.lang.IndexOutOfBoundsException -> L57
            int r0 = r1.size()     // Catch: java.lang.IndexOutOfBoundsException -> L57
            java.util.ListIterator r4 = r1.listIterator(r0)     // Catch: java.lang.IndexOutOfBoundsException -> L57
        Lb:
            boolean r0 = r4.hasPrevious()     // Catch: java.lang.IndexOutOfBoundsException -> L57
            if (r0 == 0) goto L56
            java.lang.Object r1 = r4.previous()     // Catch: java.lang.IndexOutOfBoundsException -> L57
            java.util.concurrent.CopyOnWriteArrayList r1 = (java.util.concurrent.CopyOnWriteArrayList) r1     // Catch: java.lang.IndexOutOfBoundsException -> L57
            int r0 = r1.size()     // Catch: java.lang.IndexOutOfBoundsException -> L57
            java.util.ListIterator r3 = r1.listIterator(r0)     // Catch: java.lang.IndexOutOfBoundsException -> L57
        L1f:
            boolean r0 = r3.hasPrevious()     // Catch: java.lang.IndexOutOfBoundsException -> L57
            if (r0 == 0) goto Lb
            java.lang.Object r2 = r3.previous()     // Catch: java.lang.IndexOutOfBoundsException -> L57
            X.0PVu r2 = (X.C646080PVu) r2     // Catch: java.lang.IndexOutOfBoundsException -> L57
            java.lang.ref.WeakReference<X.0PE2> r0 = r2.LIZIZ     // Catch: java.lang.IndexOutOfBoundsException -> L57
            java.lang.Object r1 = r0.get()     // Catch: java.lang.IndexOutOfBoundsException -> L57
            boolean r0 = r1 instanceof androidx.fragment.app.Fragment     // Catch: java.lang.IndexOutOfBoundsException -> L57
            if (r0 == 0) goto L53
            androidx.fragment.app.Fragment r1 = (androidx.fragment.app.Fragment) r1     // Catch: java.lang.IndexOutOfBoundsException -> L57
            if (r1 == 0) goto L53
            boolean r0 = X.C651310Pgf.LIZ(r1)     // Catch: java.lang.IndexOutOfBoundsException -> L57
            r1 = 1
            if (r0 != r1) goto L53
        L40:
            boolean r0 = X.C07E8.LIZ()     // Catch: java.lang.IndexOutOfBoundsException -> L57
            if (r0 == 0) goto L50
            boolean r0 = r2.LIZJ()     // Catch: java.lang.IndexOutOfBoundsException -> L57
            if (r0 == 0) goto L4d
            goto L55
        L4d:
            if (r1 != 0) goto L1f
            return r2
        L50:
            if (r1 != 0) goto L1f
            return r2
        L53:
            r1 = 0
            goto L40
        L55:
            return r2
        L56:
            return r5
        L57:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C646070PVt.LIZLLL():X.0PVu");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void LJ(C0PE2 c0pe2) {
        Fragment fragment;
        Bundle arguments;
        int iHashCode = c0pe2.hashCode();
        ConcurrentHashMap<Integer, C646080PVu> concurrentHashMap = LIZIZ;
        C646080PVu c646080PVu = concurrentHashMap.get(Integer.valueOf(iHashCode));
        if (c646080PVu == null) {
            c646080PVu = new C646080PVu(iHashCode, new WeakReference(c0pe2));
        }
        CopyOnWriteArrayList<CopyOnWriteArrayList<C646080PVu>> copyOnWriteArrayList = LIZ;
        if (copyOnWriteArrayList.isEmpty() || ((c0pe2 instanceof Fragment) && (fragment = (Fragment) c0pe2) != null && (arguments = fragment.getArguments()) != null && arguments.getBoolean("in_single_stack"))) {
            CopyOnWriteArrayList<C646080PVu> copyOnWriteArrayList2 = new CopyOnWriteArrayList<>();
            copyOnWriteArrayList2.add(c646080PVu);
            copyOnWriteArrayList.add(copyOnWriteArrayList2);
            concurrentHashMap.put(Integer.valueOf(iHashCode), c646080PVu);
            return;
        }
        List arrayList = (CopyOnWriteArrayList) C13LP.LJJLIIIJL(copyOnWriteArrayList);
        if (arrayList == null) {
            arrayList = new ArrayList();
        }
        arrayList.add(c646080PVu);
        concurrentHashMap.put(Integer.valueOf(iHashCode), c646080PVu);
    }

    public static void LJI(int i) {
        CopyOnWriteArrayList<CopyOnWriteArrayList<C646080PVu>> copyOnWriteArrayList = LIZ;
        if (copyOnWriteArrayList.isEmpty()) {
            return;
        }
        for (CopyOnWriteArrayList<C646080PVu> copyOnWriteArrayList2 : copyOnWriteArrayList) {
            for (C646080PVu c646080PVu : copyOnWriteArrayList2) {
                if (c646080PVu.LIZ == i) {
                    copyOnWriteArrayList2.remove(c646080PVu);
                    LIZIZ.remove(Integer.valueOf(i));
                }
            }
            if (copyOnWriteArrayList2.isEmpty()) {
                LIZ.remove(copyOnWriteArrayList2);
            }
        }
    }

    public static C646080PVu LIZ(WeakReference weakReference, WeakReference weakReference2) {
        C646080PVu c646080PVuLIZJ;
        Fragment fragment;
        Object obj = weakReference2.get();
        String string = null;
        if (obj != null) {
            c646080PVuLIZJ = LIZJ(obj.hashCode(), weakReference2);
            if (c646080PVuLIZJ != null && (fragment = (Fragment) weakReference.get()) != null) {
                Fragment parentFragment = fragment.getParentFragment();
                if (parentFragment != null) {
                    string = Integer.valueOf(parentFragment.hashCode()).toString();
                }
                c646080PVuLIZJ.LIZLLL.put(String.valueOf(fragment.hashCode()), new C646090PVv(string, new WeakReference(fragment)));
            }
        } else {
            c646080PVuLIZJ = null;
        }
        if (C07E8.LIZ() && !((Boolean) C07E6.LIZIZ.getValue()).booleanValue() && LIZJ == null) {
            LIZJ = (C11JF) C1906580ziK.LIZJ().LJIIJ().LJJLJLI(new C09JN() { // from class: X.0PVl
                @Override // X.C09JN
                public final void accept(Object obj2) {
                    Object obj3;
                    Object obj4;
                    C1C7U.LIZ("SearchRootPageDataStack@c0d9.fragmentOnCreate$1");
                    if (((AbstractC1387200mCc) obj2).LIZ instanceof InterfaceC1603190roz) {
                        AbstractC1387200mCc abstractC1387200mCcLIZLLL = C1906580ziK.LIZLLL();
                        if (abstractC1387200mCcLIZLLL != null) {
                            obj3 = abstractC1387200mCcLIZLLL.LIZ;
                        } else {
                            obj3 = null;
                        }
                        if (!(obj3 instanceof C0PE2)) {
                            AbstractC1387200mCc abstractC1387200mCcLJ = C1906580ziK.LJ();
                            if (abstractC1387200mCcLJ != null) {
                                obj4 = abstractC1387200mCcLJ.LIZ;
                            } else {
                                obj4 = null;
                            }
                            if (!(obj4 instanceof C0PE2)) {
                                C11JF c11jf = C646070PVt.LIZJ;
                                if (c11jf != null) {
                                    c11jf.dispose();
                                }
                                C646070PVt.LIZJ = null;
                                C646070PVt.LIZ.clear();
                                C646070PVt.LIZIZ.clear();
                            }
                        }
                    }
                    C1C7U.LIZIZ("SearchRootPageDataStack@c0d9.fragmentOnCreate$1");
                }
            });
        }
        return c646080PVuLIZJ;
    }

    public static void LIZIZ(Fragment fragment, C0PE2 c0pe2) {
        C646090PVv c646090PVvLIZIZ;
        C646080PVu c646080PVu = LIZIZ.get(Integer.valueOf(c0pe2.hashCode()));
        if (c646080PVu != null && (c646090PVvLIZIZ = c646080PVu.LIZIZ(Integer.valueOf(fragment.hashCode()))) != null) {
            c646090PVvLIZIZ.LIZJ = false;
        }
    }

    public static C646080PVu LIZJ(int i, WeakReference weakReference) {
        ConcurrentHashMap<Integer, C646080PVu> concurrentHashMap = LIZIZ;
        C646080PVu c646080PVu = concurrentHashMap.get(Integer.valueOf(i));
        if (c646080PVu == null && weakReference != null) {
            C646080PVu c646080PVu2 = new C646080PVu(i, weakReference);
            concurrentHashMap.put(Integer.valueOf(i), c646080PVu2);
            return c646080PVu2;
        }
        return c646080PVu;
    }

    public static void LJFF(C0PE2 c0pe2, boolean z) {
        CopyOnWriteArrayList<CopyOnWriteArrayList<C646080PVu>> copyOnWriteArrayList = LIZ;
        if (copyOnWriteArrayList.isEmpty()) {
            return;
        }
        int iHashCode = c0pe2.hashCode();
        for (CopyOnWriteArrayList<C646080PVu> copyOnWriteArrayList2 : copyOnWriteArrayList) {
            for (C646080PVu c646080PVu : copyOnWriteArrayList2) {
                if (c646080PVu.LIZ == iHashCode) {
                    c646080PVu.LJI = C0N5N.ON_DESTORY;
                    if (!C07E8.LIZ() || z) {
                        copyOnWriteArrayList2.remove(c646080PVu);
                        LIZIZ.remove(Integer.valueOf(iHashCode));
                    }
                }
            }
            if (copyOnWriteArrayList2.isEmpty()) {
                LIZ.remove(copyOnWriteArrayList2);
            }
        }
    }

    public static void LJII(View view, Fragment fragment) {
        C646080PVu c646080PVu;
        Fragment fragmentLIZ = C946803n0.LIZ(view);
        if (fragmentLIZ != null && view != null && fragment != null && (c646080PVu = LIZIZ.get(Integer.valueOf(fragment.hashCode()))) != null) {
            c646080PVu.LJFF = new C646120PVy(view.hashCode(), fragmentLIZ.hashCode());
        }
    }
}
