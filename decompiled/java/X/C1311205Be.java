package X;

import android.app.Activity;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS187S0000000_2;

/* JADX INFO: renamed from: X.05Be, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1311205Be {
    public static final C1311205Be LIZ = new C1311205Be();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS187S0000000_2.get$arr$(133));
    public static final C01GW LIZJ = C452501pT.LIZIZ(AFwS187S0000000_2.get$arr$(134));
    public static final ConcurrentHashMap<Class<?>, ReentrantLock> LIZLLL = new ConcurrentHashMap<>();

    public static Object LIZIZ(Class cls) {
        Object c098200Yq;
        try {
            c098200Yq = PluggableExtentionKt.pluggableSpiForReal(cls);
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            return null;
        }
        return c098200Yq;
    }

    public static void LIZ(String str, Function0 function0) {
        if (str.length() > 0) {
            C1AF0.LIZJ(str);
        }
        if (function0 != null) {
            function0.invoke();
            C786410Ut5.LJLIIL(400L, C724640Sbe.LIZ(), new Runnable() { // from class: X.01md
                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    Activity activityLIZIZ;
                    Activity activityLIZ;
                    C1C7U.LIZ("IMGroupChatApi$Internal@4fc.handleFail$1");
                    try {
                        AbstractC1387200mCc abstractC1387200mCcLJ = C1906580ziK.LJ();
                        if (abstractC1387200mCcLJ != null && (activityLIZIZ = abstractC1387200mCcLJ.LIZIZ()) != null && (activityLIZ = C1388190mED.LIZ(activityLIZIZ)) != null) {
                            C1389890mGx c1389890mGx = new C1389890mGx(activityLIZ);
                            c1389890mGx.LJIIJ(activityLIZ.getString(2131831450));
                            c1389890mGx.LJIIJJI();
                        }
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("IMGroupChatApi$Internal@4fc.handleFail$1");
                }
            });
        }
    }

    public static void LIZJ(LifecycleOwner lifecycleOwner, Function1 function1, Function0 function0) {
        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZ), null, null, new C1388305c1(function1, lifecycleOwner, function0, null), 3);
    }

    public static Object LIZLLL(Class cls, String str, InterfaceC1364105Vn interfaceC1364105Vn) {
        return C23250099c.LJI(interfaceC1364105Vn, C0PEM.LIZ, new C1311105Bd(cls, str, null));
    }
}
