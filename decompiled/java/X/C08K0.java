package X;

import Y.ARunnableS72S0200000_3;
import android.os.Build;
import com.bytedance.memrelief.pressure.MemoryPressureWatcher;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;

/* JADX INFO: renamed from: X.08K0, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C08K0 {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ() {
        final int iIntValue = ((Number) C08K1.LIZ.getValue()).intValue();
        if (iIntValue <= 0) {
            return;
        }
        C08K2 c08k2 = C08K2.LIZ;
        C08K3 c08k3 = new C08K3() { // from class: X.08K4
            @Override // X.C08K3
            public final boolean LIZ() {
                Object c098200Yq;
                try {
                    c098200Yq = Integer.valueOf(MemoryPressureWatcher.getInstance().getJavaMemoryLevel().ordinal());
                    C189200o6.m2constructorimpl(c098200Yq);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    c098200Yq = new C098200Yq(th);
                    C189200o6.m2constructorimpl(c098200Yq);
                }
                if (C189200o6.m7isFailureimpl(c098200Yq)) {
                    c098200Yq = -1;
                }
                return ((Number) c098200Yq).intValue() >= iIntValue;
            }
        };
        synchronized (c08k2) {
            if (Build.VERSION.SDK_INT < 30) {
                return;
            }
            if (C08K2.LIZIZ) {
                return;
            }
            try {
                Field declaredField = Class.forName("com.android.internal.os.BinderInternal").getDeclaredField("sGcWatchers");
                declaredField.setAccessible(true);
                Object obj = declaredField.get(null);
                if (C19719512Dh.LJI(obj)) {
                    List list = (List) obj;
                    if (list != null) {
                        try {
                        } catch (Throwable th) {
                        }
                        synchronized (list) {
                            try {
                                IntRange intRangeLJIIIZ = C1697810uHb.LJIIIZ(list);
                                ArrayList arrayList = new ArrayList();
                                C531650Kt9 it2 = intRangeLJIIIZ.iterator();
                                while (it2.LLILLL) {
                                    Object next = it2.next();
                                    Class<?> enclosingClass = ((Runnable) list.get(((Number) next).intValue())).getClass().getEnclosingClass();
                                    if (Intrinsics.LJFF(enclosingClass != null ? enclosingClass.getName() : null, "android.app.ActivityThread")) {
                                        arrayList.add(next);
                                    }
                                }
                                int size = arrayList.size();
                                if (size != 0) {
                                    if (size != 1) {
                                        return;
                                    }
                                    int iIntValue2 = ((Number) C13LP.LJJJJZI(arrayList)).intValue();
                                    list.set(iIntValue2, new ARunnableS72S0200000_3(c08k3, (Runnable) list.get(iIntValue2), 40));
                                    C08K2.LIZIZ = true;
                                }
                            } finally {
                                TryCatchGuardChecker.doCheck(th);
                            }
                        }
                    }
                }
            } catch (Throwable th2) {
            }
        }
    }
}
