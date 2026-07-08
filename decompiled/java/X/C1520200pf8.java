package X;

import android.view.View;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0pf8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1520200pf8 {
    public static final C1520200pf8 LIZ = new C1520200pf8();

    public static final void LIZJ() {
        Object c098200Yq;
        try {
            Class.forName("com.bytedance.android.monitorV2.lynx.LynxViewMonitor").getMethod("initialize", new Class[0]).invoke(null, new Object[0]);
            Class.forName("com.bytedance.android.monitorV2.webview.WebViewMonitorHelper").getMethod("initialize", new Class[0]).invoke(null, new Object[0]);
            c098200Yq = Unit.LIZ;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl != null) {
            C1520960pgM.LIZIZ(thM5exceptionOrNullimpl);
        }
    }

    public static void LIZ(C1520350pfN c1520350pfN) {
        String str = c1520350pfN.LJIIIIZZ;
        if (str != null && !Intrinsics.LJFF(a0.LJLIIIL(str).toString(), "")) {
            String str2 = c1520350pfN.LJIIIIZZ;
            InterfaceC1520090pex interfaceC1520090pexLIZIZ = C1514790pWP.LIZIZ(str2);
            View viewLIZ = C1514790pWP.LIZ(str2);
            if (interfaceC1520090pexLIZIZ != null) {
                interfaceC1520090pexLIZIZ.onReceivedCustomEvent(viewLIZ, c1520350pfN);
                return;
            } else {
                C1520380pfQ.LIZ.getClass();
                C1520380pfQ.LIZ(c1520350pfN);
                return;
            }
        }
        C1520380pfQ.LIZ.getClass();
        C1520380pfQ.LIZ(c1520350pfN);
    }

    public static void LIZIZ(View view, String str, C1491800ovK c1491800ovK, C1520180pf6 c1520180pf6) {
        InterfaceC1520090pex interfaceC1520090pexLIZIZ = C1514790pWP.LIZIZ(str);
        if (interfaceC1520090pexLIZIZ != null) {
            interfaceC1520090pexLIZIZ.onReceivedContainerError(view, str, c1491800ovK, c1520180pf6);
            return;
        }
        final C1520220pfA c1520220pfALIZ = C1520510pfd.LIZ("containerError", null);
        c1520220pfALIZ.LJIILIIL = new C1520190pf7();
        C1521090pgZ c1521090pgZ = new C1521090pgZ();
        c1520220pfALIZ.LJFF = c1521090pgZ;
        c1521090pgZ.LJFF = c1520180pf6.LIZJ;
        c1520220pfALIZ.LJIILJJIL = c1520180pf6.LIZ();
        c1520220pfALIZ.LJII = c1491800ovK;
        if (!a0.LJJJIL(str)) {
            C1491570oux c1491570oux = C1491570oux.LIZ;
            InterfaceC1491630ov3 interfaceC1491630ov3 = new InterfaceC1491630ov3() { // from class: X.0pf9
                @Override // X.InterfaceC1491630ov3
                public final void onReceiveValue(Object obj) {
                    Object obj2;
                    Object obj3;
                    String str2;
                    String str3;
                    String str4;
                    Map map = (Map) obj;
                    Object obj4 = null;
                    if (map != null) {
                        obj2 = map.get("url");
                    } else {
                        obj2 = null;
                    }
                    if ((obj2 instanceof String) && (str4 = (String) obj2) != null) {
                        c1520220pfALIZ.LJFF.LIZ = str4;
                    }
                    if (map != null) {
                        obj3 = map.get("native_page");
                    } else {
                        obj3 = null;
                    }
                    if ((obj3 instanceof String) && (str3 = (String) obj3) != null) {
                        c1520220pfALIZ.LJFF.LIZLLL = str3;
                    }
                    if (map != null) {
                        obj4 = map.get("container_type");
                    }
                    if ((obj4 instanceof String) && (str2 = (String) obj4) != null) {
                        c1520220pfALIZ.LJFF.LIZJ = str2;
                    }
                }
            };
            c1491570oux.getClass();
            C1491570oux.LJIIIZ(str, interfaceC1491630ov3);
        }
        c1520220pfALIZ.LIZLLL();
        C1520730pfz.LIZJ(c1520220pfALIZ, null);
    }
}
