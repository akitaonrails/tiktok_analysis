package X;

import android.os.SystemClock;
import android.util.Log;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.application.IApplicationDependencyService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0kch, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1326490kch {
    public static final C1326490kch LIZ = new C1326490kch();

    public static boolean LJII() {
        IECommerceHostService iECommerceHostService;
        if (C034S.LIZ()) {
            C1120604Zw.LIZ.LIZ();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            iECommerceHostService = (IECommerceHostService) ServiceManager.get().getService(IApplicationDependencyService.class);
            C1AQS.LIZJ(jElapsedRealtime, 1, IApplicationDependencyService.class.getName(), iECommerceHostService != null ? iECommerceHostService.getClass().getName() : null, iECommerceHostService != null);
        } else {
            C1120604Zw.LIZ.LIZ();
            iECommerceHostService = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IApplicationDependencyService.class);
        }
        IApplicationDependencyService iApplicationDependencyService = (IApplicationDependencyService) iECommerceHostService;
        return iApplicationDependencyService.isDebug() || Intrinsics.LJFF(iApplicationDependencyService.getChannel(), "local_test");
    }

    public static void LIZ(String str) {
        if (LJII()) {
            LJ(str);
            LJFF(3);
        }
    }

    public static void LIZIZ(Function0 function0) {
        Object objInvoke;
        if (LJII() && (objInvoke = function0.invoke()) != null) {
            LIZ.getClass();
            LJ(objInvoke);
            LJFF(3);
        }
    }

    public static final void LIZLLL(String str) {
        LIZ.getClass();
        if (LJII()) {
            LJ(str);
            LJFF(3);
        }
    }

    public static void LJ(Object obj) {
        if (obj instanceof Throwable) {
            Log.getStackTraceString((Throwable) obj);
        } else if (obj instanceof Object[]) {
            Arrays.toString((Object[]) obj);
        } else {
            if (obj == null) {
                return;
            }
            obj.toString();
        }
    }

    public static void LJFF(int i) {
        try {
            StackTraceElement[] stackTrace = new Throwable().getStackTrace();
            if (i < stackTrace.length) {
                StackTraceElement stackTraceElement = stackTrace[i];
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append('(');
                sbLIZ.append(stackTraceElement.getFileName());
                sbLIZ.append(':');
                sbLIZ.append(stackTraceElement.getLineNumber());
                sbLIZ.append(')');
                sbLIZ.append(stackTraceElement.getMethodName());
                sbLIZ.append("()");
                C2188811AlT.LIZIZ(sbLIZ);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C1AF0.LJ(e);
        }
    }

    public static final void LJI(String str) {
        LIZ.getClass();
        if (LJII()) {
            LJ(str);
            LJFF(3);
        }
    }

    public static void LIZJ(C1326490kch c1326490kch, String str) {
        c1326490kch.getClass();
        if (LJII()) {
            LJ(str);
            LJFF(4);
            LJFF(6);
            String name = C786410Ut5.u3().getName();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(" | on Thread(");
            sbLIZ.append(name);
            sbLIZ.append("): ");
            C2188811AlT.LIZIZ(sbLIZ);
        }
    }

    public static void LJIIIIZZ(String str, String str2, Map map) {
        if (map == null) {
            map = C2097608Jq.LJ();
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        linkedHashMap.put("caller_class", str);
        linkedHashMap.put("caller_method", str2);
        linkedHashMap.put("thread", C786410Ut5.u3().getName());
        C1018703yb.LIZIZ("tiktokec_rd_code_used", linkedHashMap);
    }
}
