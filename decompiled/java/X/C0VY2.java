package X;

import android.os.Looper;
import com.bytedance.ies.abmock.SettingsManager;
import com.google.gson.Gson;
import com.ss.android.ugc.bytex.pthread.base.convergence.hook.ThreadMethodProxy;
import im3.c;
import java.util.HashSet;
import java.util.Set;
import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.0VY2, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0VY2 {
    public static final int LIZ = ((Number) C0BH2.LIZ.getValue()).intValue();
    public static final int LIZIZ = ((Number) C0BH3.LIZ.getValue()).intValue();
    public static final Set<String> LIZJ;
    public static final StackTraceElement LIZLLL;

    static {
        HashSet hashSet = new HashSet();
        LIZJ = hashSet;
        LIZLLL = new StackTraceElement("dummy", "", "", 0);
        hashSet.add(Gson.class.getName());
        hashSet.add(C0VY2.class.getName());
        hashSet.add(C09CQ.class.getName());
        hashSet.add(C0C59.class.getName());
        hashSet.add(C0C4Y.class.getName());
        hashSet.add(C0C54.class.getName());
        hashSet.add(C0C5A.class.getName());
        hashSet.add(SettingsManager.class.getName());
        hashSet.add(C08JS.class.getName());
        hashSet.add(C0C64.class.getName());
        hashSet.add("com.bytedance.helios.sdk.utils.GsonUtils");
        hashSet.add("com.bytedance.mt.protector.impl.GsonProtectorUtils");
        hashSet.add("com.ss.ugc.android.editor.core.utils.GsonUtil");
        hashSet.add("com.ss.android.ugc.aweme.im.sdk.utils.GsonUtil");
    }

    public static void LIZ(long j, Object obj, String str) {
        boolean z;
        String canonicalName;
        String str2;
        if (j == 0) {
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis() - j;
        if (Looper.myLooper() == Looper.getMainLooper()) {
            z = true;
            if (jCurrentTimeMillis < LIZ) {
                return;
            }
        } else {
            z = false;
            if (jCurrentTimeMillis < LIZIZ) {
                return;
            }
        }
        StackTraceElement[] stackTrace = ThreadMethodProxy.getStackTrace(C786410Ut5.u3());
        if (stackTrace.length != 0) {
            StringBuilder sb = new StringBuilder(stackTrace.length * 28);
            for (int i = 0; i < stackTrace.length; i++) {
                if (i >= 2) {
                    if (i > 40) {
                        break;
                    }
                    String className = stackTrace[i].getClassName();
                    if (!((HashSet) LIZJ).contains(className) && !className.endsWith("GsonUtil") && !className.endsWith("GsonUtils")) {
                        sb.append("\tat ");
                        sb.append(className);
                        sb.append(e3.d);
                        sb.append(stackTrace[i].getMethodName());
                        sb.append(e3.h);
                        sb.append(stackTrace[i].getFileName());
                        sb.append(":");
                        sb.append(stackTrace[i].getLineNumber());
                        sb.append(")\n");
                    }
                }
            }
            String string = sb.toString();
            String name = C786410Ut5.u3().getName();
            String strValueOf = String.valueOf(jCurrentTimeMillis);
            if (obj instanceof Class) {
                canonicalName = ((Class) obj).getCanonicalName();
            } else if (obj != null) {
                canonicalName = obj.getClass().getCanonicalName();
            } else {
                canonicalName = "";
            }
            C801800Vco c801800VcoLJ = C801800Vco.LJ(LIZLLL, string, canonicalName, name, true, str);
            if (z) {
                str2 = "true";
            } else {
                str2 = "false";
            }
            c801800VcoLJ.LIZIZ(str, str2);
            c801800VcoLJ.LIZJ("log_type", str);
            c801800VcoLJ.LIZJ("crash_time", Long.valueOf(System.currentTimeMillis()));
            c801800VcoLJ.LIZJ("app_start_time", Long.valueOf(C0VX9.LIZJ()));
            c801800VcoLJ.LIZ("class", canonicalName);
            c801800VcoLJ.LIZ("duration", strValueOf);
            c.LIZ(c801800VcoLJ);
        }
    }
}
