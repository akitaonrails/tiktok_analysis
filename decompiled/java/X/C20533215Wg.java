package X;

import android.view.Window;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;

/* JADX INFO: renamed from: X.15Wg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20533215Wg {
    public static int LIZ;
    public static boolean LIZIZ;
    public static final List<InterfaceC20533415Wi> LIZJ = new ArrayList();
    public static final List<Object> LIZLLL = new ArrayList();
    public static final List<InterfaceC1593780rZo> LJ = new ArrayList();
    public static final HashMap<Window, Window.OnFrameMetricsAvailableListener> LJFF = new HashMap<>();
    public static final List<InterfaceC20485415Dw> LJI = new ArrayList();
    public static final C20533315Wh LJII = new AbstractC813200VvC() { // from class: X.15Wh
        @Override // X.AbstractC813200VvC
        public final void onFragmentPaused(FragmentManager fragmentManager, Fragment fragment) {
            super.onFragmentPaused(fragmentManager, fragment);
            if (C1702210uOh.LIZ) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("current fragment ");
                sbLIZ.append(fragment.getClass().getSimpleName());
                sbLIZ.append(": resume");
                C2188811AlT.LIZIZ(sbLIZ);
            }
        }

        @Override // X.AbstractC813200VvC
        public final void onFragmentResumed(FragmentManager fragmentManager, Fragment fragment) {
            Object c098200Yq;
            super.onFragmentResumed(fragmentManager, fragment);
            try {
                C2200821BBo.LIZ.getClass();
                if (!C2200821BBo.LJI) {
                    return;
                }
                if (C20339414iG.LIZIZ.contains(fragment.getClass())) {
                    return;
                }
                String simpleName = C20339414iG.LIZ.get(fragment.getClass());
                if (simpleName == null) {
                    simpleName = fragment.getClass().getSimpleName();
                }
                Iterator it2 = ((ArrayList) C20533215Wg.LJ).iterator();
                while (it2.hasNext()) {
                    ((InterfaceC1593780rZo) it2.next()).LIZLLL(simpleName);
                }
                if (C1702210uOh.LIZ) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("current fragment ");
                    sbLIZ.append(fragment.getClass().getSimpleName());
                    sbLIZ.append(": resume");
                    C2188811AlT.LIZIZ(sbLIZ);
                }
                c098200Yq = Unit.LIZ;
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            C189200o6.m5exceptionOrNullimpl(c098200Yq);
        }
    };

    public static void LIZ(Class cls) {
        Object c098200Yq;
        try {
            String simpleName = C20339414iG.LIZ.get(cls);
            if (simpleName == null) {
                simpleName = cls.getSimpleName();
            }
            Iterator it2 = ((ArrayList) LJ).iterator();
            while (it2.hasNext()) {
                ((InterfaceC1593780rZo) it2.next()).LIZLLL(simpleName);
            }
            if (C1702210uOh.LIZ) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("current fragment ");
                sbLIZ.append(cls.getName());
                sbLIZ.append(": onUserVisibleHint true");
                C2188811AlT.LIZIZ(sbLIZ);
            }
            c098200Yq = Unit.LIZ;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        C189200o6.m5exceptionOrNullimpl(c098200Yq);
    }
}
