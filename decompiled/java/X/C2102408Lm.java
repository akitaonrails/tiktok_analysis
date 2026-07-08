package X;

import android.app.Activity;
import android.os.Build;
import androidx.fragment.app.FragmentManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.h;
import com.google.gson.n;
import java.lang.reflect.Field;

/* JADX INFO: renamed from: X.08Lm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2102408Lm {
    public static final /* synthetic */ int LIZ = 0;

    public static n LIZ(Activity activity, boolean z) {
        Object c098200Yq;
        Object c098200Yq2;
        n nVar = new n();
        String name = activity.getClass().getName();
        nVar.LJJIIJ("activity", name);
        nVar.LJJIIJ("activitySimple", activity.getClass().getSimpleName());
        nVar.LJJIIJ("activityId", C2095108Ir.LIZ(activity));
        Object obj = null;
        if (activity instanceof C19EG) {
            h hVar = new h();
            try {
                C2102608Lo.LIZ(((C19EG) activity).getSupportFragmentManager(), hVar, name);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                Field field = (Field) C2102608Lo.LIZIZ.getValue();
                if (field != null) {
                    try {
                        Object obj2 = field.get(activity);
                        if (obj2 instanceof FragmentManager) {
                            c098200Yq2 = (FragmentManager) obj2;
                        } else {
                            c098200Yq2 = null;
                        }
                        C189200o6.m2constructorimpl(c098200Yq2);
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        c098200Yq2 = new C098200Yq(th);
                        C189200o6.m2constructorimpl(c098200Yq2);
                    }
                    if (C189200o6.m7isFailureimpl(c098200Yq2)) {
                        c098200Yq2 = null;
                    }
                    FragmentManager fragmentManager = (FragmentManager) c098200Yq2;
                    if (fragmentManager != null) {
                        try {
                            C2102608Lo.LIZ(fragmentManager, hVar, name);
                        } catch (Exception e2) {
                            TryCatchGuardChecker.doCheck(e2);
                        }
                    }
                }
            }
            nVar.LJJIFFI("androidxFragments", hVar);
        }
        if (z && Build.VERSION.SDK_INT >= 26) {
            h hVar2 = new h();
            try {
                C2102508Ln.LIZIZ(activity.getFragmentManager(), hVar2, name);
            } catch (Exception e3) {
                TryCatchGuardChecker.doCheck(e3);
                Field field2 = (Field) C2102508Ln.LIZIZ.getValue();
                if (field2 != null) {
                    try {
                        Object obj3 = field2.get(activity);
                        if (obj3 instanceof android.app.FragmentManager) {
                            c098200Yq = (android.app.FragmentManager) obj3;
                        } else {
                            c098200Yq = null;
                        }
                        C189200o6.m2constructorimpl(c098200Yq);
                    } catch (Throwable th2) {
                        TryCatchGuardChecker.doCheck(th2);
                        c098200Yq = new C098200Yq(th2);
                        C189200o6.m2constructorimpl(c098200Yq);
                    }
                    if (!C189200o6.m7isFailureimpl(c098200Yq)) {
                        obj = c098200Yq;
                    }
                    android.app.FragmentManager fragmentManager2 = (android.app.FragmentManager) obj;
                    if (fragmentManager2 != null) {
                        try {
                            C2102508Ln.LIZIZ(fragmentManager2, hVar2, name);
                        } catch (Exception e4) {
                            TryCatchGuardChecker.doCheck(e4);
                        }
                    }
                }
            }
            nVar.LJJIFFI("legacyFragments", hVar2);
        }
        return nVar;
    }
}
