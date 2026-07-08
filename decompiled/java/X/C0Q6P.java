package X;

import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: X.0Q6P, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0Q6P implements C0Q6Q {
    public static final C0Q6P LIZ = new C0Q6P();
    public static WeakReference<C0Q6Q> LIZIZ;
    public static boolean LIZJ;

    public static final C0Q6Q LIZJ() {
        WeakReference<C0Q6Q> weakReference = LIZIZ;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    @Override // X.C0Q6Q
    public final void LIZ() {
        C0Q6Q c0q6qLIZJ = LIZJ();
        if (c0q6qLIZJ != null) {
            c0q6qLIZJ.LIZ();
        }
    }

    @Override // X.C0Q6Q
    public final void LIZIZ() {
        C0Q6Q c0q6qLIZJ = LIZJ();
        if (c0q6qLIZJ != null) {
            c0q6qLIZJ.LIZIZ();
        }
    }

    public static final void LIZLLL(C1019080ccs c1019080ccs) {
        WeakReference<C0Q6Q> weakReference;
        if (c1019080ccs == null) {
            weakReference = null;
        } else {
            weakReference = new WeakReference<>(c1019080ccs);
        }
        LIZIZ = weakReference;
    }
}
