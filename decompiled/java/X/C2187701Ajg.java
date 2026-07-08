package X;

import android.os.Build;
import android.view.ViewTreeObserver;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Predicate;

/* JADX INFO: renamed from: X.1Ajg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C2187701Ajg {
    public static boolean LIZLLL;
    public static int LJ;
    public static C2187701Ajg LJFF;
    public final ConcurrentHashMap<Integer, WeakReference<ViewTreeObserver>> LIZ = new ConcurrentHashMap<>();
    public final boolean LIZIZ;
    public C1385605ba LIZJ;

    public static synchronized C2187701Ajg LIZJ() {
        if (LJFF == null) {
            LJFF = new C2187701Ajg();
        }
        return LJFF;
    }

    public C2187701Ajg() {
        this.LIZIZ = false;
        if (Build.VERSION.SDK_INT < 24) {
            return;
        }
        ArrayList<InterfaceC2187721Aji> arrayList = C2187711Ajh.LIZ;
        arrayList.add(new InterfaceC2187721Aji() { // from class: X.1Ajj
            @Override // X.InterfaceC2187721Aji
            public final int LIZ() {
                return 2;
            }

            @Override // X.InterfaceC2187721Aji
            public final Class LIZIZ() {
                return ViewTreeObserver.OnGlobalLayoutListener.class;
            }

            @Override // X.InterfaceC2187721Aji
            public final boolean LIZLLL(Object obj) {
                return obj instanceof ViewTreeObserver.OnGlobalLayoutListener;
            }

            @Override // X.InterfaceC2187721Aji
            public final void LIZJ(ViewTreeObserver viewTreeObserver, Object obj) {
                viewTreeObserver.removeOnGlobalLayoutListener((ViewTreeObserver.OnGlobalLayoutListener) obj);
            }
        });
        arrayList.add(new InterfaceC2187721Aji() { // from class: X.1Ajl
            @Override // X.InterfaceC2187721Aji
            public final int LIZ() {
                return 16;
            }

            @Override // X.InterfaceC2187721Aji
            public final Class LIZIZ() {
                return ViewTreeObserver.OnDrawListener.class;
            }

            @Override // X.InterfaceC2187721Aji
            public final boolean LIZLLL(Object obj) {
                return obj instanceof ViewTreeObserver.OnDrawListener;
            }

            @Override // X.InterfaceC2187721Aji
            public final void LIZJ(ViewTreeObserver viewTreeObserver, Object obj) {
                viewTreeObserver.removeOnDrawListener((ViewTreeObserver.OnDrawListener) obj);
            }
        });
        arrayList.add(new InterfaceC2187721Aji() { // from class: X.1Ajm
            @Override // X.InterfaceC2187721Aji
            public final int LIZ() {
                return 8;
            }

            @Override // X.InterfaceC2187721Aji
            public final Class LIZIZ() {
                return ViewTreeObserver.OnPreDrawListener.class;
            }

            @Override // X.InterfaceC2187721Aji
            public final boolean LIZLLL(Object obj) {
                return obj instanceof ViewTreeObserver.OnPreDrawListener;
            }

            @Override // X.InterfaceC2187721Aji
            public final void LIZJ(ViewTreeObserver viewTreeObserver, Object obj) {
                viewTreeObserver.removeOnPreDrawListener((ViewTreeObserver.OnPreDrawListener) obj);
            }
        });
        arrayList.add(new InterfaceC2187721Aji() { // from class: X.1Ajk
            @Override // X.InterfaceC2187721Aji
            public final int LIZ() {
                return 4;
            }

            @Override // X.InterfaceC2187721Aji
            public final Class LIZIZ() {
                return ViewTreeObserver.OnScrollChangedListener.class;
            }

            @Override // X.InterfaceC2187721Aji
            public final boolean LIZLLL(Object obj) {
                return obj instanceof ViewTreeObserver.OnScrollChangedListener;
            }

            @Override // X.InterfaceC2187721Aji
            public final void LIZJ(ViewTreeObserver viewTreeObserver, Object obj) {
                viewTreeObserver.removeOnScrollChangedListener((ViewTreeObserver.OnScrollChangedListener) obj);
            }
        });
        this.LIZIZ = true;
    }

    public static void LIZ(ViewTreeObserver viewTreeObserver, Object obj, Class cls) {
        if (!LIZLLL || !LIZJ().LIZIZ || viewTreeObserver == null || obj == null || !C2187711Ajh.LIZIZ(cls, obj)) {
            return;
        }
        boolean z = false;
        if (LIZJ().LIZJ != null) {
            LIZJ().LIZJ.LIZ(0, obj);
        }
        if ((LJ & C2187711Ajh.LIZ(obj)) != 0) {
            z = true;
        }
        if (LIZLLL && z) {
            LIZJ().LIZ.put(Integer.valueOf(System.identityHashCode(obj)), new WeakReference<>(viewTreeObserver));
            if (LIZJ().LIZ.size() % 100 == 0) {
                final C2187701Ajg c2187701AjgLIZJ = LIZJ();
                if (Build.VERSION.SDK_INT < 24) {
                    c2187701AjgLIZJ.getClass();
                } else {
                    c2187701AjgLIZJ.LIZ.keySet().removeIf(new Predicate() { // from class: X.15XB
                        @Override // java.util.function.Predicate
                        public final boolean test(Object obj2) {
                            ViewTreeObserver viewTreeObserver2;
                            WeakReference<ViewTreeObserver> weakReference = this.LL.LIZ.get(obj2);
                            if (weakReference != null && (viewTreeObserver2 = weakReference.get()) != null && viewTreeObserver2.isAlive()) {
                                return false;
                            }
                            return true;
                        }
                    });
                }
            }
        }
    }

    public static void LIZIZ(ViewTreeObserver viewTreeObserver, Object obj, Class cls) {
        ViewTreeObserver viewTreeObserver2;
        if (!LIZLLL || !LIZJ().LIZIZ || viewTreeObserver == null || obj == null || !C2187711Ajh.LIZIZ(cls, obj)) {
            return;
        }
        boolean z = true;
        if (LIZJ().LIZJ != null) {
            LIZJ().LIZJ.LIZ(1, obj);
        }
        if ((LJ & C2187711Ajh.LIZ(obj)) == 0) {
            z = false;
        }
        if (LIZLLL && z) {
            WeakReference<ViewTreeObserver> weakReferenceRemove = LIZJ().LIZ.remove(Integer.valueOf(System.identityHashCode(obj)));
            if (weakReferenceRemove != null && (viewTreeObserver2 = weakReferenceRemove.get()) != null && viewTreeObserver2 != viewTreeObserver && viewTreeObserver2.isAlive()) {
                for (InterfaceC2187721Aji interfaceC2187721Aji : C2187711Ajh.LIZ) {
                    if (interfaceC2187721Aji.LIZLLL(obj)) {
                        interfaceC2187721Aji.LIZJ(viewTreeObserver2, obj);
                        return;
                    }
                }
            }
        }
    }
}
