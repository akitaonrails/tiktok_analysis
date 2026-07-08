package X;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.h;
import com.google.gson.n;
import java.lang.reflect.Field;
import kotlin.jvm.internal.AFwS189S0000000_3;

/* JADX INFO: renamed from: X.08Lo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2102608Lo {
    public static final C01GW LIZ = C452501pT.LIZIZ(AFwS189S0000000_3.get$arr$(1466));
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS189S0000000_3.get$arr$(1465));

    public static void LIZ(FragmentManager fragmentManager, h hVar, String str) {
        Object c098200Yq;
        for (Fragment fragment : fragmentManager.LJJLIIIJL()) {
            if (fragment != null) {
                String simpleName = fragment.getClass().getSimpleName();
                n nVar = new n();
                nVar.LJJIIJ("name", simpleName);
                try {
                    nVar.LJJIIJ("state", fragment.getLifecycle().getCurrentState().name());
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                nVar.LJJII(Boolean.valueOf(fragment.isAdded()), "added");
                nVar.LJJII(Boolean.valueOf(fragment.isVisible()), "visible");
                nVar.LJJII(Boolean.valueOf(fragment.isResumed()), "resumed");
                nVar.LJJII(Boolean.valueOf(fragment.isHidden()), "hidden");
                nVar.LJJII(Boolean.valueOf(fragment.isDetached()), "detached");
                nVar.LJJII(Boolean.valueOf(fragment.isRemoving()), "removing");
                String str2 = str + " > " + simpleName;
                h hVar2 = new h();
                try {
                    LIZ(fragment.getChildFragmentManager(), hVar2, str2);
                } catch (Exception e2) {
                    TryCatchGuardChecker.doCheck(e2);
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
                        FragmentManager fragmentManager2 = (FragmentManager) obj;
                        if (fragmentManager2 != null) {
                            try {
                                StringBuilder sbLIZ = C2188811AlT.LIZ();
                                sbLIZ.append(str2);
                                sbLIZ.append("(reflect)");
                                LIZ(fragmentManager2, hVar2, C2188811AlT.LIZIZ(sbLIZ));
                            } catch (Exception e3) {
                                TryCatchGuardChecker.doCheck(e3);
                            }
                        }
                    }
                }
                if (hVar2.size() > 0) {
                    nVar.LJJIFFI("children", hVar2);
                }
                hVar.LJJIFFI(nVar);
            }
        }
    }
}
