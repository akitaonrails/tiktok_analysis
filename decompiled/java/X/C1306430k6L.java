package X;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0k6L, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1306430k6L {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(Function0 function0) {
        C1307940k8m.LIZIZ().isDebug();
        Intrinsics.LJFF(C1307940k8m.LIZIZ().getChannel(), "local_test");
    }

    public static void LIZJ(Function0 function0) {
        C1307940k8m.LIZIZ().isDebug();
        if (((Boolean) C288250BRn.LIZIZ.getValue()).booleanValue()) {
            C2276411E8h.LIZIZ.LJII("Starship", "Starship-Strategy", (String) function0.invoke());
        }
    }

    @InterfaceC1294060jmO
    public static void LIZIZ(String str, Exception exc) {
        C1307940k8m.LIZIZ().isDebug();
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        if (exc != null) {
            if (((Boolean) C288250BRn.LIZIZ.getValue()).booleanValue()) {
                StackTraceElement[] stackTrace = exc.getStackTrace();
                int length = stackTrace.length;
                if (length > 10) {
                    length = 10;
                }
                for (int i = 0; i < length; i++) {
                    stackTrace[i].getClassName();
                    stackTrace[i].getMethodName();
                    stackTrace[i].getLineNumber();
                }
            }
        } else {
            exc = null;
        }
        sb.append(exc);
        C2276411E8h.LIZIZ.LJII("Starship", "Starship-Strategy", sb.toString());
    }
}
