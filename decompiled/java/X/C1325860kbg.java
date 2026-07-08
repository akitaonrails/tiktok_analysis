package X;

import android.content.Context;
import android.os.Looper;
import android.widget.Toast;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0kbg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1325860kbg {
    public static boolean LIZ;
    public static boolean LIZIZ;
    public static boolean LIZJ;
    public static boolean LIZLLL;

    public static final boolean LJII() {
        if (!((Boolean) C279360AxC.LIZ.getValue()).booleanValue()) {
            C1168270gVV.LIZ.getClass();
            InterfaceC1168280gVW interfaceC1168280gVW = C1168270gVV.LIZJ;
            if (interfaceC1168280gVW != null) {
                return interfaceC1168280gVW.LJII();
            }
            return false;
        }
        if (LIZ) {
            return LIZIZ;
        }
        C1168270gVV.LIZ.getClass();
        InterfaceC1168280gVW interfaceC1168280gVW2 = C1168270gVV.LIZJ;
        boolean zLJII = interfaceC1168280gVW2 != null ? interfaceC1168280gVW2.LJII() : false;
        LIZIZ = zLJII;
        LIZ = true;
        return zLJII;
    }

    public static final void LIZ() {
        if (LJII() && !Intrinsics.LJFF(Looper.getMainLooper(), Looper.myLooper())) {
            throw new IllegalStateException("必须执行在主线程");
        }
    }

    public static String LJI(Throwable th) {
        boolean z;
        boolean z2;
        String message;
        if (th == null) {
            return "";
        }
        try {
            StringBuilder sb = new StringBuilder();
            String message2 = th.getMessage();
            boolean z3 = false;
            if (message2 == null || message2.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("msg: ");
                sbLIZ.append(th.getMessage());
                sb.append(C2188811AlT.LIZIZ(sbLIZ));
            }
            if (sb.length() > 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                sb.append("_");
            }
            if (th.getCause() != null) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("cause: ");
                Throwable cause = th.getCause();
                if (cause != null) {
                    message = cause.getMessage();
                } else {
                    message = null;
                }
                sbLIZ2.append(message);
                sb.append(C2188811AlT.LIZIZ(sbLIZ2));
            }
            if (sb.length() > 0) {
                z3 = true;
            }
            if (z3) {
                sb.append("_");
            }
            String strLJZL = C13LN.LJZL(1024, C13SZ.LIZIZ(th));
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("_trace: ");
            sbLIZ3.append(strLJZL);
            sb.append(C2188811AlT.LIZIZ(sbLIZ3));
            return sb.toString();
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            C189200o6.m2constructorimpl(new C098200Yq(th2));
            return "";
        }
    }

    public static final void LJFF(Throwable th, String str) {
        if (str != null || th != null) {
            String strLJIIIIZZ = LJIIIIZZ(str, th);
            C1168270gVV.LIZ.getClass();
            InterfaceC1168280gVW interfaceC1168280gVW = C1168270gVV.LIZJ;
            if (interfaceC1168280gVW != null) {
                interfaceC1168280gVW.ensureNotReachHere(strLJIIIIZZ);
            }
        }
    }

    public static String LJIIIIZZ(String str, Throwable th) {
        StringBuilder sb = new StringBuilder();
        if (str != null) {
            sb.append(str);
        }
        if (th != null) {
            if (sb.length() > 0) {
                sb.append("_");
            }
            sb.append(LJI(th));
        }
        return sb.toString();
    }

    public static final void LJIIIZ(Context context, String str) {
        if (LJII() && str != null && str.length() != 0) {
            C786410Ut5.re(Toast.makeText(context, str, 0));
        }
    }

    public static final void LIZIZ(Throwable th, Function0<String> function0, Map<String, ? extends Object> map) {
        String strInvoke = null;
        if (LJII()) {
            if (function0 != null) {
                strInvoke = function0.invoke();
            }
            throw new IllegalStateException(strInvoke, th);
        }
        if (function0 == null) {
            if (th == null) {
                return;
            }
        } else {
            strInvoke = function0.invoke();
        }
        String strLJIIIIZZ = LJIIIIZZ(strInvoke, th);
        C1168270gVV.LIZ.getClass();
        InterfaceC1168280gVW interfaceC1168280gVW = C1168270gVV.LIZJ;
        if (interfaceC1168280gVW != null) {
            interfaceC1168280gVW.ensureNotReachHere(strLJIIIIZZ);
        }
        new C1338670kwL(EnumC1325870kbh.ASSERT, 100, strLJIIIIZZ, null, 16).LIZJ(map);
    }

    public static final void LIZLLL(boolean z, Throwable th, Function0<String> function0, Map<String, ? extends Object> map) {
        if (!z) {
            String strInvoke = null;
            if (LJII()) {
                if (function0 != null) {
                    strInvoke = function0.invoke();
                }
                throw new IllegalStateException(strInvoke, th);
            }
            if (function0 == null) {
                if (th == null) {
                    return;
                }
            } else {
                strInvoke = function0.invoke();
            }
            String strLJIIIIZZ = LJIIIIZZ(strInvoke, th);
            C1168270gVV.LIZ.getClass();
            InterfaceC1168280gVW interfaceC1168280gVW = C1168270gVV.LIZJ;
            if (interfaceC1168280gVW != null) {
                interfaceC1168280gVW.ensureNotReachHere(strLJIIIIZZ);
            }
            new C1338670kwL(EnumC1325870kbh.ASSERT, 100, strLJIIIIZZ, null, 16).LIZJ(map);
        }
    }
}
