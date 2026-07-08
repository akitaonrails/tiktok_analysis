package X;

import android.app.Activity;
import androidx.fragment.app.Fragment;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: renamed from: X.1BhD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2211651BhD {
    public static final AtomicLong LIZ = new AtomicLong(0);

    public static C2211641BhC LIZ(C10VW c10vw) {
        Activity activity;
        Fragment fragment;
        Object obj;
        Object obj2;
        C2211641BhC c2211641BhC = new C2211641BhC(c10vw.LIZ, (int) LIZ.incrementAndGet());
        c2211641BhC.LIZJ = c10vw.LIZJ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        C2211621BhA.LIZ.getClass();
        sbLIZ.append(C2211621BhA.LIZIZ);
        sbLIZ.append('.');
        sbLIZ.append(c10vw.LIZJ);
        sbLIZ.append(".c0.d0");
        c2211641BhC.LIZLLL = C2188811AlT.LIZIZ(sbLIZ);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(C2211621BhA.LIZIZ);
        sbLIZ2.append('.');
        sbLIZ2.append(c10vw.LIZJ);
        sbLIZ2.append(".c0.d0");
        c2211641BhC.LJII = C2188811AlT.LIZIZ(sbLIZ2);
        c2211641BhC.LJJIFFI = c10vw.LJI;
        int i = C2211671BhF.LIZ[c10vw.LIZLLL.ordinal()];
        String simpleName = null;
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        WeakReference<Object> weakReference = c10vw.LJIIIIZZ;
                        if (weakReference != null && (obj2 = weakReference.get()) != null) {
                            simpleName = obj2.getClass().getSimpleName();
                        }
                        c2211641BhC.LJIIJJI = simpleName;
                        c2211641BhC.LJJIIZ = true;
                    }
                } else {
                    WeakReference<Object> weakReference2 = c10vw.LJII;
                    if (weakReference2 != null && (obj = weakReference2.get()) != null) {
                        simpleName = obj.getClass().getSimpleName();
                    }
                    c2211641BhC.LJIIJJI = simpleName;
                    c2211641BhC.LJJIIJ = true;
                    c2211641BhC.LJJIIJZLJL = c10vw.LJIIL;
                }
            } else {
                WeakReference<Fragment> weakReference3 = c10vw.LJFF;
                if (weakReference3 != null && (fragment = weakReference3.get()) != null) {
                    simpleName = fragment.getClass().getSimpleName();
                }
                c2211641BhC.LJIIJJI = simpleName;
                c2211641BhC.LJJII = true;
                c2211641BhC.LJJIII = c10vw.LJFF;
            }
        } else {
            WeakReference<Activity> weakReference4 = c10vw.LJI;
            if (weakReference4 != null && (activity = weakReference4.get()) != null) {
                simpleName = activity.getClass().getSimpleName();
            }
            c2211641BhC.LJIIJJI = simpleName;
            c2211641BhC.LJJI = true;
        }
        if (c10vw.LJIIIZ) {
            c2211641BhC.LJJIJ = true;
            c2211641BhC.LJJIIZI = c10vw.LJIIJ;
        } else {
            c2211641BhC.LJJIIZI = c10vw.LIZ;
        }
        c2211641BhC.LJJJ = c10vw.LJIIJJI;
        return c2211641BhC;
    }
}
