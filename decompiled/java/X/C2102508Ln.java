package X;

import android.app.Fragment;
import android.app.FragmentManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.h;
import com.google.gson.n;
import java.lang.reflect.Field;
import java.util.List;
import kotlin.jvm.internal.AFwS189S0000000_3;

/* JADX INFO: renamed from: X.08Ln, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2102508Ln {
    public static final C01GW LIZ = C452501pT.LIZIZ(AFwS189S0000000_3.get$arr$(1464));
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS189S0000000_3.get$arr$(1463));

    public static n LIZ(Fragment fragment, String str) {
        Object c098200Yq;
        String simpleName = fragment.getClass().getSimpleName();
        n nVar = new n();
        nVar.LJJIIJ("name", simpleName);
        nVar.LJJII(Boolean.valueOf(fragment.isAdded()), "added");
        nVar.LJJII(Boolean.valueOf(fragment.getUserVisibleHint()), "visible");
        nVar.LJJII(Boolean.valueOf(fragment.isDetached()), "detached");
        nVar.LJJII(Boolean.valueOf(fragment.isRemoving()), "removing");
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append(" > ");
        sbLIZ.append(simpleName);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        h hVar = new h();
        try {
            LIZIZ(fragment.getChildFragmentManager(), hVar, strLIZIZ);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            Field field = (Field) LIZ.getValue();
            Object obj = null;
            if (field != null) {
                try {
                    Object obj2 = field.get(fragment);
                    if (obj2 instanceof FragmentManager) {
                        c098200Yq = (FragmentManager) obj2;
                    } else {
                        c098200Yq = null;
                    }
                    C189200o6.m2constructorimpl(c098200Yq);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    c098200Yq = new C098200Yq(th);
                    C189200o6.m2constructorimpl(c098200Yq);
                }
                if (!C189200o6.m7isFailureimpl(c098200Yq)) {
                    obj = c098200Yq;
                }
                FragmentManager fragmentManager = (FragmentManager) obj;
                if (fragmentManager != null) {
                    try {
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append(strLIZIZ);
                        sbLIZ2.append("(reflect)");
                        LIZIZ(fragmentManager, hVar, C2188811AlT.LIZIZ(sbLIZ2));
                    } catch (Exception e2) {
                        TryCatchGuardChecker.doCheck(e2);
                    }
                }
            }
        }
        if (hVar.size() > 0) {
            nVar.LJJIFFI("children", hVar);
        }
        return nVar;
    }

    public static void LIZIZ(FragmentManager fragmentManager, h hVar, String str) {
        List<Fragment> fragments = fragmentManager.getFragments();
        if (fragments == null) {
            return;
        }
        for (Fragment fragment : fragments) {
            if (fragment != null) {
                hVar.LJJIFFI(LIZ(fragment, str));
            }
        }
    }
}
