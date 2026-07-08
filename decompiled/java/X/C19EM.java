package X;

import Y.ARunnableS132S0100000_32;
import android.os.Handler;
import android.os.Looper;
import androidx.fragment.app.Fragment;
import java.util.LinkedHashMap;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.19EM, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C19EM {
    public static final C1278104zL LIZ = C1278104zL.LIZJ;

    public static C1278104zL LIZ(Fragment fragment) {
        C1278104zL c1278104zL;
        while (fragment != null) {
            if (fragment.isAdded() && (c1278104zL = fragment.getParentFragmentManager().mStrictModePolicy) != null) {
                return c1278104zL;
            }
            fragment = fragment.getParentFragment();
        }
        return LIZ;
    }

    public static void LIZIZ(C1278104zL c1278104zL, AbstractC1889400zGc abstractC1889400zGc) {
        Fragment fragment = abstractC1889400zGc.getFragment();
        String name = fragment.getClass().getName();
        c1278104zL.LIZ.contains(C19EX.PENALTY_LOG);
        if (c1278104zL.LIZ.contains(C19EX.PENALTY_DEATH)) {
            ARunnableS132S0100000_32 aRunnableS132S0100000_32 = new ARunnableS132S0100000_32(name, abstractC1889400zGc, 91);
            if (fragment.isAdded()) {
                Handler handlerLJ = fragment.getParentFragmentManager().LJJLIIIJLJLI().LJ();
                if (!Intrinsics.LJFF(handlerLJ.getLooper(), Looper.myLooper())) {
                    C786410Ut5.LJJZZIII(handlerLJ, aRunnableS132S0100000_32);
                    return;
                }
                throw abstractC1889400zGc;
            }
            throw abstractC1889400zGc;
        }
    }

    public static final void LIZJ(final Fragment fragment, final String str) {
        AbstractC1889400zGc abstractC1889400zGc = new AbstractC1889400zGc(fragment, str) { // from class: X.0yiL
            public final String LLILLJJLI;

            public final String getPreviousFragmentId() {
                return this.LLILLJJLI;
            }

            /* JADX WARN: Illegal instructions before constructor call */
            {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Attempting to reuse fragment ");
                sbLIZ.append(fragment);
                sbLIZ.append(" with previous ID ");
                sbLIZ.append(str);
                super(fragment, C2188811AlT.LIZIZ(sbLIZ));
                this.LLILLJJLI = str;
            }
        };
        C1278104zL c1278104zLLIZ = LIZ(fragment);
        if (c1278104zLLIZ.LIZ.contains(C19EX.DETECT_FRAGMENT_REUSE) && LIZLLL(c1278104zLLIZ, fragment.getClass(), C1868150yiL.class)) {
            LIZIZ(c1278104zLLIZ, abstractC1889400zGc);
        }
    }

    public static boolean LIZLLL(C1278104zL c1278104zL, Class cls, Class cls2) {
        Set set = (Set) ((LinkedHashMap) c1278104zL.LIZIZ).get(cls.getName());
        if (set == null) {
            return true;
        }
        if (!Intrinsics.LJFF(cls2.getSuperclass(), AbstractC1889400zGc.class) && C13LP.LJJJJ(cls2.getSuperclass(), set)) {
            return false;
        }
        return !set.contains(cls2);
    }
}
